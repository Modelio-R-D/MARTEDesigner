package org.modelio.module.marte.profile.pam.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.pam.model.PaLogicalResource_Lifeline;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("eeada6a2-e852-424b-af29-5862d1d0f831")
public class PaLogicalResource_LifelineCommand extends DefaultModuleCommandHandler {
    @objid ("4c8892d4-d101-480d-8ff9-fb090150ac38")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
            
         if(element instanceof Interaction){       return true;    }  
         if(element instanceof TemplateParameter){       return true;    }  
        }
        return false;
    }

    @objid ("5b719726-b50b-4730-8b09-807f34cd0c33")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("PaLogicalResource_LifelineCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            PaLogicalResource_Lifeline proxy = new PaLogicalResource_Lifeline();
        
        if(parent instanceof Interaction){
            proxy.setParent((Interaction) parent);
        }
        if(parent instanceof TemplateParameter){
            proxy.setParent((TemplateParameter) parent);
        }           
            
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
