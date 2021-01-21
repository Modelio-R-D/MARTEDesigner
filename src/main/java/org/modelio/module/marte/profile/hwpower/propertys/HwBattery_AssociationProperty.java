package org.modelio.module.marte.profile.hwpower.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("92a73f2d-6bda-4f24-bb8a-af696bfef8e4")
public class HwBattery_AssociationProperty implements IPropertyContent {
    @objid ("eadf8ec3-8e7c-4bc0-a594-d36b82936f37")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWBATTERY_ASSOCIATION_HWBATTERY_ASSOCIATION_CAPACITY, value);
        }
    }

    @objid ("221b7740-34f9-4da3-b2a3-74622b665aff")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Power Supply
        //
        String value_suppliedPower = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBATTERY_ASSOCIATION_HWBATTERY_ASSOCIATION_CAPACITY, elt);
        if(value_suppliedPower.equals("")){
            value_suppliedPower = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWBATTERY_ASSOCIATION_HWBATTERY_ASSOCIATION_CAPACITY),value_suppliedPower);
    }

}
