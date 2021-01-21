package org.modelio.module.marte.profile.time.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.time.model.ClockType_Class;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("11c92aad-219e-4f65-824b-99fadf2cde8f")
public class ClockType_ClassCommand extends DefaultModuleCommandHandler {
    @objid ("1d0d4a79-5c5e-44ee-860f-a99c1e402a88")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0); 
        //            /* Audit constraints adding */ 
        //            if (element instanceof Enumeration || element instanceof Node || element instanceof Collaboration || element instanceof Actor || element instanceof UseCase || element instanceof Signal) { 
        //                return false; 
        //                }
            
         if(element.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.TIMEDDOMAIN_NAMESPACE)){
                return true;
            }
        }
        return false;
    }

    @objid ("ade026df-a28d-446e-a1c1-f36221cf4601")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("ClockType_ClassCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            ClockType_Class proxy = new ClockType_Class();
        
        if(parent instanceof Package){
            proxy.setParent((Package) parent);
        }           
        MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
        
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
