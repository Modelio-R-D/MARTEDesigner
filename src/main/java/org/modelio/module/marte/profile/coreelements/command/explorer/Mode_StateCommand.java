package org.modelio.module.marte.profile.coreelements.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.coreelements.model.Mode_State;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("8e8f6190-6ee1-4506-bb4b-f5de521e5cc8")
public class Mode_StateCommand extends DefaultModuleCommandHandler {
    @objid ("45af9fab-dd41-42fa-bdd3-693dd9ad931d")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0){
            ModelElement element = (ModelElement)selected_element.get(0);
            /* Audit constraints adding */
            if (element instanceof Enumeration) {
                return false;
            }
            if(element instanceof StateMachine){       return true;    }
            if(element instanceof TemplateParameter){       return true;    }
        }
        return false;
    }

    @objid ("d3c0aa90-d837-4fd5-9877-707b09f20e0e")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("Mode_StateCommand")){
            ModelElement parent = (ModelElement)selected_element.get(0);
            Mode_State proxy = new Mode_State();
        
            if(parent instanceof StateMachine){
                proxy.setParent((StateMachine) parent);
            }
            if(parent instanceof TemplateParameter){
                proxy.setParent((TemplateParameter) parent);
            }
        
            MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
        
            tr.commit();
        
        }
    }

}
