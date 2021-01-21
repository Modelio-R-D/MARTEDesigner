package org.modelio.module.marte.profile.sam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("ee1e3240-7fd7-4bbe-b1d2-95aeac70c0e1")
public class SaSharedResource_LinkProperty implements IPropertyContent {
    @objid ("3c4dfcfe-948e-4848-917c-653d1b6bce01")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASHAREDRESOURCE_LINK_SASHAREDRESOURCE_LINK_CAPACITY, value);
        }
        if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASHAREDRESOURCE_LINK_SASHAREDRESOURCE_LINK_ISPREEMP, value);
        }
        if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASHAREDRESOURCE_LINK_SASHAREDRESOURCE_LINK_ISCONSUM, value);
        }
        if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASHAREDRESOURCE_LINK_SASHAREDRESOURCE_LINK_ACQUIST, value);
        }
        if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASHAREDRESOURCE_LINK_SASHAREDRESOURCE_LINK_RELEASET, value);
        }
    }

    @objid ("e2e435f8-0ce2-4171-ba0e-0b925b26e1ad")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_capacity = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SASHAREDRESOURCE_LINK_SASHAREDRESOURCE_LINK_CAPACITY, elt);
        if(value_capacity.equals("")){
            value_capacity = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASHAREDRESOURCE_LINK_SASHAREDRESOURCE_LINK_CAPACITY),value_capacity);
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASHAREDRESOURCE_LINK_SASHAREDRESOURCE_LINK_ISPREEMP),
                ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SASHAREDRESOURCE_LINK_SASHAREDRESOURCE_LINK_ISPREEMP, elt));
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASHAREDRESOURCE_LINK_SASHAREDRESOURCE_LINK_ISCONSUM)
                ,ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SASHAREDRESOURCE_LINK_SASHAREDRESOURCE_LINK_ISCONSUM, elt));
        
        String value_acquisT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SASHAREDRESOURCE_LINK_SASHAREDRESOURCE_LINK_ACQUIST, elt);
        if(value_acquisT.equals("")){
            value_acquisT = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASHAREDRESOURCE_LINK_SASHAREDRESOURCE_LINK_ACQUIST),value_acquisT);
        
        String value_releaseT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SASHAREDRESOURCE_LINK_SASHAREDRESOURCE_LINK_RELEASET, elt);
        if(value_releaseT.equals("")){
            value_releaseT = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASHAREDRESOURCE_LINK_SASHAREDRESOURCE_LINK_RELEASET),value_releaseT);
    }

}
