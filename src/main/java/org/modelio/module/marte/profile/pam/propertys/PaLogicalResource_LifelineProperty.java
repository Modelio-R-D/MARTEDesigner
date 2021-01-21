package org.modelio.module.marte.profile.pam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("a86772fe-bfa3-47a4-80e2-ac6365cb5813")
public class PaLogicalResource_LifelineProperty implements IPropertyContent {
    @objid ("b3161e17-696f-4215-a815-b263052b4087")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PALOGICALRESOURCE_LIFELINE_PALOGICALRESOURCE_LIFELINE_UTILIZATION, value);
        }
        if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PALOGICALRESOURCE_LIFELINE_PALOGICALRESOURCE_LIFELINE_THROUGHPUT, value);
        }
        if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PALOGICALRESOURCE_LIFELINE_PALOGICALRESOURCE_LIFELINE_POOLSIZE, value);
        }
    }

    @objid ("a24c6fae-9101-4042-9092-77f6b0c38261")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_utilization = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PALOGICALRESOURCE_LIFELINE_PALOGICALRESOURCE_LIFELINE_UTILIZATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PALOGICALRESOURCE_LIFELINE_PALOGICALRESOURCE_LIFELINE_UTILIZATION),value_utilization);
        
        String value_throughput = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PALOGICALRESOURCE_LIFELINE_PALOGICALRESOURCE_LIFELINE_THROUGHPUT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PALOGICALRESOURCE_LIFELINE_PALOGICALRESOURCE_LIFELINE_THROUGHPUT),value_throughput);
        
        String value_poolSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PALOGICALRESOURCE_LIFELINE_PALOGICALRESOURCE_LIFELINE_POOLSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PALOGICALRESOURCE_LIFELINE_PALOGICALRESOURCE_LIFELINE_POOLSIZE),value_poolSize);
    }

}
