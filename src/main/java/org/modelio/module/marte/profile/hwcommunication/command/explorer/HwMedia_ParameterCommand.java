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
import org.modelio.module.marte.profile.hwcommunication.model.HwMedia_Parameter;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("e87adec7-bcf3-45e6-86df-267c11ed7801")
public class HwMedia_ParameterCommand extends DefaultModuleCommandHandler {
    @objid ("b71f21cd-00c2-474b-9321-97fa91e87ae6")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0); /* Audit constraints adding */ if (element instanceof Enumeration) { return false; }
            
         if(element instanceof Operation){       return true;    }  
        
        }
        return false;
    }

    @objid ("25604174-e1c7-4f4d-b748-de9093a82ae3")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("HwMedia_ParameterCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            HwMedia_Parameter proxy = new HwMedia_Parameter();
        
        if(parent instanceof Operation){
            proxy.setParent((Operation) parent);
        }
        
        MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
        
            
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
