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

@objid ("2d78d9f4-3c1b-443b-9f81-b0cb700309e4")
public class HwComponent_ParameterProperty implements IPropertyContent {
    @objid ("c41b583c-d82d-4ad5-899b-e9b2c3a5e1d7")
    private static List<ModelElement> ownedSubComponents = null;

    @objid ("77931102-b7e5-4d5b-9a9b-e776c583303e")
    private static List<ModelElement> poweredServices = null;

    @objid ("5baa8460-37a8-420c-b5bf-0ccc514def4e")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_KIND, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_DIMENSIONS, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_AREA, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_POSITION, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_GRID, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_NBPINS, value);
        }
        else if(row == 7){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_WEIGHT, value);
        }
        else if(row == 8){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_PRICE, value);
        }
        else if(row == 9){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_R_CONDITIONS, value);
        }
        else if(row == 10){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    poweredServices, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_POWEREDSERVICES_HWCOMPONENT_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_POWEREDSERVICES,
                    value);
        }
        else if(row == 11){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_STATICCONSUMPTION, value);
        }
        else if(row == 12){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_STATICDISSIPATION, value);
        }
        else if(row == 13){
        
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedSubComponents, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_SUBCOMPONENTS_HWCOMPONENT, 
        //                    MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_SUBCOMPONENTS,
                    value);
        }
    }

    @objid ("f8d11c46-a47b-4558-831b-def445e01bd4")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Component
        //
        
        String[] componentKind = MARTEEnumerationUtils.getComponentKind();
        String value_componentKind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_KIND, elt);
        if(!(MARTEEnumerationUtils.isComponentKind(value_componentKind))){
            value_componentKind = "undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_KIND),value_componentKind, componentKind); 
        
        String value_dimensions = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_DIMENSIONS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_DIMENSIONS),value_dimensions);
        
        
        String value_area = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_AREA, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_AREA),value_area);
        
        
        String value_position = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_POSITION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_POSITION),value_position);
        
        
        String value_grid = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_GRID, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_GRID),value_grid);
        
        
        String value_nbPins = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_NBPINS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_NBPINS),value_nbPins);
        
        
        String value_weight = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_WEIGHT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_WEIGHT),value_weight);
        
        
        String value_price = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_PRICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_PRICE),value_price);
        
        
        String value_r_Conditions = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_R_CONDITIONS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_R_CONDITIONS),value_r_Conditions);
        
        poweredServices = MARTESearchUtils.getOwnedHwResourceService(elt);
        String[] tab_poweredServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_POWEREDSERVICES_HWCOMPONENT_HWRESOURCESERVICE), poweredServices);
        String value_poweredServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_POWEREDSERVICES_HWCOMPONENT_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_POWEREDSERVICES),value_poweredServices, tab_poweredServices);
        
        String value_staticConsumption = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_STATICCONSUMPTION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_STATICCONSUMPTION),value_staticConsumption);
        
        
        String value_staticDissipation = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_STATICDISSIPATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_STATICDISSIPATION),value_staticDissipation);
        
        ownedSubComponents = MARTESearchUtils.getOwnedHwComponent(elt);
        String[] tab_subComponentss = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_SUBCOMPONENTS_HWCOMPONENT), ownedSubComponents);
        String value_subComponents = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_SUBCOMPONENTS_HWCOMPONENT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_SUBCOMPONENTS),value_subComponents, tab_subComponentss);
    }

}
