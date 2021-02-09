package org.modelio.module.marte.profile.time.propertys;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.LinkManager;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class TimedInstantObservation_NoteProperty implements IPropertyContent {
    private static List<ModelElement> listClocks = null;

    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.TIMEDINSTANTOBSERVATION_NOTE_TIMEDINSTANTOBSERVATION_NOTE_OBSKIND, value);
        }
        else if (row == 2) {        
            ModelUtils.manageMultipleOrientedLink(elt, 
                                                  listClocks, 
                                                  MARTEDesignerStereotypes.PROFILEASSOCIATION_ON_TIMEDELEMENT_CLOCK, 
        //                                                  MARTEDesignerTagTypes.TIMEDINSTANTOBSERVATION_NOTE_TIMEDINSTANTOBSERVATION_NOTE_ON,
                                                  value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String[] types = MARTEEnumerationUtils.getEventKind();
        String value_obsKind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMEDINSTANTOBSERVATION_NOTE_TIMEDINSTANTOBSERVATION_NOTE_OBSKIND, elt);
        if(!MARTEEnumerationUtils.isEventKind(value_obsKind)){
            value_obsKind = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMEDINSTANTOBSERVATION_NOTE_TIMEDINSTANTOBSERVATION_NOTE_OBSKIND),value_obsKind, types);
             
        /*
         * on tagged value initialization
         */
        listClocks = ModelUtils.searchElementStereotyped(Instance.class, MARTEDesignerStereotypes.CLOCK_INSTANCE);
        String[] tabClocks = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ON_TIMEDELEMENT_CLOCK), listClocks);
        String value_on = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ON_TIMEDELEMENT_CLOCK, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMEDINSTANTOBSERVATION_NOTE_TIMEDINSTANTOBSERVATION_NOTE_ON),value_on, tabClocks);
    }

}
