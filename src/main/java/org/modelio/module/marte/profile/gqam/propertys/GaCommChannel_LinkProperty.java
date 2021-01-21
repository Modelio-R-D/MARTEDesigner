package org.modelio.module.marte.profile.gqam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("68b9cd15-b78d-4564-9c87-94efd97369f8")
public class GaCommChannel_LinkProperty implements IPropertyContent {
    @objid ("01a8daea-6740-4d3f-8c60-ca7bbf9c9f8b")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if (row == 1) {
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GACOMMCHANNEL_LINK_GACOMMCHANNEL_LINK_PACKETSIZE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GACOMMCHANNEL_LINK_GACOMMCHANNEL_LINK_UTILIZATION, value);
        }
    }

    @objid ("5ffe49cd-ba9c-4ff4-b1c5-eca44125b6a0")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        // Ga Communication Channel tagged values
        String value_packetSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMCHANNEL_LINK_GACOMMCHANNEL_LINK_PACKETSIZE, elt);
        if(value_packetSize.equals(MARTEDesignerTagTypes.GACOMMCHANNEL_LINK_GACOMMCHANNEL_LINK_PACKETSIZE)){
            value_packetSize = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GACOMMCHANNEL_LINK_GACOMMCHANNEL_LINK_PACKETSIZE),value_packetSize);
        String value_utlization = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMCHANNEL_LINK_GACOMMCHANNEL_LINK_UTILIZATION, elt);
        if(value_utlization.equals(MARTEDesignerTagTypes.GACOMMCHANNEL_LINK_GACOMMCHANNEL_LINK_UTILIZATION)){
            value_utlization = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GACOMMCHANNEL_LINK_GACOMMCHANNEL_LINK_UTILIZATION),value_utlization);
    }

}
