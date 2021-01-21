/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.associationend;

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
@objid ("1ca52582-48e9-45d0-b2e4-78e1262452e0")
public class MessageComResourceAssociationEnd extends SwCommunicationResourceAssociationEnd {
    @objid ("7ddbc973-1526-4e00-8b6f-d3e64a42dfc0")
    public static final String STEREOTYPE_NAME = "MessageComResource_AssociationEnd";

    @objid ("d787ec06-128a-447d-87cf-01cac6935ea5")
    public static final String MESSAGECOMRESOURCE_ASSOCIATIONEND_ISFIXEDMESSAGESIZE_TAGTYPE = "MessageComResource_AssociationEnd_isFixedMessageSize";

    @objid ("2f6f258d-03ed-4717-a315-1acad4216cd6")
    public static final String MESSAGECOMRESOURCE_ASSOCIATIONEND_MECHANISM_TAGTYPE = "MessageComResource_AssociationEnd_mechanism";

    @objid ("0ee428f9-2266-4623-b450-50b367a8a6f7")
    public static final String MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE = "MessageComResource_AssociationEnd_messageQueueCapacityElements";

    @objid ("aac6dbe8-edd4-4aba-872f-5d76f00f5ca9")
    public static final String MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGEQUEUEPOLICY_TAGTYPE = "MessageComResource_AssociationEnd_messageQueuePolicy";

    @objid ("5247aa81-ed40-4665-8a3d-193eb8bd7ef6")
    public static final String MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGESIZEELEMENTS_TAGTYPE = "MessageComResource_AssociationEnd_messageSizeElements";

    @objid ("c7e91439-a4a6-40d5-aac1-70a13e7e1bf6")
    public static final String MESSAGECOMRESOURCE_ASSOCIATIONEND_RECEIVESERVICES_TAGTYPE = "MessageComResource_AssociationEnd_receiveServices";

    @objid ("9f7f7856-47f6-4ad0-b6b8-ab5fd8e56d9d")
    public static final String MESSAGECOMRESOURCE_ASSOCIATIONEND_SENDSERVICES_TAGTYPE = "MessageComResource_AssociationEnd_sendServices";

