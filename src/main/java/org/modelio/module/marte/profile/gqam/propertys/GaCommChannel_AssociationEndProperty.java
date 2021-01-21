package org.modelio.module.marte.profile.gqam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("0b530bc8-ffbc-486a-aa41-18a14633e6a9")
public class GaCommChannel_AssociationEndProperty implements IPropertyContent {
    @objid ("5723b0f4-1dd4-4382-9c10-80ecdb01b49c")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if (row == 1) {
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GACOMMCHANNEL_ASSOCIATIONEND_GACOMMCHANNEL_ASSOCIATIONEND_PACKETSIZE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GACOMMCHANNEL_ASSOCIATIONEND_GACOMMCHANNEL_ASSOCIATIONEND_UTILIZATION, value);
        }
    }

    @objid ("b791bfec-1139-430a-b14e-ce0730597f6c")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        // Ga Communication Channel tagged values
        String value_packetSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMCHANNEL_ASSOCIATIONEND_GACOMMCHANNEL_ASSOCIATIONEND_PACKETSIZE, elt);
        if(value_packetSize.equals(MARTEDesignerTagTypes.GACOMMCHANNEL_ASSOCIATIONEND_GACOMMCHANNEL_ASSOCIATIONEND_PACKETSIZE)){
            value_packetSize = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GACOMMCHANNEL_ASSOCIATIONEND_GACOMMCHANNEL_ASSOCIATIONEND_PACKETSIZE),value_packetSize);
        
        String value_utlization = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMCHANNEL_ASSOCIATIONEND_GACOMMCHANNEL_ASSOCIATIONEND_UTILIZATION, elt);
        if(value_utlization.equals(MARTEDesignerTagTypes.GACOMMCHANNEL_ASSOCIATIONEND_GACOMMCHANNEL_ASSOCIATIONEND_UTILIZATION)){
            value_utlization = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GACOMMCHANNEL_ASSOCIATIONEND_GACOMMCHANNEL_ASSOCIATIONEND_UTILIZATION),value_utlization);
    }

}
