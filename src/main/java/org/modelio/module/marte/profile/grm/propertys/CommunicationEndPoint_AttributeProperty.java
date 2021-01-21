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

@objid ("75a965a6-703e-4fce-af12-72722610df2a")
public class CommunicationEndPoint_AttributeProperty implements IPropertyContent {
    @objid ("f0409acd-0a84-4fb1-8abe-925cd2d0ae17")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            if(ModelUtils.isInteger(value)) {
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_ATTRIBUTE_COMMUNICATIONENDPOINT_ATTRIBUTE_PACKETSIZE, value);
            }else{
                new ErrorMessageBox(Display.getDefault().getActiveShell()
                        ,I18nMessageService.getString("Ui.NotInteger", value)
                );
            }
        }
    }

    @objid ("f8f7a657-55d4-4ae6-8f15-f3b182c6ccb5")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Communication End Point
        //
        String value_packetSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_ATTRIBUTE_COMMUNICATIONENDPOINT_ATTRIBUTE_PACKETSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_ATTRIBUTE_COMMUNICATIONENDPOINT_ATTRIBUTE_PACKETSIZE),value_packetSize);
    }

}
