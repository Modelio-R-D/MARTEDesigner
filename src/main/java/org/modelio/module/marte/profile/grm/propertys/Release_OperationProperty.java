package org.modelio.module.marte.profile.grm.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("f8f6fe8d-956f-4ed2-810b-8ce4c7f6ba0d")
public class Release_OperationProperty implements IPropertyContent {
    @objid ("40f4d1c4-dcd0-4c53-b883-f07d4be1245e")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GRSERVICE_OPERATION_GRSERVICE_OPERATION_OWNER, value);
        }
    }

    @objid ("ea5b662c-7f8f-44b9-8608-47182069b771")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        //Gr Services
        //
        String value_owner = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GRSERVICE_OPERATION_GRSERVICE_OPERATION_OWNER, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GRSERVICE_OPERATION_GRSERVICE_OPERATION_OWNER),value_owner);
    }

}
