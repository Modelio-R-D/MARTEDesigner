package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.CommunicationEndPoint_Instance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("5467c24f-2ca7-45cb-998f-25012132f0c6")
public class HwEndPoint_Port extends CommunicationEndPoint_Instance {
    @objid ("4b8d15ee-4d8e-47c3-90ce-87ded0c3506f")
    public HwEndPoint_Port() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createPort());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWENDPOINT_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwEndPoint_Port"));
    }

    @objid ("46576e1a-e8b0-4387-b80b-982a5baa7480")
    public HwEndPoint_Port(Port element) {
        super(element);
    }

    @objid ("76b842b2-52b9-4a9b-aeeb-5de210dcd950")
    public String getconnectedTo() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWENDPOINT_INSTANCE_HWENDPOINT_INSTANCE_CONNECTEDTO, this.element);
    }

    @objid ("8c02094a-9510-40b8-836f-8c84c6650d66")
    public void setconnectedTo(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWENDPOINT_INSTANCE_HWENDPOINT_INSTANCE_CONNECTEDTO, value);
    }

}
