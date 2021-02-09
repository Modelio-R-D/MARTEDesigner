package org.modelio.module.marte.profile.utils;

import org.modelio.api.modelio.model.IMetamodelExtensions;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;

public class PortUtils {
    public static void setFlowPort(Port port) {
        IMetamodelExtensions extensions = MARTEModule.getInstance().getModuleContext().getModelingSession().getMetamodelExtensions();
        
        if (port.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.FLOWPORT_PORT))
            port.getExtension().remove(ModelUtils.getStereotype(extensions, Port.class, MARTEDesignerStereotypes.FLOWPORT_PORT));
        
        port.getExtension().add(ModelUtils.getStereotype(extensions, Port.class, MARTEDesignerStereotypes.FLOWPORT_PORT));
    }

    public static void setClientServerPort(Port port) {
        IMetamodelExtensions extensions = MARTEModule.getInstance().getModuleContext().getModelingSession().getMetamodelExtensions();
        
        
        if (port.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.CLIENTSERVERPORT_PORT))
            port.getExtension().remove(ModelUtils.getStereotype(extensions, Port.class, MARTEDesignerStereotypes.CLIENTSERVERPORT_PORT));
        
        port.getExtension().add(ModelUtils.getStereotype(extensions, Port.class, MARTEDesignerStereotypes.CLIENTSERVERPORT_PORT));
    }

    public enum FlowDirectionKind {
        in,
        out,
        inout;
    }

    public enum PortSpecificationKind {
        atomic,
        interfaceBased,
        featureBased;
    }

    public enum ClientServerKind {
        required,
        provided,
        proreq;
    }

}
