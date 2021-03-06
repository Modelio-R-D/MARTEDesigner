package org.modelio.module.marte.profile.grm.propertys;

import org.eclipse.swt.widgets.Display;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.i18n.I18nMessageService;
import org.modelio.module.marte.profile.editors.ErrorMessageBox;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Resource_LinkEndProperty implements IPropertyContent {
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            if(ModelUtils.isInteger(value)) {
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RESOURCE_LINKEND_RESOURCE_LINKEND_RESMULT, value);
            }else{
                new ErrorMessageBox(Display.getDefault().getActiveShell()
                        ,I18nMessageService.getString("Ui.NotInteger", value)
                        );
            }
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RESOURCE_LINKEND_RESOURCE_LINKEND_ISPROTECTED, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RESOURCE_LINKEND_RESOURCE_LINKEND_ISACTIVE, value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_resMult = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RESOURCE_LINKEND_RESOURCE_LINKEND_RESMULT, elt);
        if(value_resMult.equals("")){
            value_resMult = "1";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESOURCE_LINKEND_RESOURCE_LINKEND_RESMULT),value_resMult);
        
              
            table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESOURCE_LINKEND_RESOURCE_LINKEND_ISPROTECTED),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_LINK_RESOURCE_LINK_ISPROTECTED, elt));
        
              
            table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESOURCE_LINKEND_RESOURCE_LINKEND_ISACTIVE),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_LINK_RESOURCE_LINK_ISACTIVE, elt));
    }

}
