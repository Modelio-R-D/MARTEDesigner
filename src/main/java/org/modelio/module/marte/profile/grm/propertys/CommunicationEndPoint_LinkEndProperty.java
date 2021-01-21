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

@objid ("a4a9bca9-3df9-4a97-a90f-0731c58ba841")
public class CommunicationEndPoint_LinkEndProperty implements IPropertyContent {
    @objid ("ca715d7d-74c6-4a1f-acb9-eab5eb0f703c")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            if(ModelUtils.isInteger(value)) {
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_LINKEND_COMMUNICATIONENDPOINT_LINKEND_PACKETSIZE, value);
            }else{
                new ErrorMessageBox(Display.getDefault().getActiveShell()
                        ,I18nMessageService.getString("Ui.NotInteger", value)
                );
            }
        }
    }

    @objid ("6f8ec5e2-d6e9-49c3-8bf0-5e923253ce61")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Communication End Point
        //
        String value_packetSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_LINKEND_COMMUNICATIONENDPOINT_LINKEND_PACKETSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_LINKEND_COMMUNICATIONENDPOINT_LINKEND_PACKETSIZE),value_packetSize);
    }

}
