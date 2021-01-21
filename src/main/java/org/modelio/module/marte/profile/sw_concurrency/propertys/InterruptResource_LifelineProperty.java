package org.modelio.module.marte.profile.sw_concurrency.propertys;

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

@objid ("856ba7d4-db9f-4f54-97f8-e93516f0e316")
public class InterruptResource_LifelineProperty implements IPropertyContent {
    @objid ("5b9d81fa-71cc-4aaa-a4e6-3f4157349ac0")
    private static List<ModelElement> typedElement = null;

    @objid ("a8881588-b723-4249-854b-bf7929ac2529")
    private static List<ModelElement> behavioralFeature = null;

    @objid ("03951c95-12c2-4323-a47c-54636dc79c17")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.INTERRUPTRESOURCE_LIFELINE_INTERRUPTRESOURCE_LIFELINE_KIND, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.INTERRUPTRESOURCE_LIFELINE_INTERRUPTRESOURCE_LIFELINE_ISMASKABLE, value);
        }
        else if(row == 3){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_VECTORELEMENTS_INTERRUPTRESOURCE, 
        //                    MARTEDesignerTagTypes.INTERRUPTRESOURCE_LIFELINE_INTERRUPTRESOURCE_LIFELINE_VECTORELEMENTS, 
                    value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MASKELEMENTS_INTERRUPTRESOURCE, 
        //                    MARTEDesignerTagTypes.INTERRUPTRESOURCE_LIFELINE_INTERRUPTRESOURCE_LIFELINE_MASKELEMENTS, 
                    value);
        }
        else if(row == 5){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ROUTINECONNECTSERVICES_INTERRUPTRESOURCE, 
        //                    MARTEDesignerTagTypes.INTERRUPTRESOURCE_LIFELINE_INTERRUPTRESOURCE_LIFELINE_ROUTINECONNECTSERVICES, 
                    value);
        }
        else if(row == 6){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ROUTINEDISCONNECTSERVICES_INTERRUPTRESOURCE, 
        //                    MARTEDesignerTagTypes.INTERRUPTRESOURCE_LIFELINE_INTERRUPTRESOURCE_LIFELINE_ROUTINEDISCONNECTSERVICES, 
                    value);
        }
    }

    @objid ("165bfd49-7ba5-45e5-ad72-d85dfcfa78b8")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Interrupt Resource
        //
        
        typedElement = MARTESearchUtils.searchTypedElement();   
        behavioralFeature = MARTESearchUtils.searchBehavioralFeature(); 
        
        String[] tableInterruptKind = MARTEEnumerationUtils.getInterruptKind();
        String value_kind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_LIFELINE_INTERRUPTRESOURCE_LIFELINE_KIND, elt);
        if(!(MARTEEnumerationUtils.isInterruptKind(value_kind))){
            value_kind = "Undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.INTERRUPTRESOURCE_LIFELINE_INTERRUPTRESOURCE_LIFELINE_KIND),value_kind, tableInterruptKind); 
        
        String[] tab_vectorElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_VECTORELEMENTS_INTERRUPTRESOURCE), typedElement);
        String value_vectorElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_VECTORELEMENTS_INTERRUPTRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.INTERRUPTRESOURCE_LIFELINE_INTERRUPTRESOURCE_LIFELINE_VECTORELEMENTS),value_vectorElements, tab_vectorElements);
        
        String[] tab_maskElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MASKELEMENTS_INTERRUPTRESOURCE), typedElement);
        String value_maskElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MASKELEMENTS_INTERRUPTRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.INTERRUPTRESOURCE_LIFELINE_INTERRUPTRESOURCE_LIFELINE_MASKELEMENTS),value_maskElements, tab_maskElements);
        
        
        String[] tab_routineConnectServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ROUTINECONNECTSERVICES_INTERRUPTRESOURCE), behavioralFeature);
        String value_routineConnectServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ROUTINECONNECTSERVICES_INTERRUPTRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.INTERRUPTRESOURCE_LIFELINE_INTERRUPTRESOURCE_LIFELINE_ROUTINECONNECTSERVICES),value_routineConnectServices, tab_routineConnectServices);
        
        
        String[] tab_routineDisconnectServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ROUTINEDISCONNECTSERVICES_INTERRUPTRESOURCE), behavioralFeature);
        String value_routineDisconnectServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ROUTINEDISCONNECTSERVICES_INTERRUPTRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.INTERRUPTRESOURCE_LIFELINE_INTERRUPTRESOURCE_LIFELINE_ROUTINEDISCONNECTSERVICES),value_routineDisconnectServices, tab_routineDisconnectServices);
    }

}
