package org.modelio.module.marte.profile.grm.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("197795a9-9bb3-472b-9f05-9bb1530484c3")
public class Acquire_BehaviorProperty implements IPropertyContent {
    @objid ("e17515e0-ce86-4074-86c0-73c55ae2661f")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.ACQUIRE_BEHAVIOR_ACQUIRE_BEHAVIOR_ISBLOCKING, value);
        }
    }

    @objid ("fc5c7d6a-feec-44a5-a035-4097003de72a")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Acquire
        //
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.ACQUIRE_BEHAVIOR_ACQUIRE_BEHAVIOR_ISBLOCKING),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.ACQUIRE_OPERATION_ACQUIRE_OPERATION_ISBLOCKING, elt));
    }

}
