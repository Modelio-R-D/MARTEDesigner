package org.modelio.module.marte.profile.grm.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("180b20ee-b25d-4aa7-ba0d-120b7ed494ab")
public class Acquire_OperationProperty implements IPropertyContent {
    @objid ("91fc4535-5cc8-475b-b830-1bc2ac6300fa")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.ACQUIRE_OPERATION_ACQUIRE_OPERATION_ISBLOCKING, value);
        }
    }

    @objid ("1aa8ca9e-8bb5-44d7-8f5d-4dfedf764ad9")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Acquire
        //
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.ACQUIRE_OPERATION_ACQUIRE_OPERATION_ISBLOCKING),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.ACQUIRE_OPERATION_ACQUIRE_OPERATION_ISBLOCKING, elt));
    }

}
