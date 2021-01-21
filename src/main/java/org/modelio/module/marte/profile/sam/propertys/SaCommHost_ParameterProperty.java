package org.modelio.module.marte.profile.sam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("a87f81cc-46c8-437b-bdba-9f86cc546d50")
public class SaCommHost_ParameterProperty implements IPropertyContent {
    @objid ("912db8c8-c9b9-42d5-9efc-e29894751b7c")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SACOMMHOST_PARAMETER_SACOMMHOST_PARAMETER_ISSCHED, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SACOMMHOST_PARAMETER_SACOMMHOST_PARAMETER_SCHSLACK, value);
        }
    }

    @objid ("93365386-26ee-4a54-80ff-fd3cc759caac")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SACOMMHOST_PARAMETER_SACOMMHOST_PARAMETER_ISSCHED)
                ,ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SACOMMHOST_PARAMETER_SACOMMHOST_PARAMETER_ISSCHED, elt));
        
        String value_schSlack = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SACOMMHOST_PARAMETER_SACOMMHOST_PARAMETER_SCHSLACK, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SACOMMHOST_PARAMETER_SACOMMHOST_PARAMETER_SCHSLACK),value_schSlack);
    }

}
