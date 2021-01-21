package org.modelio.module.marte.profile.hwcommunication.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("9c212d45-21a1-456e-9af9-45ea08d9c82c")
public class HwBus_AssociationEndProperty implements IPropertyContent {
    @objid ("43725309-250b-4b94-ba40-ed55d82f96a5")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWBUS_ASSOCIATIONEND_HWBUS_ASSOCIATIONEND_ADRESSWIDTH, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWBUS_ASSOCIATIONEND_HWBUS_ASSOCIATIONEND_WORDWIDTH, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWBUS_ASSOCIATIONEND_HWBUS_ASSOCIATIONEND_ISSYNCHRONOUS, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWBUS_ASSOCIATIONEND_HWBUS_ASSOCIATIONEND_ISSERIAL, value);
        }
    }

    @objid ("37e2201e-a5ee-4d15-a1a2-40381e55442c")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Bus
        //
        String value_adressWidth = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_ASSOCIATIONEND_HWBUS_ASSOCIATIONEND_ADRESSWIDTH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWBUS_ASSOCIATIONEND_HWBUS_ASSOCIATIONEND_ADRESSWIDTH),value_adressWidth);
        
        String value_wordWidth = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_ASSOCIATIONEND_HWBUS_ASSOCIATIONEND_WORDWIDTH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWBUS_ASSOCIATIONEND_HWBUS_ASSOCIATIONEND_WORDWIDTH),value_wordWidth);
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWBUS_ASSOCIATIONEND_HWBUS_ASSOCIATIONEND_ISSYNCHRONOUS),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_ASSOCIATIONEND_HWBUS_ASSOCIATIONEND_ISSYNCHRONOUS, elt));
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWBUS_ASSOCIATIONEND_HWBUS_ASSOCIATIONEND_ISSERIAL),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_ASSOCIATIONEND_HWBUS_ASSOCIATIONEND_ISSERIAL, elt));
    }

}
