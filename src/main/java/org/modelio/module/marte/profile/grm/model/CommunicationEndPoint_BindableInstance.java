package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("71ed9e6a-1de0-45ab-bc34-213df007f837")
public class CommunicationEndPoint_BindableInstance extends Resource_BindableInstance {
    @objid ("3acb5252-1416-4aa9-907a-a11877517f46")
    public CommunicationEndPoint_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMMUNICATIONENDPOINT_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("CommunicationEndPoint_BindableInstance"));
    }

    @objid ("f4f3dd55-0511-4a39-b993-25fe90a89381")
    public CommunicationEndPoint_BindableInstance(final BindableInstance element) {
        super(element);
    }

    @objid ("dd8bfde7-4021-4fa8-a7f2-a8668da2d9f4")
    public String getpacketSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_INSTANCE_COMMUNICATIONENDPOINT_INSTANCE_PACKETSIZE, this.element);
    }

    @objid ("bd3a11a6-7d7e-4594-a93d-d07d26dfccd2")
    public void setpacketSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_INSTANCE_COMMUNICATIONENDPOINT_INSTANCE_PACKETSIZE, value);
    }

}
