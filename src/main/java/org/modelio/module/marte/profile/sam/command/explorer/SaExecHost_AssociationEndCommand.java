package org.modelio.module.marte.profile.sam.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.sam.model.SaExecHost_AssociationEnd;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("5bed807b-178b-4998-9a4d-d78d0247de3c")
public class SaExecHost_AssociationEndCommand extends DefaultModuleCommandHandler {
    @objid ("27b78de9-dcf0-4f3c-947a-1fe3cbc168ba")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
            
         if(element instanceof Classifier){       return true;    }  
         if(element instanceof TemplateParameter){       return true;    }  
        }
        return false;
    }

    @objid ("929eb05a-1601-4fda-81e9-8d4d02824500")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("SaExecHost_AssociationEndCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            SaExecHost_AssociationEnd proxy = new SaExecHost_AssociationEnd();
              
            
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
