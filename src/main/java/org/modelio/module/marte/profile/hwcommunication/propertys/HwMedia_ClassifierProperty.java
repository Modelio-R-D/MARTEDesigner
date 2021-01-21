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

@objid ("679f45a3-44c3-4439-a27b-d4b17b790475")
public class HwMedia_ClassifierProperty implements IPropertyContent {
    @objid ("5a307db7-aa80-4335-8aa4-dc5780e01ef8")
    private static List<String> tagTypeNames = new ArrayList<>();

    @objid ("55f33326-9736-427b-8f15-9d8fbec6e67e")
    private static List<ModelElement> hwArbiter;

    @objid ("9f1f2133-d7a9-4a75-afe5-7f242e0c008d")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageSourceMultipleLink(elt, 
                    hwArbiter, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ARBITERS_HWMEDIA_HWARBITER, 
                    MARTEDesignerTagTypes.HWMEDIA_CLASSIFIER_HWMEDIA_CLASSIFIER_ARBITERS,
                    tagTypeNames,
                    value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMEDIA_CLASSIFIER_HWMEDIA_CLASSIFIER_BANDWIDTH, value);
        }
    }

    @objid ("1ff75055-a2b9-4d50-b826-480628a1cb1e")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Media
        //
        
        hwArbiter = MARTESearchUtils.searchHwArbiter();
        String[] tabArbiters = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ARBITERS_HWMEDIA_HWARBITER), hwArbiter);
        String value_arbiters = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ARBITERS_HWMEDIA_HWARBITER, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEDIA_CLASSIFIER_HWMEDIA_CLASSIFIER_ARBITERS),value_arbiters, tabArbiters);
        
        String value_bandwidth = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEDIA_CLASSIFIER_HWMEDIA_CLASSIFIER_BANDWIDTH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEDIA_CLASSIFIER_HWMEDIA_CLASSIFIER_BANDWIDTH),value_bandwidth);
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
