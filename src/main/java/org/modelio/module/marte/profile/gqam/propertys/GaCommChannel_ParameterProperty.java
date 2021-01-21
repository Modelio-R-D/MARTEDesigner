package org.modelio.module.marte.profile.gqam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("bf650cf5-e291-4913-9f21-348f71d4d64c")
public class GaCommChannel_ParameterProperty implements IPropertyContent {
    @objid ("fabd7c76-a093-4bb5-a6fa-d01c9b5e1586")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if (row == 1) {
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GACOMMCHANNEL_PARAMETER_GACOMMCHANNEL_PARAMETER_PACKETSIZE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GACOMMCHANNEL_PARAMETER_GACOMMCHANNEL_PARAMETER_UTILIZATION, value);
        }
    }

    @objid ("3930e2f4-7086-4bb2-8930-3185a0f1b6da")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        // Ga Communication Channel tagged values
        String value_packetSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMCHANNEL_PARAMETER_GACOMMCHANNEL_PARAMETER_PACKETSIZE, elt);
        if(value_packetSize.equals(MARTEDesignerTagTypes.GACOMMCHANNEL_PARAMETER_GACOMMCHANNEL_PARAMETER_PACKETSIZE)){
            value_packetSize = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GACOMMCHANNEL_PARAMETER_GACOMMCHANNEL_PARAMETER_PACKETSIZE),value_packetSize);
        String value_utlization = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMCHANNEL_PARAMETER_GACOMMCHANNEL_PARAMETER_UTILIZATION, elt);
        if(value_utlization.equals(MARTEDesignerTagTypes.GACOMMCHANNEL_PARAMETER_GACOMMCHANNEL_PARAMETER_UTILIZATION)){
            value_utlization = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GACOMMCHANNEL_PARAMETER_GACOMMCHANNEL_PARAMETER_UTILIZATION),value_utlization);
    }

}
