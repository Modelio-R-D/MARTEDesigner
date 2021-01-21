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

@objid ("e73d2e67-ba95-48d9-ac91-7b59ef60db36")
public class HwBridge_AttributeProperty implements IPropertyContent {
    @objid ("801a752c-2412-4a91-b6ae-790869bc7df7")
    private static List<ModelElement> referencedHwMedia;

    @objid ("a9637d8c-b2bd-4ca9-92f7-d0fd952c1cf5")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwMedia, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_SIDES_HWBRIDGE_HWMEDIA, 
        //                    MARTEDesignerTagTypes.HWBRIDGE_ATTRIBUTE_HWBRIDGE_ATTRIBUTE_SIDES,
                    value);
        }
    }

    @objid ("d49d41b9-b52f-45b5-8c3f-4acc58ced54d")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Bridge
        //
        referencedHwMedia = MARTESearchUtils.searchHwMedia();
        String[] tab_sides = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_SIDES_HWBRIDGE_HWMEDIA), referencedHwMedia);  
        String value_sides = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_SIDES_HWBRIDGE_HWMEDIA, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWBRIDGE_ATTRIBUTE_HWBRIDGE_ATTRIBUTE_SIDES),value_sides, tab_sides);
    }

}
