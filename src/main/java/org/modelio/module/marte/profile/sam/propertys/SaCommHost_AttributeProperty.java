package org.modelio.module.marte.profile.sam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("4ccd646d-ed38-4c7d-b122-0c5d08853bc6")
public class SaCommHost_AttributeProperty implements IPropertyContent {
    @objid ("83f63a77-2000-43a3-a138-fcf260f24494")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SACOMMHOST_ATTRIBUTE_SACOMMHOST_ATTRIBUTE_ISSCHED, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SACOMMHOST_ATTRIBUTE_SACOMMHOST_ATTRIBUTE_SCHSLACK, value);
        }
    }

    @objid ("f2e3488e-c3ed-48be-a1ee-8fce922bfd39")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SACOMMHOST_ATTRIBUTE_SACOMMHOST_ATTRIBUTE_ISSCHED)
                ,ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SACOMMHOST_ATTRIBUTE_SACOMMHOST_ATTRIBUTE_ISSCHED, elt));
        
        String value_schSlack = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SACOMMHOST_ATTRIBUTE_SACOMMHOST_ATTRIBUTE_SCHSLACK, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SACOMMHOST_ATTRIBUTE_SACOMMHOST_ATTRIBUTE_SCHSLACK),value_schSlack);
    }

}
