package org.modelio.module.marte.profile.gqam.propertys;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.LinkManager;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class GaWorkloadBehavior_ModelElementProperty implements IPropertyContent {
    private static List<ModelElement> behaviors = null;

    private static List<ModelElement> demands = null;

    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){           
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behaviors, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_BEHAVIOR_GAWORKLOADBEHAVIOR, 
        //                    MARTEDesignerTagTypes.GAWORKLOADBEHAVIOR_MODELELEMENT_GAWORKLOADBEHAVIOR_MODELELEMENT_BEHAVIOR,
                    value);
        }
        else if(row == 2){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    demands, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_DEMAND_GAWORKLOADEVENT, 
        //                    MARTEDesignerTagTypes.GAWORKLOADBEHAVIOR_MODELELEMENT_GAWORKLOADBEHAVIOR_MODELELEMENT_DEMAND,
                    value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        behaviors = ModelUtils.searchElementStereotyped(ModelElement.class, MARTEDesignerStereotypes.GASCENARIO_MODELELEMENT);
        String[] tab_behaviors = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_BEHAVIOR_GAWORKLOADBEHAVIOR), behaviors);
        String value_behavior = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_BEHAVIOR_GAWORKLOADBEHAVIOR, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAWORKLOADBEHAVIOR_MODELELEMENT_GAWORKLOADBEHAVIOR_MODELELEMENT_BEHAVIOR),value_behavior, tab_behaviors);
            
        demands = ModelUtils.searchElementStereotyped(ModelElement.class, MARTEDesignerStereotypes.GAWORKLOADEVENT_MODELELEMENT);
        String[] tab_demands = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_DEMAND_GAWORKLOADEVENT), demands);
        String value_demands = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_DEMAND_GAWORKLOADEVENT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAWORKLOADBEHAVIOR_MODELELEMENT_GAWORKLOADBEHAVIOR_MODELELEMENT_DEMAND),value_demands, tab_demands);
    }

}
