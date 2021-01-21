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

@objid ("0d3599f4-53fe-4e5a-88d5-bb0e882a533b")
public class TimedProcessing_MessageProperty implements IPropertyContent {
    @objid ("fef24747-ed13-4653-b534-3c347bf47ddc")
    private static List<ModelElement> listClocks = null;

    @objid ("77fe6e7b-c683-4c01-8313-5c5279cd2ed3")
    private static List<ModelElement> listEvent = null;

    @objid ("27852a65-da69-4356-b8f1-df195d7bf22c")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.TIMEDPROCESSING_MESSAGE_TIMEDPROCESSING_MESSAGE_DURATION, value);
        }
        else if(row == 2){    
            ModelUtils.manageMultipleOrientedLink(elt,                 
                    listClocks, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ON_TIMEDELEMENT_CLOCK, 
        //                    MARTEDesignerTagTypes.TIMEDPROCESSING_MESSAGE_TIMEDPROCESSING_MESSAGE_ON,
                    value);
        }
        else if(row == 3) {
            ModelUtils.manageSingleOrientedLink(elt,
                    listEvent, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_START_TIMEDPROCESSING_EVENT, 
        //                    MARTEDesignerTagTypes.TIMEDPROCESSING_MESSAGE_TIMEDPROCESSING_MESSAGE_START,
                    value);
        }
        else if(row == 4){
            ModelUtils.manageSingleOrientedLink(elt,
                    listEvent, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_FINISH_TIMEDPROCESSING_EVENT, 
        //                    MARTEDesignerTagTypes.TIMEDPROCESSING_MESSAGE_TIMEDPROCESSING_MESSAGE_FINISH,s
                    value);
        }
    }

    @objid ("b974e512-a025-4d35-b14c-3ae7037d1502")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Timed Processing
        //
        String value_duration = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMEDPROCESSING_MESSAGE_TIMEDPROCESSING_MESSAGE_DURATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMEDPROCESSING_MESSAGE_TIMEDPROCESSING_MESSAGE_DURATION),value_duration);
        
        
        /*
         * on tagged value initialization
         */
        listClocks = ModelUtils.searchElementStereotyped(Instance.class, MARTEDesignerStereotypes.CLOCK_INSTANCE);       
        String[] tabClocks = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ON_TIMEDELEMENT_CLOCK), listClocks);
        String value_on = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ON_TIMEDELEMENT_CLOCK, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMEDPROCESSING_MESSAGE_TIMEDPROCESSING_MESSAGE_ON),value_on, tabClocks);
        
        /*
         * finish tagged value initialization
         */
        listEvent = ModelUtils.searchElement(Event.class);
        String[] tabFinish = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_FINISH_TIMEDPROCESSING_EVENT), listEvent);
        String value_finish = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_FINISH_TIMEDPROCESSING_EVENT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMEDPROCESSING_MESSAGE_TIMEDPROCESSING_MESSAGE_FINISH),value_finish, tabFinish);
        
        /*
         * start tagged value initialization
         */
        String[] tabStart = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_START_TIMEDPROCESSING_EVENT), listEvent);
        String value_start = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_START_TIMEDPROCESSING_EVENT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMEDPROCESSING_MESSAGE_TIMEDPROCESSING_MESSAGE_START), value_start, tabStart);
    }

}
