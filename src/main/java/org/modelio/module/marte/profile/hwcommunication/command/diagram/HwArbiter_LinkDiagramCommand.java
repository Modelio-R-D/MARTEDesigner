package org.modelio.module.marte.profile.hwcommunication.command.diagram;

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
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwcommunication.model.HwArbiter_Link;

@objid ("363e8824-f370-4580-903e-4c5525fd6a5f")
public class HwArbiter_LinkDiagramCommand extends DefaultLinkTool {
    @objid ("219d2b6f-4964-4e1c-b32f-5f247800152e")
    @Override
    public boolean acceptFirstElement(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode) {
        ModelElement owner = null;
        
        if(targetNode.getElement() instanceof AbstractDiagram){
            owner = diagramHandle.getDiagram().getOrigin();
        }else{
            owner = (ModelElement)targetNode.getElement();
        
            if(owner instanceof Instance){
                return true;
            }
        }
        return false;
    }

    @objid ("42b5a064-36d7-4379-a536-92f1ae94d17c")
    @Override
    public boolean acceptSecondElement(final IDiagramHandle diagramHandle, IDiagramGraphic originNode, IDiagramGraphic targetNode) {
        ModelElement owner = null;
        
        if(targetNode == null){
            owner = diagramHandle.getDiagram().getOrigin();
        }else{
            owner = (ModelElement)targetNode.getElement();
        
            if(owner instanceof Instance){
                return true;
            }
        }
        return false;
    }

    @objid ("5db170ee-3969-4035-9660-9fb49c1b2d26")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic originNode, IDiagramGraphic targetNode, LinkRouterKind touterType, ILinkPath path) {
        try (ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("HwArbiter_LinkCommand")) {
        
            Instance source = (Instance)originNode.getElement();
            Instance target = (Instance)targetNode.getElement();
        
        
            HwArbiter_Link proxy = new HwArbiter_Link();
            proxy.setParent(source,target);   
            MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
        
            List<IDiagramGraphic> graphics = diagramHandle.unmask(proxy.getElement(), 0, 0);
            for (IDiagramGraphic graphic : graphics){
                if (graphic instanceof IDiagramLink){
                    IDiagramLink link = (IDiagramLink) graphic;
                    link.setRouterKind(touterType);
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
