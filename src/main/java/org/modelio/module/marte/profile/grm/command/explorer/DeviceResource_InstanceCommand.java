package org.modelio.module.marte.profile.grm.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.usecaseModel.Actor;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.DeviceResource_Instance;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("4d7cb6b8-9844-4315-99cf-14695b27eecb")
public class DeviceResource_InstanceCommand extends DefaultModuleCommandHandler {
    @objid ("5d601306-48b2-455a-822b-6beeae8ac86b")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
            /* Audit constraints adding */
            if (element instanceof Enumeration || element instanceof Class || element instanceof Actor || element instanceof Instance || element instanceof Signal) {
                return false;
            }
         if(element instanceof NameSpace){       return true;    }  
         if(element instanceof TemplateParameter){       return true;    }  
        }
        return false;
    }

    @objid ("871364a0-5f44-42a3-b9eb-b6421bae26c4")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("DeviceResource_InstanceCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            DeviceResource_Instance proxy = new DeviceResource_Instance();
        
        if(parent instanceof NameSpace){
            proxy.setParent((NameSpace) parent);
        }
        if(parent instanceof TemplateParameter){
            proxy.setParent((TemplateParameter) parent);
        }      
        MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
                 
            
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
