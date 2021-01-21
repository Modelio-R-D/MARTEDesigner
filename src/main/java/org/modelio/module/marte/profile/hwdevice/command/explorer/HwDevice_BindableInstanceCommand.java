package org.modelio.module.marte.profile.hwdevice.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwdevice.model.HwDevice_BindableInstance;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("903980d2-daf6-4cf8-92af-a8ddd9060dea")
public class HwDevice_BindableInstanceCommand extends DefaultModuleCommandHandler {
    @objid ("1fb19e37-1143-4af3-8992-0bae3e63cc57")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
            if(element instanceof TemplateParameter){       return false;    }     
         if(element instanceof Instance){       return true;    }  
         if(element instanceof Classifier){       return true;    }  
         if(element instanceof NameSpace){       return true;    }  
        }
        return false;
    }

    @objid ("3b286cf4-f69c-4739-a329-691456bfa975")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("HwDevice_BindableInstanceCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            HwDevice_BindableInstance proxy = new HwDevice_BindableInstance();
        
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
        }  MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
                 
            
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
