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
import org.modelio.module.marte.profile.grm.model.TimerResource_AssociationEnd;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("801ba805-872d-4145-b450-47c445d425f2")
public class TimerResource_AssociationEndCommand extends DefaultModuleCommandHandler {
    @objid ("99063d25-a78d-463e-8e42-fe7ef336236b")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0); /* Audit constraints adding */ if (element instanceof Enumeration) { return false; }
            
         if(element instanceof Classifier){       return true;    }  
         if(element instanceof TemplateParameter){       return true;    }  
        }
        return false;
    }

    @objid ("7e201e48-e2d5-474c-8a08-97d04a798fe1")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("TimerResource_AssociationEndCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            TimerResource_AssociationEnd proxy = new TimerResource_AssociationEnd();
        
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
