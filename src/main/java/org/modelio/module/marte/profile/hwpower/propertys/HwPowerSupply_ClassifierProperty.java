package org.modelio.module.marte.profile.hwpower.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("0c1bd0b5-f1ab-4ca4-a99d-63d1ff6d0af8")
public class HwPowerSupply_ClassifierProperty implements IPropertyContent {
    @objid ("726060a8-2b37-4017-bca2-6e90a841ef54")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPOWERSUPPLY_CLASSIFIER_HWPOWERSUPPLY_CLASSIFIER_SUPPLIEDPOWER, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPOWERSUPPLY_CLASSIFIER_HWPOWERSUPPLY_CLASSIFIER_CAPACITY, value);
        }
    }

    @objid ("72bdd519-47a2-44dc-a1e3-c7d0187912ad")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Power Supply
        //
        String value_suppliedPower = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPOWERSUPPLY_CLASSIFIER_HWPOWERSUPPLY_CLASSIFIER_SUPPLIEDPOWER, elt);
        if(value_suppliedPower.equals("")){
            value_suppliedPower = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPOWERSUPPLY_CLASSIFIER_HWPOWERSUPPLY_CLASSIFIER_SUPPLIEDPOWER),value_suppliedPower);
        String value_capacity = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPOWERSUPPLY_CLASSIFIER_HWPOWERSUPPLY_CLASSIFIER_CAPACITY, elt);
        if(value_capacity.equals("")){
            value_capacity = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPOWERSUPPLY_CLASSIFIER_HWPOWERSUPPLY_CLASSIFIER_CAPACITY),value_capacity);
    }

}
