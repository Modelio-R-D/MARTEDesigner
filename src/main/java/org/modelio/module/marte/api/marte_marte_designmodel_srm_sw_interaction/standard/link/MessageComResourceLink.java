/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.link;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << MessageComResource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("9a41a08f-6174-4133-80c8-6e57fb0d94c8")
public class MessageComResourceLink extends SwCommunicationResourceLink {
    @objid ("f348a1f9-c14a-47d5-9bae-1996543b13e4")
    public static final String STEREOTYPE_NAME = "MessageComResource_Link";

    @objid ("a1d4a19f-0817-45db-ad9b-5fff681816a2")
    public static final String MESSAGECOMRESOURCE_LINK_ISFIXEDMESSAGESIZE_TAGTYPE = "MessageComResource_Link_isFixedMessageSize";

    @objid ("1d936d04-c16e-4da3-971d-37d6a96b5a77")
    public static final String MESSAGECOMRESOURCE_LINK_MECHANISM_TAGTYPE = "MessageComResource_Link_mechanism";

    @objid ("2ad04b2d-770f-424c-8e96-a0cf414aff3b")
    public static final String MESSAGECOMRESOURCE_LINK_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE = "MessageComResource_Link_messageQueueCapacityElements";

    @objid ("753de837-9dd6-48a2-91ee-e50d56f8f772")
    public static final String MESSAGECOMRESOURCE_LINK_MESSAGEQUEUEPOLICY_TAGTYPE = "MessageComResource_Link_messageQueuePolicy";

    @objid ("43457e5f-0783-4c6a-b01e-dbf2d1957432")
    public static final String MESSAGECOMRESOURCE_LINK_MESSAGESIZEELEMENTS_TAGTYPE = "MessageComResource_Link_messageSizeElements";

    @objid ("6bcf5aae-06f4-48cc-830d-26369d1df7a9")
    public static final String MESSAGECOMRESOURCE_LINK_RECEIVESERVICES_TAGTYPE = "MessageComResource_Link_receiveServices";

    @objid ("df20b27f-4aa2-44f4-ae31-b56e0ff03fd7")
    public static final String MESSAGECOMRESOURCE_LINK_SENDSERVICES_TAGTYPE = "MessageComResource_Link_sendServices";

