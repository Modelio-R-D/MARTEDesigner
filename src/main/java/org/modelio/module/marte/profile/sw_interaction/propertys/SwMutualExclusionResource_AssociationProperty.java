package org.modelio.module.marte.profile.sw_interaction.propertys;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.i18n.I18nMessageService;
import org.modelio.module.marte.profile.editors.ErrorMessageBox;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.LinkManager;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.MARTESearchUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("f158f0af-8cde-4654-bc28-1a69c013c985")
public class SwMutualExclusionResource_AssociationProperty implements IPropertyContent {
    @objid ("e2ecf086-afe7-4bd8-aa31-6230dc784a11")
    private static List<ModelElement> typedElement = null;

    @objid ("6a37fedb-3d3e-435f-9bc4-9e9a94ef1e99")
    private static List<ModelElement> behavioralFeature = null;

    @objid ("436aa713-345c-4e8f-80b3-75b69b72e215")
    private static List<ModelElement> listScheduler = null;

    @objid ("d2e5989b-9031-4e37-94fa-db8ae4942df9")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_MECHANISM, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_CONCURRENTACCESSPROTOCOL, value);
        }
        else if(row == 3){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ACCESSTOKENELEMENTS_SWMUTUALEXCLUSIONRESOURCE, 
        //                    MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_ACCESSTOKENELEMENTS, 
                    value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_RELEASESERVICES_SWMUTUALEXCLUSIONRESOURCE, 
        //                    MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_RELEASESERVICES, 
                    value);
        }
        else if(row == 5){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ACQUIRESERVICES_SWMUTUALEXCLUSIONRESOURCE, 
        //                    MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_ACQUIRESERVICES, 
                    value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_PROTECTKIND, value);
        
        }
        else if(row == 7){
            if(ModelUtils.isInteger(value)) {
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_CEILING, value);
            }else{
                new ErrorMessageBox(Display.getDefault().getActiveShell()
                        ,I18nMessageService.getString("Ui.NotInteger", value)
                );
            }
        }
        else if(row == 8){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_OTHERPROTECTPROTOCOL, value);
        
        }
        else if(row == 9){
            List<String> possibleTagTypeName = new ArrayList<>();
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULER_ASSOCIATION_SCHEDULER_ASSOCIATION_PROTECTEDSHAREDRESOURCES);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULER_ASSOCIATIONEND_SCHEDULER_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULER_ATTRIBUTE_SCHEDULER_ATTRIBUTE_PROTECTEDSHAREDRESOURCES);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULER_CLASSIFIER_SCHEDULER_CLASSIFIER_PROTECTEDSHAREDRESOURCES);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULER_INSTANCE_SCHEDULER_INSTANCE_PROTECTEDSHAREDRESOURCES);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULER_LIFELINE_SCHEDULER_LIFELINE_PROTECTEDSHAREDRESOURCES);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_PROTECTEDSHAREDRESOURCES);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULER_PARAMETER_SCHEDULER_PARAMETER_PROTECTEDSHAREDRESOURCES);
        
            ModelUtils.manageOneToMultipleLink(elt,
                    listScheduler, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_SCHEDULER_MUTUALEXCLUSIONRESOURCE_SCHEDULER, 
                    MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_SCHEDULER,
                    possibleTagTypeName,
                    value
            );
        }
    }

    @objid ("26650a86-64cf-4727-8917-4d7640c12362")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Sw Mutual Exclusion Resource
        //
        typedElement = MARTESearchUtils.searchTypedElement();   
        behavioralFeature = MARTESearchUtils.searchBehavioralFeature(); 
        listScheduler = MARTESearchUtils.searchScheduler(); 
        
        String [] tab_MutualExclusionresKind = MARTEEnumerationUtils.getMutualExclusionResourceKind();
        String value_mechanism = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_MECHANISM, elt);
        if(!(MARTEEnumerationUtils.isMutualExclusionResourceKind(value_mechanism))){
            value_mechanism = "Undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_MECHANISM),value_mechanism, tab_MutualExclusionresKind);
        
        String [] tab_ConcurrentAccessProtocolKind = MARTEEnumerationUtils.getConcurrentAccessProtocolKind();
        String value_concurrentAccessProtocol = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_CONCURRENTACCESSPROTOCOL, elt);
        if(!(MARTEEnumerationUtils.isConcurrentAccessProtocolKind(value_concurrentAccessProtocol))){
            value_concurrentAccessProtocol = "Undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_CONCURRENTACCESSPROTOCOL),value_concurrentAccessProtocol, tab_ConcurrentAccessProtocolKind);
        
        String[] tab_accessTokenElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ACCESSTOKENELEMENTS_SWMUTUALEXCLUSIONRESOURCE), typedElement);
        String value_accessTokenElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ACCESSTOKENELEMENTS_SWMUTUALEXCLUSIONRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_ACCESSTOKENELEMENTS),value_accessTokenElements, tab_accessTokenElements);
        
        String[] tab_releaseServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_RELEASESERVICES_SWMUTUALEXCLUSIONRESOURCE), behavioralFeature);
        String value_releaseServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_RELEASESERVICES_SWMUTUALEXCLUSIONRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_RELEASESERVICES),value_releaseServices, tab_releaseServices);
        
        String[] tab_acquireServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ACQUIRESERVICES_SWMUTUALEXCLUSIONRESOURCE), behavioralFeature);
        String value_acquireServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ACQUIRESERVICES_SWMUTUALEXCLUSIONRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_ACQUIRESERVICES),value_acquireServices, tab_acquireServices);
        
        //
        // MutualExclusionResource
        //
        String[] types = MARTEEnumerationUtils.getProtectProtocolKind();
        String value_protectKind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_PROTECTKIND, elt);
        if(!(MARTEEnumerationUtils.isProtectProtocolKind(value_protectKind))){
            value_protectKind = "PriorityInheritance";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_PROTECTKIND),value_protectKind, types);
        
        String value_ceiling = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_CEILING, elt);
        if(!(ModelUtils.isInteger(value_ceiling))){
            value_ceiling = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_CEILING),value_ceiling);
        
        String value_otherProtectProtocol = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_OTHERPROTECTPROTOCOL, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_OTHERPROTECTPROTOCOL),value_otherProtectProtocol);
        
        //
        // Scheduler
        //    
        String[] tab_scheduler = ModelUtils.createListString(listScheduler);      
        String value_scheduler = ModelUtils.getSourceDependencyNames(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_SCHEDULER_MUTUALEXCLUSIONRESOURCE_SCHEDULER);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_SCHEDULER), value_scheduler, tab_scheduler);
    }

}
