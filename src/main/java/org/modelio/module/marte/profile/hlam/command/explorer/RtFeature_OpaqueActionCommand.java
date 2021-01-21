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
import org.modelio.module.marte.profile.hlam.model.RtFeature_OpaqueAction;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("883cc91f-b141-45af-9a87-d2725a533b71")
public class RtFeature_OpaqueActionCommand extends DefaultModuleCommandHandler {
    @objid ("5e68906c-f135-4706-9519-349fff8bc863")
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

    @objid ("8b9c8008-0275-485f-ae80-8b7c44b5f530")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("RtFeature_OpaqueActionCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            RtFeature_OpaqueAction proxy = new RtFeature_OpaqueAction();
        
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