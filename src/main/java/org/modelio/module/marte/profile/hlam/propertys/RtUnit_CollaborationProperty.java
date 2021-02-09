package org.modelio.module.marte.profile.hlam.propertys;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class RtUnit_CollaborationProperty implements IPropertyContent {
    private List<ModelElement> behavior = null;

    private List<ModelElement> operation = null;

    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addBooleanValue(elt, MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_ISDYNAMIC, Boolean.valueOf(value));
        }
        else if(row == 2){
            ModelUtils.addBooleanValue(elt, MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_ISMAIN, Boolean.valueOf(value));
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_SRPOOLSIZE, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_SRPOOLPOLICY, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_SRPOOLWAITINGTIME, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_QUEUESCHEDPOLICY, value);
        }
        else if(row == 7){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_QUEUESIZE, value);
        }
        else if(row == 8){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_MSGMAXSIZE, value);
        }
        else if(row == 9){
            this.behavior = ModelUtils.searchElement(Behavior.class);
            ModelUtils.manageSingleOrientedLink(elt, 
                    this.behavior, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_OPERATIONMODE_RTUNIT_BEHAVIOR, 
        //                    MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_OPERATIONALMODE, 
                    value
            );
        }        
        else if(row == 10){
            this.operation = ModelUtils.searchElement(Operation.class);
            ModelUtils.manageSingleOrientedLink(elt, 
                    this.operation, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MAIN_RTUNIT_OPERATION, 
        //                    MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_MAIN, 
                    value
            );
        }
        else if(row == 11){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_MEMORYSIZE, value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        //isDynamic
        //
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_ISDYNAMIC),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_ISDYNAMIC, elt));
        
        //
        //isMain
        //
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_ISMAIN),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_ISMAIN, elt));
        
        //
        //SrPoolSize
        //
        String value_srPoolSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_SRPOOLSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_SRPOOLSIZE),value_srPoolSize);
        
        //
        //SrPoolPolicy
        //
        String[] types = MARTEEnumerationUtils.getPoolMgtPolicyKind();
        String value_protectKind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_SRPOOLPOLICY, elt);
        if(!(MARTEEnumerationUtils.isPoolMgtPolicyKind(value_protectKind))){
            value_protectKind = "other";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_SRPOOLPOLICY),value_protectKind, types);
        
        //
        //SrPoolWaitingTime
        //
        String value_srPoolWaitingTime = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_SRPOOLWAITINGTIME, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_SRPOOLWAITINGTIME),value_srPoolWaitingTime);
        
        
        //
        //QueueSchedPolicy
        //
        
        types = MARTEEnumerationUtils.getSchedPolicyKind();
        String value_queueSchedPolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_QUEUESCHEDPOLICY, elt);
        if(!(MARTEEnumerationUtils.isSchedPolicyKind(value_queueSchedPolicy))){
            value_queueSchedPolicy = "Other";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_QUEUESCHEDPOLICY),value_queueSchedPolicy, types);
        
        //
        //QueueSize
        //
        String value_queueSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_QUEUESIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_QUEUESIZE),value_queueSize);
        
        //
        //MsgMaxSize
        //
        String value_msgMaxSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_MSGMAXSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_MSGMAXSIZE),value_msgMaxSize);
        
        
        //
        //operationMode
        //
        this.behavior = ModelUtils.searchElement(Behavior.class);
        String[] tab_operationalMode = ModelUtils.createListString(this.behavior);      
        String value_operationalMode = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_OPERATIONMODE_RTUNIT_BEHAVIOR, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_OPERATIONALMODE), value_operationalMode, tab_operationalMode);
        
        //
        //main
        //
        
        this.operation = ModelUtils.searchElement(Operation.class);
        String[] tab_main = ModelUtils.createListString(this.operation);      
        String value_main = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MAIN_RTUNIT_OPERATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_MAIN), value_main, tab_main);
        
        
        //
        //memorySize
        //
        String value_memorySize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_MEMORYSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_MEMORYSIZE),value_memorySize);
    }

}
