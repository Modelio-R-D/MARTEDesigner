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

@objid ("44ac58e1-b6bd-4b16-9e9c-19631925ecad")
public class SwAccessService_CollaborationProperty implements IPropertyContent {
    @objid ("9a80a50d-8371-4684-9a3b-57da422b101d")
    private static List<ModelElement> accessedElements = null;

    @objid ("b998c1bf-cda8-450d-84d6-acee94fc5205")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){ 
             ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWACCESSSERVICE_COLLABORATION_SWACCESSSERVICE_COLLABORATION_ACCESSEDELEMENT, value);           
        }
        else if(row == 2){
            
            ModelUtils.manageSingleOrientedLink(elt, 
                    accessedElements, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ACCESSEDELEMENT_SWACCESSSERVICE, 
        //                    MARTEDesignerTagTypes.SWACCESSSERVICE_COLLABORATION_SWACCESSSERVICE_COLLABORATION_ACCESSEDELEMENT, 
                    value);
             }
    }

    @objid ("c6051262-526e-4319-843a-9a8f0144267c")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Sw Access Service
        //
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWACCESSSERVICE_COLLABORATION_SWACCESSSERVICE_COLLABORATION_ISMODIFIER),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWACCESSSERVICE_COLLABORATION_SWACCESSSERVICE_COLLABORATION_ISMODIFIER, elt));
        
        accessedElements = MARTESearchUtils.searchProperty();   
        String[] tab_accessedElement = ModelUtils.createListString(accessedElements);      
        String value_accessedElement = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ACCESSEDELEMENT_SWACCESSSERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWACCESSSERVICE_COLLABORATION_SWACCESSSERVICE_COLLABORATION_ACCESSEDELEMENT), value_accessedElement, tab_accessedElement);
    }

}
