package org.modelio.module.marte.profile.grm.propertys;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class CommunicationMedia_AssociationEndProperty implements IPropertyContent {
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_COMMUNICATIONMEDIA_ASSOCIATIONEND_ELEMENTSIZE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_COMMUNICATIONMEDIA_ASSOCIATIONEND_TRANSMMODE, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_COMMUNICATIONMEDIA_ASSOCIATIONEND_BLOCKT, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_COMMUNICATIONMEDIA_ASSOCIATIONEND_PACKETT, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_COMMUNICATIONMEDIA_ASSOCIATIONEND_CAPACITY, value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Communication Media
        //
        String value_elementSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_COMMUNICATIONMEDIA_ASSOCIATIONEND_ELEMENTSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_COMMUNICATIONMEDIA_ASSOCIATIONEND_ELEMENTSIZE),value_elementSize);
        
        String [] transModeKind = MARTEEnumerationUtils.getTransmModeKind();
        String value_transmMode = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_COMMUNICATIONMEDIA_ASSOCIATIONEND_TRANSMMODE, elt);
        if(!(MARTEEnumerationUtils.isTransModeKind(value_transmMode))){
            value_transmMode = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_COMMUNICATIONMEDIA_ASSOCIATIONEND_TRANSMMODE),value_transmMode, transModeKind);
        
        String value_blockT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_COMMUNICATIONMEDIA_ASSOCIATIONEND_BLOCKT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_COMMUNICATIONMEDIA_ASSOCIATIONEND_BLOCKT),value_blockT);
        
        String value_packetT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_COMMUNICATIONMEDIA_ASSOCIATIONEND_PACKETT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_COMMUNICATIONMEDIA_ASSOCIATIONEND_PACKETT),value_packetT);
        
        String value_capacity = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_COMMUNICATIONMEDIA_ASSOCIATIONEND_CAPACITY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_COMMUNICATIONMEDIA_ASSOCIATIONEND_CAPACITY),value_capacity);
    }

}
