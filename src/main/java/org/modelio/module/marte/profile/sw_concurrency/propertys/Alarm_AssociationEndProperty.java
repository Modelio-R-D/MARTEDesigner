package org.modelio.module.marte.profile.sw_concurrency.propertys;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.LinkManager;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.MARTESearchUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Alarm_AssociationEndProperty implements IPropertyContent {
    private static List<ModelElement> typedElement = null;

    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.ALARM_ASSOCIATIONEND_ALARM_ASSOCIATIONEND_ISWATCHDOG, value);
        }
        else if(row == 2){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_TIMERS_ALARM, 
        //                    MARTEDesignerTagTypes.ALARM_ASSOCIATIONEND_ALARM_ASSOCIATIONEND_TIMERS, 
                    value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Alarm
        //
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.ALARM_ASSOCIATIONEND_ALARM_ASSOCIATIONEND_ISWATCHDOG),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.ALARM_ASSOCIATIONEND_ALARM_ASSOCIATIONEND_ISWATCHDOG, elt));
        
        typedElement = MARTESearchUtils.searchTypedElement();   
        
        String[] tab_timers = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_TIMERS_ALARM), typedElement);
        String value_timers = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_TIMERS_ALARM, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.ALARM_ASSOCIATIONEND_ALARM_ASSOCIATIONEND_TIMERS),value_timers, tab_timers);
    }

}
