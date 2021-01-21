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

@objid ("a0e34741-a5e6-4b04-882f-5a03ed415317")
public class HwMedia_LinkProperty implements IPropertyContent {
    @objid ("537b32ec-56dd-4e54-af21-bd75ed1c9924")
    private static List<String> tagTypeNames = new ArrayList<>();

    @objid ("c5632e6b-da96-44ad-b146-f1b9ef84b5d3")
    private static List<ModelElement> hwArbiter;

    @objid ("75f6fe55-d93d-4e4b-8ae1-ade0384a1f1c")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageSourceMultipleLink(elt, 
                    hwArbiter, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ARBITERS_HWMEDIA_HWARBITER, 
                    MARTEDesignerTagTypes.HWMEDIA_LINK_HWMEDIA_LINK_ARBITERS,
                    tagTypeNames,
                    value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMEDIA_LINK_HWMEDIA_LINK_BANDWIDTH, value);
        }
    }

    @objid ("55da9820-50b9-43e3-88d3-42be7db07d20")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Media
        //
        
        hwArbiter = MARTESearchUtils.searchHwArbiter();
        String[] tabArbiters = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ARBITERS_HWMEDIA_HWARBITER), hwArbiter);
        String value_arbiters = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ARBITERS_HWMEDIA_HWARBITER, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEDIA_LINK_HWMEDIA_LINK_ARBITERS),value_arbiters, tabArbiters);
        
        String value_bandwidth = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEDIA_LINK_HWMEDIA_LINK_BANDWIDTH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEDIA_LINK_HWMEDIA_LINK_BANDWIDTH),value_bandwidth);
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