    /**
     * Tells whether a {@link MessageComResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << MessageComResource_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("5095fdb7-930f-4c59-801c-a322154e6c59")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MessageComResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << MessageComResource_Link >> then instantiate a {@link MessageComResourceLink} proxy.
     * 
     * @return a {@link MessageComResourceLink} proxy on the created {@link Link}.
     */
    @objid ("555bd594-5dde-4b94-8950-981c417c712f")
    public static MessageComResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MessageComResourceLink.STEREOTYPE_NAME);
        return MessageComResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link MessageComResourceLink} proxy from a {@link Link} stereotyped << MessageComResource_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link MessageComResourceLink} proxy or <i>null</i>.
     */
    @objid ("384c96bb-8d26-4bfd-abdb-dc3b236cec00")
    public static MessageComResourceLink instantiate(final Link obj) {
        return MessageComResourceLink.canInstantiate(obj) ? new MessageComResourceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MessageComResourceLink} proxy from a {@link Link} stereotyped << MessageComResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link MessageComResourceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("92650cdf-ba06-4aab-8491-d87f5411b28c")
    public static MessageComResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (MessageComResourceLink.canInstantiate(obj))
        	return new MessageComResourceLink(obj);
        else
        	throw new IllegalArgumentException("MessageComResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a19b36db-c8cc-4c45-abf0-b5347a12d817")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        MessageComResourceLink other = (MessageComResourceLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("551f7417-90b7-48f3-bc83-c4a18634dc14")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'MessageComResource_Link_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3c97ffa8-39c6-41e6-96c1-280d0b69f477")
    public String getMessageComResource_Link_mechanism() {
        return this.elt.getTagValue(MessageComResourceLink.MdaTypes.MESSAGECOMRESOURCE_LINK_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Link_messageQueueCapacityElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9e49911c-feb7-4144-8c22-0935bfdf0837")
    public List<String> getMessageComResource_Link_messageQueueCapacityElements() {
        return this.elt.getTagValues(MessageComResourceLink.MdaTypes.MESSAGECOMRESOURCE_LINK_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MessageComResource_Link_messageQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("16a41b57-1ae2-4c20-8c42-537f1235fe74")
    public String getMessageComResource_Link_messageQueuePolicy() {
        return this.elt.getTagValue(MessageComResourceLink.MdaTypes.MESSAGECOMRESOURCE_LINK_MESSAGEQUEUEPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Link_messageSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("85acc8c8-db24-4bab-b6e9-c83f042199fc")
    public List<String> getMessageComResource_Link_messageSizeElements() {
        return this.elt.getTagValues(MessageComResourceLink.MdaTypes.MESSAGECOMRESOURCE_LINK_MESSAGESIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Link_receiveServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("af8fbe23-88a2-441a-a585-58b6632412ec")
    public List<String> getMessageComResource_Link_receiveServices() {
        return this.elt.getTagValues(MessageComResourceLink.MdaTypes.MESSAGECOMRESOURCE_LINK_RECEIVESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Link_sendServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("64d9523a-f512-4292-8249-6e8c86196d9b")
    public List<String> getMessageComResource_Link_sendServices() {
        return this.elt.getTagValues(MessageComResourceLink.MdaTypes.MESSAGECOMRESOURCE_LINK_SENDSERVICES_TAGTYPE_ELT);
    }

    @objid ("6c5b5144-a900-4092-a218-4ac38f567901")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'MessageComResource_Link_isFixedMessageSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c9f840f8-64fb-4421-8c76-9f50c0e20143")
    public boolean isMessageComResource_Link_isFixedMessageSize() {
        return this.elt.isTagged(MessageComResourceLink.MdaTypes.MESSAGECOMRESOURCE_LINK_ISFIXEDMESSAGESIZE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'MessageComResource_Link_isFixedMessageSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3e34ad0d-7e9a-4ab9-af72-c3321d524772")
    public void setMessageComResource_Link_isFixedMessageSize(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(MessageComResourceLink.MdaTypes.MESSAGECOMRESOURCE_LINK_ISFIXEDMESSAGESIZE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(MessageComResourceLink.MdaTypes.MESSAGECOMRESOURCE_LINK_ISFIXEDMESSAGESIZE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'MessageComResource_Link_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ed9a1d42-007a-4b74-a135-9a19be2effc1")
    public void setMessageComResource_Link_mechanism(final String value) {
        this.elt.putTagValue(MessageComResourceLink.MdaTypes.MESSAGECOMRESOURCE_LINK_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Link_messageQueueCapacityElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ef2d692d-e586-49a3-a238-b82e1c6c926f")
    public void setMessageComResource_Link_messageQueueCapacityElements(final List<String> values) {
        this.elt.putTagValues(MessageComResourceLink.MdaTypes.MESSAGECOMRESOURCE_LINK_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'MessageComResource_Link_messageQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("61276759-859a-4c97-b3d1-38901575d9a1")
    public void setMessageComResource_Link_messageQueuePolicy(final String value) {
        this.elt.putTagValue(MessageComResourceLink.MdaTypes.MESSAGECOMRESOURCE_LINK_MESSAGEQUEUEPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Link_messageSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("349f6663-cfbf-4318-9309-b66286771599")
    public void setMessageComResource_Link_messageSizeElements(final List<String> values) {
        this.elt.putTagValues(MessageComResourceLink.MdaTypes.MESSAGECOMRESOURCE_LINK_MESSAGESIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Link_receiveServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5cd7d251-7c28-4425-ba43-305052db3ba8")
    public void setMessageComResource_Link_receiveServices(final List<String> values) {
        this.elt.putTagValues(MessageComResourceLink.MdaTypes.MESSAGECOMRESOURCE_LINK_RECEIVESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Link_sendServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("38de0220-0172-4688-a2cb-c1ffd2dac5a5")
    public void setMessageComResource_Link_sendServices(final List<String> values) {
        this.elt.putTagValues(MessageComResourceLink.MdaTypes.MESSAGECOMRESOURCE_LINK_SENDSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("70308dbd-0aca-4dff-95f8-3770c7d62639")
    protected MessageComResourceLink(final Link elt) {
        super(elt);
    }

    @objid ("658d392d-862f-44e3-ae9f-c5705f2a2a3a")
    public static final class MdaTypes {
        @objid ("8bc942ea-27ed-4bb5-887f-477df87880a7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1e02e83a-7e82-4628-afa9-02d59f413b80")
        public static TagType MESSAGECOMRESOURCE_LINK_ISFIXEDMESSAGESIZE_TAGTYPE_ELT;

        @objid ("ef0dc1a1-570d-4a0e-a542-5ecaa675af18")
        public static TagType MESSAGECOMRESOURCE_LINK_MECHANISM_TAGTYPE_ELT;

        @objid ("e334d21e-d25b-432e-bcf6-29a5c18ce102")
        public static TagType MESSAGECOMRESOURCE_LINK_MESSAGESIZEELEMENTS_TAGTYPE_ELT;

        @objid ("13a2cff7-18a5-412f-aac9-a28e0ce49090")
        public static TagType MESSAGECOMRESOURCE_LINK_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT;

        @objid ("70372740-baf0-41cc-b5ca-ed7c1a7a1cbc")
        public static TagType MESSAGECOMRESOURCE_LINK_MESSAGEQUEUEPOLICY_TAGTYPE_ELT;

        @objid ("0a935184-d9b9-4509-b940-816dee15be84")
        public static TagType MESSAGECOMRESOURCE_LINK_SENDSERVICES_TAGTYPE_ELT;

        @objid ("cc87d89d-96d0-469c-8f54-388f584f2b95")
        public static TagType MESSAGECOMRESOURCE_LINK_RECEIVESERVICES_TAGTYPE_ELT;

        @objid ("73e31135-961b-4666-8801-ecc2f36cbbcf")
        private static Stereotype MDAASSOCDEP;

        @objid ("7524ce24-33bf-4576-94e5-b8b6abc3ed42")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("92d1e0b8-5b65-4896-b5d2-225c378149cf")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "022b0aa2-0ccf-11df-8525-001302895b2b");
            MESSAGECOMRESOURCE_LINK_ISFIXEDMESSAGESIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "022b0aa9-0ccf-11df-8525-001302895b2b");
            MESSAGECOMRESOURCE_LINK_MECHANISM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "022b0ab0-0ccf-11df-8525-001302895b2b");
            MESSAGECOMRESOURCE_LINK_MESSAGESIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "022d6cf5-0ccf-11df-8525-001302895b2b");
            MESSAGECOMRESOURCE_LINK_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "022d6cfc-0ccf-11df-8525-001302895b2b");
            MESSAGECOMRESOURCE_LINK_MESSAGEQUEUEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "022d6d03-0ccf-11df-8525-001302895b2b");
            MESSAGECOMRESOURCE_LINK_SENDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "022d6d0a-0ccf-11df-8525-001302895b2b");
            MESSAGECOMRESOURCE_LINK_RECEIVESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "022d6d11-0ccf-11df-8525-001302895b2b");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}
