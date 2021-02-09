package org.modelio.module.marte.profile.rsm.propertys;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Tiler_ConnectorEndProperty implements IPropertyContent {
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt,MARTEDesignerTagTypes.TILER_CONNECTOREND_TILER_CONNECTOREND_ORIGIN, value);
        }
        if(row == 2){
            ModelUtils.addStringValue(elt,MARTEDesignerTagTypes.TILER_CONNECTOREND_TILER_CONNECTOREND_PAVING, value);
        }
        if(row == 3){
            ModelUtils.addStringValue(elt,MARTEDesignerTagTypes.TILER_CONNECTOREND_TILER_CONNECTOREND_FITTING, value);
        }
        if(row == 4){
            ModelUtils.addStringValue(elt,MARTEDesignerTagTypes.TILER_CONNECTOREND_TILER_CONNECTOREND_TILER, value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_origin = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TILER_CONNECTOREND_TILER_CONNECTOREND_ORIGIN, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TILER_CONNECTOREND_TILER_CONNECTOREND_ORIGIN),value_origin);
        
        String value_paving = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TILER_CONNECTOREND_TILER_CONNECTOREND_PAVING, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TILER_CONNECTOREND_TILER_CONNECTOREND_PAVING),value_paving);
        
        String value_fitting = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TILER_CONNECTOREND_TILER_CONNECTOREND_FITTING, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TILER_CONNECTOREND_TILER_CONNECTOREND_FITTING),value_fitting);
        
        String value_tiler = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TILER_CONNECTOREND_TILER_CONNECTOREND_TILER, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TILER_CONNECTOREND_TILER_CONNECTOREND_TILER),value_tiler);
    }

}
