package org.modelio.module.marte.profile.hwpower.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("9815edd6-9ebf-4f19-8f2b-75723cce91ba")
public class HwBattery_LinkProperty implements IPropertyContent {
    @objid ("e0d3121b-87d0-42aa-a545-64fb186b1ac2")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWBATTERY_LINK_HWBATTERY_LINK_CAPACITY, value);
        }
    }

    @objid ("077ccaaf-3d2d-450d-8ce5-d706bb5da8ec")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Power Supply
        //
        String value_suppliedPower = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBATTERY_LINK_HWBATTERY_LINK_CAPACITY, elt);
        if(value_suppliedPower.equals("")){
            value_suppliedPower = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWBATTERY_LINK_HWBATTERY_LINK_CAPACITY),value_suppliedPower);
    }

}
