package org.modelio.module.marte.profile.hwpower.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("725bc677-a8f2-4313-943b-5dc83a4a4006")
public class HwPowerSupply_AttributeProperty implements IPropertyContent {
    @objid ("38a4e1e4-f3eb-4d5e-8457-bc048abc3015")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPOWERSUPPLY_ATTRIBUTE_HWPOWERSUPPLY_ATTRIBUTE_SUPPLIEDPOWER, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPOWERSUPPLY_ATTRIBUTE_HWPOWERSUPPLY_ATTRIBUTE_CAPACITY, value);
        }
    }

    @objid ("5352200a-6fe8-4cbc-9eb7-7fb9600e28a6")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Power Supply
        //
        String value_suppliedPower = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPOWERSUPPLY_ATTRIBUTE_HWPOWERSUPPLY_ATTRIBUTE_SUPPLIEDPOWER, elt);
        if(value_suppliedPower.equals("")){
            value_suppliedPower = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPOWERSUPPLY_ATTRIBUTE_HWPOWERSUPPLY_ATTRIBUTE_SUPPLIEDPOWER),value_suppliedPower);
        String value_capacity = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPOWERSUPPLY_ATTRIBUTE_HWPOWERSUPPLY_ATTRIBUTE_CAPACITY, elt);
        if(value_capacity.equals("")){
            value_capacity = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPOWERSUPPLY_ATTRIBUTE_HWPOWERSUPPLY_ATTRIBUTE_CAPACITY),value_capacity);
    }

}
