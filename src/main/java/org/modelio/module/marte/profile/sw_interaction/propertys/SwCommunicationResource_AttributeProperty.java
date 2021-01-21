package org.modelio.module.marte.profile.sw_interaction.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("8548aa65-ab68-4a8d-8a06-e8980170f4e9")
public class SwCommunicationResource_AttributeProperty implements IPropertyContent {
    @objid ("3c17876f-52d5-46d6-b040-8a7e90e36827")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_SWCOMMUNICATIONRESOURCE_ATTRIBUTE_BLOCKT, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_SWCOMMUNICATIONRESOURCE_ATTRIBUTE_CAPACITY, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_SWCOMMUNICATIONRESOURCE_ATTRIBUTE_ELEMENTSIZE, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_SWCOMMUNICATIONRESOURCE_ATTRIBUTE_PACKETT, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_SWCOMMUNICATIONRESOURCE_ATTRIBUTE_TRANSMMODE, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_SWCOMMUNICATIONRESOURCE_ATTRIBUTE_SPEEDFACTOR, value);
        }
    }

    @objid ("6984750e-9c24-49f2-a2ae-e61b3bd3dfa8")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // SwCommunicationResource
        //
         String value_elementSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_SWCOMMUNICATIONRESOURCE_ATTRIBUTE_ELEMENTSIZE, elt);
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_SWCOMMUNICATIONRESOURCE_ATTRIBUTE_ELEMENTSIZE),value_elementSize);
         
         String [] transModeKind = MARTEEnumerationUtils.getTransmModeKind();
         String value_transmMode = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_SWCOMMUNICATIONRESOURCE_ATTRIBUTE_TRANSMMODE, elt);
         if(!(MARTEEnumerationUtils.isTransModeKind(value_transmMode))){
             value_transmMode = "";
         }
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_SWCOMMUNICATIONRESOURCE_ATTRIBUTE_TRANSMMODE),value_transmMode, transModeKind);
         
         String value_blockT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_SWCOMMUNICATIONRESOURCE_ATTRIBUTE_BLOCKT, elt);
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_SWCOMMUNICATIONRESOURCE_ATTRIBUTE_BLOCKT),value_blockT);
         
         String value_packetT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_SWCOMMUNICATIONRESOURCE_ATTRIBUTE_PACKETT, elt);
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_SWCOMMUNICATIONRESOURCE_ATTRIBUTE_PACKETT),value_packetT);
         
         String value_capacity = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_SWCOMMUNICATIONRESOURCE_ATTRIBUTE_CAPACITY, elt);
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_SWCOMMUNICATIONRESOURCE_ATTRIBUTE_CAPACITY),value_capacity);
           
         String value_speedFactor = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_SWCOMMUNICATIONRESOURCE_ATTRIBUTE_SPEEDFACTOR, elt);
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_SWCOMMUNICATIONRESOURCE_ATTRIBUTE_SPEEDFACTOR),value_speedFactor);
    }

}
