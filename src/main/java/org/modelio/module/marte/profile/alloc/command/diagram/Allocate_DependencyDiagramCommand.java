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
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.alloc.model.Allocate_Dependency;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("2f3b9812-5626-4727-862a-43633958388e")
public class Allocate_DependencyDiagramCommand extends DefaultLinkTool {
    @objid ("1e709610-4a40-4f8f-b20d-30bf78f4181a")
    @Override
    public boolean acceptFirstElement(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode) {
        MObject owner = null;
        
        if(targetNode.getElement() instanceof AbstractDiagram){
            owner = diagramHandle.getDiagram().getOrigin();
        }else{
            owner = targetNode.getElement();
        }
        return (owner instanceof ModelElement);
    }

    @objid ("14667e43-ae68-46ae-a4ba-c0fb32a19a60")
    @Override
    public boolean acceptSecondElement(final IDiagramHandle diagramHandle, IDiagramGraphic originNode, IDiagramGraphic targetNode) {
        MObject owner = null;
        
        if(targetNode == null){
            owner = diagramHandle.getDiagram().getOrigin();
        }else{
            owner = targetNode.getElement();
        }
        return (owner instanceof ModelElement);
    }

    @objid ("194336b9-c7d7-4337-b4a7-622a9f4c8ea4")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic originNode, IDiagramGraphic targetNode, LinkRouterKind routerType, ILinkPath path) {
        try (ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("Allocate_DependencyCommand")){
                 
        
            ModelElement source = (ModelElement) originNode.getElement();
            ModelElement target = (ModelElement) targetNode.getElement();
        
            Allocate_Dependency proxy = new Allocate_Dependency();
            proxy.setParent(source,target);   
            MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
            List<IDiagramGraphic> graphics = diagramHandle.unmask(proxy.getElement(), 0, 0);
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
