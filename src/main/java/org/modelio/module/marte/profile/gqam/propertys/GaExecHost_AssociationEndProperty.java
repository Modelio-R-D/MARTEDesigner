package org.modelio.module.marte.profile.gqam.propertys;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class GaExecHost_AssociationEndProperty implements IPropertyContent {
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if (row == 1) {        
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_COMMTXOVH, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_COMMRCVOVH, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_CNTXTSWT, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_CLOCKOVH, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_SCHEDPRIRANGE, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_MEMSIZE, value);
        }
        else if(row == 7){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_UTILIZATION, value);
        }
        else if(row == 8){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_THROUGHPUT, value);
        }
        else if(row == 9){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_ISPREEMPTIBLE, value);
        }
        else if(row == 10){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_SCHEDPOLICY, value);
        }
        else if(row == 11){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_OTHERSCHEDPOLICY, value);
        }
        else if(row == 12){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_SCHEDULE, value);
        }
        else if(row == 13){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_PROCESSINGUNITS, value);
        }
        else if(row == 14){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_HOST, value);
        }
        else if(row == 15){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES, value);        
        }
        else if(row == 16){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_SCHEDULABLERESOURCES, value);        
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Ga Execution Host
        //
        
        String value_commTxOvh = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_COMMTXOVH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_COMMTXOVH),value_commTxOvh);
        
        String value_commRcvOvh = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_COMMRCVOVH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_COMMRCVOVH),value_commRcvOvh);
        
        String value_cntxtSwT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_CNTXTSWT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_CNTXTSWT),value_cntxtSwT);
        
        String value_clockOvh = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_CLOCKOVH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_CLOCKOVH),value_clockOvh);
        
        String value_schedPriRange = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_SCHEDPRIRANGE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_SCHEDPRIRANGE),value_schedPriRange);
        
        String value_memSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_MEMSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_MEMSIZE),value_memSize);
        
        String value_utilization = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_UTILIZATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_UTILIZATION),value_utilization);
        
        String value_throughput = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_THROUGHPUT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_THROUGHPUT),value_throughput);
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_ISPREEMPTIBLE),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_ISPREEMPTIBLE, elt));
        
        String value_schedPolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_SCHEDPOLICY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_SCHEDPOLICY),value_schedPolicy);
        
        String value_otherSchedPolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_OTHERSCHEDPOLICY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_OTHERSCHEDPOLICY),value_otherSchedPolicy);
        
        String value_schedule = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_SCHEDULE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_SCHEDULE),value_schedule);
        
        String value_processingUnits = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_PROCESSINGUNITS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_PROCESSINGUNITS),value_processingUnits);
        
        String value_host = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_HOST, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_HOST),value_host);
        
        String value_protectedSharedRsources = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES),value_protectedSharedRsources);
        
        String value_schedulableResources = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_SCHEDULABLERESOURCES, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_SCHEDULABLERESOURCES),value_schedulableResources);
    }

}
