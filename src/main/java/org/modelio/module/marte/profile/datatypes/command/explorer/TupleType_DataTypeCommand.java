package org.modelio.module.marte.profile.datatypes.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.datatypes.model.TupleType_DataType;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("11387bd7-465d-4d9d-8beb-4b2a64e78b16")
public class TupleType_DataTypeCommand extends DefaultModuleCommandHandler {
    @objid ("a64664c2-2061-4f42-9657-5ce86e17ae97")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            return true;
        }
        return false;
    }

    @objid ("74d2d434-7af6-49e4-9239-d4624dbd5576")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try( ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("TupleType_DataTypeCommand")){
            
            ModelElement parent = (ModelElement)selected_element.get(0);        
            TupleType_DataType proxy = new TupleType_DataType();
        
            if(parent instanceof Package){
                proxy.setParent((Package) parent);
            }       
            MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
        
            tr.commit(); 
                
        }
    }

}
