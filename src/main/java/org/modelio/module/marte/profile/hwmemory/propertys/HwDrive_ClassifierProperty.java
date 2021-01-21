package org.modelio.module.marte.profile.hwmemory.propertys;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.LinkManager;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.MARTESearchUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("f64f74a4-e9fc-46da-ae55-9093174afc6e")
public class HwDrive_ClassifierProperty implements IPropertyContent {
    @objid ("51ceaa38-009a-4ccd-8185-27def0a307d6")
    private static List<ModelElement> ownedBuffers;

    @objid ("a19762ea-d63e-46d6-9015-8dcdada58f7a")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWDRIVE_CLASSIFIER_HWDRIVE_CLASSIFIER_SECTORSIZE, value);
        }
        else if(row == 2){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedBuffers, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_BUFFER_HWDRIVE_HWRAM, 
        //                    MARTEDesignerTagTypes.HWDRIVE_CLASSIFIER_HWDRIVE_CLASSIFIER_BUFFER,
                    value);
        }
    }

    @objid ("46479c12-53a2-4a2c-abac-e2fde3c94646")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Drive
        //
        String value_sectorSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDRIVE_CLASSIFIER_HWDRIVE_CLASSIFIER_SECTORSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDRIVE_CLASSIFIER_HWDRIVE_CLASSIFIER_SECTORSIZE),value_sectorSize);
        
        ownedBuffers = MARTESearchUtils.getOwnedHwRAM(elt); 
        String[] tab_buffer = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_BUFFER_HWDRIVE_HWRAM), ownedBuffers);  
        String value_buffer = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_BUFFER_HWDRIVE_HWRAM, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDRIVE_CLASSIFIER_HWDRIVE_CLASSIFIER_BUFFER),value_buffer, tab_buffer);
    }

}
