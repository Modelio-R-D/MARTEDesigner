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

@objid ("95d67ff4-5e72-4da9-b450-63fdadd9db12")
public class HwPLD_InstanceProperty implements IPropertyContent {
    @objid ("6ade8926-721a-44be-8145-8e0470043793")
    private static List<ModelElement> ownedblocksRAMs;

    @objid ("b52ad045-874b-4270-9ed2-cf813e272c89")
    private static List<ModelElement> ownedblocksComputing;

    @objid ("f0add454-962e-4ba0-a3af-02c9ef6a24c5")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_TECHNOLOGY, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_ORGANIZATION, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_NBLUTS, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_NDLUT_INPUTS, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_NBFLIPFLOPS, value);
        }
        else if(row == 6){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedblocksRAMs, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM, 
        //                    MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_BLOCKSRAM,
                    value);
        }
        else if(row == 7){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedblocksComputing, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSCOMPUTING_HWPLD_HWCOMPUTINGRESOURCE, 
        //                    MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_BLOCKSCOMPUTING,
                    value);
        }
    }

    @objid ("52ac845a-4100-4db4-9ecd-b439b5d1e948")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw PLD
        //
        
        String[] pLD_Technology = MARTEEnumerationUtils.getPLD_Technology();
        String value_technology = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_TECHNOLOGY, elt);
        if(!(MARTEEnumerationUtils.isPLD_Technology(value_technology))){
            value_technology = "undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_TECHNOLOGY),value_technology, pLD_Technology);
        
        
        String value_organization = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_ORGANIZATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_ORGANIZATION),value_organization);
        
        
        String value_nbLUTs = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_NBLUTS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_NBLUTS),value_nbLUTs);
        
        
        String value_ndLUT_Inputs = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_NDLUT_INPUTS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_NDLUT_INPUTS),value_ndLUT_Inputs);
        
        
        String value_nbFlipFlops = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_NBFLIPFLOPS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_NBFLIPFLOPS),value_nbFlipFlops);
        
        
        ownedblocksRAMs = MARTESearchUtils.getOwnedHwRAM(elt);  
        String[] tab_blocksRAM = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM), ownedblocksRAMs);  
        String value_blocksRAM = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_BLOCKSRAM),value_blocksRAM, tab_blocksRAM);
        
        ownedblocksComputing = MARTESearchUtils.getOwnedHwComputingResource(elt);  
        String[] tab_blocksComputing = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSCOMPUTING_HWPLD_HWCOMPUTINGRESOURCE), ownedblocksComputing);  
        String value_blocksComputing = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSCOMPUTING_HWPLD_HWCOMPUTINGRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_BLOCKSCOMPUTING),value_blocksComputing, tab_blocksComputing);
    }

}
