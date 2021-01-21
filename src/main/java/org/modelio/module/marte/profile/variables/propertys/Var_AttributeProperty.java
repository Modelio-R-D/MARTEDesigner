package org.modelio.module.marte.profile.variables.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("64ebfd5d-af96-4be7-a0c7-8cb2813f6bc2")
public class Var_AttributeProperty implements IPropertyContent {
    @objid ("0a6668d3-2d01-4c9a-b5db-c8fe751cb5d4")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.VAR_ATTRIBUTE_VAR_ATTRIBUTE_DIR, value);
        }
    }

    @objid ("75f96e8f-0b58-4cd1-abac-c7bbf01bb6ce")
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
