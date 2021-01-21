package org.modelio.module.marte.profile.pam.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.pam.model.PaLogicalResource_AssociationEnd;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("ae55af9e-18dc-4025-ac3f-0ee9f944ce99")
public class PaLogicalResource_AssociationEndCommand extends DefaultModuleCommandHandler {
    @objid ("96761424-7081-4ba1-aff4-7ffde17fdbb0")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
            
         if(element instanceof Classifier){       return true;    }  
         if(element instanceof TemplateParameter){       return true;    }  
        }
        return false;
    }

    @objid ("a014da56-48e3-4cce-812a-a2371eb9aef3")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("PaLogicalResource_AssociationEndCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            PaLogicalResource_AssociationEnd proxy = new PaLogicalResource_AssociationEnd();
        
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
