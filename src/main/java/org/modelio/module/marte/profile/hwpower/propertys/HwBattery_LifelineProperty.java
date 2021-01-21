package org.modelio.module.marte.profile.hwpower.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("67718f87-0dca-4875-8cd7-53d69ced8573")
public class HwBattery_LifelineProperty implements IPropertyContent {
    @objid ("98210ac8-d3d1-4b5d-8888-2ee5499c5154")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWBATTERY_LIFELINE_HWBATTERY_LIFELINE_CAPACITY, value);
        }
    }

    @objid ("afa0f626-6a9b-42b9-a194-73cafcb02082")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Power Supply
        //
        String value_suppliedPower = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBATTERY_LIFELINE_HWBATTERY_LIFELINE_CAPACITY, elt);
        if(value_suppliedPower.equals("")){
            value_suppliedPower = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWBATTERY_LIFELINE_HWBATTERY_LIFELINE_CAPACITY),value_suppliedPower);
    }

}
