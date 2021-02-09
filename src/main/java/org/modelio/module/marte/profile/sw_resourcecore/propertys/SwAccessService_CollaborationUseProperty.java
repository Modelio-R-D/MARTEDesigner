package org.modelio.module.marte.profile.sw_resourcecore.propertys;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.MARTESearchUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SwAccessService_CollaborationUseProperty implements IPropertyContent {
    private static List<ModelElement> accessedElements = null;

    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){ 
             ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWACCESSSERVICE_COLLABORATIONUSE_SWACCESSSERVICE_COLLABORATIONUSE_ACCESSEDELEMENT, value);           
        }
        else if(row == 2){
            
            ModelUtils.manageSingleOrientedLink(elt, 
                    accessedElements, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ACCESSEDELEMENT_SWACCESSSERVICE, 
        //                    MARTEDesignerTagTypes.SWACCESSSERVICE_COLLABORATIONUSE_SWACCESSSERVICE_COLLABORATIONUSE_ACCESSEDELEMENT, 
                    value);
             }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Sw Access Service
        //
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWACCESSSERVICE_COLLABORATIONUSE_SWACCESSSERVICE_COLLABORATIONUSE_ISMODIFIER),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWACCESSSERVICE_COLLABORATIONUSE_SWACCESSSERVICE_COLLABORATIONUSE_ISMODIFIER, elt));
        
        accessedElements = MARTESearchUtils.searchProperty();   
        String[] tab_accessedElement = ModelUtils.createListString(accessedElements);      
        String value_accessedElement = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ACCESSEDELEMENT_SWACCESSSERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWACCESSSERVICE_COLLABORATIONUSE_SWACCESSSERVICE_COLLABORATIONUSE_ACCESSEDELEMENT), value_accessedElement, tab_accessedElement);
    }

}
