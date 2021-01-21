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

@objid ("10ec5a21-48f0-420a-b20d-8da0e9e3db6f")
public class CommunicationEndPoint_AssociationEndProperty implements IPropertyContent {
    @objid ("f1dabed5-194e-44f1-bf95-d2ba56d05329")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
             if(ModelUtils.isInteger(value)) {
                 ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_ASSOCIATIONEND_COMMUNICATIONENDPOINT_ASSOCIATIONEND_PACKETSIZE, value);
             }else{
                 new ErrorMessageBox(Display.getDefault().getActiveShell()
                         ,I18nMessageService.getString("Ui.NotInteger", value)
                 );
             }
        }
    }

    @objid ("1fa7c2d9-faa9-462d-950f-45ee0da9def9")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Communication End Point
        //
        String value_packetSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_ASSOCIATIONEND_COMMUNICATIONENDPOINT_ASSOCIATIONEND_PACKETSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_ASSOCIATIONEND_COMMUNICATIONENDPOINT_ASSOCIATIONEND_PACKETSIZE),value_packetSize);
    }

}
