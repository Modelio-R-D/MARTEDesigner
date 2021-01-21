package org.modelio.module.marte.profile.rsm.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("9abb5f89-7cf4-4017-a6f9-2d3458e42d30")
public class Shaped_ConnectorEndProperty implements IPropertyContent {
    @objid ("047c84d7-b5a6-4217-a8a9-abcc55d1321b")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt,MARTEDesignerTagTypes.SHAPED_CONNECTOREND_SHAPED_CONNECTOREND_SHAPE, value);
        }
    }

    @objid ("a1879961-06ae-42c1-a42e-57f087064961")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_shape = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SHAPED_CONNECTOREND_SHAPED_CONNECTOREND_SHAPE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SHAPED_CONNECTOREND_SHAPED_CONNECTOREND_SHAPE),value_shape);
    }

}
