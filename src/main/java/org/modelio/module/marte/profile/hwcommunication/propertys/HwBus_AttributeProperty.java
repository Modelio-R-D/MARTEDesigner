package org.modelio.module.marte.profile.hwcommunication.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("687be7f5-b641-4a80-b0b7-8e0c6949e3d2")
public class HwBus_AttributeProperty implements IPropertyContent {
    @objid ("5051c39d-66c5-4f45-8233-bb3ce6765d34")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWBUS_ATTRIBUTE_HWBUS_ATTRIBUTE_ADRESSWIDTH, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWBUS_ATTRIBUTE_HWBUS_ATTRIBUTE_WORDWIDTH, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWBUS_ATTRIBUTE_HWBUS_ATTRIBUTE_ISSYNCHRONOUS, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWBUS_ATTRIBUTE_HWBUS_ATTRIBUTE_ISSERIAL, value);
        }
    }

    @objid ("d173f304-c844-4b3c-ab26-a0cde8bc22c2")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Bus
        //
        String value_adressWidth = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_ATTRIBUTE_HWBUS_ATTRIBUTE_ADRESSWIDTH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWBUS_ATTRIBUTE_HWBUS_ATTRIBUTE_ADRESSWIDTH),value_adressWidth);
        
        String value_wordWidth = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_ATTRIBUTE_HWBUS_ATTRIBUTE_WORDWIDTH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWBUS_ATTRIBUTE_HWBUS_ATTRIBUTE_WORDWIDTH),value_wordWidth);
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWBUS_ATTRIBUTE_HWBUS_ATTRIBUTE_ISSYNCHRONOUS),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_ATTRIBUTE_HWBUS_ATTRIBUTE_ISSYNCHRONOUS, elt));
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWBUS_ATTRIBUTE_HWBUS_ATTRIBUTE_ISSERIAL),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_ATTRIBUTE_HWBUS_ATTRIBUTE_ISSERIAL, elt));
    }

}
