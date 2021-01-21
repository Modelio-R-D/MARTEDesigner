package org.modelio.module.marte.profile.hwcomputing.propertys;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.LinkManager;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.MARTESearchUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("8668f21c-2e0c-4bc9-a03a-b6ab37b1aa1a")
public class HwPLD_AssociationProperty implements IPropertyContent {
    @objid ("b611a110-1cf6-4d1f-9e31-c72f0be9bf8a")
    private static List<ModelElement> ownedblocksRAMs;

    @objid ("3317cce5-4729-493e-bf20-0b74f83f71c2")
    private static List<ModelElement> ownedblocksComputing;

    @objid ("0f30c406-608a-42d6-9416-65ae3edada42")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPLD_ASSOCIATION_HWPLD_ASSOCIATION_TECHNOLOGY, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPLD_ASSOCIATION_HWPLD_ASSOCIATION_ORGANIZATION, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPLD_ASSOCIATION_HWPLD_ASSOCIATION_NBLUTS, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPLD_ASSOCIATION_HWPLD_ASSOCIATION_NDLUT_INPUTS, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPLD_ASSOCIATION_HWPLD_ASSOCIATION_NBFLIPFLOPS, value);
        }
        else if(row == 6){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedblocksRAMs, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM, 
        //                    MARTEDesignerTagTypes.HWPLD_ASSOCIATION_HWPLD_ASSOCIATION_BLOCKSRAM,
                    value);
        }
        else if(row == 7){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedblocksComputing, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSCOMPUTING_HWPLD_HWCOMPUTINGRESOURCE, 
        //                    MARTEDesignerTagTypes.HWPLD_ASSOCIATION_HWPLD_ASSOCIATION_BLOCKSCOMPUTING,
                    value);
        }
    }

    @objid ("cfeaa0b5-e908-429b-aad7-5d584cab3b2f")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw PLD
        //
        
        String[] pLD_Technology = MARTEEnumerationUtils.getPLD_Technology();
        String value_technology = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_ASSOCIATION_HWPLD_ASSOCIATION_TECHNOLOGY, elt);
        if(!(MARTEEnumerationUtils.isPLD_Technology(value_technology))){
            value_technology = "undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPLD_ASSOCIATION_HWPLD_ASSOCIATION_TECHNOLOGY),value_technology, pLD_Technology);
        
        
        String value_organization = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_ASSOCIATION_HWPLD_ASSOCIATION_ORGANIZATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPLD_ASSOCIATION_HWPLD_ASSOCIATION_ORGANIZATION),value_organization);
        
        
        String value_nbLUTs = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_ASSOCIATION_HWPLD_ASSOCIATION_NBLUTS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPLD_ASSOCIATION_HWPLD_ASSOCIATION_NBLUTS),value_nbLUTs);
        
        
        String value_ndLUT_Inputs = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_ASSOCIATION_HWPLD_ASSOCIATION_NDLUT_INPUTS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPLD_ASSOCIATION_HWPLD_ASSOCIATION_NDLUT_INPUTS),value_ndLUT_Inputs);
        
        
        String value_nbFlipFlops = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_ASSOCIATION_HWPLD_ASSOCIATION_NBFLIPFLOPS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPLD_ASSOCIATION_HWPLD_ASSOCIATION_NBFLIPFLOPS),value_nbFlipFlops);
        
        
        ownedblocksRAMs = MARTESearchUtils.getOwnedHwRAM(elt); 
        String[] tab_blocksRAM = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM), ownedblocksRAMs);  
        String value_blocksRAM = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPLD_ASSOCIATION_HWPLD_ASSOCIATION_BLOCKSRAM),value_blocksRAM, tab_blocksRAM);
        
        ownedblocksComputing = MARTESearchUtils.getOwnedHwComputingResource(elt); 
        String[] tab_blocksComputing = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSCOMPUTING_HWPLD_HWCOMPUTINGRESOURCE), ownedblocksComputing);  
        String value_blocksComputing = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSCOMPUTING_HWPLD_HWCOMPUTINGRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPLD_ASSOCIATION_HWPLD_ASSOCIATION_BLOCKSCOMPUTING),value_blocksComputing, tab_blocksComputing);
    }

}
