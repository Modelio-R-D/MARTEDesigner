package org.modelio.module.marte.profile.time.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.time.model.TimedInstantObservation_Note;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("dc5b5021-1bac-4b5b-a117-4e07cd503a1d")
public class TimedInstantObservation_NoteCommand extends DefaultModuleCommandHandler {
    @objid ("6340b72c-28d5-4a1a-9835-b5056ffe9561")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
            
            if(element instanceof TemplateParameter){       return false;    }  
         if(element instanceof ModelElement){       return true;    }  
        
        }
        return false;
    }

    @objid ("2cea6a99-62b5-4717-a2fa-fe023fe5093c")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("TimedInstantObservation_NoteCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            TimedInstantObservation_Note proxy = new TimedInstantObservation_Note();
        
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
