package org.modelio.module.marte.profile.datatypes.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.datatypes.model.BoundedSubtype_DataType;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("ff3357e5-e2ca-4069-a383-4353034476d1")
public class BoundedSubtype_DataTypeCommand extends DefaultModuleCommandHandler {
    @objid ("91870315-28f1-4d15-8743-c8085f812301")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            return true;
        }
        return false;
    }

    @objid ("d3c071c4-80e1-465a-ab23-ecd111916aa8")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(  ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("BoundedSubtype_DataTypeCommand");){
            ModelElement parent = (ModelElement)selected_element.get(0);
            BoundedSubtype_DataType proxy = new BoundedSubtype_DataType();
        
            if(parent instanceof Package){
                proxy.setParent((Package) parent);
            }
            MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
        
            tr.commit();
              
        }
    }

}
