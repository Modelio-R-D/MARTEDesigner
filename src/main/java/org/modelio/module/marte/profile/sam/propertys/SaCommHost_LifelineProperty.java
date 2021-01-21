package org.modelio.module.marte.profile.sam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("4b54f68a-4999-4384-b2cc-62290b2c9179")
public class SaCommHost_LifelineProperty implements IPropertyContent {
    @objid ("cea89345-90d1-41a3-9d06-508f215a7a5c")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SACOMMHOST_LIFELINE_SACOMMHOST_LIFELINE_ISSCHED, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SACOMMHOST_LIFELINE_SACOMMHOST_LIFELINE_SCHSLACK, value);
        }
    }

    @objid ("7a1a8d9c-fdd4-49dc-b041-08c007ae60d0")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SACOMMHOST_LIFELINE_SACOMMHOST_LIFELINE_ISSCHED)
                ,ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SACOMMHOST_LIFELINE_SACOMMHOST_LIFELINE_ISSCHED, elt));
        
        String value_schSlack = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SACOMMHOST_LIFELINE_SACOMMHOST_LIFELINE_SCHSLACK, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SACOMMHOST_LIFELINE_SACOMMHOST_LIFELINE_SCHSLACK),value_schSlack);
    }

}
