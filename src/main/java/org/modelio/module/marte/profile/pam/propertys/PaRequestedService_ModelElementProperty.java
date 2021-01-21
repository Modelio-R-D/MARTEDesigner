package org.modelio.module.marte.profile.pam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("42488969-2e5f-4670-bd55-330922f81afb")
public class PaRequestedService_ModelElementProperty implements IPropertyContent {
    @objid ("9e663c9a-9a8f-40d9-9be6-63f00fa4dac5")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PAREQUESTEDSERVICE_MODELELEMENT_PAREQUESTEDSERVICE_MODELELEMENT_NOSYNC, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PAREQUESTEDSERVICE_MODELELEMENT_PAREQUESTEDSERVICE_MODELELEMENT_EXTOPDEMAND, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PAREQUESTEDSERVICE_MODELELEMENT_PAREQUESTEDSERVICE_MODELELEMENT_EXTOPCOUNT, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PAREQUESTEDSERVICE_MODELELEMENT_PAREQUESTEDSERVICE_MODELELEMENT_BEHAVDEMAND, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PAREQUESTEDSERVICE_MODELELEMENT_PAREQUESTEDSERVICE_MODELELEMENT_BEHAVCOUNT, value);
        }
    }

    @objid ("6e351de2-3ff2-4dfc-9143-72096664b732")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PAREQUESTEDSERVICE_MODELELEMENT_PAREQUESTEDSERVICE_MODELELEMENT_NOSYNC, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PAREQUESTEDSERVICE_MODELELEMENT_PAREQUESTEDSERVICE_MODELELEMENT_NOSYNC),value);
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PAREQUESTEDSERVICE_MODELELEMENT_PAREQUESTEDSERVICE_MODELELEMENT_EXTOPDEMAND, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PAREQUESTEDSERVICE_MODELELEMENT_PAREQUESTEDSERVICE_MODELELEMENT_EXTOPDEMAND),value);
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PAREQUESTEDSERVICE_MODELELEMENT_PAREQUESTEDSERVICE_MODELELEMENT_EXTOPCOUNT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PAREQUESTEDSERVICE_MODELELEMENT_PAREQUESTEDSERVICE_MODELELEMENT_EXTOPCOUNT),value);
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PAREQUESTEDSERVICE_MODELELEMENT_PAREQUESTEDSERVICE_MODELELEMENT_BEHAVDEMAND, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PAREQUESTEDSERVICE_MODELELEMENT_PAREQUESTEDSERVICE_MODELELEMENT_BEHAVDEMAND),value);
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PAREQUESTEDSERVICE_MODELELEMENT_PAREQUESTEDSERVICE_MODELELEMENT_BEHAVCOUNT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PAREQUESTEDSERVICE_MODELELEMENT_PAREQUESTEDSERVICE_MODELELEMENT_BEHAVCOUNT),value);
    }

}
