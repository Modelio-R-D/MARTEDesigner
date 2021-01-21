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

@objid ("5a4df15e-bdef-4a00-a4b6-b820238b3057")
public class HwDMA_LifelineProperty implements IPropertyContent {
    @objid ("96d129e9-d97b-47c2-b331-319a662964e1")
    private static List<ModelElement> referencedHwProcessor;

    @objid ("7766fbf7-8f5d-41eb-b12f-e37e0531d7d3")
    private static List<ModelElement> referencedHwMemory;

    @objid ("e5cd498c-1c43-4d5b-bd93-78ffd729ed6b")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWDMA_LIFELINE_HWDMA_LIFELINE_NBCHANNELS, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWDMA_LIFELINE_HWDMA_LIFELINE_TRANSFERWIDTH, value);
        }
        else if(row == 3){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwProcessor, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_DRIVENBY_HWDMA_HWPROCESSOR, 
        //                    MARTEDesignerTagTypes.HWDMA_LIFELINE_HWDMA_LIFELINE_DRIVENBY,
                    value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwMemory, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MANAGEDMEMORIES_HWSTORAGEMANAGER_HWMEMORY, 
        //                    MARTEDesignerTagTypes.HWDMA_LIFELINE_HWDMA_LIFELINE_MANAGEDMEMORIES,
                    value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWDMA_LIFELINE_HWDMA_LIFELINE_ELEMENTSIZE, value);
        }
    }

    @objid ("2a698e7f-da76-4524-b658-9f2cd2ed9d6a")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        // Hw DMA
        //
        String value_nbChannels = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_LIFELINE_HWDMA_LIFELINE_NBCHANNELS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDMA_LIFELINE_HWDMA_LIFELINE_NBCHANNELS),value_nbChannels);
        
        
        String value_transferWidth = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_LIFELINE_HWDMA_LIFELINE_TRANSFERWIDTH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDMA_LIFELINE_HWDMA_LIFELINE_TRANSFERWIDTH),value_transferWidth);
        
        
        referencedHwProcessor = MARTESearchUtils.searchHwProcessor();
        String[] tab_drivenBy = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_DRIVENBY_HWDMA_HWPROCESSOR), referencedHwProcessor);  
        String value_drivenBy = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_DRIVENBY_HWDMA_HWPROCESSOR, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDMA_LIFELINE_HWDMA_LIFELINE_DRIVENBY),value_drivenBy, tab_drivenBy);
        
        referencedHwMemory = MARTESearchUtils.searchHwMemory();
        String[] tab_managedMemories = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MANAGEDMEMORIES_HWSTORAGEMANAGER_HWMEMORY), referencedHwMemory);  
        String value_managedMemories = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MANAGEDMEMORIES_HWSTORAGEMANAGER_HWMEMORY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDMA_LIFELINE_HWDMA_LIFELINE_MANAGEDMEMORIES),value_managedMemories, tab_managedMemories);
        
        String value_elementSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_LIFELINE_HWDMA_LIFELINE_ELEMENTSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDMA_LIFELINE_HWDMA_LIFELINE_ELEMENTSIZE),value_elementSize);
    }

}
