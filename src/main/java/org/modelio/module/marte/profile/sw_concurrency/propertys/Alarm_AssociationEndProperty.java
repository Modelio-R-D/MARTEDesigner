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

@objid ("b806ee44-0787-482c-909c-a20da760c1e9")
public class Alarm_AssociationEndProperty implements IPropertyContent {
    @objid ("790e9e4e-78e4-4161-a9d9-f05751a3771f")
    private static List<ModelElement> typedElement = null;

    @objid ("df9c17f9-84ee-4b9f-a80d-a05beb0dc816")
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

    @objid ("8f8731df-06ac-4d80-82bd-2f7e18e2727a")
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
