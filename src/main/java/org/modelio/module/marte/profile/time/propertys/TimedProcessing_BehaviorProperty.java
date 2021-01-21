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

@objid ("6e618854-50d2-40ed-98fa-71b21385ceda")
public class TimedProcessing_BehaviorProperty implements IPropertyContent {
    @objid ("ddb46c85-2ffb-4498-94e8-1523abd662b6")
    private static List<ModelElement> listClocks = null;

    @objid ("d3e13021-c27f-4166-8476-0bada24b8381")
    private static List<ModelElement> listEvent = null;

    @objid ("cd7bb35d-34ef-44c1-863b-1058a1b376de")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
        
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.TIMEDPROCESSING_BEHAVIOR_TIMEDPROCESSING_BEHAVIOR_DURATION, value);
        
        }
        else if(row == 2){    
            ModelUtils.manageMultipleOrientedLink(elt, 
                    listClocks, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ON_TIMEDELEMENT_CLOCK, 
        //                    MARTEDesignerTagTypes.TIMEDPROCESSING_BEHAVIOR_TIMEDPROCESSING_BEHAVIOR_ON,
                    value);
            
        }
        else if(row == 3) {
            ModelUtils.manageSingleOrientedLink(elt,
                    listEvent,  
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_START_TIMEDPROCESSING_EVENT, 
        //                    MARTEDesignerTagTypes.TIMEDPROCESSING_BEHAVIOR_TIMEDPROCESSING_BEHAVIOR_START,
                    value);
          
        }
        
        else if(row == 4){
            ModelUtils.manageSingleOrientedLink(elt,
                    listEvent, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_FINISH_TIMEDPROCESSING_EVENT, 
        //                    MARTEDesignerTagTypes.TIMEDPROCESSING_BEHAVIOR_TIMEDPROCESSING_BEHAVIOR_FINISH,s
                    value);
        }
    }

    @objid ("341b7f9a-312c-47c1-9601-4a46f0895610")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Timed Processing
        //
        String value_duration = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMEDPROCESSING_BEHAVIOR_TIMEDPROCESSING_BEHAVIOR_DURATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMEDPROCESSING_BEHAVIOR_TIMEDPROCESSING_BEHAVIOR_DURATION),value_duration);
        
        
        /*
         * on tagged value initialization
         */
        listClocks = ModelUtils.searchElementStereotyped(Instance.class, MARTEDesignerStereotypes.CLOCK_INSTANCE);
        String[] tabClocks = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ON_TIMEDELEMENT_CLOCK), listClocks);
        String value_on = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ON_TIMEDELEMENT_CLOCK, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMEDPROCESSING_BEHAVIOR_TIMEDPROCESSING_BEHAVIOR_ON),value_on, tabClocks);
        
        /*
         * finish tagged value initialization
         */
        listEvent = ModelUtils.searchElement(Event.class);
        String[] tabFinish = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_FINISH_TIMEDPROCESSING_EVENT), listEvent);
        String value_finish = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_FINISH_TIMEDPROCESSING_EVENT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMEDPROCESSING_BEHAVIOR_TIMEDPROCESSING_BEHAVIOR_FINISH),value_finish, tabFinish);
        
        /*
         * start tagged value initialization
         */
        String[] tabStart = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_START_TIMEDPROCESSING_EVENT), listEvent);
        String value_start = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_START_TIMEDPROCESSING_EVENT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMEDPROCESSING_BEHAVIOR_TIMEDPROCESSING_BEHAVIOR_START), value_start, tabStart);
    }

}
