package org.modelio.module.marte.profile.utils;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IMetamodelExtensions;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;

@objid ("f6fa2b9d-c51d-44d6-af97-976ce5807168")
public class PortUtils {
    @objid ("9197f917-271c-43e7-bda7-554be1b6f601")
    public static void setFlowPort(Port port) {
        IMetamodelExtensions extensions = MARTEModule.getInstance().getModuleContext().getModelingSession().getMetamodelExtensions();
        
        if (port.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.FLOWPORT_PORT))
            port.getExtension().remove(ModelUtils.getStereotype(extensions, Port.class, MARTEDesignerStereotypes.FLOWPORT_PORT));
        
        port.getExtension().add(ModelUtils.getStereotype(extensions, Port.class, MARTEDesignerStereotypes.FLOWPORT_PORT));
    }

    @objid ("e345502c-bee3-4de4-99be-bf0bd387b925")
    public static void setClientServerPort(Port port) {
        IMetamodelExtensions extensions = MARTEModule.getInstance().getModuleContext().getModelingSession().getMetamodelExtensions();
        
        
        if (port.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.CLIENTSERVERPORT_PORT))
            port.getExtension().remove(ModelUtils.getStereotype(extensions, Port.class, MARTEDesignerStereotypes.CLIENTSERVERPORT_PORT));
        
        port.getExtension().add(ModelUtils.getStereotype(extensions, Port.class, MARTEDesignerStereotypes.CLIENTSERVERPORT_PORT));
    }

    @objid ("9cf21dc2-b7df-40a6-8d7b-4e17c3603e78")
    public enum FlowDirectionKind {
        in,
        out,
        inout;
    }

    @objid ("390e1715-4a23-47f3-8a8c-c0117aa703ef")
    public enum PortSpecificationKind {
        atomic,
        interfaceBased,
        featureBased;
    }

    @objid ("fc44d6ce-5bfc-41bd-b9e1-64a51d58b49d")
    public enum ClientServerKind {
        required,
        provided,
        proreq;
    }

}
