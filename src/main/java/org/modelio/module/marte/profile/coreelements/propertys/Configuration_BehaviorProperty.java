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

@objid ("0748fc0e-87ac-4a0e-ac80-93e15d96c786")
public class Configuration_BehaviorProperty implements IPropertyContent {
    @objid ("28503d58-1a07-4748-b9f1-f94c3b9f87fb")
    private static List<ModelElement> modes = null;

    @objid ("3e6c7cd1-17b2-4a28-bf53-511734320a13")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    modes, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MODE_CONFIGURATION_MODE, 
        //                    MARTEDesignerTagTypes.CONFIGURATION_BEHAVIOR_CONFIGURATION_BEHAVIOR_MODE,
                    value);
        }
    }

    @objid ("7636c260-456a-4f63-96b6-026afd5c4e21")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        modes = ModelUtils.searchElementStereotyped(State.class, MARTEDesignerStereotypes.MODE_STATE);
        String[] tabModes = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MODE_CONFIGURATION_MODE), modes);
        String value_mode = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MODE_CONFIGURATION_MODE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.CONFIGURATION_BEHAVIOR_CONFIGURATION_BEHAVIOR_MODE),value_mode, tabModes);
    }

}
