package org.modelio.module.marte.profile.datatypes.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.datatypes.model.CollectionType_DataType;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("2d2fc4e1-b08a-48e5-b4f9-e37cfaa00c6d")
public class CollectionType_DataTypeCommand extends DefaultModuleCommandHandler {
    @objid ("7b9890a4-12ac-40f4-91c9-58fc805ed887")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            return true;
        }
        return false;
    }

    @objid ("56463160-91b8-4dde-b66e-5084751cb964")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("CollectionType_DataTypeCommand")){
            ModelElement parent = (ModelElement)selected_element.get(0);        
            CollectionType_DataType proxy = new CollectionType_DataType();
        
            if(parent instanceof Package){
                proxy.setParent((Package) parent);
            }       
            MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
        
            tr.commit();
              
        }
    }

}
