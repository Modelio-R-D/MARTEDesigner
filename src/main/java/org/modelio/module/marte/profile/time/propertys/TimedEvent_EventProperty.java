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
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class TimedEvent_EventProperty implements IPropertyContent {
    private static List<ModelElement> listClocks = null;

    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            if(isParseable(value)) {
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.TIMEDEVENT_EVENT_TIMEDEVENT_EVENT_REPETITION, value);
            }
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.TIMEDEVENT_EVENT_TIMEDEVENT_EVENT_EVERY, value);
        }
        else if(row == 3) {
            ModelUtils.manageSingleOrientedLink(elt, 
                                                listClocks, 
                                                MARTEDesignerStereotypes.PROFILEASSOCIATION_ON_TIMEDELEMENT_CLOCK, 
        //                                                MARTEDesignerTagTypes.TIMEDEVENT_EVENT_TIMEDEVENT_EVENT_ON,
                                                value );
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        /*
         * repetition tagged value initialization
         */
        
        String value_repetition = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMEDEVENT_EVENT_TIMEDEVENT_EVENT_REPETITION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMEDEVENT_EVENT_TIMEDEVENT_EVENT_REPETITION),value_repetition);
        
        /*
         * every tagged value initialization
         */
        String value_every = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMEDEVENT_EVENT_TIMEDEVENT_EVENT_EVERY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMEDEVENT_EVENT_TIMEDEVENT_EVENT_EVERY),value_every);
        
        /*
         * on tagged value initialization
         */
        listClocks = ModelUtils.searchElementStereotyped(Instance.class, MARTEDesignerStereotypes.CLOCK_INSTANCE);
        String[] tabClocks = ModelUtils.createListString(listClocks);
        String value_on = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ON_TIMEDELEMENT_CLOCK, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMEDEVENT_EVENT_TIMEDEVENT_EVENT_ON),value_on, tabClocks);
    }

    /**
     * isParseable allows us to check the parsing of the getting value
     * 
     * @param value is the getting value
     * @return a boolean which gives the parsing of the getting value
     */
    protected boolean isParseable(String value) {
        boolean result = false;
        
        try {
            Integer.parseInt(value);
            result=true;
        }
        catch (Exception e) {
        
            new ErrorMessageBox(Display.getDefault().getActiveShell()
                                ,"The value "+value+" is not an integer. You have to enter another value");
            result = false;
            return result;
        }
        return result;
    }

}
