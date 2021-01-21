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

@objid ("98219088-573b-4321-a8af-065322b6c871")
public class StorageResource_InstanceProperty implements IPropertyContent {
    @objid ("ada114d4-5ddd-474d-a8b0-f51a9b08fa6a")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            if(ModelUtils.isInteger(value)) {
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.STORAGERESOURCE_INSTANCE_STORAGERESOURCE_INSTANCE_ELEMENTSIZE, value);
            }else{
                new ErrorMessageBox(Display.getDefault().getActiveShell()
                        ,I18nMessageService.getString("Ui.NotInteger", value)
                );
            }
        }
    }

    @objid ("7af8685d-8658-4346-b164-57a812d51405")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Storage Resource
        //
        String value_elementSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.STORAGERESOURCE_INSTANCE_STORAGERESOURCE_INSTANCE_ELEMENTSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.STORAGERESOURCE_INSTANCE_STORAGERESOURCE_INSTANCE_ELEMENTSIZE),value_elementSize);
    }

}
