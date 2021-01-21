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
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("3cd3b309-4af2-4fdb-97aa-bd1205c21110")
public class TimedConstraint_ConstraintProperty implements IPropertyContent {
    @objid ("1e57bc7e-62f9-43ec-870e-2dbb571d48ae")
    private static List<ModelElement> listClocks = null;

    @objid ("761622b8-d10c-433d-a293-ba6ee14ebc19")
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

    @objid ("19c99107-f70f-4d27-9ba6-f39b9859a715")
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
