package org.modelio.module.marte.profile.gcm.propertys;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.MARTESearchUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("e27ee746-f78a-4efe-84e9-d200bb18b406")
public class GCMInvocatingBehavior_BehaviorProperty implements IPropertyContent {
    @objid ("a8f8f727-7ab7-4b8e-aea8-b6c0e67656fa")
    private static List<ModelElement> features;

    @objid ("03aa1a80-76a4-4264-99ee-9940e38701f1")
    private static List<ModelElement> ports;

    @objid ("b17d8e71-d7fe-47f8-b83a-7387394f1393")
    private static List<ModelElement> invocationActions;

    @objid ("94400b1b-93b6-4f81-b023-a0e1d446819f")
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

    @objid ("62ae27b5-42f2-4670-96c3-92cc74961d92")
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
