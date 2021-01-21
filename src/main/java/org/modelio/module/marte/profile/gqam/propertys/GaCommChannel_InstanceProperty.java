package org.modelio.module.marte.profile.gqam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("bdbc0a96-46c9-4dcb-9a7a-3de19d1c4364")
public class GaCommChannel_InstanceProperty implements IPropertyContent {
    @objid ("a3dca84e-7807-4e22-b3f8-65e9acf1bc52")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if (row == 1) {
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GACOMMCHANNEL_INSTANCE_GACOMMCHANNEL_INSTANCE_PACKETSIZE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GACOMMCHANNEL_INSTANCE_GACOMMCHANNEL_INSTANCE_UTILIZATION, value);
        }
    }

    @objid ("38c349ef-9284-458e-b8a4-7a78e29a80a4")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        // Ga Communication Channel tagged values
        String value_packetSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMCHANNEL_INSTANCE_GACOMMCHANNEL_INSTANCE_PACKETSIZE, elt);
        if(value_packetSize.equals(MARTEDesignerTagTypes.GACOMMCHANNEL_INSTANCE_GACOMMCHANNEL_INSTANCE_PACKETSIZE)){
            value_packetSize = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GACOMMCHANNEL_INSTANCE_GACOMMCHANNEL_INSTANCE_PACKETSIZE),value_packetSize);
        String value_utlization = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMCHANNEL_INSTANCE_GACOMMCHANNEL_INSTANCE_UTILIZATION, elt);
        if(value_utlization.equals(MARTEDesignerTagTypes.GACOMMCHANNEL_INSTANCE_GACOMMCHANNEL_INSTANCE_UTILIZATION)){
            value_utlization = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GACOMMCHANNEL_INSTANCE_GACOMMCHANNEL_INSTANCE_UTILIZATION),value_utlization);
    }

}
