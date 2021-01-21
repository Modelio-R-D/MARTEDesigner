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

@objid ("5747ba5d-e4ff-4e82-811f-2fe8ae6c8a6a")
public class RtUnit_ClassProperty implements IPropertyContent {
    @objid ("36809111-3d58-4ec7-a161-7f75497848ec")
    private List<ModelElement> behavior = null;

    @objid ("6fdacc63-670f-4400-9c38-1e0f65407fbf")
    private List<ModelElement> operation = null;

    @objid ("744e57a4-a7fc-40d9-b146-5a6c81f2545d")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addBooleanValue(elt, MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_ISDYNAMIC, Boolean.valueOf(value));
        }
        else if(row == 2){
            ModelUtils.addBooleanValue(elt, MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_ISMAIN, Boolean.valueOf(value));
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_SRPOOLSIZE, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_SRPOOLPOLICY, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_SRPOOLWAITINGTIME, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_QUEUESCHEDPOLICY, value);
        }
        else if(row == 7){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_QUEUESIZE, value);
        }
        else if(row == 8){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_MSGMAXSIZE, value);
        }
        else if(row == 9){
            this.behavior = ModelUtils.searchElement(Behavior.class);
            ModelUtils.manageSingleOrientedLink(elt, 
                    this.behavior, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_OPERATIONMODE_RTUNIT_BEHAVIOR, 
        //                    MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_OPERATIONALMODE, 
                    value
            );
        }        
        else if(row == 10){
            this.operation = ModelUtils.searchElement(Operation.class);
            ModelUtils.manageSingleOrientedLink(elt, 
                    this.operation, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MAIN_RTUNIT_OPERATION, 
        //                    MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_MAIN, 
                    value
            );
        }
        else if(row == 11){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_MEMORYSIZE, value);
        }
    }

    @objid ("db63c7cf-9038-43d0-9495-bf3438acf82c")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        //isDynamic
        //
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_ISDYNAMIC),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_ISDYNAMIC, elt));
        
        //
        //isMain
        //
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_ISMAIN),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_ISMAIN, elt));
        
        //
        //SrPoolSize
        //
        String value_srPoolSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_SRPOOLSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_SRPOOLSIZE),value_srPoolSize);
        
        //
        //SrPoolPolicy
        //
        String[] types = MARTEEnumerationUtils.getPoolMgtPolicyKind();
        String value_protectKind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_SRPOOLPOLICY, elt);
        if(!(MARTEEnumerationUtils.isPoolMgtPolicyKind(value_protectKind))){
            value_protectKind = "other";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_SRPOOLPOLICY),value_protectKind, types);
        
        //
        //SrPoolWaitingTime
        //
        String value_srPoolWaitingTime = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_SRPOOLWAITINGTIME, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_SRPOOLWAITINGTIME),value_srPoolWaitingTime);
        
        
        //
        //QueueSchedPolicy
        //
        
        types = MARTEEnumerationUtils.getSchedPolicyKind();
        String value_queueSchedPolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_QUEUESCHEDPOLICY, elt);
        if(!(MARTEEnumerationUtils.isSchedPolicyKind(value_queueSchedPolicy))){
            value_queueSchedPolicy = "Other";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_QUEUESCHEDPOLICY),value_queueSchedPolicy, types);
        
        //
        //QueueSize
        //
        String value_queueSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_QUEUESIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_QUEUESIZE),value_queueSize);
        
        //
        //MsgMaxSize
        //
        String value_msgMaxSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_MSGMAXSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_MSGMAXSIZE),value_msgMaxSize);
        
        
        //
        //operationMode
        //
        this.behavior = ModelUtils.searchElement(Behavior.class);
        String[] tab_operationalMode = ModelUtils.createListString(this.behavior);      
        String value_operationalMode = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_OPERATIONMODE_RTUNIT_BEHAVIOR, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_OPERATIONALMODE), value_operationalMode, tab_operationalMode);
        
        //
        //main
        //
        
        this.operation = ModelUtils.searchElement(Operation.class);
        String[] tab_main = ModelUtils.createListString(this.operation);      
        String value_main = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MAIN_RTUNIT_OPERATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_MAIN), value_main, tab_main);
        
        
        //
        //memorySize
        //
        String value_memorySize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_MEMORYSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_MEMORYSIZE),value_memorySize);
    }

}
