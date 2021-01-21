package org.modelio.module.marte.profile.hwlayout.propertys;

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

@objid ("2fdeab6a-fee4-4db4-8ffa-7d0eed1328aa")
public class HwComponent_AssociationProperty implements IPropertyContent {
    @objid ("491863f6-6546-40eb-8157-8c4add9bc3b6")
    private static List<ModelElement> ownedSubComponents = null;

    @objid ("55b6f1da-7cbe-4f1e-992a-a60c35a49edd")
    private static List<ModelElement> poweredServices = null;

    @objid ("b0fe6cce-791e-43c5-a279-35847c5b2526")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_KIND, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_DIMENSIONS, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_AREA, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_POSITION, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_GRID, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_NBPINS, value);
        }
        else if(row == 7){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_WEIGHT, value);
        }
        else if(row == 8){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_PRICE, value);
        }
        else if(row == 9){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_R_CONDITIONS, value);
        }
        else if(row == 10){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    poweredServices, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_POWEREDSERVICES_HWCOMPONENT_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_POWEREDSERVICES,
                    value);
        }
        else if(row == 11){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_STATICCONSUMPTION, value);
        }
        else if(row == 12){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_STATICDISSIPATION, value);
        }
        else if(row == 13){
        
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedSubComponents, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_SUBCOMPONENTS_HWCOMPONENT, 
        //                    MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_SUBCOMPONENTS,
                    value);
        }
    }

    @objid ("ec0eb2af-daaa-4a11-9672-908d884b5412")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Component
        //
        
        String[] componentKind = MARTEEnumerationUtils.getComponentKind();
        String value_componentKind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_KIND, elt);
        if(!(MARTEEnumerationUtils.isComponentKind(value_componentKind))){
            value_componentKind = "undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_KIND),value_componentKind, componentKind); 
        
        String value_dimensions = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_DIMENSIONS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_DIMENSIONS),value_dimensions);
        
        
        String value_area = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_AREA, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_AREA),value_area);
        
        
        String value_position = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_POSITION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_POSITION),value_position);
        
        
        String value_grid = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_GRID, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_GRID),value_grid);
        
        
        String value_nbPins = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_NBPINS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_NBPINS),value_nbPins);
        
        
        String value_weight = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_WEIGHT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_WEIGHT),value_weight);
        
        
        String value_price = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_PRICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_PRICE),value_price);
        
        
        String value_r_Conditions = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_R_CONDITIONS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_R_CONDITIONS),value_r_Conditions);
        
        poweredServices = MARTESearchUtils.getOwnedHwResourceService(elt);
        String[] tab_poweredServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_POWEREDSERVICES_HWCOMPONENT_HWRESOURCESERVICE), poweredServices);
        String value_poweredServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_POWEREDSERVICES_HWCOMPONENT_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_POWEREDSERVICES),value_poweredServices, tab_poweredServices);
        
        String value_staticConsumption = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_STATICCONSUMPTION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_STATICCONSUMPTION),value_staticConsumption);
        
        
        String value_staticDissipation = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_STATICDISSIPATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_STATICDISSIPATION),value_staticDissipation);
        
        ownedSubComponents = MARTESearchUtils.getOwnedHwComponent(elt);
        String[] tab_subComponentss = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_SUBCOMPONENTS_HWCOMPONENT), ownedSubComponents);
        String value_subComponents = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_SUBCOMPONENTS_HWCOMPONENT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_SUBCOMPONENTS),value_subComponents, tab_subComponentss);
    }

}
