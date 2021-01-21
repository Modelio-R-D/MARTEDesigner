package org.modelio.module.marte.profile.time.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.time.model.TimedDomain_NameSpace;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("a2269d5f-730e-486e-bac4-d9aeb198e6ff")
public class TimedDomain_NameSpaceCommand extends DefaultModuleCommandHandler {
    @objid ("d6c9bab9-6954-483e-a4cc-2693df0c0f73")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
        //            /* Audit constraints adding */
        //            if (element instanceof Enumeration) { return false; }
        //            
         if(element instanceof Package){       return true;    }  
        }
        return false;
    }

    @objid ("c3aa9d93-aac6-4c6c-a5f1-f0a27d785f6a")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("TimedDomain_NameSpaceCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            TimedDomain_NameSpace proxy = new TimedDomain_NameSpace();
        
        if(parent instanceof Package){
            proxy.setParent((Package) parent);
        }           
        MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
        
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
