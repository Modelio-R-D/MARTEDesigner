package org.modelio.module.marte.profile.time.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.time.model.TimedValueSpecification_TaggedValue;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("09c0cc55-7804-445e-875e-865116411fe9")
public class TimedValueSpecification_TaggedValueCommand extends DefaultModuleCommandHandler {
    @objid ("e5c629e8-0445-4ec7-ae09-f37391dbf101")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0); /* Audit constraints adding */ if (element instanceof Enumeration) { return false; }
            
         if(element instanceof ModelElement){       return true;    }  
         if(element instanceof TemplateParameter){       return true;    }  
        }
        return false;
    }

    @objid ("6de87358-0f35-4348-b077-c5060056b50c")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("TimedValueSpecification_TaggedValueCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            TimedValueSpecification_TaggedValue proxy = new TimedValueSpecification_TaggedValue();
        
        if(parent instanceof ModelElement){
            proxy.setParent((ModelElement) parent);
        }
        if(parent instanceof TemplateParameter){
            proxy.setParent((TemplateParameter) parent);
        }           
            
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
