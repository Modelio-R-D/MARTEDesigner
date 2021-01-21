/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("d187eefd-0fd9-4993-819d-1350024d78dd")
    public static final String STEREOTYPE_NAME = "MessageComResource_Attribute";

    @objid ("9db0d4d4-a7b1-48a4-b145-4c7b7c938d45")
    public static final String MESSAGECOMRESOURCE_ATTRIBUTE_ISFIXEDMESSAGESIZE_TAGTYPE = "MessageComResource_Attribute_isFixedMessageSize";

    @objid ("11923495-0a2c-43d7-a674-9b837bed6ef7")
    public static final String MESSAGECOMRESOURCE_ATTRIBUTE_MECHANISM_TAGTYPE = "MessageComResource_Attribute_mechanism";

    @objid ("65a21456-72ce-4c2c-8902-fb18f61d8124")
    public static final String MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE = "MessageComResource_Attribute_messageQueueCapacityElements";

    @objid ("4b6d76c9-5778-43a6-b2b3-4b51e1b62155")
    public static final String MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGEQUEUEPOLICY_TAGTYPE = "MessageComResource_Attribute_messageQueuePolicy";

    @objid ("4c96ec4a-5e52-4785-93e1-6e0b405db9ba")
    public static final String MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGESIZEELEMENTS_TAGTYPE = "MessageComResource_Attribute_messageSizeElements";

    @objid ("c9243d04-a28e-4474-b853-c9daf3caf6da")
    public static final String MESSAGECOMRESOURCE_ATTRIBUTE_RECEIVESERVICES_TAGTYPE = "MessageComResource_Attribute_receiveServices";

    @objid ("b612d394-539e-4317-8ed4-b281713303eb")
    public static final String MESSAGECOMRESOURCE_ATTRIBUTE_SENDSERVICES_TAGTYPE = "MessageComResource_Attribute_sendServices";

    /**
     * Tells whether a {@link MessageComResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << MessageComResource_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("49de5619-726b-4bb7-a420-028fd5736706")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MessageComResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << MessageComResource_Attribute >> then instantiate a {@link MessageComResourceAttribute} proxy.
     * 
     * @return a {@link MessageComResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("8da666b8-1882-4660-b1ab-d80d409a135d")
    public static MessageComResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MessageComResourceAttribute.STEREOTYPE_NAME);
        return MessageComResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link MessageComResourceAttribute} proxy from a {@link Attribute} stereotyped << MessageComResource_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link MessageComResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("c8b44345-9448-4f3f-9401-48e6fad84e2b")
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
    @objid ("5996c9e2-c1e5-4282-8690-06113110312b")
    public static MessageComResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (MessageComResourceAttribute.canInstantiate(obj))
        	return new MessageComResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("MessageComResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9a533c09-28cf-4773-b4d8-c4f4cf4ec365")
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
    @objid ("98666a5c-e44a-454a-8d64-4e877f09ef87")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'MessageComResource_Attribute_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("793a7269-5d1e-4029-a786-f20ad471efb9")
    public String getMessageComResource_Attribute_mechanism() {
        return this.elt.getTagValue(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Attribute_messageQueueCapacityElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("bc18e563-3c5c-4e37-bf4a-45276ce018f5")
    public List<String> getMessageComResource_Attribute_messageQueueCapacityElements() {
        return this.elt.getTagValues(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MessageComResource_Attribute_messageQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a582e0b3-37b1-492e-b33c-b28354aa3703")
    public String getMessageComResource_Attribute_messageQueuePolicy() {
        return this.elt.getTagValue(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGEQUEUEPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Attribute_messageSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("17672baa-e0a2-4b82-9e0c-49212244c16e")
    public List<String> getMessageComResource_Attribute_messageSizeElements() {
        return this.elt.getTagValues(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGESIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Attribute_receiveServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("61041c12-8d9a-425a-957e-1886130784fc")
    public List<String> getMessageComResource_Attribute_receiveServices() {
        return this.elt.getTagValues(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_RECEIVESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Attribute_sendServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("fa5fa401-424c-43cc-a7ad-42563d5b5608")
    public List<String> getMessageComResource_Attribute_sendServices() {
        return this.elt.getTagValues(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_SENDSERVICES_TAGTYPE_ELT);
    }

    @objid ("d668fa53-d683-4828-ba7e-6af937c9cc76")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'MessageComResource_Attribute_isFixedMessageSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("85dc76f3-fbaa-474d-803a-fee62c2207a0")
    public boolean isMessageComResource_Attribute_isFixedMessageSize() {
        return this.elt.isTagged(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_ISFIXEDMESSAGESIZE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'MessageComResource_Attribute_isFixedMessageSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b94eb2c8-4298-4910-bd4d-07e97a17f3c6")
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
    @objid ("604b4bf8-5c30-407c-8a57-e805f653f99c")
    public void setMessageComResource_Attribute_mechanism(final String value) {
        this.elt.putTagValue(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Attribute_messageQueueCapacityElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b2c9e671-9075-4c9c-9514-65c385139012")
    public void setMessageComResource_Attribute_messageQueueCapacityElements(final List<String> values) {
        this.elt.putTagValues(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'MessageComResource_Attribute_messageQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c3d4ab3f-eb75-40f5-803d-c9e51c914a87")
    public void setMessageComResource_Attribute_messageQueuePolicy(final String value) {
        this.elt.putTagValue(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGEQUEUEPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Attribute_messageSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("24c5b007-1a6f-47e1-b45c-c374306d7d52")
    public void setMessageComResource_Attribute_messageSizeElements(final List<String> values) {
        this.elt.putTagValues(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGESIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Attribute_receiveServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b1655219-1964-4bdc-bd8e-796347133670")
    public void setMessageComResource_Attribute_receiveServices(final List<String> values) {
        this.elt.putTagValues(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_RECEIVESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Attribute_sendServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7ef618ea-73f0-40d7-9a92-348bee5d0d13")
    public void setMessageComResource_Attribute_sendServices(final List<String> values) {
        this.elt.putTagValues(MessageComResourceAttribute.MdaTypes.MESSAGECOMRESOURCE_ATTRIBUTE_SENDSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("481c0fb8-c428-4aac-bc1e-6714b3a9d936")
    protected MessageComResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("41eb4304-90f7-4b7d-ae3d-8f980c5aae1e")
    public static final class MdaTypes {
        @objid ("29ca1552-ecce-4f5f-bc9e-da1e7b17874a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ed03d101-2da2-46a7-a927-dcecd31bb968")
        public static TagType MESSAGECOMRESOURCE_ATTRIBUTE_ISFIXEDMESSAGESIZE_TAGTYPE_ELT;

        @objid ("d1345d70-b6b8-40ca-8452-63cb0beb955d")
        public static TagType MESSAGECOMRESOURCE_ATTRIBUTE_MECHANISM_TAGTYPE_ELT;

        @objid ("00d33955-b4ce-49e0-9350-241fc26a82ff")
        public static TagType MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGESIZEELEMENTS_TAGTYPE_ELT;

        @objid ("24e538fb-0850-4b49-bce6-9eea63c646a1")
        public static TagType MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT;

        @objid ("665d891a-2914-40d6-92b2-d8477c3e90d0")
        public static TagType MESSAGECOMRESOURCE_ATTRIBUTE_MESSAGEQUEUEPOLICY_TAGTYPE_ELT;

        @objid ("eb0b3253-54e7-42d9-822f-b3b0b0021876")
        public static TagType MESSAGECOMRESOURCE_ATTRIBUTE_SENDSERVICES_TAGTYPE_ELT;

        @objid ("70c17238-08be-499f-a047-db2d37503c86")
        public static TagType MESSAGECOMRESOURCE_ATTRIBUTE_RECEIVESERVICES_TAGTYPE_ELT;

        @objid ("52747055-b333-4102-8699-9520b4f40208")
        private static Stereotype MDAASSOCDEP;

        @objid ("e64f6548-7d39-4603-bf27-71b5fe93d086")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a23dbb4c-f370-4ad4-ad62-4d3619311eca")
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
