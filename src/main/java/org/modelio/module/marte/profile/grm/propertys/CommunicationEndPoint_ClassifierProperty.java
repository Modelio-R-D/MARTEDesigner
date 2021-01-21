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

@objid ("7a5f1efc-b8e2-4352-8b2c-562215f1aeb1")
public class CommunicationEndPoint_ClassifierProperty implements IPropertyContent {
    @objid ("4437926b-28aa-492b-b8a3-006e66e71b56")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            if(ModelUtils.isInteger(value)) {
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_CLASSIFIER_COMMUNICATIONENDPOINT_CLASSIFIER_PACKETSIZE, value);
            }else{
                new ErrorMessageBox(Display.getDefault().getActiveShell()
                        ,I18nMessageService.getString("Ui.NotInteger", value)
                );
            }
        }
    }

    @objid ("430b538a-bd71-4526-9949-dc644241a181")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Communication End Point
        //
        String value_packetSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_CLASSIFIER_COMMUNICATIONENDPOINT_CLASSIFIER_PACKETSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_CLASSIFIER_COMMUNICATIONENDPOINT_CLASSIFIER_PACKETSIZE),value_packetSize);
    }

}
