package org.modelio.module.marte.profile.sw_interaction.propertys;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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

@objid ("1d71750e-bda7-4aeb-8697-21a7722948d3")
public class MessageComResource_ParameterProperty implements IPropertyContent {
    @objid ("daafa1a6-a074-4ad2-950e-ed0b4ad992e3")
    private static List<ModelElement> typedElement = null;

    @objid ("6e54182c-b148-424d-9360-47b8959f4279")
    private static List<ModelElement> behavioralFeature = null;

    @objid ("4caaa181-417b-4815-ad7f-4f9b6d2dc160")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_PARAMETER_MESSAGECOMRESOURCE_PARAMETER_ISFIXEDMESSAGESIZE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_PARAMETER_MESSAGECOMRESOURCE_PARAMETER_MECHANISM, value);
        }
        else if(row == 3){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MESSAGESIZEELEMENTS_MESSAGECOMRESOURCE, 
        //                    MARTEDesignerTagTypes.MESSAGECOMRESOURCE_PARAMETER_MESSAGECOMRESOURCE_PARAMETER_MESSAGESIZEELEMENTS, 
                    value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MESSAGEQUEUECAPACITYELEMENTS_MESSAGECOMRESOURCE, 
        //                    MARTEDesignerTagTypes.MESSAGECOMRESOURCE_PARAMETER_MESSAGECOMRESOURCE_PARAMETER_MESSAGEQUEUECAPACITYELEMENTS, 
                    value);
        
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_PARAMETER_MESSAGECOMRESOURCE_PARAMETER_MESSAGEQUEUEPOLICY, value);
        }
        else if(row == 6){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_SENDSERVICES_MESSAGECOMRESOURCE, 
        //                    MARTEDesignerTagTypes.MESSAGECOMRESOURCE_PARAMETER_MESSAGECOMRESOURCE_PARAMETER_SENDSERVICES, 
                    value);
        }
        else if(row == 7){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_RECEIVESERVICES_MESSAGECOMRESOURCE, 
        //                    MARTEDesignerTagTypes.MESSAGECOMRESOURCE_PARAMETER_MESSAGECOMRESOURCE_PARAMETER_RECEIVESERVICES, 
                    value);
        }
    }

    @objid ("b0739d23-12f5-4d2e-9ec7-5c73e63608c2")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Message Com Resource
        //
        
        typedElement = MARTESearchUtils.searchTypedElement();   
        behavioralFeature = MARTESearchUtils.searchBehavioralFeature(); 
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_PARAMETER_MESSAGECOMRESOURCE_PARAMETER_ISFIXEDMESSAGESIZE),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_PARAMETER_MESSAGECOMRESOURCE_PARAMETER_ISFIXEDMESSAGESIZE, elt));
        
        String[] types = MARTEEnumerationUtils.getMessageResourceKind();
        String value_mechanism = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_PARAMETER_MESSAGECOMRESOURCE_PARAMETER_MECHANISM, elt);
        if(!(MARTEEnumerationUtils.isMessageResourceKind(value_mechanism))){
            value_mechanism = "Undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_PARAMETER_MESSAGECOMRESOURCE_PARAMETER_MECHANISM),value_mechanism, types);
        
        String[] tab_messageSizeElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MESSAGESIZEELEMENTS_MESSAGECOMRESOURCE), typedElement);
        String value_messageSizeElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MESSAGESIZEELEMENTS_MESSAGECOMRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_PARAMETER_MESSAGECOMRESOURCE_PARAMETER_MESSAGESIZEELEMENTS),value_messageSizeElements, tab_messageSizeElements);
        
        String[] tab_messageQueueCapacityElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MESSAGEQUEUECAPACITYELEMENTS_MESSAGECOMRESOURCE), typedElement);
        String value_messageQueueCapacityElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MESSAGEQUEUECAPACITYELEMENTS_MESSAGECOMRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_PARAMETER_MESSAGECOMRESOURCE_PARAMETER_MESSAGEQUEUECAPACITYELEMENTS),value_messageQueueCapacityElements, tab_messageQueueCapacityElements);
        
        types = MARTEEnumerationUtils.getQueuePolicyKind();
        String value_messageQueuePolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_PARAMETER_MESSAGECOMRESOURCE_PARAMETER_MESSAGEQUEUEPOLICY, elt);
        if(!(MARTEEnumerationUtils.isQueuePolicyKind(value_messageQueuePolicy))){
            value_messageQueuePolicy = "Undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_PARAMETER_MESSAGECOMRESOURCE_PARAMETER_MESSAGEQUEUEPOLICY),value_messageQueuePolicy, types);
        
        String[] tab_sendServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_SENDSERVICES_MESSAGECOMRESOURCE), behavioralFeature);
        String value_sendServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_SENDSERVICES_MESSAGECOMRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_PARAMETER_MESSAGECOMRESOURCE_PARAMETER_SENDSERVICES),value_sendServices, tab_sendServices);
        
        String[] tab_receiveServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_RECEIVESERVICES_MESSAGECOMRESOURCE), behavioralFeature);
        String value_receiveServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_RECEIVESERVICES_MESSAGECOMRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_PARAMETER_MESSAGECOMRESOURCE_PARAMETER_RECEIVESERVICES),value_receiveServices, tab_receiveServices);
    }

}
