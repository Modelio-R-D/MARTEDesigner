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
import org.modelio.module.marte.profile.sw_concurrency.model.MemoryPartition_Instance;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("a2ae0f90-1a43-44e3-bfc2-a91a720f57fd")
public class MemoryPartition_InstanceCommand extends DefaultModuleCommandHandler {
    @objid ("78107a43-735d-4650-b134-e83baaa26ecd")
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

    @objid ("35729660-2cd9-4ab4-a4cb-be58aa4de7cc")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("MemoryPartition_InstanceCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            MemoryPartition_Instance proxy = new MemoryPartition_Instance();
        
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
