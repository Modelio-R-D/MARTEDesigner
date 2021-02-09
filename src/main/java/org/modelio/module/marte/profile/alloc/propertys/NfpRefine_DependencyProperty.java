package org.modelio.module.marte.profile.alloc.propertys;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class NfpRefine_DependencyProperty implements IPropertyContent {
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.NFPREFINE_DEPENDENCY_NFPREFINE_DEPENDENCY_CONSTRAINT, value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_constraint = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NFPREFINE_DEPENDENCY_NFPREFINE_DEPENDENCY_CONSTRAINT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.NFPREFINE_DEPENDENCY_NFPREFINE_DEPENDENCY_CONSTRAINT),value_constraint);
    }

}
