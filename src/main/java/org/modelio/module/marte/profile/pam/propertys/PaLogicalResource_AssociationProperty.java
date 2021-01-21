package org.modelio.module.marte.profile.pam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("b441090a-f94f-4f53-aaae-de759d020dc0")
public class PaLogicalResource_AssociationProperty implements IPropertyContent {
    @objid ("31addd58-ef44-4836-ad8c-f6298cafec6a")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PALOGICALRESOURCE_ASSOCIATION_PALOGICALRESOURCE_ASSOCIATION_UTILIZATION, value);
        }
        if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PALOGICALRESOURCE_ASSOCIATION_PALOGICALRESOURCE_ASSOCIATION_THROUGHPUT, value);
        }
        if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PALOGICALRESOURCE_ASSOCIATION_PALOGICALRESOURCE_ASSOCIATION_POOLSIZE, value);
        }
    }

    @objid ("31163af2-5f38-4f6f-ad6e-6ea1f18a3400")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_utilization = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PALOGICALRESOURCE_ASSOCIATION_PALOGICALRESOURCE_ASSOCIATION_UTILIZATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PALOGICALRESOURCE_ASSOCIATION_PALOGICALRESOURCE_ASSOCIATION_UTILIZATION),value_utilization);
        
        String value_throughput = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PALOGICALRESOURCE_ASSOCIATION_PALOGICALRESOURCE_ASSOCIATION_THROUGHPUT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PALOGICALRESOURCE_ASSOCIATION_PALOGICALRESOURCE_ASSOCIATION_THROUGHPUT),value_throughput);
        
        String value_poolSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PALOGICALRESOURCE_ASSOCIATION_PALOGICALRESOURCE_ASSOCIATION_POOLSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PALOGICALRESOURCE_ASSOCIATION_PALOGICALRESOURCE_ASSOCIATION_POOLSIZE),value_poolSize);
    }

}
