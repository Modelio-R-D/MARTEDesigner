package org.modelio.module.marte.profile.sam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("062fc051-58ba-4db9-8de4-c01a05bebafb")
public class SaExecHost_ParameterProperty implements IPropertyContent {
    @objid ("51106492-9347-440b-a47b-c32eef3714a3")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAEXECHOST_PARAMETER_SAEXECHOST_PARAMETER_ISSCHED, value);
        }
        if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAEXECHOST_PARAMETER_SAEXECHOST_PARAMETER_SCHSLACK, value);
        }
        if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAEXECHOST_PARAMETER_SAEXECHOST_PARAMETER_SCHEDUTILIZ, value);
        }
        if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAEXECHOST_PARAMETER_SAEXECHOST_PARAMETER_ISRSWITCHT, value);
        }
        if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAEXECHOST_PARAMETER_SAEXECHOST_PARAMETER_ISRPRIORANGE, value);
        }
    }

    @objid ("1720bc88-2665-45f5-8f80-da11db6a3a57")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAEXECHOST_PARAMETER_SAEXECHOST_PARAMETER_ISSCHED)
                ,ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_PARAMETER_SAEXECHOST_PARAMETER_ISSCHED, elt));
        
        String value_schSlack = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_PARAMETER_SAEXECHOST_PARAMETER_SCHSLACK, elt);
        if(value_schSlack.equals("")){
            value_schSlack = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAEXECHOST_PARAMETER_SAEXECHOST_PARAMETER_SCHSLACK),value_schSlack);
        
        String value_schedUtiliz = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_PARAMETER_SAEXECHOST_PARAMETER_SCHEDUTILIZ, elt);
        if(value_schedUtiliz.equals("")){
            value_schedUtiliz = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAEXECHOST_PARAMETER_SAEXECHOST_PARAMETER_SCHEDUTILIZ),value_schedUtiliz);
        
        String value_ISRswitchT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_PARAMETER_SAEXECHOST_PARAMETER_ISRSWITCHT, elt);
        if(value_ISRswitchT.equals("")){
            value_ISRswitchT = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAEXECHOST_PARAMETER_SAEXECHOST_PARAMETER_ISRSWITCHT),value_ISRswitchT);
        
        String value_ISRprioRange = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_PARAMETER_SAEXECHOST_PARAMETER_ISRPRIORANGE, elt);
        if(value_ISRprioRange.equals("")){
            value_ISRprioRange = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAEXECHOST_PARAMETER_SAEXECHOST_PARAMETER_ISRPRIORANGE),value_ISRprioRange);
    }

}
