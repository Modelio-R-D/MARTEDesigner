package org.modelio.module.marte.profile.hwtiming.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("530b8874-0a34-45e1-872c-d55c90363da6")
public class HwClock_ParameterProperty implements IPropertyContent {
    @objid ("823d03f2-d1d4-447e-be75-76c3ecb25a4b")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCLOCK_PARAMETER_HWCLOCK_PARAMETER_FREQUENCY, value);
        }
    }

    @objid ("402c2313-887d-4088-9aa6-9c998358a2ad")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // HwClock
        //
        String value_resMult = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCLOCK_PARAMETER_HWCLOCK_PARAMETER_FREQUENCY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCLOCK_PARAMETER_HWCLOCK_PARAMETER_FREQUENCY),value_resMult);
    }

}
