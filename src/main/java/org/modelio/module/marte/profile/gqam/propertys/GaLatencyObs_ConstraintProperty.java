package org.modelio.module.marte.profile.gqam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("ce019a0f-6c60-4d34-8951-5733764ce18f")
public class GaLatencyObs_ConstraintProperty implements IPropertyContent {
    @objid ("be24b67a-f988-4d7a-9c03-dbfb5cbabf0c")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GALATENCYOBS_CONSTRAINT_GALATENCYOBS_CONSTRAINT_LATENCY, value);
        }
        if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GALATENCYOBS_CONSTRAINT_GALATENCYOBS_CONSTRAINT_MISS, value);
        }
        if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GALATENCYOBS_CONSTRAINT_GALATENCYOBS_CONSTRAINT_UTILITY, value);
        }
        if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GALATENCYOBS_CONSTRAINT_GALATENCYOBS_CONSTRAINT_MAXJITTER, value);
        }
    }

    @objid ("4751871f-4cbb-4e06-9002-39958c5ab2df")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_latency = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GALATENCYOBS_CONSTRAINT_GALATENCYOBS_CONSTRAINT_LATENCY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GALATENCYOBS_CONSTRAINT_GALATENCYOBS_CONSTRAINT_LATENCY),value_latency);
        
        String value_miss = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GALATENCYOBS_CONSTRAINT_GALATENCYOBS_CONSTRAINT_MISS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GALATENCYOBS_CONSTRAINT_GALATENCYOBS_CONSTRAINT_MISS),value_miss);
               
        String value_utility = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GALATENCYOBS_CONSTRAINT_GALATENCYOBS_CONSTRAINT_UTILITY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GALATENCYOBS_CONSTRAINT_GALATENCYOBS_CONSTRAINT_UTILITY),value_utility);
        
        String value_maxJitter = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GALATENCYOBS_CONSTRAINT_GALATENCYOBS_CONSTRAINT_MAXJITTER, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GALATENCYOBS_CONSTRAINT_GALATENCYOBS_CONSTRAINT_MAXJITTER),value_maxJitter);
    }

}
