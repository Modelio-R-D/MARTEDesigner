package org.modelio.module.marte.profile.gcm.propertys;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.PortOrientation;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class FlowPort_PortProperty implements IPropertyContent {
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
