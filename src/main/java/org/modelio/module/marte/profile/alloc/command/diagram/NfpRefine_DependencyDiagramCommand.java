package org.modelio.module.marte.profile.alloc.command.diagram;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramLink.LinkRouterKind;
import org.modelio.api.modelio.diagram.IDiagramLink;
import org.modelio.api.modelio.diagram.ILinkPath;
import org.modelio.api.modelio.diagram.InvalidDestinationPointException;
import org.modelio.api.modelio.diagram.InvalidPointsPathException;
import org.modelio.api.modelio.diagram.InvalidSourcePointException;
import org.modelio.api.modelio.diagram.tools.DefaultLinkTool;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.alloc.model.NfpRefine_Dependency;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("48e8b967-8787-49c4-b02a-d2862eaa99c4")
public class NfpRefine_DependencyDiagramCommand extends DefaultLinkTool {
    @objid ("2aba5cf1-5719-47cf-8c37-18ef1651d553")
    @Override
    public String getTooltip() {
        return super.getTooltip();
    }

    @objid ("b1292487-90ba-48aa-aaf6-3aae30efc9c5")
    @Override
    public boolean acceptFirstElement(IDiagramHandle arg0, IDiagramGraphic arg1) {
        MObject owner = null;
        
        if(arg1 == null){
            owner = arg0.getDiagram().getOrigin();
        }else{
            owner = arg1.getElement();
        }
        return (owner instanceof ModelElement);
    }

    @objid ("e182a2ab-0421-4fab-b7aa-87dd2b58e065")
    @Override
    public boolean acceptSecondElement(IDiagramHandle arg0, IDiagramGraphic arg1, IDiagramGraphic arg2) {
        return ((arg2 != null) && (arg2.getElement() instanceof ModelElement));
    }

    @objid ("74e7f2ec-b078-40fc-9f16-a2da7379fc54")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic originNode, IDiagramGraphic targetNode, LinkRouterKind routerType, ILinkPath path) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("NfpRefine_DependencyCommand")){
        
            ModelElement source = (ModelElement) originNode.getElement();
            ModelElement target = (ModelElement) targetNode.getElement();
        
        
            NfpRefine_Dependency proxy = new NfpRefine_Dependency();
            proxy.setParent(source,target);   
            MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
        
        
            List<IDiagramGraphic> graphics = diagramHandle.unmask(proxy.getElement(), 0 ,0);
            for (IDiagramGraphic graphic : graphics){
                if (graphic instanceof IDiagramLink){
                    IDiagramLink link = (IDiagramLink) graphic;
                    link.setRouterKind(routerType);
                    link.setPath(path);
                }
            }
        
            diagramHandle.save();
            diagramHandle.close();
            tr.commit();
        
        } catch (InvalidSourcePointException e) {
            MARTEModule.getInstance().getModuleContext().getLogService().error(e);
        } catch (InvalidPointsPathException e) {
            MARTEModule.getInstance().getModuleContext().getLogService().error(e);
        } catch (InvalidDestinationPointException e) {
            MARTEModule.getInstance().getModuleContext().getLogService().error(e);
        }
    }

}
