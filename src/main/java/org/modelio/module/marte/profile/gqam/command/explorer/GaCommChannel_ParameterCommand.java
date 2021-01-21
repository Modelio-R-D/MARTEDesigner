package org.modelio.module.marte.profile.gqam.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.gqam.model.GaCommChannel_Parameter;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("3081fe21-a900-40ac-8df8-25724ad062c1")
public class GaCommChannel_ParameterCommand extends DefaultModuleCommandHandler {
    @objid ("61c6b1c6-6666-4c08-beb3-da8f5a132bd6")
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

    @objid ("8ef48e1b-5ca4-4919-bb7f-b6e8a0ea8be2")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("GaCommChannel_ParameterCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            GaCommChannel_Parameter proxy = new GaCommChannel_Parameter();
        
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