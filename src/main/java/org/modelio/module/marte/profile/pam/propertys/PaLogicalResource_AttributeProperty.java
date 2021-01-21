package org.modelio.module.marte.profile.pam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("1edb1809-5458-4b0d-abc9-ca8523ad0ec5")
public class PaLogicalResource_AttributeProperty implements IPropertyContent {
    @objid ("c1f7fb81-8235-401d-8750-1195b5fdc4b7")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PALOGICALRESOURCE_ATTRIBUTE_PALOGICALRESOURCE_ATTRIBUTE_UTILIZATION, value);
        }
        if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PALOGICALRESOURCE_ATTRIBUTE_PALOGICALRESOURCE_ATTRIBUTE_THROUGHPUT, value);
        }
        if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PALOGICALRESOURCE_ATTRIBUTE_PALOGICALRESOURCE_ATTRIBUTE_POOLSIZE, value);
        }
    }

    @objid ("80df7cc6-9b0e-4a8d-b919-7798a604268f")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_utilization = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PALOGICALRESOURCE_ATTRIBUTE_PALOGICALRESOURCE_ATTRIBUTE_UTILIZATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PALOGICALRESOURCE_ATTRIBUTE_PALOGICALRESOURCE_ATTRIBUTE_UTILIZATION),value_utilization);
        
        String value_throughput = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PALOGICALRESOURCE_ATTRIBUTE_PALOGICALRESOURCE_ATTRIBUTE_THROUGHPUT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PALOGICALRESOURCE_ATTRIBUTE_PALOGICALRESOURCE_ATTRIBUTE_THROUGHPUT),value_throughput);
        
        String value_poolSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PALOGICALRESOURCE_ATTRIBUTE_PALOGICALRESOURCE_ATTRIBUTE_POOLSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PALOGICALRESOURCE_ATTRIBUTE_PALOGICALRESOURCE_ATTRIBUTE_POOLSIZE),value_poolSize);
    }

}
