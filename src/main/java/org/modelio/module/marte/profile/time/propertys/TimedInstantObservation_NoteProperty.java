package org.modelio.module.marte.profile.time.propertys;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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

@objid ("46780c49-672a-4522-9d92-5300bb02afec")
public class TimedInstantObservation_NoteProperty implements IPropertyContent {
    @objid ("cb7a883d-d668-4ca5-8b28-1c9f8cf727d0")
    private static List<ModelElement> listClocks = null;

    @objid ("dc4cd272-52cf-4dd3-afa2-b14f6d22bcb9")
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

    @objid ("0965db26-2e61-4ded-9b4c-465762a101de")
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
