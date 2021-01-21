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

@objid ("72b526e7-2121-4b9b-9878-31b405401bc1")
public class SwInteractionResource_ParameterProperty implements IPropertyContent {
    @objid ("4e920ab1-88e6-4451-8825-2c1577a94d5d")
    private static List<ModelElement> typedElements = null;

    @objid ("a233538e-f791-427c-a9e0-2aeadf2fb9d8")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
           ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_PARAMETER_SWINTERACTIONRESOURCE_PARAMETER_ISINTRAMEMORYPARTITIONINTERACTION, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_PARAMETER_SWINTERACTIONRESOURCE_PARAMETER_WAITINGQUEUEPOLICY, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_PARAMETER_SWINTERACTIONRESOURCE_PARAMETER_WAITINGQUEUECAPACITY, value);
        }
        else if(row == 4){
             ModelUtils.manageMultipleOrientedLink(elt, 
                     typedElements, 
                     MARTEDesignerStereotypes.PROFILEASSOCIATION_WAITINGPOLICYELEMENTS_SWINTERACTIONRESOURCE, 
        //                     MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_PARAMETER_SWINTERACTIONRESOURCE_PARAMETER_WAITINGPOLICYELEMENTS, 
                     value);
        }
    }

    @objid ("371a4688-573a-41cc-9aeb-6af2937ed5e5")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Sw Interaction Resource
        //
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_PARAMETER_SWINTERACTIONRESOURCE_PARAMETER_ISINTRAMEMORYPARTITIONINTERACTION),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_PARAMETER_SWINTERACTIONRESOURCE_PARAMETER_ISINTRAMEMORYPARTITIONINTERACTION, elt));
        
               
        String [] tab_QueuePolicyKind = MARTEEnumerationUtils.getQueuePolicyKind();
        String value_waitingQueuePolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_PARAMETER_SWINTERACTIONRESOURCE_PARAMETER_WAITINGQUEUEPOLICY, elt);
        if(!(MARTEEnumerationUtils.isQueuePolicyKind(value_waitingQueuePolicy))){
            value_waitingQueuePolicy = "Undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_PARAMETER_SWINTERACTIONRESOURCE_PARAMETER_WAITINGQUEUEPOLICY),value_waitingQueuePolicy, tab_QueuePolicyKind);
               
        String value_waitingQueueCapacity = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_PARAMETER_SWINTERACTIONRESOURCE_PARAMETER_WAITINGQUEUECAPACITY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_PARAMETER_SWINTERACTIONRESOURCE_PARAMETER_WAITINGQUEUECAPACITY),value_waitingQueueCapacity);
        
        typedElements = MARTESearchUtils.searchTypedElement();       
        String[] tab_waitingPolicyElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_WAITINGPOLICYELEMENTS_SWINTERACTIONRESOURCE), typedElements);
        String value_waitingPolicyElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_WAITINGPOLICYELEMENTS_SWINTERACTIONRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_PARAMETER_SWINTERACTIONRESOURCE_PARAMETER_WAITINGPOLICYELEMENTS),value_waitingPolicyElements, tab_waitingPolicyElements);
    }

}
