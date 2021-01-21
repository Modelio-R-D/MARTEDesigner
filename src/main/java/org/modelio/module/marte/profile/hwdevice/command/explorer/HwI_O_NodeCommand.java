package org.modelio.module.marte.profile.hwdevice.command.explorer;

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
import org.modelio.module.marte.profile.hwdevice.model.HwI_O_Node;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("58ac26d4-ae6d-448b-b686-0e2db39cd513")
public class HwI_O_NodeCommand extends DefaultModuleCommandHandler {
    @objid ("b143618d-cb84-4aff-806a-17be3e01f157")
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

    @objid ("d93d76d2-a656-409f-a8cd-15193680117e")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("HwI_O_NodeCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            HwI_O_Node proxy = new HwI_O_Node();
        
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
