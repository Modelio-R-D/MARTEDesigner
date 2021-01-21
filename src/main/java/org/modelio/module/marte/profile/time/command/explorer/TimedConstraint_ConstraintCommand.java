package org.modelio.module.marte.profile.time.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.time.model.TimedConstraint_Constraint;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("f020d404-ee27-4441-b30d-484ca7b4d422")
public class TimedConstraint_ConstraintCommand extends DefaultModuleCommandHandler {
    @objid ("4a15855f-b7ec-4e65-9ef0-cc4954e17fde")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement) selected_element.get(0); 
        
            if(element instanceof TemplateParameter){       return false;    }    
            if(element instanceof ModelElement){       return true;    }  
        }
        return false;
    }

    @objid ("72fc8f65-128a-4d6a-a784-0d58124bfb8f")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("TimedConstraint_ConstraintCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            TimedConstraint_Constraint proxy = new TimedConstraint_Constraint();
        
            if(parent instanceof TemplateParameter){
                proxy.setParent((TemplateParameter) parent);
            }           
        
            tr.commit();
        }
    }

}
