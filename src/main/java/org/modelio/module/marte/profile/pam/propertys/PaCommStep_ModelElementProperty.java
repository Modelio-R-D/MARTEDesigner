package org.modelio.module.marte.profile.pam.propertys;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class PaCommStep_ModelElementProperty implements IPropertyContent {
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PACOMMSTEP_MODELELEMENT_PACOMMSTEP_MODELELEMENT_NOSYNC, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PACOMMSTEP_MODELELEMENT_PACOMMSTEP_MODELELEMENT_EXTOPDEMAND, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PACOMMSTEP_MODELELEMENT_PACOMMSTEP_MODELELEMENT_EXTOPCOUNT, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PACOMMSTEP_MODELELEMENT_PACOMMSTEP_MODELELEMENT_BEHAVDEMAND, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PACOMMSTEP_MODELELEMENT_PACOMMSTEP_MODELELEMENT_BEHAVCOUNT, value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PACOMMSTEP_MODELELEMENT_PACOMMSTEP_MODELELEMENT_NOSYNC, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PACOMMSTEP_MODELELEMENT_PACOMMSTEP_MODELELEMENT_NOSYNC),value);
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PACOMMSTEP_MODELELEMENT_PACOMMSTEP_MODELELEMENT_EXTOPDEMAND, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PACOMMSTEP_MODELELEMENT_PACOMMSTEP_MODELELEMENT_EXTOPDEMAND),value);
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PACOMMSTEP_MODELELEMENT_PACOMMSTEP_MODELELEMENT_EXTOPCOUNT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PACOMMSTEP_MODELELEMENT_PACOMMSTEP_MODELELEMENT_EXTOPCOUNT),value);
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PACOMMSTEP_MODELELEMENT_PACOMMSTEP_MODELELEMENT_BEHAVDEMAND, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PACOMMSTEP_MODELELEMENT_PACOMMSTEP_MODELELEMENT_BEHAVDEMAND),value);
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PACOMMSTEP_MODELELEMENT_PACOMMSTEP_MODELELEMENT_BEHAVCOUNT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PACOMMSTEP_MODELELEMENT_PACOMMSTEP_MODELELEMENT_BEHAVCOUNT),value);
    }

}
