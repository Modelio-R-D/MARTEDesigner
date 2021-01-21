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
import org.modelio.module.marte.profile.time.model.TimedDurationObservation_Note;

@objid ("4d79be77-259c-4a7e-b1e5-9d69c8881d65")
public class TimedDurationObservation_NoteDiagramCommand extends DefaultBoxTool {
    @objid ("01320b34-5597-47dc-8b3b-f6b36081c69e")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode) {
        return !(targetNode.getElement() instanceof AbstractDiagram);
    }

    @objid ("4acf41f6-5a8c-4c46-94b6-03258f4a47c3")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode, Rectangle rec) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("TimedDurationObservation_NoteCommand")){
        
            ModelElement parent = null;
        
            if(targetNode.getElement() instanceof AbstractDiagram){
                parent = diagramHandle.getDiagram().getOrigin();
            }else{
                parent = (ModelElement)targetNode.getElement();
            }
        
            TimedDurationObservation_Note proxy = new TimedDurationObservation_Note();
        
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
