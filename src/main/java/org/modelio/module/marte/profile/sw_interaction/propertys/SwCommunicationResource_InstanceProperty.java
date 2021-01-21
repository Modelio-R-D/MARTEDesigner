package org.modelio.module.marte.profile.sw_interaction.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("0be49bc0-6cf5-472d-8838-76a4b01797c4")
public class SwCommunicationResource_InstanceProperty implements IPropertyContent {
    @objid ("0c4a87e5-5ca2-4008-bf37-3e02c9f4473b")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_SWCOMMUNICATIONRESOURCE_INSTANCE_BLOCKT, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_SWCOMMUNICATIONRESOURCE_INSTANCE_CAPACITY, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_SWCOMMUNICATIONRESOURCE_INSTANCE_ELEMENTSIZE, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_SWCOMMUNICATIONRESOURCE_INSTANCE_PACKETT, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_SWCOMMUNICATIONRESOURCE_INSTANCE_TRANSMMODE, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_SWCOMMUNICATIONRESOURCE_INSTANCE_SPEEDFACTOR, value);
        }
    }

    @objid ("9f3c474c-0c26-4720-90bb-6415b61b6d41")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // SwCommunicationResource
        //
         String value_elementSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_SWCOMMUNICATIONRESOURCE_INSTANCE_ELEMENTSIZE, elt);
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_SWCOMMUNICATIONRESOURCE_INSTANCE_ELEMENTSIZE),value_elementSize);
         
         String [] transModeKind = MARTEEnumerationUtils.getTransmModeKind();
         String value_transmMode = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_SWCOMMUNICATIONRESOURCE_INSTANCE_TRANSMMODE, elt);
         if(!(MARTEEnumerationUtils.isTransModeKind(value_transmMode))){
             value_transmMode = "";
         }
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_SWCOMMUNICATIONRESOURCE_INSTANCE_TRANSMMODE),value_transmMode, transModeKind);
         
         String value_blockT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_SWCOMMUNICATIONRESOURCE_INSTANCE_BLOCKT, elt);
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_SWCOMMUNICATIONRESOURCE_INSTANCE_BLOCKT),value_blockT);
         
         String value_packetT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_SWCOMMUNICATIONRESOURCE_INSTANCE_PACKETT, elt);
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_SWCOMMUNICATIONRESOURCE_INSTANCE_PACKETT),value_packetT);
         
         String value_capacity = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_SWCOMMUNICATIONRESOURCE_INSTANCE_CAPACITY, elt);
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_SWCOMMUNICATIONRESOURCE_INSTANCE_CAPACITY),value_capacity);
           
         String value_speedFactor = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_SWCOMMUNICATIONRESOURCE_INSTANCE_SPEEDFACTOR, elt);
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_SWCOMMUNICATIONRESOURCE_INSTANCE_SPEEDFACTOR),value_speedFactor);
    }

}
