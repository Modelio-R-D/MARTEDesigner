package org.modelio.module.marte.profile.gqam.propertys;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class GaEventTrace_ModelElementProperty implements IPropertyContent {
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEVENTTRACE_MODELELEMENT_GAEVENTTRACE_MODELELEMENT_CONTENT, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEVENTTRACE_MODELELEMENT_GAEVENTTRACE_MODELELEMENT_FORMAT, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEVENTTRACE_MODELELEMENT_GAEVENTTRACE_MODELELEMENT_LOCATION, value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEVENTTRACE_MODELELEMENT_GAEVENTTRACE_MODELELEMENT_CONTENT, elt);
        if(value.equals("")){
            value = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEVENTTRACE_MODELELEMENT_GAEVENTTRACE_MODELELEMENT_CONTENT),value);
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEVENTTRACE_MODELELEMENT_GAEVENTTRACE_MODELELEMENT_FORMAT, elt);
        if(value.equals("")){
            value = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEVENTTRACE_MODELELEMENT_GAEVENTTRACE_MODELELEMENT_FORMAT),value);
        
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEVENTTRACE_MODELELEMENT_GAEVENTTRACE_MODELELEMENT_LOCATION, elt);
        if(value.equals("")){
            value = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEVENTTRACE_MODELELEMENT_GAEVENTTRACE_MODELELEMENT_LOCATION),value);
    }

}
