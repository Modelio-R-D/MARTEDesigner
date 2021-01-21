package org.modelio.module.marte.profile.gcm.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.PortOrientation;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("36497b6e-3b39-48a1-a066-74423370988e")
public class FlowPort_PortProperty implements IPropertyContent {
    @objid ("9b96c079-0c09-4d4b-a45d-eb930a282095")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.FLOWPORT_PORT_FLOWPORT_PORT_ISATOMIC, value);
        }
        if(row == 2){
          
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.FLOWPORT_PORT_FLOWPORT_PORT_DIRECTION, value);
            Port port = (Port) elt;
            switch (value) {
            case "out":
                port.setDirection(PortOrientation.OUT);
                break;
            case "inout":
                port.setDirection(PortOrientation.INOUT);
                break;
            case "in":
                port.setDirection(PortOrientation.IN);
                break;
        
            default:
                port.setDirection(PortOrientation.NONE);
                break;
            }
        }
    }

    @objid ("5b76e5a2-c6dc-49bb-9a88-a9af320b8c02")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.FLOWPORT_PORT_FLOWPORT_PORT_ISATOMIC),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.FLOWPORT_PORT_FLOWPORT_PORT_ISATOMIC, elt));
        
               
        String[] tabDirection =  MARTEEnumerationUtils.getFlowDirectionKind();
        String value_direction = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.FLOWPORT_PORT_FLOWPORT_PORT_DIRECTION, elt);
        if (!(MARTEEnumerationUtils.isFlowDirectionKind(value_direction)))
            value_direction = "inout";
            
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.FLOWPORT_PORT_FLOWPORT_PORT_DIRECTION),value_direction, tabDirection);
    }

}
