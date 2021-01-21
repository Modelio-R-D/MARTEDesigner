package org.modelio.module.marte.profile.hwmemory.command.explorer;

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
import org.modelio.module.marte.profile.hwmemory.model.HwDrive_Node;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("75133a5d-1e84-4c20-8634-c283e5c3d019")
public class HwDrive_NodeCommand extends DefaultModuleCommandHandler {
    @objid ("1d1b2958-44fd-4c79-a417-5daa9843a697")
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

    @objid ("a447d54a-4966-40cc-a708-0b68ef5c2a72")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("HwDrive_NodeCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            HwDrive_Node proxy = new HwDrive_Node();
        
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
