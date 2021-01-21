package org.modelio.module.marte.profile.hwcommunication.propertys;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.LinkManager;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.MARTESearchUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("88129a03-dc93-4fe3-9a61-4acbaf5dce30")
public class HwBridge_ParameterProperty implements IPropertyContent {
    @objid ("445f567b-723b-47c0-972a-3054f08d96ea")
    private static List<ModelElement> referencedHwMedia;

    @objid ("586a419b-e5c3-451e-b2b1-c1e62b5f0396")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwMedia, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_SIDES_HWBRIDGE_HWMEDIA, 
        //                    MARTEDesignerTagTypes.HWBRIDGE_PARAMETER_HWBRIDGE_PARAMETER_SIDES,
                    value);
        }
    }

    @objid ("c056c43d-59db-42f1-bafa-0762baf1c46b")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Bridge
        //
        referencedHwMedia = MARTESearchUtils.searchHwMedia();
        String[] tab_sides = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_SIDES_HWBRIDGE_HWMEDIA), referencedHwMedia);  
        String value_sides = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_SIDES_HWBRIDGE_HWMEDIA, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWBRIDGE_PARAMETER_HWBRIDGE_PARAMETER_SIDES),value_sides, tab_sides);
    }

}
