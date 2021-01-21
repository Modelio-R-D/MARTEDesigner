package org.modelio.module.marte.profile.grm.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("e5de4ade-0bbb-4fd3-9b81-88af9c3088cd")
public class Acquire_CollaborationProperty implements IPropertyContent {
    @objid ("9765d68f-dc5e-41e1-9b6e-ebc474bd0141")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.ACQUIRE_COLLABORATION_ACQUIRE_COLLABORATION_ISBLOCKING, value);
        }
    }

    @objid ("349ce319-09ae-48dc-ac2c-beb6e7ee2eb0")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Acquire
        //
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.ACQUIRE_COLLABORATION_ACQUIRE_COLLABORATION_ISBLOCKING),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.ACQUIRE_COLLABORATION_ACQUIRE_COLLABORATION_ISBLOCKING, elt));
    }

}
