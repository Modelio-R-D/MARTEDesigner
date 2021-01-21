package org.modelio.module.marte.profile.sam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.profile.editors.IPropertyContent;

@objid ("ec9bd01e-9a9c-409d-9bb4-a88627b0688b")
public class DefaultProperty implements IPropertyContent {
    @objid ("64455bb3-19f2-4bb5-8a22-9f2dcf27d101")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if (row == 1)
            elt.setName(value);
    }

    @objid ("b8b14f3e-b5a1-49dc-9472-4d1c6b21dd3c")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addProperty("Name", elt.getName());
    }

}
