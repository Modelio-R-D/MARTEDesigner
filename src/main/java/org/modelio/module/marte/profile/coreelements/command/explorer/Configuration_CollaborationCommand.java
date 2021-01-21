package org.modelio.module.marte.profile.coreelements.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.coreelements.model.Configuration_Collaboration;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("51e112cd-f62d-490e-aeda-fa5756324e70")
public class Configuration_CollaborationCommand extends DefaultModuleCommandHandler {
    @objid ("4e3f8165-d595-47f0-81b3-7fb54e074706")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
        
            /* Audit constraints adding */
            if (element instanceof Enumeration || element instanceof Class || element instanceof Node || element instanceof Collaboration) {
                return false;
            }
            if(element instanceof ModelTree){       return true;    }
            if(element instanceof TemplateParameter){       return true;    }
        }
        return false;
    }

    @objid ("b834d257-355a-439d-bd9b-39af29416596")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("Configuration_CollaborationCommand")){
            ModelElement parent = (ModelElement)selected_element.get(0);
            Configuration_Collaboration proxy = new Configuration_Collaboration();
        
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
