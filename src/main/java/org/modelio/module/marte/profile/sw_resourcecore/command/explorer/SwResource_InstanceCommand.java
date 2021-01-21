package org.modelio.module.marte.profile.sw_resourcecore.command.explorer;

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
import org.modelio.module.marte.profile.sw_resourcecore.model.SwResource_Instance;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("9b12c23c-5591-405f-a237-ca737c2b7781")
public class SwResource_InstanceCommand extends DefaultModuleCommandHandler {
    @objid ("ccbced09-bc52-439a-ac15-b8c03a0971ed")
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

    @objid ("efd9ad58-af8d-4ac5-87a1-28bf96d4cb1e")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("SwResource_InstanceCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            SwResource_Instance proxy = new SwResource_Instance();
        
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
