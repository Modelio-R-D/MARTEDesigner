package org.modelio.module.marte.profile.hwdevice.command.explorer;

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
import org.modelio.module.marte.profile.hwdevice.model.HwSupport_Class;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("5e38eb29-0413-4019-ac11-4f2471680c3e")
public class HwSupport_ClassCommand extends DefaultModuleCommandHandler {
    @objid ("7407a1e8-3c25-4d1a-981a-b39798a970e0")
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

    @objid ("ed465358-fff1-44f2-94f5-ae0404d0bf7d")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("HwSupport_ClassCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            HwSupport_Class proxy = new HwSupport_Class();
        if(parent instanceof ModelTree){
            proxy.setParent((ModelTree) parent);
        }
        if(parent instanceof TemplateParameter){
            proxy.setParent((TemplateParameter) parent);
        }  MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
                 
            
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
