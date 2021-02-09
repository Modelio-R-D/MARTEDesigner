package org.modelio.module.marte.profile.sam.propertys;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SaSchedObs_ConstraintProperty implements IPropertyContent {
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASCHEDOBS_CONSTRAINT_SASCHEDOBS_CONSTRAINT_SUSPENTIONS, value);
        }
        if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASCHEDOBS_CONSTRAINT_SASCHEDOBS_CONSTRAINT_BLOCKT, value);
        }
        if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASCHEDOBS_CONSTRAINT_SASCHEDOBS_CONSTRAINT_OVERLAPS, value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_suspentions = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SASCHEDOBS_CONSTRAINT_SASCHEDOBS_CONSTRAINT_SUSPENTIONS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASCHEDOBS_CONSTRAINT_SASCHEDOBS_CONSTRAINT_SUSPENTIONS),value_suspentions);
        
        String value_blockT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SASCHEDOBS_CONSTRAINT_SASCHEDOBS_CONSTRAINT_BLOCKT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASCHEDOBS_CONSTRAINT_SASCHEDOBS_CONSTRAINT_BLOCKT),value_blockT);
        
        String value_overlaps = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SASCHEDOBS_CONSTRAINT_SASCHEDOBS_CONSTRAINT_OVERLAPS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASCHEDOBS_CONSTRAINT_SASCHEDOBS_CONSTRAINT_OVERLAPS),value_overlaps);
    }

}
