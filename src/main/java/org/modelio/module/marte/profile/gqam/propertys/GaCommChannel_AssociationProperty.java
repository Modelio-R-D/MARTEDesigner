package org.modelio.module.marte.profile.gqam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("4d5d58f1-961d-42f5-ac43-1961b934a802")
public class GaCommChannel_AssociationProperty implements IPropertyContent {
    @objid ("60ffc4f3-587a-4cd0-b4f3-0e6230406cbd")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if (row == 1) {
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GACOMMCHANNEL_ASSOCIATION_GACOMMCHANNEL_ASSOCIATION_PACKETSIZE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GACOMMCHANNEL_ASSOCIATION_GACOMMCHANNEL_ASSOCIATION_UTILIZATION, value);
        }
    }

    @objid ("ef2575ad-fc0a-4d82-aaab-ff5bc2ae7377")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        // Ga Communication Channel tagged values
        String value_packetSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMCHANNEL_ASSOCIATION_GACOMMCHANNEL_ASSOCIATION_PACKETSIZE, elt);
        if(value_packetSize.equals(MARTEDesignerTagTypes.GACOMMCHANNEL_ASSOCIATION_GACOMMCHANNEL_ASSOCIATION_PACKETSIZE)){
            value_packetSize = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GACOMMCHANNEL_ASSOCIATION_GACOMMCHANNEL_ASSOCIATION_PACKETSIZE),value_packetSize);
        String value_utlization = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMCHANNEL_ASSOCIATION_GACOMMCHANNEL_ASSOCIATION_UTILIZATION, elt);
        if(value_utlization.equals(MARTEDesignerTagTypes.GACOMMCHANNEL_ASSOCIATION_GACOMMCHANNEL_ASSOCIATION_UTILIZATION)){
            value_utlization = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GACOMMCHANNEL_ASSOCIATION_GACOMMCHANNEL_ASSOCIATION_UTILIZATION),value_utlization);
    }

}
