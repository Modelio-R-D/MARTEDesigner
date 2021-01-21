package org.modelio.module.marte.profile.sw_concurrency.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.sw_concurrency.model.Alarm_BindableInstance;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("9d13262d-beb7-42f2-9332-b054ac09a7d9")
public class Alarm_BindableInstanceCommand extends DefaultModuleCommandHandler {
    @objid ("92b6b7b3-7c49-4d2b-b872-44e0a9f15974")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
        
            if(element instanceof TemplateParameter || element instanceof Signal || element instanceof Enumeration){ 
                return false;    } 
         if(element instanceof Instance){       return true;    }  
         if(element instanceof Classifier){       return true;    }  
         if(element instanceof NameSpace){       return true;    }  
        }
        return false;
    }

    @objid ("24fa3ffc-7cd1-43cd-9c55-98507c0c6114")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("Alarm_BindableInstanceCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            Alarm_BindableInstance proxy = new Alarm_BindableInstance();
        
        if(parent instanceof Instance){
            proxy.setParent((Instance) parent);
        }
        if(parent instanceof Classifier){
            proxy.setParent((Classifier) parent);
        }
        if(parent instanceof NameSpace){
            proxy.setParent((NameSpace) parent);
        }
        if(parent instanceof TemplateParameter){
            proxy.setParent((TemplateParameter) parent);
        }   
        MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
                
            
            
           tr.commit();
         
        
           
                
        }
    }

}
