package org.modelio.module.marte.profile.hwtiming.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("2b1b1da3-3e74-42cd-8475-9df44b48284d")
public class HwClock_AssociationEndProperty implements IPropertyContent {
    @objid ("3b3cc421-dca2-43d2-a744-a4c646e1d2e8")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCLOCK_ASSOCIATIONEND_HWCLOCK_ASSOCIATIONEND_FREQUENCY, value);
        }
    }

    @objid ("0396a29e-8d68-4b4b-9ae0-564609e39d83")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // HwClock
        //
        String value_resMult = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCLOCK_ASSOCIATIONEND_HWCLOCK_ASSOCIATIONEND_FREQUENCY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCLOCK_ASSOCIATIONEND_HWCLOCK_ASSOCIATIONEND_FREQUENCY),value_resMult);
    }

}
