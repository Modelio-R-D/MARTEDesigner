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

@objid ("de5df61e-fd1a-4967-8fc3-3a10ed4ee2d1")
public class StorageResource_AssociationProperty implements IPropertyContent {
    @objid ("ac4f062b-c63f-4d2c-85cc-1b2422f713ed")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            if(ModelUtils.isInteger(value)) {
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.STORAGERESOURCE_ASSOCIATION_STORAGERESOURCE_ASSOCIATION_ELEMENTSIZE, value);
            }else{
                new ErrorMessageBox(Display.getDefault().getActiveShell()
                        ,I18nMessageService.getString("Ui.NotInteger", value)
                );
            }
        }
    }

    @objid ("5571549e-d9e5-42fc-86bc-aa37bc8f1183")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Storage Resource
        //
        String value_elementSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.STORAGERESOURCE_ASSOCIATION_STORAGERESOURCE_ASSOCIATION_ELEMENTSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.STORAGERESOURCE_ASSOCIATION_STORAGERESOURCE_ASSOCIATION_ELEMENTSIZE),value_elementSize);
    }

}
