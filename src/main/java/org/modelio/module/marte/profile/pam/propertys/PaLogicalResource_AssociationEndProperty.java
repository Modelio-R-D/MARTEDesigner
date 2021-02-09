package org.modelio.module.marte.profile.pam.propertys;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class PaLogicalResource_AssociationEndProperty implements IPropertyContent {
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
