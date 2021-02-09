package org.modelio.module.marte.profile.editors;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

/**
 * Provides both changeProperty and update functions.
 * @author ehouziaux
 */
public interface IPropertyContent {
    /**
     * Is called when the properties are changed.
     * @param element is the owner this.element.
     * 
     * @param row is the tag type row.
     * @param value is the new value.
     */
    void changeProperty(ModelElement elt, int row, String value);

    /**
     * Updates the Modelio properties table.
     * @param element is the owner this.element.
     * 
     * @param table is the properties table.
     */
    void update(ModelElement elt, IModulePropertyTable table);

}
