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

@objid ("519b203e-a7f0-4b31-9f4c-e27f586e68e9")
public class Configuration_NodeProperty implements IPropertyContent {
    @objid ("02982d05-5d1b-4e45-aefb-110ab28084f2")
    private static List<ModelElement> modes = null;

    @objid ("dacdc075-9643-43a0-9b7a-1007e05db5d1")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    modes, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MODE_CONFIGURATION_MODE, 
        //                    MARTEDesignerTagTypes.CONFIGURATION_NODE_CONFIGURATION_NODE_MODE,
                    value);
            }
    }

    @objid ("86a0d2d6-8d14-494b-ba8e-5ac76cc34b1c")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        modes = ModelUtils.searchElementStereotyped(State.class, MARTEDesignerStereotypes.MODE_STATE);
        String[] tabModes = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MODE_CONFIGURATION_MODE), modes);
        String value_mode = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MODE_CONFIGURATION_MODE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.CONFIGURATION_NODE_CONFIGURATION_NODE_MODE),value_mode, tabModes);
    }

}
