package org.modelio.module.marte.profile.pam.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.pam.model.PaLogicalResource_Attribute;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("f9e4f5fc-0e90-456f-8861-3d2a8c28bf8f")
public class PaLogicalResource_AttributeCommand extends DefaultModuleCommandHandler {
    @objid ("76614460-9e19-4513-b08e-ad41f02fda96")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
            
         if(element instanceof AssociationEnd){       return true;    }  
         if(element instanceof Classifier){       return true;    }  
         if(element instanceof TemplateParameter){       return true;    }  
        }
        return false;
    }

    @objid ("8ef5339f-1789-452c-9f2c-b1ede5738277")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("PaLogicalResource_AttributeCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            PaLogicalResource_Attribute proxy = new PaLogicalResource_Attribute();
        
        if(parent instanceof AssociationEnd){
            proxy.setParent((AssociationEnd) parent);
        }
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
