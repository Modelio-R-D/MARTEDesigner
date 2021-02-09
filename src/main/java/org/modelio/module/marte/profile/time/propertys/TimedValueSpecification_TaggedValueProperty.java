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

public class TimedValueSpecification_TaggedValueProperty implements IPropertyContent {
    private static List<ModelElement> listClocks = null;

    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.TIMEDVALUESPECIFICATION_TAGGEDVALUE_TIMEDVALUESPECIFICATION_TAGGEDVALUE_INTERPRETATION, value);
        }
        else if (row == 2){
        
            ModelUtils.manageMultipleOrientedLink(elt, 
                    listClocks, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ON_TIMEDELEMENT_CLOCK, 
        //                    MARTEDesignerTagTypes.TIMEDVALUESPECIFICATION_TAGGEDVALUE_TIMEDVALUESPECIFICATION_TAGGEDVALUE_ON,
                    value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        /*
         * interpretation tagged value
         */
        
        // indicates that the typed elements are time spans
        // indicates that the typed elements are instants
        // indicates that the typed elements can be duration or instants
        String[] tabInterpretation = MARTEEnumerationUtils.getTimeInterpretationKind();
        String value_interpretation = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMEDVALUESPECIFICATION_TAGGEDVALUE_TIMEDVALUESPECIFICATION_TAGGEDVALUE_INTERPRETATION, elt);
        if(!MARTEEnumerationUtils.isTimeInterpretationKind(value_interpretation)){
            value_interpretation = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMEDVALUESPECIFICATION_TAGGEDVALUE_TIMEDVALUESPECIFICATION_TAGGEDVALUE_INTERPRETATION),value_interpretation, tabInterpretation);
        
        /*
         * on tagged value initialization
         */
        listClocks = ModelUtils.searchElementStereotyped(Instance.class, MARTEDesignerStereotypes.CLOCK_INSTANCE);
        String[] tabClocks = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ON_TIMEDELEMENT_CLOCK), listClocks);
        String value_on = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ON_TIMEDELEMENT_CLOCK, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMEDVALUESPECIFICATION_TAGGEDVALUE_TIMEDVALUESPECIFICATION_TAGGEDVALUE_ON),value_on, tabClocks);
    }

}
