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
@objid ("e16274d4-6be4-48f1-8c9d-874ba4d82063")
public class MessageComResourceAttribute extends SwCommunicationResourceAttribute {
    @objid ("0e0c3ad9-dbf1-4dbc-9412-2dcb3f517b9e")
    public static final String STEREOTYPE_NAME = "MessageComResource_Attribute";

    @objid ("7f8f96ff-2fae-483c-bb40-92a5b9d842db")
    public static final String MESSAGECOMRESOURCE_ATTRIBUTE_ISFIXEDMESSAGESIZE_TAGTYPE = "MessageComResource_Attribute_isFixedMessageSize";

    @objid ("4459df20-812a-4c60-b505-39977f084549")
    public static final String MESSAGECOMRESOURCE_ATTRIBUTE_MECHANISM_TAGTYPE = "MessageComResource_Attribute_mechanism";

    @objid ("10c02636-c8b4-4a32-877a-4a59fb182200")
    public static final String MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE = "MessageComResource_Attribute_messageQueueCapacityElements";

    @objid ("d841ce0f-5731-4d59-bb06-13f5eeb63694")
    public static final String MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGEQUEUEPOLICY_TAGTYPE = "MessageComResource_Attribute_messageQueuePolicy";

    @objid ("9b686a7c-9dab-4d1b-b8cf-303992e60ae2")
    public static final String MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGESIZEELEMENTS_TAGTYPE = "MessageComResource_Attribute_messageSizeElements";

    @objid ("1e8615b8-b0de-44e0-adb0-d08f625e2d9a")
    public static final String MESSAGECOMRESOURCE_ATTRIBUTE_RECEIVESERVICES_TAGTYPE = "MessageComResource_Attribute_receiveServices";

    @objid ("b987dc51-aa8e-42f5-8e44-3ab3be0505b2")
    public static final String MESSAGECOMRESOURCE_ATTRIBUTE_SENDSERVICES_TAGTYPE = "MessageComResource_Attribute_sendServices";

