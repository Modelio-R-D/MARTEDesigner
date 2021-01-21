package org.modelio.module.marte.profile.time.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.behavior.activityModel.Activity;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.time.model.TimedProcessing_OpaqueAction;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("9a9d800f-8f4e-4b51-a685-83144f0e1afd")
public class TimedProcessing_OpaqueActionCommand extends DefaultModuleCommandHandler {
    @objid ("eabbcce9-2df3-456b-b77a-0cd2f0f8e111")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
            /* Audit constraints adding */ 
            if (element instanceof Enumeration) { 
                return false; 
            }
        
            if(element instanceof Activity){       
                return true;   
            }  
        }
        return false;
    }

    @objid ("0590a5ec-8641-4a10-811e-7ba6ac4f85d9")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("TimedProcessing_OpaqueActionCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            TimedProcessing_OpaqueAction proxy = new TimedProcessing_OpaqueAction();
        
        if(parent instanceof Activity){
            proxy.setParent((Activity)parent);
        }           
        MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
          
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
