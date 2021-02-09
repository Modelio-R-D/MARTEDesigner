package org.modelio.module.marte.profile.time.command.explorer;

import java.util.List;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.time.model.TimedDomain_NameSpace;
import org.modelio.vcore.smkernel.mapi.MObject;

public class TimedDomain_NameSpaceCommand extends DefaultModuleCommandHandler {
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
