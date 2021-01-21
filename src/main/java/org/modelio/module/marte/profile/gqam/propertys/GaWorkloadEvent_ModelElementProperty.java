package org.modelio.module.marte.profile.gqam.propertys;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.LinkManager;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.MARTESearchUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("457ef6a0-88d0-47f4-9ab4-506a6de89269")
public class GaWorkloadEvent_ModelElementProperty implements IPropertyContent {
    @objid ("be1fbb39-746d-4f06-8781-188fed53abca")
    private static List<ModelElement> generators = null;

    @objid ("546259a3-bf3e-4bce-91fa-10c62b44e76b")
    private static List<ModelElement> traces = null;

    @objid ("5ffe173d-9f05-411a-9c17-4d56cf19bf34")
    private static List<ModelElement> effects = null;

    @objid ("2abc74e1-a1cf-4540-bd77-596e6a7d7518")
    private static List<ModelElement> timedEvents = null;

    @objid ("ac04ee53-d318-4215-8018-603c58c17c2b")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAWORKLOADEVENT_MODELELEMENT_GAWORKLOADEVENT_MODELELEMENT_PATTERN, value);
        }
        else if(row == 2){
            ModelUtils.manageSingleOrientedLink(elt, 
                    generators, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_GENERATOR_GAWORKLOADEVENT, 
        //                    MARTEDesignerTagTypes.GAWORKLOADEVENT_MODELELEMENT_GAWORKLOADEVENT_MODELELEMENT_GENERATOR,
                    value);
        }
        else if(row == 3){
            ModelUtils.manageSingleOrientedLink(elt, 
                    traces, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_TRACE_GAWORKLOADEVENT, 
        //                    MARTEDesignerTagTypes.GAWORKLOADEVENT_MODELELEMENT_GAWORKLOADEVENT_MODELELEMENT_TRACE,
                    value);
        }
        else if(row == 4){
            ModelUtils.manageSingleOrientedLink(elt, 
                    effects, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_EFFECT_GAWORKLOADEVENT, 
        //                    MARTEDesignerTagTypes.GAWORKLOADEVENT_MODELELEMENT_GAWORKLOADEVENT_MODELELEMENT_EFFECT,
                    value);
        }
        else if(row == 5){
            ModelUtils.manageSingleOrientedLink(elt, 
                    timedEvents, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_TIMEDEVENT_GAWORKLOADEVENT, 
        //                    MARTEDesignerTagTypes.GAWORKLOADEVENT_MODELELEMENT_GAWORKLOADEVENT_MODELELEMENT_TIMEDEVENT,
                    value);
        }
    }

    @objid ("ee7387e7-b233-4443-9f6e-1e5edd09010b")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAWORKLOADEVENT_MODELELEMENT_GAWORKLOADEVENT_MODELELEMENT_PATTERN, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAWORKLOADEVENT_MODELELEMENT_GAWORKLOADEVENT_MODELELEMENT_PATTERN), value);
        
        
        generators = ModelUtils.searchElementStereotyped(Behavior.class, MARTEDesignerStereotypes.GAWORKLOADGENERATOR_BEHAVIOR);
        String[] tab_generators = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_GENERATOR_GAWORKLOADEVENT), generators);
        String value_generators = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_GENERATOR_GAWORKLOADEVENT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAWORKLOADEVENT_MODELELEMENT_GAWORKLOADEVENT_MODELELEMENT_GENERATOR),value_generators, tab_generators);
            
        
        traces = ModelUtils.searchElementStereotyped(ModelElement.class, MARTEDesignerStereotypes.GAEVENTTRACE_MODELELEMENT);
        String[] tab_traces = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_TRACE_GAWORKLOADEVENT), traces);
        String value_traces = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_TRACE_GAWORKLOADEVENT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAWORKLOADEVENT_MODELELEMENT_GAWORKLOADEVENT_MODELELEMENT_TRACE),value_traces, tab_traces);
            
        
        effects = ModelUtils.searchElementStereotyped(ModelElement.class, MARTEDesignerStereotypes.GASCENARIO_MODELELEMENT);
        String[] tab_effects = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_EFFECT_GAWORKLOADEVENT), effects);
        String value_effects = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_EFFECT_GAWORKLOADEVENT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAWORKLOADEVENT_MODELELEMENT_GAWORKLOADEVENT_MODELELEMENT_EFFECT),value_effects, tab_effects);
            
        timedEvents = MARTESearchUtils.searchTimedEvent();
        String[] tab_timedEvents = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_TIMEDEVENT_GAWORKLOADEVENT), timedEvents);
        String value_timedEvents = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_TIMEDEVENT_GAWORKLOADEVENT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAWORKLOADEVENT_MODELELEMENT_GAWORKLOADEVENT_MODELELEMENT_TIMEDEVENT),value_timedEvents, tab_timedEvents);
    }

}
