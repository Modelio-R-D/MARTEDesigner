package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("be66b224-acf6-4404-97d0-283c4ab2abf2")
public class CommunicationMedia_BindableInstance extends ProcessingResource_BindableInstance {
    @objid ("2c6b41a7-115e-46c7-ae66-7705f9382ef2")
    public CommunicationMedia_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMMUNICATIONMEDIA_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("CommunicationMedia_BindableInstance"));
    }

    @objid ("aa02f798-b992-4400-a168-fdbecec476ec")
    public CommunicationMedia_BindableInstance(final BindableInstance element) {
        super(element);
    }

    @objid ("c66b713e-94b9-4c32-8fbb-5ee6b9f635ee")
    public String getelementSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_INSTANCE_COMMUNICATIONMEDIA_INSTANCE_ELEMENTSIZE, this.element);
    }

    @objid ("50593f9b-7239-4b5e-a5c5-b8e93b9d6e8d")
    public void setelementSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_INSTANCE_COMMUNICATIONMEDIA_INSTANCE_ELEMENTSIZE, value);
    }

    @objid ("a3af9fd5-2f64-4b47-b076-6f73cbb40874")
    public String gettransmMode() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_INSTANCE_COMMUNICATIONMEDIA_INSTANCE_TRANSMMODE, this.element);
    }

    @objid ("95746e83-ec66-458b-ba07-a829c4f73c66")
    public void settransmMode(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_INSTANCE_COMMUNICATIONMEDIA_INSTANCE_TRANSMMODE, value);
    }

    @objid ("4f501dc7-023f-499a-9501-03f58265c86a")
    public String getblockT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_INSTANCE_COMMUNICATIONMEDIA_INSTANCE_BLOCKT, this.element);
    }

    @objid ("bff34119-a80f-4610-88db-7142ffd1e07b")
    public void setblockT(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_INSTANCE_COMMUNICATIONMEDIA_INSTANCE_BLOCKT, value);
    }

    @objid ("de181c8e-5625-409d-99ed-a241c8395fda")
    public String getpacketT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_INSTANCE_COMMUNICATIONMEDIA_INSTANCE_PACKETT, this.element);
    }

    @objid ("90b465ad-f3d2-402d-b63e-5d98001bd5cd")
    public void setpacketT(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_INSTANCE_COMMUNICATIONMEDIA_INSTANCE_PACKETT, value);
    }

    @objid ("a3c4d083-0bfa-45b9-9403-6d243abbda48")
    public String getcapacity() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_INSTANCE_COMMUNICATIONMEDIA_INSTANCE_CAPACITY, this.element);
    }

    @objid ("d814f8ca-762b-41ec-9ee1-9e9d2a3c1252")
    public void setcapacity(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_INSTANCE_COMMUNICATIONMEDIA_INSTANCE_CAPACITY, value);
    }

}
