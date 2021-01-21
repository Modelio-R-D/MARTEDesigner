package org.modelio.module.marte.profile.hwpower.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("0a31e796-5f49-4988-987b-498b9b5a4ff9")
public class HwPowerSupply_AssociationEndProperty implements IPropertyContent {
    @objid ("450526a1-724f-41dc-a362-62a5d0b07129")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPOWERSUPPLY_ASSOCIATIONEND_HWPOWERSUPPLY_ASSOCIATIONEND_SUPPLIEDPOWER, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPOWERSUPPLY_ASSOCIATIONEND_HWPOWERSUPPLY_ASSOCIATIONEND_CAPACITY, value);
        }
    }

    @objid ("ec39eb2e-ee71-4381-a715-832ae0e8b3e2")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Power Supply
        //
        String value_suppliedPower = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPOWERSUPPLY_ASSOCIATIONEND_HWPOWERSUPPLY_ASSOCIATIONEND_SUPPLIEDPOWER, elt);
        if(value_suppliedPower.equals("")){
            value_suppliedPower = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPOWERSUPPLY_ASSOCIATIONEND_HWPOWERSUPPLY_ASSOCIATIONEND_SUPPLIEDPOWER),value_suppliedPower);
        String value_capacity = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPOWERSUPPLY_ASSOCIATIONEND_HWPOWERSUPPLY_ASSOCIATIONEND_CAPACITY, elt);
        if(value_capacity.equals("")){
            value_capacity = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPOWERSUPPLY_ASSOCIATIONEND_HWPOWERSUPPLY_ASSOCIATIONEND_CAPACITY),value_capacity);
    }

}
