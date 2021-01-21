package org.modelio.module.marte.profile.time.propertys;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.LinkManager;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("ddfe39c1-d739-4fe7-bcf5-ea07a1d04611")
public class TimedProcessing_ActivityActionProperty implements IPropertyContent {
    @objid ("9a75d6d4-f920-472e-a466-ac6bf81209a1")
    private static List<ModelElement> listClocks = null;

    @objid ("e69ecc80-ea6c-43b7-b372-0ab2e78f3803")
    private static List<ModelElement> listEvent = null;

    @objid ("5099c5ea-7726-4a70-9548-2b674d3a93bc")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            if(ModelUtils.isDuration(value)) {
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.TIMEDPROCESSING_ACTIVITYACTION_TIMEDPROCESSING_ACTIVITYACTION_DURATION, value);
            }
        }
        else if(row == 2){    
            ModelUtils.manageMultipleOrientedLink(elt, 
                    listClocks, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ON_TIMEDELEMENT_CLOCK, 
        //                    MARTEDesignerTagTypes.TIMEDPROCESSING_ACTIVITYACTION_TIMEDPROCESSING_ACTIVITYACTION_ON,
                    value);
        }
        else if(row == 3) {
            ModelUtils.manageSingleOrientedLink(elt,
                    listEvent, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_START_TIMEDPROCESSING_EVENT, 
        //                    MARTEDesignerTagTypes.TIMEDPROCESSING_ACTIVITYACTION_TIMEDPROCESSING_ACTIVITYACTION_START,
                    value );
               }
        else if(row == 4){
            ModelUtils.manageSingleOrientedLink(elt,
                    listEvent, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_FINISH_TIMEDPROCESSING_EVENT, 
        //                    MARTEDesignerTagTypes.TIMEDPROCESSING_ACTIVITYACTION_TIMEDPROCESSING_ACTIVITYACTION_FINISH,
                    value );
        }
    }

    @objid ("137cbe6b-7adf-4bdb-b8cd-a92f3878f8e3")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Timed Processing
        //
        String value_duration = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMEDPROCESSING_ACTIVITYACTION_TIMEDPROCESSING_ACTIVITYACTION_DURATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMEDPROCESSING_ACTIVITYACTION_TIMEDPROCESSING_ACTIVITYACTION_DURATION),value_duration);
        
        
        /*
         * on tagged value initialization
         */
        listClocks = ModelUtils.searchElementStereotyped(Instance.class, MARTEDesignerStereotypes.CLOCK_INSTANCE);
        String[] tabClocks = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ON_TIMEDELEMENT_CLOCK), listClocks);
        String value_on = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ON_TIMEDELEMENT_CLOCK, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMEDPROCESSING_ACTIVITYACTION_TIMEDPROCESSING_ACTIVITYACTION_ON),value_on, tabClocks);
        
        /*
         * finish tagged value initialization
         */
        
        listEvent = ModelUtils.searchElement(Event.class);
        String[] tabFinish = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_FINISH_TIMEDPROCESSING_EVENT), listEvent);
        String value_finish = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_FINISH_TIMEDPROCESSING_EVENT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMEDPROCESSING_ACTIVITYACTION_TIMEDPROCESSING_ACTIVITYACTION_FINISH),value_finish, tabFinish);
        
        /*
         * start tagged value initialization
         */
        String[] tabStart = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_START_TIMEDPROCESSING_EVENT), listEvent);
        String value_start = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_START_TIMEDPROCESSING_EVENT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMEDPROCESSING_ACTIVITYACTION_TIMEDPROCESSING_ACTIVITYACTION_START), value_start, tabStart);
    }

}
