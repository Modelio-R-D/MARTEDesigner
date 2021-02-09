package org.modelio.module.marte.profile.sam.propertys;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SaCommStep_ModelElementProperty implements IPropertyContent {
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SACOMMSTEP_MODELELEMENT_SACOMMSTEP_MODELELEMENT_DEADLINE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SACOMMSTEP_MODELELEMENT_SACOMMSTEP_MODELELEMENT_SPARECAP, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SACOMMSTEP_MODELELEMENT_SACOMMSTEP_MODELELEMENT_SCHSLACK, value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SACOMMSTEP_MODELELEMENT_SACOMMSTEP_MODELELEMENT_DEADLINE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SACOMMSTEP_MODELELEMENT_SACOMMSTEP_MODELELEMENT_DEADLINE),value);
             
                value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SACOMMSTEP_MODELELEMENT_SACOMMSTEP_MODELELEMENT_SPARECAP, elt);
                table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SACOMMSTEP_MODELELEMENT_SACOMMSTEP_MODELELEMENT_SPARECAP),value);
                
                value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SACOMMSTEP_MODELELEMENT_SACOMMSTEP_MODELELEMENT_SCHSLACK, elt);
                table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SACOMMSTEP_MODELELEMENT_SACOMMSTEP_MODELELEMENT_SCHSLACK),value);
    }

}
