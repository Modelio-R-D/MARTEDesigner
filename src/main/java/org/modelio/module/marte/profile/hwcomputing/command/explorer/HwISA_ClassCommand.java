package org.modelio.module.marte.profile.hwcomputing.command.explorer;

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
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwcomputing.model.HwISA_Class;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("2260f115-937b-4bb2-97e1-67f852c7d145")
public class HwISA_ClassCommand extends DefaultModuleCommandHandler {
    @objid ("55c24985-c9f0-4a74-87f2-2d9b3d79677c")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0); 
            /* Audit constraints adding */ 
            if (element instanceof Enumeration || element instanceof Node || element instanceof Collaboration || element instanceof Actor || element instanceof UseCase || element instanceof Signal) { 
                return false; 
                }
            
            if(element instanceof TemplateParameter){       return false;    }  
         if(element instanceof ModelTree){       return true;    }   
        }
        return false;
    }

    @objid ("f414d0c7-1369-40e4-800c-6d25ff28ec8e")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("HwISA_ClassCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            HwISA_Class proxy = new HwISA_Class();
        
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
