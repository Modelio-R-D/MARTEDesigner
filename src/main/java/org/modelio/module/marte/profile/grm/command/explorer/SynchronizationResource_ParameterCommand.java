package org.modelio.module.marte.profile.grm.command.explorer;

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
import org.modelio.module.marte.profile.grm.model.SynchronizationResource_Parameter;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("694b0a96-f3b5-4931-92f5-f45d3eeb1269")
public class SynchronizationResource_ParameterCommand extends DefaultModuleCommandHandler {
    @objid ("9b0692dd-a448-445f-8a49-0b3be2cb93db")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0); /* Audit constraints adding */ if (element instanceof Enumeration) { return false; }
            
         if(element instanceof Operation){       return true;    }  
         if(element instanceof Operation){       return true;    }  
         if(element instanceof TemplateParameter){       return true;    }  
        }
        return false;
    }

    @objid ("a6b3d61a-8642-4312-b0da-79f07304d4ea")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("SynchronizationResource_ParameterCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            SynchronizationResource_Parameter proxy = new SynchronizationResource_Parameter();
        
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
