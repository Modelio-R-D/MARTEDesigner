package org.modelio.module.marte.profile.hwtiming.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("0cc40545-a6fa-40cf-846c-42eaf234aa89")
public class HwClock_LinkProperty implements IPropertyContent {
    @objid ("062d0357-5c37-4007-ad26-0b444947e3b9")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCLOCK_LINK_HWCLOCK_LINK_FREQUENCY, value);
        }
    }

    @objid ("9be6ab03-d015-432a-adf4-2dccea9ca410")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // HwClock
        //
        String value_resMult = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCLOCK_LINK_HWCLOCK_LINK_FREQUENCY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCLOCK_LINK_HWCLOCK_LINK_FREQUENCY),value_resMult);
    }

}
