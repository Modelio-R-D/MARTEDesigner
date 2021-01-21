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

@objid ("3f6eb17c-32c8-4e09-a098-ac7f29f44dc2")
public class Resource_LinkProperty implements IPropertyContent {
    @objid ("a1dd1195-06c3-4119-812a-efda8aa4fd89")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            if(ModelUtils.isInteger(value)) {
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RESOURCE_LINK_RESOURCE_LINK_RESMULT, value);
            }else{
                new ErrorMessageBox(Display.getDefault().getActiveShell()
                        ,I18nMessageService.getString("Ui.NotInteger", value)
                        );
            }
        }
        else if(row == 2){
            if (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_LINK))
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RESOURCE_ASSOCIATIONEND_RESOURCE_ASSOCIATIONEND_ISPROTECTED, "true");
            else
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RESOURCE_LINK_RESOURCE_LINK_ISPROTECTED, value);
        }
        else if(row == 3){
            if (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.SCHEDULABLERESOURCE_LINK))
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RESOURCE_ASSOCIATIONEND_RESOURCE_ASSOCIATIONEND_ISPROTECTED, "true");
            else
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RESOURCE_LINK_RESOURCE_LINK_ISACTIVE, value);
        }
    }

    @objid ("7cf1bd8e-6af0-4b5d-9231-e23b606d3adc")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_resMult = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RESOURCE_LINK_RESOURCE_LINK_RESMULT, elt);
        if(value_resMult.equals("")){
            value_resMult = "1";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESOURCE_LINK_RESOURCE_LINK_RESMULT),value_resMult);
        
        if (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_LINK)) 
            table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESOURCE_LINK_RESOURCE_LINK_ISPROTECTED),true);
        else
            table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESOURCE_LINK_RESOURCE_LINK_ISPROTECTED),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_LINK_RESOURCE_LINK_ISPROTECTED, elt));
        
        if (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.SCHEDULABLERESOURCE_LINK)) 
            table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESOURCE_LINK_RESOURCE_LINK_ISACTIVE),true);
        else
            table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESOURCE_LINK_RESOURCE_LINK_ISACTIVE),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_LINK_RESOURCE_LINK_ISACTIVE, elt));
    }

}
