package org.modelio.module.marte.profile.sam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("90d91711-7eff-4290-b83c-0c7a8b626656")
public class SaExecHost_ClassifierProperty implements IPropertyContent {
    @objid ("100465dc-b573-4400-b161-c14d6ba21faa")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAEXECHOST_CLASSIFIER_SAEXECHOST_CLASSIFIER_ISSCHED, value);
        }
        if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAEXECHOST_CLASSIFIER_SAEXECHOST_CLASSIFIER_SCHSLACK, value);
        }
        if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAEXECHOST_CLASSIFIER_SAEXECHOST_CLASSIFIER_SCHEDUTILIZ, value);
        }
        if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAEXECHOST_CLASSIFIER_SAEXECHOST_CLASSIFIER_ISRSWITCHT, value);
        }
        if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAEXECHOST_CLASSIFIER_SAEXECHOST_CLASSIFIER_ISRPRIORANGE, value);
        }
    }

    @objid ("f3188d4d-0f68-4cad-8c5a-8112e1fa555f")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAEXECHOST_CLASSIFIER_SAEXECHOST_CLASSIFIER_ISSCHED)
                ,ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_CLASSIFIER_SAEXECHOST_CLASSIFIER_ISSCHED, elt));
        
        String value_schSlack = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_CLASSIFIER_SAEXECHOST_CLASSIFIER_SCHSLACK, elt);
        if(value_schSlack.equals("")){
            value_schSlack = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAEXECHOST_CLASSIFIER_SAEXECHOST_CLASSIFIER_SCHSLACK),value_schSlack);
        
        String value_schedUtiliz = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_CLASSIFIER_SAEXECHOST_CLASSIFIER_SCHEDUTILIZ, elt);
        if(value_schedUtiliz.equals("")){
            value_schedUtiliz = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAEXECHOST_CLASSIFIER_SAEXECHOST_CLASSIFIER_SCHEDUTILIZ),value_schedUtiliz);
        
        String value_ISRswitchT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_CLASSIFIER_SAEXECHOST_CLASSIFIER_ISRSWITCHT, elt);
        if(value_ISRswitchT.equals("")){
            value_ISRswitchT = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAEXECHOST_CLASSIFIER_SAEXECHOST_CLASSIFIER_ISRSWITCHT),value_ISRswitchT);
        
        String value_ISRprioRange = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_CLASSIFIER_SAEXECHOST_CLASSIFIER_ISRPRIORANGE, elt);
        if(value_ISRprioRange.equals("")){
            value_ISRprioRange = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAEXECHOST_CLASSIFIER_SAEXECHOST_CLASSIFIER_ISRPRIORANGE),value_ISRprioRange);
    }

}
