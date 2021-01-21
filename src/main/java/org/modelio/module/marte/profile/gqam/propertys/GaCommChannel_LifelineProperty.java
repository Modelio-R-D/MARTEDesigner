package org.modelio.module.marte.profile.gqam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("5c0012e3-c8f1-4eb3-b50b-3efb6fb774db")
public class GaCommChannel_LifelineProperty implements IPropertyContent {
    @objid ("421c1946-6d67-4c27-aa6e-89cc232a3d4e")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if (row == 1) {
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GACOMMCHANNEL_LIFELINE_GACOMMCHANNEL_LIFELINE_PACKETSIZE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GACOMMCHANNEL_LIFELINE_GACOMMCHANNEL_LIFELINE_UTILIZATION, value);
        }
    }

    @objid ("87979624-2ad4-4ab1-ab2b-d07a7a9cf5f6")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        // Ga Communication Channel tagged values
        String value_packetSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMCHANNEL_LIFELINE_GACOMMCHANNEL_LIFELINE_PACKETSIZE, elt);
        if(value_packetSize.equals(MARTEDesignerTagTypes.GACOMMCHANNEL_LIFELINE_GACOMMCHANNEL_LIFELINE_PACKETSIZE)){
            value_packetSize = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GACOMMCHANNEL_LIFELINE_GACOMMCHANNEL_LIFELINE_PACKETSIZE),value_packetSize);
               
        String value_utlization = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMCHANNEL_LIFELINE_GACOMMCHANNEL_LIFELINE_UTILIZATION, elt);
        if(value_utlization.equals(MARTEDesignerTagTypes.GACOMMCHANNEL_LIFELINE_GACOMMCHANNEL_LIFELINE_UTILIZATION)){
            value_utlization = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GACOMMCHANNEL_LIFELINE_GACOMMCHANNEL_LIFELINE_UTILIZATION),value_utlization);
    }

}
