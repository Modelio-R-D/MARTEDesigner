package org.modelio.module.marte.profile.hlam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.profile.editors.IPropertyContent;

@objid ("7b60c2ac-a626-4771-840f-827c7fc2ebc2")
public class DefaultProperty implements IPropertyContent {
    @objid ("fbb16da3-eef8-4c95-931d-80a37684c697")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
    }

    @objid ("4ce2c55e-23dc-4663-8af2-e427c9349fb5")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
    }

}
