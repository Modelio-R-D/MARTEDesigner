package org.modelio.module.marte.profile.rsm.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("cc49d3f5-1f77-4185-abd0-25e534bea181")
public class Shaped_AttributeProperty implements IPropertyContent {
    @objid ("f6568618-4320-4b91-b558-edea4a80b81a")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt,MARTEDesignerTagTypes.SHAPED_ATTRIBUTE_SHAPED_ATTRIBUTE_SHAPE, value);
        }
    }

    @objid ("32cc6642-093b-4df2-9c44-347885b50106")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_shape = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SHAPED_ATTRIBUTE_SHAPED_ATTRIBUTE_SHAPE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SHAPED_ATTRIBUTE_SHAPED_ATTRIBUTE_SHAPE),value_shape);
    }

}
