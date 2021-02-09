package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class CommunicationMedia_BindableInstance extends ProcessingResource_BindableInstance {
    public CommunicationMedia_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMMUNICATIONMEDIA_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("CommunicationMedia_BindableInstance"));
    }

    public CommunicationMedia_BindableInstance(final BindableInstance element) {
        super(element);
    }

    public String getelementSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_INSTANCE_COMMUNICATIONMEDIA_INSTANCE_ELEMENTSIZE, this.element);
    }

    public void setelementSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_INSTANCE_COMMUNICATIONMEDIA_INSTANCE_ELEMENTSIZE, value);
    }

    public String gettransmMode() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_INSTANCE_COMMUNICATIONMEDIA_INSTANCE_TRANSMMODE, this.element);
    }

    public void settransmMode(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_INSTANCE_COMMUNICATIONMEDIA_INSTANCE_TRANSMMODE, value);
    }

    public String getblockT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_INSTANCE_COMMUNICATIONMEDIA_INSTANCE_BLOCKT, this.element);
    }

    public void setblockT(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_INSTANCE_COMMUNICATIONMEDIA_INSTANCE_BLOCKT, value);
    }

    public String getpacketT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_INSTANCE_COMMUNICATIONMEDIA_INSTANCE_PACKETT, this.element);
    }

    public void setpacketT(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_INSTANCE_COMMUNICATIONMEDIA_INSTANCE_PACKETT, value);
    }

    public String getcapacity() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_INSTANCE_COMMUNICATIONMEDIA_INSTANCE_CAPACITY, this.element);
    }

    public void setcapacity(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_INSTANCE_COMMUNICATIONMEDIA_INSTANCE_CAPACITY, value);
    }

}
