package org.modelio.module.marte.profile.sw_interaction.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("1e8a9f96-73bb-4130-b187-205444cb6e23")
public class SwCommunicationResource_LifelineProperty implements IPropertyContent {
    @objid ("8015803c-25a8-43fe-99d9-e4456afd2163")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_SWCOMMUNICATIONRESOURCE_LIFELINE_BLOCKT, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_SWCOMMUNICATIONRESOURCE_LIFELINE_CAPACITY, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_SWCOMMUNICATIONRESOURCE_LIFELINE_ELEMENTSIZE, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_SWCOMMUNICATIONRESOURCE_LIFELINE_PACKETT, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_SWCOMMUNICATIONRESOURCE_LIFELINE_TRANSMMODE, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_SWCOMMUNICATIONRESOURCE_LIFELINE_SPEEDFACTOR, value);
        }
    }

    @objid ("78ecc8da-9d2b-40ce-ad34-f202900e8034")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // SwCommunicationResource
        //
         String value_elementSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_SWCOMMUNICATIONRESOURCE_LIFELINE_ELEMENTSIZE, elt);
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_SWCOMMUNICATIONRESOURCE_LIFELINE_ELEMENTSIZE),value_elementSize);
         
         String [] transModeKind = MARTEEnumerationUtils.getTransmModeKind();
         String value_transmMode = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_SWCOMMUNICATIONRESOURCE_LIFELINE_TRANSMMODE, elt);
         if(!(MARTEEnumerationUtils.isTransModeKind(value_transmMode))){
             value_transmMode = "";
         }
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_SWCOMMUNICATIONRESOURCE_LIFELINE_TRANSMMODE),value_transmMode, transModeKind);
         
         String value_blockT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_SWCOMMUNICATIONRESOURCE_LIFELINE_BLOCKT, elt);
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_SWCOMMUNICATIONRESOURCE_LIFELINE_BLOCKT),value_blockT);
         
         String value_packetT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_SWCOMMUNICATIONRESOURCE_LIFELINE_PACKETT, elt);
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_SWCOMMUNICATIONRESOURCE_LIFELINE_PACKETT),value_packetT);
         
         String value_capacity = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_SWCOMMUNICATIONRESOURCE_LIFELINE_CAPACITY, elt);
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_SWCOMMUNICATIONRESOURCE_LIFELINE_CAPACITY),value_capacity);
           
         String value_speedFactor = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_SWCOMMUNICATIONRESOURCE_LIFELINE_SPEEDFACTOR, elt);
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_SWCOMMUNICATIONRESOURCE_LIFELINE_SPEEDFACTOR),value_speedFactor);
    }

}
