package org.modelio.module.marte.profile.rsm.propertys;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Tiler_ConnectorProperty implements IPropertyContent {
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt,MARTEDesignerTagTypes.TILER_CONNECTOR_TILER_CONNECTOR_ORIGIN, value);
        }
        if(row == 2){
            ModelUtils.addStringValue(elt,MARTEDesignerTagTypes.TILER_CONNECTOR_TILER_CONNECTOR_PAVING, value);
        }
        if(row == 3){
            ModelUtils.addStringValue(elt,MARTEDesignerTagTypes.TILER_CONNECTOR_TILER_CONNECTOR_FITTING, value);
        }
        if(row == 4){
            ModelUtils.addStringValue(elt,MARTEDesignerTagTypes.TILER_CONNECTOR_TILER_CONNECTOR_TILER, value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_origin = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TILER_CONNECTOR_TILER_CONNECTOR_ORIGIN, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TILER_CONNECTOR_TILER_CONNECTOR_ORIGIN),value_origin);
        
        String value_paving = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TILER_CONNECTOR_TILER_CONNECTOR_PAVING, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TILER_CONNECTOR_TILER_CONNECTOR_PAVING),value_paving);
        
        String value_fitting = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TILER_CONNECTOR_TILER_CONNECTOR_FITTING, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TILER_CONNECTOR_TILER_CONNECTOR_FITTING),value_fitting);
        
        String value_tiler = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TILER_CONNECTOR_TILER_CONNECTOR_TILER, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TILER_CONNECTOR_TILER_CONNECTOR_TILER),value_tiler);
    }

}
