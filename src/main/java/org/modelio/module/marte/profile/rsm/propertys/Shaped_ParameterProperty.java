package org.modelio.module.marte.profile.rsm.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("2e8d634b-56f1-4fdd-a6f0-d0380c1ca5c0")
public class Shaped_ParameterProperty implements IPropertyContent {
    @objid ("793ba420-fb90-4ac8-b449-0818a978d845")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt,MARTEDesignerTagTypes.SHAPED_PARAMETER_SHAPED_PARAMETER_SHAPE, value);
        }
    }

    @objid ("398eecf9-9f3a-4823-ac4e-1a15197f8962")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_shape = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SHAPED_PARAMETER_SHAPED_PARAMETER_SHAPE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SHAPED_PARAMETER_SHAPED_PARAMETER_SHAPE),value_shape);
    }

}
