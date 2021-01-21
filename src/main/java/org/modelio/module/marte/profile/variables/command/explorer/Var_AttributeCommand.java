package org.modelio.module.marte.profile.variables.command.explorer;

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
import org.modelio.module.marte.profile.variables.model.Var_Attribute;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("cf5595c3-7a30-4568-9537-48f25700b8b8")
public class Var_AttributeCommand extends DefaultModuleCommandHandler {
    @objid ("3b238883-7678-4b22-bf15-25c4d215ee17")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
            /* Audit constraints adding */
            if (element instanceof Enumeration) { return false; }
            if(element instanceof AssociationEnd){       return true;    }
            if(element instanceof Classifier){       return true;    }
            if(element instanceof TemplateParameter){       return true;    }
        }
        return false;
    }

    @objid ("45032906-4afe-4972-bf08-c2570847ea08")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("Var_AttributeCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);
            Var_Attribute proxy = new Var_Attribute();
        
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
