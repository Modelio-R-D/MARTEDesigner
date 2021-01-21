package org.modelio.module.marte.profile.nfps.propertys;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.LinkManager;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("4e8d30b5-90c7-4358-b5c3-962d91b34f76")
public class NfpConstraint_ConstraintProperty implements IPropertyContent {
    @objid ("beb0fba6-a439-4138-b3ef-24aa992a99d9")
    private static List<ModelElement> listMode;

    @objid ("1794f14a-214a-459d-8a86-1a215b99e849")
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

    @objid ("947cc923-83f8-437b-87e6-c115d309b9d7")
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
