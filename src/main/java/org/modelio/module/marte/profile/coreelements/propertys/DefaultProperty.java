package org.modelio.module.marte.profile.coreelements.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.profile.editors.IPropertyContent;

@objid ("d8b43056-fc4c-41ae-b7ba-1dbccfa4a80d")
public class DefaultProperty implements IPropertyContent {
    @objid ("3a50a8f5-2bfc-478d-8a08-0ebd993789ee")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
    }

    @objid ("3690e433-cf03-4818-a4ed-0e2ded045510")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
    }

}
