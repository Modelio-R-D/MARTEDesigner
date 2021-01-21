package org.modelio.module.marte.profile.sw_interaction.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("0649f4a0-2e6c-4378-a70e-68b9ed1b3a58")
public class SwCommunicationResource_AssociationEndProperty implements IPropertyContent {
    @objid ("86f71a0e-58df-43b5-96e9-e0d1394e4b5e")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_BLOCKT, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_CAPACITY, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_ELEMENTSIZE, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_PACKETT, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_TRANSMMODE, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_SPEEDFACTOR, value);
        }
    }

    @objid ("9de9624a-1b92-4954-b59d-67b4cd9c7f96")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // SwCommunicationResource
        //
         String value_elementSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_ELEMENTSIZE, elt);
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_ELEMENTSIZE),value_elementSize);
         
         String [] transModeKind = MARTEEnumerationUtils.getTransmModeKind();
         String value_transmMode = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_TRANSMMODE, elt);
         if(!(MARTEEnumerationUtils.isTransModeKind(value_transmMode))){
             value_transmMode = "";
         }
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_TRANSMMODE),value_transmMode, transModeKind);
         
         String value_blockT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_BLOCKT, elt);
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_BLOCKT),value_blockT);
         
         String value_packetT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_PACKETT, elt);
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_PACKETT),value_packetT);
         
         String value_capacity = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_CAPACITY, elt);
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_CAPACITY),value_capacity);
           
         String value_speedFactor = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_SPEEDFACTOR, elt);
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_SPEEDFACTOR),value_speedFactor);
    }

}
