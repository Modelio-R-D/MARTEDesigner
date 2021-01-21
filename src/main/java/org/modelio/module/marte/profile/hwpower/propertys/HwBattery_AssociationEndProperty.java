package org.modelio.module.marte.profile.hwpower.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("6813484c-7db8-4299-a606-2b92649de85f")
public class HwBattery_AssociationEndProperty implements IPropertyContent {
    @objid ("55f6d37d-326f-4bc4-a4c8-4ea6f2e5b816")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWBATTERY_ASSOCIATIONEND_HWBATTERY_ASSOCIATIONEND_CAPACITY, value);
        }
    }

    @objid ("ae8bbe9b-05be-47e4-9caf-22ca97b7a4c1")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Power Supply
        //
        String value_suppliedPower = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBATTERY_ASSOCIATIONEND_HWBATTERY_ASSOCIATIONEND_CAPACITY, elt);
        if(value_suppliedPower.equals("")){
            value_suppliedPower = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWBATTERY_ASSOCIATIONEND_HWBATTERY_ASSOCIATIONEND_CAPACITY),value_suppliedPower);
    }

}
