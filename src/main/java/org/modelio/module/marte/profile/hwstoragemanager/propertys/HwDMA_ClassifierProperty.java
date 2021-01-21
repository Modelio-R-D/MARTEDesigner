package org.modelio.module.marte.profile.hwstoragemanager.propertys;

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

@objid ("9c455c06-d497-43a8-8d31-7d812c541eb1")
public class HwDMA_ClassifierProperty implements IPropertyContent {
    @objid ("394ebd8b-1497-402b-9f50-ba92914c3aed")
    private static List<ModelElement> referencedHwProcessor;

    @objid ("9c064b61-0a71-4d7a-ba5e-926c299657e7")
    private static List<ModelElement> referencedHwMemory;

    @objid ("b1484435-4fc1-4986-8099-69fec2729fdb")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWDMA_CLASSIFIER_HWDMA_CLASSIFIER_NBCHANNELS, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWDMA_CLASSIFIER_HWDMA_CLASSIFIER_TRANSFERWIDTH, value);
        }
        else if(row == 3){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwProcessor, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_DRIVENBY_HWDMA_HWPROCESSOR, 
        //                    MARTEDesignerTagTypes.HWDMA_CLASSIFIER_HWDMA_CLASSIFIER_DRIVENBY,
                    value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwMemory, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MANAGEDMEMORIES_HWSTORAGEMANAGER_HWMEMORY, 
        //                    MARTEDesignerTagTypes.HWDMA_CLASSIFIER_HWDMA_CLASSIFIER_MANAGEDMEMORIES,
                    value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWDMA_CLASSIFIER_HWDMA_CLASSIFIER_ELEMENTSIZE, value);
        }
    }

    @objid ("1ce0b707-5a35-4543-b25b-163f19ca35e0")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        // Hw DMA
        //
        String value_nbChannels = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_CLASSIFIER_HWDMA_CLASSIFIER_NBCHANNELS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDMA_CLASSIFIER_HWDMA_CLASSIFIER_NBCHANNELS),value_nbChannels);
        
        
        String value_transferWidth = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_CLASSIFIER_HWDMA_CLASSIFIER_TRANSFERWIDTH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDMA_CLASSIFIER_HWDMA_CLASSIFIER_TRANSFERWIDTH),value_transferWidth);
        
        
        referencedHwProcessor = MARTESearchUtils.searchHwProcessor();
        String[] tab_drivenBy = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_DRIVENBY_HWDMA_HWPROCESSOR), referencedHwProcessor);  
        String value_drivenBy = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_DRIVENBY_HWDMA_HWPROCESSOR, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDMA_CLASSIFIER_HWDMA_CLASSIFIER_DRIVENBY),value_drivenBy, tab_drivenBy);
        
        referencedHwMemory = MARTESearchUtils.searchHwMemory();
        String[] tab_managedMemories = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MANAGEDMEMORIES_HWSTORAGEMANAGER_HWMEMORY), referencedHwMemory);  
        String value_managedMemories = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MANAGEDMEMORIES_HWSTORAGEMANAGER_HWMEMORY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDMA_CLASSIFIER_HWDMA_CLASSIFIER_MANAGEDMEMORIES),value_managedMemories, tab_managedMemories);
        
        String value_elementSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_CLASSIFIER_HWDMA_CLASSIFIER_ELEMENTSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDMA_CLASSIFIER_HWDMA_CLASSIFIER_ELEMENTSIZE),value_elementSize);
    }

}
