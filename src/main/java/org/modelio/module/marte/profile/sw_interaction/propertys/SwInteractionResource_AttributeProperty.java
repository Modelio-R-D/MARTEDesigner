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

@objid ("8435875b-a745-4ec1-8cdf-711cb6f56906")
public class SwInteractionResource_AttributeProperty implements IPropertyContent {
    @objid ("0f7e4f66-3485-4639-b5d3-56d8486de345")
    private static List<ModelElement> typedElements = null;

    @objid ("7de89e5c-cdea-4ad5-b11a-ccff9436f0b4")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
           ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_ATTRIBUTE_SWINTERACTIONRESOURCE_ATTRIBUTE_ISINTRAMEMORYPARTITIONINTERACTION, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_ATTRIBUTE_SWINTERACTIONRESOURCE_ATTRIBUTE_WAITINGQUEUEPOLICY, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_ATTRIBUTE_SWINTERACTIONRESOURCE_ATTRIBUTE_WAITINGQUEUECAPACITY, value);
        }
        else if(row == 4){
             ModelUtils.manageMultipleOrientedLink(elt, 
                     typedElements, 
                     MARTEDesignerStereotypes.PROFILEASSOCIATION_WAITINGPOLICYELEMENTS_SWINTERACTIONRESOURCE, 
        //                     MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_ATTRIBUTE_SWINTERACTIONRESOURCE_ATTRIBUTE_WAITINGPOLICYELEMENTS, 
                     value);
        }
    }

    @objid ("a7e2ad5a-8069-4135-8653-5b2df650a551")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Sw Interaction Resource
        //
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_ATTRIBUTE_SWINTERACTIONRESOURCE_ATTRIBUTE_ISINTRAMEMORYPARTITIONINTERACTION),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_ATTRIBUTE_SWINTERACTIONRESOURCE_ATTRIBUTE_ISINTRAMEMORYPARTITIONINTERACTION, elt));
        
               
        String [] tab_QueuePolicyKind = MARTEEnumerationUtils.getQueuePolicyKind();
        String value_waitingQueuePolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_ATTRIBUTE_SWINTERACTIONRESOURCE_ATTRIBUTE_WAITINGQUEUEPOLICY, elt);
        if(!(MARTEEnumerationUtils.isQueuePolicyKind(value_waitingQueuePolicy))){
            value_waitingQueuePolicy = "Undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_ATTRIBUTE_SWINTERACTIONRESOURCE_ATTRIBUTE_WAITINGQUEUEPOLICY),value_waitingQueuePolicy, tab_QueuePolicyKind);
               
        String value_waitingQueueCapacity = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_ATTRIBUTE_SWINTERACTIONRESOURCE_ATTRIBUTE_WAITINGQUEUECAPACITY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_ATTRIBUTE_SWINTERACTIONRESOURCE_ATTRIBUTE_WAITINGQUEUECAPACITY),value_waitingQueueCapacity);
        
        typedElements = MARTESearchUtils.searchTypedElement();       
        String[] tab_waitingPolicyElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_WAITINGPOLICYELEMENTS_SWINTERACTIONRESOURCE), typedElements);
        String value_waitingPolicyElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_WAITINGPOLICYELEMENTS_SWINTERACTIONRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_ATTRIBUTE_SWINTERACTIONRESOURCE_ATTRIBUTE_WAITINGPOLICYELEMENTS),value_waitingPolicyElements, tab_waitingPolicyElements);
    }

}
