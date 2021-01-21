package org.modelio.module.marte.profile.grm.command.explorer;

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
import org.modelio.module.marte.profile.grm.model.TimingResource_Class;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("9c0e1e6c-4e44-46c8-8d24-f7da1b77d27f")
public class TimingResource_ClassCommand extends DefaultModuleCommandHandler {
    @objid ("76ebbabe-9168-4bde-8138-09553c7a67fe")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0); 
            /* Audit constraints adding */ 
            if (element instanceof Enumeration || element instanceof Node || element instanceof Collaboration || element instanceof Actor || element instanceof UseCase || element instanceof Signal) { 
                return false; 
            }
        
         if(element instanceof ModelTree){       return true;    }  
         if(element instanceof TemplateParameter){       return true;    }  
        }
        return false;
    }

    @objid ("a2b514bb-e2ce-44a7-a659-9f333a4bca33")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("TimingResource_ClassCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            TimingResource_Class proxy = new TimingResource_Class();
        
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
