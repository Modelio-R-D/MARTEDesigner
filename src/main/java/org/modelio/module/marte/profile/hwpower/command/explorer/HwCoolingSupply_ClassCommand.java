package org.modelio.module.marte.profile.hwpower.command.explorer;

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
import org.modelio.module.marte.profile.hwpower.model.HwCoolingSupply_Class;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("0be28c2b-b690-4994-8134-3e743c3e7044")
public class HwCoolingSupply_ClassCommand extends DefaultModuleCommandHandler {
    @objid ("6a71c2be-201c-4285-a9f5-233bf17216e4")
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

    @objid ("635a9722-5cbd-491c-b4b4-4c56378dc498")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("HwCoolingSupply_ClassCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            HwCoolingSupply_Class proxy = new HwCoolingSupply_Class();
        
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
