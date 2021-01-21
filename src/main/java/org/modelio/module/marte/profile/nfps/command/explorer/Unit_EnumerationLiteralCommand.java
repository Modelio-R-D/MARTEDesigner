package org.modelio.module.marte.profile.nfps.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.nfps.model.Unit_EnumerationLiteral;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("b3f66171-4ff1-4f21-bbd4-4d2caee85c98")
public class Unit_EnumerationLiteralCommand extends DefaultModuleCommandHandler {
    @objid ("91a6b09a-033c-495c-aef6-7934975a7b41")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
            
         if(element instanceof Enumeration){       return true;    }  
        }
        return false;
    }

    @objid ("def2283f-b855-4cf8-bfce-dc98f14fd070")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("Unit_EnumerationLiteralCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            Unit_EnumerationLiteral proxy = new Unit_EnumerationLiteral();
        
        if(parent instanceof Enumeration){
            proxy.setParent((Enumeration) parent);
        }
        if(parent instanceof TemplateParameter){
            proxy.setParent((TemplateParameter) parent);
        }           
            
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
