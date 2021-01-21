package org.modelio.module.marte.profile.sam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("f057cce0-6f14-4a85-84db-2b65f874c668")
public class SaCommHost_AssociationEndProperty implements IPropertyContent {
    @objid ("9ee0cf10-8cb4-437e-88e1-cac8e985b009")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SACOMMHOST_ASSOCIATIONEND_SACOMMHOST_ASSOCIATIONEND_ISSCHED, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SACOMMHOST_ASSOCIATIONEND_SACOMMHOST_ASSOCIATIONEND_SCHSLACK, value);
        }
    }

    @objid ("a8a5ffb1-dbaa-45ad-aae7-57686f3c0276")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SACOMMHOST_ASSOCIATIONEND_SACOMMHOST_ASSOCIATIONEND_ISSCHED)
                ,ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SACOMMHOST_ASSOCIATIONEND_SACOMMHOST_ASSOCIATIONEND_ISSCHED, elt));
         String value_schSlack = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SACOMMHOST_ASSOCIATIONEND_SACOMMHOST_ASSOCIATIONEND_SCHSLACK, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SACOMMHOST_ASSOCIATIONEND_SACOMMHOST_ASSOCIATIONEND_SCHSLACK),value_schSlack);
    }

}
