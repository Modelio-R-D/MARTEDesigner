package org.modelio.module.marte.profile.gcm.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("36025e83-364f-4a73-ab0f-c66b8cd44ea2")
public class FlowProperty_BindableInstanceProperty implements IPropertyContent {
    @objid ("a68ff5eb-559f-4fe8-8a9d-0fec6c29bbe7")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.FLOWPROPERTY_BINDABLEINSTANCE_FLOWPROPERTY_BINDABLEINSTANCE_DIRECTION, value);
        }
    }

    @objid ("f957c36a-991c-4467-88cd-8bb8893eb8cc")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String[] tabDirection =  MARTEEnumerationUtils.getFlowDirectionKind();
        String value_direction = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.FLOWPROPERTY_BINDABLEINSTANCE_FLOWPROPERTY_BINDABLEINSTANCE_DIRECTION, elt);
        if (!(MARTEEnumerationUtils.isFlowDirectionKind(value_direction)))
            value_direction = "inout";
                  table.addProperty(MARTEResourceManager.getPropertyName( MARTEDesignerTagTypes.FLOWPROPERTY_BINDABLEINSTANCE_FLOWPROPERTY_BINDABLEINSTANCE_DIRECTION),value_direction, tabDirection);
    }

}
