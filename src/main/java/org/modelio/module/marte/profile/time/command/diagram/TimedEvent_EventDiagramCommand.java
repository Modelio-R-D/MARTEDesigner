package org.modelio.module.marte.profile.time.command.diagram;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.behavior.activityModel.Activity;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.time.model.TimedEvent_Event;

@objid ("3b74781a-0347-4aa9-accc-ca15221e60c9")
public class TimedEvent_EventDiagramCommand extends DefaultBoxTool {
    @objid ("c6bd5078-1857-48ad-8e24-ecedca648e0f")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode) {
        ModelElement owner = null;
        
        if(targetNode.getElement() instanceof AbstractDiagram){
            owner = diagramHandle.getDiagram().getOrigin();
        }else{
            owner = (ModelElement)targetNode.getElement();
        }
        
        
        if(owner instanceof Activity){
            return true;
        }
        return false;
    }

    @objid ("d7498cbc-46f1-4046-81bb-fe79553cdbe1")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode, Rectangle rec) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("TimedEvent_EventCommand")){
        
        
        
            ModelElement parent = null;
        
            if(targetNode.getElement() instanceof AbstractDiagram){
                parent = diagramHandle.getDiagram().getOrigin();
            }else{
                parent = (ModelElement)targetNode.getElement();
            }
        
            TimedEvent_Event proxy = new TimedEvent_Event();
        
            if(parent instanceof Behavior){
                proxy.setParent((Behavior) parent);
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
