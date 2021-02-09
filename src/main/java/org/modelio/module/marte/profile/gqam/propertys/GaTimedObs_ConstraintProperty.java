package org.modelio.module.marte.profile.gqam.propertys;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class GaTimedObs_ConstraintProperty implements IPropertyContent {
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GATIMEDOBS_CONSTRAINT_GATIMEDOBS_CONSTRAINT_LAXITY, value);
        }
        if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GATIMEDOBS_CONSTRAINT_GATIMEDOBS_CONSTRAINT_STARTOBS, value);
        }
        if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GATIMEDOBS_CONSTRAINT_GATIMEDOBS_CONSTRAINT_ENDOBS, value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String[] types_laxitykind = MARTEEnumerationUtils.getLaxityKind();
        String value_laxitykind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GATIMEDOBS_CONSTRAINT_GATIMEDOBS_CONSTRAINT_LAXITY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GATIMEDOBS_CONSTRAINT_GATIMEDOBS_CONSTRAINT_LAXITY),value_laxitykind, types_laxitykind);
        
        String value_startObs = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GATIMEDOBS_CONSTRAINT_GATIMEDOBS_CONSTRAINT_STARTOBS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GATIMEDOBS_CONSTRAINT_GATIMEDOBS_CONSTRAINT_STARTOBS),value_startObs);
        
              
        String value_endObs = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GATIMEDOBS_CONSTRAINT_GATIMEDOBS_CONSTRAINT_ENDOBS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GATIMEDOBS_CONSTRAINT_GATIMEDOBS_CONSTRAINT_ENDOBS),value_endObs);
    }

}
