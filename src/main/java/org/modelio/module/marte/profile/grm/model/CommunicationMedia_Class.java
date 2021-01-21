package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("2268ad6b-241a-4a64-86c0-5e8177505687")
public class CommunicationMedia_Class extends DeviceResource_Class {
    @objid ("2ccca9cb-d8f9-470f-a2de-7ce90a28647d")
    public CommunicationMedia_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMMUNICATIONMEDIA_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.COMMUNICATIONMEDIA_CLASSIFIER));
    }

    @objid ("03cda7d9-05b3-47f5-b8bf-f9e471715591")
    public CommunicationMedia_Class(final Class element) {
        super(element);
    }

    @objid ("44c35848-da8f-4630-84d2-efaa286154f0")
    public String getelementSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_ELEMENTSIZE, this.element);
    }

    @objid ("497384f8-8d01-4b40-9328-2c8d8b338816")
    public void setelementSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_ELEMENTSIZE, value);
    }

    @objid ("6b7b6296-bbac-49fd-a98f-038b8ff2426a")
    public String gettransmMode() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_TRANSMMODE, this.element);
    }

    @objid ("0fafe12b-c1d5-4721-ab8c-7bb89e6f2cba")
    public void settransmMode(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_TRANSMMODE, value);
    }

    @objid ("2d0cefd4-7b5a-4d56-a055-ea97ad8778fd")
    public String getblockT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_BLOCKT, this.element);
    }

    @objid ("91a8c3a9-5c06-4a46-be98-fcf238eb0a47")
    public void setblockT(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_BLOCKT, value);
    }

    @objid ("6530239a-6680-47f7-a861-83951ac83972")
    public String getpacketT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_PACKETT, this.element);
    }

    @objid ("e198d976-27b5-4919-8c81-81cd2bb95e65")
    public void setpacketT(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_PACKETT, value);
    }

    @objid ("02d27284-f194-4fa7-9004-b01a6f82a0b6")
    public String getcapacity() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_CAPACITY, this.element);
    }

    @objid ("b9cf4c51-6372-4414-af15-250ffc6d2eaa")
    public void setcapacity(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_CAPACITY, value);
    }

    @objid ("574f9fd7-bc50-49b5-a7bd-34baea6e64de")
    public enum TransmModeKind {
        simplex,
        halfDuplex,
        fullDuplex;
    }

}
