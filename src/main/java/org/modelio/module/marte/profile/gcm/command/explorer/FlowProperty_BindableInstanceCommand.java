package org.modelio.module.marte.profile.gcm.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.gcm.model.FlowProperty_BindableInstance;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("00f78947-1e61-40f4-82c1-2381f71e24ad")
public class FlowProperty_BindableInstanceCommand extends DefaultModuleCommandHandler {
    @objid ("0f380bab-ed38-4564-9d77-b89aa63e6d6b")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
        
            if(element instanceof Instance){       return true;    }  
            if(element instanceof Classifier){       return true;    }  
            if(element instanceof NameSpace){       return true;    }  
            if(element instanceof TemplateParameter){       return true;    }  
        }
        return false;
    }

    @objid ("249075dd-5223-4e51-b0b6-78e0a5be3ecf")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("FlowProperty_BindableInstanceCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            FlowProperty_BindableInstance proxy = new FlowProperty_BindableInstance();
        
            if(parent instanceof Instance){
                proxy.setParent((Instance) parent);
            }
            if(parent instanceof Classifier){
                proxy.setParent((Classifier) parent);
            }
            if(parent instanceof NameSpace){
                proxy.setParent((NameSpace) parent);
            }
            if(parent instanceof TemplateParameter){
                proxy.setParent((TemplateParameter) parent);
            }     
            MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
        
            tr.commit();
            
        
            
        
            
                
        }
    }

}
