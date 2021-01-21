package org.modelio.module.marte.profile.hwgeneral.command.explorer;

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
import org.modelio.module.marte.profile.hwgeneral.model.HwResourceService_Operation;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("e9735211-7755-492a-be9e-cf11074afac1")
public class HwResourceService_OperationCommand extends DefaultModuleCommandHandler {
    @objid ("7d5ec614-9dae-471f-a1ad-2d1aafb7795d")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0); /* Audit constraints adding */ if (element instanceof Enumeration) { return false; }
        
          if(element instanceof TemplateParameter){       return false;    }    
         if(element instanceof Classifier){       return true;    }  
        }
        return false;
    }

    @objid ("ba9660d3-08b9-42f7-9194-643a10eda28a")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("HwResourceService_OperationCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            HwResourceService_Operation proxy = new HwResourceService_Operation();
        
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
