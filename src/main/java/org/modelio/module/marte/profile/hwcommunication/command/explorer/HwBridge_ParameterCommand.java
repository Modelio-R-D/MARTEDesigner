package org.modelio.module.marte.profile.hwcommunication.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwcommunication.model.HwBridge_Parameter;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("c9b1d8e4-cff2-447c-81c8-9ce79ebadf0c")
public class HwBridge_ParameterCommand extends DefaultModuleCommandHandler {
    @objid ("c720214a-17d9-4111-80e0-19678e834884")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0); /* Audit constraints adding */ if (element instanceof Enumeration) { return false; }
            
         if(element instanceof Operation){       return true;    }  
        
        }
        return false;
    }

    @objid ("e31d61fd-a071-4a63-af36-f6adc5044ef1")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("HwBridge_ParameterCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            HwBridge_Parameter proxy = new HwBridge_Parameter();
        
        if(parent instanceof Operation){
            proxy.setParent((Operation) parent);
        }
        
        MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
          
            
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
