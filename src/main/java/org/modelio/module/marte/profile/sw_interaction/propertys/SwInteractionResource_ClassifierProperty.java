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

@objid ("c4d95e8c-5fcd-4855-9519-7349c3d9560b")
public class SwInteractionResource_ClassifierProperty implements IPropertyContent {
    @objid ("996e4562-a79a-474e-8ac9-6ad0eff6af5e")
    private static List<ModelElement> typedElements = null;

    @objid ("e295588f-85ff-487b-a33a-a305d8a1a8a4")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
           ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_CLASSIFIER_SWINTERACTIONRESOURCE_CLASSIFIER_ISINTRAMEMORYPARTITIONINTERACTION, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_CLASSIFIER_SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGQUEUEPOLICY, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_CLASSIFIER_SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGQUEUECAPACITY, value);
        }
        else if(row == 4){
             ModelUtils.manageMultipleOrientedLink(elt, 
                     typedElements, 
                     MARTEDesignerStereotypes.PROFILEASSOCIATION_WAITINGPOLICYELEMENTS_SWINTERACTIONRESOURCE, 
        //                     MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_CLASSIFIER_SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGPOLICYELEMENTS, 
                     value);
        }
    }

    @objid ("ff36a44c-0236-4e3f-8c21-fd9f85eda9c8")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Sw Interaction Resource
        //
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_CLASSIFIER_SWINTERACTIONRESOURCE_CLASSIFIER_ISINTRAMEMORYPARTITIONINTERACTION),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_CLASSIFIER_SWINTERACTIONRESOURCE_CLASSIFIER_ISINTRAMEMORYPARTITIONINTERACTION, elt));
        
               
        String [] tab_QueuePolicyKind = MARTEEnumerationUtils.getQueuePolicyKind();
        String value_waitingQueuePolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_CLASSIFIER_SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGQUEUEPOLICY, elt);
        if(!(MARTEEnumerationUtils.isQueuePolicyKind(value_waitingQueuePolicy))){
            value_waitingQueuePolicy = "Undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_CLASSIFIER_SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGQUEUEPOLICY),value_waitingQueuePolicy, tab_QueuePolicyKind);
               
        String value_waitingQueueCapacity = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_CLASSIFIER_SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGQUEUECAPACITY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_CLASSIFIER_SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGQUEUECAPACITY),value_waitingQueueCapacity);
        
        typedElements = MARTESearchUtils.searchTypedElement();       
        String[] tab_waitingPolicyElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_WAITINGPOLICYELEMENTS_SWINTERACTIONRESOURCE), typedElements);
        String value_waitingPolicyElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_WAITINGPOLICYELEMENTS_SWINTERACTIONRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_CLASSIFIER_SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGPOLICYELEMENTS),value_waitingPolicyElements, tab_waitingPolicyElements);
    }

}
