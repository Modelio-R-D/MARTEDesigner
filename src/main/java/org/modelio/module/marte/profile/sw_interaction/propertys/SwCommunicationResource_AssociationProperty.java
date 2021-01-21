package org.modelio.module.marte.profile.sw_interaction.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("9c5fce82-4036-4591-84ab-133369d48e82")
public class SwCommunicationResource_AssociationProperty implements IPropertyContent {
    @objid ("d14c0044-75dc-4f54-97bf-9878b4a36beb")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_SWCOMMUNICATIONRESOURCE_ASSOCIATION_BLOCKT, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_SWCOMMUNICATIONRESOURCE_ASSOCIATION_CAPACITY, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_SWCOMMUNICATIONRESOURCE_ASSOCIATION_ELEMENTSIZE, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_SWCOMMUNICATIONRESOURCE_ASSOCIATION_PACKETT, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_SWCOMMUNICATIONRESOURCE_ASSOCIATION_TRANSMMODE, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_SWCOMMUNICATIONRESOURCE_ASSOCIATION_SPEEDFACTOR, value);
        }
    }

    @objid ("66957ffa-e9e4-4956-9c03-2f67257f056e")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // SwCommunicationResource
        //
         String value_elementSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_SWCOMMUNICATIONRESOURCE_ASSOCIATION_ELEMENTSIZE, elt);
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_SWCOMMUNICATIONRESOURCE_ASSOCIATION_ELEMENTSIZE),value_elementSize);
         
         String [] transModeKind = MARTEEnumerationUtils.getTransmModeKind();
         String value_transmMode = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_SWCOMMUNICATIONRESOURCE_ASSOCIATION_TRANSMMODE, elt);
         if(!(MARTEEnumerationUtils.isTransModeKind(value_transmMode))){
             value_transmMode = "";
         }
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_SWCOMMUNICATIONRESOURCE_ASSOCIATION_TRANSMMODE),value_transmMode, transModeKind);
         
         String value_blockT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_SWCOMMUNICATIONRESOURCE_ASSOCIATION_BLOCKT, elt);
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_SWCOMMUNICATIONRESOURCE_ASSOCIATION_BLOCKT),value_blockT);
         
         String value_packetT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_SWCOMMUNICATIONRESOURCE_ASSOCIATION_PACKETT, elt);
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_SWCOMMUNICATIONRESOURCE_ASSOCIATION_PACKETT),value_packetT);
         
         String value_capacity = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_SWCOMMUNICATIONRESOURCE_ASSOCIATION_CAPACITY, elt);
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_SWCOMMUNICATIONRESOURCE_ASSOCIATION_CAPACITY),value_capacity);
           
         String value_speedFactor = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_SWCOMMUNICATIONRESOURCE_ASSOCIATION_SPEEDFACTOR, elt);
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_SWCOMMUNICATIONRESOURCE_ASSOCIATION_SPEEDFACTOR),value_speedFactor);
    }

}
