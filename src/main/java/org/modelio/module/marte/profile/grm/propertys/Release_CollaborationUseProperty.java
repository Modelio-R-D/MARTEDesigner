package org.modelio.module.marte.profile.grm.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("17675d43-b518-4d3d-b9f9-1f1df00cda9d")
public class Release_CollaborationUseProperty implements IPropertyContent {
    @objid ("08b222cf-723b-47f3-9f83-7f40ddda8293")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GRSERVICE_COLLABORATIONUSE_GRSERVICE_COLLABORATIONUSE_OWNER, value);
        }
    }

    @objid ("d47f31a3-089b-4030-8f6f-60f5a965f697")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        //Gr Services
        //
        String value_owner = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GRSERVICE_COLLABORATIONUSE_GRSERVICE_COLLABORATIONUSE_OWNER, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GRSERVICE_COLLABORATIONUSE_GRSERVICE_COLLABORATIONUSE_OWNER),value_owner);
    }

}
