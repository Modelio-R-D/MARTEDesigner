package org.modelio.module.marte.profile.hwdevice.propertys;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.MARTESearchUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("351cf39d-12ea-4828-a4c9-c247503e3276")
public class HwDevice_AttributeProperty implements IPropertyContent {
    @objid ("818b813f-7ffb-412a-8ec1-b6b87b1460ab")
    private static List<ModelElement> listScheduler = null;

    @objid ("6d439ab5-8c6d-499e-b2a8-31e0c3cdd6f6")
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
                    MARTEDesignerTagTypes.HWDEVICE_ATTRIBUTE_HWDEVICE_ATTRIBUTE_MAINSCHEDULER, 
                    possibleTagTypeName,
                    value
            );
        
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWDEVICE_ATTRIBUTE_HWDEVICE_ATTRIBUTE_SPEEDFACTOR, value);
        }
    }

    @objid ("7a690bfc-b983-4b4f-beb9-76b86bda060b")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        listScheduler = MARTESearchUtils.searchScheduler();
        String[] tab_mainScheduler = ModelUtils.createListString(listScheduler);      
        String value_mainScheduler = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MAINSCHEDULER_PROCESSINGRESOURCE_SCHEDULER, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDEVICE_ATTRIBUTE_HWDEVICE_ATTRIBUTE_MAINSCHEDULER), value_mainScheduler, tab_mainScheduler);
        
        String value_speedFactor = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDEVICE_ATTRIBUTE_HWDEVICE_ATTRIBUTE_SPEEDFACTOR, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDEVICE_ATTRIBUTE_HWDEVICE_ATTRIBUTE_SPEEDFACTOR),value_speedFactor);
    }

}
