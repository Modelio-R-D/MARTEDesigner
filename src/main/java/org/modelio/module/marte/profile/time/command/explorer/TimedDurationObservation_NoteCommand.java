package org.modelio.module.marte.profile.time.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.time.model.TimedDurationObservation_Note;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("57062b9e-227f-482b-876c-a02dbea62efb")
public class TimedDurationObservation_NoteCommand extends DefaultModuleCommandHandler {
    @objid ("8b5c2cb5-733d-4e4d-b7f6-cf4f21169ea3")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0); 
            
            if(element instanceof TemplateParameter){       return false;    }  
         if(element instanceof ModelElement){       return true;    }  
         
        }
        return false;
    }

    @objid ("0d67c0b9-566f-4e8d-bf3d-30e7a79b1740")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("TimedDurationObservation_NoteCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            TimedDurationObservation_Note proxy = new TimedDurationObservation_Note();
        
        if(parent instanceof ModelElement){
            proxy.setParent((ModelElement) parent);
        }
        if(parent instanceof TemplateParameter){
            proxy.setParent((TemplateParameter) parent);
        }           
            
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
