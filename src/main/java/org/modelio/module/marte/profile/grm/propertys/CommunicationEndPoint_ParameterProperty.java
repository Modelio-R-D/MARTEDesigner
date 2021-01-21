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

@objid ("132b39ad-af2b-4bae-934b-1162526aac29")
public class CommunicationEndPoint_ParameterProperty implements IPropertyContent {
    @objid ("d88900b1-1ae9-4459-871d-331518b854d9")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            if(ModelUtils.isInteger(value)) {
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_PARAMETER_COMMUNICATIONENDPOINT_PARAMETER_PACKETSIZE, value);
            }else{
                new ErrorMessageBox(Display.getDefault().getActiveShell()
                        ,I18nMessageService.getString("Ui.NotInteger", value)
                );
            }
        }
    }

    @objid ("3fd907a9-641c-4bfe-8652-f27c0dff0a93")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Communication End Point
        //
        String value_packetSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_PARAMETER_COMMUNICATIONENDPOINT_PARAMETER_PACKETSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_PARAMETER_COMMUNICATIONENDPOINT_PARAMETER_PACKETSIZE),value_packetSize);
    }

}
