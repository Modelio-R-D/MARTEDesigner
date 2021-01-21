package org.modelio.module.marte.profile.time.command.explorer;

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
import org.modelio.module.marte.profile.time.model.Clock_BindableInstance;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("edde016d-e7b3-4af0-ba8f-67b9d728a385")
public class Clock_BindableInstanceCommand extends DefaultModuleCommandHandler {
    @objid ("929db98d-093e-404f-932f-f81f38d8ae34")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
        
            if(element instanceof TemplateParameter){       return false;    }
         if(element instanceof Instance){       return true;    }
         if(element instanceof Classifier){       return true;    }
         if(element instanceof NameSpace){       return true;    }
        }
        return false;
    }

    @objid ("7525c9be-5067-4669-824b-081339cc6116")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("Clock_BindableInstanceCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);
            Clock_BindableInstance proxy = new Clock_BindableInstance();
        
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
