package org.modelio.module.marte.profile.gcm.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.gcm.model.ClientServerFeature_Operation;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("d70f60ec-a07f-4894-97d9-1f5ec8179a2f")
public class ClientServerFeature_OperationCommand extends DefaultModuleCommandHandler {
    @objid ("e5f65987-df04-46e5-b914-40e9590d93a8")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
        
            if(element.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.CLIENTSERVERSPECIFICATION_INTERFACE)){
                return true;
            }
        }
        return false;
    }

    @objid ("d6665fd8-0a42-4c5e-aa7f-7ac1aaa937ed")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("ClientServerFeature_OperationCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            ClientServerFeature_Operation proxy = new ClientServerFeature_Operation();
        
            if(parent instanceof Interface){
                proxy.setParent((Interface) parent);
            }
            
            MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
        
            tr.commit();
            
            
        
            
                
        }
    }

}
