package org.modelio.module.marte.profile.hwpower.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("97eaaf5b-d933-46b6-b180-d5435c412862")
public class HwCoolingSupply_LinkProperty implements IPropertyContent {
    @objid ("45d1e67a-0a0f-4450-93e1-91f8dda55535")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if (row == 1){
             ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOOLINGSUPPLY_LINK_HWCOOLINGSUPPLY_LINK_COOLINGPOWER, value);
         }
    }

    @objid ("90c4d49f-7e5d-4fc3-8aa0-31280c3cf418")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Cooling Supply
        // 
        String value_coolingPower = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOOLINGSUPPLY_LINK_HWCOOLINGSUPPLY_LINK_COOLINGPOWER, elt);
        if(value_coolingPower.equals("")){
            value_coolingPower = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOOLINGSUPPLY_LINK_HWCOOLINGSUPPLY_LINK_COOLINGPOWER),value_coolingPower);
    }

}
