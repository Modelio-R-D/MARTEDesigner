package org.modelio.module.marte.profile.time.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.time.model.TimedEvent_Event;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("f04be60d-77c2-4e87-ae84-908d372511ef")
public class TimedEvent_EventCommand extends DefaultModuleCommandHandler {
    @objid ("a32c65a8-7f0a-42a9-8c14-f56387b7fd77")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0); 
         
         if(element instanceof Behavior){       return true;    }  
        }
        return false;
    }

    @objid ("23a43d12-e3cc-46a0-9ba9-86d8a95207a3")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("TimedEvent_EventCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            TimedEvent_Event proxy = new TimedEvent_Event();
        
        if(parent instanceof Behavior){
            proxy.setParent((Behavior) parent);
        }
        if(parent instanceof TemplateParameter){
            proxy.setParent((TemplateParameter) parent);
        }           
            
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
