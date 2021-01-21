package org.modelio.module.marte.profile.gcm.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.gcm.model.FlowProperty_Attribute;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("d68aeb12-abcd-4fe2-b6ae-a8c844f7f6b7")
public class FlowProperty_AttributeCommand extends DefaultModuleCommandHandler {
    @objid ("6241824c-cd23-4ac1-9a43-0a03304dabcc")
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

    @objid ("9af36e16-74bf-4921-9feb-6b4249821442")
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
