package org.modelio.module.marte.profile.hlam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("7688dfc4-7890-4bb5-a2fa-c9937916850f")
public class RtAction_OpaqueActionProperty implements IPropertyContent {
    @objid ("5217e25d-5b45-4d67-854f-2da84f2861b6")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTACTION_OPAQUEACTION_RTACTION_OPAQUEACTION_ISATOMIC, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTACTION_OPAQUEACTION_RTACTION_OPAQUEACTION_SYNCHKIND, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTACTION_OPAQUEACTION_RTACTION_OPAQUEACTION_MSGSIZE, value);
        }
    }

    @objid ("0737774a-c60b-412a-b81c-6e84ca7b4d40")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTACTION_OPAQUEACTION_RTACTION_OPAQUEACTION_ISATOMIC),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RTACTION_OPERATION_RTACTION_OPERATION_ISATOMIC, elt));
        
        String[] types = MARTEEnumerationUtils.getSynchronisationKind();
        String value_synchronisationKind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTACTION_OPAQUEACTION_RTACTION_OPAQUEACTION_SYNCHKIND, elt);
        if(!(MARTEEnumerationUtils.isSynchronisationKind(value_synchronisationKind))){
             value_synchronisationKind = "other";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTACTION_OPAQUEACTION_RTACTION_OPAQUEACTION_SYNCHKIND),value_synchronisationKind, types);
        
        
        String value_RtAction_OpaqueAction_msgSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTACTION_OPAQUEACTION_RTACTION_OPAQUEACTION_MSGSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTACTION_OPAQUEACTION_RTACTION_OPAQUEACTION_MSGSIZE),value_RtAction_OpaqueAction_msgSize);
    }

}
