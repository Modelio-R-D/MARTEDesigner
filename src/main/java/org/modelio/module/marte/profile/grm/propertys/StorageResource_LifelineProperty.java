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

@objid ("ed3628ad-1845-40a7-a8a0-b56f5bd9fb94")
public class StorageResource_LifelineProperty implements IPropertyContent {
    @objid ("4ac4d48a-293c-40a5-a3de-1e66b7506c52")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            if(ModelUtils.isInteger(value)) {
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.STORAGERESOURCE_LIFELINE_STORAGERESOURCE_LIFELINE_ELEMENTSIZE, value);
            }else{
                new ErrorMessageBox(Display.getDefault().getActiveShell()
                        ,I18nMessageService.getString("Ui.NotInteger", value)
                );
            }
        }
    }

    @objid ("048654bb-0f65-4e6c-9461-ce7c784c604e")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Storage Resource
        //
        String value_elementSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.STORAGERESOURCE_LIFELINE_STORAGERESOURCE_LIFELINE_ELEMENTSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.STORAGERESOURCE_LIFELINE_STORAGERESOURCE_LIFELINE_ELEMENTSIZE),value_elementSize);
    }

}
