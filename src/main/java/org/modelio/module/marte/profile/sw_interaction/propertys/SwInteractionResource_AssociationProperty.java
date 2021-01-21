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

@objid ("216c2612-36aa-46f4-aecd-409043d33fed")
public class SwInteractionResource_AssociationProperty implements IPropertyContent {
    @objid ("bc4f6d42-d77d-490c-868b-44d8e2446482")
    private static List<ModelElement> typedElements = null;

    @objid ("ca0310a7-45e7-44ce-9ef8-c2477e57c802")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
           ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_ASSOCIATION_SWINTERACTIONRESOURCE_ASSOCIATION_ISINTRAMEMORYPARTITIONINTERACTION, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_ASSOCIATION_SWINTERACTIONRESOURCE_ASSOCIATION_WAITINGQUEUEPOLICY, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_ASSOCIATION_SWINTERACTIONRESOURCE_ASSOCIATION_WAITINGQUEUECAPACITY, value);
        }
        else if(row == 4){
             ModelUtils.manageMultipleOrientedLink(elt, 
                     typedElements, 
                     MARTEDesignerStereotypes.PROFILEASSOCIATION_WAITINGPOLICYELEMENTS_SWINTERACTIONRESOURCE, 
        //                     MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_ASSOCIATION_SWINTERACTIONRESOURCE_ASSOCIATION_WAITINGPOLICYELEMENTS, 
                     value);
        }
    }

    @objid ("af8fcd4a-7586-4a26-8cc0-32cf0e451f2b")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Sw Interaction Resource
        //
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_ASSOCIATION_SWINTERACTIONRESOURCE_ASSOCIATION_ISINTRAMEMORYPARTITIONINTERACTION),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_ASSOCIATION_SWINTERACTIONRESOURCE_ASSOCIATION_ISINTRAMEMORYPARTITIONINTERACTION, elt));
        
               
        String [] tab_QueuePolicyKind = MARTEEnumerationUtils.getQueuePolicyKind();
        String value_waitingQueuePolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_ASSOCIATION_SWINTERACTIONRESOURCE_ASSOCIATION_WAITINGQUEUEPOLICY, elt);
        if(!(MARTEEnumerationUtils.isQueuePolicyKind(value_waitingQueuePolicy))){
            value_waitingQueuePolicy = "Undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_ASSOCIATION_SWINTERACTIONRESOURCE_ASSOCIATION_WAITINGQUEUEPOLICY),value_waitingQueuePolicy, tab_QueuePolicyKind);
               
        String value_waitingQueueCapacity = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_ASSOCIATION_SWINTERACTIONRESOURCE_ASSOCIATION_WAITINGQUEUECAPACITY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_ASSOCIATION_SWINTERACTIONRESOURCE_ASSOCIATION_WAITINGQUEUECAPACITY),value_waitingQueueCapacity);
        
        typedElements = MARTESearchUtils.searchTypedElement();       
        String[] tab_waitingPolicyElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_WAITINGPOLICYELEMENTS_SWINTERACTIONRESOURCE), typedElements);
        String value_waitingPolicyElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_WAITINGPOLICYELEMENTS_SWINTERACTIONRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_ASSOCIATION_SWINTERACTIONRESOURCE_ASSOCIATION_WAITINGPOLICYELEMENTS),value_waitingPolicyElements, tab_waitingPolicyElements);
    }

}
