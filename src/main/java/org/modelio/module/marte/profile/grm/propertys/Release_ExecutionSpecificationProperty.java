package org.modelio.module.marte.profile.grm.propertys;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Release_ExecutionSpecificationProperty implements IPropertyContent {
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GRSERVICE_EXECUTIONSPECIFICATION_GRSERVICE_EXECUTIONSPECIFICATION_OWNER, value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        //Gr Services
        //
        String value_owner = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GRSERVICE_EXECUTIONSPECIFICATION_GRSERVICE_EXECUTIONSPECIFICATION_OWNER, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GRSERVICE_EXECUTIONSPECIFICATION_GRSERVICE_EXECUTIONSPECIFICATION_OWNER),value_owner);
    }

}
