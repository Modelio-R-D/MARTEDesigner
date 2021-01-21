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

@objid ("1b972420-57e1-437a-be84-85e8da30dd85")
public class ClockConstraint_ConstraintProperty implements IPropertyContent {
    @objid ("d9ecf24f-56cf-4b04-92d0-292fd293b68d")
    private static List<ModelElement> listClocks = null;

    @objid ("c536186b-142c-410d-8b31-bdd84b1ae2ad")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
        ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.CLOCKCONSTRAINT_CONSTRAINT_CLOCKCONSTRAINT_CONSTRAINT_ISCOINCIDENCEBASED, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.CLOCKCONSTRAINT_CONSTRAINT_CLOCKCONSTRAINT_CONSTRAINT_ISPRECEDENCEBASED, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.CLOCKCONSTRAINT_CONSTRAINT_CLOCKCONSTRAINT_CONSTRAINT_ISCHRONOMETRICBASED, value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    listClocks, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ON_TIMEDELEMENT_CLOCK, 
        //                    MARTEDesignerTagTypes.CLOCKCONSTRAINT_CONSTRAINT_CLOCKCONSTRAINT_CONSTRAINT_ON,
                    value);
        }
    }

    @objid ("59533968-66ab-49e8-b084-6068eced5d4d")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Clock constraint
        //
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.CLOCKCONSTRAINT_CONSTRAINT_CLOCKCONSTRAINT_CONSTRAINT_ISCOINCIDENCEBASED),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.CLOCKCONSTRAINT_CONSTRAINT_CLOCKCONSTRAINT_CONSTRAINT_ISCOINCIDENCEBASED, elt));
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.CLOCKCONSTRAINT_CONSTRAINT_CLOCKCONSTRAINT_CONSTRAINT_ISPRECEDENCEBASED),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.CLOCKCONSTRAINT_CONSTRAINT_CLOCKCONSTRAINT_CONSTRAINT_ISPRECEDENCEBASED, elt));
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.CLOCKCONSTRAINT_CONSTRAINT_CLOCKCONSTRAINT_CONSTRAINT_ISCHRONOMETRICBASED),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.CLOCKCONSTRAINT_CONSTRAINT_CLOCKCONSTRAINT_CONSTRAINT_ISCHRONOMETRICBASED, elt));
        
        /*
         * on tagged value initialization
         */
        listClocks = ModelUtils.searchElementStereotyped(Instance.class, MARTEDesignerStereotypes.CLOCK_INSTANCE);
        String[] tabClocks = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ON_TIMEDELEMENT_CLOCK), listClocks);
        String value_on = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ON_TIMEDELEMENT_CLOCK, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.CLOCKCONSTRAINT_CONSTRAINT_CLOCKCONSTRAINT_CONSTRAINT_ON),value_on, tabClocks);
    }

}
