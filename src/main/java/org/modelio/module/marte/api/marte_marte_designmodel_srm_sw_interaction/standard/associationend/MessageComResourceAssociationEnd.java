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
    @objid ("e135f747-6414-4242-9db8-86d805b4d5f6")
    public static final String STEREOTYPE_NAME = "MessageComResource_AssociationEnd";

    @objid ("e85fed44-7916-4f8a-b31d-4b8b44b89dd2")
    public static final String MESSAGECOMRESOURCE_ASSOCIATIONEND_ISFIXEDMESSAGESIZE_TAGTYPE = "MessageComResource_AssociationEnd_isFixedMessageSize";

    @objid ("1b6877bf-2351-49ad-a5f4-d5ffab7f57fc")
    public static final String MESSAGECOMRESOURCE_ASSOCIATIONEND_MECHANISM_TAGTYPE = "MessageComResource_AssociationEnd_mechanism";

    @objid ("a68a48aa-405b-4dfb-84af-8ddbe70ece42")
    public static final String MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE = "MessageComResource_AssociationEnd_messageQueueCapacityElements";

    @objid ("54071e0e-ab1d-43b9-b8a5-e85701a6260f")
    public static final String MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGEQUEUEPOLICY_TAGTYPE = "MessageComResource_AssociationEnd_messageQueuePolicy";

    @objid ("50973e95-8e53-4e30-9937-adfb13ef432e")
    public static final String MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGESIZEELEMENTS_TAGTYPE = "MessageComResource_AssociationEnd_messageSizeElements";

    @objid ("8ad5d1e5-148d-4d34-a133-31811be844ed")
    public static final String MESSAGECOMRESOURCE_ASSOCIATIONEND_RECEIVESERVICES_TAGTYPE = "MessageComResource_AssociationEnd_receiveServices";

    @objid ("304679c4-5199-4f47-b69e-8e2ea48291a1")
    public static final String MESSAGECOMRESOURCE_ASSOCIATIONEND_SENDSERVICES_TAGTYPE = "MessageComResource_AssociationEnd_sendServices";

    /**
     * Tells whether a {@link MessageComResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << MessageComResource_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("126a1281-0629-4196-a499-5ceed6c9f443")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MessageComResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << MessageComResource_AssociationEnd >> then instantiate a {@link MessageComResourceAssociationEnd} proxy.
     * 
     * @return a {@link MessageComResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("199c4511-6f43-4f18-8a61-24761a47b203")
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
    @objid ("a30d6c77-f19e-40d5-83d4-1d0b39532e27")
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
    @objid ("9f298c70-56e3-479b-a923-e1bc441faa97")
    public static MessageComResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (MessageComResourceAssociationEnd.canInstantiate(obj))
        	return new MessageComResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("MessageComResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2be84cae-6b24-4fd5-9049-138fd4b1e522")
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
    @objid ("9a79b92d-b95c-467f-a4a7-90313801e442")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'MessageComResource_AssociationEnd_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("28f3905e-2d7c-4079-b02a-8489bd15d47b")
    public String getMessageComResource_AssociationEnd_mechanism() {
        return this.elt.getTagValue(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_AssociationEnd_messageQueueCapacityElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("56ad62aa-0231-4eea-89e6-045a88e9cd30")
    public List<String> getMessageComResource_AssociationEnd_messageQueueCapacityElements() {
        return this.elt.getTagValues(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MessageComResource_AssociationEnd_messageQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0b94a955-ddd2-4277-8710-7e74cf3c158a")
    public String getMessageComResource_AssociationEnd_messageQueuePolicy() {
        return this.elt.getTagValue(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGEQUEUEPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_AssociationEnd_messageSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("de5aa9b5-9d2e-40f4-85b0-5cdf220ad52e")
    public List<String> getMessageComResource_AssociationEnd_messageSizeElements() {
        return this.elt.getTagValues(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGESIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_AssociationEnd_receiveServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0b0fc755-666e-44c8-be79-de9628a98609")
    public List<String> getMessageComResource_AssociationEnd_receiveServices() {
        return this.elt.getTagValues(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_RECEIVESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_AssociationEnd_sendServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b7b21ff6-0de5-4f7f-9876-b14e78e13a24")
    public List<String> getMessageComResource_AssociationEnd_sendServices() {
        return this.elt.getTagValues(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_SENDSERVICES_TAGTYPE_ELT);
    }

    @objid ("255f4c3d-78f7-4e7a-b09d-fac736bfc3dd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'MessageComResource_AssociationEnd_isFixedMessageSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4e064461-6287-422e-99d0-aee3f25a986d")
    public boolean isMessageComResource_AssociationEnd_isFixedMessageSize() {
        return this.elt.isTagged(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_ISFIXEDMESSAGESIZE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'MessageComResource_AssociationEnd_isFixedMessageSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("306a09ce-76b6-4f80-80cf-5483a087e72c")
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
    @objid ("a58bf9fd-742d-497e-8318-ada2e04f2d8d")
    public void setMessageComResource_AssociationEnd_mechanism(final String value) {
        this.elt.putTagValue(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MessageComResource_AssociationEnd_messageQueueCapacityElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("653014a9-44ea-4db9-b4d2-982ecea2a72f")
    public void setMessageComResource_AssociationEnd_messageQueueCapacityElements(final List<String> values) {
        this.elt.putTagValues(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'MessageComResource_AssociationEnd_messageQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1ab4460a-296c-4648-891a-c22e00a47fb4")
    public void setMessageComResource_AssociationEnd_messageQueuePolicy(final String value) {
        this.elt.putTagValue(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGEQUEUEPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MessageComResource_AssociationEnd_messageSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4020353b-cea8-4d03-a30b-cb511a6e9241")
    public void setMessageComResource_AssociationEnd_messageSizeElements(final List<String> values) {
        this.elt.putTagValues(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGESIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MessageComResource_AssociationEnd_receiveServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("912f7dbc-5615-47eb-882d-82cb0c792ff6")
    public void setMessageComResource_AssociationEnd_receiveServices(final List<String> values) {
        this.elt.putTagValues(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_RECEIVESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MessageComResource_AssociationEnd_sendServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3a779dc2-38a7-4d15-bc3a-e65ae9080615")
    public void setMessageComResource_AssociationEnd_sendServices(final List<String> values) {
        this.elt.putTagValues(MessageComResourceAssociationEnd.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATIONEND_SENDSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("dfc78f00-2c19-4c2c-9418-8294c790f10c")
    protected MessageComResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("2b3adba4-2512-42c5-96b5-f5e9221433e0")
    public static final class MdaTypes {
        @objid ("69a9b9e4-fffb-4421-8543-8e5a8044aa3e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c40988ec-1bc2-4b00-ab74-bfe60b7c1939")
        public static TagType MESSAGECOMRESOURCE_ASSOCIATIONEND_ISFIXEDMESSAGESIZE_TAGTYPE_ELT;

        @objid ("779b9a48-fa57-4cb2-a3e2-17c4a43ee926")
        public static TagType MESSAGECOMRESOURCE_ASSOCIATIONEND_MECHANISM_TAGTYPE_ELT;

        @objid ("e6ee9b4b-e95b-4abd-a098-d680e5b4419e")
        public static TagType MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGESIZEELEMENTS_TAGTYPE_ELT;

        @objid ("d2c9cd64-07ef-4aaa-a544-382c02256b4d")
        public static TagType MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT;

        @objid ("aa025c27-b332-4dd5-bc90-7be6d397567c")
        public static TagType MESSAGECOMRESOURCE_ASSOCIATIONEND_MESSAGEQUEUEPOLICY_TAGTYPE_ELT;

        @objid ("a04a14e5-dcda-4e93-86b5-643b539c88cb")
        public static TagType MESSAGECOMRESOURCE_ASSOCIATIONEND_SENDSERVICES_TAGTYPE_ELT;

        @objid ("60434e71-d845-4d27-8ea9-3f860b3a111e")
        public static TagType MESSAGECOMRESOURCE_ASSOCIATIONEND_RECEIVESERVICES_TAGTYPE_ELT;

        @objid ("ced98fcc-360a-4e03-b8c4-0a61b23239b3")
        private static Stereotype MDAASSOCDEP;

        @objid ("f99ef8bd-1bf2-4b6c-bad9-a0ea0139e610")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7795ce20-51ce-4546-8e4d-abe4a4ca82dc")
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
