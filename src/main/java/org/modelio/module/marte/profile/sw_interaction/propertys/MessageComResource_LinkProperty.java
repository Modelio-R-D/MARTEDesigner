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

@objid ("f223ce90-549b-4a56-91d0-aed38fc944bb")
public class MessageComResource_LinkProperty implements IPropertyContent {
    @objid ("28675dd9-97dc-4487-bef9-4b7c44b420eb")
    private static List<ModelElement> typedElement = null;

    @objid ("1f92715a-6f9b-4255-bddf-f6c311d8b41e")
    private static List<ModelElement> behavioralFeature = null;

    @objid ("a6cf1b1e-bcbb-45a2-9da1-957811c09599")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_LINK_MESSAGECOMRESOURCE_LINK_ISFIXEDMESSAGESIZE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_LINK_MESSAGECOMRESOURCE_LINK_MECHANISM, value);
        }
        else if(row == 3){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MESSAGESIZEELEMENTS_MESSAGECOMRESOURCE, 
        //                    MARTEDesignerTagTypes.MESSAGECOMRESOURCE_LINK_MESSAGECOMRESOURCE_LINK_MESSAGESIZEELEMENTS, 
                    value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MESSAGEQUEUECAPACITYELEMENTS_MESSAGECOMRESOURCE, 
        //                    MARTEDesignerTagTypes.MESSAGECOMRESOURCE_LINK_MESSAGECOMRESOURCE_LINK_MESSAGEQUEUECAPACITYELEMENTS, 
                    value);
        
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_LINK_MESSAGECOMRESOURCE_LINK_MESSAGEQUEUEPOLICY, value);
        }
        else if(row == 6){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_SENDSERVICES_MESSAGECOMRESOURCE, 
        //                    MARTEDesignerTagTypes.MESSAGECOMRESOURCE_LINK_MESSAGECOMRESOURCE_LINK_SENDSERVICES, 
                    value);
        }
        else if(row == 7){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_RECEIVESERVICES_MESSAGECOMRESOURCE, 
        //                    MARTEDesignerTagTypes.MESSAGECOMRESOURCE_LINK_MESSAGECOMRESOURCE_LINK_RECEIVESERVICES, 
                    value);
        }
    }

    @objid ("68f0a906-5ec1-4c0c-bdf0-de0bf2273d17")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Message Com Resource
        //
        
        typedElement = MARTESearchUtils.searchTypedElement();   
        behavioralFeature = MARTESearchUtils.searchBehavioralFeature(); 
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_LINK_MESSAGECOMRESOURCE_LINK_ISFIXEDMESSAGESIZE),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_LINK_MESSAGECOMRESOURCE_LINK_ISFIXEDMESSAGESIZE, elt));
        
        String[] types = MARTEEnumerationUtils.getMessageResourceKind();
        String value_mechanism = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_LINK_MESSAGECOMRESOURCE_LINK_MECHANISM, elt);
        if(!(MARTEEnumerationUtils.isMessageResourceKind(value_mechanism))){
            value_mechanism = "Undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_LINK_MESSAGECOMRESOURCE_LINK_MECHANISM),value_mechanism, types);
        
        String[] tab_messageSizeElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MESSAGESIZEELEMENTS_MESSAGECOMRESOURCE), typedElement);
        String value_messageSizeElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MESSAGESIZEELEMENTS_MESSAGECOMRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_LINK_MESSAGECOMRESOURCE_LINK_MESSAGESIZEELEMENTS),value_messageSizeElements, tab_messageSizeElements);
        
        String[] tab_messageQueueCapacityElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MESSAGEQUEUECAPACITYELEMENTS_MESSAGECOMRESOURCE), typedElement);
        String value_messageQueueCapacityElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MESSAGEQUEUECAPACITYELEMENTS_MESSAGECOMRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_LINK_MESSAGECOMRESOURCE_LINK_MESSAGEQUEUECAPACITYELEMENTS),value_messageQueueCapacityElements, tab_messageQueueCapacityElements);
        
        types = MARTEEnumerationUtils.getQueuePolicyKind();
        String value_messageQueuePolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_LINK_MESSAGECOMRESOURCE_LINK_MESSAGEQUEUEPOLICY, elt);
        if(!(MARTEEnumerationUtils.isQueuePolicyKind(value_messageQueuePolicy))){
            value_messageQueuePolicy = "Undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_LINK_MESSAGECOMRESOURCE_LINK_MESSAGEQUEUEPOLICY),value_messageQueuePolicy, types);
        
        String[] tab_sendServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_SENDSERVICES_MESSAGECOMRESOURCE), behavioralFeature);
        String value_sendServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_SENDSERVICES_MESSAGECOMRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_LINK_MESSAGECOMRESOURCE_LINK_SENDSERVICES),value_sendServices, tab_sendServices);
        
        String[] tab_receiveServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_RECEIVESERVICES_MESSAGECOMRESOURCE), behavioralFeature);
        String value_receiveServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_RECEIVESERVICES_MESSAGECOMRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_LINK_MESSAGECOMRESOURCE_LINK_RECEIVESERVICES),value_receiveServices, tab_receiveServices);
    }

}