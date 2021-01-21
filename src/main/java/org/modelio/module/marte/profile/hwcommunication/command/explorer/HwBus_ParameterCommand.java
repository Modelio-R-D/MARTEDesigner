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
import org.modelio.module.marte.profile.hwcommunication.model.HwBus_Parameter;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("6f917ef4-acbd-4205-b64d-ee7966857284")
public class HwBus_ParameterCommand extends DefaultModuleCommandHandler {
    @objid ("28f21d61-00fe-4f98-886d-a1f1a50830bc")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0); /* Audit constraints adding */ if (element instanceof Enumeration) { return false; }
            
         if(element instanceof Operation){       return true;    }  
        
        }
        return false;
    }

    @objid ("482cb05c-f22c-49bf-92c9-ca97c6dc29bf")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("HwBus_ParameterCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            HwBus_Parameter proxy = new HwBus_Parameter();
        
        if(parent instanceof Operation){
            proxy.setParent((Operation) parent);
        }
        
        MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
        
            
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
