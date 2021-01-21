package org.modelio.module.marte.profile.sam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("41c12f81-ed07-4a1f-ad6e-2fe2f36ae0a6")
public class SaSharedResource_InstanceProperty implements IPropertyContent {
    @objid ("9a3b18f6-568e-471e-ad31-571d980f81f8")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASHAREDRESOURCE_INSTANCE_SASHAREDRESOURCE_INSTANCE_CAPACITY, value);
        }
        if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASHAREDRESOURCE_INSTANCE_SASHAREDRESOURCE_INSTANCE_ISPREEMP, value);
        }
        if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASHAREDRESOURCE_INSTANCE_SASHAREDRESOURCE_INSTANCE_ISCONSUM, value);
        }
        if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASHAREDRESOURCE_INSTANCE_SASHAREDRESOURCE_INSTANCE_ACQUIST, value);
        }
        if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASHAREDRESOURCE_INSTANCE_SASHAREDRESOURCE_INSTANCE_RELEASET, value);
        }
    }

    @objid ("ce7c0f4c-df69-428d-8846-571b64e5728a")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_capacity = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SASHAREDRESOURCE_INSTANCE_SASHAREDRESOURCE_INSTANCE_CAPACITY, elt);
        if(value_capacity.equals("")){
            value_capacity = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASHAREDRESOURCE_INSTANCE_SASHAREDRESOURCE_INSTANCE_CAPACITY),value_capacity);
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASHAREDRESOURCE_INSTANCE_SASHAREDRESOURCE_INSTANCE_ISPREEMP),
                ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SASHAREDRESOURCE_INSTANCE_SASHAREDRESOURCE_INSTANCE_ISPREEMP, elt));
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASHAREDRESOURCE_INSTANCE_SASHAREDRESOURCE_INSTANCE_ISCONSUM)
                ,ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SASHAREDRESOURCE_INSTANCE_SASHAREDRESOURCE_INSTANCE_ISCONSUM, elt));
        
        String value_acquisT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SASHAREDRESOURCE_INSTANCE_SASHAREDRESOURCE_INSTANCE_ACQUIST, elt);
        if(value_acquisT.equals("")){
            value_acquisT = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASHAREDRESOURCE_INSTANCE_SASHAREDRESOURCE_INSTANCE_ACQUIST),value_acquisT);
        
        String value_releaseT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SASHAREDRESOURCE_INSTANCE_SASHAREDRESOURCE_INSTANCE_RELEASET, elt);
        if(value_releaseT.equals("")){
            value_releaseT = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASHAREDRESOURCE_INSTANCE_SASHAREDRESOURCE_INSTANCE_RELEASET),value_releaseT);
    }

}
