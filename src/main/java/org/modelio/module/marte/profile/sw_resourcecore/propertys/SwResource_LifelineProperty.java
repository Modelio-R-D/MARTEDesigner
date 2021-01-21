package org.modelio.module.marte.profile.sw_resourcecore.propertys;

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

@objid ("faccf0ec-3378-40b0-890b-dff3cad52fd3")
public class SwResource_LifelineProperty implements IPropertyContent {
    @objid ("2df61b43-ccec-45eb-a027-f49105ee6d6e")
    private static List<ModelElement> typedElement = null;

    @objid ("7041c508-8809-454d-a5f6-5a322ff4f464")
    private static List<ModelElement> behavioralFeature = null;

    @objid ("5aede888-20fb-412a-8779-bd93722c793b")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_IDENTIFIERELEMENTS_SWRESOURCE, 
        //                    MARTEDesignerTagTypes.SWRESOURCE_LIFELINE_SWRESOURCE_LIFELINE_IDENTIFIERELEMENTS, 
                    value);
        }
        else if(row == 2){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_STATEELEMENTS_SWRESOURCE, 
        //                    MARTEDesignerTagTypes.SWRESOURCE_LIFELINE_SWRESOURCE_LIFELINE_STATEELEMENTS, 
                    value);
        }
        else if(row == 3){
            ModelUtils.manageSingleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MEMORYSIZEFOOTPRINT_SWRESOURCE, 
        //                    MARTEDesignerTagTypes.SWRESOURCE_LIFELINE_SWRESOURCE_LIFELINE_MEMORYSIZEFOOTPRINT, 
                    value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_CREATESERVICES_SWRESOURCE, 
        //                    MARTEDesignerTagTypes.SWRESOURCE_LIFELINE_SWRESOURCE_LIFELINE_CREATESERVICES, 
                    value);
        }
        else if(row == 5){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_DELETESERVICES_SWRESOURCE, 
        //                    MARTEDesignerTagTypes.SWRESOURCE_LIFELINE_SWRESOURCE_LIFELINE_DELETESERVICES, 
                    value);
        }
        else if(row == 6){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_INITIALIZESERVICES_SWRESOURCE, 
        //                    MARTEDesignerTagTypes.SWRESOURCE_LIFELINE_SWRESOURCE_LIFELINE_INITIALIZESERVICES, 
                    value);
        }
    }

    @objid ("b72f6132-dfca-4cda-b7c9-b2666563321e")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Sw Resource
        //
        
        typedElement = MARTESearchUtils.searchTypedElement();   
        behavioralFeature = MARTESearchUtils.searchBehavioralFeature(); 
        
        String[] tab_identifierElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_IDENTIFIERELEMENTS_SWRESOURCE), typedElement);
        String value_identifierElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_IDENTIFIERELEMENTS_SWRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWRESOURCE_LIFELINE_SWRESOURCE_LIFELINE_IDENTIFIERELEMENTS),value_identifierElements, tab_identifierElements);
        
        
        String[] tab_stateElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_STATEELEMENTS_SWRESOURCE), typedElement);
        String value_stateElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_STATEELEMENTS_SWRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWRESOURCE_LIFELINE_SWRESOURCE_LIFELINE_STATEELEMENTS),value_stateElements, tab_stateElements);
        
        
        String[] tab_memorySizeFootprint = ModelUtils.createListString(typedElement);      
        String value_memorySizeFootprint = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MEMORYSIZEFOOTPRINT_SWRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWRESOURCE_LIFELINE_SWRESOURCE_LIFELINE_MEMORYSIZEFOOTPRINT), value_memorySizeFootprint, tab_memorySizeFootprint);
        
        
        String[] tab_createServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_CREATESERVICES_SWRESOURCE), behavioralFeature);
        String value_createServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_CREATESERVICES_SWRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWRESOURCE_LIFELINE_SWRESOURCE_LIFELINE_CREATESERVICES),value_createServices, tab_createServices);
        
        
        String[] tab_deleteServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_DELETESERVICES_SWRESOURCE), behavioralFeature);
        String value_deleteServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_DELETESERVICES_SWRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWRESOURCE_LIFELINE_SWRESOURCE_LIFELINE_DELETESERVICES),value_deleteServices, tab_deleteServices);
        
        
        String[] tab_initializeServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_INITIALIZESERVICES_SWRESOURCE), behavioralFeature);
        String value_initializeServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_INITIALIZESERVICES_SWRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWRESOURCE_LIFELINE_SWRESOURCE_LIFELINE_INITIALIZESERVICES),value_initializeServices, tab_initializeServices);
    }

}
