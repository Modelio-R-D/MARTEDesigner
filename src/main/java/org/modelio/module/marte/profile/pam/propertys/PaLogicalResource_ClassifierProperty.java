package org.modelio.module.marte.profile.pam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("d6dd2bd9-92cf-4e29-b5df-7face3838052")
public class PaLogicalResource_ClassifierProperty implements IPropertyContent {
    @objid ("a5084ea0-99f3-453e-8723-e3f8056fd701")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PALOGICALRESOURCE_CLASSIFIER_PALOGICALRESOURCE_CLASSIFIER_UTILIZATION, value);
        }
        if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PALOGICALRESOURCE_CLASSIFIER_PALOGICALRESOURCE_CLASSIFIER_THROUGHPUT, value);
        }
        if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PALOGICALRESOURCE_CLASSIFIER_PALOGICALRESOURCE_CLASSIFIER_POOLSIZE, value);
        }
    }

    @objid ("996dd44e-9861-4702-8a04-f4e32ff7acd8")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_utilization = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PALOGICALRESOURCE_CLASSIFIER_PALOGICALRESOURCE_CLASSIFIER_UTILIZATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PALOGICALRESOURCE_CLASSIFIER_PALOGICALRESOURCE_CLASSIFIER_UTILIZATION),value_utilization);
        
        String value_throughput = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PALOGICALRESOURCE_CLASSIFIER_PALOGICALRESOURCE_CLASSIFIER_THROUGHPUT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PALOGICALRESOURCE_CLASSIFIER_PALOGICALRESOURCE_CLASSIFIER_THROUGHPUT),value_throughput);
        
        String value_poolSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PALOGICALRESOURCE_CLASSIFIER_PALOGICALRESOURCE_CLASSIFIER_POOLSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PALOGICALRESOURCE_CLASSIFIER_PALOGICALRESOURCE_CLASSIFIER_POOLSIZE),value_poolSize);
    }

}
