package org.modelio.module.marte.profile.grm.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.i18n.I18nMessageService;
import org.modelio.module.marte.profile.editors.ErrorMessageBox;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("f7bae8ee-589a-4141-8201-26c39e74235d")
public class StorageResource_AssociationEndProperty implements IPropertyContent {
    @objid ("8290377d-1e21-43aa-8bb3-40ca599775e7")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
             if(ModelUtils.isInteger(value)) {
                 ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.STORAGERESOURCE_ASSOCIATIONEND_STORAGERESOURCE_ASSOCIATIONEND_ELEMENTSIZE, value);
             }else{
                 new ErrorMessageBox(Display.getDefault().getActiveShell()
                         ,I18nMessageService.getString("Ui.NotInteger", value)
                 );
             }
        }
    }

    @objid ("c9f55dc0-f480-45ef-bd00-8d7cf43fe066")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Storage Resource
        //
        String value_elementSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.STORAGERESOURCE_ASSOCIATIONEND_STORAGERESOURCE_ASSOCIATIONEND_ELEMENTSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.STORAGERESOURCE_ASSOCIATIONEND_STORAGERESOURCE_ASSOCIATIONEND_ELEMENTSIZE),value_elementSize);
    }

}
