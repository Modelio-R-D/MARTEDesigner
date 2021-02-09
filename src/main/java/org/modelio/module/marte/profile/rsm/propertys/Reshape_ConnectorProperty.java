package org.modelio.module.marte.profile.rsm.propertys;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Reshape_ConnectorProperty implements IPropertyContent {
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt,MARTEDesignerTagTypes.RESHAPE_CONNECTOR_RESHAPE_CONNECTOR_PATTERNSHAPE, value);
        }
        if(row == 2){
            ModelUtils.addStringValue(elt,MARTEDesignerTagTypes.RESHAPE_CONNECTOR_RESHAPE_CONNECTOR_REPETITONSHAPE, value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_patternShape = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RESHAPE_CONNECTOR_RESHAPE_CONNECTOR_PATTERNSHAPE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESHAPE_CONNECTOR_RESHAPE_CONNECTOR_PATTERNSHAPE),value_patternShape);
        
        String value_repetitonShape = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RESHAPE_CONNECTOR_RESHAPE_CONNECTOR_REPETITONSHAPE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESHAPE_CONNECTOR_RESHAPE_CONNECTOR_REPETITONSHAPE),value_repetitonShape);
    }

}
