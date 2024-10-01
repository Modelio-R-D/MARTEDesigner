package org.modelio.module.marte.profile.alloc.command.diagram;

import java.util.List;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramLink.LinkRouterKind;
import org.modelio.api.modelio.diagram.IDiagramLink;
import org.modelio.api.modelio.diagram.ILinkRoute;
import org.modelio.api.modelio.diagram.InvalidDestinationPointException;
import org.modelio.api.modelio.diagram.InvalidPointsPathException;
import org.modelio.api.modelio.diagram.InvalidSourcePointException;
import org.modelio.api.modelio.diagram.tools.DefaultLinkTool;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.alloc.model.NfpRefine_Dependency;
import org.modelio.vcore.smkernel.mapi.MObject;

public class NfpRefine_DependencyDiagramCommand extends DefaultLinkTool {
    @Override
    public String getTooltip() {
        return super.getTooltip();
    }

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

    @Override
    public boolean acceptSecondElement(IDiagramHandle arg0, IDiagramGraphic arg1, IDiagramGraphic arg2) {
        return ((arg2 != null) && (arg2.getElement() instanceof ModelElement));
    }

    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic originNode, IDiagramGraphic targetNode, LinkRouterKind routerType, ILinkRoute path) {
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
                    link.setRoute(path);
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
