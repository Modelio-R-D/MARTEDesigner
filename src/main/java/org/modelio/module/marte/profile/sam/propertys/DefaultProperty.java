package org.modelio.module.marte.profile.sam.propertys;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.profile.editors.IPropertyContent;

public class DefaultProperty implements IPropertyContent {
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if (row == 1)
            elt.setName(value);
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addProperty("Name", elt.getName());
    }

}
