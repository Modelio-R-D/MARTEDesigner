package org.modelio.module.marte.profile.sw_resourcecore.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.sw_resourcecore.model.SwAccessService_Collaboration;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("1a52086e-e519-41fc-8505-cd8845477b31")
public class SwAccessService_CollaborationUseCommand extends DefaultModuleCommandHandler {
    @objid ("d87b9f66-8920-4cc4-bdd7-0e0ea1677fed")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
            
            /* Audit constraints adding */ 
            
            if (element instanceof Enumeration) { return false; }
            
            if(element instanceof TemplateParameter){       return false;    }  
         if(element instanceof ModelTree){       return true;    }  
         if(element instanceof Operation){       return true;    }  
        }
        return false;
    }

    @objid ("4c4aafc6-701d-4f2d-8238-e3211845f015")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("SwAccessService_CollaborationUseCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            SwAccessService_Collaboration proxy = new SwAccessService_Collaboration();
        
        if(parent instanceof NameSpace){
            proxy.setParent((NameSpace) parent);
        }     
        MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
        
            
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