    /**
     * Tells whether a {@link MessageComResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << MessageComResource_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("73da8548-4f77-4026-bc70-fd3650d89149")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MessageComResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << MessageComResource_AssociationEnd >> then instantiate a {@link MessageComResourceAssociationEnd} proxy.
     * 
     * @return a {@link MessageComResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("9b067683-7e3b-482a-b61d-a773ee8b285b")
    public static MessageComResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MessageComResourceAssociationEnd.STEREOTYPE_NAME);
        return MessageComResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link MessageComResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << MessageComResource_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link MessageComResourceAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("46296f58-83ac-4b40-a33a-6bf85ca2beb8")
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
    @objid ("ac2617ef-9c96-4670-8a4c-023dfe276ea1")
    public static MessageComResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (MessageComResourceAssociationEnd.canInstantiate(obj))
        	return new MessageComResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("MessageComResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("50f4c5f7-e957-4224-a422-da9f38957f0f")
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
    @objid ("52d662c6-4313-4f7f-a5d6-e3411efcccac")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'MessageComResource_AssociationEnd_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("be6dab9b-7251-49b3-b347-882e7cc64fdc")
    public String getMessageComResource_AssociationEnd_mechanism() {
        return this.elt.getTagValue(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_AssociationEnd_messageQueueCapacityElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1c9564ce-236d-4746-a272-7f93e17a30d7")
    public List<String> getMessageComResource_AssociationEnd_messageQueueCapacityElements() {
        return this.elt.getTagValues(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MessageComResource_AssociationEnd_messageQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6d8b6888-e92f-4462-ac17-e0065be7ef1b")
    public String getMessageComResource_AssociationEnd_messageQueuePolicy() {
        return this.elt.getTagValue(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGEQUEUEPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_AssociationEnd_messageSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("7c5cd635-b28f-4dab-97c6-02cdf1e343ab")
    public List<String> getMessageComResource_AssociationEnd_messageSizeElements() {
        return this.elt.getTagValues(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGESIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_AssociationEnd_receiveServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9dd66f72-6e5a-46bf-9f5e-cd1c9ac04420")
    public List<String> getMessageComResource_AssociationEnd_receiveServices() {
        return this.elt.getTagValues(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_RECEIVESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_AssociationEnd_sendServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ec608d91-f140-4605-a7c2-3a5f4460eb70")
    public List<String> getMessageComResource_AssociationEnd_sendServices() {
        return this.elt.getTagValues(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_SENDSERVICES_TAGTYPE_ELT);
    }

    @objid ("9ff1a058-659d-44db-aff0-6c0947e4ecf1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'MessageComResource_AssociationEnd_isFixedMessageSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c1f282de-8b76-4193-9c56-cd54ccc4f2a1")
    public boolean isMessageComResource_AssociationEnd_isFixedMessageSize() {
        return this.elt.isTagged(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_ISFIXEDMESSAGESIZE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'MessageComResource_AssociationEnd_isFixedMessageSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4a6c0dce-9735-4763-b007-b3888e656b95")
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
    @objid ("ff63ade0-42b0-468f-b6fc-72931da80904")
    public void setMessageComResource_AssociationEnd_mechanism(final String value) {
        this.elt.putTagValue(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MessageComResource_AssociationEnd_messageQueueCapacityElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("05c814ab-42b1-4c54-9192-e27397b113e1")
    public void setMessageComResource_AssociationEnd_messageQueueCapacityElements(final List<String> values) {
        this.elt.putTagValues(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'MessageComResource_AssociationEnd_messageQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e3dd2cd7-5b64-4899-847b-e063d8df0af6")
    public void setMessageComResource_AssociationEnd_messageQueuePolicy(final String value) {
        this.elt.putTagValue(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGEQUEUEPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MessageComResource_AssociationEnd_messageSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c3d26ad7-300c-4b3f-91b3-a16b52b4a0ef")
    public void setMessageComResource_AssociationEnd_messageSizeElements(final List<String> values) {
        this.elt.putTagValues(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGESIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MessageComResource_AssociationEnd_receiveServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1f407a1e-7d16-4531-b81a-5c25f644143a")
    public void setMessageComResource_AssociationEnd_receiveServices(final List<String> values) {
        this.elt.putTagValues(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_RECEIVESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MessageComResource_AssociationEnd_sendServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("223f7313-d35f-4790-a482-1fc7b6727390")
    public void setMessageComResource_AssociationEnd_sendServices(final List<String> values) {
        this.elt.putTagValues(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_SENDSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("f0cf706d-8eec-4f60-b007-669720b6d23f")
    protected MessageComResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("2b3adba4-2512-42c5-96b5-f5e9221433e0")
    public static final class MdaTypes {
        @objid ("a50d613c-77a4-4a68-819e-f3ca4f0621d9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e8f54a6a-a106-43a3-93c1-2f820f8bd757")
        public static TagType MESSAGECOMRESOURCE_ASSOCIATIONEND_ISFIXEDMESSAGESIZE_TAGTYPE_ELT;

        @objid ("1f19427c-7d12-455d-858e-46273e7237a7")
        public static TagType MESSAGECOMRESOURCE_ASSOCIATIONEND_MECHANISM_TAGTYPE_ELT;

        @objid ("c226bb59-5b11-4c03-a891-1f137b1e6831")
        public static TagType MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGESIZEELEMENTS_TAGTYPE_ELT;

        @objid ("d5eea340-cc6b-4619-8f78-d326686939bc")
        public static TagType MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT;

        @objid ("37928e2e-148d-4c55-8303-835456281add")
        public static TagType MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGEQUEUEPOLICY_TAGTYPE_ELT;

        @objid ("f5e2ee93-da40-45e9-aa0b-6a13f37d78d1")
        public static TagType MESSAGECOMRESOURCE_ASSOCIATIONEND_SENDSERVICES_TAGTYPE_ELT;

        @objid ("ff8e6e2e-90f5-49cc-91d1-3fa5fbebc357")
        public static TagType MESSAGECOMRESOURCE_ASSOCIATIONEND_RECEIVESERVICES_TAGTYPE_ELT;

        @objid ("aa8bcea7-00c5-463b-a290-299f39b007fc")
        private static Stereotype MDAASSOCDEP;

        @objid ("7038dcc4-be03-43ef-9805-232fa2842d64")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8cde56f5-4cd6-43ef-b806-2e6e91619a34")
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
