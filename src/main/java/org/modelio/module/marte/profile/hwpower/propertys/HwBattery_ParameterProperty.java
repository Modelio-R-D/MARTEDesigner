package org.modelio.module.marte.profile.hwpower.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("997d1cd1-edf5-4e65-9add-2c90d89d5432")
public class HwBattery_ParameterProperty implements IPropertyContent {
    @objid ("8729dcd7-0354-4726-a934-2aa70ceb66ff")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWBATTERY_PARAMETER_HWBATTERY_PARAMETER_CAPACITY, value);
        }
    }

    @objid ("8180ea41-8b7f-46a5-a0ae-9c6cb5a16a9a")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Power Supply
        //
        String value_suppliedPower = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBATTERY_PARAMETER_HWBATTERY_PARAMETER_CAPACITY, elt);
        if(value_suppliedPower.equals("")){
            value_suppliedPower = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWBATTERY_PARAMETER_HWBATTERY_PARAMETER_CAPACITY),value_suppliedPower);
    }

}
