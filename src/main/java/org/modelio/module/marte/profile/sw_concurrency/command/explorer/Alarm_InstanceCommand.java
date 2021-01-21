package org.modelio.module.marte.profile.sw_concurrency.command.explorer;

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
import org.modelio.module.marte.profile.sw_concurrency.model.Alarm_Instance;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("d354be5d-4572-4532-a1d2-87f698f8edbf")
public class Alarm_InstanceCommand extends DefaultModuleCommandHandler {
    @objid ("5472cbe5-83df-42da-b84c-d837b706fb60")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
            /* Audit constraints adding */
            if (element instanceof Enumeration || element instanceof Class || element instanceof Actor || element instanceof Instance || element instanceof Signal) {
                return false;
            }
        
            if(element instanceof TemplateParameter){       return false;    }  
         if(element instanceof NameSpace){       return true;    }  
        }
        return false;
    }

    @objid ("c1061e2e-4359-4923-b7f8-493c55b8ad08")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("Alarm_InstanceCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            Alarm_Instance proxy = new Alarm_Instance();
        
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
