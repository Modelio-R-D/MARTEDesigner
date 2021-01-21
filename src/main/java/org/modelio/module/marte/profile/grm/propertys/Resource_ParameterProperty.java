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

@objid ("2f0a1b47-a669-4b78-ab41-6c63f8059f86")
public class Resource_ParameterProperty implements IPropertyContent {
    @objid ("ec545d22-668a-4eec-a509-a7c0c55978b9")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            if(ModelUtils.isInteger(value)) {
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RESOURCE_PARAMETER_RESOURCE_PARAMETER_RESMULT, value);
            }else{
                new ErrorMessageBox(Display.getDefault().getActiveShell()
                        ,I18nMessageService.getString("Ui.NotInteger", value)
                        );
            }
        }
        else if(row == 2){
            if (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_PARAMETER))
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RESOURCE_ASSOCIATIONEND_RESOURCE_ASSOCIATIONEND_ISPROTECTED, "true");
            else
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RESOURCE_PARAMETER_RESOURCE_PARAMETER_ISPROTECTED, value);
        }
        else if(row == 3){
            if (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.SCHEDULABLERESOURCE_PARAMETER))
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RESOURCE_ASSOCIATIONEND_RESOURCE_ASSOCIATIONEND_ISPROTECTED, "true");
            else
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RESOURCE_PARAMETER_RESOURCE_PARAMETER_ISACTIVE, value);
        }
    }

    @objid ("d10e7c4f-a5c3-4925-8767-56beede9835c")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_resMult = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RESOURCE_PARAMETER_RESOURCE_PARAMETER_RESMULT, elt);
        if(value_resMult.equals("")){
            value_resMult = "1";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESOURCE_PARAMETER_RESOURCE_PARAMETER_RESMULT),value_resMult);
        
        if (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_PARAMETER)) 
            table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESOURCE_PARAMETER_RESOURCE_PARAMETER_ISPROTECTED),true);
        else
            table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESOURCE_PARAMETER_RESOURCE_PARAMETER_ISPROTECTED),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_PARAMETER_RESOURCE_PARAMETER_ISPROTECTED, elt));
        
        if (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.SCHEDULABLERESOURCE_PARAMETER)) 
            table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESOURCE_PARAMETER_RESOURCE_PARAMETER_ISACTIVE),true);
        else
            table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESOURCE_PARAMETER_RESOURCE_PARAMETER_ISACTIVE),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_PARAMETER_RESOURCE_PARAMETER_ISACTIVE, elt));
    }

}
