package org.modelio.module.marte.profile.gqam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("9717c108-e012-42b1-86b9-220007d7298c")
public class GaExecHost_AssociationProperty implements IPropertyContent {
    @objid ("ade77eba-33f6-458b-945d-f5eb1a6438e5")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if (row == 1) {        
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_COMMTXOVH, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_COMMRCVOVH, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_CNTXTSWT, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_CLOCKOVH, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_SCHEDPRIRANGE, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_MEMSIZE, value);
        }
        else if(row == 7){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_UTILIZATION, value);
        }
        else if(row == 8){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_THROUGHPUT, value);
        }
        else if(row == 9){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_ISPREEMPTIBLE, value);
        }
        else if(row == 10){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_SCHEDPOLICY, value);
        }
        else if(row == 11){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_OTHERSCHEDPOLICY, value);
        }
        else if(row == 12){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_SCHEDULE, value);
        }
        else if(row == 13){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_PROCESSINGUNITS, value);
        }
        else if(row == 14){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_HOST, value);
        }
        else if(row == 15){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_PROTECTEDSHAREDRESOURCES, value);        
        }
        else if(row == 16){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_SCHEDULABLERESOURCES, value);        
        }
    }

    @objid ("cea7730c-cff0-4974-b5fc-6da8ed68b387")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Ga Execution Host
        //
        
        String value_commTxOvh = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_COMMTXOVH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_COMMTXOVH),value_commTxOvh);
        
        String value_commRcvOvh = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_COMMRCVOVH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_COMMRCVOVH),value_commRcvOvh);
        
        String value_cntxtSwT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_CNTXTSWT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_CNTXTSWT),value_cntxtSwT);
        
        String value_clockOvh = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_CLOCKOVH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_CLOCKOVH),value_clockOvh);
        
        String value_schedPriRange = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_SCHEDPRIRANGE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_SCHEDPRIRANGE),value_schedPriRange);
        
        String value_memSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_MEMSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_MEMSIZE),value_memSize);
        
        String value_utilization = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_UTILIZATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_UTILIZATION),value_utilization);
        
        String value_throughput = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_THROUGHPUT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_THROUGHPUT),value_throughput);
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_ISPREEMPTIBLE),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_ISPREEMPTIBLE, elt));
        
        String value_schedPolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_SCHEDPOLICY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_SCHEDPOLICY),value_schedPolicy);
        
        String value_otherSchedPolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_OTHERSCHEDPOLICY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_OTHERSCHEDPOLICY),value_otherSchedPolicy);
        
        String value_schedule = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_SCHEDULE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_SCHEDULE),value_schedule);
        
        String value_processingUnits = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_PROCESSINGUNITS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_PROCESSINGUNITS),value_processingUnits);
        
        String value_host = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_HOST, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_HOST),value_host);
        
        String value_protectedSharedRsources = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_PROTECTEDSHAREDRESOURCES, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_PROTECTEDSHAREDRESOURCES),value_protectedSharedRsources);
        
        String value_schedulableResources = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_SCHEDULABLERESOURCES, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_SCHEDULABLERESOURCES),value_schedulableResources);
    }

}
