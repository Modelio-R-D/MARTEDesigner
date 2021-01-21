package org.modelio.module.marte.profile.sam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("c5b15ba7-113e-41b8-9e4b-aa29c8e0ecf0")
public class SaAnalysisContext_ClassProperty implements IPropertyContent {
    @objid ("f6da96b3-fc4b-49f0-b4b3-1080f9f84124")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAANALYSISCONTEXT_CLASS_SAANALYSISCONTEXT_CLASS_ISSCHED, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAANALYSISCONTEXT_CLASS_SAANALYSISCONTEXT_CLASS_OPTCRITERION, value);
        }
    }

    @objid ("f67c4a2c-f745-4332-a591-a70121d07706")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAANALYSISCONTEXT_CLASS_SAANALYSISCONTEXT_CLASS_ISSCHED),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SAANALYSISCONTEXT_CLASS_SAANALYSISCONTEXT_CLASS_ISSCHED, elt));
        
        String value_optCriterion = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAANALYSISCONTEXT_CLASS_SAANALYSISCONTEXT_CLASS_OPTCRITERION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAANALYSISCONTEXT_CLASS_SAANALYSISCONTEXT_CLASS_OPTCRITERION),value_optCriterion);
    }

}
