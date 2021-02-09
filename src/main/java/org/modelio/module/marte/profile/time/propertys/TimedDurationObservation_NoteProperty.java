package org.modelio.module.marte.profile.time.propertys;

import java.util.List;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.ErrorMessageBox;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.LinkManager;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class TimedDurationObservation_NoteProperty implements IPropertyContent {
    private static List<ModelElement> listClocks = null;

    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            if (value.startsWith("add")) {
                //tag parameter getting
                String newValue = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMEDDURATIONOBSERVATION_NOTE_TIMEDDURATIONOBSERVATION_NOTE_OBSKIND, elt);
                for (int i=4; i<value.length();i++) {
                    newValue = newValue+value.charAt(i);
                }
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.TIMEDDURATIONOBSERVATION_NOTE_TIMEDDURATIONOBSERVATION_NOTE_OBSKIND, newValue);
            }
            else if (value.startsWith("remove")) {
                String valueToRemove="";
                for (int i=7; i<value.length();i++) {
                    valueToRemove = valueToRemove+value.charAt(i);
                }
                valueToRemove = valueToRemove+" ";
                ModelUtils.removeTagParameter(MARTEDesignerTagTypes.TIMEDDURATIONOBSERVATION_NOTE_TIMEDDURATIONOBSERVATION_NOTE_OBSKIND, elt, valueToRemove);
                String newValue = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMEDDURATIONOBSERVATION_NOTE_TIMEDDURATIONOBSERVATION_NOTE_OBSKIND, elt)+" ";
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.TIMEDDURATIONOBSERVATION_NOTE_TIMEDDURATIONOBSERVATION_NOTE_OBSKIND, newValue);
            }
            else if (value.equals("")){
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.TIMEDDURATIONOBSERVATION_NOTE_TIMEDDURATIONOBSERVATION_NOTE_OBSKIND, value);
            }
            else {
                 new ErrorMessageBox(Display.getDefault().getActiveShell()
                         ,"You are not able to add this value because the maximum parameter number is reached.");
        
            }
        }
        else if(row == 2) {               
            ModelUtils.manageMultipleOrientedLink(elt, 
                                                  listClocks, 
                                                  MARTEDesignerStereotypes.PROFILEASSOCIATION_ON_TIMEDELEMENT_CLOCK, 
        //                                                  MARTEDesignerTagTypes.TIMEDDURATIONOBSERVATION_NOTE_TIMEDDURATIONOBSERVATION_NOTE_ON,
                                                  value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String[] types = new String[]{"start","finish","send","receive","consume"};
        String value_obsKind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMEDDURATIONOBSERVATION_NOTE_TIMEDDURATIONOBSERVATION_NOTE_OBSKIND, elt);
        String[] presentObsKind = ModelUtils.parseValuesToStringTab(value_obsKind);
        
        
        if(presentObsKind.length == 0){
            value_obsKind = "";
        }
        String[] displayTab = ModelUtils.createListAddRemoveEnum(types, presentObsKind, 2);
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMEDDURATIONOBSERVATION_NOTE_TIMEDDURATIONOBSERVATION_NOTE_OBSKIND),value_obsKind, displayTab);
        /*
         * on tagged value initialization
         */
        listClocks = ModelUtils.searchElementStereotyped(Instance.class, MARTEDesignerStereotypes.CLOCK_INSTANCE);
        String[] tabClocks = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ON_TIMEDELEMENT_CLOCK), listClocks);
        String value_on = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ON_TIMEDELEMENT_CLOCK, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMEDDURATIONOBSERVATION_NOTE_TIMEDDURATIONOBSERVATION_NOTE_ON),value_on, tabClocks);
    }

}
