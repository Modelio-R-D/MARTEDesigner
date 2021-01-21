package org.modelio.module.marte.profile.hwtiming.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("655e4e7d-e081-4e1c-a8a3-f5054b387721")
public class HwClock_InstanceProperty implements IPropertyContent {
    @objid ("f5f2794d-3dd4-4e46-8a99-5433429effa9")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCLOCK_INSTANCE_HWCLOCK_INSTANCE_FREQUENCY, value);
        }
    }

    @objid ("cf6f198e-0287-4c1d-90d4-1e4d12d6edb6")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // HwClock
        //
        String value_resMult = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCLOCK_INSTANCE_HWCLOCK_INSTANCE_FREQUENCY, elt);
               table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCLOCK_INSTANCE_HWCLOCK_INSTANCE_FREQUENCY),value_resMult);
    }

}
