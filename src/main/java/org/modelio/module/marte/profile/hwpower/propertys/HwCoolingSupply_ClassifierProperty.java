package org.modelio.module.marte.profile.hwpower.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("e22e5282-3284-43d5-b346-bd430c7d8be9")
public class HwCoolingSupply_ClassifierProperty implements IPropertyContent {
    @objid ("05288e64-825c-4ed4-ae3e-4456be3b894e")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOOLINGSUPPLY_CLASSIFIER_HWCOOLINGSUPPLY_CLASSIFIER_COOLINGPOWER, value);
        }
    }

    @objid ("212a6426-cce5-4182-bf4d-0b1db4e44874")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Cooling Supply
        // 
        String value_coolingPower = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOOLINGSUPPLY_CLASSIFIER_HWCOOLINGSUPPLY_CLASSIFIER_COOLINGPOWER, elt);
        if(value_coolingPower.equals("")){
            value_coolingPower = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOOLINGSUPPLY_CLASSIFIER_HWCOOLINGSUPPLY_CLASSIFIER_COOLINGPOWER),value_coolingPower);
    }

}
