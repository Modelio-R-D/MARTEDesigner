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

@objid ("64ba6447-b7ef-4c89-9607-ff289bc44982")
public class Configuration_CollaborationProperty implements IPropertyContent {
    @objid ("e98a2603-15ba-4525-9dc1-f65383774f0c")
    private static List<ModelElement> modes = null;

    @objid ("1a29d870-d536-46d9-bfc5-130fe35bc8e4")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    modes, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MODE_CONFIGURATION_MODE, 
        //                    MARTEDesignerTagTypes.CONFIGURATION_COLLABORATION_CONFIGURATION_COLLABORATION_MODE,
                    value);
            }
    }

    @objid ("789d4be9-d164-461d-a19a-deff17a1dde8")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        modes = ModelUtils.searchElementStereotyped(State.class, MARTEDesignerStereotypes.MODE_STATE);
        String[] tabModes = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MODE_CONFIGURATION_MODE), modes);
        String value_mode = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MODE_CONFIGURATION_MODE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.CONFIGURATION_COLLABORATION_CONFIGURATION_COLLABORATION_MODE),value_mode, tabModes);
    }

}
