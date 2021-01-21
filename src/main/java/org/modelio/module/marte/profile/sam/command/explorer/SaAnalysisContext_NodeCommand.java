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
import org.modelio.module.marte.profile.sam.model.SaAnalysisContext_Node;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("0a154f5b-65b9-4682-8669-2668ca7c9b47")
public class SaAnalysisContext_NodeCommand extends DefaultModuleCommandHandler {
    @objid ("d2a9af14-2ecb-4c33-b1b4-7db27efd3d0b")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
            
         if(element instanceof ModelTree){       return true;    }  
         if(element instanceof TemplateParameter){       return true;    }  
        }
        return false;
    }

    @objid ("b0b0a261-7585-42b2-a30d-f0a25f7ef288")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("SaAnalysisContext_NodeCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            SaAnalysisContext_Node proxy = new SaAnalysisContext_Node();
        
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
