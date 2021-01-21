package org.modelio.module.marte.profile.sw_resourcecore.propertys;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.MARTESearchUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("33a4eaef-c14a-4389-9b86-118821a17db5")
public class SwAccessService_OperationProperty implements IPropertyContent {
    @objid ("372afdbd-7168-4317-bc77-6934a3724c05")
    private static List<ModelElement> accessedElements = null;

    @objid ("8ac78542-9b7b-4472-9f57-0c395420b592")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){ 
             ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWACCESSSERVICE_OPERATION_SWACCESSSERVICE_OPERATION_ACCESSEDELEMENT, value);           
        }
        else if(row == 2){
            
            ModelUtils.manageSingleOrientedLink(elt, 
                    accessedElements, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ACCESSEDELEMENT_SWACCESSSERVICE, 
        //                    MARTEDesignerTagTypes.SWACCESSSERVICE_OPERATION_SWACCESSSERVICE_OPERATION_ACCESSEDELEMENT, 
                    value);
             }
    }

    @objid ("270fca2a-4735-4e32-8c2a-2910375ec836")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Sw Access Service
        //
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWACCESSSERVICE_OPERATION_SWACCESSSERVICE_OPERATION_ISMODIFIER),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWACCESSSERVICE_OPERATION_SWACCESSSERVICE_OPERATION_ISMODIFIER, elt));
        
        accessedElements = MARTESearchUtils.searchProperty();   
        String[] tab_accessedElement = ModelUtils.createListString(accessedElements);      
        String value_accessedElement = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ACCESSEDELEMENT_SWACCESSSERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWACCESSSERVICE_OPERATION_SWACCESSSERVICE_OPERATION_ACCESSEDELEMENT), value_accessedElement, tab_accessedElement);
    }

}
