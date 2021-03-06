package org.modelio.module.marte.profile.hlam.command.explorer;

import java.util.List;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hlam.model.RtSpecification_Note;
import org.modelio.vcore.smkernel.mapi.MObject;

public class RtSpecification_NoteCommand extends DefaultModuleCommandHandler {
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0); /* Audit constraints adding */
            if (element instanceof Enumeration) { 
                return false; 
            }
            return true;    
        }
        return false;
    }

    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("RtSpecification_NoteCommand")){
        
            ModelElement parent = (ModelElement) selected_element.get(0);        
            RtSpecification_Note proxy = new RtSpecification_Note();
        
            proxy.setParent(parent);
        
            tr.commit();
        
        }
    }

}
