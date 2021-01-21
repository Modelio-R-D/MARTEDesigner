package org.modelio.module.marte.profile.hwcommunication.propertys;

import java.util.ArrayList;
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

@objid ("877bf6b1-106f-4d0d-a357-e332c779e0cc")
public class HwArbiter_AttributeProperty implements IPropertyContent {
    @objid ("4f9e6631-2ae1-4c2d-be01-8c8a08206a55")
    private static List<String> tagTypeNames = new ArrayList<>();

    @objid ("58d93c45-b6ed-467d-836c-401683329321")
    private static List<ModelElement> hwMedia;

    @objid ("41683ba3-733c-4784-a0a2-f18d1fe82041")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){       
            ModelUtils.manageSourceMultipleLink(elt, 
                    hwMedia, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ARBITERS_HWMEDIA_HWARBITER, 
                    MARTEDesignerTagTypes.HWARBITER_ATTRIBUTE_HWARBITER_ATTRIBUTE_CONTROLLEDMEDIAS,
                    tagTypeNames,
                    value);
        }
    }

    @objid ("cca7fed7-2231-4554-9ca6-4257e9d16f2c")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Arbiter
        //
        hwMedia = MARTESearchUtils.searchHwMedia();
        String[] tabMedias = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ARBITERS_HWMEDIA_HWARBITER), hwMedia);
        String value_controlledMedias = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ARBITERS_HWMEDIA_HWARBITER, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWARBITER_ATTRIBUTE_HWARBITER_ATTRIBUTE_CONTROLLEDMEDIAS),value_controlledMedias, tabMedias);
    }


static {

        tagTypeNames.add(MARTEDesignerTagTypes.HWMEDIA_ASSOCIATIONEND_HWMEDIA_ASSOCIATIONEND_ARBITERS);
        tagTypeNames.add(MARTEDesignerTagTypes.HWMEDIA_ASSOCIATION_HWMEDIA_ASSOCIATION_ARBITERS);
        tagTypeNames.add(MARTEDesignerTagTypes.HWMEDIA_ATTRIBUTE_HWMEDIA_ATTRIBUTE_ARBITERS);
        tagTypeNames.add(MARTEDesignerTagTypes.HWMEDIA_CLASSIFIER_HWMEDIA_CLASSIFIER_ARBITERS);
        tagTypeNames.add(MARTEDesignerTagTypes.HWMEDIA_INSTANCE_HWMEDIA_INSTANCE_ARBITERS);
        tagTypeNames.add(MARTEDesignerTagTypes.HWMEDIA_LIFELINE_HWMEDIA_LIFELINE_ARBITERS);
        tagTypeNames.add(MARTEDesignerTagTypes.HWMEDIA_LINK_HWMEDIA_LINK_ARBITERS);
        tagTypeNames.add(MARTEDesignerTagTypes.HWMEDIA_PARAMETER_HWMEDIA_PARAMETER_ARBITERS);
    }
}
