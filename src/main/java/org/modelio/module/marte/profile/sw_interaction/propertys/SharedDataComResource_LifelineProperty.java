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

@objid ("928dd563-d944-4e4d-88c8-b3d0daacd368")
public class SharedDataComResource_LifelineProperty implements IPropertyContent {
    @objid ("b15be3a4-5d98-4a76-9f2b-e29f6ce51ffc")
    private static List<ModelElement> behavioralFeature = null;

    @objid ("82b4ed93-25da-4359-ac99-41eda4ecdbe4")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_READSERVICES_SHAREDDATACOMRESOURCE, 
        //                    MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_LIFELINE_SHAREDDATACOMRESOURCE_LIFELINE_READSERVICES, 
                    value);
        }
        else if(row == 2){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_WRITESERVICES_SHAREDDATACOMRESOURCE, 
        //                    MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_LIFELINE_SHAREDDATACOMRESOURCE_LIFELINE_WRITESERVICES, 
                    value);
        }
    }

    @objid ("0dce5ad8-9c6b-427d-a09c-ee4fbc6f5f94")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Shared Data Com Resource
        //
        behavioralFeature = MARTESearchUtils.searchBehavioralFeature(); 
        
        
        String[] tab_readServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_READSERVICES_SHAREDDATACOMRESOURCE), behavioralFeature);
        String value_readServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_READSERVICES_SHAREDDATACOMRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_LIFELINE_SHAREDDATACOMRESOURCE_LIFELINE_READSERVICES),value_readServices, tab_readServices);
        
        String[] tab_writeServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_WRITESERVICES_SHAREDDATACOMRESOURCE), behavioralFeature);
        String value_writeServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_WRITESERVICES_SHAREDDATACOMRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_LIFELINE_SHAREDDATACOMRESOURCE_LIFELINE_WRITESERVICES),value_writeServices, tab_writeServices);
    }

}
