package org.modelio.module.marte.profile.hwcommunication.command.explorer;

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
import org.modelio.module.marte.profile.hwcommunication.model.HwEndPoint_Lifeline;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("818f7148-039e-4c7f-861b-8dbdfe11a1c2")
public class HwEndPoint_LifelineCommand extends DefaultModuleCommandHandler {
    @objid ("c66396a1-1901-4b07-ae5f-8e288b29ba84")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0); /* Audit constraints adding */ if (element instanceof Enumeration) { return false; }
        
            if(element instanceof TemplateParameter){       return false;    } 
         if(element instanceof Interaction){       return true;    }    
        }
        return false;
    }

    @objid ("e7d5c7f2-3ff3-4592-b251-9dd8dbebc744")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("HwEndPoint_LifelineCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            HwEndPoint_Lifeline proxy = new HwEndPoint_Lifeline();
        
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
