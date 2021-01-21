package org.modelio.module.marte.profile.sw_interaction.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("f2a4e520-2b90-4b1c-ab82-4681623fcaf6")
public class SwCommunicationResource_ClassifierProperty implements IPropertyContent {
    @objid ("2f395856-972f-4b30-b6a9-150123db03ba")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_SWCOMMUNICATIONRESOURCE_CLASSIFIER_BLOCKT, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_SWCOMMUNICATIONRESOURCE_CLASSIFIER_CAPACITY, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_SWCOMMUNICATIONRESOURCE_CLASSIFIER_ELEMENTSIZE, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_SWCOMMUNICATIONRESOURCE_CLASSIFIER_PACKETT, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_SWCOMMUNICATIONRESOURCE_CLASSIFIER_TRANSMMODE, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_SWCOMMUNICATIONRESOURCE_CLASSIFIER_SPEEDFACTOR, value);
        }
    }

    @objid ("6b8339b0-c5b6-490c-96a5-92f18cf778ab")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // SwCommunicationResource
        //
         String value_elementSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_SWCOMMUNICATIONRESOURCE_CLASSIFIER_ELEMENTSIZE, elt);
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_SWCOMMUNICATIONRESOURCE_CLASSIFIER_ELEMENTSIZE),value_elementSize);
         
         String [] transModeKind = MARTEEnumerationUtils.getTransmModeKind();
         String value_transmMode = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_SWCOMMUNICATIONRESOURCE_CLASSIFIER_TRANSMMODE, elt);
         if(!(MARTEEnumerationUtils.isTransModeKind(value_transmMode))){
             value_transmMode = "";
         }
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_SWCOMMUNICATIONRESOURCE_CLASSIFIER_TRANSMMODE),value_transmMode, transModeKind);
         
         String value_blockT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_SWCOMMUNICATIONRESOURCE_CLASSIFIER_BLOCKT, elt);
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_SWCOMMUNICATIONRESOURCE_CLASSIFIER_BLOCKT),value_blockT);
         
         String value_packetT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_SWCOMMUNICATIONRESOURCE_CLASSIFIER_PACKETT, elt);
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_SWCOMMUNICATIONRESOURCE_CLASSIFIER_PACKETT),value_packetT);
         
         String value_capacity = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_SWCOMMUNICATIONRESOURCE_CLASSIFIER_CAPACITY, elt);
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_SWCOMMUNICATIONRESOURCE_CLASSIFIER_CAPACITY),value_capacity);
           
         String value_speedFactor = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_SWCOMMUNICATIONRESOURCE_CLASSIFIER_SPEEDFACTOR, elt);
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_SWCOMMUNICATIONRESOURCE_CLASSIFIER_SPEEDFACTOR),value_speedFactor);
    }

}