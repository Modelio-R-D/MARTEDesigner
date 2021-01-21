package org.modelio.module.marte.profile.hlam.propertys;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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

@objid ("57ad65ca-b6b0-4c82-a36a-0fed7af8540b")
public class RtUnit_ActorProperty implements IPropertyContent {
    @objid ("0c14518b-67f0-4adb-8174-5e012528ee57")
    private List<ModelElement> behavior = null;

    @objid ("25064629-40c9-4f18-8e8c-91d4f7eb0e4b")
    private List<ModelElement> operation = null;

    @objid ("8fd5f630-2d6e-4eff-b812-e20e6092787e")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addBooleanValue(elt, MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_ISDYNAMIC, Boolean.valueOf(value));
        }
        else if(row == 2){
            ModelUtils.addBooleanValue(elt, MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_ISMAIN, Boolean.valueOf(value));
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_SRPOOLSIZE, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_SRPOOLPOLICY, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_SRPOOLWAITINGTIME, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_QUEUESCHEDPOLICY, value);
        }
        else if(row == 7){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_QUEUESIZE, value);
        }
        else if(row == 8){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_MSGMAXSIZE, value);
        }
        else if(row == 9){
            this.behavior = ModelUtils.searchElement(Behavior.class);
            ModelUtils.manageSingleOrientedLink(elt, 
                    this.behavior, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_OPERATIONMODE_RTUNIT_BEHAVIOR, 
        //                    MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_OPERATIONALMODE, 
                    value
            );
        }        
        else if(row == 10){
            this.operation = ModelUtils.searchElement(Operation.class);
            ModelUtils.manageSingleOrientedLink(elt, 
                    this.operation, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MAIN_RTUNIT_OPERATION, 
        //                    MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_MAIN, 
                    value
            );
        }
        else if(row == 11){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_MEMORYSIZE, value);
        }
    }

    @objid ("98497284-a26c-465c-bc8f-e20bde2d7989")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        //isDynamic
        //
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_ISDYNAMIC),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_ISDYNAMIC, elt));
        
        //
        //isMain
        //
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_ISMAIN),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_ISMAIN, elt));
        
        //
        //SrPoolSize
        //
        String value_srPoolSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_SRPOOLSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_SRPOOLSIZE),value_srPoolSize);
        
        //
        //SrPoolPolicy
        //
        String[] types = MARTEEnumerationUtils.getPoolMgtPolicyKind();
        String value_protectKind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_SRPOOLPOLICY, elt);
        if(!(MARTEEnumerationUtils.isPoolMgtPolicyKind(value_protectKind))){
            value_protectKind = "other";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_SRPOOLPOLICY),value_protectKind, types);
        
        //
        //SrPoolWaitingTime
        //
        String value_srPoolWaitingTime = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_SRPOOLWAITINGTIME, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_SRPOOLWAITINGTIME),value_srPoolWaitingTime);
        
        
        //
        //QueueSchedPolicy
        //
        
        types = MARTEEnumerationUtils.getSchedPolicyKind();
        String value_queueSchedPolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_QUEUESCHEDPOLICY, elt);
        if(!(MARTEEnumerationUtils.isSchedPolicyKind(value_queueSchedPolicy))){
            value_queueSchedPolicy = "Other";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_QUEUESCHEDPOLICY),value_queueSchedPolicy, types);
             
        //
        //QueueSize
        //
        String value_queueSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_QUEUESIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_QUEUESIZE),value_queueSize);
        
        //
        //MsgMaxSize
        //
        String value_msgMaxSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_MSGMAXSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_MSGMAXSIZE),value_msgMaxSize);
        
        
        //
        //operationMode
        //
        this.behavior = ModelUtils.searchElement(Behavior.class);
        String[] tab_operationalMode = ModelUtils.createListString(this.behavior);      
        String value_operationalMode = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_OPERATIONMODE_RTUNIT_BEHAVIOR, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_OPERATIONALMODE), value_operationalMode, tab_operationalMode);
          
        //
        //main
        //
        
        this.operation = ModelUtils.searchElement(Operation.class);
        String[] tab_main = ModelUtils.createListString(this.operation);      
        String value_main = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MAIN_RTUNIT_OPERATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_MAIN), value_main, tab_main);
          
               
        //
        //memorySize
        //
        String value_memorySize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_MEMORYSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_MEMORYSIZE),value_memorySize);
    }

}
