package org.modelio.module.marte.profile.sw_resourcecore.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.sw_resourcecore.model.SwAccessService_Collaboration;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("8ee33db9-80db-4396-9b03-b33bf44b53bc")
public class SwAccessService_CollaborationCommand extends DefaultModuleCommandHandler {
    @objid ("4de57ed6-4963-416f-b2a9-3775f2e12547")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
            
            /* Audit constraints adding */
            if (element instanceof Enumeration) { return false; }
            
            if(element instanceof TemplateParameter){       return true;    }  
         if(element instanceof ModelTree){       return true;    }  
         if(element instanceof Operation){       return true;    }  
        }
        return false;
    }

    @objid ("8096fb34-e300-4ceb-9240-aca0877e9313")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("SwAccessService_CollaborationCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            SwAccessService_Collaboration proxy = new SwAccessService_Collaboration();
        
        if(parent instanceof ModelTree){
            proxy.setParent((ModelTree) parent);
        }     
        
        if(parent instanceof Operation){
            proxy.setParent((Operation) parent);
        } 
        MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
         
            
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
