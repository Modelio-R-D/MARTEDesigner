package org.modelio.module.marte.profile.gqam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("f95d4bad-47e7-42a3-b5f5-f16b79f11932")
public class GaCommHost_LifelineProperty implements IPropertyContent {
    @objid ("bce2c850-1c1e-4a48-997a-b8fc22ef8951")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
         ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_THROUGHPUT, value);
                }
                else if(row == 2){
         ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_UTILIZATION, value);
                }
                else if(row == 3){
         ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_ISPREEMPTIBLE, value);
                }
                else if(row == 4){
         ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_SCHEDPOLICY, value);
                }
                else if(row == 5){
         ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_OTHERSCHEDPOLICY, value);
                }
                else if(row == 6){
         ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_SCHEDULE, value);
                }
                else if(row == 7){
         ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_PROCESSINGUNITS, value);
                }
                else if(row == 8){
         ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_HOST, value);
                }
                else if(row == 9){
         ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_PROTECTEDSHAREDRESOURCES, value);
                }
                else if(row == 10){
         ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_SCHEDULABLERESOURCES, value);
                }
    }

    @objid ("9671ed36-0b4c-48be-a362-4bbfb1a3ece6")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        // Ga communication host
        String value_throughput = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_THROUGHPUT, elt);
        if(value_throughput.equals("")){
            value_throughput = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_THROUGHPUT),value_throughput);
        String value_utilization = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_UTILIZATION, elt);
        if(value_utilization.equals("")){
            value_utilization = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_UTILIZATION),value_utilization);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_ISPREEMPTIBLE),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_ISPREEMPTIBLE, elt));
        String value_schedPolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_SCHEDPOLICY, elt);
        if(value_schedPolicy.equals("")){
            value_schedPolicy = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_SCHEDPOLICY),value_schedPolicy);
        String value_otherSchedPolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_OTHERSCHEDPOLICY, elt);
        if(value_otherSchedPolicy.equals("")){
            value_otherSchedPolicy = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_OTHERSCHEDPOLICY),value_otherSchedPolicy);
        String value_schedule = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_SCHEDULE, elt);
        if(value_schedule.equals("")){
            value_schedule = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_SCHEDULE),value_schedule);
        String value_processingUnits = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_PROCESSINGUNITS, elt);
        if(value_processingUnits.equals("")){
            value_processingUnits = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_PROCESSINGUNITS),value_processingUnits);
        String value_host = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_HOST, elt);
        if(value_host.equals("")){
            value_host = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_HOST),value_host);
        String value_protectedSharedRsources = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_PROTECTEDSHAREDRESOURCES, elt);
        if(value_protectedSharedRsources.equals("")){
            value_protectedSharedRsources = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_PROTECTEDSHAREDRESOURCES),value_protectedSharedRsources);
        String value_schedulableResources = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_SCHEDULABLERESOURCES, elt);
        if(value_schedulableResources.equals("")){
            value_schedulableResources = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GACOMMHOST_LIFELINE_GACOMMHOST_LIFELINE_SCHEDULABLERESOURCES),value_schedulableResources);
    }

}
