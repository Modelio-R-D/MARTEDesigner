package org.modelio.module.marte.profile.sam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("82091896-7566-40f8-aa85-d6789fed68a1")
public class SaCommHost_InstanceProperty implements IPropertyContent {
    @objid ("6ce30f05-eea8-4a42-8ebf-dde44e6d8a25")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SACOMMHOST_INSTANCE_SACOMMHOST_INSTANCE_ISSCHED, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SACOMMHOST_INSTANCE_SACOMMHOST_INSTANCE_SCHSLACK, value);
        }
    }

    @objid ("3d4cdc95-e2c9-47c9-9608-6e21b2d979f5")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SACOMMHOST_INSTANCE_SACOMMHOST_INSTANCE_ISSCHED)
                ,ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SACOMMHOST_INSTANCE_SACOMMHOST_INSTANCE_ISSCHED, elt));
        
        String value_schSlack = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SACOMMHOST_INSTANCE_SACOMMHOST_INSTANCE_SCHSLACK, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SACOMMHOST_INSTANCE_SACOMMHOST_INSTANCE_SCHSLACK),value_schSlack);
    }

}
