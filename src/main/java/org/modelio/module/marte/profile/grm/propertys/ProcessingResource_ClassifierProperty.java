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
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.MARTESearchUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("7beea805-10ee-4319-92cb-7b6c2cba6b51")
public class ProcessingResource_ClassifierProperty implements IPropertyContent {
    @objid ("918c4966-cd64-49d8-82e2-2e876e9e09aa")
    private static List<ModelElement> listScheduler = null;

    @objid ("cab39984-21dd-4b41-8a87-192f7c8c9f85")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ArrayList<String> possibleTagTypeName = new ArrayList<>();
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULER_ASSOCIATION_SCHEDULER_ASSOCIATION_PROCESSINGUNITS);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULER_ASSOCIATIONEND_SCHEDULER_ASSOCIATIONEND_PROCESSINGUNITS);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULER_ATTRIBUTE_SCHEDULER_ATTRIBUTE_PROCESSINGUNITS);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULER_CLASSIFIER_SCHEDULER_CLASSIFIER_PROCESSINGUNITS);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULER_INSTANCE_SCHEDULER_INSTANCE_PROCESSINGUNITS);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULER_LIFELINE_SCHEDULER_LIFELINE_PROCESSINGUNITS);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_PROCESSINGUNITS);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULER_PARAMETER_SCHEDULER_PARAMETER_PROCESSINGUNITS);
        
        
            ModelUtils.manageOneToMultipleLink(elt, 
                    listScheduler, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MAINSCHEDULER_PROCESSINGRESOURCE_SCHEDULER, 
                    MARTEDesignerTagTypes.PROCESSINGRESOURCE_CLASSIFIER_PROCESSINGRESOURCE_CLASSIFIER_MAINSCHEDULER, 
                    possibleTagTypeName,
                    value
            );
        
        }
        else if(row == 2){
            if (ModelUtils.isDouble(value)) {
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PROCESSINGRESOURCE_CLASSIFIER_PROCESSINGRESOURCE_CLASSIFIER_SPEEDFACTOR, value);
            }else{
                new ErrorMessageBox(Display.getDefault().getActiveShell()
                        ,I18nMessageService.getString("Ui.NotDouble", value)
                );
            }
        }
    }

    @objid ("9268d9a3-771d-436c-8db5-573ea649f097")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Processing Resource
        //
        
        listScheduler = MARTESearchUtils.searchScheduler();
        String[] tab_mainScheduler = ModelUtils.createListString(listScheduler);      
        String value_mainScheduler = ModelUtils.getSourceDependencyNames(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MAINSCHEDULER_PROCESSINGRESOURCE_SCHEDULER);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PROCESSINGRESOURCE_CLASSIFIER_PROCESSINGRESOURCE_CLASSIFIER_MAINSCHEDULER), value_mainScheduler, tab_mainScheduler);
        
        String value_speedFactor = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PROCESSINGRESOURCE_CLASSIFIER_PROCESSINGRESOURCE_CLASSIFIER_SPEEDFACTOR, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PROCESSINGRESOURCE_CLASSIFIER_PROCESSINGRESOURCE_CLASSIFIER_SPEEDFACTOR),value_speedFactor);
    }

}
