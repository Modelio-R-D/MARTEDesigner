package org.modelio.module.marte.profile.hlam.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.behavior.activityModel.Activity;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityPartition;
import org.modelio.metamodel.uml.behavior.activityModel.Clause;
import org.modelio.metamodel.uml.behavior.activityModel.StructuredActivityNode;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hlam.model.RtAction_SendSignalAction;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("1a720bde-958b-48e3-b536-a50756357a0e")
public class RtAction_SendSignalActionCommand extends DefaultModuleCommandHandler {
    @objid ("a68536e9-56cb-48ba-8c27-d9a86a766e3a")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0); /* Audit constraints adding */ if (element instanceof Enumeration) { return false; }
            
         if(element instanceof Activity){       return true;    }  
         if(element instanceof Clause){       return true;    }  
         if(element instanceof StructuredActivityNode){       return true;    }  
         if(element instanceof ActivityPartition){       return true;    }  
         if(element instanceof TemplateParameter){       return true;    }  
        }
        return false;
    }

    @objid ("574ab9d3-3ef5-43bb-b245-ad15d78d9c29")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("RtAction_SendSignalActionCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            RtAction_SendSignalAction proxy = new RtAction_SendSignalAction();
        
        if(parent instanceof Activity){
            proxy.setParent((Activity) parent);
        }
        if(parent instanceof Clause){
            proxy.setParent((Clause) parent);
        }
        if(parent instanceof StructuredActivityNode){
            proxy.setParent((StructuredActivityNode) parent);
        }
        if(parent instanceof ActivityPartition){
            proxy.setParent((ActivityPartition) parent);
        }
        if(parent instanceof TemplateParameter){
            proxy.setParent((TemplateParameter) parent);
        }      
        MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
                 
            
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
