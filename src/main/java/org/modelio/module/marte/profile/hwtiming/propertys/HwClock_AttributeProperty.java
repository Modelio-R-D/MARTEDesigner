package org.modelio.module.marte.profile.hwtiming.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("b62d7794-a9a7-40ca-9c29-8b28cb175e20")
public class HwClock_AttributeProperty implements IPropertyContent {
    @objid ("52fed570-0919-48a2-a6af-b317e16a7387")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCLOCK_ATTRIBUTE_HWCLOCK_ATTRIBUTE_FREQUENCY, value);
        }
    }

    @objid ("dfcb529c-82f3-4379-8156-37ca8e24fe51")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // HwClock
        //
        String value_resMult = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCLOCK_ATTRIBUTE_HWCLOCK_ATTRIBUTE_FREQUENCY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCLOCK_ATTRIBUTE_HWCLOCK_ATTRIBUTE_FREQUENCY),value_resMult);
    }

}
