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

@objid ("2cd144c7-89e0-4e3c-b290-c378dc64465e")
public class HwMedia_AssociationProperty implements IPropertyContent {
    @objid ("2470d07c-eaf9-4e8e-90ff-d5d0150e5103")
    private static List<String> tagTypeNames = new ArrayList<>();

    @objid ("bf6b7c1d-1861-431a-8947-248f1f868749")
    private static List<ModelElement> hwArbiter;

    @objid ("40429bfc-db42-4bea-a9d9-4298b237e497")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageSourceMultipleLink(elt, 
                    hwArbiter, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ARBITERS_HWMEDIA_HWARBITER, 
                    MARTEDesignerTagTypes.HWMEDIA_ASSOCIATION_HWMEDIA_ASSOCIATION_ARBITERS,
                    tagTypeNames,
                    value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMEDIA_ASSOCIATION_HWMEDIA_ASSOCIATION_BANDWIDTH, value);
        }
    }

    @objid ("a12cf9ad-4990-4d52-afb4-bca85ac8eb45")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Media
        //
        
        hwArbiter = MARTESearchUtils.searchHwArbiter();
        String[] tabArbiters = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ARBITERS_HWMEDIA_HWARBITER), hwArbiter);
        String value_arbiters = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ARBITERS_HWMEDIA_HWARBITER, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEDIA_ASSOCIATION_HWMEDIA_ASSOCIATION_ARBITERS),value_arbiters, tabArbiters);
        
        String value_bandwidth = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEDIA_ASSOCIATION_HWMEDIA_ASSOCIATION_BANDWIDTH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEDIA_ASSOCIATION_HWMEDIA_ASSOCIATION_BANDWIDTH),value_bandwidth);
    }


static {

        tagTypeNames.add(MARTEDesignerTagTypes.HWARBITER_ASSOCIATIONEND_HWARBITER_ASSOCIATIONEND_CONTROLLEDMEDIAS);
        tagTypeNames.add(MARTEDesignerTagTypes.HWARBITER_ASSOCIATION_HWARBITER_ASSOCIATION_CONTROLLEDMEDIAS);
        tagTypeNames.add(MARTEDesignerTagTypes.HWARBITER_ATTRIBUTE_HWARBITER_ATTRIBUTE_CONTROLLEDMEDIAS);
        tagTypeNames.add(MARTEDesignerTagTypes.HWARBITER_CLASSIFIER_HWARBITER_CLASSIFIER_CONTROLLEDMEDIAS);
        tagTypeNames.add(MARTEDesignerTagTypes.HWARBITER_INSTANCE_HWARBITER_INSTANCE_CONTROLLEDMEDIAS);
        tagTypeNames.add(MARTEDesignerTagTypes.HWARBITER_LIFELINE_HWARBITER_LIFELINE_CONTROLLEDMEDIAS);
        tagTypeNames.add(MARTEDesignerTagTypes.HWARBITER_LINK_HWARBITER_LINK_CONTROLLEDMEDIAS);
        tagTypeNames.add(MARTEDesignerTagTypes.HWARBITER_PARAMETER_HWARBITER_PARAMETER_CONTROLLEDMEDIAS);
    }
}
