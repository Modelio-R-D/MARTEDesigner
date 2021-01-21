package org.modelio.module.marte.profile.extentions.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.profile.editors.IPropertyContent;

@objid ("81dee991-3e9e-4fd9-94ba-0374e21e4d3e")
public class DefaultProperty implements IPropertyContent {
    @objid ("f5da4c55-a606-4df3-b4bd-a7f528c1452c")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
    }

    @objid ("b6b752dd-4d52-48a5-b334-4a45e6fad2ca")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
    }

}
