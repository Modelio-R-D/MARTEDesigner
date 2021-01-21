package org.modelio.module.marte.profile.hwstoragemanager.command.explorer;

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
import org.modelio.module.marte.profile.hwstoragemanager.model.HwStorageManager_BindableInstance;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("d2396eba-be92-4d17-83c9-99f92b1565b6")
public class HwStorageManager_BindableInstanceCommand extends DefaultModuleCommandHandler {
    @objid ("db13a05c-19bd-46a9-8618-942d8cfe6584")
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

    @objid ("f094f9c4-4003-49b9-a468-66c2e23fbe5c")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("HwStorageManager_BindableInstanceCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            HwStorageManager_BindableInstance proxy = new HwStorageManager_BindableInstance();
        
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
