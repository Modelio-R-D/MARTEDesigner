package org.modelio.module.marte.profile.rsm.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("5c9f4ede-41aa-475a-b9a7-670e31968ffc")
public class InterRepetition_ConnectorProperty implements IPropertyContent {
    @objid ("12fddc7a-477c-463a-9564-469d56eb6a4d")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt,MARTEDesignerTagTypes.INTERREPETITION_CONNECTOR_INTERREPETITION_CONNECTOR_REPETITIONSHAPEDEPENDENCE, value);
        }
        if(row == 2){
            ModelUtils.addBooleanValue(elt,MARTEDesignerTagTypes.INTERREPETITION_CONNECTOR_INTERREPETITION_CONNECTOR_ISMODULO, Boolean.valueOf(value));
        }
    }

    @objid ("61aa9434-4e57-46ce-ab99-8f58c71b7415")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_repetitionShapeDependence = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.INTERREPETITION_CONNECTOR_INTERREPETITION_CONNECTOR_REPETITIONSHAPEDEPENDENCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.INTERREPETITION_CONNECTOR_INTERREPETITION_CONNECTOR_REPETITIONSHAPEDEPENDENCE),value_repetitionShapeDependence);
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.INTERREPETITION_CONNECTOR_INTERREPETITION_CONNECTOR_ISMODULO),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.INTERREPETITION_CONNECTOR_INTERREPETITION_CONNECTOR_ISMODULO, elt));
    }

}
