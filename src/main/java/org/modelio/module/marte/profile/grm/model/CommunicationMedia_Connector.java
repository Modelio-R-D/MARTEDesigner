package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("371bbb5a-c685-4736-9c35-7cfaefd007fc")
public class CommunicationMedia_Connector {
    @objid ("5e77d767-2596-4f28-868d-03b779628f6e")
    protected Connector element;

    @objid ("c9010e75-df0b-42d5-a367-2d63221b7412")
    public CommunicationMedia_Connector() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConnector();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMMUNICATIONMEDIA_LINK);
        this.element.setName(MARTEResourceManager.getName("CommunicationMedia_Connector"));
    }

    @objid ("cd72dce0-fe14-464a-9747-0d7d14ca014c")
    public CommunicationMedia_Connector(final Connector element) {
        this.element = element;
    }

    @objid ("d26bfa73-94fa-4f43-9667-8adcc4a20613")
    public void setParent(BindableInstance source, BindableInstance destination) {
        ModelUtils.attachConnector(element, source, destination);
    }

    @objid ("c8711961-a74d-4e67-a427-4e72348c309b")
    public Connector getElement() {
        return this.element;
    }

    @objid ("83a1e5fb-f970-4b6d-87c5-a5281c420a1b")
    public String getelementSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LINK_COMMUNICATIONMEDIA_LINK_ELEMENTSIZE, this.element);
    }

    @objid ("ffc8d5f7-9109-4705-ab0b-f3e181f955fd")
    public void setelementSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LINK_COMMUNICATIONMEDIA_LINK_ELEMENTSIZE, value);
    }

    @objid ("0b7fdd4d-19ad-437b-922e-3f59cdde1323")
    public String gettransmMode() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LINK_COMMUNICATIONMEDIA_LINK_TRANSMMODE, this.element);
    }

    @objid ("bc0b93b7-8773-4571-b178-8be683d6c5c3")
    public void settransmMode(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LINK_COMMUNICATIONMEDIA_LINK_TRANSMMODE, value);
    }

    @objid ("a4a636c0-7f7e-408c-a517-bd3a09439ac7")
    public String getblockT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LINK_COMMUNICATIONMEDIA_LINK_BLOCKT, this.element);
    }

    @objid ("599753b4-852a-43b5-ad99-0feea15047d7")
    public void setblockT(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LINK_COMMUNICATIONMEDIA_LINK_BLOCKT, value);
    }

    @objid ("9f632c1c-ae52-4694-a6b9-9708952c6e29")
    public String getpacketT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LINK_COMMUNICATIONMEDIA_LINK_PACKETT, this.element);
    }

    @objid ("aeecf727-d495-470b-aaf8-e816f8b9024b")
    public void setpacketT(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LINK_COMMUNICATIONMEDIA_LINK_PACKETT, value);
    }

    @objid ("0f055c3e-59f8-4d3a-be0d-ac9b86176d41")
    public String getcapacity() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LINK_COMMUNICATIONMEDIA_LINK_CAPACITY, this.element);
    }

    @objid ("8f6c9d56-c02c-4355-936c-1c5b59531ab6")
    public void setcapacity(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LINK_COMMUNICATIONMEDIA_LINK_CAPACITY, value);
    }

    @objid ("036b17aa-4d3c-46cd-925c-b092c3cfab5d")
    public enum TransmModeKind {
        simplex,
        halfDuplex,
        fullDuplex;
    }

}
