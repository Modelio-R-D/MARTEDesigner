/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << MessageComResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class MessageComResourceAttribute extends SwCommunicationResourceAttribute {
    public static final String STEREOTYPE_NAME = "MessageComResource_Attribute";

    public static final String MESSAGECOMRESOURCE_ATTRIBUTE_ISFIXEDMESSAGESIZE_TAGTYPE = "MessageComResource_Attribute_isFixedMessageSize";

    public static final String MESSAGECOMRESOURCE_ATTRIBUTE_MECHANISM_TAGTYPE = "MessageComResource_Attribute_mechanism";

    public static final String MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE = "MessageComResource_Attribute_messageQueueCapacityElements";

    public static final String MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGEQUEUEPOLICY_TAGTYPE = "MessageComResource_Attribute_messageQueuePolicy";

    public static final String MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGESIZEELEMENTS_TAGTYPE = "MessageComResource_Attribute_messageSizeElements";

    public static final String MESSAGECOMRESOURCE_ATTRIBUTE_RECEIVESERVICES_TAGTYPE = "MessageComResource_Attribute_receiveServices";

    public static final String MESSAGECOMRESOURCE_ATTRIBUTE_SENDSERVICES_TAGTYPE = "MessageComResource_Attribute_sendServices";

    /**
     * Tells whether a {@link MessageComResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << MessageComResource_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MessageComResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << MessageComResource_Attribute >> then instantiate a {@link MessageComResourceAttribute} proxy.
     * 
     * @return a {@link MessageComResourceAttribute} proxy on the created {@link Attribute}.
     */
    public static MessageComResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MessageComResourceAttribute.STEREOTYPE_NAME);
        return MessageComResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link MessageComResourceAttribute} proxy from a {@link Attribute} stereotyped << MessageComResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link MessageComResourceAttribute} proxy or <i>null</i>.
     */
    public static MessageComResourceAttribute instantiate(final Attribute obj) {
        return MessageComResourceAttribute.canInstantiate(obj) ? new MessageComResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MessageComResourceAttribute} proxy from a {@link Attribute} stereotyped << MessageComResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link MessageComResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static MessageComResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (MessageComResourceAttribute.canInstantiate(obj))
        	return new MessageComResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("MessageComResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        MessageComResourceAttribute other = (MessageComResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'MessageComResource_Attribute_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getMessageComResource_Attribute_mechanism() {
        return this.elt.getTagValue(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Attribute_messageQueueCapacityElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMessageComResource_Attribute_messageQueueCapacityElements() {
        return this.elt.getTagValues(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MessageComResource_Attribute_messageQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getMessageComResource_Attribute_messageQueuePolicy() {
        return this.elt.getTagValue(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGEQUEUEPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Attribute_messageSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMessageComResource_Attribute_messageSizeElements() {
        return this.elt.getTagValues(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGESIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Attribute_receiveServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMessageComResource_Attribute_receiveServices() {
        return this.elt.getTagValues(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_RECEIVESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Attribute_sendServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMessageComResource_Attribute_sendServices() {
        return this.elt.getTagValues(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_SENDSERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'MessageComResource_Attribute_isFixedMessageSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isMessageComResource_Attribute_isFixedMessageSize() {
        return this.elt.isTagged(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_ISFIXEDMESSAGESIZE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'MessageComResource_Attribute_isFixedMessageSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMessageComResource_Attribute_isFixedMessageSize(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_ISFIXEDMESSAGESIZE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_ISFIXEDMESSAGESIZE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'MessageComResource_Attribute_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMessageComResource_Attribute_mechanism(final String value) {
        this.elt.putTagValue(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Attribute_messageQueueCapacityElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMessageComResource_Attribute_messageQueueCapacityElements(final List<String> values) {
        this.elt.putTagValues(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'MessageComResource_Attribute_messageQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMessageComResource_Attribute_messageQueuePolicy(final String value) {
        this.elt.putTagValue(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGEQUEUEPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Attribute_messageSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMessageComResource_Attribute_messageSizeElements(final List<String> values) {
        this.elt.putTagValues(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGESIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Attribute_receiveServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMessageComResource_Attribute_receiveServices(final List<String> values) {
        this.elt.putTagValues(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_RECEIVESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Attribute_sendServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMessageComResource_Attribute_sendServices(final List<String> values) {
        this.elt.putTagValues(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_SENDSERVICES_TAGTYPE_ELT, values);
    }

    protected MessageComResourceAttribute(final Attribute elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_ATTRIBUTE_ISFIXEDMESSAGESIZE_TAGTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_ATTRIBUTE_MECHANISM_TAGTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGESIZEELEMENTS_TAGTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGEQUEUEPOLICY_TAGTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_ATTRIBUTE_SENDSERVICES_TAGTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_ATTRIBUTE_RECEIVESERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "022b0aa0-0ccf-11df-8525-001302895b2b");
            MESSAGECOMRESOURCE_ATTRIBUTE_ISFIXEDMESSAGESIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "022b0aa7-0ccf-11df-8525-001302895b2b");
            MESSAGECOMRESOURCE_ATTRIBUTE_MECHANISM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "022b0aae-0ccf-11df-8525-001302895b2b");
            MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGESIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "022d6cf3-0ccf-11df-8525-001302895b2b");
            MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "022d6cfa-0ccf-11df-8525-001302895b2b");
            MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGEQUEUEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "022d6d01-0ccf-11df-8525-001302895b2b");
            MESSAGECOMRESOURCE_ATTRIBUTE_SENDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "022d6d08-0ccf-11df-8525-001302895b2b");
            MESSAGECOMRESOURCE_ATTRIBUTE_RECEIVESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "022d6d0f-0ccf-11df-8525-001302895b2b");
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
