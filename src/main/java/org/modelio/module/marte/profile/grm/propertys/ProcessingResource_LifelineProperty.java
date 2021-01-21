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

@objid ("cf5c3a73-40ac-49df-a729-52a1132e3793")
public class ProcessingResource_LifelineProperty implements IPropertyContent {
    @objid ("65e0449e-db3b-4328-afaf-a4d6ccf4e6b5")
    private static List<ModelElement> listScheduler = null;

    @objid ("d79eed56-7cf0-4c85-90ad-3ddaccb30fc0")
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
                    MARTEDesignerTagTypes.PROCESSINGRESOURCE_LIFELINE_PROCESSINGRESOURCE_LIFELINE_MAINSCHEDULER, 
                    possibleTagTypeName,
                    value
            );
        
        }
        else if(row == 2){
            if (ModelUtils.isDouble(value)) {
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PROCESSINGRESOURCE_LIFELINE_PROCESSINGRESOURCE_LIFELINE_SPEEDFACTOR, value);
            }else{
                new ErrorMessageBox(Display.getDefault().getActiveShell()
                        ,I18nMessageService.getString("Ui.NotDouble", value)
                );
            }
        }
    }

    @objid ("e334c34e-6d8e-4ed7-bc38-7d401675cff4")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Processing Resource
        //
        
        listScheduler = MARTESearchUtils.searchScheduler();
        String[] tab_mainScheduler = ModelUtils.createListString(listScheduler);      
        String value_mainScheduler = ModelUtils.getSourceDependencyNames(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MAINSCHEDULER_PROCESSINGRESOURCE_SCHEDULER);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PROCESSINGRESOURCE_LIFELINE_PROCESSINGRESOURCE_LIFELINE_MAINSCHEDULER), value_mainScheduler, tab_mainScheduler);
        
        String value_speedFactor = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PROCESSINGRESOURCE_LIFELINE_PROCESSINGRESOURCE_LIFELINE_SPEEDFACTOR, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PROCESSINGRESOURCE_LIFELINE_PROCESSINGRESOURCE_LIFELINE_SPEEDFACTOR),value_speedFactor);
    }

}
