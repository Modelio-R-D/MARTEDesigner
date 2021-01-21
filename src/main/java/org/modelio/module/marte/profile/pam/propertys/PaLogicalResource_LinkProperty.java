package org.modelio.module.marte.profile.pam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("b825c7b2-360a-493a-95fb-8edcfccbcdfb")
public class PaLogicalResource_LinkProperty implements IPropertyContent {
    @objid ("1f3aebe9-8df3-4627-bc08-434ad4fc14da")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PALOGICALRESOURCE_LINK_PALOGICALRESOURCE_LINK_UTILIZATION, value);
        }
        if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PALOGICALRESOURCE_LINK_PALOGICALRESOURCE_LINK_THROUGHPUT, value);
        }
        if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PALOGICALRESOURCE_LINK_PALOGICALRESOURCE_LINK_POOLSIZE, value);
        }
    }

    @objid ("312c4140-5436-430c-91e2-8199c97074e2")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_utilization = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PALOGICALRESOURCE_LINK_PALOGICALRESOURCE_LINK_UTILIZATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PALOGICALRESOURCE_LINK_PALOGICALRESOURCE_LINK_UTILIZATION),value_utilization);
        
        String value_throughput = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PALOGICALRESOURCE_LINK_PALOGICALRESOURCE_LINK_THROUGHPUT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PALOGICALRESOURCE_LINK_PALOGICALRESOURCE_LINK_THROUGHPUT),value_throughput);
        
        String value_poolSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PALOGICALRESOURCE_LINK_PALOGICALRESOURCE_LINK_POOLSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PALOGICALRESOURCE_LINK_PALOGICALRESOURCE_LINK_POOLSIZE),value_poolSize);
    }

}
