package org.modelio.module.marte.profile.grm.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.i18n.I18nMessageService;
import org.modelio.module.marte.profile.editors.ErrorMessageBox;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("6539015f-a893-459b-be5a-e1e00ad41199")
public class Resource_LifelineProperty implements IPropertyContent {
    @objid ("7c9c1b1d-ece0-48a4-a0d7-33c37195a449")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            if(ModelUtils.isInteger(value)) {
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RESOURCE_LIFELINE_RESOURCE_LIFELINE_RESMULT, value);
            }else{
                new ErrorMessageBox(Display.getDefault().getActiveShell()
                        ,I18nMessageService.getString("Ui.NotInteger", value)
                        );
            }
        }
        else if(row == 2){
            if (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_LIFELINE))
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RESOURCE_ASSOCIATIONEND_RESOURCE_ASSOCIATIONEND_ISPROTECTED, "true");
            else
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RESOURCE_LIFELINE_RESOURCE_LIFELINE_ISPROTECTED, value);
        }
        else if(row == 3){
            if (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.SCHEDULABLERESOURCE_LIFELINE))
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RESOURCE_ASSOCIATIONEND_RESOURCE_ASSOCIATIONEND_ISPROTECTED, "true");
            else
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RESOURCE_LIFELINE_RESOURCE_LIFELINE_ISACTIVE, value);
        }
    }

    @objid ("36af3311-f9a1-4521-9403-78ab3419a71e")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_resMult = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RESOURCE_LIFELINE_RESOURCE_LIFELINE_RESMULT, elt);
        if(value_resMult.equals("")){
            value_resMult = "1";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESOURCE_LIFELINE_RESOURCE_LIFELINE_RESMULT),value_resMult);
        
        if (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_LIFELINE)) 
            table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESOURCE_LIFELINE_RESOURCE_LIFELINE_ISPROTECTED),true);
        else
            table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESOURCE_LIFELINE_RESOURCE_LIFELINE_ISPROTECTED),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_LIFELINE_RESOURCE_LIFELINE_ISPROTECTED, elt));
        
        if (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.SCHEDULABLERESOURCE_LIFELINE)) 
            table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESOURCE_LIFELINE_RESOURCE_LIFELINE_ISACTIVE),true);
        else
            table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESOURCE_LIFELINE_RESOURCE_LIFELINE_ISACTIVE),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_LIFELINE_RESOURCE_LIFELINE_ISACTIVE, elt));
    }

}
