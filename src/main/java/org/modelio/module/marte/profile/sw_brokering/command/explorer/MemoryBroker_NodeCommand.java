package org.modelio.module.marte.profile.sw_brokering.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.usecaseModel.Actor;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.sw_brokering.model.MemoryBroker_Node;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("ca5c8d23-6da6-4810-adf9-693a90aebd64")
public class MemoryBroker_NodeCommand extends DefaultModuleCommandHandler {
    @objid ("f89fc611-d927-4915-910a-dae08c395e94")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
        /* Audit constraints adding */ 
            if (element instanceof Enumeration || element instanceof Class || element instanceof Collaboration || element instanceof Actor || element instanceof UseCase || element instanceof Signal || element instanceof Interface || element instanceof Enumeration) { 
                return false; 
            }
        
        
            if(element instanceof TemplateParameter){       return false;    }  
         if(element instanceof ModelTree){       return true;    }  
        }
        return false;
    }

    @objid ("7c585def-3f7e-47d6-bfd4-ef19bc781564")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("MemoryBroker_NodeCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            MemoryBroker_Node proxy = new MemoryBroker_Node();
        
        if(parent instanceof ModelTree){
            proxy.setParent((ModelTree) parent);
        }
        if(parent instanceof TemplateParameter){
            proxy.setParent((TemplateParameter) parent);
        }           
        MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
          
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
