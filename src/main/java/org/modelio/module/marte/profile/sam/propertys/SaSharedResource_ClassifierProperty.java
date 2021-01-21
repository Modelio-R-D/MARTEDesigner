package org.modelio.module.marte.profile.sam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("26e22663-f163-43e9-b0f0-a1a62f03d33f")
public class SaSharedResource_ClassifierProperty implements IPropertyContent {
    @objid ("b7afdd36-0bd7-42a8-8844-3c14a5506cb9")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASHAREDRESOURCE_CLASSIFIER_SASHAREDRESOURCE_CLASSIFIER_CAPACITY, value);
        }
        if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASHAREDRESOURCE_CLASSIFIER_SASHAREDRESOURCE_CLASSIFIER_ISPREEMP, value);
        }
        if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASHAREDRESOURCE_CLASSIFIER_SASHAREDRESOURCE_CLASSIFIER_ISCONSUM, value);
        }
        if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASHAREDRESOURCE_CLASSIFIER_SASHAREDRESOURCE_CLASSIFIER_ACQUIST, value);
        }
        if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASHAREDRESOURCE_CLASSIFIER_SASHAREDRESOURCE_CLASSIFIER_RELEASET, value);
        }
    }

    @objid ("23d3495e-c6d5-42f0-80ee-41c8b8c35703")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_capacity = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SASHAREDRESOURCE_CLASSIFIER_SASHAREDRESOURCE_CLASSIFIER_CAPACITY, elt);
        if(value_capacity.equals("")){
            value_capacity = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASHAREDRESOURCE_CLASSIFIER_SASHAREDRESOURCE_CLASSIFIER_CAPACITY),value_capacity);
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASHAREDRESOURCE_CLASSIFIER_SASHAREDRESOURCE_CLASSIFIER_ISPREEMP),
                ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SASHAREDRESOURCE_CLASSIFIER_SASHAREDRESOURCE_CLASSIFIER_ISPREEMP, elt));
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASHAREDRESOURCE_CLASSIFIER_SASHAREDRESOURCE_CLASSIFIER_ISCONSUM)
                ,ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SASHAREDRESOURCE_CLASSIFIER_SASHAREDRESOURCE_CLASSIFIER_ISCONSUM, elt));
        
        String value_acquisT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SASHAREDRESOURCE_CLASSIFIER_SASHAREDRESOURCE_CLASSIFIER_ACQUIST, elt);
        if(value_acquisT.equals("")){
            value_acquisT = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASHAREDRESOURCE_CLASSIFIER_SASHAREDRESOURCE_CLASSIFIER_ACQUIST),value_acquisT);
        
        String value_releaseT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SASHAREDRESOURCE_CLASSIFIER_SASHAREDRESOURCE_CLASSIFIER_RELEASET, elt);
        if(value_releaseT.equals("")){
            value_releaseT = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASHAREDRESOURCE_CLASSIFIER_SASHAREDRESOURCE_CLASSIFIER_RELEASET),value_releaseT);
    }

}
