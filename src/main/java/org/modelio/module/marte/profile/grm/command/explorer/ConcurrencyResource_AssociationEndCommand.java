package org.modelio.module.marte.profile.grm.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.ConcurrencyResource_AssociationEnd;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("14242680-1afc-4c78-b0ce-fb8118dc8438")
public class ConcurrencyResource_AssociationEndCommand extends DefaultModuleCommandHandler {
    @objid ("fe1af0a2-6ea1-4fbd-b8e6-1bb75a689d04")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0); /* Audit constraints adding */ if (element instanceof Enumeration) { return false; }
            
         if(element instanceof Classifier){       return true;    }  
         if(element instanceof TemplateParameter){       return true;    }  
        }
        return false;
    }

    @objid ("8079dc3c-0bc2-4785-8fbe-c95a08351fb9")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("ConcurrencyResource_AssociationEndCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            ConcurrencyResource_AssociationEnd proxy = new ConcurrencyResource_AssociationEnd();
        
        if(parent instanceof Classifier){
            proxy.setParent((Classifier) parent);
        }
        if(parent instanceof TemplateParameter){
            proxy.setParent((TemplateParameter) parent);
        }           
            
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
