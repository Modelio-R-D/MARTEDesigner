package org.modelio.module.marte.profile.gqam.propertys;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class GaWorkloadGenerator_BehaviorProperty implements IPropertyContent {
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAWORKLOADGENERATOR_BEHAVIOR_GAWORKLOADGENERATOR_BEHAVIOR_POP, value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_latency = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAWORKLOADGENERATOR_BEHAVIOR_GAWORKLOADGENERATOR_BEHAVIOR_POP, elt);
        if (value_latency.equals(""))
            value_latency = "1";
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAWORKLOADGENERATOR_BEHAVIOR_GAWORKLOADGENERATOR_BEHAVIOR_POP),value_latency);
    }

}
