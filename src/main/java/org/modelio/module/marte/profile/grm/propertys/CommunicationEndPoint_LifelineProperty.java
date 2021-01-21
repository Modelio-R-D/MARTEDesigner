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

@objid ("7791fcf2-1691-4e7f-b8c8-634cafb52061")
public class CommunicationEndPoint_LifelineProperty implements IPropertyContent {
    @objid ("8b338080-ae28-4e8a-aba5-abc15a8d2c3a")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            if(ModelUtils.isInteger(value)) {
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_LIFELINE_COMMUNICATIONENDPOINT_LIFELINE_PACKETSIZE, value);
            }else{
                new ErrorMessageBox(Display.getDefault().getActiveShell()
                        ,I18nMessageService.getString("Ui.NotInteger", value)
                );
            }
        }
    }

    @objid ("01b1b5c0-dfa5-4b77-aa31-97c5ff2583f4")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Communication End Point
        //
        String value_packetSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_LIFELINE_COMMUNICATIONENDPOINT_LIFELINE_PACKETSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_LIFELINE_COMMUNICATIONENDPOINT_LIFELINE_PACKETSIZE),value_packetSize);
    }

}
