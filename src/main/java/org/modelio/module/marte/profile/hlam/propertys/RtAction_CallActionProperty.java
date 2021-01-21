package org.modelio.module.marte.profile.hlam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("1e9482af-4fe7-4f90-b584-583dfdfc9011")
public class RtAction_CallActionProperty implements IPropertyContent {
    @objid ("4591d1f8-c51b-49f0-b4a1-f55bb31f805d")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTACTION_CALLACTION_RTACTION_CALLACTION_ISATOMIC, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTACTION_CALLACTION_RTACTION_CALLACTION_SYNCHKIND, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTACTION_CALLACTION_RTACTION_CALLACTION_MSGSIZE, value);
        }
    }

    @objid ("7c091adc-735a-4030-b905-f19cda57cbd6")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTACTION_CALLACTION_RTACTION_CALLACTION_ISATOMIC),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RTACTION_OPERATION_RTACTION_OPERATION_ISATOMIC, elt));
        
        String[] types = MARTEEnumerationUtils.getSynchronisationKind();
        String value_synchronisationKind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTACTION_CALLACTION_RTACTION_CALLACTION_SYNCHKIND, elt);
        if(!(MARTEEnumerationUtils.isSynchronisationKind(value_synchronisationKind))){
            value_synchronisationKind = "other";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTACTION_CALLACTION_RTACTION_CALLACTION_SYNCHKIND),value_synchronisationKind, types);
        
        String value_RtAction_CALLAction_msgSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTACTION_CALLACTION_RTACTION_CALLACTION_MSGSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTACTION_CALLACTION_RTACTION_CALLACTION_MSGSIZE),value_RtAction_CALLAction_msgSize);
    }

}
