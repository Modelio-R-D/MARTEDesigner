package org.modelio.module.marte.profile.gcm.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.gcm.model.FlowProperty_AssociationEnd;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("b7836252-5296-4d54-b525-ccb97af76200")
public class FlowProperty_AssociationEndCommand extends DefaultModuleCommandHandler {
    @objid ("f0909a15-be3f-472d-9a0d-8538d2676240")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
        
            if(element instanceof Classifier){       return true;    }  
            if(element instanceof TemplateParameter){       return true;    }  
        }
        return false;
    }

    @objid ("bcb7c0eb-8b97-433b-ac99-b4fdec63f2b3")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("FlowProperty_AssociationEndCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            FlowProperty_AssociationEnd proxy = new FlowProperty_AssociationEnd();
        
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
