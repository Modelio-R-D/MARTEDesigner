package org.modelio.module.marte.profile.sam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("893edc26-94f0-4b4e-9428-825c7b74d51a")
public class SaExecHost_AssociationEndProperty implements IPropertyContent {
    @objid ("f3e0fb87-0896-4669-9602-e75d551d5d9b")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATIONEND_SAEXECHOST_ASSOCIATIONEND_ISSCHED, value);
        }
        if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATIONEND_SAEXECHOST_ASSOCIATIONEND_SCHSLACK, value);
        }
        if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATIONEND_SAEXECHOST_ASSOCIATIONEND_SCHEDUTILIZ, value);
        }
        if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATIONEND_SAEXECHOST_ASSOCIATIONEND_ISRSWITCHT, value);
        }
        if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATIONEND_SAEXECHOST_ASSOCIATIONEND_ISRPRIORANGE, value);
        }
    }

    @objid ("09c8e522-4f5d-4331-bb15-605aa5842e15")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATIONEND_SAEXECHOST_ASSOCIATIONEND_ISSCHED)
                ,ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATIONEND_SAEXECHOST_ASSOCIATIONEND_ISSCHED, elt));
        
        String value_schSlack = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATIONEND_SAEXECHOST_ASSOCIATIONEND_SCHSLACK, elt);
        if(value_schSlack.equals("")){
            value_schSlack = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATIONEND_SAEXECHOST_ASSOCIATIONEND_SCHSLACK),value_schSlack);
        
        String value_schedUtiliz = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATIONEND_SAEXECHOST_ASSOCIATIONEND_SCHEDUTILIZ, elt);
        if(value_schedUtiliz.equals("")){
            value_schedUtiliz = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATIONEND_SAEXECHOST_ASSOCIATIONEND_SCHEDUTILIZ),value_schedUtiliz);
        
        String value_ISRswitchT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATIONEND_SAEXECHOST_ASSOCIATIONEND_ISRSWITCHT, elt);
        if(value_ISRswitchT.equals("")){
            value_ISRswitchT = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATIONEND_SAEXECHOST_ASSOCIATIONEND_ISRSWITCHT),value_ISRswitchT);
        
        String value_ISRprioRange = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATIONEND_SAEXECHOST_ASSOCIATIONEND_ISRPRIORANGE, elt);
        if(value_ISRprioRange.equals("")){
            value_ISRprioRange = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATIONEND_SAEXECHOST_ASSOCIATIONEND_ISRPRIORANGE),value_ISRprioRange);
    }

}
