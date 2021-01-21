package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("7b3577be-007b-4556-9286-2144d318b638")
public class CommunicationMedia_Link {
    @objid ("a3185844-8640-4477-a54f-454f4415f1ef")
    protected Link element;

    @objid ("609972e4-cac0-4b00-8faf-db04364833d2")
    public CommunicationMedia_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMMUNICATIONMEDIA_LINK);
        this.element.setName(MARTEResourceManager.getName("CommunicationMedia_Link"));
    }

    @objid ("85d08750-637e-4553-9f3f-fa346b2b6db2")
    public CommunicationMedia_Link(final Link element) {
        this.element = element;
    }

    @objid ("66cbdd8e-0855-4227-a8ef-34f704350298")
    public void setParent(final BindableInstance source, final BindableInstance destination) {
    }

    @objid ("ce6c0881-f993-405f-8140-7d25ec72cd3a")
    public Link getElement() {
        return this.element;
    }

    @objid ("d5e52702-3fcb-4566-85b3-13168a33a244")
    public String getelementSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LINK_COMMUNICATIONMEDIA_LINK_ELEMENTSIZE, this.element);
    }

    @objid ("06768480-2dab-4a0f-a717-35ee87474238")
    public void setelementSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LINK_COMMUNICATIONMEDIA_LINK_ELEMENTSIZE, value);
    }

    @objid ("5b4b9fb1-14ab-456d-a9a5-34344dfc9535")
    public String gettransmMode() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LINK_COMMUNICATIONMEDIA_LINK_TRANSMMODE, this.element);
    }

    @objid ("eb088f10-c5f2-4d04-8d23-4eda61db2b8e")
    public void settransmMode(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LINK_COMMUNICATIONMEDIA_LINK_TRANSMMODE, value);
    }

    @objid ("51d51030-148a-4f29-8561-9f67b04862a3")
    public String getblockT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LINK_COMMUNICATIONMEDIA_LINK_BLOCKT, this.element);
    }

    @objid ("602abc36-67f2-4dfa-8609-dbfdcf727527")
    public void setblockT(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LINK_COMMUNICATIONMEDIA_LINK_BLOCKT, value);
    }

    @objid ("f2e21675-1120-4d2b-8126-acb2864214ff")
    public String getpacketT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LINK_COMMUNICATIONMEDIA_LINK_PACKETT, this.element);
    }

    @objid ("20f912bc-df05-481c-9816-9b4d1fb2cf3c")
    public void setpacketT(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LINK_COMMUNICATIONMEDIA_LINK_PACKETT, value);
    }

    @objid ("bb393d32-78a4-49ba-a9bb-94e239ea4ac7")
    public String getcapacity() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LINK_COMMUNICATIONMEDIA_LINK_CAPACITY, this.element);
    }

    @objid ("de9d93e2-04c5-4360-b597-ee1f99c5d5a6")
    public void setcapacity(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LINK_COMMUNICATIONMEDIA_LINK_CAPACITY, value);
    }

    @objid ("de70e611-67c0-4db5-946a-7400dbbccb0e")
    public void setParent(Instance source, Instance destination) {
        ModelUtils.attachLink(element, source, destination);
    }

}
