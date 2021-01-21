package org.modelio.module.marte.profile.gqam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("1b24a207-a9bf-4a44-a1af-da38e96a49cc")
public class GaEventTrace_ModelElementProperty implements IPropertyContent {
    @objid ("344a35a1-50d8-461d-94e5-626e3cc274a4")
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

    @objid ("4da0a52a-74c7-42ba-bb4f-caec9ebdd6ee")
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
