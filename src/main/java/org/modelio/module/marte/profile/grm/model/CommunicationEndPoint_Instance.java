package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class CommunicationEndPoint_Instance extends Resource_Instance {
    public CommunicationEndPoint_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMMUNICATIONENDPOINT_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("CommunicationEndPoint_Instance"));
    }

    public CommunicationEndPoint_Instance(final Instance element) {
        super(element);
    }

    public String getpacketSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_INSTANCE_COMMUNICATIONENDPOINT_INSTANCE_PACKETSIZE, this.element);
    }

    public void setpacketSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_INSTANCE_COMMUNICATIONENDPOINT_INSTANCE_PACKETSIZE, value);
    }

}
