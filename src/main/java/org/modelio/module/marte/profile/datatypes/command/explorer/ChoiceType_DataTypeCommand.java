package org.modelio.module.marte.profile.datatypes.command.explorer;

import java.util.List;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.datatypes.model.ChoiceType_DataType;
import org.modelio.vcore.smkernel.mapi.MObject;

public class ChoiceType_DataTypeCommand extends DefaultModuleCommandHandler {
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            return true;
        }
        return false;
    }

    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try ( ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("ChoiceType_DataTypeCommand")){
            ModelElement parent = (ModelElement)selected_element.get(0);        
            ChoiceType_DataType proxy = new ChoiceType_DataType();
        
            if(parent instanceof Package){
                proxy.setParent((Package) parent);
            }    
            MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
        
            tr.commit();
        
        }
    }

}
