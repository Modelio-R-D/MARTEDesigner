package org.modelio.module.marte.profile.grm.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("940ebb7f-e3c3-4f62-bdf5-0f9f9fc7be63")
public class CommunicationMedia_LifelineProperty implements IPropertyContent {
    @objid ("2b2386f9-f808-4c45-b8ee-9b8a5a27ad36")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LIFELINE_COMMUNICATIONMEDIA_LIFELINE_ELEMENTSIZE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LIFELINE_COMMUNICATIONMEDIA_LIFELINE_TRANSMMODE, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LIFELINE_COMMUNICATIONMEDIA_LIFELINE_BLOCKT, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LIFELINE_COMMUNICATIONMEDIA_LIFELINE_PACKETT, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LIFELINE_COMMUNICATIONMEDIA_LIFELINE_CAPACITY, value);
        }
    }

    @objid ("284d0d9c-50f1-4357-8e44-3c3e9145d9a8")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Communication Media
        //
        String value_elementSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LIFELINE_COMMUNICATIONMEDIA_LIFELINE_ELEMENTSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LIFELINE_COMMUNICATIONMEDIA_LIFELINE_ELEMENTSIZE),value_elementSize);
        
        String [] transModeKind = MARTEEnumerationUtils.getTransmModeKind();
        String value_transmMode = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LIFELINE_COMMUNICATIONMEDIA_LIFELINE_TRANSMMODE, elt);
        if(!(MARTEEnumerationUtils.isTransModeKind(value_transmMode))){
            value_transmMode = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LIFELINE_COMMUNICATIONMEDIA_LIFELINE_TRANSMMODE),value_transmMode, transModeKind);
        
        String value_blockT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LIFELINE_COMMUNICATIONMEDIA_LIFELINE_BLOCKT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LIFELINE_COMMUNICATIONMEDIA_LIFELINE_BLOCKT),value_blockT);
        
        String value_packetT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LIFELINE_COMMUNICATIONMEDIA_LIFELINE_PACKETT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LIFELINE_COMMUNICATIONMEDIA_LIFELINE_PACKETT),value_packetT);
        
        String value_capacity = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LIFELINE_COMMUNICATIONMEDIA_LIFELINE_CAPACITY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LIFELINE_COMMUNICATIONMEDIA_LIFELINE_CAPACITY),value_capacity);
    }

}
