package org.modelio.module.marte.profile.pam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("010cbc17-36e5-461d-a794-4a34f99142b0")
public class PaLogicalResource_AssociationEndProperty implements IPropertyContent {
    @objid ("f69ce2e7-7f51-444f-8a1c-9dcbce7daff4")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PALOGICALRESOURCE_ASSOCIATIONEND_PALOGICALRESOURCE_ASSOCIATIONEND_UTILIZATION, value);
        }
        if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PALOGICALRESOURCE_ASSOCIATIONEND_PALOGICALRESOURCE_ASSOCIATIONEND_THROUGHPUT, value);
        }
        if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PALOGICALRESOURCE_ASSOCIATIONEND_PALOGICALRESOURCE_ASSOCIATIONEND_POOLSIZE, value);
        }
    }

    @objid ("d8a6bffc-1c8c-4cdd-bf41-9cd008ec5834")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_utilization = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PALOGICALRESOURCE_ASSOCIATIONEND_PALOGICALRESOURCE_ASSOCIATIONEND_UTILIZATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PALOGICALRESOURCE_ASSOCIATIONEND_PALOGICALRESOURCE_ASSOCIATIONEND_UTILIZATION),value_utilization);
        
        String value_throughput = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PALOGICALRESOURCE_ASSOCIATIONEND_PALOGICALRESOURCE_ASSOCIATIONEND_THROUGHPUT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PALOGICALRESOURCE_ASSOCIATIONEND_PALOGICALRESOURCE_ASSOCIATIONEND_THROUGHPUT),value_throughput);
        
        String value_poolSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PALOGICALRESOURCE_ASSOCIATIONEND_PALOGICALRESOURCE_ASSOCIATIONEND_POOLSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PALOGICALRESOURCE_ASSOCIATIONEND_PALOGICALRESOURCE_ASSOCIATIONEND_POOLSIZE),value_poolSize);
    }

}
