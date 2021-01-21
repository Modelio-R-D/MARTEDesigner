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

@objid ("57d3f4a4-91bf-43d0-a215-e6c46f27cef0")
public class Resource_ClassifierProperty implements IPropertyContent {
    @objid ("d90ca0df-f8b9-4cea-a42b-c8aeb4917294")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            if(ModelUtils.isInteger(value)) {
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RESOURCE_CLASSIFIER_RESOURCE_CLASSIFIER_RESMULT, value);
            }else{
                new ErrorMessageBox(Display.getDefault().getActiveShell()
                        ,I18nMessageService.getString("Ui.NotInteger", value)
                        );
            }
        }
        else if(row == 2){
            if (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER))
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RESOURCE_ASSOCIATIONEND_RESOURCE_ASSOCIATIONEND_ISPROTECTED, "true");
            else
                ModelUtils.addBooleanValue(elt, MARTEDesignerTagTypes.RESOURCE_CLASSIFIER_RESOURCE_CLASSIFIER_ISPROTECTED, Boolean.valueOf(value));
        }
        else if(row == 3){
            if (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.SCHEDULABLERESOURCE_CLASSIFIER))
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RESOURCE_ASSOCIATIONEND_RESOURCE_ASSOCIATIONEND_ISPROTECTED, "true");
            else
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RESOURCE_CLASSIFIER_RESOURCE_CLASSIFIER_ISACTIVE, value);
        }
    }

    @objid ("4b1a8f47-4da1-4c86-8ebd-f932501fb374")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        /*
         * resMult tagged value
         */
        String value_resMult = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RESOURCE_CLASSIFIER_RESOURCE_CLASSIFIER_RESMULT, elt);
        if(value_resMult.equals("")){
            value_resMult = "1";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESOURCE_CLASSIFIER_RESOURCE_CLASSIFIER_RESMULT),value_resMult);
        
        /*
         *  isProtected tagged value
         */
        if (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER)) 
            table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESOURCE_CLASSIFIER_RESOURCE_CLASSIFIER_ISPROTECTED),true);
        else
            table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESOURCE_CLASSIFIER_RESOURCE_CLASSIFIER_ISPROTECTED),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_CLASSIFIER_RESOURCE_CLASSIFIER_ISPROTECTED, elt));
        
        /*
         * isActive tagged value
         */
        if (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.SCHEDULABLERESOURCE_CLASSIFIER)) 
            table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESOURCE_CLASSIFIER_RESOURCE_CLASSIFIER_ISACTIVE),true);
        else
            table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESOURCE_CLASSIFIER_RESOURCE_CLASSIFIER_ISACTIVE),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_CLASSIFIER_RESOURCE_CLASSIFIER_ISACTIVE, elt));
    }

}
