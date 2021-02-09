package org.modelio.module.marte.profile.hwcommunication.propertys;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.LinkManager;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.MARTESearchUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwBridge_LifelineProperty implements IPropertyContent {
    private static List<ModelElement> referencedHwMedia;

    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwMedia, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_SIDES_HWBRIDGE_HWMEDIA, 
        //                    MARTEDesignerTagTypes.HWBRIDGE_LIFELINE_HWBRIDGE_LIFELINE_SIDES,
                    value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Bridge
        //
        referencedHwMedia = MARTESearchUtils.searchHwMedia();
        String[] tab_sides = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_SIDES_HWBRIDGE_HWMEDIA), referencedHwMedia);  
        String value_sides = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_SIDES_HWBRIDGE_HWMEDIA, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWBRIDGE_LIFELINE_HWBRIDGE_LIFELINE_SIDES),value_sides, tab_sides);
    }

}
