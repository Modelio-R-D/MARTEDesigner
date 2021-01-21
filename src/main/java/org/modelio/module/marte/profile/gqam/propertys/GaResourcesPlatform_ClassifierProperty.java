package org.modelio.module.marte.profile.gqam.propertys;

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

@objid ("12611fbc-74a4-4aa6-a53f-09a3b8ea25e8")
public class GaResourcesPlatform_ClassifierProperty implements IPropertyContent {
    @objid ("0d8701b1-7a1a-4f54-b685-a9e1a1c2af1a")
    private static List<ModelElement> resources = null;

    @objid ("2463e58a-c884-4349-8583-de998708639d")
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

    @objid ("7ecc82a1-d2d7-40e0-a1e3-b03fc2af3b8c")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        resources = MARTESearchUtils.searchResource();
        String[] tab_resources = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_RESOURCES_GARESOURCESPLATFORM), resources);
        String value_resources = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_RESOURCES_GARESOURCESPLATFORM, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GARESOURCESPLATFORM_CLASSIFIER_GARESOURCESPLATFORM_CLASSIFIER_RESOURCES),value_resources, tab_resources);
    }

}
