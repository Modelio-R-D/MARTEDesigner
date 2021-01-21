package org.modelio.module.marte.profile.hwgeneral.command.diagram;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwgeneral.model.HwResourceService_Collaboration;

@objid ("9487839e-7b07-4381-a4a4-c16ab3f402d2")
public class HwResourceService_CollaborationDiagramCommand extends DefaultBoxTool {
    @objid ("a0b87414-67b6-43c4-acdd-a75faf21bb82")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode) {
        ModelElement owner = null;
        
        if(targetNode.getElement() instanceof AbstractDiagram){
            owner = diagramHandle.getDiagram().getOrigin();
        }else{
            owner = (ModelElement)targetNode.getElement();
        }
        
        
         if(owner instanceof Behavior){
            return true;
        }
        return false;
    }

    @objid ("63d728b9-c09c-4f3e-960d-dd70e43c1cde")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode, Rectangle rec) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("HwResourceService_CollaborationCommand")){
        
        
            
                ModelElement parent = null;
            
            if(targetNode.getElement() instanceof AbstractDiagram){
                parent = diagramHandle.getDiagram().getOrigin();
            }else{
                parent = (ModelElement)targetNode.getElement();
            }
            HwResourceService_Collaboration proxy = new HwResourceService_Collaboration();
            if(parent instanceof ModelTree){
                proxy.setParent((ModelTree) parent);
            }
            if(parent instanceof Operation){
                proxy.setParent((Operation) parent);
            }
            MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
            
            
            diagramHandle.unmask(proxy.getElement(), rec.x, rec.y);
            diagramHandle.save();
           diagramHandle.close();
          tr.commit();
            
               
         
            
        
           
                
        }
    }

}
