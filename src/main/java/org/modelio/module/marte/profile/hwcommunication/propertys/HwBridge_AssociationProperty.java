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

@objid ("4eec941e-4231-46a3-aca3-f7f480da8bd8")
public class HwBridge_AssociationProperty implements IPropertyContent {
    @objid ("acd7ecab-6fcc-4479-9fd8-7172fbd37f39")
    private static List<ModelElement> referencedHwMedia;

    @objid ("2daa02ab-0df6-4e3d-a815-9966ada008f3")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwMedia, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_SIDES_HWBRIDGE_HWMEDIA, 
        //                    MARTEDesignerTagTypes.HWBRIDGE_ASSOCIATIONEND_HWBRIDGE_ASSOCIATIONEND_SIDES,
                    value);
        }
    }

    @objid ("0785aac1-6fc0-4fee-9462-39da00307feb")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Bridge
        //
        referencedHwMedia = MARTESearchUtils.searchHwMedia();
        String[] tab_sides = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_SIDES_HWBRIDGE_HWMEDIA), referencedHwMedia);  
        String value_sides = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_SIDES_HWBRIDGE_HWMEDIA, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWBRIDGE_ASSOCIATION_HWBRIDGE_ASSOCIATION_SIDES),value_sides, tab_sides);
    }

}
