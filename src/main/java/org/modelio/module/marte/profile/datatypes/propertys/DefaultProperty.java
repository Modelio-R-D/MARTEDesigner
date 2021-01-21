package org.modelio.module.marte.profile.datatypes.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.profile.editors.IPropertyContent;

@objid ("e36e6829-cb6b-4eb5-9d23-5326f9a4400f")
public class DefaultProperty implements IPropertyContent {
    /**
     * Is called when the properties are changed.
     * @param element is the owner this.element.
     * 
     * @param row is the tag type row.
     * @param value is the new value.
     */
    @objid ("1f80eaf3-cb18-4cb9-89db-74f4cf2afa9e")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
    }

    /**
     * Updates the Modelio properties table.
     * @param element is the owner this.element.
     * 
     * @param table is the properties table.
     */
    @objid ("f97b6136-189e-47e4-abeb-2c82340779cf")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
    }

}
