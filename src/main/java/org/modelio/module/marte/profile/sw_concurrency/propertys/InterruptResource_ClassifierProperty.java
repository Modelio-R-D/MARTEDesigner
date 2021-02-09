package org.modelio.module.marte.profile.sw_concurrency.propertys;

import java.util.List;
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

public class InterruptResource_ClassifierProperty implements IPropertyContent {
    private static List<ModelElement> typedElement = null;

    private static List<ModelElement> behavioralFeature = null;

    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_KIND, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_ISMASKABLE, value);
        }
        else if(row == 3){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_VECTORELEMENTS_INTERRUPTRESOURCE, 
        //                    MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_VECTORELEMENTS, 
                    value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MASKELEMENTS_INTERRUPTRESOURCE, 
        //                    MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_MASKELEMENTS, 
                    value);
        }
        else if(row == 5){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ROUTINECONNECTSERVICES_INTERRUPTRESOURCE, 
        //                    MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_ROUTINECONNECTSERVICES, 
                    value);
        }
        else if(row == 6){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ROUTINEDISCONNECTSERVICES_INTERRUPTRESOURCE, 
        //                    MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_ROUTINEDISCONNECTSERVICES, 
                    value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Interrupt Resource
        //
        
        typedElement = MARTESearchUtils.searchTypedElement();   
        behavioralFeature = MARTESearchUtils.searchBehavioralFeature(); 
        
        String[] tableInterruptKind = MARTEEnumerationUtils.getInterruptKind();
        String value_kind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_KIND, elt);
        if(!(MARTEEnumerationUtils.isInterruptKind(value_kind))){
            value_kind = "Undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_KIND),value_kind, tableInterruptKind); 
        
        String[] tab_vectorElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_VECTORELEMENTS_INTERRUPTRESOURCE), typedElement);
        String value_vectorElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_VECTORELEMENTS_INTERRUPTRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_VECTORELEMENTS),value_vectorElements, tab_vectorElements);
        
        String[] tab_maskElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MASKELEMENTS_INTERRUPTRESOURCE), typedElement);
        String value_maskElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MASKELEMENTS_INTERRUPTRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_MASKELEMENTS),value_maskElements, tab_maskElements);
        
        
        String[] tab_routineConnectServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ROUTINECONNECTSERVICES_INTERRUPTRESOURCE), behavioralFeature);
        String value_routineConnectServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ROUTINECONNECTSERVICES_INTERRUPTRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_ROUTINECONNECTSERVICES),value_routineConnectServices, tab_routineConnectServices);
        
        
        String[] tab_routineDisconnectServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ROUTINEDISCONNECTSERVICES_INTERRUPTRESOURCE), behavioralFeature);
        String value_routineDisconnectServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ROUTINEDISCONNECTSERVICES_INTERRUPTRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.INTERRUPTRESOURCE_CLASSIFIER_INTERRUPTRESOURCE_CLASSIFIER_ROUTINEDISCONNECTSERVICES),value_routineDisconnectServices, tab_routineDisconnectServices);
    }

}
