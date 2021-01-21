package org.modelio.module.marte.profile.coreelements.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.coreelements.model.ModeBehavior_StateMachine;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("6a279add-5202-4090-acad-71c7e3f22d93")
public class ModeBehavior_StateMachineCommand extends DefaultModuleCommandHandler {
    @objid ("1352c95c-bfeb-4fec-a6b5-34d7b40286c9")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0);
            /* Audit constraints adding */
            if (element instanceof Enumeration || element instanceof Node|| element instanceof Collaboration) {
                return false;
            }
            if(element instanceof NameSpace){       return true;    }
            if(element instanceof Operation){       return true;    }
            if(element instanceof TemplateParameter){       return true;    }
        }
        return false;
    }

    @objid ("22d797ef-568e-40a5-ae0a-6c45399824b4")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("ModeBehavior_StateMachineCommand")){
            ModelElement parent = (ModelElement)selected_element.get(0);
            ModeBehavior_StateMachine proxy = new ModeBehavior_StateMachine();
        
            if(parent instanceof NameSpace){
                proxy.setParent((NameSpace) parent);
            }
            if(parent instanceof Operation){
                proxy.setParent((Operation) parent);
            }
            if(parent instanceof TemplateParameter){
                proxy.setParent((TemplateParameter) parent);
            }
            MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
        
            tr.commit();
        
        }
    }

}
