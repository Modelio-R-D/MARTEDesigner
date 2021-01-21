package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("aca01de3-3609-49a7-97e4-551c97133895")
public class CommunicationMedia_Node extends DeviceResource_Node {
    @objid ("50e59e3d-0bcd-43a5-a71d-4d881263cf02")
    public CommunicationMedia_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMMUNICATIONMEDIA_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.COMMUNICATIONMEDIA_CLASSIFIER));
    }

    @objid ("48c0ab41-c146-4d8a-bf2e-15fc373e526d")
    public CommunicationMedia_Node(final Node element) {
        super(element);
    }

    @objid ("9c171fd2-7541-49f4-b01e-1d24ea7a30ed")
    public String getelementSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_ELEMENTSIZE, this.element);
    }

    @objid ("4fad0d00-cdbc-48e7-ba48-f1de5e908fd1")
    public void setelementSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_ELEMENTSIZE, value);
    }

    @objid ("c42bd7cc-475a-4ff8-af36-6b473dec077d")
    public String gettransmMode() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_TRANSMMODE, this.element);
    }

    @objid ("53cfe007-f59a-4cd0-812f-8b7ffc5f6939")
    public void settransmMode(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_TRANSMMODE, value);
    }

    @objid ("c6ed6f00-c2f6-4475-9c8b-aa1d8ecd6b2c")
    public String getblockT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_BLOCKT, this.element);
    }

    @objid ("53ffd6a5-56ef-4461-9992-117ea3630a99")
    public void setblockT(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_BLOCKT, value);
    }

    @objid ("0346cc55-15f6-46ed-8c0a-6042c3d4edf8")
    public String getpacketT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_PACKETT, this.element);
    }

    @objid ("f84b5ce8-7380-4fd9-9a5a-1cc733b9517d")
    public void setpacketT(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_PACKETT, value);
    }

    @objid ("eab255bd-8e95-449c-b2ae-8f27d3d292e1")
    public String getcapacity() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_CAPACITY, this.element);
    }

    @objid ("4892a748-2f73-4d67-a388-a5a9f32d9738")
    public void setcapacity(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_CAPACITY, value);
    }

    @objid ("c954ab26-eca2-4b7f-8a31-76d202f25251")
    public enum TransmModeKind {
        simplex,
        halfDuplex,
        fullDuplex;
    }

}
