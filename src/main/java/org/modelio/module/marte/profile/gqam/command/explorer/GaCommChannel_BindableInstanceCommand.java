package org.modelio.module.marte.profile.gqam.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.gqam.model.GaCommChannel_BindableInstance;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("51e5afcd-9cba-4fbb-8d17-34413af6facf")
public class GaCommChannel_BindableInstanceCommand extends DefaultModuleCommandHandler {
    @objid ("c8a483e8-c0f8-4eb3-bd40-5ba491d1c8e2")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
            
         if(element instanceof Instance){       return true;    }
        }
        return false;
    }

    @objid ("3ac07477-2e14-4edd-a087-defc701d8596")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("GaCommChannel_BindableInstanceCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            GaCommChannel_BindableInstance proxy = new GaCommChannel_BindableInstance();
        
        if(parent instanceof Instance){
            proxy.setParent((Instance) parent);
        }       
        MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
               
            
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
