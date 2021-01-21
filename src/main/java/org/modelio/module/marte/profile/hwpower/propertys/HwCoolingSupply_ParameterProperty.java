package org.modelio.module.marte.profile.hwpower.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("5e4b14b6-685b-4709-8074-613944218401")
public class HwCoolingSupply_ParameterProperty implements IPropertyContent {
    @objid ("7884be80-4cea-48aa-8032-eaaf1cbac663")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if (row == 1){
             ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOOLINGSUPPLY_PARAMETER_HWCOOLINGSUPPLY_PARAMETER_COOLINGPOWER, value);
         }
    }

    @objid ("8f351513-5dc3-4fb7-bf79-bcd532dd9bf5")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Cooling Supply
        // 
        String value_coolingPower = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOOLINGSUPPLY_PARAMETER_HWCOOLINGSUPPLY_PARAMETER_COOLINGPOWER, elt);
        if(value_coolingPower.equals("")){
            value_coolingPower = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOOLINGSUPPLY_PARAMETER_HWCOOLINGSUPPLY_PARAMETER_COOLINGPOWER),value_coolingPower);
    }

}
