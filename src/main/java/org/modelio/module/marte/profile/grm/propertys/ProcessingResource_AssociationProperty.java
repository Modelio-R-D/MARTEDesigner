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

@objid ("a185fa7e-57be-4fe1-8d75-32213076dab1")
public class ProcessingResource_AssociationProperty implements IPropertyContent {
    @objid ("f54f4fc2-bc9c-45d5-b938-38cade93e1f7")
    private static List<ModelElement> listScheduler = null;

    @objid ("33e209a7-0083-465e-8817-1ca874246dec")
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
                    MARTEDesignerTagTypes.PROCESSINGRESOURCE_ASSOCIATION_PROCESSINGRESOURCE_ASSOCIATION_MAINSCHEDULER, 
                    possibleTagTypeName,
                    value
            );
        
        }
        else if(row == 2){
            if (ModelUtils.isDouble(value)) {
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PROCESSINGRESOURCE_ASSOCIATION_PROCESSINGRESOURCE_ASSOCIATION_SPEEDFACTOR, value);
            }else{
                new ErrorMessageBox(Display.getDefault().getActiveShell()
                        ,I18nMessageService.getString("Ui.NotDouble", value)
                );
            }
        }
    }

    @objid ("47fe3e40-59b9-4af9-bbb7-cd888385a197")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Processing Resource
        //
        
        listScheduler = MARTESearchUtils.searchScheduler();
        String[] tab_mainScheduler = ModelUtils.createListString(listScheduler);      
        String value_mainScheduler = ModelUtils.getSourceDependencyNames(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MAINSCHEDULER_PROCESSINGRESOURCE_SCHEDULER);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PROCESSINGRESOURCE_ASSOCIATION_PROCESSINGRESOURCE_ASSOCIATION_MAINSCHEDULER), value_mainScheduler, tab_mainScheduler);
        
        String value_speedFactor = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PROCESSINGRESOURCE_ASSOCIATION_PROCESSINGRESOURCE_ASSOCIATION_SPEEDFACTOR, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PROCESSINGRESOURCE_ASSOCIATION_PROCESSINGRESOURCE_ASSOCIATION_SPEEDFACTOR),value_speedFactor);
    }

}
