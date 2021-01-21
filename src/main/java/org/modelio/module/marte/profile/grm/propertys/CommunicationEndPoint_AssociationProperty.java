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

@objid ("814a350f-eed1-4f2e-89d0-8cc07808e92e")
public class CommunicationEndPoint_AssociationProperty implements IPropertyContent {
    @objid ("1031416c-a713-481f-9830-5db3d56b4974")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){          
            if(ModelUtils.isInteger(value)) {
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_ASSOCIATION_COMMUNICATIONENDPOINT_ASSOCIATION_PACKETSIZE, value);
            }else{
                new ErrorMessageBox(Display.getDefault().getActiveShell()
                        ,I18nMessageService.getString("Ui.NotInteger", value)
                );
            }
        }
    }

    @objid ("d46124aa-9859-440d-9f7b-b877929f208f")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Communication End Point
        //
        String value_packetSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_ASSOCIATION_COMMUNICATIONENDPOINT_ASSOCIATION_PACKETSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_ASSOCIATION_COMMUNICATIONENDPOINT_ASSOCIATION_PACKETSIZE),value_packetSize);
    }

}