package org.modelio.module.marte.profile.hwcomputing.propertys;

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

@objid ("19be193f-5efa-43a7-9671-f70556d099f2")
public class HwProcessor_AttributeProperty implements IPropertyContent {
    @objid ("c95eb72b-cb8a-4099-a9fd-371d9997cdc8")
    private static List<ModelElement> ownedCaches;

    @objid ("19d65181-c5f3-42e6-84f2-61d22b3a4bc5")
    private static List<ModelElement> ownedMMUs;

    @objid ("afbc1720-bff1-4380-9e27-545f7835ed32")
    private static List<ModelElement> ownedISAs;

    @objid ("f0a5c422-fdc5-450e-95fa-63170c68a738")
    private static List<ModelElement> ownedPredictors;

    @objid ("077cf89c-52dd-4436-b4e4-5552abb4bc70")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_ARCHITECTURE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_MIPS, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_IPC, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_NBCORES, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_NBPIPELINES, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_NBSTAGES, value);
        }
        else if(row == 7){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_NBALUS, value);
        }
        else if(row == 8){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_NBFPUS, value);
        }
        else if(row == 9){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedISAs, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDISAS_HWPROCESSOR_HWISA, 
        //                    MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_OWNEDISAS,
                    value);
        }
        else if(row == 10){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedPredictors, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_PREDICTORS_HWPROCESSOR_HWBRANCHPREDICTOR, 
        //                    MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_PREDICTORS,
                    value);
        }
        else if(row == 11){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedCaches, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_CACHES_HWPROCESSOR_HWCACHE, 
        //                    MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_CACHES,
                    value);
        }
        else if(row == 12){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedMMUs, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDMMUS_HWPROCESSOR_HWMMU, 
        //                    MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_OWNEDMMUS,
                    value);
         }
    }

    @objid ("27ba1ee7-a433-4654-ba02-3a70f64d7f38")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Processor
        //
        String value_architecture = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_ARCHITECTURE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_ARCHITECTURE),value_architecture);
        
        
        String value_mips = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_MIPS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_MIPS),value_mips);
        
        
        String value_ipc = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_IPC, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_IPC),value_ipc);
        
        
        String value_nbCores = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_NBCORES, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_NBCORES),value_nbCores);
        
        
        String value_nbPipelines = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_NBPIPELINES, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_NBPIPELINES),value_nbPipelines);
        
        
        String value_nbStages = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_NBSTAGES, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_NBSTAGES),value_nbStages);
        
        
        String value_nbALUs = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_NBALUS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_NBALUS),value_nbALUs);
        
        
        String value_nbFPUs = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_NBFPUS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_NBFPUS),value_nbFPUs);
        
        ownedISAs = MARTESearchUtils.getOwnedISAs(elt); 
        String[] tab_ownedISAs = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM), ownedISAs);  
        String value_ownedISAs = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_OWNEDISAS),value_ownedISAs, tab_ownedISAs);
        
        
        ownedPredictors = MARTESearchUtils.getOwnedHwRAM(elt); 
        String[] tab_predictors = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM), ownedPredictors);  
        String value_predictors = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_POWEREDSERVICES_HWCOMPONENT_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_PREDICTORS),value_predictors, tab_predictors);
        
        
        ownedCaches = MARTESearchUtils.getOwnedCaches(elt); 
        String[] tab_caches = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_CACHES_HWPROCESSOR_HWCACHE), ownedCaches);  
        String value_caches = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_CACHES_HWPROCESSOR_HWCACHE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_CACHES),value_caches, tab_caches);
        
        ownedMMUs = MARTESearchUtils.getOwnedHwRAM(elt); 
        String[] tab_ownedMMUs = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM), ownedMMUs);  
        String value_ownedMMUs = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_OWNEDMMUS),value_ownedMMUs, tab_ownedMMUs);
    }

}
