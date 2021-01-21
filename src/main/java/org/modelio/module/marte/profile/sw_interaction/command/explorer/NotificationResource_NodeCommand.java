package org.modelio.module.marte.profile.sw_interaction.command.explorer;

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
import org.modelio.module.marte.profile.sw_interaction.model.NotificationResource_Node;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("40bb22cb-ee6c-4933-9ba8-6389684fd446")
public class NotificationResource_NodeCommand extends DefaultModuleCommandHandler {
    @objid ("5870f3e1-19dc-4fe9-ae4a-203b36566dad")
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

    @objid ("aaa4bef9-9d94-4b9d-ac51-4c1bbf2bfb4b")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("NotificationResource_NodeCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            NotificationResource_Node proxy = new NotificationResource_Node();
        
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
