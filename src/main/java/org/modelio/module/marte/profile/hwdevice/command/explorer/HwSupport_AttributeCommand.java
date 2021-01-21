package org.modelio.module.marte.profile.hwdevice.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwdevice.model.HwSupport_Attribute;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("db2dfd12-4450-46d1-9cf7-68e024d3ad1b")
public class HwSupport_AttributeCommand extends DefaultModuleCommandHandler {
    @objid ("44666aa3-260f-45da-b4e6-bbcc1cc32747")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0); /* Audit constraints adding */ if (element instanceof Enumeration) { return false; }
        
            if(element instanceof TemplateParameter){       return false;    } 
         if(element instanceof AssociationEnd){       return true;    }  
         if(element instanceof Classifier){       return true;    }  
        }
        return false;
    }

    @objid ("aa999e31-bdf1-4552-b44c-efb681109625")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("HwSupport_AttributeCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            HwSupport_Attribute proxy = new HwSupport_Attribute();
        
        if(parent instanceof AssociationEnd){
            proxy.setParent((AssociationEnd) parent);
        }
        if(parent instanceof Classifier){
            proxy.setParent((Classifier) parent);
        }
        if(parent instanceof TemplateParameter){
            proxy.setParent((TemplateParameter) parent);
        }           
        MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
         
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
