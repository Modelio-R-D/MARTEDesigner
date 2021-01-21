package org.modelio.module.marte.profile.sam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("53d7b4ac-1d43-465c-b415-ce4bb20a6aab")
public class SaExecHost_AttributeProperty implements IPropertyContent {
    @objid ("d2672dc0-3cef-453e-bbe2-cf4cb7d073a2")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAEXECHOST_ATTRIBUTE_SAEXECHOST_ATTRIBUTE_ISSCHED, value);
        }
        if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAEXECHOST_ATTRIBUTE_SAEXECHOST_ATTRIBUTE_SCHSLACK, value);
        }
        if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAEXECHOST_ATTRIBUTE_SAEXECHOST_ATTRIBUTE_SCHEDUTILIZ, value);
        }
        if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAEXECHOST_ATTRIBUTE_SAEXECHOST_ATTRIBUTE_ISRSWITCHT, value);
        }
        if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAEXECHOST_ATTRIBUTE_SAEXECHOST_ATTRIBUTE_ISRPRIORANGE, value);
        }
    }

    @objid ("903e8607-0959-461f-ba60-31afbaf4a005")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAEXECHOST_ATTRIBUTE_SAEXECHOST_ATTRIBUTE_ISSCHED)
                ,ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_ATTRIBUTE_SAEXECHOST_ATTRIBUTE_ISSCHED, elt));
        
        String value_schSlack = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_ATTRIBUTE_SAEXECHOST_ATTRIBUTE_SCHSLACK, elt);
        if(value_schSlack.equals("")){
            value_schSlack = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAEXECHOST_ATTRIBUTE_SAEXECHOST_ATTRIBUTE_SCHSLACK),value_schSlack);
        
        String value_schedUtiliz = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_ATTRIBUTE_SAEXECHOST_ATTRIBUTE_SCHEDUTILIZ, elt);
        if(value_schedUtiliz.equals("")){
            value_schedUtiliz = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAEXECHOST_ATTRIBUTE_SAEXECHOST_ATTRIBUTE_SCHEDUTILIZ),value_schedUtiliz);
        
        String value_ISRswitchT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_ATTRIBUTE_SAEXECHOST_ATTRIBUTE_ISRSWITCHT, elt);
        if(value_ISRswitchT.equals("")){
            value_ISRswitchT = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAEXECHOST_ATTRIBUTE_SAEXECHOST_ATTRIBUTE_ISRSWITCHT),value_ISRswitchT);
        
        String value_ISRprioRange = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_ATTRIBUTE_SAEXECHOST_ATTRIBUTE_ISRPRIORANGE, elt);
        if(value_ISRprioRange.equals("")){
            value_ISRprioRange = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAEXECHOST_ATTRIBUTE_SAEXECHOST_ATTRIBUTE_ISRPRIORANGE),value_ISRprioRange);
    }

}
