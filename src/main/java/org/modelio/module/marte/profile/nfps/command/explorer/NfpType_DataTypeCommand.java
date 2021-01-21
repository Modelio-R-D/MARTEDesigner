package org.modelio.module.marte.profile.nfps.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.nfps.model.NfpType_DataType;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("7e622f4f-65a8-4e86-a062-1c2387a46f9d")
public class NfpType_DataTypeCommand extends DefaultModuleCommandHandler {
    @objid ("003d0938-0809-40b4-9cea-6d81b3655632")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0); 
            /* Audit constraints adding */ 
            if (element instanceof Enumeration) { return false; }
        
            return true;
        
        }
        return false;
    }

    @objid ("68cd3a6c-db8a-4be6-8255-54cf011bffa7")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("NfpType_DataTypeCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            NfpType_DataType proxy = new NfpType_DataType();
        
            if(parent instanceof Package){
                proxy.setParent((Package) parent);
            }           
            MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
            
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
