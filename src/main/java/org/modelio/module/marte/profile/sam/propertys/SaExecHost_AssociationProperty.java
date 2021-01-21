package org.modelio.module.marte.profile.sam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("19882c58-33cd-476f-81e1-afbd2ca912eb")
public class SaExecHost_AssociationProperty implements IPropertyContent {
    @objid ("8e43a06e-87ce-4df4-8e37-d3ccf304bab5")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATION_SAEXECHOST_ASSOCIATION_ISSCHED, value);
        }
        if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATION_SAEXECHOST_ASSOCIATION_SCHSLACK, value);
        }
        if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATION_SAEXECHOST_ASSOCIATION_SCHEDUTILIZ, value);
        }
        if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATION_SAEXECHOST_ASSOCIATION_ISRSWITCHT, value);
        }
        if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATION_SAEXECHOST_ASSOCIATION_ISRPRIORANGE, value);
        }
    }

    @objid ("0dc336ea-f5eb-4eb4-9a99-514f26ccbe5f")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATION_SAEXECHOST_ASSOCIATION_ISSCHED)
                ,ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATION_SAEXECHOST_ASSOCIATION_ISSCHED, elt));
        
        String value_schSlack = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATION_SAEXECHOST_ASSOCIATION_SCHSLACK, elt);
        if(value_schSlack.equals("")){
            value_schSlack = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATION_SAEXECHOST_ASSOCIATION_SCHSLACK),value_schSlack);
        
        String value_schedUtiliz = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATION_SAEXECHOST_ASSOCIATION_SCHEDUTILIZ, elt);
        if(value_schedUtiliz.equals("")){
            value_schedUtiliz = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATION_SAEXECHOST_ASSOCIATION_SCHEDUTILIZ),value_schedUtiliz);
        
        String value_ISRswitchT = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATION_SAEXECHOST_ASSOCIATION_ISRSWITCHT, elt);
        if(value_ISRswitchT.equals("")){
            value_ISRswitchT = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATION_SAEXECHOST_ASSOCIATION_ISRSWITCHT),value_ISRswitchT);
        
        String value_ISRprioRange = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATION_SAEXECHOST_ASSOCIATION_ISRPRIORANGE, elt);
        if(value_ISRprioRange.equals("")){
            value_ISRprioRange = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATION_SAEXECHOST_ASSOCIATION_ISRPRIORANGE),value_ISRprioRange);
    }

}
