package org.modelio.module.marte.profile.hwcommunication.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwcommunication.model.HwCommunicationResource_Parameter;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("97e7aba5-7346-433e-8a5a-36837042222e")
public class HwCommunicationResource_ParameterCommand extends DefaultModuleCommandHandler {
    @objid ("58b48b2f-f631-4674-84ff-7f641c3f818a")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0); /* Audit constraints adding */ if (element instanceof Enumeration) { return false; }
            
         if(element instanceof Operation){       return true;    }  
        
        }
        return false;
    }

    @objid ("030f5943-fa31-4d0e-9618-566865811291")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("HwCommunicationResource_ParameterCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            HwCommunicationResource_Parameter proxy = new HwCommunicationResource_Parameter();
        
        if(parent instanceof Operation){
            proxy.setParent((Operation) parent);
        }
        
        MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
        
            
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
