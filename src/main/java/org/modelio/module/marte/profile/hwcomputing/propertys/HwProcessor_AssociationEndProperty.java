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

@objid ("9a82c34f-6af7-4dd8-9fb7-ac5bb553f67e")
public class HwProcessor_AssociationEndProperty implements IPropertyContent {
    @objid ("ec0a2382-2243-4690-8b3d-f0333c2c5217")
    private static List<ModelElement> ownedCaches;

    @objid ("829bfce7-5a53-437e-beec-f38e0a17c0e2")
    private static List<ModelElement> ownedMMUs;

    @objid ("8f6b6cb4-f1e8-4a12-a539-c26caaa1d26c")
    private static List<ModelElement> ownedISAs;

    @objid ("78abb77e-5009-47d3-b225-77ca3bbdd35b")
    private static List<ModelElement> ownedPredictors;

    @objid ("50c9860a-9d3e-4b98-a489-4dea2950c0b1")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_ARCHITECTURE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_MIPS, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_IPC, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_NBCORES, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_NBPIPELINES, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_NBSTAGES, value);
        }
        else if(row == 7){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_NBALUS, value);
        }
        else if(row == 8){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_NBFPUS, value);
        }
        else if(row == 9){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedISAs, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDISAS_HWPROCESSOR_HWISA, 
        //                    MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_OWNEDISAS,
                    value);
        }
        else if(row == 10){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedPredictors, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_PREDICTORS_HWPROCESSOR_HWBRANCHPREDICTOR, 
        //                    MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_PREDICTORS,
                    value);
        }
        else if(row == 11){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedCaches, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_CACHES_HWPROCESSOR_HWCACHE, 
        //                    MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_CACHES,
                    value);
        }
        else if(row == 12){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedMMUs, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDMMUS_HWPROCESSOR_HWMMU, 
        //                    MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_OWNEDMMUS,
                    value);
         }
    }

    @objid ("49d52c11-38ed-4f7f-ae2a-9d459a8c6dc6")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Processor
        //
        String value_architecture = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_ARCHITECTURE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_ARCHITECTURE),value_architecture);
        
        
        String value_mips = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_MIPS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_MIPS),value_mips);
        
        
        String value_ipc = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_IPC, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_IPC),value_ipc);
        
        
        String value_nbCores = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_NBCORES, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_NBCORES),value_nbCores);
        
        
        String value_nbPipelines = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_NBPIPELINES, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_NBPIPELINES),value_nbPipelines);
        
        
        String value_nbStages = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_NBSTAGES, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_NBSTAGES),value_nbStages);
        
        
        String value_nbALUs = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_NBALUS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_NBALUS),value_nbALUs);
        
        
        String value_nbFPUs = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_NBFPUS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_NBFPUS),value_nbFPUs);
        
        ownedISAs = MARTESearchUtils.getOwnedISAs(elt); 
        String[] tab_ownedISAs = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM), ownedISAs);  
        String value_ownedISAs = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_OWNEDISAS),value_ownedISAs, tab_ownedISAs);
        
        
        ownedPredictors = MARTESearchUtils.getOwnedHwRAM(elt); 
        String[] tab_predictors = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM), ownedPredictors);  
        String value_predictors = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_POWEREDSERVICES_HWCOMPONENT_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_PREDICTORS),value_predictors, tab_predictors);
        
        
        ownedCaches = MARTESearchUtils.getOwnedCaches(elt); 
        String[] tab_caches = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_CACHES_HWPROCESSOR_HWCACHE), ownedCaches);  
        String value_caches = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_CACHES_HWPROCESSOR_HWCACHE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_CACHES),value_caches, tab_caches);
        
        ownedMMUs = MARTESearchUtils.getOwnedHwRAM(elt); 
        String[] tab_ownedMMUs = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM), ownedMMUs);  
        String value_ownedMMUs = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_OWNEDMMUS),value_ownedMMUs, tab_ownedMMUs);
    }

}
