package org.modelio.module.marte.profile.rsm.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.rsm.model.Shaped_Parameter;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("d0083a4b-c316-485f-86a0-370fcf127362")
public class Shaped_ParameterCommand extends DefaultModuleCommandHandler {
    @objid ("4fa9e8e7-02c5-41c6-9859-46b9e23562f5")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
            
         if(element instanceof Operation){       return true;    }  
         if(element instanceof Operation){       return true;    }  
         if(element instanceof TemplateParameter){       return true;    }  
        }
        return false;
    }

    @objid ("279e3005-86ca-4b8e-b83a-fa4756243cfa")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("Shaped_ParameterCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            Shaped_Parameter proxy = new Shaped_Parameter();
        
        //        if(parent instanceof Operation){
        //            proxy.setParent((Operation) parent);
        //        }
        //        if(parent instanceof Operation){
        //            proxy.setParent((Operation) parent);
        //        }
        if(parent instanceof TemplateParameter){
            proxy.setParent((TemplateParameter) parent);
        }           
            
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
