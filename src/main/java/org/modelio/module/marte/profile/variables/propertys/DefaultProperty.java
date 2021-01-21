package org.modelio.module.marte.profile.variables.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.profile.editors.IPropertyContent;

@objid ("27e02a20-707e-48d6-90f4-3df88eb88521")
public class DefaultProperty implements IPropertyContent {
    @objid ("c697a66d-2251-4766-9581-e10c482c9366")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
    }

    @objid ("6e75c929-8709-4d09-aba1-ba6932b0a218")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
    }

}
