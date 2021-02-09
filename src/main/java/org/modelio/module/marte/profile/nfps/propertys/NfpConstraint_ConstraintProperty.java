package org.modelio.module.marte.profile.nfps.propertys;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.LinkManager;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class NfpConstraint_ConstraintProperty implements IPropertyContent {
    private static List<ModelElement> listMode;

    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.NFPCONSTRAINT_CONSTRAINT_NFPCONSTRAINT_CONSTRAINT_KIND, value);
        }else if (row == 2) {
        
            ModelUtils.manageMultipleOrientedLink(elt, 
                    listMode, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MODE_NFPCONSTRAINT_MODE, 
        //                    MARTEDesignerTagTypes.NFPCONSTRAINT_CONSTRAINT_NFPCONSTRAINT_CONSTRAINT_MODE,
                    value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Nfp constraint
        //
        
        /*
         * kind tagged value initialization
         */
        String[] types = new String[]{"required","offered","contract"};
        String value_kind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NFPCONSTRAINT_CONSTRAINT_NFPCONSTRAINT_CONSTRAINT_KIND, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.NFPCONSTRAINT_CONSTRAINT_NFPCONSTRAINT_CONSTRAINT_KIND),value_kind, types);
        
        /*
         * mode tagged value initialization
         */
        listMode = ModelUtils.searchElementStereotyped(State.class, MARTEDesignerStereotypes.MODE_STATE);
        String[] tabModes = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MODE_NFPCONSTRAINT_MODE), listMode);
        
        String value_mode = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MODE_NFPCONSTRAINT_MODE, elt);
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.NFPCONSTRAINT_CONSTRAINT_NFPCONSTRAINT_CONSTRAINT_MODE),value_mode, tabModes);
    }

}
