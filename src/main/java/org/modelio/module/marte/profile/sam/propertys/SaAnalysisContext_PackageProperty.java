package org.modelio.module.marte.profile.sam.propertys;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SaAnalysisContext_PackageProperty implements IPropertyContent {
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAANALYSISCONTEXT_PACKAGE_SAANALYSISCONTEXT_PACKAGE_ISSCHED, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt,  MARTEDesignerTagTypes.SAANALYSISCONTEXT_PACKAGE_SAANALYSISCONTEXT_PACKAGE_OPTCRITERION, value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addProperty(MARTEResourceManager.getPropertyName( MARTEDesignerTagTypes.SAANALYSISCONTEXT_PACKAGE_SAANALYSISCONTEXT_PACKAGE_ISSCHED)
                ,ModelUtils.hasTaggedValue( MARTEDesignerTagTypes.SAANALYSISCONTEXT_PACKAGE_SAANALYSISCONTEXT_PACKAGE_ISSCHED, elt));
               
        
        String value_optCriterion = ModelUtils.getTaggedValue( MARTEDesignerTagTypes.SAANALYSISCONTEXT_PACKAGE_SAANALYSISCONTEXT_PACKAGE_OPTCRITERION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName( MARTEDesignerTagTypes.SAANALYSISCONTEXT_PACKAGE_SAANALYSISCONTEXT_PACKAGE_OPTCRITERION),value_optCriterion);
    }

}
