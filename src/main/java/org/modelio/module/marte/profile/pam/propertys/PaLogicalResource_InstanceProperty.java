package org.modelio.module.marte.profile.pam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("f98065c9-34c2-48a4-8b05-1f8f8f7e0358")
public class PaLogicalResource_InstanceProperty implements IPropertyContent {
    @objid ("c00dde20-d2e6-48da-8615-1e9c94c2327d")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PALOGICALRESOURCE_INSTANCE_PALOGICALRESOURCE_INSTANCE_UTILIZATION, value);
        }
        if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PALOGICALRESOURCE_INSTANCE_PALOGICALRESOURCE_INSTANCE_THROUGHPUT, value);
        }
        if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PALOGICALRESOURCE_INSTANCE_PALOGICALRESOURCE_INSTANCE_POOLSIZE, value);
        }
    }

    @objid ("a189a7b3-51af-4374-baa6-bd401d1810ae")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_utilization = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PALOGICALRESOURCE_INSTANCE_PALOGICALRESOURCE_INSTANCE_UTILIZATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PALOGICALRESOURCE_INSTANCE_PALOGICALRESOURCE_INSTANCE_UTILIZATION),value_utilization);
        
        String value_throughput = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PALOGICALRESOURCE_INSTANCE_PALOGICALRESOURCE_INSTANCE_THROUGHPUT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PALOGICALRESOURCE_INSTANCE_PALOGICALRESOURCE_INSTANCE_THROUGHPUT),value_throughput);
        
        String value_poolSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PALOGICALRESOURCE_INSTANCE_PALOGICALRESOURCE_INSTANCE_POOLSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PALOGICALRESOURCE_INSTANCE_PALOGICALRESOURCE_INSTANCE_POOLSIZE),value_poolSize);
    }

}
