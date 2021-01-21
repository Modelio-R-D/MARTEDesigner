package org.modelio.module.marte.profile.hwpower.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("4307d223-1b72-4b29-9eea-1ef3b1392096")
public class HwPowerSupply_InstanceProperty implements IPropertyContent {
    @objid ("44ede795-02af-4c31-9d3b-a85daface0a4")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPOWERSUPPLY_INSTANCE_HWPOWERSUPPLY_INSTANCE_SUPPLIEDPOWER, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPOWERSUPPLY_INSTANCE_HWPOWERSUPPLY_INSTANCE_CAPACITY, value);
        }
    }

    @objid ("feb7d29a-8a23-45a2-9368-27932d5b1f4f")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Power Supply
        //
        String value_suppliedPower = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPOWERSUPPLY_INSTANCE_HWPOWERSUPPLY_INSTANCE_SUPPLIEDPOWER, elt);
        if(value_suppliedPower.equals("")){
            value_suppliedPower = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPOWERSUPPLY_INSTANCE_HWPOWERSUPPLY_INSTANCE_SUPPLIEDPOWER),value_suppliedPower);
        String value_capacity = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPOWERSUPPLY_INSTANCE_HWPOWERSUPPLY_INSTANCE_CAPACITY, elt);
        if(value_capacity.equals("")){
            value_capacity = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPOWERSUPPLY_INSTANCE_HWPOWERSUPPLY_INSTANCE_CAPACITY),value_capacity);
    }

}
