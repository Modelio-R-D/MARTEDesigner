package org.modelio.module.marte.profile.gcm.propertys;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.MARTESearchUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class GCMInvocationAction_ActivityActionProperty implements IPropertyContent {
    private static List<ModelElement> features;

    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageSingleOrientedLink(elt, 
                                                features, 
                                                MARTEDesignerStereotypes.PROFILEASSOCIATION_ONFEATURE_GCMINVOCATIONACTION, 
        //                                                MARTEDesignerTagTypes.GCMINVOCATIONACTION_ACTIVITYACTION_GCMINVOCATIONACTION_ACTIVITYACTION_ONFEATURE,
                                                value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        features = MARTESearchUtils.searchFeature();   
        String[] tab_feature = ModelUtils.createListString(features);      
        String value_feature = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ONFEATURE_GCMINVOCATIONACTION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GCMINVOCATIONACTION_ACTIVITYACTION_GCMINVOCATIONACTION_ACTIVITYACTION_ONFEATURE), value_feature, tab_feature);
    }

}
