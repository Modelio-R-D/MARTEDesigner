package org.modelio.module.marte.profile.hwcommunication.command.explorer;

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
import org.modelio.module.marte.profile.hwcommunication.model.HwCommunicationResource_Attribute;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("e22f981d-a20f-4fe2-98e2-62715fe84dde")
public class HwCommunicationResource_AttributeCommand extends DefaultModuleCommandHandler {
    @objid ("e539ab68-79bf-4845-9bb2-0484eafdab49")
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

    @objid ("7f092977-f8dd-4423-a078-feb1582d850a")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("HwCommunicationResource_AttributeCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            HwCommunicationResource_Attribute proxy = new HwCommunicationResource_Attribute();
        
        if(parent instanceof AssociationEnd){
            proxy.setParent((AssociationEnd) parent);
        }
        if(parent instanceof Classifier){
            proxy.setParent((Classifier) parent);
        }
        if(parent instanceof TemplateParameter){
            proxy.setParent((TemplateParameter) parent);
        }     
        MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
                  
            
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
