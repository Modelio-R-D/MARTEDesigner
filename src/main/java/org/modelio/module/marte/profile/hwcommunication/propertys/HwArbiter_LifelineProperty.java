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

@objid ("98686df8-9425-4f8e-bca9-73e9d9429a84")
public class HwArbiter_LifelineProperty implements IPropertyContent {
    @objid ("48a6396e-f0e8-49e0-b0f9-8d80898f9570")
    private static List<String> tagTypeNames = new ArrayList<>();

    @objid ("a87e326c-def7-4412-8c30-1f05bb6f966a")
    private static List<ModelElement> hwMedia;

    @objid ("c9b8cf98-ff83-4ef6-bedd-ea018bc78815")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){       
            ModelUtils.manageSourceMultipleLink(elt, 
                    hwMedia, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ARBITERS_HWMEDIA_HWARBITER, 
                    MARTEDesignerTagTypes.HWARBITER_LIFELINE_HWARBITER_LIFELINE_CONTROLLEDMEDIAS,
                    tagTypeNames,
                    value);
        }
    }

    @objid ("639012d4-8fc1-474e-b9f0-81ec9bf47474")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Arbiter
        //
        hwMedia = MARTESearchUtils.searchHwMedia();
        String[] tabMedias = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ARBITERS_HWMEDIA_HWARBITER), hwMedia);
        String value_controlledMedias = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ARBITERS_HWMEDIA_HWARBITER, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWARBITER_LIFELINE_HWARBITER_LIFELINE_CONTROLLEDMEDIAS),value_controlledMedias, tabMedias);
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
