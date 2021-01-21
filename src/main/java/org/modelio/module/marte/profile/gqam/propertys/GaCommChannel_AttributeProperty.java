package org.modelio.module.marte.profile.gqam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("6a722ba4-f078-40bf-a8b5-e40b3efec1a1")
public class GaCommChannel_AttributeProperty implements IPropertyContent {
    @objid ("c6b7cb27-e7f4-41eb-8489-120205d326ef")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if (row == 1) {
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GACOMMCHANNEL_ATTRIBUTE_GACOMMCHANNEL_ATTRIBUTE_PACKETSIZE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GACOMMCHANNEL_ATTRIBUTE_GACOMMCHANNEL_ATTRIBUTE_UTILIZATION, value);
        }
    }

    @objid ("9ecdac04-b84c-46d7-82ac-0f7e797bd6c6")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        // Ga Communication Channel tagged values
        String value_packetSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMCHANNEL_ATTRIBUTE_GACOMMCHANNEL_ATTRIBUTE_PACKETSIZE, elt);
        if(value_packetSize.equals(MARTEDesignerTagTypes.GACOMMCHANNEL_ATTRIBUTE_GACOMMCHANNEL_ATTRIBUTE_PACKETSIZE)){
            value_packetSize = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GACOMMCHANNEL_ATTRIBUTE_GACOMMCHANNEL_ATTRIBUTE_PACKETSIZE),value_packetSize);
        String value_utlization = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMCHANNEL_ATTRIBUTE_GACOMMCHANNEL_ATTRIBUTE_UTILIZATION, elt);
        if(value_utlization.equals(MARTEDesignerTagTypes.GACOMMCHANNEL_ATTRIBUTE_GACOMMCHANNEL_ATTRIBUTE_UTILIZATION)){
            value_utlization = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GACOMMCHANNEL_ATTRIBUTE_GACOMMCHANNEL_ATTRIBUTE_UTILIZATION),value_utlization);
    }

}
