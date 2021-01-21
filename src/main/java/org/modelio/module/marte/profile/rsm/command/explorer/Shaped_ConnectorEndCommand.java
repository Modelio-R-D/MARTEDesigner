package org.modelio.module.marte.profile.rsm.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.rsm.model.Shaped_ConnectorEnd;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("f84f5b8c-8931-42c8-9aa4-f18917a57e05")
public class Shaped_ConnectorEndCommand extends DefaultModuleCommandHandler {
    @objid ("a9879f84-dca4-46f5-ac93-728d36c5f22f")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
            
         if(element instanceof Link){       return true;    }  
         if(element instanceof TemplateParameter){       return true;    }  
        }
        return false;
    }

    @objid ("be5bd594-72b1-4a82-8839-3201cda8d0aa")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("Shaped_ConnectorEndCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            Shaped_ConnectorEnd proxy = new Shaped_ConnectorEnd();
        
        if(parent instanceof Link){
            proxy.setParent((Link) parent);
        }
        if(parent instanceof TemplateParameter){
            proxy.setParent((TemplateParameter) parent);
        }           
            
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
