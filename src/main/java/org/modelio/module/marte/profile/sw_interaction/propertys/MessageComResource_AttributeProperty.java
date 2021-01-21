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

@objid ("985d2ff0-e91a-4675-9463-2e399bde183a")
public class MessageComResource_AttributeProperty implements IPropertyContent {
    @objid ("5540f349-78f1-49d0-ac8a-9b9e4faffd0e")
    private static List<ModelElement> typedElement = null;

    @objid ("e4c925d0-0407-46d0-bdfa-c1d1dc18678c")
    private static List<ModelElement> behavioralFeature = null;

    @objid ("4784b9a7-2894-43a8-b34f-925e763f3797")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGECOMRESOURCE_ATTRIBUTE_ISFIXEDMESSAGESIZE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGECOMRESOURCE_ATTRIBUTE_MECHANISM, value);
        }
        else if(row == 3){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MESSAGESIZEELEMENTS_MESSAGECOMRESOURCE, 
        //                    MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGESIZEELEMENTS, 
                    value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MESSAGEQUEUECAPACITYELEMENTS_MESSAGECOMRESOURCE, 
        //                    MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGEQUEUECAPACITYELEMENTS, 
                    value);
        
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGEQUEUEPOLICY, value);
        }
        else if(row == 6){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_SENDSERVICES_MESSAGECOMRESOURCE, 
        //                    MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGECOMRESOURCE_ATTRIBUTE_SENDSERVICES, 
                    value);
        }
        else if(row == 7){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_RECEIVESERVICES_MESSAGECOMRESOURCE, 
        //                    MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGECOMRESOURCE_ATTRIBUTE_RECEIVESERVICES, 
                    value);
        }
    }

    @objid ("a4cccb2a-8315-4d02-8d3e-d398b9a2984a")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Message Com Resource
        //
        
        typedElement = MARTESearchUtils.searchTypedElement();   
        behavioralFeature = MARTESearchUtils.searchBehavioralFeature(); 
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGECOMRESOURCE_ATTRIBUTE_ISFIXEDMESSAGESIZE),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGECOMRESOURCE_ATTRIBUTE_ISFIXEDMESSAGESIZE, elt));
        
        String[] types = MARTEEnumerationUtils.getMessageResourceKind();
        String value_mechanism = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGECOMRESOURCE_ATTRIBUTE_MECHANISM, elt);
        if(!(MARTEEnumerationUtils.isMessageResourceKind(value_mechanism))){
            value_mechanism = "Undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGECOMRESOURCE_ATTRIBUTE_MECHANISM),value_mechanism, types);
        
        String[] tab_messageSizeElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MESSAGESIZEELEMENTS_MESSAGECOMRESOURCE), typedElement);
        String value_messageSizeElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MESSAGESIZEELEMENTS_MESSAGECOMRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGESIZEELEMENTS),value_messageSizeElements, tab_messageSizeElements);
        
        String[] tab_messageQueueCapacityElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MESSAGEQUEUECAPACITYELEMENTS_MESSAGECOMRESOURCE), typedElement);
        String value_messageQueueCapacityElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MESSAGEQUEUECAPACITYELEMENTS_MESSAGECOMRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGEQUEUECAPACITYELEMENTS),value_messageQueueCapacityElements, tab_messageQueueCapacityElements);
        
        types = MARTEEnumerationUtils.getQueuePolicyKind();
        String value_messageQueuePolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGEQUEUEPOLICY, elt);
        if(!(MARTEEnumerationUtils.isQueuePolicyKind(value_messageQueuePolicy))){
            value_messageQueuePolicy = "Undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGEQUEUEPOLICY),value_messageQueuePolicy, types);
        
        String[] tab_sendServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_SENDSERVICES_MESSAGECOMRESOURCE), behavioralFeature);
        String value_sendServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_SENDSERVICES_MESSAGECOMRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGECOMRESOURCE_ATTRIBUTE_SENDSERVICES),value_sendServices, tab_sendServices);
        
        String[] tab_receiveServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_RECEIVESERVICES_MESSAGECOMRESOURCE), behavioralFeature);
        String value_receiveServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_RECEIVESERVICES_MESSAGECOMRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGECOMRESOURCE_ATTRIBUTE_RECEIVESERVICES),value_receiveServices, tab_receiveServices);
    }

}
