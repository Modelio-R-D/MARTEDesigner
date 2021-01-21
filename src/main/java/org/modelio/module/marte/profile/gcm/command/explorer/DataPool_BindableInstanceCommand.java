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
import org.modelio.module.marte.profile.gcm.model.DataPool_BindableInstance;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("ebfac52b-ab5d-41b3-b194-ac358d391a02")
public class DataPool_BindableInstanceCommand extends DefaultModuleCommandHandler {
    @objid ("7804bbac-1444-4ebc-b182-d7e96587c404")
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

    @objid ("d6329f89-a980-4f39-a197-b9d50bfcc03e")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("DataPool_BindableInstanceCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            DataPool_BindableInstance proxy = new DataPool_BindableInstance();
        
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
