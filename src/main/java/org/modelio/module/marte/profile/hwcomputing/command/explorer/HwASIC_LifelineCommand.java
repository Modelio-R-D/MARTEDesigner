package org.modelio.module.marte.profile.hwcomputing.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwcomputing.model.HwASIC_Lifeline;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("c16edfd3-dcf8-43aa-ac5b-2069d9dacfb0")
public class HwASIC_LifelineCommand extends DefaultModuleCommandHandler {
    @objid ("fdc8dc12-fce1-415f-9b1e-29d2d6a99ddf")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0); /* Audit constraints adding */ if (element instanceof Enumeration) { return false; }
            if(element instanceof TemplateParameter){       return false;    }  
         if(element instanceof Interaction){       return true;    }    
        }
        return false;
    }

    @objid ("c5fa6d88-2fcc-41cf-bb55-b9d078abbf47")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("HwASIC_LifelineCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            HwASIC_Lifeline proxy = new HwASIC_Lifeline();
        
        if(parent instanceof Interaction){
            proxy.setParent((Interaction) parent);
        }
        if(parent instanceof TemplateParameter){
            proxy.setParent((TemplateParameter) parent);
        }           
        MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
         
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
