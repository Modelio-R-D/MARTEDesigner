package org.modelio.module.marte.profile.hwcommunication.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("7a34cc4d-0fa1-4e10-b47f-4f53c588b8d8")
public class HwBus_LifelineProperty implements IPropertyContent {
    @objid ("11d9470a-dd54-4f1d-8efc-0cdb0c0b1c24")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWBUS_LIFELINE_HWBUS_LIFELINE_ADRESSWIDTH, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWBUS_LIFELINE_HWBUS_LIFELINE_WORDWIDTH, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWBUS_LIFELINE_HWBUS_LIFELINE_ISSYNCHRONOUS, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWBUS_LIFELINE_HWBUS_LIFELINE_ISSERIAL, value);
        }
    }

    @objid ("624f1b85-b23a-417f-a64c-6dc122c9200c")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Bus
        //
        String value_adressWidth = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_LIFELINE_HWBUS_LIFELINE_ADRESSWIDTH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWBUS_LIFELINE_HWBUS_LIFELINE_ADRESSWIDTH),value_adressWidth);
        
        String value_wordWidth = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_LIFELINE_HWBUS_LIFELINE_WORDWIDTH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWBUS_LIFELINE_HWBUS_LIFELINE_WORDWIDTH),value_wordWidth);
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWBUS_LIFELINE_HWBUS_LIFELINE_ISSYNCHRONOUS),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_LIFELINE_HWBUS_LIFELINE_ISSYNCHRONOUS, elt));
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWBUS_LIFELINE_HWBUS_LIFELINE_ISSERIAL),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_LIFELINE_HWBUS_LIFELINE_ISSERIAL, elt));
    }

}
