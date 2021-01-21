package org.modelio.module.marte.profile.grm.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.Resource_Parameter;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("bb7bd724-7990-4992-91b5-4221bfd6b10b")
public class Resource_ParameterCommand extends DefaultModuleCommandHandler {
    @objid ("7c330697-0d66-4f1d-b99a-493c6155ecc2")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0); /* Audit constraints adding */ if (element instanceof Enumeration) { return false; }
            
         if(element instanceof Operation){       return true;    }  
         if(element instanceof Operation){       return true;    }  
         if(element instanceof TemplateParameter){       return true;    }  
        }
        return false;
    }

    @objid ("44ac7d20-7512-4c90-ac7e-9ab9710244a4")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("Resource_ParameterCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            Resource_Parameter proxy = new Resource_Parameter();
        
        if(parent instanceof Operation){
            proxy.setParent((Operation) parent);
        }
        if(parent instanceof Operation){
            proxy.setParent((Operation) parent);
        }
        if(parent instanceof TemplateParameter){
            proxy.setParent((TemplateParameter) parent);
        }     
        MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
                  
            
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
