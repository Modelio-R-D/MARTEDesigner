package org.modelio.module.marte.profile.sam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("4e22cea1-edbe-46c2-a007-bab1de0c6f91")
public class SaSharedResource_AssociationProperty implements IPropertyContent {
    @objid ("0044ac3c-f24a-4fbd-a684-6f2315e0ec88")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATION_SASHAREDRESOURCE_ASSOCIATION_CAPACITY, value);
        }
        if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATION_SASHAREDRESOURCE_ASSOCIATION_ISPREEMP, value);
        }
        if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATION_SASHAREDRESOURCE_ASSOCIATION_ISCONSUM, value);
        }
        if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATION_SASHAREDRESOURCE_ASSOCIATION_ACQUIST, value);
        }
        if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATION_SASHAREDRESOURCE_ASSOCIATION_RELEASET, value);
        }
    }

    @objid ("6625fb89-c55a-4edc-9432-a8c1414ac33b")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_capacity = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATION_SASHAREDRESOURCE_ASSOCIATION_CAPACITY, elt);
        if(value_capacity.equals("")){
            value_capacity = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATION_SASHAREDRESOURCE_ASSOCIATION_CAPACITY),value_capacity);
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATION_SASHAREDRESOURCE_ASSOCIATION_ISPREEMP),
                ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATION_SASHAREDRESOURCE_ASSOCIATION_ISPREEMP, elt));
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATION_SASHAREDRESOURCE_ASSOCIATION_ISCONSUM)
                ,ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATION_SASHAREDRESOURCE_ASSOCIATION_ISCONSUM, elt));
        
        String value_acquisT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATION_SASHAREDRESOURCE_ASSOCIATION_ACQUIST, elt);
        if(value_acquisT.equals("")){
            value_acquisT = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATION_SASHAREDRESOURCE_ASSOCIATION_ACQUIST),value_acquisT);
        
        String value_releaseT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATION_SASHAREDRESOURCE_ASSOCIATION_RELEASET, elt);
        if(value_releaseT.equals("")){
            value_releaseT = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATION_SASHAREDRESOURCE_ASSOCIATION_RELEASET),value_releaseT);
    }

}
