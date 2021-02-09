/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << MessageComResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class MessageComResourceAssociation extends SwCommunicationResourceAssociation {
    public static final String STEREOTYPE_NAME = "MessageComResource_Association";

    public static final String MESSAGECOMRESOURCE_ASSOCIATION_ISFIXEDMESSAGESIZE_TAGTYPE = "MessageComResource_Association_isFixedMessageSize";

    public static final String MESSAGECOMRESOURCE_ASSOCIATION_MECHANISM_TAGTYPE = "MessageComResource_Association_mechanism";

    public static final String MESSAGECOMRESOURCE_ASSOCIATION_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE = "MessageComResource_Association_messageQueueCapacityElements";

    public static final String MESSAGECOMRESOURCE_ASSOCIATION_MESSAGEQUEUEPOLICY_TAGTYPE = "MessageComResource_Association_messageQueuePolicy";

    public static final String MESSAGECOMRESOURCE_ASSOCIATION_MESSAGESIZEELEMENTS_TAGTYPE = "MessageComResource_Association_messageSizeElements";

    public static final String MESSAGECOMRESOURCE_ASSOCIATION_RECEIVESERVICES_TAGTYPE = "MessageComResource_Association_receiveServices";

    public static final String MESSAGECOMRESOURCE_ASSOCIATION_SENDSERVICES_TAGTYPE = "MessageComResource_Association_sendServices";

    /**
     * Tells whether a {@link MessageComResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << MessageComResource_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MessageComResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << MessageComResource_Association >> then instantiate a {@link MessageComResourceAssociation} proxy.
     * 
     * @return a {@link MessageComResourceAssociation} proxy on the created {@link Association}.
     */
    public static MessageComResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MessageComResourceAssociation.STEREOTYPE_NAME);
        return MessageComResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link MessageComResourceAssociation} proxy from a {@link Association} stereotyped << MessageComResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link MessageComResourceAssociation} proxy or <i>null</i>.
     */
    public static MessageComResourceAssociation instantiate(final Association obj) {
        return MessageComResourceAssociation.canInstantiate(obj) ? new MessageComResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MessageComResourceAssociation} proxy from a {@link Association} stereotyped << MessageComResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link MessageComResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static MessageComResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (MessageComResourceAssociation.canInstantiate(obj))
        	return new MessageComResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("MessageComResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        MessageComResourceAssociation other = (MessageComResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'MessageComResource_Association_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getMessageComResource_Association_mechanism() {
        return this.elt.getTagValue(MessageComResourceAssociation.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATION_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Association_messageQueueCapacityElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMessageComResource_Association_messageQueueCapacityElements() {
        return this.elt.getTagValues(MessageComResourceAssociation.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MessageComResource_Association_messageQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getMessageComResource_Association_messageQueuePolicy() {
        return this.elt.getTagValue(MessageComResourceAssociation.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGEQUEUEPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Association_messageSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMessageComResource_Association_messageSizeElements() {
        return this.elt.getTagValues(MessageComResourceAssociation.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGESIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Association_receiveServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMessageComResource_Association_receiveServices() {
        return this.elt.getTagValues(MessageComResourceAssociation.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATION_RECEIVESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Association_sendServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMessageComResource_Association_sendServices() {
        return this.elt.getTagValues(MessageComResourceAssociation.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATION_SENDSERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'MessageComResource_Association_isFixedMessageSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isMessageComResource_Association_isFixedMessageSize() {
        return this.elt.isTagged(MessageComResourceAssociation.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATION_ISFIXEDMESSAGESIZE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'MessageComResource_Association_isFixedMessageSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMessageComResource_Association_isFixedMessageSize(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(MessageComResourceAssociation.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATION_ISFIXEDMESSAGESIZE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(MessageComResourceAssociation.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATION_ISFIXEDMESSAGESIZE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'MessageComResource_Association_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMessageComResource_Association_mechanism(final String value) {
        this.elt.putTagValue(MessageComResourceAssociation.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATION_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Association_messageQueueCapacityElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMessageComResource_Association_messageQueueCapacityElements(final List<String> values) {
        this.elt.putTagValues(MessageComResourceAssociation.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'MessageComResource_Association_messageQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMessageComResource_Association_messageQueuePolicy(final String value) {
        this.elt.putTagValue(MessageComResourceAssociation.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGEQUEUEPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Association_messageSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMessageComResource_Association_messageSizeElements(final List<String> values) {
        this.elt.putTagValues(MessageComResourceAssociation.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGESIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Association_receiveServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMessageComResource_Association_receiveServices(final List<String> values) {
        this.elt.putTagValues(MessageComResourceAssociation.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATION_RECEIVESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Association_sendServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMessageComResource_Association_sendServices(final List<String> values) {
        this.elt.putTagValues(MessageComResourceAssociation.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATION_SENDSERVICES_TAGTYPE_ELT, values);
    }

    protected MessageComResourceAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_ASSOCIATION_ISFIXEDMESSAGESIZE_TAGTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_ASSOCIATION_MECHANISM_TAGTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_ASSOCIATION_MESSAGESIZEELEMENTS_TAGTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_ASSOCIATION_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_ASSOCIATION_MESSAGEQUEUEPOLICY_TAGTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_ASSOCIATION_SENDSERVICES_TAGTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_ASSOCIATION_RECEIVESERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "9543d525-10d8-11df-81d9-0014222a9f79");
            MESSAGECOMRESOURCE_ASSOCIATION_ISFIXEDMESSAGESIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9543d528-10d8-11df-81d9-0014222a9f79");
            MESSAGECOMRESOURCE_ASSOCIATION_MECHANISM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9543d52b-10d8-11df-81d9-0014222a9f79");
            MESSAGECOMRESOURCE_ASSOCIATION_MESSAGESIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9543d52c-10d8-11df-81d9-0014222a9f79");
            MESSAGECOMRESOURCE_ASSOCIATION_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9543d526-10d8-11df-81d9-0014222a9f79");
            MESSAGECOMRESOURCE_ASSOCIATION_MESSAGEQUEUEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9543d527-10d8-11df-81d9-0014222a9f79");
            MESSAGECOMRESOURCE_ASSOCIATION_SENDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9543d529-10d8-11df-81d9-0014222a9f79");
            MESSAGECOMRESOURCE_ASSOCIATION_RECEIVESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9543d52a-10d8-11df-81d9-0014222a9f79");
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
