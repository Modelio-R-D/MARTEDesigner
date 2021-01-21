package org.modelio.module.marte.profile.pam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("58d1dca4-0f05-4f6f-827b-5880f8e63004")
public class PaRunTInstance_ModelElementProperty implements IPropertyContent {
    @objid ("e35e8233-50e0-47ad-b323-fc86d0c3aa81")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PARUNTINSTANCE_MODELELEMENT_PARUNTINSTANCE_MODELELEMENT_POOLSIZE, value);
        }
        else if(row == 2){
            ModelUtils.addBooleanValue(elt, MARTEDesignerTagTypes.PARUNTINSTANCE_MODELELEMENT_PARUNTINSTANCE_MODELELEMENT_UNBDDPOOL, Boolean.valueOf(value));
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PARUNTINSTANCE_MODELELEMENT_PARUNTINSTANCE_MODELELEMENT_INSTANCE, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PARUNTINSTANCE_MODELELEMENT_PARUNTINSTANCE_MODELELEMENT_HOST, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PARUNTINSTANCE_MODELELEMENT_PARUNTINSTANCE_MODELELEMENT_UTILIZATION, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PARUNTINSTANCE_MODELELEMENT_PARUNTINSTANCE_MODELELEMENT_THROUGHPUT, value);
        }
    }

    @objid ("b251d019-2124-49bc-8061-3ba966de2aa0")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PARUNTINSTANCE_MODELELEMENT_PARUNTINSTANCE_MODELELEMENT_POOLSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PARUNTINSTANCE_MODELELEMENT_PARUNTINSTANCE_MODELELEMENT_POOLSIZE),value);
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PARUNTINSTANCE_MODELELEMENT_PARUNTINSTANCE_MODELELEMENT_UNBDDPOOL, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PARUNTINSTANCE_MODELELEMENT_PARUNTINSTANCE_MODELELEMENT_UNBDDPOOL),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.PARUNTINSTANCE_MODELELEMENT_PARUNTINSTANCE_MODELELEMENT_UNBDDPOOL, elt));
               
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PARUNTINSTANCE_MODELELEMENT_PARUNTINSTANCE_MODELELEMENT_INSTANCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PARUNTINSTANCE_MODELELEMENT_PARUNTINSTANCE_MODELELEMENT_INSTANCE),value);
            
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PARUNTINSTANCE_MODELELEMENT_PARUNTINSTANCE_MODELELEMENT_HOST, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PARUNTINSTANCE_MODELELEMENT_PARUNTINSTANCE_MODELELEMENT_HOST),value);
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PARUNTINSTANCE_MODELELEMENT_PARUNTINSTANCE_MODELELEMENT_UTILIZATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PARUNTINSTANCE_MODELELEMENT_PARUNTINSTANCE_MODELELEMENT_UTILIZATION),value);
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PARUNTINSTANCE_MODELELEMENT_PARUNTINSTANCE_MODELELEMENT_THROUGHPUT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PARUNTINSTANCE_MODELELEMENT_PARUNTINSTANCE_MODELELEMENT_THROUGHPUT),value);
    }

}
