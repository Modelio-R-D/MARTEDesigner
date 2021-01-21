package org.modelio.module.marte.profile.grm.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("d721e112-2974-43c1-bafd-b7b81accebce")
public class Acquire_ExecutionSpecificationProperty implements IPropertyContent {
    @objid ("d8c75997-70ce-4e81-ad23-0a029d073395")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.ACQUIRE_EXECUTIONSPECIFICATION_ACQUIRE_EXECUTIONSPECIFICATION_ISBLOCKING, value);
        }
    }

    @objid ("e25b375f-0c07-4f44-b19f-e43799cd6aa7")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Acquire
        //
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.ACQUIRE_EXECUTIONSPECIFICATION_ACQUIRE_EXECUTIONSPECIFICATION_ISBLOCKING),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.ACQUIRE_EXECUTIONSPECIFICATION_ACQUIRE_EXECUTIONSPECIFICATION_ISBLOCKING, elt));
    }

}
