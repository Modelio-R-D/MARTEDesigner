package org.modelio.module.marte.profile.sam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("8b221fd3-4c59-43a4-ac07-8ce7f16425f0")
public class SaCommHost_AssociationProperty implements IPropertyContent {
    @objid ("4ed8b317-d812-4bc8-9323-f4c001f8e2b1")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SACOMMHOST_ASSOCIATION_SACOMMHOST_ASSOCIATION_ISSCHED, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SACOMMHOST_ASSOCIATION_SACOMMHOST_ASSOCIATION_SCHSLACK, value);
        }
    }

    @objid ("f5ccc0c2-7278-4daa-becf-f24014aa0d43")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SACOMMHOST_ASSOCIATION_SACOMMHOST_ASSOCIATION_ISSCHED)
                ,ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SACOMMHOST_ASSOCIATION_SACOMMHOST_ASSOCIATION_ISSCHED, elt));
        
        String value_schSlack = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SACOMMHOST_ASSOCIATION_SACOMMHOST_ASSOCIATION_SCHSLACK, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SACOMMHOST_ASSOCIATION_SACOMMHOST_ASSOCIATION_SCHSLACK),value_schSlack);
    }

}
