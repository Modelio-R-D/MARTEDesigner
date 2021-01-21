package org.modelio.module.marte.profile.hwcommunication.command.explorer;

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
import org.modelio.module.marte.profile.hwcommunication.model.HwEndPoint_BindableInstance;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("f3f8fe64-21b7-48ab-bfbe-5b21310bdbcb")
public class HwEndPoint_BindableInstanceCommand extends DefaultModuleCommandHandler {
    @objid ("ab9b9531-9594-4bf0-ab77-72bd13764b87")
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

    @objid ("80966a1f-4602-4b82-b612-216ab03f6a0d")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("HwEndPoint_BindableInstanceCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            HwEndPoint_BindableInstance proxy = new HwEndPoint_BindableInstance();
        
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
