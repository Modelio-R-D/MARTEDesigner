package org.modelio.module.marte.profile.gqam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("be4d9f1b-deff-4cf9-a9f2-d4787646a2df")
public class GaExecHost_LinkProperty implements IPropertyContent {
    @objid ("8d694877-680c-4b58-b1af-fc81e7494d58")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if (row == 1) {        
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_COMMTXOVH, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_COMMRCVOVH, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_CNTXTSWT, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_CLOCKOVH, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_SCHEDPRIRANGE, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_MEMSIZE, value);
        }
        else if(row == 7){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_UTILIZATION, value);
        }
        else if(row == 8){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_THROUGHPUT, value);
        }
        else if(row == 9){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_ISPREEMPTIBLE, value);
        }
        else if(row == 10){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_SCHEDPOLICY, value);
        }
        else if(row == 11){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_OTHERSCHEDPOLICY, value);
        }
        else if(row == 12){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_SCHEDULE, value);
        }
        else if(row == 13){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_PROCESSINGUNITS, value);
        }
        else if(row == 14){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_HOST, value);
        }
        else if(row == 15){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_PROTECTEDSHAREDRESOURCES, value);        
        }
        else if(row == 16){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_SCHEDULABLERESOURCES, value);        
        }
    }

    @objid ("e31641db-9865-46ee-a39c-d61b9bfcb2f2")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Ga Execution Host
        //
        
        String value_commTxOvh = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_COMMTXOVH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_COMMTXOVH),value_commTxOvh);
        
        String value_commRcvOvh = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_COMMRCVOVH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_COMMRCVOVH),value_commRcvOvh);
        
        String value_cntxtSwT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_CNTXTSWT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_CNTXTSWT),value_cntxtSwT);
        
        String value_clockOvh = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_CLOCKOVH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_CLOCKOVH),value_clockOvh);
        
        String value_schedPriRange = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_SCHEDPRIRANGE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_SCHEDPRIRANGE),value_schedPriRange);
        
        String value_memSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_MEMSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_MEMSIZE),value_memSize);
        
        String value_utilization = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_UTILIZATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_UTILIZATION),value_utilization);
        
        String value_throughput = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_THROUGHPUT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_THROUGHPUT),value_throughput);
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_ISPREEMPTIBLE),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_ISPREEMPTIBLE, elt));
        
        String value_schedPolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_SCHEDPOLICY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_SCHEDPOLICY),value_schedPolicy);
        
        String value_otherSchedPolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_OTHERSCHEDPOLICY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_OTHERSCHEDPOLICY),value_otherSchedPolicy);
        
        String value_schedule = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_SCHEDULE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_SCHEDULE),value_schedule);
        
        String value_processingUnits = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_PROCESSINGUNITS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_PROCESSINGUNITS),value_processingUnits);
        
        String value_host = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_HOST, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_HOST),value_host);
        
        String value_protectedSharedRsources = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_PROTECTEDSHAREDRESOURCES, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_PROTECTEDSHAREDRESOURCES),value_protectedSharedRsources);
        
        String value_schedulableResources = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_SCHEDULABLERESOURCES, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_SCHEDULABLERESOURCES),value_schedulableResources);
    }

}
