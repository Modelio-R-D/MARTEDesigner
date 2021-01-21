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

@objid ("701b3328-d7b7-4778-9e6b-965b72df523b")
public class TimedValueSpecification_TaggedValueProperty implements IPropertyContent {
    @objid ("36cf714a-23ea-46fc-850a-84f478946594")
    private static List<ModelElement> listClocks = null;

    @objid ("21fb4eaf-0e03-4630-a2de-31a2213e5c94")
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

    @objid ("717838fb-a05c-468e-8e00-d1098d07b608")
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
