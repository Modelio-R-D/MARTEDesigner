package org.modelio.module.marte.profile.grm.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionOperand;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.Release_ExecutionSpecification;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("8e176ab1-e942-4cbf-a7f8-1fda7280f905")
public class Release_ExecutionSpecificationCommand extends DefaultModuleCommandHandler {
    @objid ("915a5e45-f01c-4938-a71a-4a031ad78c7f")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0); /* Audit constraints adding */ if (element instanceof Enumeration) { return false; }
            
         if(element instanceof Interaction){       return true;    }  
         if(element instanceof InteractionOperand){       return true;    }  
         if(element instanceof TemplateParameter){       return true;    }  
        }
        return false;
    }

    @objid ("562a24f3-866c-469b-b667-dcc33d079980")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("Release_ExecutionSpecificationCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            Release_ExecutionSpecification proxy = new Release_ExecutionSpecification();
        
        if(parent instanceof Interaction){
            proxy.setParent((Interaction) parent);
        }
        if(parent instanceof InteractionOperand){
            proxy.setParent((InteractionOperand) parent);
        }
        if(parent instanceof TemplateParameter){
            proxy.setParent((TemplateParameter) parent);
        }           
            
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
