package org.modelio.module.marte.profile.gcm.propertys;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.MARTESearchUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class GCMInvocatingBehavior_BehaviorProperty implements IPropertyContent {
    private static List<ModelElement> features;

    private static List<ModelElement> ports;

    private static List<ModelElement> invocationActions;

    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageSingleOrientedLink(elt, 
                                                features, 
                                                MARTEDesignerStereotypes.PROFILEASSOCIATION_ONFEATURE_GCMINVOCATINGBEHAVIOR, 
        //                                                MARTEDesignerTagTypes.GCMINVOCATINGBEHAVIOR_BEHAVIOR_GCMINVOCATINGBEHAVIOR_BEHAVIOR_ONFEATURE,
                                                value);
        }
        else if(row == 2){
            ModelUtils.manageSingleOrientedLink(elt, 
                                                ports, 
                                                MARTEDesignerStereotypes.PROFILEASSOCIATION_ONPORT_GCMINVOCATINGBEHAVIOR, 
        //                                                MARTEDesignerTagTypes.GCMINVOCATINGBEHAVIOR_BEHAVIOR_GCMINVOCATINGBEHAVIOR_BEHAVIOR_ONPORT,
                                                value);
        }
        else if(row == 3){
            ModelUtils.manageSingleOrientedLink(elt, 
                                                invocationActions, 
                                                MARTEDesignerStereotypes.PROFILEASSOCIATION_INVOCATIONS_GCMINVOCATINGBEHAVIOR, 
        //                                                MARTEDesignerTagTypes.GCMINVOCATINGBEHAVIOR_BEHAVIOR_GCMINVOCATINGBEHAVIOR_BEHAVIOR_INVOCATIONS,
                                                value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        features = MARTESearchUtils.searchFeature();   
        String[] tab_feature = ModelUtils.createListString(features);      
        String value_feature = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ONFEATURE_GCMINVOCATINGBEHAVIOR, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GCMINVOCATINGBEHAVIOR_BEHAVIOR_GCMINVOCATINGBEHAVIOR_BEHAVIOR_ONFEATURE), value_feature, tab_feature);
        
        ports = MARTESearchUtils.searchPort();   
        String[] tab_port = ModelUtils.createListString(ports);      
        String value_port = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ONPORT_GCMINVOCATINGBEHAVIOR, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GCMINVOCATINGBEHAVIOR_BEHAVIOR_GCMINVOCATINGBEHAVIOR_BEHAVIOR_ONPORT), value_port, tab_port);
            
        
        invocationActions = ModelUtils.searchElementStereotyped(ActivityAction.class, MARTEDesignerStereotypes.GCMINVOCATIONACTION_ACTIVITYACTION);   
        String[] tab_invocations = ModelUtils.createListString(invocationActions);      
        String value_invocations = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_INVOCATIONS_GCMINVOCATINGBEHAVIOR, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GCMINVOCATINGBEHAVIOR_BEHAVIOR_GCMINVOCATINGBEHAVIOR_BEHAVIOR_INVOCATIONS), value_invocations, tab_invocations);
    }

}
