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

@objid ("d22c1a10-aa8d-4e7e-8e08-1d13259a1e22")
public class HwProcessor_ParameterProperty implements IPropertyContent {
    @objid ("57403d42-d009-4ce2-9e25-bb24fa656ad2")
    private static List<ModelElement> ownedCaches;

    @objid ("4b76aa17-485c-4477-bc3b-c30b5ba4b89c")
    private static List<ModelElement> ownedMMUs;

    @objid ("59053152-5875-498d-a8c5-2a039ee449f1")
    private static List<ModelElement> ownedISAs;

    @objid ("8d683d66-9e78-4780-8800-3709cfb378be")
    private static List<ModelElement> ownedPredictors;

    @objid ("3a5b66f1-67e0-409b-9a1c-d3aa60b9f634")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_ARCHITECTURE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_MIPS, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_IPC, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_NBCORES, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_NBPIPELINES, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_NBSTAGES, value);
        }
        else if(row == 7){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_NBALUS, value);
        }
        else if(row == 8){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_NBFPUS, value);
        }
        else if(row == 9){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedISAs, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDISAS_HWPROCESSOR_HWISA, 
        //                    MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_OWNEDISAS,
                    value);
        }
        else if(row == 10){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedPredictors, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_PREDICTORS_HWPROCESSOR_HWBRANCHPREDICTOR, 
        //                    MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_PREDICTORS,
                    value);
        }
        else if(row == 11){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedCaches, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_CACHES_HWPROCESSOR_HWCACHE, 
        //                    MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_CACHES,
                    value);
        }
        else if(row == 12){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedMMUs, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDMMUS_HWPROCESSOR_HWMMU, 
        //                    MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_OWNEDMMUS,
                    value);
         }
    }

    @objid ("455984e1-0d98-4ad6-b699-615e1a3a76c5")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Processor
        //
        String value_architecture = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_ARCHITECTURE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_ARCHITECTURE),value_architecture);
        
        
        String value_mips = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_MIPS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_MIPS),value_mips);
        
        
        String value_ipc = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_IPC, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_IPC),value_ipc);
        
        
        String value_nbCores = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_NBCORES, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_NBCORES),value_nbCores);
        
        
        String value_nbPipelines = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_NBPIPELINES, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_NBPIPELINES),value_nbPipelines);
        
        
        String value_nbStages = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_NBSTAGES, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_NBSTAGES),value_nbStages);
        
        
        String value_nbALUs = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_NBALUS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_NBALUS),value_nbALUs);
        
        
        String value_nbFPUs = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_NBFPUS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_NBFPUS),value_nbFPUs);
        
        ownedISAs = MARTESearchUtils.getOwnedISAs(elt); 
        String[] tab_ownedISAs = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM), ownedISAs);  
        String value_ownedISAs = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_OWNEDISAS),value_ownedISAs, tab_ownedISAs);
        
        
        ownedPredictors = MARTESearchUtils.getOwnedHwRAM(elt); 
        String[] tab_predictors = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM), ownedPredictors);  
        String value_predictors = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_POWEREDSERVICES_HWCOMPONENT_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_PREDICTORS),value_predictors, tab_predictors);
        
        
        ownedCaches = MARTESearchUtils.getOwnedCaches(elt); 
        String[] tab_caches = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_CACHES_HWPROCESSOR_HWCACHE), ownedCaches);  
        String value_caches = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_CACHES_HWPROCESSOR_HWCACHE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_CACHES),value_caches, tab_caches);
        
        ownedMMUs = MARTESearchUtils.getOwnedHwRAM(elt); 
        String[] tab_ownedMMUs = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM), ownedMMUs);  
        String value_ownedMMUs = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_OWNEDMMUS),value_ownedMMUs, tab_ownedMMUs);
    }

}
