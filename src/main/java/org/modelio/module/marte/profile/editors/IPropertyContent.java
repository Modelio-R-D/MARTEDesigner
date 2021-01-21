package org.modelio.module.marte.profile.editors;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

/**
 * Provides both changeProperty and update functions.
 * @author ehouziaux
 */
@objid ("f8709ab6-01f5-4d46-8b14-ec7f5cb6984e")
public interface IPropertyContent {
    /**
     * Is called when the properties are changed.
     * @param element is the owner this.element.
     * 
     * @param row is the tag type row.
     * @param value is the new value.
     */
    @objid ("9199e4c9-b3fd-43bd-ade4-c26d770bfec5")
    void changeProperty(ModelElement elt, int row, String value);

    /**
     * Updates the Modelio properties table.
     * @param element is the owner this.element.
     * 
     * @param table is the properties table.
     */
    @objid ("58f181d3-2819-4bfc-acaa-8a670ac69017")
    void update(ModelElement elt, IModulePropertyTable table);

}
