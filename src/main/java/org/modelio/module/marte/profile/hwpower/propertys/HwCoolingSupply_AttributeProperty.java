package org.modelio.module.marte.profile.hwpower.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("ceb231af-b6ee-4d1f-b1d4-bb24c387f7ef")
public class HwCoolingSupply_AttributeProperty implements IPropertyContent {
    @objid ("4aacf944-4a90-45db-86f9-f355dbf3440c")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if (row == 1){
             ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOOLINGSUPPLY_ATTRIBUTE_HWCOOLINGSUPPLY_ATTRIBUTE_COOLINGPOWER, value);
         }
    }

    @objid ("87ab2a67-a0d7-4bd2-a3bc-ea9857653604")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Cooling Supply
        // 
        String value_coolingPower = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOOLINGSUPPLY_ATTRIBUTE_HWCOOLINGSUPPLY_ATTRIBUTE_COOLINGPOWER, elt);
        if(value_coolingPower.equals("")){
            value_coolingPower = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOOLINGSUPPLY_ATTRIBUTE_HWCOOLINGSUPPLY_ATTRIBUTE_COOLINGPOWER),value_coolingPower);
    }

}
