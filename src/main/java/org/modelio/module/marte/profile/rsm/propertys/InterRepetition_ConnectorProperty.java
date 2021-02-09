package org.modelio.module.marte.profile.rsm.propertys;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class InterRepetition_ConnectorProperty implements IPropertyContent {
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt,MARTEDesignerTagTypes.INTERREPETITION_CONNECTOR_INTERREPETITION_CONNECTOR_REPETITIONSHAPEDEPENDENCE, value);
        }
        if(row == 2){
            ModelUtils.addBooleanValue(elt,MARTEDesignerTagTypes.INTERREPETITION_CONNECTOR_INTERREPETITION_CONNECTOR_ISMODULO, Boolean.valueOf(value));
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_repetitionShapeDependence = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.INTERREPETITION_CONNECTOR_INTERREPETITION_CONNECTOR_REPETITIONSHAPEDEPENDENCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.INTERREPETITION_CONNECTOR_INTERREPETITION_CONNECTOR_REPETITIONSHAPEDEPENDENCE),value_repetitionShapeDependence);
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.INTERREPETITION_CONNECTOR_INTERREPETITION_CONNECTOR_ISMODULO),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.INTERREPETITION_CONNECTOR_INTERREPETITION_CONNECTOR_ISMODULO, elt));
    }

}
