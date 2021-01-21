package org.modelio.module.marte.profile.gqam.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.gqam.model.GaTimedObs_Constraint;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("94f47e76-1199-46df-bbd2-e79f7902654b")
public class GaTimedObs_ConstraintCommand extends DefaultModuleCommandHandler {
    @objid ("f86f2446-20fa-4940-8e3f-8a43ff8debb8")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
            
         if(element instanceof TemplateParameter){       return true;    }  
        }
        return false;
    }

    @objid ("96420ea2-0630-4eb0-97c3-fe9bef9c0708")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("GaTimedObs_ConstraintCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            GaTimedObs_Constraint proxy = new GaTimedObs_Constraint();
        
        if(parent instanceof TemplateParameter){
            proxy.setParent((TemplateParameter) parent);
        }     
        MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
                  
            
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
