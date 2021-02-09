package org.modelio.module.marte.profile.sam.propertys;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SaAnalysisContext_BehaviorProperty implements IPropertyContent {
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAANALYSISCONTEXT_BEHAVIOR_SAANALYSISCONTEXT_BEHAVIOR_ISSCHED, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAANALYSISCONTEXT_BEHAVIOR_SAANALYSISCONTEXT_BEHAVIOR_OPTCRITERION, value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAANALYSISCONTEXT_BEHAVIOR_SAANALYSISCONTEXT_BEHAVIOR_ISSCHED)
                ,ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SAANALYSISCONTEXT_BEHAVIOR_SAANALYSISCONTEXT_BEHAVIOR_ISSCHED, elt));
        
        String[] optKind = MARTEEnumerationUtils.getOptimallityCriterionKind();
        String value_opt = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAANALYSISCONTEXT_BEHAVIOR_SAANALYSISCONTEXT_BEHAVIOR_OPTCRITERION, elt);
        if(!(MARTEEnumerationUtils.isOptimallityCriterionKind(value_opt))){
            value_opt = "undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAANALYSISCONTEXT_BEHAVIOR_SAANALYSISCONTEXT_BEHAVIOR_OPTCRITERION),value_opt, optKind);
    }

}
