package org.modelio.module.marte.profile.hwcommunication.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("dbbca553-5d6c-42be-83c0-5b4e7db79758")
public class HwBus_InstanceProperty implements IPropertyContent {
    @objid ("e0a183c7-6e6a-40bb-a2da-d889b3b0a875")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWBUS_INSTANCE_HWBUS_INSTANCE_ADRESSWIDTH, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWBUS_INSTANCE_HWBUS_INSTANCE_WORDWIDTH, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWBUS_INSTANCE_HWBUS_INSTANCE_ISSYNCHRONOUS, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWBUS_INSTANCE_HWBUS_INSTANCE_ISSERIAL, value);
        }
    }

    @objid ("a9921918-55b6-48dc-aa59-048279ae9058")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Bus
        //
        String value_adressWidth = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_INSTANCE_HWBUS_INSTANCE_ADRESSWIDTH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWBUS_INSTANCE_HWBUS_INSTANCE_ADRESSWIDTH),value_adressWidth);
        
        String value_wordWidth = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_INSTANCE_HWBUS_INSTANCE_WORDWIDTH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWBUS_INSTANCE_HWBUS_INSTANCE_WORDWIDTH),value_wordWidth);
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWBUS_INSTANCE_HWBUS_INSTANCE_ISSYNCHRONOUS),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_INSTANCE_HWBUS_INSTANCE_ISSYNCHRONOUS, elt));
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWBUS_INSTANCE_HWBUS_INSTANCE_ISSERIAL),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_INSTANCE_HWBUS_INSTANCE_ISSERIAL, elt));
    }

}
