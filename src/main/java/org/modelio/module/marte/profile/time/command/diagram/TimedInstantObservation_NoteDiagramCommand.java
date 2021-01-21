package org.modelio.module.marte.profile.time.command.diagram;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.time.model.TimedInstantObservation_Note;

@objid ("924e6927-5181-49d9-b383-c90b5f42ceb2")
public class TimedInstantObservation_NoteDiagramCommand extends DefaultBoxTool {
    @objid ("4766d7f8-1f73-4a03-9565-d2c91940d001")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode) {
        if(targetNode.getElement() instanceof AbstractDiagram){
            return false;
        }else{
            return true;
        }
    }

    @objid ("20082224-c6d8-4a21-85cc-1d3c27878546")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode, Rectangle rec) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("TimedInstantObservation_NoteCommand")){
        
        
        
            ModelElement parent = null;
        
            if(targetNode.getElement() instanceof AbstractDiagram){
                parent = diagramHandle.getDiagram().getOrigin();
            }else{
                parent = (ModelElement)targetNode.getElement();
            }
        
            TimedInstantObservation_Note proxy = new TimedInstantObservation_Note();
        
            if(parent instanceof ModelElement){
                proxy.setParent((ModelElement) parent);
            }
            if(parent instanceof TemplateParameter){
                proxy.setParent((TemplateParameter) parent);
            }
        
            
            diagramHandle.unmask(proxy.getElement(), rec.x, rec.y);
            
        
            diagramHandle.save();
            diagramHandle.close();
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
