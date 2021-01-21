package org.modelio.module.marte.profile.hwdevice.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwdevice.model.HwDevice_Parameter;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("c727fb41-b754-4015-8b51-16c08df29fc2")
public class HwDevice_ParameterCommand extends DefaultModuleCommandHandler {
    @objid ("d9b773a4-ae56-45d0-8801-342ec11e32da")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0); /* Audit constraints adding */ if (element instanceof Enumeration) { return false; }
        
            if(element instanceof TemplateParameter){       return false;    }    
         if(element instanceof Operation){       return true;    }  
         if(element instanceof Operation){       return true;    }  
        
        }
        return false;
    }

    @objid ("eda6df43-a8d4-4d0d-b18f-052444b80522")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("HwDevice_ParameterCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            HwDevice_Parameter proxy = new HwDevice_Parameter();
        
        if(parent instanceof Operation){
            proxy.setParent((Operation) parent);
        }
        if(parent instanceof Operation){
            proxy.setParent((Operation) parent);
        }
        if(parent instanceof TemplateParameter){
            proxy.setParent((TemplateParameter) parent);
        }           
        MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
         
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
