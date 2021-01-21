package org.modelio.module.marte.profile.hwpower.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("98ba7bf7-ccda-49ae-bc3c-ca70d34bc209")
public class HwPowerSupply_AssociationProperty implements IPropertyContent {
    @objid ("9e3dc387-2a0b-46e2-ade7-054f1c2e85a0")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPOWERSUPPLY_ASSOCIATION_HWPOWERSUPPLY_ASSOCIATION_SUPPLIEDPOWER, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPOWERSUPPLY_ASSOCIATION_HWPOWERSUPPLY_ASSOCIATION_CAPACITY, value);
        }
    }

    @objid ("6745cd02-8529-4ee2-8bc8-83157f45cdbc")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Power Supply
        //
        String value_suppliedPower = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPOWERSUPPLY_ASSOCIATION_HWPOWERSUPPLY_ASSOCIATION_SUPPLIEDPOWER, elt);
        if(value_suppliedPower.equals("")){
            value_suppliedPower = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPOWERSUPPLY_ASSOCIATION_HWPOWERSUPPLY_ASSOCIATION_SUPPLIEDPOWER),value_suppliedPower);
        String value_capacity = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPOWERSUPPLY_ASSOCIATION_HWPOWERSUPPLY_ASSOCIATION_CAPACITY, elt);
        if(value_capacity.equals("")){
            value_capacity = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPOWERSUPPLY_ASSOCIATION_HWPOWERSUPPLY_ASSOCIATION_CAPACITY),value_capacity);
    }

}
