package org.modelio.module.marte.profile.time.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.time.model.ClockConstraint_Constraint;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("a6ce0c5f-d5f6-4605-acf6-cccb001873f8")
public class ClockConstraint_ConstraintCommand extends DefaultModuleCommandHandler {
    @objid ("bb196dd7-528d-4e42-8b84-fde2bdbe01d0")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
        
            if(element instanceof TemplateParameter){       return false;    }  
            if(element instanceof ModelElement){       return true;    }  
        }
        return false;
    }

    @objid ("f86ca6d0-a890-4e05-a7f8-d249c7324b9d")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("ClockConstraint_ConstraintCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            ClockConstraint_Constraint proxy = new ClockConstraint_Constraint();
        
            if(parent instanceof TemplateParameter){
                proxy.setParent((TemplateParameter) parent);
            }           
        
            tr.commit();
        }
    }

}
