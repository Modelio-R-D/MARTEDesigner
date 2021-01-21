package org.modelio.module.marte.profile.nfps.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.nfps.model.NfpConstraint_Constraint;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("4cc2ebf2-0093-42a7-9d66-5886b80f55d2")
public class NfpConstraint_ConstraintCommand extends DefaultModuleCommandHandler {
    @objid ("4e19e2e0-7147-48a9-a9c3-80a9ec04c83c")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0); 
            /* Audit constraints adding */
            if (element instanceof Enumeration) { return false; }
            
         if(element instanceof TemplateParameter){       return false;    }  
         if(element instanceof ModelElement){       return true;    }  
        }
        return false;
    }

    @objid ("5010c1c4-4b9d-4100-af24-8e2aa5ca9cf2")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("NfpConstraint_ConstraintCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            NfpConstraint_Constraint proxy = new NfpConstraint_Constraint();
        
        if(parent instanceof TemplateParameter){
            proxy.setParent((TemplateParameter) parent);
        }           
            
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
