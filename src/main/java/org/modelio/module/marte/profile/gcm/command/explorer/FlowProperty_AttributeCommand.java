package org.modelio.module.marte.profile.gcm.command.explorer;

import java.util.List;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.gcm.model.FlowProperty_Attribute;
import org.modelio.vcore.smkernel.mapi.MObject;

public class FlowProperty_AttributeCommand extends DefaultModuleCommandHandler {
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
        
            /* Audit constraints adding */
            if (element instanceof Enumeration) {
                return false;
            }
        
            if(element instanceof Classifier){
                return true;
            }  
        }
        return false;
    }

    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("FlowProperty_AttributeCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            FlowProperty_Attribute proxy = new FlowProperty_Attribute();
        
            if(parent instanceof Classifier){
                proxy.setParent((Classifier) parent);
            }     
            MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
        
            tr.commit();
        
            
        
            
                
        }
    }

}
