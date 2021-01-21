package org.modelio.module.marte.profile.gcm.command.explorer;

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
import org.modelio.module.marte.profile.gcm.model.DataPool_Attribute;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("ed82a789-8904-4246-80b7-e3c2646f28f7")
public class DataPool_AttributeCommand extends DefaultModuleCommandHandler {
    @objid ("ff5de605-f003-469b-ac8c-7a8e8fc0d26b")
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

    @objid ("dbec0abf-38a8-4162-987a-1bc5709978a2")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("DataPool_AttributeCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            DataPool_Attribute proxy = new DataPool_Attribute();
        
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
