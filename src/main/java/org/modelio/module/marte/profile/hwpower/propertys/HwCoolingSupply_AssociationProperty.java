package org.modelio.module.marte.profile.hwpower.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("c55ce37b-2b00-43fa-a94d-2aaebfea5333")
public class HwCoolingSupply_AssociationProperty implements IPropertyContent {
    @objid ("e503c5f6-6293-4fe3-9006-66aebdbceb94")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if (row == 1){
             ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOOLINGSUPPLY_ASSOCIATION_HWCOOLINGSUPPLY_ASSOCIATION_COOLINGPOWER, value);
         }
    }

    @objid ("509ba6ea-928c-4c98-b481-0ba8b401b257")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Cooling Supply
        // 
        String value_coolingPower = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOOLINGSUPPLY_ASSOCIATION_HWCOOLINGSUPPLY_ASSOCIATION_COOLINGPOWER, elt);
        if(value_coolingPower.equals("")){
            value_coolingPower = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOOLINGSUPPLY_ASSOCIATION_HWCOOLINGSUPPLY_ASSOCIATION_COOLINGPOWER),value_coolingPower);
    }

}
