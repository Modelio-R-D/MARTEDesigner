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

@objid ("c858dfbf-36d6-435d-bcc0-30426624222b")
public class SharedDataComResource_LinkProperty implements IPropertyContent {
    @objid ("160ad83d-a46a-401a-b733-c3c0bf4fedfe")
    private static List<ModelElement> behavioralFeature = null;

    @objid ("c7bdcc3c-6df4-480f-bb99-775045e740da")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_READSERVICES_SHAREDDATACOMRESOURCE, 
        //                    MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_LINK_SHAREDDATACOMRESOURCE_LINK_READSERVICES, 
                    value);
        }
        else if(row == 2){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_WRITESERVICES_SHAREDDATACOMRESOURCE, 
        //                    MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_LINK_SHAREDDATACOMRESOURCE_LINK_WRITESERVICES, 
                    value);
        }
    }

    @objid ("7f774e26-0cbf-4090-9d74-0a6c52ff309b")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Shared Data Com Resource
        //
        behavioralFeature = MARTESearchUtils.searchBehavioralFeature(); 
        
        
        String[] tab_readServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_READSERVICES_SHAREDDATACOMRESOURCE), behavioralFeature);
        String value_readServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_READSERVICES_SHAREDDATACOMRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_LINK_SHAREDDATACOMRESOURCE_LINK_READSERVICES),value_readServices, tab_readServices);
        
        String[] tab_writeServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_WRITESERVICES_SHAREDDATACOMRESOURCE), behavioralFeature);
        String value_writeServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_WRITESERVICES_SHAREDDATACOMRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_LINK_SHAREDDATACOMRESOURCE_LINK_WRITESERVICES),value_writeServices, tab_writeServices);
    }

}
