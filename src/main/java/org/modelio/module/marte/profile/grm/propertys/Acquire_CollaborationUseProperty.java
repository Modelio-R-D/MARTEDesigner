package org.modelio.module.marte.profile.grm.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("328528a9-0c6d-4da9-b4ab-b6d1b110eb0e")
public class Acquire_CollaborationUseProperty implements IPropertyContent {
    @objid ("9b30c151-f123-4611-ac9f-1b2bc30d032e")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.ACQUIRE_COLLABORATIONUSE_ACQUIRE_COLLABORATIONUSE_ISBLOCKING, value);
        }
    }

    @objid ("fa5d9e05-9a94-474a-bc20-1d2a3d9afd45")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Acquire
        //
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.ACQUIRE_COLLABORATIONUSE_ACQUIRE_COLLABORATIONUSE_ISBLOCKING),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.ACQUIRE_COLLABORATIONUSE_ACQUIRE_COLLABORATIONUSE_ISBLOCKING, elt));
    }

}
