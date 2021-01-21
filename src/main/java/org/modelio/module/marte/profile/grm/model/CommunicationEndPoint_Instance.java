package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("a19a0e37-7d9e-4493-9a3e-1273278c8785")
public class CommunicationEndPoint_Instance extends Resource_Instance {
    @objid ("6611a71a-0637-4bdd-b4b7-d4995e7aac04")
    public CommunicationEndPoint_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMMUNICATIONENDPOINT_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("CommunicationEndPoint_Instance"));
    }

    @objid ("6ba20c44-8397-4161-ab57-894096bc7e5a")
    public CommunicationEndPoint_Instance(final Instance element) {
        super(element);
    }

    @objid ("a91c622c-c55c-4db7-ae15-5f0998adbbfa")
    public String getpacketSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_INSTANCE_COMMUNICATIONENDPOINT_INSTANCE_PACKETSIZE, this.element);
    }

    @objid ("ac9f6710-a70e-471a-85ed-5d4e29ae1927")
    public void setpacketSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_INSTANCE_COMMUNICATIONENDPOINT_INSTANCE_PACKETSIZE, value);
    }

}
