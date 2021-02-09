package org.modelio.module.marte.profile.sam.propertys;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SaAnalysisContext_CollaborationProperty implements IPropertyContent {
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAANALYSISCONTEXT_COLLABORATION_SAANALYSISCONTEXT_COLLABORATION_ISSCHED, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAANALYSISCONTEXT_COLLABORATION_SAANALYSISCONTEXT_COLLABORATION_OPTCRITERION, value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAANALYSISCONTEXT_COLLABORATION_SAANALYSISCONTEXT_COLLABORATION_ISSCHED)
                ,ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SAANALYSISCONTEXT_COLLABORATION_SAANALYSISCONTEXT_COLLABORATION_ISSCHED, elt));
        
        String value_optCriterion = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAANALYSISCONTEXT_COLLABORATION_SAANALYSISCONTEXT_COLLABORATION_OPTCRITERION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAANALYSISCONTEXT_COLLABORATION_SAANALYSISCONTEXT_COLLABORATION_OPTCRITERION),value_optCriterion);
    }

}
