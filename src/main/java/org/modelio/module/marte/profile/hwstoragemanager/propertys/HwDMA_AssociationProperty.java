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

@objid ("28703e61-d505-4b1f-b05d-277d777d92dc")
public class HwDMA_AssociationProperty implements IPropertyContent {
    @objid ("e906eaad-07a2-4938-84f5-5ea76187137f")
    private static List<ModelElement> referencedHwProcessor;

    @objid ("89bf769e-e8d7-4231-b930-39711f3bc39e")
    private static List<ModelElement> referencedHwMemory;

    @objid ("9ace84ed-6fa6-4583-9544-cab4d729a7b2")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWDMA_ASSOCIATION_HWDMA_ASSOCIATION_NBCHANNELS, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWDMA_ASSOCIATION_HWDMA_ASSOCIATION_TRANSFERWIDTH, value);
        }
        else if(row == 3){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwProcessor, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_DRIVENBY_HWDMA_HWPROCESSOR, 
        //                    MARTEDesignerTagTypes.HWDMA_ASSOCIATION_HWDMA_ASSOCIATION_DRIVENBY,
                    value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwMemory, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MANAGEDMEMORIES_HWSTORAGEMANAGER_HWMEMORY, 
        //                    MARTEDesignerTagTypes.HWDMA_ASSOCIATION_HWDMA_ASSOCIATION_MANAGEDMEMORIES,
                    value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWDMA_ASSOCIATION_HWDMA_ASSOCIATION_ELEMENTSIZE, value);
        }
    }

    @objid ("b150819f-06df-4baa-a069-95ca6ce292cc")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        // Hw DMA
        //
        String value_nbChannels = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_ASSOCIATION_HWDMA_ASSOCIATION_NBCHANNELS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDMA_ASSOCIATION_HWDMA_ASSOCIATION_NBCHANNELS),value_nbChannels);
        
        
        String value_transferWidth = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_ASSOCIATION_HWDMA_ASSOCIATION_TRANSFERWIDTH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDMA_ASSOCIATION_HWDMA_ASSOCIATION_TRANSFERWIDTH),value_transferWidth);
        
        
        referencedHwProcessor = MARTESearchUtils.searchHwProcessor();
        String[] tab_drivenBy = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_DRIVENBY_HWDMA_HWPROCESSOR), referencedHwProcessor);  
        String value_drivenBy = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_DRIVENBY_HWDMA_HWPROCESSOR, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDMA_ASSOCIATION_HWDMA_ASSOCIATION_DRIVENBY),value_drivenBy, tab_drivenBy);
        
        referencedHwMemory = MARTESearchUtils.searchHwMemory();
        String[] tab_managedMemories = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MANAGEDMEMORIES_HWSTORAGEMANAGER_HWMEMORY), referencedHwMemory);  
        String value_managedMemories = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MANAGEDMEMORIES_HWSTORAGEMANAGER_HWMEMORY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDMA_ASSOCIATION_HWDMA_ASSOCIATION_MANAGEDMEMORIES),value_managedMemories, tab_managedMemories);
        
        String value_elementSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_ASSOCIATION_HWDMA_ASSOCIATION_ELEMENTSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDMA_ASSOCIATION_HWDMA_ASSOCIATION_ELEMENTSIZE),value_elementSize);
    }

}
