package org.modelio.module.marte.profile.hwpower.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("7d56ef35-0722-4d5f-8303-c90c71af74d8")
public class HwBattery_ClassifierProperty implements IPropertyContent {
    @objid ("bf5ddb2c-9c30-4e97-a7f3-7c9e4e791959")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWBATTERY_CLASSIFIER_HWBATTERY_CLASSIFIER_CAPACITY, value);
        }
    }

    @objid ("0923563f-4d6c-4009-9689-9d5a5187ba1a")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Power Supply
        //
        String value_suppliedPower = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBATTERY_CLASSIFIER_HWBATTERY_CLASSIFIER_CAPACITY, elt);
        if(value_suppliedPower.equals("")){
            value_suppliedPower = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWBATTERY_CLASSIFIER_HWBATTERY_CLASSIFIER_CAPACITY),value_suppliedPower);
    }

}
