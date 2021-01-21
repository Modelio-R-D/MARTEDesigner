package org.modelio.module.marte.profile.hwmemory.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("6bff02bb-8cc8-498b-afb2-120e4a78647e")
public class HwROM_InstanceProperty implements IPropertyContent {
    @objid ("d929dc8a-aa6b-40bb-9df1-d6da6d34cc90")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){          
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWROM_INSTANCE_HWROM_INSTANCE_TYPE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWROM_INSTANCE_HWROM_INSTANCE_ORGANIZATION, value);
        }
    }

    @objid ("a800a2da-87df-4e9a-b05e-10ad9c3d68bd")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw ROM
        //
        String[] type = MARTEEnumerationUtils.getROM_Type();
        String value_type = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWROM_INSTANCE_HWROM_INSTANCE_TYPE, elt);
        if(!(MARTEEnumerationUtils.isROM_Type(value_type))){
            value_type = "undefined";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWROM_INSTANCE_HWROM_INSTANCE_TYPE),value_type, type);
        
        String value_organization = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWROM_INSTANCE_HWROM_INSTANCE_ORGANIZATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWROM_INSTANCE_HWROM_INSTANCE_ORGANIZATION),value_organization);
    }

}