    /**
     * Tells whether a {@link MessageComResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << MessageComResource_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8db434d1-ccb5-4b81-bf30-e9d581c2a5b2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MessageComResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << MessageComResource_Attribute >> then instantiate a {@link MessageComResourceAttribute} proxy.
     * 
     * @return a {@link MessageComResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("8a205186-30a8-4fd2-8aeb-5f8b6afd140a")
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
    @objid ("fa22476a-3d0e-41cd-9ef7-eac5afc90cf9")
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
    @objid ("7643eeb1-5f7d-4c7b-ad8a-8b9f0aeb6d4a")
    public static MessageComResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (MessageComResourceAttribute.canInstantiate(obj))
        	return new MessageComResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("MessageComResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ddfaf16d-945f-4a93-82cb-770f2250ee3d")
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
    @objid ("5b9c8305-de95-4f1c-bfb9-981a0fefe46f")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'MessageComResource_Attribute_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("69bbdbdf-dbaf-4c51-ab4c-56e5e8c974a9")
    public String getMessageComResource_Attribute_mechanism() {
        return this.elt.getTagValue(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Attribute_messageQueueCapacityElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("278d0e99-a445-40a7-b2bd-7c8ea30db3d6")
    public List<String> getMessageComResource_Attribute_messageQueueCapacityElements() {
        return this.elt.getTagValues(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MessageComResource_Attribute_messageQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1995aed7-b790-42ea-87ee-43b111bb2adc")
    public String getMessageComResource_Attribute_messageQueuePolicy() {
        return this.elt.getTagValue(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGEQUEUEPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Attribute_messageSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("70c83c0f-179c-49c1-bd67-e2077efccc1e")
    public List<String> getMessageComResource_Attribute_messageSizeElements() {
        return this.elt.getTagValues(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGESIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Attribute_receiveServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("7159aac0-cf95-4654-93d3-a10ab533590d")
    public List<String> getMessageComResource_Attribute_receiveServices() {
        return this.elt.getTagValues(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_RECEIVESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Attribute_sendServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("de9633c2-1444-4732-9536-6acb777f4088")
    public List<String> getMessageComResource_Attribute_sendServices() {
        return this.elt.getTagValues(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_SENDSERVICES_TAGTYPE_ELT);
    }

    @objid ("638a4845-bb0b-409c-9aae-657da39fe997")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'MessageComResource_Attribute_isFixedMessageSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d993b518-8fb6-4754-a5b2-f6028eb8c5a6")
    public boolean isMessageComResource_Attribute_isFixedMessageSize() {
        return this.elt.isTagged(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_ISFIXEDMESSAGESIZE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'MessageComResource_Attribute_isFixedMessageSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("253ef1d6-6412-4bd9-b16d-4500cc9d16d1")
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
    @objid ("ac26d188-d722-4d51-af60-7ea11e90103c")
    public void setMessageComResource_Attribute_mechanism(final String value) {
        this.elt.putTagValue(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Attribute_messageQueueCapacityElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2755f8fd-9915-479d-b6f4-a57b237d0fba")
    public void setMessageComResource_Attribute_messageQueueCapacityElements(final List<String> values) {
        this.elt.putTagValues(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'MessageComResource_Attribute_messageQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("702ba608-e6f5-4624-9e08-45ee03a85c76")
    public void setMessageComResource_Attribute_messageQueuePolicy(final String value) {
        this.elt.putTagValue(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGEQUEUEPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Attribute_messageSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2c5af6fd-373f-4bfe-a885-2b47c1b5fba8")
    public void setMessageComResource_Attribute_messageSizeElements(final List<String> values) {
        this.elt.putTagValues(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGESIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Attribute_receiveServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5c4470e0-cb44-421f-b620-f975b52c8f15")
    public void setMessageComResource_Attribute_receiveServices(final List<String> values) {
        this.elt.putTagValues(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_RECEIVESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Attribute_sendServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0292febb-c1c1-406e-a50d-5b3e3b3e1848")
    public void setMessageComResource_Attribute_sendServices(final List<String> values) {
        this.elt.putTagValues(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_SENDSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("c82304be-f203-4086-aab8-96bcb651d437")
    protected MessageComResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("41eb4304-90f7-4b7d-ae3d-8f980c5aae1e")
    public static final class MdaTypes {
        @objid ("25d659e3-2b4f-4a33-bc1d-8a4af2ad583b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d9e862d2-8c89-4043-93dc-a87a7c669abc")
        public static TagType MESSAGECOMRESOURCE_ATTRIBUTE_ISFIXEDMESSAGESIZE_TAGTYPE_ELT;

        @objid ("472ca846-6093-423c-8835-cef0e146fb37")
        public static TagType MESSAGECOMRESOURCE_ATTRIBUTE_MECHANISM_TAGTYPE_ELT;

        @objid ("d1334574-676f-47ef-8684-af7f728903f1")
        public static TagType MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGESIZEELEMENTS_TAGTYPE_ELT;

        @objid ("d6b5d8d2-76ce-4fc7-aab0-b9c621e29b38")
        public static TagType MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT;

        @objid ("4d0e7380-4efb-4e2a-ba8d-e41b8fa5877a")
        public static TagType MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGEQUEUEPOLICY_TAGTYPE_ELT;

        @objid ("ae3eb94d-ce6a-4ff0-b84a-ff837bc8d382")
        public static TagType MESSAGECOMRESOURCE_ATTRIBUTE_SENDSERVICES_TAGTYPE_ELT;

        @objid ("00a3b309-891c-4be2-9880-802a668cd9f9")
        public static TagType MESSAGECOMRESOURCE_ATTRIBUTE_RECEIVESERVICES_TAGTYPE_ELT;

        @objid ("03a5dd5d-9129-4129-94de-9f7e603cd657")
        private static Stereotype MDAASSOCDEP;

        @objid ("c61e31a5-0c0b-48e7-b02e-d5a80fc37c9e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b352be20-8b17-4fce-a1ef-ce24d459c785")
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
