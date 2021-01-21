package org.modelio.module.marte.profile.sw_concurrency.propertys;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.LinkManager;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.MARTESearchUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("399b979f-74cd-47db-b9ac-ca1971e62951")
public class Alarm_InstanceProperty implements IPropertyContent {
    @objid ("0d36504b-f8bb-4369-b44e-43f7faf00451")
    private static List<ModelElement> typedElement = null;

    @objid ("270ba208-5da4-4d1d-8a8e-4426de4026a6")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.ALARM_INSTANCE_ALARM_INSTANCE_ISWATCHDOG, value);
        }
        else if(row == 2){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_TIMERS_ALARM, 
        //                    MARTEDesignerTagTypes.ALARM_INSTANCE_ALARM_INSTANCE_TIMERS, 
                    value);
        }
    }

    @objid ("b4d17b8d-e6be-4a4a-bd93-88e491c30cc0")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Alarm
        //
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.ALARM_INSTANCE_ALARM_INSTANCE_ISWATCHDOG),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.ALARM_INSTANCE_ALARM_INSTANCE_ISWATCHDOG, elt));
        
        typedElement = MARTESearchUtils.searchTypedElement();   
        
        String[] tab_timers = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_TIMERS_ALARM), typedElement);
        String value_timers = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_TIMERS_ALARM, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.ALARM_INSTANCE_ALARM_INSTANCE_TIMERS),value_timers, tab_timers);
    }

}
