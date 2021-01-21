package org.modelio.module.marte.profile.gqam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("fead0bcf-446c-4255-96f9-af7555d7cb3e")
public class GaWorkloadGenerator_BehaviorProperty implements IPropertyContent {
    @objid ("3e2fb2c3-0f19-4257-8e1e-243d69120c67")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAWORKLOADGENERATOR_BEHAVIOR_GAWORKLOADGENERATOR_BEHAVIOR_POP, value);
        }
    }

    @objid ("2b84da80-4884-4d20-b516-9e0452f97168")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_latency = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAWORKLOADGENERATOR_BEHAVIOR_GAWORKLOADGENERATOR_BEHAVIOR_POP, elt);
        if (value_latency.equals(""))
            value_latency = "1";
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAWORKLOADGENERATOR_BEHAVIOR_GAWORKLOADGENERATOR_BEHAVIOR_POP),value_latency);
    }

}
