package org.modelio.module.marte.profile.hwcomputing.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwcomputing.model.HwBranchPredictor_Lifeline;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("7ee9259f-10d8-4eca-aa90-d33c3223928e")
public class HwBranchPredictor_LifelineCommand extends DefaultModuleCommandHandler {
    @objid ("d9d4845e-1948-4db9-87b9-b4c950429d75")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0); /* Audit constraints adding */ if (element instanceof Enumeration) { return false; }
            
            if(element instanceof TemplateParameter){       return false;    }  
            if(element instanceof Interaction){       return true;    }   
        }
        return false;
    }

    @objid ("e23c4952-a300-4ff7-bcaa-329eec72fba9")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("HwBranchPredictor_LifelineCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            HwBranchPredictor_Lifeline proxy = new HwBranchPredictor_Lifeline();
        
        if(parent instanceof Interaction){
            proxy.setParent((Interaction) parent);
        }
        if(parent instanceof TemplateParameter){
            proxy.setParent((TemplateParameter) parent);
        }   MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
                
            
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
