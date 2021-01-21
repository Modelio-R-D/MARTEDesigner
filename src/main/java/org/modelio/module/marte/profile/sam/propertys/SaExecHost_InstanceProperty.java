package org.modelio.module.marte.profile.sam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("fc58bb1d-8773-483d-9d42-db451846bf83")
public class SaExecHost_InstanceProperty implements IPropertyContent {
    @objid ("5ef1af7d-53e3-43cb-be82-8b3bcddc75da")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAEXECHOST_INSTANCE_SAEXECHOST_INSTANCE_ISSCHED, value);
        }
        if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAEXECHOST_INSTANCE_SAEXECHOST_INSTANCE_SCHSLACK, value);
        }
        if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAEXECHOST_INSTANCE_SAEXECHOST_INSTANCE_SCHEDUTILIZ, value);
        }
        if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAEXECHOST_INSTANCE_SAEXECHOST_INSTANCE_ISRSWITCHT, value);
        }
        if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAEXECHOST_INSTANCE_SAEXECHOST_INSTANCE_ISRPRIORANGE, value);
        }
    }

    @objid ("0b6d8e12-b4ff-42b5-afa5-3522853a7c6d")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAEXECHOST_INSTANCE_SAEXECHOST_INSTANCE_ISSCHED)
                ,ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_INSTANCE_SAEXECHOST_INSTANCE_ISSCHED, elt));
        
        String value_schSlack = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_INSTANCE_SAEXECHOST_INSTANCE_SCHSLACK, elt);
        if(value_schSlack.equals("")){
            value_schSlack = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAEXECHOST_INSTANCE_SAEXECHOST_INSTANCE_SCHSLACK),value_schSlack);
        
        String value_schedUtiliz = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_INSTANCE_SAEXECHOST_INSTANCE_SCHEDUTILIZ, elt);
        if(value_schedUtiliz.equals("")){
            value_schedUtiliz = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAEXECHOST_INSTANCE_SAEXECHOST_INSTANCE_SCHEDUTILIZ),value_schedUtiliz);
        
        String value_ISRswitchT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_INSTANCE_SAEXECHOST_INSTANCE_ISRSWITCHT, elt);
        if(value_ISRswitchT.equals("")){
            value_ISRswitchT = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAEXECHOST_INSTANCE_SAEXECHOST_INSTANCE_ISRSWITCHT),value_ISRswitchT);
        
        String value_ISRprioRange = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_INSTANCE_SAEXECHOST_INSTANCE_ISRPRIORANGE, elt);
        if(value_ISRprioRange.equals("")){
            value_ISRprioRange = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAEXECHOST_INSTANCE_SAEXECHOST_INSTANCE_ISRPRIORANGE),value_ISRprioRange);
    }

}
