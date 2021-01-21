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
import org.modelio.module.marte.profile.gcm.model.ClientServerPort_Port;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("4c6333e3-ec21-4b9c-8b68-6d8b49cd10c2")
public class ClientServerPort_PortCommand extends DefaultModuleCommandHandler {
    @objid ("70d23d0b-9070-4577-86af-2e3b31464398")
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

    @objid ("81053605-4c8a-456f-9349-afde1be7373e")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("ClientServerPort_PortCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            ClientServerPort_Port proxy = new ClientServerPort_Port();
        
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
