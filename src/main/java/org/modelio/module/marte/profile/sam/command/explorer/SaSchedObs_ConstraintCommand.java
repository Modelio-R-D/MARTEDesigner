package org.modelio.module.marte.profile.sam.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.sam.model.SaSchedObs_Constraint;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("eec6f119-674f-4630-8e79-56465c95088e")
public class SaSchedObs_ConstraintCommand extends DefaultModuleCommandHandler {
    @objid ("155979c3-a588-46e3-9292-49d153e1c3ad")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
            
         if(element instanceof TemplateParameter){       return true;    }  
        }
        return false;
    }

    @objid ("03d002d3-29d8-4794-b7f5-79dabd764cfb")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("SaSchedObs_ConstraintCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            SaSchedObs_Constraint proxy = new SaSchedObs_Constraint();
        
        if(parent instanceof TemplateParameter){
            proxy.setParent((TemplateParameter) parent);
        }           
            
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
