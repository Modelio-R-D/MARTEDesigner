package org.modelio.module.marte.profile.gqam.propertys;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class GaCommHost_AttributeProperty implements IPropertyContent {
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){      
         ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_THROUGHPUT, value);
                }
                else if(row == 2){
         ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_UTILIZATION, value);
                }
                else if(row == 3){
         ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_ISPREEMPTIBLE, value);
                }
                else if(row == 4){
         ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_SCHEDPOLICY, value);
                }
                else if(row == 5){
         ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_OTHERSCHEDPOLICY, value);
                }
                else if(row == 6){
         ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_SCHEDULE, value);
                }
                else if(row == 7){
         ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_PROCESSINGUNITS, value);
                }
                else if(row == 8){
         ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_HOST, value);
                }
                else if(row == 9){
         ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_PROTECTEDSHAREDRESOURCES, value);
                }
                else if(row == 10){
         ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_SCHEDULABLERESOURCES, value);
                }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        // Ga communication host
        String value_throughput = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_THROUGHPUT, elt);
        if(value_throughput.equals("")){
            value_throughput = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_THROUGHPUT),value_throughput);
        String value_utilization = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_UTILIZATION, elt);
        if(value_utilization.equals("")){
            value_utilization = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_UTILIZATION),value_utilization);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_ISPREEMPTIBLE),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_ISPREEMPTIBLE, elt));
        String value_schedPolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_SCHEDPOLICY, elt);
        if(value_schedPolicy.equals("")){
            value_schedPolicy = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_SCHEDPOLICY),value_schedPolicy);
        String value_otherSchedPolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_OTHERSCHEDPOLICY, elt);
        if(value_otherSchedPolicy.equals("")){
            value_otherSchedPolicy = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_OTHERSCHEDPOLICY),value_otherSchedPolicy);
        String value_schedule = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_SCHEDULE, elt);
        if(value_schedule.equals("")){
            value_schedule = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_SCHEDULE),value_schedule);
        String value_processingUnits = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_PROCESSINGUNITS, elt);
        if(value_processingUnits.equals("")){
            value_processingUnits = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_PROCESSINGUNITS),value_processingUnits);
        String value_host = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_HOST, elt);
        if(value_host.equals("")){
            value_host = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_HOST),value_host);
        String value_protectedSharedRsources = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_PROTECTEDSHAREDRESOURCES, elt);
        if(value_protectedSharedRsources.equals("")){
            value_protectedSharedRsources = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_PROTECTEDSHAREDRESOURCES),value_protectedSharedRsources);
        String value_schedulableResources = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_SCHEDULABLERESOURCES, elt);
        if(value_schedulableResources.equals("")){
            value_schedulableResources = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_SCHEDULABLERESOURCES),value_schedulableResources);
    }

}
