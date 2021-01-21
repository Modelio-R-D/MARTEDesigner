package org.modelio.module.marte.profile.hwgeneral.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionOperand;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwgeneral.model.HwResourceService_ExecutionSpecification;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("9818cdc1-92b6-485c-92e9-de7f5cca4709")
public class HwResourceService_ExecutionSpecificationCommand extends DefaultModuleCommandHandler {
    @objid ("a629b567-ce49-40b7-be7a-da280ac9a2dd")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0); /* Audit constraints adding */ if (element instanceof Enumeration) { return false; }
            
         if(element instanceof Interaction){       return true;    }  
         if(element instanceof InteractionOperand){       return true;    }  
         if(element instanceof TemplateParameter){       return true;    }  
        }
        return false;
    }

    @objid ("9f243eba-d140-4dc4-8236-cb9d47b5af2d")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("HwResourceService_ExecutionSpecificationCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            HwResourceService_ExecutionSpecification proxy = new HwResourceService_ExecutionSpecification();
        
        if(parent instanceof Interaction){
            proxy.setParent((Interaction) parent);
        }
        if(parent instanceof InteractionOperand){
            proxy.setParent((InteractionOperand) parent);
        }
        if(parent instanceof TemplateParameter){
            proxy.setParent((TemplateParameter) parent);
        }           
        MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
         
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
