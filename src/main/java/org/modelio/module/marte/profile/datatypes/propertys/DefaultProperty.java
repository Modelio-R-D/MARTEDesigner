package org.modelio.module.marte.profile.datatypes.propertys;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.profile.editors.IPropertyContent;

public class DefaultProperty implements IPropertyContent {
    /**
     * Is called when the properties are changed.
     * @param element is the owner this.element.
     * 
     * @param row is the tag type row.
     * @param value is the new value.
     */
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
    }

    /**
     * Updates the Modelio properties table.
     * @param element is the owner this.element.
     * 
     * @param table is the properties table.
     */
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
    }

}
