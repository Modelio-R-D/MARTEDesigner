package org.modelio.module.marte.profile.nfps.command.explorer;

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
import org.modelio.module.marte.profile.nfps.model.Nfp_Attribute;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("8d2f4929-6a62-4905-9908-6ea2934dcbf8")
public class Nfp_AttributeCommand extends DefaultModuleCommandHandler {
    @objid ("ec486443-4efb-4da5-94ab-38c697f4b3cf")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0); /* Audit constraints adding */ if (element instanceof Enumeration) { return false; }
        
            if(element instanceof TemplateParameter){       return false;    }  
         if(element instanceof AssociationEnd){       return false;    }  
         if(element instanceof Classifier){       return true;    }  
        }
        return false;
    }

    @objid ("d2507ae8-bafa-43e9-8489-1b3ba307e0db")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("Nfp_AttributeCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            Nfp_Attribute proxy = new Nfp_Attribute();
        
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
