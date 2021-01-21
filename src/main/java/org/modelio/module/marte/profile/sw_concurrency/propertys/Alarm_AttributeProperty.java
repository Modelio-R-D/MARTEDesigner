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

@objid ("b664aa6d-a13e-4447-9ad8-106395035fea")
public class Alarm_AttributeProperty implements IPropertyContent {
    @objid ("e237b749-2772-425e-9239-b3e399103029")
    private static List<ModelElement> typedElement = null;

    @objid ("94dfb4ce-6ad7-4608-8b48-c30181311a1b")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.ALARM_ATTRIBUTE_ALARM_ATTRIBUTE_ISWATCHDOG, value);
        }
        else if(row == 2){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_TIMERS_ALARM, 
        //                    MARTEDesignerTagTypes.ALARM_ATTRIBUTE_ALARM_ATTRIBUTE_TIMERS, 
                    value);
        }
    }

    @objid ("34113bbf-5910-4df2-b3ae-af0202513a4d")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Alarm
        //
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.ALARM_ATTRIBUTE_ALARM_ATTRIBUTE_ISWATCHDOG),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.ALARM_ATTRIBUTE_ALARM_ATTRIBUTE_ISWATCHDOG, elt));
        
        typedElement = MARTESearchUtils.searchTypedElement();   
        
        String[] tab_timers = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_TIMERS_ALARM), typedElement);
        String value_timers = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_TIMERS_ALARM, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.ALARM_ATTRIBUTE_ALARM_ATTRIBUTE_TIMERS),value_timers, tab_timers);
    }

}
