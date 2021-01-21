package org.modelio.module.marte.profile.grm.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("fb5812d5-97d1-4665-9be0-44e4f45641ea")
public class CommunicationMedia_ClassifierProperty implements IPropertyContent {
    @objid ("39936cd7-d6ca-4858-b076-7fc07bca5491")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_ELEMENTSIZE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_TRANSMMODE, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_BLOCKT, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_PACKETT, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_CAPACITY, value);
        }
    }

    @objid ("bd5c9063-4e48-4e2e-99e7-b4be75ed123f")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Communication Media
        //
        String value_elementSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_ELEMENTSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_ELEMENTSIZE),value_elementSize);
        
        String [] transModeKind = MARTEEnumerationUtils.getTransmModeKind();
        String value_transmMode = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_TRANSMMODE, elt);
        if(!(MARTEEnumerationUtils.isTransModeKind(value_transmMode))){
            value_transmMode = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_TRANSMMODE),value_transmMode, transModeKind);
        
        String value_blockT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_BLOCKT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_BLOCKT),value_blockT);
        
        String value_packetT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_PACKETT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_PACKETT),value_packetT);
        
        String value_capacity = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_CAPACITY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_CAPACITY),value_capacity);
    }

}
