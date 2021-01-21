package org.modelio.module.marte.profile.hwpower.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("7caa4506-ce75-43f2-a26e-f243ac651186")
public class HwCoolingSupply_LifelineProperty implements IPropertyContent {
    @objid ("dede26aa-63c2-4ab5-a1de-a4f1ee776817")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if (row == 1){
             ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOOLINGSUPPLY_LIFELINE_HWCOOLINGSUPPLY_LIFELINE_COOLINGPOWER, value);
         }
    }

    @objid ("11ada44f-ed42-44c4-8263-2882cd71f8bf")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Cooling Supply
        // 
        String value_coolingPower = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOOLINGSUPPLY_LIFELINE_HWCOOLINGSUPPLY_LIFELINE_COOLINGPOWER, elt);
        if(value_coolingPower.equals("")){
            value_coolingPower = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOOLINGSUPPLY_LIFELINE_HWCOOLINGSUPPLY_LIFELINE_COOLINGPOWER),value_coolingPower);
    }

}
