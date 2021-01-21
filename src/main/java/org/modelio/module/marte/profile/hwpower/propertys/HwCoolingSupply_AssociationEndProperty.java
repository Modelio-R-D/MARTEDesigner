package org.modelio.module.marte.profile.hwpower.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("7fca0cb7-b7b5-4fe5-a0d4-9249e0be82f3")
public class HwCoolingSupply_AssociationEndProperty implements IPropertyContent {
    @objid ("9609d2d7-6eb0-4076-9322-28903ea28183")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if (row == 1){
             ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOOLINGSUPPLY_ASSOCIATIONEND_HWCOOLINGSUPPLY_ASSOCIATIONEND_COOLINGPOWER, value);
         }
    }

    @objid ("34908cf4-a3b7-4bb6-b450-2db5d1666449")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Cooling Supply
        // 
        String value_coolingPower = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOOLINGSUPPLY_ASSOCIATIONEND_HWCOOLINGSUPPLY_ASSOCIATIONEND_COOLINGPOWER, elt);
        if(value_coolingPower.equals("")){
            value_coolingPower = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOOLINGSUPPLY_ASSOCIATIONEND_HWCOOLINGSUPPLY_ASSOCIATIONEND_COOLINGPOWER),value_coolingPower);
    }

}
