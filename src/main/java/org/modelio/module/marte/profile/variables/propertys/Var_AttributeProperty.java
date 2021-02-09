package org.modelio.module.marte.profile.variables.propertys;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Var_AttributeProperty implements IPropertyContent {
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.VAR_ATTRIBUTE_VAR_ATTRIBUTE_DIR, value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Variables
        //
        String [] tab_VariableDirectionKind = MARTEEnumerationUtils.getVariableDirectionKind();
        String value_dir = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.VAR_ATTRIBUTE_VAR_ATTRIBUTE_DIR, elt);
        if(!(MARTEEnumerationUtils.isVariableDirectionKind(value_dir))){
            value_dir = "inout";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.VAR_ATTRIBUTE_VAR_ATTRIBUTE_DIR),value_dir, tab_VariableDirectionKind);
    }

}
