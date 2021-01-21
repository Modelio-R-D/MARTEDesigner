package org.modelio.module.marte.profile.grm.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("520c50ea-94e5-4490-9402-3828a9ec762a")
public class CommunicationMedia_AttributeProperty implements IPropertyContent {
    @objid ("97773371-d9c8-4070-a70c-5cccfb10d017")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ATTRIBUTE_COMMUNICATIONMEDIA_ATTRIBUTE_ELEMENTSIZE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ATTRIBUTE_COMMUNICATIONMEDIA_ATTRIBUTE_TRANSMMODE, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ATTRIBUTE_COMMUNICATIONMEDIA_ATTRIBUTE_BLOCKT, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ATTRIBUTE_COMMUNICATIONMEDIA_ATTRIBUTE_PACKETT, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ATTRIBUTE_COMMUNICATIONMEDIA_ATTRIBUTE_CAPACITY, value);
        }
    }

    @objid ("3f796a4c-9217-4769-949c-f8c1c50d25f3")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Communication Media
        //
        String value_elementSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ATTRIBUTE_COMMUNICATIONMEDIA_ATTRIBUTE_ELEMENTSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ATTRIBUTE_COMMUNICATIONMEDIA_ATTRIBUTE_ELEMENTSIZE),value_elementSize);
        
        String [] transModeKind = MARTEEnumerationUtils.getTransmModeKind();
        String value_transmMode = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ATTRIBUTE_COMMUNICATIONMEDIA_ATTRIBUTE_TRANSMMODE, elt);
        if(!(MARTEEnumerationUtils.isTransModeKind(value_transmMode))){
            value_transmMode = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ATTRIBUTE_COMMUNICATIONMEDIA_ATTRIBUTE_TRANSMMODE),value_transmMode, transModeKind);
        
        String value_blockT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ATTRIBUTE_COMMUNICATIONMEDIA_ATTRIBUTE_BLOCKT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ATTRIBUTE_COMMUNICATIONMEDIA_ATTRIBUTE_BLOCKT),value_blockT);
        
        String value_packetT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ATTRIBUTE_COMMUNICATIONMEDIA_ATTRIBUTE_PACKETT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ATTRIBUTE_COMMUNICATIONMEDIA_ATTRIBUTE_PACKETT),value_packetT);
        
        String value_capacity = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ATTRIBUTE_COMMUNICATIONMEDIA_ATTRIBUTE_CAPACITY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ATTRIBUTE_COMMUNICATIONMEDIA_ATTRIBUTE_CAPACITY),value_capacity);
    }

}
