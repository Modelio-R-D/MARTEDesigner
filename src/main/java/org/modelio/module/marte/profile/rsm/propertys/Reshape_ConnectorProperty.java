package org.modelio.module.marte.profile.rsm.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("07a83426-80db-4dcd-aab8-d8a6df5bac6d")
public class Reshape_ConnectorProperty implements IPropertyContent {
    @objid ("1ba20349-358b-4fb4-a5fb-cc459f28ad4e")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt,MARTEDesignerTagTypes.RESHAPE_CONNECTOR_RESHAPE_CONNECTOR_PATTERNSHAPE, value);
        }
        if(row == 2){
            ModelUtils.addStringValue(elt,MARTEDesignerTagTypes.RESHAPE_CONNECTOR_RESHAPE_CONNECTOR_REPETITONSHAPE, value);
        }
    }

    @objid ("a614c9d8-5567-453a-89d8-22e195fcb5df")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_patternShape = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RESHAPE_CONNECTOR_RESHAPE_CONNECTOR_PATTERNSHAPE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESHAPE_CONNECTOR_RESHAPE_CONNECTOR_PATTERNSHAPE),value_patternShape);
        
        String value_repetitonShape = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RESHAPE_CONNECTOR_RESHAPE_CONNECTOR_REPETITONSHAPE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESHAPE_CONNECTOR_RESHAPE_CONNECTOR_REPETITONSHAPE),value_repetitonShape);
    }

}
