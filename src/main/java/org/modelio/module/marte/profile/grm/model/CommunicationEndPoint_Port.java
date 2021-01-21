package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("7510137c-b809-4bb6-9e2c-3457c740c05a")
public class CommunicationEndPoint_Port extends Resource_BindableInstance {
    @objid ("4f498c04-3b65-4f99-b842-6afba0206607")
    public CommunicationEndPoint_Port() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createPort());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMMUNICATIONENDPOINT_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("CommunicationEndPoint_Port"));
    }

    @objid ("b4f1357e-998a-4aa6-8f63-af09802e04f4")
    public CommunicationEndPoint_Port(final Port element) {
        super(element);
    }

    @objid ("1d62eb75-082a-4fbd-83f1-e7243773c9f1")
    public String getpacketSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_INSTANCE_COMMUNICATIONENDPOINT_INSTANCE_PACKETSIZE, this.element);
    }

    @objid ("c305bfd7-8075-4081-8348-95ac1ad8164a")
    public void setpacketSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_INSTANCE_COMMUNICATIONENDPOINT_INSTANCE_PACKETSIZE, value);
    }

}
