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

@objid ("1de484bd-855a-4c3e-b91e-c853e94780dd")
public class MutualExclusionResource_InstanceProperty implements IPropertyContent {
    @objid ("588c3328-20b0-4d22-a3e3-d8419641053d")
    private static List<ModelElement> listScheduler = null;

    @objid ("fb226bef-966d-4cb4-b1b8-d4ce9fcb476d")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCE_INSTANCE_PROTECTKIND, value);
        
        }
        else if(row == 2){
            if(ModelUtils.isInteger(value)) {
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCE_INSTANCE_CEILING, value);
            }else{
                new ErrorMessageBox(Display.getDefault().getActiveShell()
                        ,I18nMessageService.getString("Ui.NotInteger", value)
                );
            }
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCE_INSTANCE_OTHERPROTECTPROTOCOL, value);
        
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
                    MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCE_INSTANCE_SCHEDULER,
                    possibleTagTypeName,
                    value
                   );
        }
    }

    @objid ("41618d71-99b8-47cf-b7fd-a9616050042b")
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
        
        String value_ceiling = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCE_INSTANCE_CEILING, elt);
        if(!(ModelUtils.isInteger(value_ceiling))){
            value_ceiling = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCE_INSTANCE_CEILING),value_ceiling);
        
        String value_otherProtectProtocol = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCE_INSTANCE_OTHERPROTECTPROTOCOL, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCE_INSTANCE_OTHERPROTECTPROTOCOL),value_otherProtectProtocol);
        
        //
        // Scheduler
        //
        listScheduler = MARTESearchUtils.searchScheduler();   
        String[] tab_scheduler = ModelUtils.createListString(listScheduler);      
        String value_scheduler = ModelUtils.getSourceDependencyNames(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_SCHEDULER_MUTUALEXCLUSIONRESOURCE_SCHEDULER);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCE_INSTANCE_SCHEDULER), value_scheduler, tab_scheduler);
    }

}
