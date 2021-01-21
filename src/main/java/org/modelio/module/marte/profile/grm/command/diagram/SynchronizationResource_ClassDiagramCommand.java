package org.modelio.module.marte.profile.grm.command.diagram;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.SynchronizationResource_Class;

@objid ("bd49e618-ae9e-4186-a2e8-dc193654bbfb")
public class SynchronizationResource_ClassDiagramCommand extends DefaultBoxTool {
    @objid ("c73426c5-70dc-4c89-8ac8-bd49627dfdd9")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode) {
        ModelElement owner = null;
        
         if(targetNode.getElement() instanceof AbstractDiagram){
            owner = diagramHandle.getDiagram().getOrigin();
        }else{
            owner = (ModelElement)targetNode.getElement();
        }
        
        if(owner instanceof ModelTree){
            return true;
        }
        return false;
    }

    @objid ("218cc49d-184f-414d-ad8a-35eac159feba")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode, Rectangle rec) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("SynchronizationResource_ClassCommand")){
        
        
        
            ModelElement parent = null;
        
             if(targetNode.getElement() instanceof AbstractDiagram){
                parent = diagramHandle.getDiagram().getOrigin();
            }else{
                parent = (ModelElement)targetNode.getElement();
            }
        
            SynchronizationResource_Class proxy = new SynchronizationResource_Class();
        
            if(parent instanceof ModelTree){
                proxy.setParent((ModelTree) parent);
            }
        
            
            diagramHandle.unmask(proxy.getElement(), rec.x, rec.y);
            diagramHandle.save();
            diagramHandle.close();
           tr.commit();
            
              
         
            
        
           
                
        }
    }

}
