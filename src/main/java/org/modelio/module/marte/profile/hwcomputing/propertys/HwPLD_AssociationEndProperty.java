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

@objid ("66073b5f-fe9f-48ef-be7e-691ea3de001b")
public class HwPLD_AssociationEndProperty implements IPropertyContent {
    @objid ("ed19ff61-60e0-449f-bff6-9e6f1c6165ee")
    private static List<ModelElement> ownedblocksRAMs;

    @objid ("5e018f9b-7f46-46ac-bca5-9ec10b723cec")
    private static List<ModelElement> ownedblocksComputing;

    @objid ("d526290d-bf8d-44d4-a518-ca5bafd0125a")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_TECHNOLOGY, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_ORGANIZATION, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_NBLUTS, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_NDLUT_INPUTS, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_NBFLIPFLOPS, value);
        }
        else if(row == 6){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedblocksRAMs, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM, 
        //                    MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_BLOCKSRAM,
                    value);
        }
        else if(row == 7){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedblocksComputing, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSCOMPUTING_HWPLD_HWCOMPUTINGRESOURCE, 
        //                    MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_BLOCKSCOMPUTING,
                    value);
        }
    }

    @objid ("37f5d8bd-1fe5-4048-97ee-1d199e17d6cf")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw PLD
        //
        
        String[] pLD_Technology = MARTEEnumerationUtils.getPLD_Technology();
        String value_technology = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_TECHNOLOGY, elt);
        if(!(MARTEEnumerationUtils.isPLD_Technology(value_technology))){
            value_technology = "undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_TECHNOLOGY),value_technology, pLD_Technology);
        
        
        String value_organization = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_ORGANIZATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_ORGANIZATION),value_organization);
        
        
        String value_nbLUTs = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_NBLUTS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_NBLUTS),value_nbLUTs);
        
        
        String value_ndLUT_Inputs = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_NDLUT_INPUTS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_NDLUT_INPUTS),value_ndLUT_Inputs);
        
        
        String value_nbFlipFlops = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_NBFLIPFLOPS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_NBFLIPFLOPS),value_nbFlipFlops);
        
        
        ownedblocksRAMs = MARTESearchUtils.getOwnedHwRAM(elt);   
        String[] tab_blocksRAM = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM), ownedblocksRAMs);  
        String value_blocksRAM = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_BLOCKSRAM),value_blocksRAM, tab_blocksRAM);
        
        
        ownedblocksComputing = MARTESearchUtils.getOwnedHwComputingResource(elt);  
        String[] tab_blocksComputing = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSCOMPUTING_HWPLD_HWCOMPUTINGRESOURCE), ownedblocksComputing);  
        String value_blocksComputing = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSCOMPUTING_HWPLD_HWCOMPUTINGRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_BLOCKSCOMPUTING),value_blocksComputing, tab_blocksComputing);
    }

}
