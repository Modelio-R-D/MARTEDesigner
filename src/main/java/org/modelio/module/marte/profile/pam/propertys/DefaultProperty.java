package org.modelio.module.marte.profile.pam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.profile.editors.IPropertyContent;

@objid ("06e865e8-6f5b-4f36-bb07-aa9dfd3b0819")
public class DefaultProperty implements IPropertyContent {
    @objid ("23bc54e3-3477-4a75-bd76-ccc6d0e0183a")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if (row == 1)
            elt.setName(value);
    }

    @objid ("6d318ff6-4b58-47d4-8021-89984c5d80a1")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addProperty("Name", elt.getName());
    }

}
