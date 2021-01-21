package org.modelio.module.marte.profile.rsm.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.profile.editors.IPropertyContent;

@objid ("04d02ed0-1205-4185-8e70-9adc4ec7f6d8")
public class DefaultProperty implements IPropertyContent {
    @objid ("065bc1ce-7221-4c0c-a003-5276d83b1858")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
    }

    @objid ("e5b2703b-c4aa-48b6-b6f2-dfb4434308d6")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
    }

}
