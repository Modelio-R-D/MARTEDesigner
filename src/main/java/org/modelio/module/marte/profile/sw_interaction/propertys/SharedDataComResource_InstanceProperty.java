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

@objid ("baed0f19-9622-4048-93ab-6e8bd75a90cb")
public class SharedDataComResource_InstanceProperty implements IPropertyContent {
    @objid ("e9596102-1728-4701-89c1-f7fc093bcb92")
    private static List<ModelElement> behavioralFeature = null;

    @objid ("fe133a7c-1960-4f86-bc29-007e036bcfec")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_READSERVICES_SHAREDDATACOMRESOURCE, 
        //                    MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_INSTANCE_SHAREDDATACOMRESOURCE_INSTANCE_READSERVICES, 
                    value);
        }
        else if(row == 2){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_WRITESERVICES_SHAREDDATACOMRESOURCE, 
        //                    MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_INSTANCE_SHAREDDATACOMRESOURCE_INSTANCE_WRITESERVICES, 
                    value);
        }
    }

    @objid ("4ca860eb-c11d-4db5-90ea-474452197d9b")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Shared Data Com Resource
        //
        behavioralFeature = MARTESearchUtils.searchBehavioralFeature(); 
        
        
        String[] tab_readServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_READSERVICES_SHAREDDATACOMRESOURCE), behavioralFeature);
        String value_readServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_READSERVICES_SHAREDDATACOMRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_INSTANCE_SHAREDDATACOMRESOURCE_INSTANCE_READSERVICES),value_readServices, tab_readServices);
        
        String[] tab_writeServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_WRITESERVICES_SHAREDDATACOMRESOURCE), behavioralFeature);
        String value_writeServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_WRITESERVICES_SHAREDDATACOMRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_INSTANCE_SHAREDDATACOMRESOURCE_INSTANCE_WRITESERVICES),value_writeServices, tab_writeServices);
    }

}
