package org.modelio.module.marte.profile.sw_interaction.propertys;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.LinkManager;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.MARTESearchUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class NotificationResource_LifelineProperty implements IPropertyContent {
    private static List<ModelElement> typedElement = null;

    private static List<ModelElement> behavioralFeature = null;

    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_LIFELINE_NOTIFICATIONRESOURCE_LIFELINE_OCCURENCE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_LIFELINE_NOTIFICATIONRESOURCE_LIFELINE_MECHANISM, value);
        }
        else if(row == 3){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_OCCURENCECOUNTELEMENTS_NOTIFICATIONRESOURCE, 
        //                    MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_LIFELINE_NOTIFICATIONRESOURCE_LIFELINE_OCCURENCECOUNTELEMENTS, 
                    value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MASKELEMENTS_NOTIFICATIONRESOURCE, 
        //                    MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_LIFELINE_NOTIFICATIONRESOURCE_LIFELINE_MASKELEMENTS, 
                    value);
        }
        else if(row == 5){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_FLUSHSERVICES_NOTIFICATIONRESOURCE, 
        //                    MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_LIFELINE_NOTIFICATIONRESOURCE_LIFELINE_FLUSHSERVICES, 
                    value);
        }
        else if(row == 6){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_OCCURENCECOUNTELEMENTS_NOTIFICATIONRESOURCE, 
        //                    MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_LIFELINE_NOTIFICATIONRESOURCE_LIFELINE_OCCURENCECOUNTELEMENTS, 
                    value);
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_LIFELINE_NOTIFICATIONRESOURCE_LIFELINE_SIGNALSERVICES, value);
        }
        else if(row == 7){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_WAITSERVICES_NOTIFICATIONRESOURCE, 
        //                    MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_LIFELINE_NOTIFICATIONRESOURCE_LIFELINE_WAITSERVICES, 
                    value);
        }
        else if(row == 8){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_CLEARSERVICES_NOTIFICATIONRESOURCE, 
        //                    MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_LIFELINE_NOTIFICATIONRESOURCE_LIFELINE_CLEARSERVICES, 
                    value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Notification Resource
        //
        
        typedElement = MARTESearchUtils.searchTypedElement();   
        behavioralFeature = MARTESearchUtils.searchBehavioralFeature(); 
        
        
        String[] tableNotificationKind = MARTEEnumerationUtils.getNotificationKind();
        String value_occurence = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_LIFELINE_NOTIFICATIONRESOURCE_LIFELINE_OCCURENCE, elt);
        if(!(MARTEEnumerationUtils.isNotificationKind(value_occurence))){
             value_occurence = "Undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_LIFELINE_NOTIFICATIONRESOURCE_LIFELINE_OCCURENCE),value_occurence, tableNotificationKind);
        
        String[] tableNotificationResKind = MARTEEnumerationUtils.getNotificationResourceKind();
        String value_mechanism = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_LIFELINE_NOTIFICATIONRESOURCE_LIFELINE_MECHANISM, elt);
        if(!(MARTEEnumerationUtils.isNotificationResourceKind(value_mechanism))){
             value_mechanism = "Undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_LIFELINE_NOTIFICATIONRESOURCE_LIFELINE_MECHANISM),value_mechanism, tableNotificationResKind);
        
        
        String[] tab_occurenceCountElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_OCCURENCECOUNTELEMENTS_NOTIFICATIONRESOURCE), typedElement);
        String value_occurenceCountElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_OCCURENCECOUNTELEMENTS_NOTIFICATIONRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_LIFELINE_NOTIFICATIONRESOURCE_LIFELINE_OCCURENCECOUNTELEMENTS),value_occurenceCountElements, tab_occurenceCountElements);
        
        
        String[] tab_maskElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MASKELEMENTS_NOTIFICATIONRESOURCE), typedElement);
        String value_maskElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MASKELEMENTS_NOTIFICATIONRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_LIFELINE_NOTIFICATIONRESOURCE_LIFELINE_MASKELEMENTS),value_maskElements, tab_maskElements);
        
        String[] tab_flushServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_FLUSHSERVICES_NOTIFICATIONRESOURCE), behavioralFeature);
        String value_flushServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_FLUSHSERVICES_NOTIFICATIONRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_LIFELINE_NOTIFICATIONRESOURCE_LIFELINE_FLUSHSERVICES),value_flushServices, tab_flushServices);
        
        String[] tab_signalServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_SIGNALSERVICES_NOTIFICATIONRESOURCE), behavioralFeature);
        String value_signalServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_SIGNALSERVICES_NOTIFICATIONRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_LIFELINE_NOTIFICATIONRESOURCE_LIFELINE_SIGNALSERVICES),value_signalServices, tab_signalServices);
        
        String[] tab_waitServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_WAITSERVICES_NOTIFICATIONRESOURCE), behavioralFeature);
        String value_waitServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_WAITSERVICES_NOTIFICATIONRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_LIFELINE_NOTIFICATIONRESOURCE_LIFELINE_WAITSERVICES),value_waitServices, tab_waitServices);
        
        String[] tab_clearServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_CLEARSERVICES_NOTIFICATIONRESOURCE), behavioralFeature);
        String value_clearServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_CLEARSERVICES_NOTIFICATIONRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_LIFELINE_NOTIFICATIONRESOURCE_LIFELINE_CLEARSERVICES),value_clearServices, tab_clearServices);
    }

}
