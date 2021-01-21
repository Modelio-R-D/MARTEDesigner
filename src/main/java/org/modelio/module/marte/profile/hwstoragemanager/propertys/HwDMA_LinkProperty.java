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

@objid ("6c97cc05-b87b-46f9-9d81-a98262b28330")
public class HwDMA_LinkProperty implements IPropertyContent {
    @objid ("d82ef591-028b-4cf2-b3b5-a8e418798061")
    private static List<ModelElement> referencedHwProcessor;

    @objid ("6764eba3-aa67-47cc-a183-2687faf0a5ae")
    private static List<ModelElement> referencedHwMemory;

    @objid ("8ab40b3d-08cb-45d2-8c40-96cc07ccaaf8")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWDMA_LINK_HWDMA_LINK_NBCHANNELS, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWDMA_LINK_HWDMA_LINK_TRANSFERWIDTH, value);
        }
        else if(row == 3){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwProcessor, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_DRIVENBY_HWDMA_HWPROCESSOR, 
        //                    MARTEDesignerTagTypes.HWDMA_LINK_HWDMA_LINK_DRIVENBY,
                    value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwMemory, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MANAGEDMEMORIES_HWSTORAGEMANAGER_HWMEMORY, 
        //                    MARTEDesignerTagTypes.HWDMA_LINK_HWDMA_LINK_MANAGEDMEMORIES,
                    value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWDMA_LINK_HWDMA_LINK_ELEMENTSIZE, value);
        }
    }

    @objid ("1af686ff-6a8b-4bfb-8e14-d99ced197661")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        // Hw DMA
        //
        String value_nbChannels = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_LINK_HWDMA_LINK_NBCHANNELS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDMA_LINK_HWDMA_LINK_NBCHANNELS),value_nbChannels);
        
        
        String value_transferWidth = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_LINK_HWDMA_LINK_TRANSFERWIDTH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDMA_LINK_HWDMA_LINK_TRANSFERWIDTH),value_transferWidth);
        
        
        referencedHwProcessor = MARTESearchUtils.searchHwProcessor();
        String[] tab_drivenBy = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_DRIVENBY_HWDMA_HWPROCESSOR), referencedHwProcessor);  
        String value_drivenBy = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_DRIVENBY_HWDMA_HWPROCESSOR, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDMA_LINK_HWDMA_LINK_DRIVENBY),value_drivenBy, tab_drivenBy);
        
        referencedHwMemory = MARTESearchUtils.searchHwMemory();
        String[] tab_managedMemories = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MANAGEDMEMORIES_HWSTORAGEMANAGER_HWMEMORY), referencedHwMemory);  
        String value_managedMemories = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MANAGEDMEMORIES_HWSTORAGEMANAGER_HWMEMORY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDMA_LINK_HWDMA_LINK_MANAGEDMEMORIES),value_managedMemories, tab_managedMemories);
        
        String value_elementSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_LINK_HWDMA_LINK_ELEMENTSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDMA_LINK_HWDMA_LINK_ELEMENTSIZE),value_elementSize);
    }

}
