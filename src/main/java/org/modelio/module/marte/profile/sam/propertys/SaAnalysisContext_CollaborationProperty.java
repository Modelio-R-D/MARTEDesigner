package org.modelio.module.marte.profile.sam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("58cdc0f5-bdcb-4160-a680-9898e985cca1")
public class SaAnalysisContext_CollaborationProperty implements IPropertyContent {
    @objid ("135d3765-dea0-4491-b949-73c0d6d1c310")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAANALYSISCONTEXT_COLLABORATION_SAANALYSISCONTEXT_COLLABORATION_ISSCHED, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAANALYSISCONTEXT_COLLABORATION_SAANALYSISCONTEXT_COLLABORATION_OPTCRITERION, value);
        }
    }

    @objid ("d90e5e6d-2016-456f-bade-6a27c846d1ce")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAANALYSISCONTEXT_COLLABORATION_SAANALYSISCONTEXT_COLLABORATION_ISSCHED)
                ,ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SAANALYSISCONTEXT_COLLABORATION_SAANALYSISCONTEXT_COLLABORATION_ISSCHED, elt));
        
        String value_optCriterion = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAANALYSISCONTEXT_COLLABORATION_SAANALYSISCONTEXT_COLLABORATION_OPTCRITERION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAANALYSISCONTEXT_COLLABORATION_SAANALYSISCONTEXT_COLLABORATION_OPTCRITERION),value_optCriterion);
    }

}
