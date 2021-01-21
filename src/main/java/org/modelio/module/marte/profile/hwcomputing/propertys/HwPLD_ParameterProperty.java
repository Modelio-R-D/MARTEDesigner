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

@objid ("6b629593-c7f9-4990-86e6-d55ae8bf737a")
public class HwPLD_ParameterProperty implements IPropertyContent {
    @objid ("2e927d97-9ad7-4200-bcfb-cc76c8eb34a3")
    private static List<ModelElement> ownedblocksRAMs;

    @objid ("60f227bb-f93e-4a7d-8e3f-90f6fd0f9939")
    private static List<ModelElement> ownedblocksComputing;

    @objid ("2c56b1b1-3511-4063-9ee7-93e405793b05")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPLD_PARAMETER_HWPLD_PARAMETER_TECHNOLOGY, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPLD_PARAMETER_HWPLD_PARAMETER_ORGANIZATION, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPLD_PARAMETER_HWPLD_PARAMETER_NBLUTS, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPLD_PARAMETER_HWPLD_PARAMETER_NDLUT_INPUTS, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPLD_PARAMETER_HWPLD_PARAMETER_NBFLIPFLOPS, value);
        }
        else if(row == 6){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedblocksRAMs, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM, 
        //                    MARTEDesignerTagTypes.HWPLD_PARAMETER_HWPLD_PARAMETER_BLOCKSRAM,
                    value);
        }
        else if(row == 7){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedblocksComputing, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSCOMPUTING_HWPLD_HWCOMPUTINGRESOURCE, 
        //                    MARTEDesignerTagTypes.HWPLD_PARAMETER_HWPLD_PARAMETER_BLOCKSCOMPUTING,
                    value);
        }
    }

    @objid ("d8a4f0f1-a567-4759-a308-b4d37cf2732b")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw PLD
        //
        
        String[] pLD_Technology = MARTEEnumerationUtils.getPLD_Technology();
        String value_technology = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_PARAMETER_HWPLD_PARAMETER_TECHNOLOGY, elt);
        if(!(MARTEEnumerationUtils.isPLD_Technology(value_technology))){
            value_technology = "undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPLD_PARAMETER_HWPLD_PARAMETER_TECHNOLOGY),value_technology, pLD_Technology);
        
        
        String value_organization = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_PARAMETER_HWPLD_PARAMETER_ORGANIZATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPLD_PARAMETER_HWPLD_PARAMETER_ORGANIZATION),value_organization);
        
        
        String value_nbLUTs = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_PARAMETER_HWPLD_PARAMETER_NBLUTS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPLD_PARAMETER_HWPLD_PARAMETER_NBLUTS),value_nbLUTs);
        
        
        String value_ndLUT_Inputs = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_PARAMETER_HWPLD_PARAMETER_NDLUT_INPUTS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPLD_PARAMETER_HWPLD_PARAMETER_NDLUT_INPUTS),value_ndLUT_Inputs);
        
        
        String value_nbFlipFlops = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_PARAMETER_HWPLD_PARAMETER_NBFLIPFLOPS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPLD_PARAMETER_HWPLD_PARAMETER_NBFLIPFLOPS),value_nbFlipFlops);
        
        ownedblocksRAMs = MARTESearchUtils.getOwnedHwRAM(elt);  
        String[] tab_blocksRAM = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM), ownedblocksRAMs);  
        String value_blocksRAM = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPLD_PARAMETER_HWPLD_PARAMETER_BLOCKSRAM),value_blocksRAM, tab_blocksRAM);
        
        ownedblocksComputing = MARTESearchUtils.getOwnedHwComputingResource(elt); 
        String[] tab_blocksComputing = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSCOMPUTING_HWPLD_HWCOMPUTINGRESOURCE), ownedblocksComputing);  
        String value_blocksComputing = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSCOMPUTING_HWPLD_HWCOMPUTINGRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPLD_PARAMETER_HWPLD_PARAMETER_BLOCKSCOMPUTING),value_blocksComputing, tab_blocksComputing);
    }

}
