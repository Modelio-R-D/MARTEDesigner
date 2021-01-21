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

@objid ("7f70e399-3834-402f-8887-31c808a44daa")
public class MessageComResource_LifelineProperty implements IPropertyContent {
    @objid ("854d94e7-d6b5-4cdf-a11b-990dbcca074e")
    private static List<ModelElement> typedElement = null;

    @objid ("e039bd0e-de63-43d1-9212-5553c0b2511f")
    private static List<ModelElement> behavioralFeature = null;

    @objid ("91b5770c-11ca-4a78-bae2-15d0647be579")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_LIFELINE_MESSAGECOMRESOURCE_LIFELINE_ISFIXEDMESSAGESIZE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_LIFELINE_MESSAGECOMRESOURCE_LIFELINE_MECHANISM, value);
        }
        else if(row == 3){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MESSAGESIZEELEMENTS_MESSAGECOMRESOURCE, 
        //                    MARTEDesignerTagTypes.MESSAGECOMRESOURCE_LIFELINE_MESSAGECOMRESOURCE_LIFELINE_MESSAGESIZEELEMENTS, 
                    value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MESSAGEQUEUECAPACITYELEMENTS_MESSAGECOMRESOURCE, 
        //                    MARTEDesignerTagTypes.MESSAGECOMRESOURCE_LIFELINE_MESSAGECOMRESOURCE_LIFELINE_MESSAGEQUEUECAPACITYELEMENTS, 
                    value);
        
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_LIFELINE_MESSAGECOMRESOURCE_LIFELINE_MESSAGEQUEUEPOLICY, value);
        }
        else if(row == 6){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_SENDSERVICES_MESSAGECOMRESOURCE, 
        //                    MARTEDesignerTagTypes.MESSAGECOMRESOURCE_LIFELINE_MESSAGECOMRESOURCE_LIFELINE_SENDSERVICES, 
                    value);
        }
        else if(row == 7){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_RECEIVESERVICES_MESSAGECOMRESOURCE, 
        //                    MARTEDesignerTagTypes.MESSAGECOMRESOURCE_LIFELINE_MESSAGECOMRESOURCE_LIFELINE_RECEIVESERVICES, 
                    value);
        }
    }

    @objid ("e044df71-8377-4d50-bea6-9e6c7154f52c")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Message Com Resource
        //
        
        typedElement = MARTESearchUtils.searchTypedElement();   
        behavioralFeature = MARTESearchUtils.searchBehavioralFeature(); 
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_LIFELINE_MESSAGECOMRESOURCE_LIFELINE_ISFIXEDMESSAGESIZE),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_LIFELINE_MESSAGECOMRESOURCE_LIFELINE_ISFIXEDMESSAGESIZE, elt));
        
        String[] types = MARTEEnumerationUtils.getMessageResourceKind();
        String value_mechanism = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_LIFELINE_MESSAGECOMRESOURCE_LIFELINE_MECHANISM, elt);
        if(!(MARTEEnumerationUtils.isMessageResourceKind(value_mechanism))){
            value_mechanism = "Undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_LIFELINE_MESSAGECOMRESOURCE_LIFELINE_MECHANISM),value_mechanism, types);
        
        String[] tab_messageSizeElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MESSAGESIZEELEMENTS_MESSAGECOMRESOURCE), typedElement);
        String value_messageSizeElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MESSAGESIZEELEMENTS_MESSAGECOMRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_LIFELINE_MESSAGECOMRESOURCE_LIFELINE_MESSAGESIZEELEMENTS),value_messageSizeElements, tab_messageSizeElements);
        
        String[] tab_messageQueueCapacityElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MESSAGEQUEUECAPACITYELEMENTS_MESSAGECOMRESOURCE), typedElement);
        String value_messageQueueCapacityElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MESSAGEQUEUECAPACITYELEMENTS_MESSAGECOMRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_LIFELINE_MESSAGECOMRESOURCE_LIFELINE_MESSAGEQUEUECAPACITYELEMENTS),value_messageQueueCapacityElements, tab_messageQueueCapacityElements);
        
        types = MARTEEnumerationUtils.getQueuePolicyKind();
        String value_messageQueuePolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_LIFELINE_MESSAGECOMRESOURCE_LIFELINE_MESSAGEQUEUEPOLICY, elt);
        if(!(MARTEEnumerationUtils.isQueuePolicyKind(value_messageQueuePolicy))){
            value_messageQueuePolicy = "Undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_LIFELINE_MESSAGECOMRESOURCE_LIFELINE_MESSAGEQUEUEPOLICY),value_messageQueuePolicy, types);
        
        String[] tab_sendServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_SENDSERVICES_MESSAGECOMRESOURCE), behavioralFeature);
        String value_sendServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_SENDSERVICES_MESSAGECOMRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_LIFELINE_MESSAGECOMRESOURCE_LIFELINE_SENDSERVICES),value_sendServices, tab_sendServices);
        
        String[] tab_receiveServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_RECEIVESERVICES_MESSAGECOMRESOURCE), behavioralFeature);
        String value_receiveServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_RECEIVESERVICES_MESSAGECOMRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_LIFELINE_MESSAGECOMRESOURCE_LIFELINE_RECEIVESERVICES),value_receiveServices, tab_receiveServices);
    }

}
