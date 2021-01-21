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

@objid ("6bb90fb6-647b-4bb1-9696-beb10d5548a4")
public class HwMedia_InstanceProperty implements IPropertyContent {
    @objid ("dfb106d0-e15a-4cd7-8025-2c4a41abbf97")
    private static List<String> tagTypeNames = new ArrayList<>();

    @objid ("ae04b7f0-38ad-4e31-a1ba-9c66e0be88f9")
    private static List<ModelElement> hwArbiter;

    @objid ("72b70d6d-ad21-411a-a4fc-4a8ba7a7168e")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageSourceMultipleLink(elt, 
                    hwArbiter, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ARBITERS_HWMEDIA_HWARBITER, 
                    MARTEDesignerTagTypes.HWMEDIA_INSTANCE_HWMEDIA_INSTANCE_ARBITERS,
                    tagTypeNames,
                    value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMEDIA_INSTANCE_HWMEDIA_INSTANCE_BANDWIDTH, value);
        }
    }

    @objid ("3aa6e03a-a419-4a2c-8c35-0c1f0dac403b")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Media
        //
        
        hwArbiter = MARTESearchUtils.searchHwArbiter();
        String[] tabArbiters = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ARBITERS_HWMEDIA_HWARBITER), hwArbiter);
        String value_arbiters = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ARBITERS_HWMEDIA_HWARBITER, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEDIA_INSTANCE_HWMEDIA_INSTANCE_ARBITERS),value_arbiters, tabArbiters);
        
        String value_bandwidth = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEDIA_INSTANCE_HWMEDIA_INSTANCE_BANDWIDTH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEDIA_INSTANCE_HWMEDIA_INSTANCE_BANDWIDTH),value_bandwidth);
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
