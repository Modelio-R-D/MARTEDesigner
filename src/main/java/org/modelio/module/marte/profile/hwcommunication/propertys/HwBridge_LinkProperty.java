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

@objid ("ed97f8ad-51e7-4dea-9205-bf37fd39bc04")
public class HwBridge_LinkProperty implements IPropertyContent {
    @objid ("eebeffa1-a0c8-477f-808b-0bc49adf3691")
    private static List<ModelElement> referencedHwMedia;

    @objid ("ef064958-4b08-484f-95bf-3b03c3e8ba12")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwMedia, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_SIDES_HWBRIDGE_HWMEDIA, 
        //                    MARTEDesignerTagTypes.HWBRIDGE_LINK_HWBRIDGE_LINK_SIDES,
                    value);
        }
    }

    @objid ("6b479fbc-f232-4fdc-89c5-4441e4eb3135")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Bridge
        //
        referencedHwMedia = MARTESearchUtils.searchHwMedia();
        String[] tab_sides = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_SIDES_HWBRIDGE_HWMEDIA), referencedHwMedia);  
        String value_sides = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_SIDES_HWBRIDGE_HWMEDIA, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWBRIDGE_LINK_HWBRIDGE_LINK_SIDES),value_sides, tab_sides);
    }

}
