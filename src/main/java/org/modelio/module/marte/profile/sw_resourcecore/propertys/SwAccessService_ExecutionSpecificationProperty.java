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

@objid ("fcf48f3b-81e1-4437-acd0-e26bb5c05cec")
public class SwAccessService_ExecutionSpecificationProperty implements IPropertyContent {
    @objid ("5147ca56-0ef2-4037-99b6-b72070d0d5c3")
    private static List<ModelElement> accessedElements = null;

    @objid ("a4d27fe0-9391-412e-a5db-d71973da7e16")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){ 
             ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWACCESSSERVICE_EXECUTIONSPECIFICATION_SWACCESSSERVICE_EXECUTIONSPECIFICATION_ACCESSEDELEMENT, value);           
        }
        else if(row == 2){
            
            ModelUtils.manageSingleOrientedLink(elt, 
                    accessedElements, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ACCESSEDELEMENT_SWACCESSSERVICE, 
        //                    MARTEDesignerTagTypes.SWACCESSSERVICE_EXECUTIONSPECIFICATION_SWACCESSSERVICE_EXECUTIONSPECIFICATION_ACCESSEDELEMENT, 
                    value);
             }
    }

    @objid ("99e02b88-bb8c-44e0-b705-d93b980ee4ad")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Sw Access Service
        //
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWACCESSSERVICE_EXECUTIONSPECIFICATION_SWACCESSSERVICE_EXECUTIONSPECIFICATION_ISMODIFIER),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWACCESSSERVICE_EXECUTIONSPECIFICATION_SWACCESSSERVICE_EXECUTIONSPECIFICATION_ISMODIFIER, elt));
        
        accessedElements = MARTESearchUtils.searchProperty();   
        String[] tab_accessedElement = ModelUtils.createListString(accessedElements);      
        String value_accessedElement = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ACCESSEDELEMENT_SWACCESSSERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWACCESSSERVICE_EXECUTIONSPECIFICATION_SWACCESSSERVICE_EXECUTIONSPECIFICATION_ACCESSEDELEMENT), value_accessedElement, tab_accessedElement);
    }

}
