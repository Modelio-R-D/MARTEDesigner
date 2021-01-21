package org.modelio.module.marte.profile.rsm.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.rsm.model.Tiler_ConnectorEnd;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("b1491af9-b87b-4a4f-bbae-8cb27c00ea62")
public class Tiler_ConnectorEndCommand extends DefaultModuleCommandHandler {
    @objid ("ee80ca0a-f87c-42d2-ad36-a98a3bc5fb6d")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
            
         if(element instanceof Link){       return true;    }  
         if(element instanceof TemplateParameter){       return true;    }  
        }
        return false;
    }

    @objid ("9290f0a4-ea28-4b4d-89a0-bae6c402546b")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("Tiler_ConnectorEndCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            Tiler_ConnectorEnd proxy = new Tiler_ConnectorEnd();
        
        if(parent instanceof Link){
            proxy.setParent((Link) parent);
        }
        if(parent instanceof TemplateParameter){
            proxy.setParent((TemplateParameter) parent);
        }           
            
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
