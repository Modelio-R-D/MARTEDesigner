package org.modelio.module.marte.profile.alloc.propertys;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class AllocateActivityGroup_ActivityPartitionProperty implements IPropertyContent {
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.ALLOCATEACTIVITYGROUP_ACTIVITYPARTITION_ALLOCATEACTIVITYGROUP_ACTIVITYPARTITION_ISUNIQUE, value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.ALLOCATEACTIVITYGROUP_ACTIVITYPARTITION_ALLOCATEACTIVITYGROUP_ACTIVITYPARTITION_ISUNIQUE),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.ALLOCATEACTIVITYGROUP_ACTIVITYPARTITION_ALLOCATEACTIVITYGROUP_ACTIVITYPARTITION_ISUNIQUE, elt));
    }

}
