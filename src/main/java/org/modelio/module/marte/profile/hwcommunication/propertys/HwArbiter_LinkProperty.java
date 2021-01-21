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

@objid ("8efcbd55-e207-455d-8353-cf45c9378539")
public class HwArbiter_LinkProperty implements IPropertyContent {
    @objid ("edda3745-308e-45c1-9042-91f841d475f4")
    private static List<String> tagTypeNames = new ArrayList<>();

    @objid ("eb1d533e-71b9-45fb-a307-a75c9797f542")
    private static List<ModelElement> hwMedia;

    @objid ("cfe1034d-3cc1-4d5a-931b-0584d44aad7e")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){       
            ModelUtils.manageSourceMultipleLink(elt, 
                    hwMedia, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ARBITERS_HWMEDIA_HWARBITER, 
                    MARTEDesignerTagTypes.HWARBITER_LINK_HWARBITER_LINK_CONTROLLEDMEDIAS,
                    tagTypeNames,
                    value);
        }
    }

    @objid ("c9747114-5d01-4da2-8e49-a2be7b3602e0")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Arbiter
        //
        hwMedia = MARTESearchUtils.searchHwMedia();
        String[] tabMedias = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ARBITERS_HWMEDIA_HWARBITER), hwMedia);
        String value_controlledMedias = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ARBITERS_HWMEDIA_HWARBITER, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWARBITER_LINK_HWARBITER_LINK_CONTROLLEDMEDIAS),value_controlledMedias, tabMedias);
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
