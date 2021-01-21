package org.modelio.module.marte.profile.time.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.usecaseModel.Actor;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.time.model.Clock_Instance;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("21761085-06c9-4ae2-9326-bbbd3a2964b8")
public class Clock_InstanceCommand extends DefaultModuleCommandHandler {
    @objid ("9e9a2b2f-9db3-4797-aedc-c1f72b1b19dc")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
            /* Audit constraints adding */
            if (element instanceof Enumeration || element instanceof Class || element instanceof Actor || element instanceof Instance || element instanceof Signal) {
                return false;
            }
         if(element.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.TIMEDDOMAIN_NAMESPACE)){
                return true;
            }
        }
        return false;
    }

    @objid ("ebe4533b-d30a-4dd4-937a-8a55b01b9331")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("Clock_InstanceCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);
            Clock_Instance proxy = new Clock_Instance();
        
        if(parent instanceof Package){
            proxy.setParent((Package) parent);
        }
        MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
        
        
           tr.commit();
        
              
         
        
        
        
        
        }
    }

}
