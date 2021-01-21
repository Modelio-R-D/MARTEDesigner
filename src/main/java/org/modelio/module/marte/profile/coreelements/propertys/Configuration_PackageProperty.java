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

@objid ("6d223ebd-9fb0-40af-bd9c-ce8c26201259")
public class Configuration_PackageProperty implements IPropertyContent {
    @objid ("1c5be001-523b-4741-a887-95265c24304c")
    private static List<ModelElement> modes = null;

    @objid ("51b2818a-67ec-43c8-bd80-52e7712fcea1")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
              ModelUtils.manageMultipleOrientedLink(elt,                    
                      modes, 
                      MARTEDesignerStereotypes.PROFILEASSOCIATION_MODE_CONFIGURATION_MODE, 
        //                      MARTEDesignerTagTypes.CONFIGURATION_PACKAGE_CONFIGURATION_PACKAGE_MODE,
                      value);
              }
    }

    @objid ("489a05cc-9653-4caf-b9ec-c444d5b2c097")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        modes = ModelUtils.searchElementStereotyped(State.class, MARTEDesignerStereotypes.MODE_STATE);
        String[] tabModes = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MODE_CONFIGURATION_MODE), modes);
        String value_mode = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MODE_CONFIGURATION_MODE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.CONFIGURATION_NODE_CONFIGURATION_NODE_MODE),value_mode, tabModes);
    }

}
