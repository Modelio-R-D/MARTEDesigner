package org.modelio.module.marte.profile.gcm.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("90689e77-4b73-499f-8635-2ea9b4a0f3e8")
public class FlowProperty_AttributeProperty implements IPropertyContent {
    @objid ("ddf2c83a-4cba-4e80-9999-984a529f5cdb")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.FLOWPROPERTY_ATTRIBUTE_FLOWPROPERTY_ATTRIBUTE_DIRECTION, value);
        }
    }

    @objid ("6bcc3e03-1a24-430f-a734-386ea4fae54a")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String[] tabDirection =  MARTEEnumerationUtils.getFlowDirectionKind();
        String value_direction = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.FLOWPROPERTY_ATTRIBUTE_FLOWPROPERTY_ATTRIBUTE_DIRECTION, elt);
        if (!(MARTEEnumerationUtils.isFlowDirectionKind(value_direction)))
            value_direction = "inout";
               table.addProperty(MARTEResourceManager.getPropertyName( MARTEDesignerTagTypes.FLOWPROPERTY_ATTRIBUTE_FLOWPROPERTY_ATTRIBUTE_DIRECTION),value_direction, tabDirection);
    }

}
