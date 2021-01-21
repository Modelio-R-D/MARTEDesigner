package org.modelio.module.marte.profile.gcm.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.gcm.model.DataEvent_Event;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("1c84abcb-460c-43f0-80ac-bbfdac2d0049")
public class DataEvent_EventCommand extends DefaultModuleCommandHandler {
    @objid ("d6224f51-b197-47ee-b5e5-3629d7eb9cfb")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
        
            if(element instanceof Behavior){       return true;    }  
            if(element instanceof TemplateParameter){       return true;    }  
        }
        return false;
    }

    @objid ("754ab45a-b8a4-4997-899d-ae46d2833754")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("DataEvent_EventCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            DataEvent_Event proxy = new DataEvent_Event();
        
            if(parent instanceof Behavior){
                proxy.setParent((Behavior) parent);
            }
            if(parent instanceof TemplateParameter){
                proxy.setParent((TemplateParameter) parent);
            }       
            MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
        
            tr.commit();
            
            
            
        
            
                
        }
    }

}
