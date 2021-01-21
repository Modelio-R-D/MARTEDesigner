package org.modelio.module.marte.profile.sw_interaction.propertys;

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

@objid ("8c491d01-a881-4d08-895c-d7a27149cacb")
public class SharedDataComResource_ClassifierProperty implements IPropertyContent {
    @objid ("effbf2cd-530e-4420-895e-85cd23305170")
    private static List<ModelElement> behavioralFeature = null;

    @objid ("203d15d2-bee9-4674-bb54-98936421c8a7")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_READSERVICES_SHAREDDATACOMRESOURCE, 
        //                    MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_CLASSIFIER_SHAREDDATACOMRESOURCE_CLASSIFIER_READSERVICES, 
                    value);
        }
        else if(row == 2){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_WRITESERVICES_SHAREDDATACOMRESOURCE, 
        //                    MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_CLASSIFIER_SHAREDDATACOMRESOURCE_CLASSIFIER_WRITESERVICES, 
                    value);
        }
    }

    @objid ("bce2408a-e75a-4aa6-9a11-5bcb303cda8c")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Shared Data Com Resource
        //
        behavioralFeature = MARTESearchUtils.searchBehavioralFeature(); 
        
        
        String[] tab_readServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_READSERVICES_SHAREDDATACOMRESOURCE), behavioralFeature);
        String value_readServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_READSERVICES_SHAREDDATACOMRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_CLASSIFIER_SHAREDDATACOMRESOURCE_CLASSIFIER_READSERVICES),value_readServices, tab_readServices);
        
        String[] tab_writeServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_WRITESERVICES_SHAREDDATACOMRESOURCE), behavioralFeature);
        String value_writeServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_WRITESERVICES_SHAREDDATACOMRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_CLASSIFIER_SHAREDDATACOMRESOURCE_CLASSIFIER_WRITESERVICES),value_writeServices, tab_writeServices);
    }

}
