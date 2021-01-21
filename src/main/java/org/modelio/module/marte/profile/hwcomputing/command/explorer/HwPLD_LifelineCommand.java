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
import org.modelio.module.marte.profile.hwcomputing.model.HwPLD_Lifeline;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("37d6b28e-9d79-436b-b7a7-c2a6dd721178")
public class HwPLD_LifelineCommand extends DefaultModuleCommandHandler {
    @objid ("e7483649-1c24-4a53-b52e-8bc51e9bd764")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0); /* Audit constraints adding */ if (element instanceof Enumeration) { return false; }
            
            if(element instanceof TemplateParameter){       return false;    }  
            if(element instanceof Interaction){       return true;    }    
        }
        return false;
    }

    @objid ("df2cf92f-d81f-440b-bb7e-2706c30ea018")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("HwPLD_LifelineCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            HwPLD_Lifeline proxy = new HwPLD_Lifeline();
        
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
