package org.modelio.module.marte.profile.hwpower.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("bd8f2141-e1cc-4813-b187-b0e864fa26f5")
public class HwCoolingSupply_InstanceProperty implements IPropertyContent {
    @objid ("23fb0f0f-1fc9-49fe-89a2-71aab04c5c23")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOOLINGSUPPLY_INSTANCE_HWCOOLINGSUPPLY_INSTANCE_COOLINGPOWER, value);
        }
    }

    @objid ("9f157a61-c742-4a54-835e-229520da2c3c")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Cooling Supply
        // 
        String value_coolingPower = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOOLINGSUPPLY_INSTANCE_HWCOOLINGSUPPLY_INSTANCE_COOLINGPOWER, elt);
        if(value_coolingPower.equals("")){
            value_coolingPower = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOOLINGSUPPLY_INSTANCE_HWCOOLINGSUPPLY_INSTANCE_COOLINGPOWER),value_coolingPower);
    }

}
