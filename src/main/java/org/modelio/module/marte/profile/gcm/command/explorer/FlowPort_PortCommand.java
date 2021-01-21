package org.modelio.module.marte.profile.gcm.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.usecaseModel.Actor;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.gcm.model.FlowPort_Port;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("332323eb-22d9-4003-acb2-679eeda425c9")
public class FlowPort_PortCommand extends DefaultModuleCommandHandler {
    @objid ("1b7de1e8-0f74-4220-a03e-999381bcd9aa")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
        
            /* Audit constraints adding */
            if (element instanceof Node || element instanceof Collaboration || element instanceof Actor || element instanceof UseCase || element instanceof Signal || element instanceof Interface || element instanceof Package) {
                return false;
            }
            if(element instanceof Instance || element instanceof Class || element instanceof Component){
                return true;   
            }  
        }
        return false;
    }

    @objid ("574330c3-c7d0-4ed8-96cb-d7ab7fba5b4c")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("FlowPort_PortCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            FlowPort_Port proxy = new FlowPort_Port();
        
            if(parent instanceof Classifier){
                proxy.setParent((Classifier) parent);
            }
            else if (parent instanceof Instance) {
                proxy.setParent((Instance) parent); 
        
            }    
            MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
        
            tr.commit();
            
            
            
        
            
                
        }
    }

}
