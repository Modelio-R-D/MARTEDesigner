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

@objid ("c71a8630-59e9-4d8c-bc1d-291540aa45a0")
public class Alarm_LinkProperty implements IPropertyContent {
    @objid ("4fb1ac16-81e5-4f9b-b186-e6381895157f")
    private static List<ModelElement> typedElement = null;

    @objid ("d605bab9-9bf8-4ff5-91e5-2cee987ed5a7")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.ALARM_LINK_ALARM_LINK_ISWATCHDOG, value);
        }
        else if(row == 2){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_TIMERS_ALARM, 
        //                    MARTEDesignerTagTypes.ALARM_LINK_ALARM_LINK_TIMERS, 
                    value);
        }
    }

    @objid ("dc232be0-65f1-4e8c-9ef1-9753d1c7eb06")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Alarm
        //
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.ALARM_LINK_ALARM_LINK_ISWATCHDOG),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.ALARM_LINK_ALARM_LINK_ISWATCHDOG, elt));
        
        typedElement = MARTESearchUtils.searchTypedElement();   
        
        String[] tab_timers = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_TIMERS_ALARM), typedElement);
        String value_timers = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_TIMERS_ALARM, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.ALARM_LINK_ALARM_LINK_TIMERS),value_timers, tab_timers);
    }

}
