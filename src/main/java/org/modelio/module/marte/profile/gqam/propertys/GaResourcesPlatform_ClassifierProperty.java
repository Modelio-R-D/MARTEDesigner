package org.modelio.module.marte.profile.gqam.propertys;

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

public class GaResourcesPlatform_ClassifierProperty implements IPropertyContent {
    private static List<ModelElement> resources = null;

    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    resources, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_RESOURCES_GARESOURCESPLATFORM, 
        //                    MARTEDesignerTagTypes.GARESOURCESPLATFORM_CLASSIFIER_GARESOURCESPLATFORM_CLASSIFIER_RESOURCES,
                    value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        resources = MARTESearchUtils.searchResource();
        String[] tab_resources = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_RESOURCES_GARESOURCESPLATFORM), resources);
        String value_resources = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_RESOURCES_GARESOURCESPLATFORM, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GARESOURCESPLATFORM_CLASSIFIER_GARESOURCESPLATFORM_CLASSIFIER_RESOURCES),value_resources, tab_resources);
    }

}
