package org.modelio.module.marte.profile.sam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("9feabc9d-3fd3-493c-835a-8f7e12625f1f")
public class SaSharedResource_AssociationEndProperty implements IPropertyContent {
    @objid ("f26032dc-abea-4884-a963-ad53de619f7e")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATIONEND_SASHAREDRESOURCE_ASSOCIATIONEND_CAPACITY, value);
        }
        if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATIONEND_SASHAREDRESOURCE_ASSOCIATIONEND_ISPREEMP, value);
        }
        if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATIONEND_SASHAREDRESOURCE_ASSOCIATIONEND_ISCONSUM, value);
        }
        if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATIONEND_SASHAREDRESOURCE_ASSOCIATIONEND_ACQUIST, value);
        }
        if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATIONEND_SASHAREDRESOURCE_ASSOCIATIONEND_RELEASET, value);
        }
    }

    @objid ("1ed48830-04f8-4fca-a795-7dd4647fd4c2")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_capacity = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATIONEND_SASHAREDRESOURCE_ASSOCIATIONEND_CAPACITY, elt);
        if(value_capacity.equals("")){
            value_capacity = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATIONEND_SASHAREDRESOURCE_ASSOCIATIONEND_CAPACITY),value_capacity);
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATIONEND_SASHAREDRESOURCE_ASSOCIATIONEND_ISPREEMP),
                ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATIONEND_SASHAREDRESOURCE_ASSOCIATIONEND_ISPREEMP, elt));
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATIONEND_SASHAREDRESOURCE_ASSOCIATIONEND_ISCONSUM)
                ,ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATIONEND_SASHAREDRESOURCE_ASSOCIATIONEND_ISCONSUM, elt));
        
        String value_acquisT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATIONEND_SASHAREDRESOURCE_ASSOCIATIONEND_ACQUIST, elt);
        if(value_acquisT.equals("")){
            value_acquisT = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATIONEND_SASHAREDRESOURCE_ASSOCIATIONEND_ACQUIST),value_acquisT);
        
        String value_releaseT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATIONEND_SASHAREDRESOURCE_ASSOCIATIONEND_RELEASET, elt);
        if(value_releaseT.equals("")){
            value_releaseT = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATIONEND_SASHAREDRESOURCE_ASSOCIATIONEND_RELEASET),value_releaseT);
    }

}
