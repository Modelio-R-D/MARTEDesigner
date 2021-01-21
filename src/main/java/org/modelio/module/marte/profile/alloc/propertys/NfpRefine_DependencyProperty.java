package org.modelio.module.marte.profile.alloc.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("11375ea9-d5a4-4517-afad-36c7ddd04106")
public class NfpRefine_DependencyProperty implements IPropertyContent {
    @objid ("b3773e32-4169-4e82-8a02-f08ac3428408")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.NFPREFINE_DEPENDENCY_NFPREFINE_DEPENDENCY_CONSTRAINT, value);
        }
    }

    @objid ("c7a00c9a-a862-4896-82af-a09deb3801df")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_constraint = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NFPREFINE_DEPENDENCY_NFPREFINE_DEPENDENCY_CONSTRAINT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.NFPREFINE_DEPENDENCY_NFPREFINE_DEPENDENCY_CONSTRAINT),value_constraint);
    }

}
