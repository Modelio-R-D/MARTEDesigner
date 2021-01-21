package org.modelio.module.marte.profile.pam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("97d41176-b0b8-4cda-8561-928598b8bed4")
public class PaLogicalResource_ParameterProperty implements IPropertyContent {
    @objid ("59daa3ab-d186-428a-83a0-76f516bd1e17")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PALOGICALRESOURCE_PARAMETER_PALOGICALRESOURCE_PARAMETER_UTILIZATION, value);
        }
        if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PALOGICALRESOURCE_PARAMETER_PALOGICALRESOURCE_PARAMETER_THROUGHPUT, value);
        }
        if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PALOGICALRESOURCE_PARAMETER_PALOGICALRESOURCE_PARAMETER_POOLSIZE, value);
        }
    }

    @objid ("988ce67f-55df-46fc-b04d-630a4a42cc2f")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_utilization = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PALOGICALRESOURCE_PARAMETER_PALOGICALRESOURCE_PARAMETER_UTILIZATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PALOGICALRESOURCE_PARAMETER_PALOGICALRESOURCE_PARAMETER_UTILIZATION),value_utilization);
        
        String value_throughput = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PALOGICALRESOURCE_PARAMETER_PALOGICALRESOURCE_PARAMETER_THROUGHPUT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PALOGICALRESOURCE_PARAMETER_PALOGICALRESOURCE_PARAMETER_THROUGHPUT),value_throughput);
        
        String value_poolSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PALOGICALRESOURCE_PARAMETER_PALOGICALRESOURCE_PARAMETER_POOLSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PALOGICALRESOURCE_PARAMETER_PALOGICALRESOURCE_PARAMETER_POOLSIZE),value_poolSize);
    }

}
