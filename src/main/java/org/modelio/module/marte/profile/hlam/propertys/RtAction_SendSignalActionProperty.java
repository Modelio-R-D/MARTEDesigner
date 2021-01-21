package org.modelio.module.marte.profile.hlam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("031a7fcc-d5c5-4aa3-9b00-070af6015103")
public class RtAction_SendSignalActionProperty implements IPropertyContent {
    @objid ("6103d226-156b-4820-80a8-ef39a1fde66a")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTACTION_SENDSIGNALACTION_RTACTION_SENDSIGNALACTION_ISATOMIC, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTACTION_SENDSIGNALACTION_RTACTION_SENDSIGNALACTION_SYNCHKIND, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTACTION_SENDSIGNALACTION_RTACTION_SENDSIGNALACTION_MSGSIZE, value);
        }
    }

    @objid ("a06313b9-a107-4c31-b59c-c00b76f36e02")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTACTION_SENDSIGNALACTION_RTACTION_SENDSIGNALACTION_ISATOMIC),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RTACTION_OPERATION_RTACTION_OPERATION_ISATOMIC, elt));
        
        String[] types = MARTEEnumerationUtils.getSynchronisationKind();
        String value_synchronisationKind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTACTION_SENDSIGNALACTION_RTACTION_SENDSIGNALACTION_SYNCHKIND, elt);
        if(!(MARTEEnumerationUtils.isSynchronisationKind(value_synchronisationKind))){
             value_synchronisationKind = "other";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTACTION_SENDSIGNALACTION_RTACTION_SENDSIGNALACTION_SYNCHKIND),value_synchronisationKind, types);
        
        String value_RtAction_SendSignalAction_msgSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTACTION_SENDSIGNALACTION_RTACTION_SENDSIGNALACTION_MSGSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTACTION_SENDSIGNALACTION_RTACTION_SENDSIGNALACTION_MSGSIZE),value_RtAction_SendSignalAction_msgSize);
    }

}
