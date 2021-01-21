package org.modelio.module.marte.profile.hwtiming.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("120e5a33-16f5-4b03-9ffd-8f59ba8c025b")
public class HwClock_LifelineProperty implements IPropertyContent {
    @objid ("03cc8a28-dbe4-4a5c-b705-b192bcc957d5")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCLOCK_LIFELINE_HWCLOCK_LIFELINE_FREQUENCY, value);
        }
    }

    @objid ("b17a47ea-2d07-4326-a45f-b95063d4a9e2")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // HwClock
        //
        String value_resMult = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCLOCK_LIFELINE_HWCLOCK_LIFELINE_FREQUENCY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCLOCK_LIFELINE_HWCLOCK_LIFELINE_FREQUENCY),value_resMult);
    }

}
