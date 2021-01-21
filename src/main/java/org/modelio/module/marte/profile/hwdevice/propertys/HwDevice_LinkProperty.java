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

@objid ("422b4610-80c9-4edb-804c-054e14214fb7")
public class HwDevice_LinkProperty implements IPropertyContent {
    @objid ("cb7f38c7-7fb3-4c44-ad43-064f4484553d")
    private static List<ModelElement> listScheduler = null;

    @objid ("b231c276-5a02-4b9b-919f-866b517c97f0")
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
                    MARTEDesignerTagTypes.HWDEVICE_LINK_HWDEVICE_LINK_MAINSCHEDULER, 
                    possibleTagTypeName,
                    value
            );
        
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWDEVICE_LINK_HWDEVICE_LINK_SPEEDFACTOR, value);
        }
    }

    @objid ("fec277b6-c85c-4f46-ac54-d96dee1f3abc")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        listScheduler = MARTESearchUtils.searchScheduler();
        String[] tab_mainScheduler = ModelUtils.createListString(listScheduler);      
        String value_mainScheduler = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MAINSCHEDULER_PROCESSINGRESOURCE_SCHEDULER, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDEVICE_LINK_HWDEVICE_LINK_MAINSCHEDULER), value_mainScheduler, tab_mainScheduler);
        
        String value_speedFactor = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDEVICE_LINK_HWDEVICE_LINK_SPEEDFACTOR, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDEVICE_LINK_HWDEVICE_LINK_SPEEDFACTOR),value_speedFactor);
    }

}
