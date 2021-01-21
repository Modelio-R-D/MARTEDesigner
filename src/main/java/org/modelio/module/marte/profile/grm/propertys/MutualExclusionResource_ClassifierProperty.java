package org.modelio.module.marte.profile.grm.propertys;

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
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.MARTESearchUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("b1c55364-4940-409e-9391-4162ff0550cf")
public class MutualExclusionResource_ClassifierProperty implements IPropertyContent {
    @objid ("1359893a-c8ce-48f1-b588-34dd580de4d6")
    private static List<ModelElement> listScheduler = null;

    @objid ("45936703-9aa1-4c69-89eb-d735df1c7761")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCE_CLASSIFIER_PROTECTKIND, value);
        
        }
        else if(row == 2){
            if(ModelUtils.isInteger(value)) {
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCE_CLASSIFIER_CEILING, value);
            }else{
                new ErrorMessageBox(Display.getDefault().getActiveShell()
                        ,I18nMessageService.getString("Ui.NotInteger", value)
                );
            }
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCE_CLASSIFIER_OTHERPROTECTPROTOCOL, value);
        
        }
        else if(row == 4){
            ArrayList<String> possibleTagTypeName = new ArrayList<>();
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
                    MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCE_CLASSIFIER_SCHEDULER,
                    possibleTagTypeName,
                    value
                   );
        }
    }

    @objid ("cb4ec1c5-28a1-4e38-9a9f-adf1a4bf178b")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // MutualExclusionResource
        //
        String[] types = MARTEEnumerationUtils.getProtectProtocolKind();
        String value_protectKind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_PROTECTKIND, elt);
        if(!(MARTEEnumerationUtils.isProtectProtocolKind(value_protectKind))){
              value_protectKind = "PriorityInheritance";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_PROTECTKIND),value_protectKind, types);
        
        String value_ceiling = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCE_CLASSIFIER_CEILING, elt);
        if(!(ModelUtils.isInteger(value_ceiling))){
            value_ceiling = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCE_CLASSIFIER_CEILING),value_ceiling);
        
        String value_otherProtectProtocol = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCE_CLASSIFIER_OTHERPROTECTPROTOCOL, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCE_CLASSIFIER_OTHERPROTECTPROTOCOL),value_otherProtectProtocol);
        
        //
        // Scheduler
        //
        listScheduler = MARTESearchUtils.searchScheduler();   
        String[] tab_scheduler = ModelUtils.createListString(listScheduler);      
        String value_scheduler = ModelUtils.getSourceDependencyNames(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_SCHEDULER_MUTUALEXCLUSIONRESOURCE_SCHEDULER);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCE_CLASSIFIER_SCHEDULER), value_scheduler, tab_scheduler);
    }

}
