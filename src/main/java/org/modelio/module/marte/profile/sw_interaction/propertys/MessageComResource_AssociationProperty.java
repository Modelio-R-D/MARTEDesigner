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

@objid ("343a6d0a-223b-41bc-9017-d36308522048")
public class MessageComResource_AssociationProperty implements IPropertyContent {
    @objid ("6ffb2820-c026-4ec1-98c9-e88ca7b30e90")
    private static List<ModelElement> typedElement = null;

    @objid ("10471034-3127-4c14-ad40-efe5a571a293")
    private static List<ModelElement> behavioralFeature = null;

    @objid ("cc3b8a91-d45a-4258-8b41-9e89be98f3ff")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_ISFIXEDMESSAGESIZE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_MECHANISM, value);
        }
        else if(row == 3){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MESSAGESIZEELEMENTS_MESSAGECOMRESOURCE, 
        //                    MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_MESSAGESIZEELEMENTS, 
                    value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MESSAGEQUEUECAPACITYELEMENTS_MESSAGECOMRESOURCE, 
        //                    MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_MESSAGEQUEUECAPACITYELEMENTS, 
                    value);
        
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_MESSAGEQUEUEPOLICY, value);
        }
        else if(row == 6){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_SENDSERVICES_MESSAGECOMRESOURCE, 
        //                    MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_SENDSERVICES, 
                    value);
        }
        else if(row == 7){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_RECEIVESERVICES_MESSAGECOMRESOURCE, 
        //                    MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_RECEIVESERVICES, 
                    value);
        }
    }

    @objid ("388afe7b-d61a-4dc8-8115-a34bdd09c06f")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Message Com Resource
        //
        
        typedElement = MARTESearchUtils.searchTypedElement();   
        behavioralFeature = MARTESearchUtils.searchBehavioralFeature(); 
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_ISFIXEDMESSAGESIZE),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_ISFIXEDMESSAGESIZE, elt));
        
        String[] types = MARTEEnumerationUtils.getMessageResourceKind();
        String value_mechanism = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_MECHANISM, elt);
        if(!(MARTEEnumerationUtils.isMessageResourceKind(value_mechanism))){
            value_mechanism = "Undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_MECHANISM),value_mechanism, types);
        
        String[] tab_messageSizeElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MESSAGESIZEELEMENTS_MESSAGECOMRESOURCE), typedElement);
        String value_messageSizeElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MESSAGESIZEELEMENTS_MESSAGECOMRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_MESSAGESIZEELEMENTS),value_messageSizeElements, tab_messageSizeElements);
        
        String[] tab_messageQueueCapacityElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MESSAGEQUEUECAPACITYELEMENTS_MESSAGECOMRESOURCE), typedElement);
        String value_messageQueueCapacityElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MESSAGEQUEUECAPACITYELEMENTS_MESSAGECOMRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_MESSAGEQUEUECAPACITYELEMENTS),value_messageQueueCapacityElements, tab_messageQueueCapacityElements);
        
        types = MARTEEnumerationUtils.getQueuePolicyKind();
        String value_messageQueuePolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_MESSAGEQUEUEPOLICY, elt);
        if(!(MARTEEnumerationUtils.isQueuePolicyKind(value_messageQueuePolicy))){
            value_messageQueuePolicy = "Undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_MESSAGEQUEUEPOLICY),value_messageQueuePolicy, types);
        
        String[] tab_sendServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_SENDSERVICES_MESSAGECOMRESOURCE), behavioralFeature);
        String value_sendServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_SENDSERVICES_MESSAGECOMRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_SENDSERVICES),value_sendServices, tab_sendServices);
        
        String[] tab_receiveServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_RECEIVESERVICES_MESSAGECOMRESOURCE), behavioralFeature);
        String value_receiveServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_RECEIVESERVICES_MESSAGECOMRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_RECEIVESERVICES),value_receiveServices, tab_receiveServices);
    }

}
