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

@objid ("01b251ca-7116-4589-b4ad-27372742e1a9")
public class HwComponent_LinkProperty implements IPropertyContent {
    @objid ("2bfd93bc-a32b-482b-9bdd-4f244dbb7fab")
    private static List<ModelElement> ownedSubComponents = null;

    @objid ("6fd54f7e-cacf-4109-905a-987cbabfe882")
    private static List<ModelElement> poweredServices = null;

    @objid ("6bb98c3f-71a4-4daf-a336-2149e7cf19e5")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_KIND, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_DIMENSIONS, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_AREA, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_POSITION, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_GRID, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_NBPINS, value);
        }
        else if(row == 7){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_WEIGHT, value);
        }
        else if(row == 8){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_PRICE, value);
        }
        else if(row == 9){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_R_CONDITIONS, value);
        }
        else if(row == 10){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    poweredServices, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_POWEREDSERVICES_HWCOMPONENT_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_POWEREDSERVICES,
                    value);
        }
        else if(row == 11){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_STATICCONSUMPTION, value);
        }
        else if(row == 12){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_STATICDISSIPATION, value);
        }
        else if(row == 13){
        
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedSubComponents, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_SUBCOMPONENTS_HWCOMPONENT, 
        //                    MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_SUBCOMPONENTS,
                    value);
        }
    }

    @objid ("7a0c55e8-6684-469b-9122-451dc725fc72")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Component
        //
        
        String[] componentKind = MARTEEnumerationUtils.getComponentKind();
        String value_componentKind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_KIND, elt);
        if(!(MARTEEnumerationUtils.isComponentKind(value_componentKind))){
            value_componentKind = "undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_KIND),value_componentKind, componentKind); 
        
        String value_dimensions = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_DIMENSIONS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_DIMENSIONS),value_dimensions);
        
        
        String value_area = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_AREA, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_AREA),value_area);
        
        
        String value_position = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_POSITION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_POSITION),value_position);
        
        
        String value_grid = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_GRID, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_GRID),value_grid);
        
        
        String value_nbPins = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_NBPINS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_NBPINS),value_nbPins);
        
        
        String value_weight = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_WEIGHT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_WEIGHT),value_weight);
        
        
        String value_price = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_PRICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_PRICE),value_price);
        
        
        String value_r_Conditions = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_R_CONDITIONS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_R_CONDITIONS),value_r_Conditions);
        
        poweredServices = MARTESearchUtils.getOwnedHwResourceService(elt);
        String[] tab_poweredServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_POWEREDSERVICES_HWCOMPONENT_HWRESOURCESERVICE), poweredServices);
        String value_poweredServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_POWEREDSERVICES_HWCOMPONENT_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_POWEREDSERVICES),value_poweredServices, tab_poweredServices);
        
        String value_staticConsumption = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_STATICCONSUMPTION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_STATICCONSUMPTION),value_staticConsumption);
        
        
        String value_staticDissipation = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_STATICDISSIPATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_STATICDISSIPATION),value_staticDissipation);
        
        ownedSubComponents = MARTESearchUtils.getOwnedHwComponent(elt);
        String[] tab_subComponentss = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_SUBCOMPONENTS_HWCOMPONENT), ownedSubComponents);
        String value_subComponents = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_SUBCOMPONENTS_HWCOMPONENT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_SUBCOMPONENTS),value_subComponents, tab_subComponentss);
    }

}
