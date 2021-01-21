package org.modelio.module.marte.profile.grm.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.profile.editors.IPropertyContent;

@objid ("62d64257-c310-4745-a283-3a95a372e7c8")
public class DefaultProperty implements IPropertyContent {
    @objid ("79286b88-f3af-401f-aa1e-5d3e5dec6c1e")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
    }

    @objid ("52b12142-51e7-4764-9dc0-ae79140d08d6")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
    }

}
