package org.modelio.module.marte.profile.hwtiming.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("b7cc4d43-0e70-4a06-b2af-fb3ff302b072")
public class HwClock_ClassifierProperty implements IPropertyContent {
    @objid ("a5b88649-0ec3-434e-90a3-c9a6c25804ea")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCLOCK_CLASSIFIER_HWCLOCK_CLASSIFIER_FREQUENCY, value);
        }
    }

    @objid ("54c643aa-3589-4d4c-9b27-3a9aab7a0cd8")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // HwClock
        //
        String value_resMult = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCLOCK_CLASSIFIER_HWCLOCK_CLASSIFIER_FREQUENCY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCLOCK_CLASSIFIER_HWCLOCK_CLASSIFIER_FREQUENCY),value_resMult);
    }

}
