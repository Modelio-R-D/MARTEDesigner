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

@objid ("b7f403ad-c9c5-4eb0-8ee9-48315a16635a")
public class Resource_AssociationEndProperty implements IPropertyContent {
    @objid ("8fa38e30-c6be-48db-a974-a4c7d700bdcd")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            if(ModelUtils.isInteger(value)) {
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RESOURCE_ASSOCIATIONEND_RESOURCE_ASSOCIATIONEND_RESMULT, value);
            }else{
                new ErrorMessageBox(Display.getDefault().getActiveShell()
                        ,I18nMessageService.getString("Ui.NotInteger", value)
                        );
            }
        }
        else if(row == 2){ 
            if (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND)) 
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RESOURCE_ASSOCIATIONEND_RESOURCE_ASSOCIATIONEND_ISPROTECTED, "true");
            else
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RESOURCE_ASSOCIATIONEND_RESOURCE_ASSOCIATIONEND_ISPROTECTED, value);
        }
        else if(row == 3){
            if (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.SCHEDULABLERESOURCE_ASSOCIATIONEND))
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RESOURCE_ASSOCIATIONEND_RESOURCE_ASSOCIATIONEND_ISPROTECTED, "true");
            else
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RESOURCE_ASSOCIATIONEND_RESOURCE_ASSOCIATIONEND_ISACTIVE, value);
        }
    }

    @objid ("e45893da-be88-4459-bafd-c00d1c4c2a1a")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Resource
        //
        String value_resMult = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RESOURCE_ASSOCIATIONEND_RESOURCE_ASSOCIATIONEND_RESMULT, elt);
        if(value_resMult.equals("")){
            value_resMult = "1";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESOURCE_ASSOCIATIONEND_RESOURCE_ASSOCIATIONEND_RESMULT),value_resMult);
        
        if (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND)) 
            table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESOURCE_ASSOCIATIONEND_RESOURCE_ASSOCIATIONEND_ISPROTECTED),true);
        else
            table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESOURCE_ASSOCIATIONEND_RESOURCE_ASSOCIATIONEND_ISPROTECTED),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_ASSOCIATIONEND_RESOURCE_ASSOCIATIONEND_ISPROTECTED, elt));
        
        
        if (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.SCHEDULABLERESOURCE_ASSOCIATIONEND)) 
            table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESOURCE_ASSOCIATIONEND_RESOURCE_ASSOCIATIONEND_ISACTIVE),true);
        else
            table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RESOURCE_ASSOCIATIONEND_RESOURCE_ASSOCIATIONEND_ISACTIVE),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_ASSOCIATIONEND_RESOURCE_ASSOCIATIONEND_ISACTIVE, elt));
    }

}
