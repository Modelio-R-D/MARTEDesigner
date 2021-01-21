package org.modelio.module.marte.profile.grm.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("ce30c2e0-ddaa-483f-9b0a-25b20ddf1dc1")
public class StorageResource_ParameterProperty implements IPropertyContent {
    @objid ("9efe57ab-8f1c-4406-81b3-7b9804020f8c")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.STORAGERESOURCE_PARAMETER_STORAGERESOURCE_PARAMETER_ELEMENTSIZE, value);
        }
    }

    @objid ("d9b1deb0-4112-44fa-aca4-30441e2ed92a")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Storage Resource
        //
        String value_elementSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.STORAGERESOURCE_PARAMETER_STORAGERESOURCE_PARAMETER_ELEMENTSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.STORAGERESOURCE_PARAMETER_STORAGERESOURCE_PARAMETER_ELEMENTSIZE),value_elementSize);
    }

}
