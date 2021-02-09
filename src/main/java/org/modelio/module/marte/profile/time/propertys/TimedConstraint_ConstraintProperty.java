package org.modelio.module.marte.profile.time.propertys;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.LinkManager;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class TimedConstraint_ConstraintProperty implements IPropertyContent {
    private static List<ModelElement> listClocks = null;

    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.TIMEDCONSTRAINT_CONSTRAINT_TIMEDCONSTRAINT_CONSTRAINT_INTERPRETATION, value);
        }
        else if(row == 2){            
            ModelUtils.manageMultipleOrientedLink(elt, 
                    listClocks, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ON_TIMEDELEMENT_CLOCK, 
        //                    MARTEDesignerTagTypes.TIMEDCONSTRAINT_CONSTRAINT_TIMEDCONSTRAINT_CONSTRAINT_ON,s
                    value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Timed Constraint
        //
        
        /*
         * interpretation tagged value
         */
        
        String[] tabInterpretation = new String[] {"duration", "instant", "any"};
        String value_interpretation = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMEDCONSTRAINT_CONSTRAINT_TIMEDCONSTRAINT_CONSTRAINT_INTERPRETATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMEDCONSTRAINT_CONSTRAINT_TIMEDCONSTRAINT_CONSTRAINT_INTERPRETATION),value_interpretation, tabInterpretation);
        
        /*
         * on tagged value initialization
         */
        listClocks = ModelUtils.searchElementStereotyped(Instance.class, MARTEDesignerStereotypes.CLOCK_INSTANCE);        
        String[] tabClocks = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ON_TIMEDELEMENT_CLOCK), listClocks);
        String value_on = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ON_TIMEDELEMENT_CLOCK, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMEDCONSTRAINT_CONSTRAINT_TIMEDCONSTRAINT_CONSTRAINT_ON),value_on, tabClocks);
    }

}
