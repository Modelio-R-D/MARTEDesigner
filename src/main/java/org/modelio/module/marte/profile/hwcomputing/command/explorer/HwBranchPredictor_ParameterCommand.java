package org.modelio.module.marte.profile.hwcomputing.command.explorer;

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
import org.modelio.module.marte.profile.hwcomputing.model.HwBranchPredictor_Parameter;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("d1db293d-98ea-409c-8dd3-74f1e5a37c25")
public class HwBranchPredictor_ParameterCommand extends DefaultModuleCommandHandler {
    @objid ("4f4155f9-7b44-49d9-8ac8-cf1d25662d52")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0); /* Audit constraints adding */ if (element instanceof Enumeration) { return false; }
            if(element instanceof TemplateParameter){       return false;    }     
         if(element instanceof Operation){       return true;    }   
        }
        return false;
    }

    @objid ("0272265a-b815-4f83-9d41-e7e402eef814")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("HwBranchPredictor_ParameterCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            HwBranchPredictor_Parameter proxy = new HwBranchPredictor_Parameter();
        
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
