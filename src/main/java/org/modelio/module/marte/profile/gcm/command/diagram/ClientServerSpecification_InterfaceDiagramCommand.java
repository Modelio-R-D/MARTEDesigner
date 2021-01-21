package org.modelio.module.marte.profile.gcm.command.diagram;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.gcm.model.ClientServerSpecification_Interface;

@objid ("c0e32beb-4593-4a4c-84ca-a3d4e456353c")
public class ClientServerSpecification_InterfaceDiagramCommand extends DefaultBoxTool {
    @objid ("a1644f39-f78c-4381-92fa-71aacf2750af")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode) {
        ModelElement owner = null;
        
        if(targetNode.getElement() instanceof AbstractDiagram){
            owner = diagramHandle.getDiagram().getOrigin();
        }else{
            owner = (ModelElement)targetNode.getElement();
        }
        
        
        if(owner instanceof Package){
            return true;
        }
        return false;
    }

    @objid ("4afd1069-1428-4f8e-8e86-880a3d635a4c")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode, Rectangle rec) {
        try (ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("ClientServerSpecification_InterfaceCommand");){
        
            ModelElement parent = null;
        
            if(targetNode.getElement() instanceof AbstractDiagram){
                parent = diagramHandle.getDiagram().getOrigin();
            }else{
                parent = (ModelElement)targetNode.getElement();
            }
        
            ClientServerSpecification_Interface proxy = new ClientServerSpecification_Interface();
        
            if(parent instanceof Package){
                proxy.setParent((Package) parent);
            }   
        
            MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
        
            diagramHandle.unmask(proxy.getElement(), rec.x, rec.y);
            diagramHandle.save();
            diagramHandle.close();
            tr.commit();
        
        }
    }

}
