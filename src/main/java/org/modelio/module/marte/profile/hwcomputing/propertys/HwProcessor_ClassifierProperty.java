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

@objid ("a72aec9f-e40e-4cfb-be78-ebd9920bed6b")
public class HwProcessor_ClassifierProperty implements IPropertyContent {
    @objid ("c5873509-d37f-4741-a113-51af463d9a0d")
    private static List<ModelElement> ownedCaches;

    @objid ("eea50272-2176-4ac5-afb8-0b2f093df6ad")
    private static List<ModelElement> ownedMMUs;

    @objid ("d59bb531-8c93-43b1-acea-26eaa15872a6")
    private static List<ModelElement> ownedISAs;

    @objid ("5a132846-8be6-416f-859e-ca8782f1caa7")
    private static List<ModelElement> ownedPredictors;

    @objid ("25386e5c-8dde-4053-b26f-83ce7e6f7244")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_ARCHITECTURE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_MIPS, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_IPC, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_NBCORES, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_NBPIPELINES, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_NBSTAGES, value);
        }
        else if(row == 7){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_NBALUS, value);
        }
        else if(row == 8){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_NBFPUS, value);
        }
        else if(row == 9){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedISAs, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDISAS_HWPROCESSOR_HWISA, 
        //                    MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_OWNEDISAS,
                    value);
        }
        else if(row == 10){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedPredictors, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_PREDICTORS_HWPROCESSOR_HWBRANCHPREDICTOR, 
        //                    MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_PREDICTORS,
                    value);
        }
        else if(row == 11){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedCaches, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_CACHES_HWPROCESSOR_HWCACHE, 
        //                    MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_CACHES,
                    value);
        }
        else if(row == 12){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedMMUs, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDMMUS_HWPROCESSOR_HWMMU, 
        //                    MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_OWNEDMMUS,
                    value);
         }
    }

    @objid ("3456de87-e93b-4de5-9de6-4fdf0ef42eee")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Processor
        //
        String value_architecture = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_ARCHITECTURE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_ARCHITECTURE),value_architecture);
        
        
        String value_mips = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_MIPS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_MIPS),value_mips);
        
        
        String value_ipc = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_IPC, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_IPC),value_ipc);
        
        
        String value_nbCores = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_NBCORES, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_NBCORES),value_nbCores);
        
        
        String value_nbPipelines = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_NBPIPELINES, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_NBPIPELINES),value_nbPipelines);
        
        
        String value_nbStages = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_NBSTAGES, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_NBSTAGES),value_nbStages);
        
        
        String value_nbALUs = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_NBALUS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_NBALUS),value_nbALUs);
        
        
        String value_nbFPUs = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_NBFPUS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_NBFPUS),value_nbFPUs);
        
        ownedISAs = MARTESearchUtils.getOwnedISAs(elt); 
        String[] tab_ownedISAs = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM), ownedISAs);  
        String value_ownedISAs = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_OWNEDISAS),value_ownedISAs, tab_ownedISAs);
        
        
        ownedPredictors = MARTESearchUtils.getOwnedHwRAM(elt); 
        String[] tab_predictors = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM), ownedPredictors);  
        String value_predictors = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_POWEREDSERVICES_HWCOMPONENT_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_PREDICTORS),value_predictors, tab_predictors);
        
        
        ownedCaches = MARTESearchUtils.getOwnedCaches(elt); 
        String[] tab_caches = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_CACHES_HWPROCESSOR_HWCACHE), ownedCaches);  
        String value_caches = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_CACHES_HWPROCESSOR_HWCACHE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_CACHES),value_caches, tab_caches);
        
        ownedMMUs = MARTESearchUtils.getOwnedHwRAM(elt); 
        String[] tab_ownedMMUs = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM), ownedMMUs);  
        String value_ownedMMUs = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_OWNEDMMUS),value_ownedMMUs, tab_ownedMMUs);
    }

}
