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

@objid ("931e16b2-5251-47d5-917c-aad831214cab")
public class SharedDataComResource_AssociationProperty implements IPropertyContent {
    @objid ("066a3419-6a82-4548-abd3-b0d078504d5a")
    private static List<ModelElement> behavioralFeature = null;

    @objid ("36fcf99e-dfb4-4a9f-9df9-4147a55b6fea")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_READSERVICES_SHAREDDATACOMRESOURCE, 
        //                    MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_ASSOCIATION_SHAREDDATACOMRESOURCE_ASSOCIATION_READSERVICES, 
                    value);
        }
        else if(row == 2){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_WRITESERVICES_SHAREDDATACOMRESOURCE, 
        //                    MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_ASSOCIATION_SHAREDDATACOMRESOURCE_ASSOCIATION_WRITESERVICES, 
                    value);
        }
    }

    @objid ("3cc6f7c3-bc5d-451e-90ac-7f8d256bdc3e")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Shared Data Com Resource
        //
        behavioralFeature = MARTESearchUtils.searchBehavioralFeature(); 
        
        
        String[] tab_readServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_READSERVICES_SHAREDDATACOMRESOURCE), behavioralFeature);
        String value_readServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_READSERVICES_SHAREDDATACOMRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_ASSOCIATION_SHAREDDATACOMRESOURCE_ASSOCIATION_READSERVICES),value_readServices, tab_readServices);
        
        String[] tab_writeServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_WRITESERVICES_SHAREDDATACOMRESOURCE), behavioralFeature);
        String value_writeServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_WRITESERVICES_SHAREDDATACOMRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_ASSOCIATION_SHAREDDATACOMRESOURCE_ASSOCIATION_WRITESERVICES),value_writeServices, tab_writeServices);
    }

}
