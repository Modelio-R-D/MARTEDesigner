package org.modelio.module.marte.profile.sam.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.sam.model.SaCommHost_Instance;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("5c696068-c46b-4fcc-87fc-340105627022")
public class SaCommHost_InstanceCommand extends DefaultModuleCommandHandler {
    @objid ("dd71e57e-8571-4d89-b1ee-0a525592e9cd")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
            
         if(element instanceof NameSpace){       return true;    }  
         if(element instanceof TemplateParameter){       return true;    }  
        }
        return false;
    }

    @objid ("9d68a874-546f-428b-97b9-fc846826f929")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("SaCommHost_InstanceCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            SaCommHost_Instance proxy = new SaCommHost_Instance();
        
        if(parent instanceof NameSpace){
            proxy.setParent((NameSpace) parent);
        }
        if(parent instanceof TemplateParameter){
            proxy.setParent((TemplateParameter) parent);
        }           
            
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
