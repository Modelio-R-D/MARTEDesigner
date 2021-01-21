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

@objid ("15982112-3d0b-4673-93e3-c2cd44efcf47")
public class StorageResource_ClassifierProperty implements IPropertyContent {
    @objid ("a734b689-e9e3-4fbe-80c6-94356de693cd")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            if(ModelUtils.isInteger(value)) {
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.STORAGERESOURCE_CLASSIFIER_STORAGERESOURCE_CLASSIFIER_ELEMENTSIZE, value);
            }else{
                Display.getDefault().asyncExec( new ErrorMessageBox(Display.getDefault().getActiveShell()
                        ,I18nMessageService.getString("Ui.NotInteger", value)
                )
                );
            }
        }
    }

    @objid ("33cb1073-1a16-44df-9d93-d88439896997")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Storage Resource
        //
        String value_elementSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.STORAGERESOURCE_CLASSIFIER_STORAGERESOURCE_CLASSIFIER_ELEMENTSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.STORAGERESOURCE_CLASSIFIER_STORAGERESOURCE_CLASSIFIER_ELEMENTSIZE),value_elementSize);
    }

}
