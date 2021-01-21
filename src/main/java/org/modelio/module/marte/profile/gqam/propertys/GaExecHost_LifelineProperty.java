package org.modelio.module.marte.profile.gqam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("c28019f9-a4cb-4c8b-8911-db0f6c6c9519")
public class GaExecHost_LifelineProperty implements IPropertyContent {
    @objid ("994848ee-2c70-4a85-b9f4-02bbd0b4e980")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if (row == 1) {        
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_COMMTXOVH, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_COMMRCVOVH, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_CNTXTSWT, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_CLOCKOVH, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_SCHEDPRIRANGE, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_MEMSIZE, value);
        }
        else if(row == 7){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_UTILIZATION, value);
        }
        else if(row == 8){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_THROUGHPUT, value);
        }
        else if(row == 9){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_ISPREEMPTIBLE, value);
        }
        else if(row == 10){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_SCHEDPOLICY, value);
        }
        else if(row == 11){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_OTHERSCHEDPOLICY, value);
        }
        else if(row == 12){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_SCHEDULE, value);
        }
        else if(row == 13){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_PROCESSINGUNITS, value);
        }
        else if(row == 14){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_HOST, value);
        }
        else if(row == 15){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_PROTECTEDSHAREDRESOURCES, value);        
        }
        else if(row == 16){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_SCHEDULABLERESOURCES, value);        
        }
    }

    @objid ("a0bbb762-32c7-4f0d-b943-11380da5ae49")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Ga Execution Host
        //
        
        String value_commTxOvh = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_COMMTXOVH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_COMMTXOVH),value_commTxOvh);
        
        String value_commRcvOvh = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_COMMRCVOVH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_COMMRCVOVH),value_commRcvOvh);
        
        String value_cntxtSwT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_CNTXTSWT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_CNTXTSWT),value_cntxtSwT);
        
        String value_clockOvh = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_CLOCKOVH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_CLOCKOVH),value_clockOvh);
        
        String value_schedPriRange = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_SCHEDPRIRANGE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_SCHEDPRIRANGE),value_schedPriRange);
        
        String value_memSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_MEMSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_MEMSIZE),value_memSize);
        
        String value_utilization = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_UTILIZATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_UTILIZATION),value_utilization);
        
        String value_throughput = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_THROUGHPUT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_THROUGHPUT),value_throughput);
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_ISPREEMPTIBLE),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_ISPREEMPTIBLE, elt));
        
        String value_schedPolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_SCHEDPOLICY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_SCHEDPOLICY),value_schedPolicy);
        
        String value_otherSchedPolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_OTHERSCHEDPOLICY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_OTHERSCHEDPOLICY),value_otherSchedPolicy);
        
        String value_schedule = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_SCHEDULE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_SCHEDULE),value_schedule);
        
        String value_processingUnits = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_PROCESSINGUNITS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_PROCESSINGUNITS),value_processingUnits);
        
        String value_host = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_HOST, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_HOST),value_host);
        
        String value_protectedSharedRsources = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_PROTECTEDSHAREDRESOURCES, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_PROTECTEDSHAREDRESOURCES),value_protectedSharedRsources);
        
        String value_schedulableResources = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_SCHEDULABLERESOURCES, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_SCHEDULABLERESOURCES),value_schedulableResources);
    }

}
