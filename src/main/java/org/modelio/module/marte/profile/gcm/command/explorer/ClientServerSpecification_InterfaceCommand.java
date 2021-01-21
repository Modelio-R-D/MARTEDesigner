package org.modelio.module.marte.profile.gcm.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.gcm.model.ClientServerSpecification_Interface;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("5535ebfe-1d21-48c7-8cd9-8b1ec1382d4e")
public class ClientServerSpecification_InterfaceCommand extends DefaultModuleCommandHandler {
    @objid ("3fb7fbe1-bc61-40d1-beb2-d2589e17a4c6")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
        
            if(element instanceof Package){       return true;    }  
        }
        return false;
    }

    @objid ("2f511785-4a74-4db1-a0f2-ddbfeaab8f4e")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("ClientServerSpecification_InterfaceCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            ClientServerSpecification_Interface proxy = new ClientServerSpecification_Interface();
        
            if(parent instanceof Package){
                proxy.setParent((Package) parent);
            }       
            MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
        
            tr.commit();
            
            
            
        
            
                
        }
    }

}
