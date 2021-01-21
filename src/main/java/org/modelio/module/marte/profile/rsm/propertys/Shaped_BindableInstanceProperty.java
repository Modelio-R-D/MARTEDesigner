package org.modelio.module.marte.profile.rsm.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("687232f7-6aeb-4367-bdbe-c474d3f5b908")
public class Shaped_BindableInstanceProperty implements IPropertyContent {
    @objid ("ff77b60b-6861-4ac4-845b-4b48c3b9892c")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt,MARTEDesignerTagTypes.SHAPED_BINDABLEINSTANCE_SHAPED_BINDABLEINSTANCE_SHAPE, value);
        }
    }

    @objid ("ae0a0674-da3a-4182-94f9-cb8c3a83a637")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_shape = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SHAPED_BINDABLEINSTANCE_SHAPED_BINDABLEINSTANCE_SHAPE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SHAPED_BINDABLEINSTANCE_SHAPED_BINDABLEINSTANCE_SHAPE),value_shape);
    }

}
