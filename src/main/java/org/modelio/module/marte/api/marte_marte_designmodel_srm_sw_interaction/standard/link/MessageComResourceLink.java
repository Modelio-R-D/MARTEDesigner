/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.link;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
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
public class MessageComResourceLink extends SwCommunicationResourceLink {
    public static final String STEREOTYPE_NAME = "MessageComResource_Link";

    public static final String MESSAGECOMRESOURCE_LINK_ISFIXEDMESSAGESIZE_TAGTYPE = "MessageComResource_Link_isFixedMessageSize";

    public static final String MESSAGECOMRESOURCE_LINK_MECHANISM_TAGTYPE = "MessageComResource_Link_mechanism";

    public static final String MESSAGECOMRESOURCE_LINK_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE = "MessageComResource_Link_messageQueueCapacityElements";

    public static final String MESSAGECOMRESOURCE_LINK_MESSAGEQUEUEPOLICY_TAGTYPE = "MessageComResource_Link_messageQueuePolicy";

    public static final String MESSAGECOMRESOURCE_LINK_MESSAGESIZEELEMENTS_TAGTYPE = "MessageComResource_Link_messageSizeElements";

    public static final String MESSAGECOMRESOURCE_LINK_RECEIVESERVICES_TAGTYPE = "MessageComResource_Link_receiveServices";

    public static final String MESSAGECOMRESOURCE_LINK_SENDSERVICES_TAGTYPE = "MessageComResource_Link_sendServices";

    /**
     * Tells whether a {@link MessageComResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << MessageComResource_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MessageComResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << MessageComResource_Link >> then instantiate a {@link MessageComResourceLink} proxy.
     * 
     * @return a {@link MessageComResourceLink} proxy on the created {@link Link}.
     */
    public static MessageComResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MessageComResourceLink.STEREOTYPE_NAME);
        return MessageComResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link MessageComResourceLink} proxy from a {@link Link} stereotyped << MessageComResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link MessageComResourceLink} proxy or <i>null</i>.
     */
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
    public static MessageComResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (MessageComResourceLink.canInstantiate(obj))
        	return new MessageComResourceLink(obj);
        else
        	throw new IllegalArgumentException("MessageComResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'MessageComResource_Link_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getMessageComResource_Link_mechanism() {
        return this.elt.getTagValue(MessageComResourceLink.MdaTypes.MESSAGECOMRESOURCE_LINK_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Link_messageQueueCapacityElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMessageComResource_Link_messageQueueCapacityElements() {
        return this.elt.getTagValues(MessageComResourceLink.MdaTypes.MESSAGECOMRESOURCE_LINK_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MessageComResource_Link_messageQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getMessageComResource_Link_messageQueuePolicy() {
        return this.elt.getTagValue(MessageComResourceLink.MdaTypes.MESSAGECOMRESOURCE_LINK_MESSAGEQUEUEPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Link_messageSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMessageComResource_Link_messageSizeElements() {
        return this.elt.getTagValues(MessageComResourceLink.MdaTypes.MESSAGECOMRESOURCE_LINK_MESSAGESIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Link_receiveServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMessageComResource_Link_receiveServices() {
        return this.elt.getTagValues(MessageComResourceLink.MdaTypes.MESSAGECOMRESOURCE_LINK_RECEIVESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Link_sendServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMessageComResource_Link_sendServices() {
        return this.elt.getTagValues(MessageComResourceLink.MdaTypes.MESSAGECOMRESOURCE_LINK_SENDSERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'MessageComResource_Link_isFixedMessageSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isMessageComResource_Link_isFixedMessageSize() {
        return this.elt.isTagged(MessageComResourceLink.MdaTypes.MESSAGECOMRESOURCE_LINK_ISFIXEDMESSAGESIZE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'MessageComResource_Link_isFixedMessageSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
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
    public void setMessageComResource_Link_mechanism(final String value) {
        this.elt.putTagValue(MessageComResourceLink.MdaTypes.MESSAGECOMRESOURCE_LINK_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Link_messageQueueCapacityElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMessageComResource_Link_messageQueueCapacityElements(final List<String> values) {
        this.elt.putTagValues(MessageComResourceLink.MdaTypes.MESSAGECOMRESOURCE_LINK_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'MessageComResource_Link_messageQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMessageComResource_Link_messageQueuePolicy(final String value) {
        this.elt.putTagValue(MessageComResourceLink.MdaTypes.MESSAGECOMRESOURCE_LINK_MESSAGEQUEUEPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Link_messageSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMessageComResource_Link_messageSizeElements(final List<String> values) {
        this.elt.putTagValues(MessageComResourceLink.MdaTypes.MESSAGECOMRESOURCE_LINK_MESSAGESIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Link_receiveServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMessageComResource_Link_receiveServices(final List<String> values) {
        this.elt.putTagValues(MessageComResourceLink.MdaTypes.MESSAGECOMRESOURCE_LINK_RECEIVESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Link_sendServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMessageComResource_Link_sendServices(final List<String> values) {
        this.elt.putTagValues(MessageComResourceLink.MdaTypes.MESSAGECOMRESOURCE_LINK_SENDSERVICES_TAGTYPE_ELT, values);
    }

    protected MessageComResourceLink(final Link elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_LINK_ISFIXEDMESSAGESIZE_TAGTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_LINK_MECHANISM_TAGTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_LINK_MESSAGESIZEELEMENTS_TAGTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_LINK_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_LINK_MESSAGEQUEUEPOLICY_TAGTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_LINK_SENDSERVICES_TAGTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_LINK_RECEIVESERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
