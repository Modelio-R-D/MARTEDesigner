package org.modelio.module.marte.profile.datatypes.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.datatypes.model.IntervalType_DataType;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("9d78c449-f92e-4285-aeb2-9c26468b47ca")
public class IntervalType_DataTypeCommand extends DefaultModuleCommandHandler {
    @objid ("b998ab4c-a4c1-4d85-a95a-120b3d04cc91")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            return true;
        }
        return false;
    }

    @objid ("9e4c127e-bf4a-4276-87e0-09deb25f9c90")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("IntervalType_DataTypeCommand")){
            ModelElement parent = (ModelElement) selected_element.get(0);        
            IntervalType_DataType proxy = new IntervalType_DataType();
        
            if(parent instanceof Package){
                proxy.setParent((Package) parent);
            }  
            
            MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
        
            tr.commit();     
        }
    }

}
