package org.modelio.module.marte.profile.gcm.propertys;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.MARTESearchUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("3ccdf405-39e2-49b3-9b9f-d6ddd17c58d7")
public class GCMInvocationAction_ActivityActionProperty implements IPropertyContent {
    @objid ("ac1a68f0-444e-4ebf-8995-acbe54a3c580")
    private static List<ModelElement> features;

    @objid ("674659d7-92ea-4c58-8fc7-0f9065b2e480")
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

    @objid ("141c2f39-a1aa-4f39-9115-30e2ab40f947")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        features = MARTESearchUtils.searchFeature();   
        String[] tab_feature = ModelUtils.createListString(features);      
        String value_feature = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ONFEATURE_GCMINVOCATIONACTION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GCMINVOCATIONACTION_ACTIVITYACTION_GCMINVOCATIONACTION_ACTIVITYACTION_ONFEATURE), value_feature, tab_feature);
    }

}
