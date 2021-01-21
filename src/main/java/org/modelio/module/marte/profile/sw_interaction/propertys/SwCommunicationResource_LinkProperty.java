package org.modelio.module.marte.profile.sw_interaction.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("c1be008c-6a24-4683-b2a3-7e7b23a59c66")
public class SwCommunicationResource_LinkProperty implements IPropertyContent {
    @objid ("d6735c7d-3d42-46a5-9048-1f52b253337b")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_LINK_SWCOMMUNICATIONRESOURCE_LINK_BLOCKT, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_LINK_SWCOMMUNICATIONRESOURCE_LINK_CAPACITY, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_LINK_SWCOMMUNICATIONRESOURCE_LINK_ELEMENTSIZE, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_LINK_SWCOMMUNICATIONRESOURCE_LINK_PACKETT, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_LINK_SWCOMMUNICATIONRESOURCE_LINK_TRANSMMODE, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_LINK_SWCOMMUNICATIONRESOURCE_LINK_SPEEDFACTOR, value);
        }
    }

    @objid ("c44dc436-c154-447d-b144-c8924124bbca")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // SwCommunicationResource
        //
         String value_elementSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_LINK_SWCOMMUNICATIONRESOURCE_LINK_ELEMENTSIZE, elt);
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_LINK_SWCOMMUNICATIONRESOURCE_LINK_ELEMENTSIZE),value_elementSize);
         
         String [] transModeKind = MARTEEnumerationUtils.getTransmModeKind();
         String value_transmMode = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_LINK_SWCOMMUNICATIONRESOURCE_LINK_TRANSMMODE, elt);
         if(!(MARTEEnumerationUtils.isTransModeKind(value_transmMode))){
             value_transmMode = "";
         }
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_LINK_SWCOMMUNICATIONRESOURCE_LINK_TRANSMMODE),value_transmMode, transModeKind);
         
         String value_blockT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_LINK_SWCOMMUNICATIONRESOURCE_LINK_BLOCKT, elt);
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_LINK_SWCOMMUNICATIONRESOURCE_LINK_BLOCKT),value_blockT);
         
         String value_packetT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_LINK_SWCOMMUNICATIONRESOURCE_LINK_PACKETT, elt);
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_LINK_SWCOMMUNICATIONRESOURCE_LINK_PACKETT),value_packetT);
         
         String value_capacity = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_LINK_SWCOMMUNICATIONRESOURCE_LINK_CAPACITY, elt);
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_LINK_SWCOMMUNICATIONRESOURCE_LINK_CAPACITY),value_capacity);
           
         String value_speedFactor = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_LINK_SWCOMMUNICATIONRESOURCE_LINK_SPEEDFACTOR, elt);
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_LINK_SWCOMMUNICATIONRESOURCE_LINK_SPEEDFACTOR),value_speedFactor);
    }

}
