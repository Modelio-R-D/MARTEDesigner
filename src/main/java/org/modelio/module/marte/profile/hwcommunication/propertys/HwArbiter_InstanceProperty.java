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

@objid ("e568f564-6698-4288-82f6-1ccf4a54815c")
public class HwArbiter_InstanceProperty implements IPropertyContent {
    @objid ("0db802f4-8d81-4bfe-962e-5c9b1b409412")
    private static List<String> tagTypeNames = new ArrayList<>();

    @objid ("0fdf7e8e-9663-42b8-b534-bd6cdc1dfb2f")
    private static List<ModelElement> hwMedia;

    @objid ("f859714e-aa94-4311-a21c-ff4ac0287191")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){       
            ModelUtils.manageSourceMultipleLink(elt, 
                    hwMedia, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ARBITERS_HWMEDIA_HWARBITER, 
                    MARTEDesignerTagTypes.HWARBITER_INSTANCE_HWARBITER_INSTANCE_CONTROLLEDMEDIAS,
                    tagTypeNames,
                    value);
        }
    }

    @objid ("79261dc0-1f5c-4534-bc61-6521101d5da9")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Arbiter
        //
        hwMedia = MARTESearchUtils.searchHwMedia();
        String[] tabMedias = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ARBITERS_HWMEDIA_HWARBITER), hwMedia);
        String value_controlledMedias = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ARBITERS_HWMEDIA_HWARBITER, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWARBITER_INSTANCE_HWARBITER_INSTANCE_CONTROLLEDMEDIAS),value_controlledMedias, tabMedias);
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
