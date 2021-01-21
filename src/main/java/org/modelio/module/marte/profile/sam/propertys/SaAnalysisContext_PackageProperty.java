package org.modelio.module.marte.profile.sam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("65baa194-3a15-4e45-8b33-6ed22b0b5b01")
public class SaAnalysisContext_PackageProperty implements IPropertyContent {
    @objid ("fa7370f9-d7af-405b-88b7-af90b31985b6")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAANALYSISCONTEXT_PACKAGE_SAANALYSISCONTEXT_PACKAGE_ISSCHED, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt,  MARTEDesignerTagTypes.SAANALYSISCONTEXT_PACKAGE_SAANALYSISCONTEXT_PACKAGE_OPTCRITERION, value);
        }
    }

    @objid ("9a459305-7f7d-4466-8b82-98d89675bcc8")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addProperty(MARTEResourceManager.getPropertyName( MARTEDesignerTagTypes.SAANALYSISCONTEXT_PACKAGE_SAANALYSISCONTEXT_PACKAGE_ISSCHED)
                ,ModelUtils.hasTaggedValue( MARTEDesignerTagTypes.SAANALYSISCONTEXT_PACKAGE_SAANALYSISCONTEXT_PACKAGE_ISSCHED, elt));
               
        
        String value_optCriterion = ModelUtils.getTaggedValue( MARTEDesignerTagTypes.SAANALYSISCONTEXT_PACKAGE_SAANALYSISCONTEXT_PACKAGE_OPTCRITERION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName( MARTEDesignerTagTypes.SAANALYSISCONTEXT_PACKAGE_SAANALYSISCONTEXT_PACKAGE_OPTCRITERION),value_optCriterion);
    }

}
