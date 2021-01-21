package org.modelio.module.marte.profile.hwtiming.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("f111518f-048e-488e-9212-e5c4f9a7c7c1")
public class HwClock_AssociationProperty implements IPropertyContent {
    @objid ("bba063a1-abd9-48fd-8350-9f9a25f5bab5")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCLOCK_ASSOCIATION_HWCLOCK_ASSOCIATION_FREQUENCY, value);
        }
    }

    @objid ("d457d8d2-f563-4f0d-a62a-a0256ea274ce")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // HwClock
        //
        String value_resMult = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCLOCK_ASSOCIATION_HWCLOCK_ASSOCIATION_FREQUENCY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCLOCK_ASSOCIATION_HWCLOCK_ASSOCIATION_FREQUENCY),value_resMult);
    }

}
