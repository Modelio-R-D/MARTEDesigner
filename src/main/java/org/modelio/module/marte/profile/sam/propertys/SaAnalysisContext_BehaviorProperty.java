package org.modelio.module.marte.profile.sam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("94aea92f-03a8-48e7-a157-f7be9b6a7a13")
public class SaAnalysisContext_BehaviorProperty implements IPropertyContent {
    @objid ("3fa5e083-e5e9-4985-9b6e-2e45f820a044")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAANALYSISCONTEXT_BEHAVIOR_SAANALYSISCONTEXT_BEHAVIOR_ISSCHED, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAANALYSISCONTEXT_BEHAVIOR_SAANALYSISCONTEXT_BEHAVIOR_OPTCRITERION, value);
        }
    }

    @objid ("5eaba707-7c2c-4e89-b5b9-1597ea76f520")
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
