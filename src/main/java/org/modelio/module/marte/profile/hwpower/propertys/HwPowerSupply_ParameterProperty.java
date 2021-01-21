package org.modelio.module.marte.profile.hwpower.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("90760275-095e-4ebc-8d8b-afd59da25c5e")
public class HwPowerSupply_ParameterProperty implements IPropertyContent {
    @objid ("1c537002-6fd0-4992-8866-f99c3a866510")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPOWERSUPPLY_PARAMETER_HWPOWERSUPPLY_PARAMETER_SUPPLIEDPOWER, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPOWERSUPPLY_PARAMETER_HWPOWERSUPPLY_PARAMETER_CAPACITY, value);
        }
    }

    @objid ("baf01937-d761-4e89-9172-a28c8708d59f")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Power Supply
        //
        String value_suppliedPower = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPOWERSUPPLY_PARAMETER_HWPOWERSUPPLY_PARAMETER_SUPPLIEDPOWER, elt);
        if(value_suppliedPower.equals("")){
            value_suppliedPower = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPOWERSUPPLY_PARAMETER_HWPOWERSUPPLY_PARAMETER_SUPPLIEDPOWER),value_suppliedPower);
        String value_capacity = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPOWERSUPPLY_PARAMETER_HWPOWERSUPPLY_PARAMETER_CAPACITY, elt);
        if(value_capacity.equals("")){
            value_capacity = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPOWERSUPPLY_PARAMETER_HWPOWERSUPPLY_PARAMETER_CAPACITY),value_capacity);
    }

}
