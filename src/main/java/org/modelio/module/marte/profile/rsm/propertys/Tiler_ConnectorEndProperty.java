package org.modelio.module.marte.profile.rsm.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("b1447116-45e5-4170-bb7c-698a7b68f25a")
public class Tiler_ConnectorEndProperty implements IPropertyContent {
    @objid ("bbb66261-33bb-470b-b8f4-9dd7e342ff1e")
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

    @objid ("ddb2bbb4-854f-4011-abe0-b581c7847bf3")
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
