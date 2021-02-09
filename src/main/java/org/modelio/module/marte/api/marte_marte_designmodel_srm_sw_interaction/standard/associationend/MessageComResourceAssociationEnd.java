/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << MessageComResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class MessageComResourceAssociationEnd extends SwCommunicationResourceAssociationEnd {
    public static final String STEREOTYPE_NAME = "MessageComResource_AssociationEnd";

    public static final String MESSAGECOMRESOURCE_ASSOCIATIONEND_ISFIXEDMESSAGESIZE_TAGTYPE = "MessageComResource_AssociationEnd_isFixedMessageSize";

    public static final String MESSAGECOMRESOURCE_ASSOCIATIONEND_MECHANISM_TAGTYPE = "MessageComResource_AssociationEnd_mechanism";

    public static final String MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE = "MessageComResource_AssociationEnd_messageQueueCapacityElements";

    public static final String MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGEQUEUEPOLICY_TAGTYPE = "MessageComResource_AssociationEnd_messageQueuePolicy";

    public static final String MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGESIZEELEMENTS_TAGTYPE = "MessageComResource_AssociationEnd_messageSizeElements";

    public static final String MESSAGECOMRESOURCE_ASSOCIATIONEND_RECEIVESERVICES_TAGTYPE = "MessageComResource_AssociationEnd_receiveServices";

    public static final String MESSAGECOMRESOURCE_ASSOCIATIONEND_SENDSERVICES_TAGTYPE = "MessageComResource_AssociationEnd_sendServices";

    /**
     * Tells whether a {@link MessageComResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << MessageComResource_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MessageComResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << MessageComResource_AssociationEnd >> then instantiate a {@link MessageComResourceAssociationEnd} proxy.
     * 
     * @return a {@link MessageComResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    public static MessageComResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MessageComResourceAssociationEnd.STEREOTYPE_NAME);
        return MessageComResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link MessageComResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << MessageComResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link MessageComResourceAssociationEnd} proxy or <i>null</i>.
     */
    public static MessageComResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return MessageComResourceAssociationEnd.canInstantiate(obj) ? new MessageComResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MessageComResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << MessageComResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link MessageComResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static MessageComResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (MessageComResourceAssociationEnd.canInstantiate(obj))
        	return new MessageComResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("MessageComResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        MessageComResourceAssociationEnd other = (MessageComResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'MessageComResource_AssociationEnd_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getMessageComResource_AssociationEnd_mechanism() {
        return this.elt.getTagValue(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_AssociationEnd_messageQueueCapacityElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMessageComResource_AssociationEnd_messageQueueCapacityElements() {
        return this.elt.getTagValues(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MessageComResource_AssociationEnd_messageQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getMessageComResource_AssociationEnd_messageQueuePolicy() {
        return this.elt.getTagValue(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGEQUEUEPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_AssociationEnd_messageSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMessageComResource_AssociationEnd_messageSizeElements() {
        return this.elt.getTagValues(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGESIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_AssociationEnd_receiveServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMessageComResource_AssociationEnd_receiveServices() {
        return this.elt.getTagValues(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_RECEIVESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_AssociationEnd_sendServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMessageComResource_AssociationEnd_sendServices() {
        return this.elt.getTagValues(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_SENDSERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'MessageComResource_AssociationEnd_isFixedMessageSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isMessageComResource_AssociationEnd_isFixedMessageSize() {
        return this.elt.isTagged(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_ISFIXEDMESSAGESIZE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'MessageComResource_AssociationEnd_isFixedMessageSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMessageComResource_AssociationEnd_isFixedMessageSize(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_ISFIXEDMESSAGESIZE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_ISFIXEDMESSAGESIZE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'MessageComResource_AssociationEnd_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMessageComResource_AssociationEnd_mechanism(final String value) {
        this.elt.putTagValue(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MessageComResource_AssociationEnd_messageQueueCapacityElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMessageComResource_AssociationEnd_messageQueueCapacityElements(final List<String> values) {
        this.elt.putTagValues(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'MessageComResource_AssociationEnd_messageQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMessageComResource_AssociationEnd_messageQueuePolicy(final String value) {
        this.elt.putTagValue(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGEQUEUEPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MessageComResource_AssociationEnd_messageSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMessageComResource_AssociationEnd_messageSizeElements(final List<String> values) {
        this.elt.putTagValues(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGESIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MessageComResource_AssociationEnd_receiveServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMessageComResource_AssociationEnd_receiveServices(final List<String> values) {
        this.elt.putTagValues(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_RECEIVESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MessageComResource_AssociationEnd_sendServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMessageComResource_AssociationEnd_sendServices(final List<String> values) {
        this.elt.putTagValues(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_SENDSERVICES_TAGTYPE_ELT, values);
    }

    protected MessageComResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_ASSOCIATIONEND_ISFIXEDMESSAGESIZE_TAGTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_ASSOCIATIONEND_MECHANISM_TAGTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGESIZEELEMENTS_TAGTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGEQUEUEPOLICY_TAGTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_ASSOCIATIONEND_SENDSERVICES_TAGTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_ASSOCIATIONEND_RECEIVESERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "022b0a9e-0ccf-11df-8525-001302895b2b");
            MESSAGECOMRESOURCE_ASSOCIATIONEND_ISFIXEDMESSAGESIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "022b0aa5-0ccf-11df-8525-001302895b2b");
            MESSAGECOMRESOURCE_ASSOCIATIONEND_MECHANISM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "022b0aac-0ccf-11df-8525-001302895b2b");
            MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGESIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "022d6cf1-0ccf-11df-8525-001302895b2b");
            MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "022d6cf8-0ccf-11df-8525-001302895b2b");
            MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGEQUEUEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "022d6cff-0ccf-11df-8525-001302895b2b");
            MESSAGECOMRESOURCE_ASSOCIATIONEND_SENDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "022d6d06-0ccf-11df-8525-001302895b2b");
            MESSAGECOMRESOURCE_ASSOCIATIONEND_RECEIVESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "022d6d0d-0ccf-11df-8525-001302895b2b");
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
