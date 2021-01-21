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

@objid ("f72d6f7d-00cf-48a1-b5e5-9e078ed66a93")
public class HwComponent_LifeLineProperty implements IPropertyContent {
    @objid ("3b82d1b8-75f3-4e22-9516-5f38dd045fb3")
    private static List<ModelElement> ownedSubComponents = null;

    @objid ("07e70bc3-c9f2-4080-9c6b-543b94053c3a")
    private static List<ModelElement> poweredServices = null;

    @objid ("5a3a0741-ade1-48e0-ad71-ad290ccde443")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_KIND, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_DIMENSIONS, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_AREA, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_POSITION, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_GRID, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_NBPINS, value);
        }
        else if(row == 7){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_WEIGHT, value);
        }
        else if(row == 8){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_PRICE, value);
        }
        else if(row == 9){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_R_CONDITIONS, value);
        }
        else if(row == 10){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    poweredServices, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_POWEREDSERVICES_HWCOMPONENT_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_POWEREDSERVICES,
                    value);
        }
        else if(row == 11){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_STATICCONSUMPTION, value);
        }
        else if(row == 12){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_STATICDISSIPATION, value);
        }
        else if(row == 13){
        
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedSubComponents, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_SUBCOMPONENTS_HWCOMPONENT, 
        //                    MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_SUBCOMPONENTS,
                    value);
        }
    }

    @objid ("71779c67-f238-4c1f-a958-51682fcc68e0")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Component
        //
        
        String[] componentKind = MARTEEnumerationUtils.getComponentKind();
        String value_componentKind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_KIND, elt);
        if(!(MARTEEnumerationUtils.isComponentKind(value_componentKind))){
            value_componentKind = "undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_KIND),value_componentKind, componentKind); 
        
        String value_dimensions = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_DIMENSIONS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_DIMENSIONS),value_dimensions);
        
        
        String value_area = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_AREA, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_AREA),value_area);
        
        
        String value_position = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_POSITION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_POSITION),value_position);
        
        
        String value_grid = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_GRID, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_GRID),value_grid);
        
        
        String value_nbPins = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_NBPINS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_NBPINS),value_nbPins);
        
        
        String value_weight = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_WEIGHT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_WEIGHT),value_weight);
        
        
        String value_price = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_PRICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_PRICE),value_price);
        
        
        String value_r_Conditions = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_R_CONDITIONS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_R_CONDITIONS),value_r_Conditions);
        
        poweredServices = MARTESearchUtils.getOwnedHwResourceService(elt);
        String[] tab_poweredServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_POWEREDSERVICES_HWCOMPONENT_HWRESOURCESERVICE), poweredServices);
        String value_poweredServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_POWEREDSERVICES_HWCOMPONENT_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_POWEREDSERVICES),value_poweredServices, tab_poweredServices);
        
        String value_staticConsumption = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_STATICCONSUMPTION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_STATICCONSUMPTION),value_staticConsumption);
        
        
        String value_staticDissipation = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_STATICDISSIPATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_STATICDISSIPATION),value_staticDissipation);
        
        ownedSubComponents = MARTESearchUtils.getOwnedHwComponent(elt);
        String[] tab_subComponentss = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_SUBCOMPONENTS_HWCOMPONENT), ownedSubComponents);
        String value_subComponents = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_SUBCOMPONENTS_HWCOMPONENT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_SUBCOMPONENTS),value_subComponents, tab_subComponentss);
    }

}
