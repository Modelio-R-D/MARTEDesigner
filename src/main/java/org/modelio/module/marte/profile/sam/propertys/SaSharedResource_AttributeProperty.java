package org.modelio.module.marte.profile.sam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("8542489c-c247-46af-8f97-6c9fcb0a5105")
public class SaSharedResource_AttributeProperty implements IPropertyContent {
    @objid ("a7f62efa-40b7-4b04-a7f6-e3ac85188fd1")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASHAREDRESOURCE_ATTRIBUTE_SASHAREDRESOURCE_ATTRIBUTE_CAPACITY, value);
        }
        if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASHAREDRESOURCE_ATTRIBUTE_SASHAREDRESOURCE_ATTRIBUTE_ISPREEMP, value);
        }
        if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASHAREDRESOURCE_ATTRIBUTE_SASHAREDRESOURCE_ATTRIBUTE_ISCONSUM, value);
        }
        if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASHAREDRESOURCE_ATTRIBUTE_SASHAREDRESOURCE_ATTRIBUTE_ACQUIST, value);
        }
        if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASHAREDRESOURCE_ATTRIBUTE_SASHAREDRESOURCE_ATTRIBUTE_RELEASET, value);
        }
    }

    @objid ("dd94bcf1-f178-4862-ba9c-7a366d86bcc0")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_capacity = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SASHAREDRESOURCE_ATTRIBUTE_SASHAREDRESOURCE_ATTRIBUTE_CAPACITY, elt);
        if(value_capacity.equals("")){
            value_capacity = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASHAREDRESOURCE_ATTRIBUTE_SASHAREDRESOURCE_ATTRIBUTE_CAPACITY),value_capacity);
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASHAREDRESOURCE_ATTRIBUTE_SASHAREDRESOURCE_ATTRIBUTE_ISPREEMP),
                ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SASHAREDRESOURCE_ATTRIBUTE_SASHAREDRESOURCE_ATTRIBUTE_ISPREEMP, elt));
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASHAREDRESOURCE_ATTRIBUTE_SASHAREDRESOURCE_ATTRIBUTE_ISCONSUM)
                ,ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SASHAREDRESOURCE_ATTRIBUTE_SASHAREDRESOURCE_ATTRIBUTE_ISCONSUM, elt));
        
        String value_acquisT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SASHAREDRESOURCE_ATTRIBUTE_SASHAREDRESOURCE_ATTRIBUTE_ACQUIST, elt);
        if(value_acquisT.equals("")){
            value_acquisT = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASHAREDRESOURCE_ATTRIBUTE_SASHAREDRESOURCE_ATTRIBUTE_ACQUIST),value_acquisT);
        
        String value_releaseT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SASHAREDRESOURCE_ATTRIBUTE_SASHAREDRESOURCE_ATTRIBUTE_RELEASET, elt);
        if(value_releaseT.equals("")){
            value_releaseT = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASHAREDRESOURCE_ATTRIBUTE_SASHAREDRESOURCE_ATTRIBUTE_RELEASET),value_releaseT);
    }

}
