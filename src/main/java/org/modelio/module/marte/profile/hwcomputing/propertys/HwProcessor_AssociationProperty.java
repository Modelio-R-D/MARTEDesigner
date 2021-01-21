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

@objid ("aecd9aaf-bf78-4c58-820e-871de53909cc")
public class HwProcessor_AssociationProperty implements IPropertyContent {
    @objid ("1c585daf-2310-4dde-895c-b7be3700c248")
    private static List<ModelElement> ownedCaches;

    @objid ("a0234920-5982-49cf-95ff-bb95ea05a1b2")
    private static List<ModelElement> ownedMMUs;

    @objid ("82f9a69e-9de8-4377-b359-44abdd8e9740")
    private static List<ModelElement> ownedISAs;

    @objid ("47f2f8d4-5354-47cb-8f68-c7457282741a")
    private static List<ModelElement> ownedPredictors;

    @objid ("c1e47371-b9ea-4628-b22a-eb5bd028720d")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_ARCHITECTURE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_MIPS, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_IPC, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_NBCORES, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_NBPIPELINES, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_NBSTAGES, value);
        }
        else if(row == 7){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_NBALUS, value);
        }
        else if(row == 8){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_NBFPUS, value);
        }
        else if(row == 9){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedISAs, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDISAS_HWPROCESSOR_HWISA, 
        //                    MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_OWNEDISAS,
                    value);
        }
        else if(row == 10){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedPredictors, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_PREDICTORS_HWPROCESSOR_HWBRANCHPREDICTOR, 
        //                    MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_PREDICTORS,
                    value);
        }
        else if(row == 11){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedCaches, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_CACHES_HWPROCESSOR_HWCACHE, 
        //                    MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_CACHES,
                    value);
        }
        else if(row == 12){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedMMUs, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDMMUS_HWPROCESSOR_HWMMU, 
        //                    MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_OWNEDMMUS,
                    value);
         }
    }

    @objid ("4c93bc70-b516-41d7-af5e-f770243424bd")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Processor
        //
        String value_architecture = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_ARCHITECTURE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_ARCHITECTURE),value_architecture);
        
        
        String value_mips = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_MIPS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_MIPS),value_mips);
        
        
        String value_ipc = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_IPC, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_IPC),value_ipc);
        
        
        String value_nbCores = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_NBCORES, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_NBCORES),value_nbCores);
        
        
        String value_nbPipelines = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_NBPIPELINES, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_NBPIPELINES),value_nbPipelines);
        
        
        String value_nbStages = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_NBSTAGES, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_NBSTAGES),value_nbStages);
        
        
        String value_nbALUs = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_NBALUS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_NBALUS),value_nbALUs);
        
        
        String value_nbFPUs = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_NBFPUS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_NBFPUS),value_nbFPUs);
        
        ownedISAs = MARTESearchUtils.getOwnedISAs(elt); 
        String[] tab_ownedISAs = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM), ownedISAs);  
        String value_ownedISAs = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_OWNEDISAS),value_ownedISAs, tab_ownedISAs);
        
        
        ownedPredictors = MARTESearchUtils.getOwnedHwRAM(elt); 
        String[] tab_predictors = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM), ownedPredictors);  
        String value_predictors = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_POWEREDSERVICES_HWCOMPONENT_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_PREDICTORS),value_predictors, tab_predictors);
        
        
        ownedCaches = MARTESearchUtils.getOwnedCaches(elt); 
        String[] tab_caches = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_CACHES_HWPROCESSOR_HWCACHE), ownedCaches);  
        String value_caches = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_CACHES_HWPROCESSOR_HWCACHE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_CACHES),value_caches, tab_caches);
        
        ownedMMUs = MARTESearchUtils.getOwnedHwRAM(elt); 
        String[] tab_ownedMMUs = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM), ownedMMUs);  
        String value_ownedMMUs = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_OWNEDMMUS),value_ownedMMUs, tab_ownedMMUs);
    }

}
