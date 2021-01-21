package org.modelio.module.marte.profile.sam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("4927b6c3-a7ac-441d-91b6-cca6acaeb535")
public class SaAnalysisContext_NodeProperty implements IPropertyContent {
    @objid ("8efcb905-7ed6-4685-bffd-4f1756ac1b38")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAANALYSISCONTEXT_NODE_SAANALYSISCONTEXT_NODE_ISSCHED, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAANALYSISCONTEXT_NODE_SAANALYSISCONTEXT_NODE_OPTCRITERION, value);
        }
    }

    @objid ("6969d2a1-5dca-43b0-883a-f400d2a72191")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAANALYSISCONTEXT_NODE_SAANALYSISCONTEXT_NODE_ISSCHED)
                ,ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SAANALYSISCONTEXT_NODE_SAANALYSISCONTEXT_NODE_ISSCHED, elt));
        
        
        String value_optCriterion = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAANALYSISCONTEXT_NODE_SAANALYSISCONTEXT_NODE_OPTCRITERION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAANALYSISCONTEXT_NODE_SAANALYSISCONTEXT_NODE_OPTCRITERION),value_optCriterion);
    }

}