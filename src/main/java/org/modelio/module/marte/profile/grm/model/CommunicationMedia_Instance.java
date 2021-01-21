package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("43cb62fa-9aa5-4690-a487-e76cb674d8ec")
public class CommunicationMedia_Instance extends ConcurrencyResource_Instance {
    @objid ("e6c819f2-e2fa-440d-95db-5fd4ef96b5e3")
    public CommunicationMedia_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMMUNICATIONMEDIA_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("CommunicationMedia_Instance"));
    }

    @objid ("682248cb-7c97-408b-92cd-ccca92873fea")
    public CommunicationMedia_Instance(final Instance element) {
        super(element);
    }

    @objid ("95ed59e5-eafd-4e02-8874-d2ab18142d2e")
    public String getelementSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_INSTANCE_COMMUNICATIONMEDIA_INSTANCE_ELEMENTSIZE, this.element);
    }

    @objid ("60646308-8c58-4c19-a444-88c8fffa0497")
    public void setelementSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_INSTANCE_COMMUNICATIONMEDIA_INSTANCE_ELEMENTSIZE, value);
    }

    @objid ("a1b60dd5-3334-4437-954a-cd8a4b4f7316")
    public String gettransmMode() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_INSTANCE_COMMUNICATIONMEDIA_INSTANCE_TRANSMMODE, this.element);
    }

    @objid ("8ed5e567-3879-4cae-a2d6-7fe367edeb54")
    public void settransmMode(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_INSTANCE_COMMUNICATIONMEDIA_INSTANCE_TRANSMMODE, value);
    }

    @objid ("84881e85-776c-42ca-80ef-6ba029ca6139")
    public String getblockT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_INSTANCE_COMMUNICATIONMEDIA_INSTANCE_BLOCKT, this.element);
    }

    @objid ("c95656e4-4dda-48d9-bdb3-71118a113e33")
    public void setblockT(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_INSTANCE_COMMUNICATIONMEDIA_INSTANCE_BLOCKT, value);
    }

    @objid ("0d675908-6031-48cc-95bc-1b50e9691bdf")
    public String getpacketT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_INSTANCE_COMMUNICATIONMEDIA_INSTANCE_PACKETT, this.element);
    }

    @objid ("e15f37ff-0149-4a33-b52b-ac8168e50e9b")
    public void setpacketT(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_INSTANCE_COMMUNICATIONMEDIA_INSTANCE_PACKETT, value);
    }

    @objid ("899c22ce-dd14-4ad7-b529-0e2144175e5c")
    public String getcapacity() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_INSTANCE_COMMUNICATIONMEDIA_INSTANCE_CAPACITY, this.element);
    }

    @objid ("61a45e71-e37b-4159-b60b-aeb8ceda489b")
    public void setcapacity(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_INSTANCE_COMMUNICATIONMEDIA_INSTANCE_CAPACITY, value);
    }

}
