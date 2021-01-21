package org.modelio.module.marte.profile.rsm.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("3d9104bb-2c2c-4ca1-bde9-8ad103ba3a62")
public class Shaped_AssociationEndProperty implements IPropertyContent {
    @objid ("0657945d-4caa-40be-9438-411124647e4e")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt,MARTEDesignerTagTypes.SHAPED_ASSOCIATIONEND_SHAPED_ASSOCIATIONEND_SHAPE, value);
        }
    }

    @objid ("cbc4ccb1-d1eb-4570-8541-588df34a2bee")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_shape = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SHAPED_ASSOCIATIONEND_SHAPED_ASSOCIATIONEND_SHAPE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SHAPED_ASSOCIATIONEND_SHAPED_ASSOCIATIONEND_SHAPE),value_shape);
    }

}
