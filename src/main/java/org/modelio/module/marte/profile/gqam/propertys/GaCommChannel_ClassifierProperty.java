package org.modelio.module.marte.profile.gqam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("a2ed9b97-9851-443f-b1b5-20f814000eee")
public class GaCommChannel_ClassifierProperty implements IPropertyContent {
    @objid ("990df59c-d744-4dcc-987b-5f8027e4ac59")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if (row == 1) {
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GACOMMCHANNEL_CLASSIFIER_GACOMMCHANNEL_CLASSIFIER_PACKETSIZE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GACOMMCHANNEL_CLASSIFIER_GACOMMCHANNEL_CLASSIFIER_UTILIZATION, value);
        }
    }

    @objid ("7249b06f-f150-4ab1-b9f3-b91c6f1a18ef")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        // Ga Communication Channel tagged values
        String value_packetSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMCHANNEL_CLASSIFIER_GACOMMCHANNEL_CLASSIFIER_PACKETSIZE, elt);
        if(value_packetSize.equals(MARTEDesignerTagTypes.GACOMMCHANNEL_CLASSIFIER_GACOMMCHANNEL_CLASSIFIER_PACKETSIZE)){
            value_packetSize = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GACOMMCHANNEL_CLASSIFIER_GACOMMCHANNEL_CLASSIFIER_PACKETSIZE),value_packetSize);
               
        String value_utilization = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMCHANNEL_CLASSIFIER_GACOMMCHANNEL_CLASSIFIER_UTILIZATION, elt);
        if(value_utilization.equals(MARTEDesignerTagTypes.GACOMMCHANNEL_CLASSIFIER_GACOMMCHANNEL_CLASSIFIER_UTILIZATION)){
            value_utilization = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GACOMMCHANNEL_CLASSIFIER_GACOMMCHANNEL_CLASSIFIER_UTILIZATION),value_utilization);
    }

}
