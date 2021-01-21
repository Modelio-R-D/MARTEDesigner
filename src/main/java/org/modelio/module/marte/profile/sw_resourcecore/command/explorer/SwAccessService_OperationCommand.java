package org.modelio.module.marte.profile.sw_resourcecore.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.sw_resourcecore.model.SwAccessService_Operation;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("d92eeef9-6d71-46d2-ab8b-812fe362bac6")
public class SwAccessService_OperationCommand extends DefaultModuleCommandHandler {
    @objid ("be50ddf3-e58e-4f9c-8bbd-ffa6e3ae1eb6")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0); /* Audit constraints adding */ if (element instanceof Enumeration) { return false; }
        
            if(element instanceof TemplateParameter){       return false;    }  
         if(element instanceof Classifier){       return true;    }  
        }
        return false;
    }

    @objid ("550450f6-3d8f-4dce-ab60-71f1f34b611e")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("SwAccessService_OperationCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            SwAccessService_Operation proxy = new SwAccessService_Operation();
        
        if(parent instanceof Classifier){
            proxy.setParent((Classifier) parent);
        }
        if(parent instanceof TemplateParameter){
            proxy.setParent((TemplateParameter) parent);
        } 
        MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
                  
            
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
