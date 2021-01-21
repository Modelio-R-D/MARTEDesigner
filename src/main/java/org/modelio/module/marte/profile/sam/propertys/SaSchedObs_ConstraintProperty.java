package org.modelio.module.marte.profile.sam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("e78e45fa-71b8-4fc8-a603-ec5c697f7bb0")
public class SaSchedObs_ConstraintProperty implements IPropertyContent {
    @objid ("4ae745c9-c698-435c-8db6-a0011048043e")
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

    @objid ("18873ee2-26ba-431a-b13a-9308c90c11f9")
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
