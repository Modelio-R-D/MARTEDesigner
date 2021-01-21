package org.modelio.module.marte.profile.coreelements.propertys;

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

@objid ("f6c570c8-6570-44e6-8c7a-d0eb6a94a2ce")
public class Configuration_ClassProperty implements IPropertyContent {
    @objid ("4d5453ae-dc24-468d-a212-8c769e5f8ae5")
    private static List<ModelElement> modes = null;

    @objid ("5fb60d17-2ffb-434f-89b5-31cf625fa2b3")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageMultipleOrientedLink(elt, 
                                                  modes, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MODE_CONFIGURATION_MODE, 
        //                    MARTEDesignerTagTypes.CONFIGURATION_CLASS_CONFIGURATION_CLASS_MODE,
                    value );
        }
    }

    @objid ("553f9f00-18b9-4b7a-8445-e4f64dad566b")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        modes = ModelUtils.searchElementStereotyped(State.class, MARTEDesignerStereotypes.MODE_STATE);
        String[] tabModes = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MODE_CONFIGURATION_MODE), modes);
        String value_mode = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MODE_CONFIGURATION_MODE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.CONFIGURATION_CLASS_CONFIGURATION_CLASS_MODE),value_mode, tabModes);
    }

}
