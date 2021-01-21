package org.modelio.module.marte.profile.hlam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("f7d2891d-bf4c-49b6-86ca-c21d187e3a0b")
public class RtAction_OperationProperty implements IPropertyContent {
    @objid ("68881a2a-d408-479b-9de0-15f7120f288d")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTACTION_OPERATION_RTACTION_OPERATION_ISATOMIC, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTACTION_OPERATION_RTACTION_OPERATION_SYNCHKIND, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTACTION_OPERATION_RTACTION_OPERATION_MSGSIZE, value);
        }
    }

    @objid ("2b1ba198-bb18-4bfe-83e3-04057a80c909")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTACTION_OPERATION_RTACTION_OPERATION_ISATOMIC),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RTACTION_OPERATION_RTACTION_OPERATION_ISATOMIC, elt));
        
        String[] types = MARTEEnumerationUtils.getSynchronisationKind();
        String value_synchronisationKind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTACTION_OPERATION_RTACTION_OPERATION_SYNCHKIND, elt);
        if(!(MARTEEnumerationUtils.isSynchronisationKind(value_synchronisationKind))){
             value_synchronisationKind = "other";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTACTION_OPERATION_RTACTION_OPERATION_SYNCHKIND),value_synchronisationKind, types);
        
        String value_RtAction_Operation_msgSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTACTION_OPERATION_RTACTION_OPERATION_MSGSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTACTION_OPERATION_RTACTION_OPERATION_MSGSIZE),value_RtAction_Operation_msgSize);
    }

}
