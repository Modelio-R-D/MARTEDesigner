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

@objid ("df38eb72-6904-4e31-927f-1cd44f3ad952")
public class SwInteractionResource_InstanceProperty implements IPropertyContent {
    @objid ("22f5a9a5-470e-4b75-b9a2-a5fd7622ee0c")
    private static List<ModelElement> typedElements = null;

    @objid ("e9b4e3b6-6c6e-4134-8f34-1570c9aba32f")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
           ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_INSTANCE_SWINTERACTIONRESOURCE_INSTANCE_ISINTRAMEMORYPARTITIONINTERACTION, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_INSTANCE_SWINTERACTIONRESOURCE_INSTANCE_WAITINGQUEUEPOLICY, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_INSTANCE_SWINTERACTIONRESOURCE_INSTANCE_WAITINGQUEUECAPACITY, value);
        }
        else if(row == 4){
             ModelUtils.manageMultipleOrientedLink(elt, 
                     typedElements, 
                     MARTEDesignerStereotypes.PROFILEASSOCIATION_WAITINGPOLICYELEMENTS_SWINTERACTIONRESOURCE, 
        //                     MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_INSTANCE_SWINTERACTIONRESOURCE_INSTANCE_WAITINGPOLICYELEMENTS, 
                     value);
        }
    }

    @objid ("6d9bb230-3657-48e9-942c-404d88dcd7cf")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Sw Interaction Resource
        //
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_INSTANCE_SWINTERACTIONRESOURCE_INSTANCE_ISINTRAMEMORYPARTITIONINTERACTION),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_INSTANCE_SWINTERACTIONRESOURCE_INSTANCE_ISINTRAMEMORYPARTITIONINTERACTION, elt));
        
               
        String [] tab_QueuePolicyKind = MARTEEnumerationUtils.getQueuePolicyKind();
        String value_waitingQueuePolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_INSTANCE_SWINTERACTIONRESOURCE_INSTANCE_WAITINGQUEUEPOLICY, elt);
        if(!(MARTEEnumerationUtils.isQueuePolicyKind(value_waitingQueuePolicy))){
            value_waitingQueuePolicy = "Undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_INSTANCE_SWINTERACTIONRESOURCE_INSTANCE_WAITINGQUEUEPOLICY),value_waitingQueuePolicy, tab_QueuePolicyKind);
               
        String value_waitingQueueCapacity = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_INSTANCE_SWINTERACTIONRESOURCE_INSTANCE_WAITINGQUEUECAPACITY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_INSTANCE_SWINTERACTIONRESOURCE_INSTANCE_WAITINGQUEUECAPACITY),value_waitingQueueCapacity);
        
        typedElements = MARTESearchUtils.searchTypedElement();       
        String[] tab_waitingPolicyElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_WAITINGPOLICYELEMENTS_SWINTERACTIONRESOURCE), typedElements);
        String value_waitingPolicyElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_WAITINGPOLICYELEMENTS_SWINTERACTIONRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_INSTANCE_SWINTERACTIONRESOURCE_INSTANCE_WAITINGPOLICYELEMENTS),value_waitingPolicyElements, tab_waitingPolicyElements);
    }

}
