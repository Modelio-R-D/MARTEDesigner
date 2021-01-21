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

@objid ("503e3030-a80d-40a2-9b89-50ac9e7f552f")
public class HwDMA_ParameterProperty implements IPropertyContent {
    @objid ("5b6d1c55-a47c-47d5-a692-8a710c0275fb")
    private static List<ModelElement> referencedHwProcessor;

    @objid ("997b6985-7ea2-4460-bc75-f9ecaba19960")
    private static List<ModelElement> referencedHwMemory;

    @objid ("3edcdd2f-c73b-4b8a-8acc-cfddcdb3953a")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWDMA_PARAMETER_HWDMA_PARAMETER_NBCHANNELS, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWDMA_PARAMETER_HWDMA_PARAMETER_TRANSFERWIDTH, value);
        }
        else if(row == 3){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwProcessor, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_DRIVENBY_HWDMA_HWPROCESSOR, 
        //                    MARTEDesignerTagTypes.HWDMA_PARAMETER_HWDMA_PARAMETER_DRIVENBY,
                    value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwMemory, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MANAGEDMEMORIES_HWSTORAGEMANAGER_HWMEMORY, 
        //                    MARTEDesignerTagTypes.HWDMA_PARAMETER_HWDMA_PARAMETER_MANAGEDMEMORIES,
                    value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWDMA_PARAMETER_HWDMA_PARAMETER_ELEMENTSIZE, value);
        }
    }

    @objid ("f5bcc387-713f-4537-acec-ac2036ac6989")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        // Hw DMA
        //
        String value_nbChannels = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_PARAMETER_HWDMA_PARAMETER_NBCHANNELS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDMA_PARAMETER_HWDMA_PARAMETER_NBCHANNELS),value_nbChannels);
        
        
        String value_transferWidth = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_PARAMETER_HWDMA_PARAMETER_TRANSFERWIDTH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDMA_PARAMETER_HWDMA_PARAMETER_TRANSFERWIDTH),value_transferWidth);
        
        
        referencedHwProcessor = MARTESearchUtils.searchHwProcessor();
        String[] tab_drivenBy = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_DRIVENBY_HWDMA_HWPROCESSOR), referencedHwProcessor);  
        String value_drivenBy = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_DRIVENBY_HWDMA_HWPROCESSOR, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDMA_PARAMETER_HWDMA_PARAMETER_DRIVENBY),value_drivenBy, tab_drivenBy);
        
        referencedHwMemory = MARTESearchUtils.searchHwMemory();
        String[] tab_managedMemories = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MANAGEDMEMORIES_HWSTORAGEMANAGER_HWMEMORY), referencedHwMemory);  
        String value_managedMemories = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MANAGEDMEMORIES_HWSTORAGEMANAGER_HWMEMORY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDMA_PARAMETER_HWDMA_PARAMETER_MANAGEDMEMORIES),value_managedMemories, tab_managedMemories);
        
        String value_elementSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_PARAMETER_HWDMA_PARAMETER_ELEMENTSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDMA_PARAMETER_HWDMA_PARAMETER_ELEMENTSIZE),value_elementSize);
    }

}
