package org.modelio.module.marte.profile.hwcomputing.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwcomputing.model.HwISA_Attribute;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("fe65ca51-1f1d-4ace-885e-c57497d30f69")
public class HwISA_AttributeCommand extends DefaultModuleCommandHandler {
    @objid ("d80004b5-5199-49fb-935a-5a57e9115fa8")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0); /* Audit constraints adding */ if (element instanceof Enumeration) { return false; }
            if(element instanceof TemplateParameter){       return false;    }  
         if(element instanceof AssociationEnd){       return true;    }  
         if(element instanceof Classifier){       return true;    }   
        }
        return false;
    }

    @objid ("4823ce16-0262-47b7-a3aa-87a089ca7a2e")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("HwISA_AttributeCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            HwISA_Attribute proxy = new HwISA_Attribute();
        
        if(parent instanceof AssociationEnd){
            proxy.setParent((AssociationEnd) parent);
        }
        if(parent instanceof Classifier){
            proxy.setParent((Classifier) parent);
        }
        if(parent instanceof TemplateParameter){
            proxy.setParent((TemplateParameter) parent);
        }   MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
                
            
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
