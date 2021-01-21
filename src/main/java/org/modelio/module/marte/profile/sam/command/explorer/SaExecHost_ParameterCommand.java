package org.modelio.module.marte.profile.sam.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.sam.model.SaExecHost_Parameter;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("a23bb0cb-d153-4d80-99f5-40c1ef4671ac")
public class SaExecHost_ParameterCommand extends DefaultModuleCommandHandler {
    @objid ("328bf977-2dd4-4f5b-8ed3-c165fcfccfc2")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
            
         if(element instanceof Behavior){       return true;    }  
         if(element instanceof Operation){       return true;    }  
         if(element instanceof Operation){       return true;    }  
         if(element instanceof TemplateParameter){       return true;    }  
        }
        return false;
    }

    @objid ("216f21de-3c6f-48fd-9c62-a485462b9a52")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("SaExecHost_ParameterCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            SaExecHost_Parameter proxy = new SaExecHost_Parameter();
        
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
