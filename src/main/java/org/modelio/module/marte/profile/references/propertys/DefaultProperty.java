package org.modelio.module.marte.profile.references.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.profile.editors.IPropertyContent;

@objid ("312dd167-2c6b-44f0-815f-7b88ed25f2b7")
public class DefaultProperty implements IPropertyContent {
    @objid ("04becaa8-a373-4dae-805f-bd7e4a50efff")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
    }

    @objid ("ca9ff6f9-4660-4242-99ba-4aba882e607b")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
    }

}
