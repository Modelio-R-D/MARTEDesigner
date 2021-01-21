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

@objid ("3b7f3bed-e83e-4420-b524-9161f627da84")
public class HwPLD_LinkProperty implements IPropertyContent {
    @objid ("43c32c17-2720-4686-8024-18ac2a3b535a")
    private static List<ModelElement> ownedblocksRAMs;

    @objid ("9ce3255c-b99b-422c-a20c-e1054e7b3553")
    private static List<ModelElement> ownedblocksComputing;

    @objid ("9c12281d-0487-477e-ba7e-4dbd4b28e359")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_TECHNOLOGY, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_ORGANIZATION, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_NBLUTS, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_NDLUT_INPUTS, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_NBFLIPFLOPS, value);
        }
        else if(row == 6){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedblocksRAMs, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM, 
        //                    MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_BLOCKSRAM,
                    value);
        }
        else if(row == 7){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedblocksComputing, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSCOMPUTING_HWPLD_HWCOMPUTINGRESOURCE, 
        //                    MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_BLOCKSCOMPUTING,
                    value);
        }
    }

    @objid ("319f693e-444b-4309-be6b-040146a8a8bb")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw PLD
        //
        
        String[] pLD_Technology = MARTEEnumerationUtils.getPLD_Technology();
        String value_technology = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_TECHNOLOGY, elt);
        if(!(MARTEEnumerationUtils.isPLD_Technology(value_technology))){
            value_technology = "undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_TECHNOLOGY),value_technology, pLD_Technology);
        
        
        String value_organization = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_ORGANIZATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_ORGANIZATION),value_organization);
        
        
        String value_nbLUTs = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_NBLUTS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_NBLUTS),value_nbLUTs);
        
        
        String value_ndLUT_Inputs = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_NDLUT_INPUTS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_NDLUT_INPUTS),value_ndLUT_Inputs);
        
        
        String value_nbFlipFlops = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_NBFLIPFLOPS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_NBFLIPFLOPS),value_nbFlipFlops);
        
        ownedblocksRAMs = MARTESearchUtils.getOwnedHwRAM(elt); 
        String[] tab_blocksRAM = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM), ownedblocksRAMs);  
        String value_blocksRAM = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSRAM_HWPLD_HWRAM, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_BLOCKSRAM),value_blocksRAM, tab_blocksRAM);
        
        ownedblocksComputing = MARTESearchUtils.getOwnedHwComputingResource(elt); 
        String[] tab_blocksComputing = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSCOMPUTING_HWPLD_HWCOMPUTINGRESOURCE), ownedblocksComputing);  
        String value_blocksComputing = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_BLOCKSCOMPUTING_HWPLD_HWCOMPUTINGRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_BLOCKSCOMPUTING),value_blocksComputing, tab_blocksComputing);
    }

}
