package org.modelio.module.marte.profile.hwcommunication.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("6c075d07-f87a-4c6b-8eac-94590b258100")
public class HwBus_ParameterProperty implements IPropertyContent {
    @objid ("11192667-8938-4d9d-a9d8-e273fe340d19")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWBUS_PARAMETER_HWBUS_PARAMETER_ADRESSWIDTH, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWBUS_PARAMETER_HWBUS_PARAMETER_WORDWIDTH, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWBUS_PARAMETER_HWBUS_PARAMETER_ISSYNCHRONOUS, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWBUS_PARAMETER_HWBUS_PARAMETER_ISSERIAL, value);
        }
    }

    @objid ("666757a8-a2a7-428a-95e6-f570336cb2a3")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Bus
        //
        String value_adressWidth = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_PARAMETER_HWBUS_PARAMETER_ADRESSWIDTH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWBUS_PARAMETER_HWBUS_PARAMETER_ADRESSWIDTH),value_adressWidth);
        
        String value_wordWidth = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_PARAMETER_HWBUS_PARAMETER_WORDWIDTH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWBUS_PARAMETER_HWBUS_PARAMETER_WORDWIDTH),value_wordWidth);
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWBUS_PARAMETER_HWBUS_PARAMETER_ISSYNCHRONOUS),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_PARAMETER_HWBUS_PARAMETER_ISSYNCHRONOUS, elt));
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWBUS_PARAMETER_HWBUS_PARAMETER_ISSERIAL),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_PARAMETER_HWBUS_PARAMETER_ISSERIAL, elt));
    }

}
