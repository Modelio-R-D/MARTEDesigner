package org.modelio.module.marte.profile.grm.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("6bb8d577-7332-449f-867f-8a33178c1667")
public class Release_ExecutionSpecificationProperty implements IPropertyContent {
    @objid ("225a90f9-7ec0-423e-9444-c01035f8757b")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GRSERVICE_EXECUTIONSPECIFICATION_GRSERVICE_EXECUTIONSPECIFICATION_OWNER, value);
        }
    }

    @objid ("497c4dfd-560c-4fbc-a930-ad6727d565d0")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        //Gr Services
        //
        String value_owner = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GRSERVICE_EXECUTIONSPECIFICATION_GRSERVICE_EXECUTIONSPECIFICATION_OWNER, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GRSERVICE_EXECUTIONSPECIFICATION_GRSERVICE_EXECUTIONSPECIFICATION_OWNER),value_owner);
    }

}
