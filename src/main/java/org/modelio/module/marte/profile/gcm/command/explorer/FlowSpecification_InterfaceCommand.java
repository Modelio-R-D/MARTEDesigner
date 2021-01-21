package org.modelio.module.marte.profile.gcm.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.gcm.model.FlowSpecification_Interface;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("8347df81-824f-4c80-b6ca-ce3f333188b6")
public class FlowSpecification_InterfaceCommand extends DefaultModuleCommandHandler {
    @objid ("51078425-5f40-44d3-b6da-ec65fbaa6076")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
        
            if(element instanceof Package){       return true;    }  
        }
        return false;
    }

    @objid ("a944461b-0d5e-4448-8d21-bb7779c85af0")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("FlowSpecification_InterfaceCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            FlowSpecification_Interface proxy = new FlowSpecification_Interface();
        
            if(parent instanceof Package){
                proxy.setParent((Package) parent);
            }      
            MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
        
            tr.commit();
        
            
        
            
                
        }
    }

}
