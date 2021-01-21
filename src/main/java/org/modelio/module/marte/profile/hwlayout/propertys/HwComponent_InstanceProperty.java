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

@objid ("85e7f5d1-6b37-42ab-82f2-0457f63afea5")
public class HwComponent_InstanceProperty implements IPropertyContent {
    @objid ("d866b842-0c58-4471-b52d-4b4083d3bffc")
    private static List<ModelElement> ownedSubComponents = null;

    @objid ("273c40ad-bf09-45af-98c9-6cab551b8143")
    private static List<ModelElement> poweredServices = null;

    @objid ("bf310b29-277e-4b1d-b582-364d6fe40c5c")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_KIND, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_DIMENSIONS, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_AREA, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_POSITION, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_GRID, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_NBPINS, value);
        }
        else if(row == 7){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_WEIGHT, value);
        }
        else if(row == 8){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_PRICE, value);
        }
        else if(row == 9){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_R_CONDITIONS, value);
        }
        else if(row == 10){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    poweredServices, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_POWEREDSERVICES_HWCOMPONENT_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_POWEREDSERVICES,
                    value);
        }
        else if(row == 11){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_STATICCONSUMPTION, value);
        }
        else if(row == 12){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_STATICDISSIPATION, value);
        }
        else if(row == 13){
        
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedSubComponents, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_SUBCOMPONENTS_HWCOMPONENT, 
        //                    MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_SUBCOMPONENTS,
                    value);
        }
    }

    @objid ("0b33f3eb-0ded-4291-aa22-8c1b0ca08984")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Component
        //
        
        String[] componentKind = MARTEEnumerationUtils.getComponentKind();
        String value_componentKind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_KIND, elt);
        if(!(MARTEEnumerationUtils.isComponentKind(value_componentKind))){
            value_componentKind = "undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_KIND),value_componentKind, componentKind); 
        
        String value_dimensions = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_DIMENSIONS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_DIMENSIONS),value_dimensions);
        
        
        String value_area = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_AREA, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_AREA),value_area);
        
        
        String value_position = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_POSITION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_POSITION),value_position);
        
        
        String value_grid = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_GRID, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_GRID),value_grid);
        
        
        String value_nbPins = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_NBPINS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_NBPINS),value_nbPins);
        
        
        String value_weight = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_WEIGHT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_WEIGHT),value_weight);
        
        
        String value_price = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_PRICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_PRICE),value_price);
        
        
        String value_r_Conditions = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_R_CONDITIONS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_R_CONDITIONS),value_r_Conditions);
        
        poweredServices = MARTESearchUtils.getOwnedHwResourceService(elt);
        String[] tab_poweredServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_POWEREDSERVICES_HWCOMPONENT_HWRESOURCESERVICE), poweredServices);
        String value_poweredServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_POWEREDSERVICES_HWCOMPONENT_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_POWEREDSERVICES),value_poweredServices, tab_poweredServices);
        
        
        String value_staticConsumption = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_STATICCONSUMPTION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_STATICCONSUMPTION),value_staticConsumption);
        
        
        String value_staticDissipation = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_STATICDISSIPATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_STATICDISSIPATION),value_staticDissipation);
        
        ownedSubComponents = MARTESearchUtils.getOwnedHwComponent(elt);
        String[] tab_subComponentss = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_SUBCOMPONENTS_HWCOMPONENT), ownedSubComponents);
        String value_subComponents = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_SUBCOMPONENTS_HWCOMPONENT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_SUBCOMPONENTS),value_subComponents, tab_subComponentss);
    }

}
