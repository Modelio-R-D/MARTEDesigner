package org.modelio.module.marte.profile.sam.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.sam.model.SaAnalysisContext_Class;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("fe874e49-f037-46e5-8f7c-17f3b066ec6f")
public class SaAnalysisContext_ClassCommand extends DefaultModuleCommandHandler {
    @objid ("be059199-c7ff-4a2f-b4dd-645fca405470")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
            
        
         if(element instanceof ModelTree){       return true;    }  
         if(element instanceof TemplateParameter){       return true;    }  
        }
        return false;
    }

    @objid ("c7b5868c-449c-409e-8780-6a3be21bbaed")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("SaAnalysisContext_ClassCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            SaAnalysisContext_Class proxy = new SaAnalysisContext_Class();
        
        
        if(parent instanceof ModelTree){
            proxy.setParent((ModelTree) parent);
        }
        if(parent instanceof TemplateParameter){
            proxy.setParent((TemplateParameter) parent);
        }           
            
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
