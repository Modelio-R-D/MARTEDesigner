package org.modelio.module.marte.profile.gqam.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.gqam.model.GaLatencyObs_Constraint;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("9859af1b-02a3-457f-99f7-44d9a6fec9c6")
public class GaLatencyObs_ConstraintCommand extends DefaultModuleCommandHandler {
    @objid ("471b3889-8c66-4104-82ff-0181e80684cc")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
            
         if(element instanceof TemplateParameter){       return true;    }  
        }
        return false;
    }

    @objid ("878e09a7-9f55-466f-86a0-68ea74aaf509")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("GaLatencyObs_ConstraintCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            GaLatencyObs_Constraint proxy = new GaLatencyObs_Constraint();
        
        if(parent instanceof TemplateParameter){
            proxy.setParent((TemplateParameter) parent);
        }      
        MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
                 
            
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
