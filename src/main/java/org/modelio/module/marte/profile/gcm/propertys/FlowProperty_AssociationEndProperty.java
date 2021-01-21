package org.modelio.module.marte.profile.gcm.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("3a15199e-cebd-4a8f-a4ef-3d9f59965e91")
public class FlowProperty_AssociationEndProperty implements IPropertyContent {
    @objid ("bfbdff7b-079d-4153-8394-3390da8d9eaa")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.FLOWPROPERTY_ASSOCIATIONEND_FLOWPROPERTY_ASSOCIATIONEND_DIRECTION, value);
        }
    }

    @objid ("cb9cb6c8-7e33-45d2-a825-572767e94314")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String[] tabDirection =  MARTEEnumerationUtils.getFlowDirectionKind();
        String value_direction = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.FLOWPROPERTY_ASSOCIATIONEND_FLOWPROPERTY_ASSOCIATIONEND_DIRECTION, elt);
        if (!(MARTEEnumerationUtils.isFlowDirectionKind(value_direction)))
            value_direction = "inout";
                table.addProperty(MARTEResourceManager.getPropertyName( MARTEDesignerTagTypes.FLOWPROPERTY_ASSOCIATIONEND_FLOWPROPERTY_ASSOCIATIONEND_DIRECTION),value_direction, tabDirection);
    }

}
