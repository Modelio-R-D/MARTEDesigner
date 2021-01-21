package org.modelio.module.marte.profile.grm.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("104d380a-c3b9-4de7-b99a-27d4699dc7aa")
public class CommunicationMedia_AssociationProperty implements IPropertyContent {
    @objid ("84177de7-4c1f-48db-9cc0-67b927818bab")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATION_COMMUNICATIONMEDIA_ASSOCIATION_ELEMENTSIZE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATION_COMMUNICATIONMEDIA_ASSOCIATION_TRANSMMODE, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATION_COMMUNICATIONMEDIA_ASSOCIATION_BLOCKT, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATION_COMMUNICATIONMEDIA_ASSOCIATION_PACKETT, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATION_COMMUNICATIONMEDIA_ASSOCIATION_CAPACITY, value);
        }
    }

    @objid ("14f4a9bc-ccf6-4f38-a481-6c1ba4b8a063")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Communication Media
        //
        String value_elementSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATION_COMMUNICATIONMEDIA_ASSOCIATION_ELEMENTSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATION_COMMUNICATIONMEDIA_ASSOCIATION_ELEMENTSIZE),value_elementSize);
        
        String [] transModeKind = MARTEEnumerationUtils.getTransmModeKind();
        String value_transmMode = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATION_COMMUNICATIONMEDIA_ASSOCIATION_TRANSMMODE, elt);
        if(!(MARTEEnumerationUtils.isTransModeKind(value_transmMode))){
            value_transmMode = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATION_COMMUNICATIONMEDIA_ASSOCIATION_TRANSMMODE),value_transmMode, transModeKind);
        
        String value_blockT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATION_COMMUNICATIONMEDIA_ASSOCIATION_BLOCKT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATION_COMMUNICATIONMEDIA_ASSOCIATION_BLOCKT),value_blockT);
        
        String value_packetT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATION_COMMUNICATIONMEDIA_ASSOCIATION_PACKETT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATION_COMMUNICATIONMEDIA_ASSOCIATION_PACKETT),value_packetT);
        
        String value_capacity = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATION_COMMUNICATIONMEDIA_ASSOCIATION_CAPACITY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATION_COMMUNICATIONMEDIA_ASSOCIATION_CAPACITY),value_capacity);
    }

}
