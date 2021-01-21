/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << MessageComResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("fc8b4ee5-0757-4f59-b44f-53858f6c21fb")
public class MessageComResourceLifeline extends SwCommunicationResourceLifeline {
    @objid ("1383b176-8b4f-4296-972e-cc2580a992d8")
    public static final String STEREOTYPE_NAME = "MessageComResource_Lifeline";

    @objid ("d49d76d3-fc71-45b0-b407-375007bb0ac4")
    public static final String MESSAGECOMRESOURCE_LIFELINE_ISFIXEDMESSAGESIZE_TAGTYPE = "MessageComResource_Lifeline_isFixedMessageSize";

    @objid ("41fe69c8-3597-4288-852a-40546737d216")
    public static final String MESSAGECOMRESOURCE_LIFELINE_MECHANISM_TAGTYPE = "MessageComResource_Lifeline_mechanism";

    @objid ("1e3363e3-66b6-4c94-9a03-ef161239e773")
    public static final String MESSAGECOMRESOURCE_LIFELINE_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE = "MessageComResource_Lifeline_messageQueueCapacityElements";

    @objid ("69ff7d7d-78a0-44c8-a8bc-0b6c9f9aecdc")
    public static final String MESSAGECOMRESOURCE_LIFELINE_MESSAGEQUEUEPOLICY_TAGTYPE = "MessageComResource_Lifeline_messageQueuePolicy";

    @objid ("e12b0068-8585-4dea-a4f8-83e3b5a91a33")
    public static final String MESSAGECOMRESOURCE_LIFELINE_MESSAGESIZEELEMENTS_TAGTYPE = "MessageComResource_Lifeline_messageSizeElements";

    @objid ("d530d887-bdfa-4db5-9cbb-75baf7b6fc26")
    public static final String MESSAGECOMRESOURCE_LIFELINE_RECEIVESERVICES_TAGTYPE = "MessageComResource_Lifeline_receiveServices";

    @objid ("164e0a83-f392-4773-b4ab-ad499b08ebdd")
    public static final String MESSAGECOMRESOURCE_LIFELINE_SENDSERVICES_TAGTYPE = "MessageComResource_Lifeline_sendServices";

    /**
     * Tells whether a {@link MessageComResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << MessageComResource_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("2d7e9cc5-9403-446d-8d90-20addffc20db")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MessageComResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << MessageComResource_Lifeline >> then instantiate a {@link MessageComResourceLifeline} proxy.
     * 
     * @return a {@link MessageComResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("6678eb6a-3e9a-406a-98ac-ff9a3a8f7bc4")
    public static MessageComResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MessageComResourceLifeline.STEREOTYPE_NAME);
        return MessageComResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link MessageComResourceLifeline} proxy from a {@link Lifeline} stereotyped << MessageComResource_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link MessageComResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("5ba37a5c-14ea-4415-a004-67601df9be2b")
    public static MessageComResourceLifeline instantiate(final Lifeline obj) {
        return MessageComResourceLifeline.canInstantiate(obj) ? new MessageComResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MessageComResourceLifeline} proxy from a {@link Lifeline} stereotyped << MessageComResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link MessageComResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d0fa1555-5ed0-4580-b3f0-25368aff1e21")
    public static MessageComResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (MessageComResourceLifeline.canInstantiate(obj))
        	return new MessageComResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("MessageComResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("94fd06a5-1f0c-40eb-a307-d0da210b67e1")
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
        MessageComResourceLifeline other = (MessageComResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("41e1fcbe-46ea-4103-9a43-113ed8cad22b")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'MessageComResource_Lifeline_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("db03aba7-e778-4dff-87d0-43305ce0ca73")
    public String getMessageComResource_Lifeline_mechanism() {
        return this.elt.getTagValue(MessageComResourceLifeline.MdaTypes.MESSAGECOMRESOURCE_LIFELINE_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Lifeline_messageQueueCapacityElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ac9358f1-ff4d-413a-8e46-a31d697c3677")
    public List<String> getMessageComResource_Lifeline_messageQueueCapacityElements() {
        return this.elt.getTagValues(MessageComResourceLifeline.MdaTypes.MESSAGECOMRESOURCE_LIFELINE_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MessageComResource_Lifeline_messageQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("629cb130-edfc-42f5-ab7c-977b4ee81de8")
    public String getMessageComResource_Lifeline_messageQueuePolicy() {
        return this.elt.getTagValue(MessageComResourceLifeline.MdaTypes.MESSAGECOMRESOURCE_LIFELINE_MESSAGEQUEUEPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Lifeline_messageSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2bba1296-5b80-4434-9f2b-af4709ac785f")
    public List<String> getMessageComResource_Lifeline_messageSizeElements() {
        return this.elt.getTagValues(MessageComResourceLifeline.MdaTypes.MESSAGECOMRESOURCE_LIFELINE_MESSAGESIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Lifeline_receiveServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("840ce213-3875-42c7-aec1-0eff388185e6")
    public List<String> getMessageComResource_Lifeline_receiveServices() {
        return this.elt.getTagValues(MessageComResourceLifeline.MdaTypes.MESSAGECOMRESOURCE_LIFELINE_RECEIVESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Lifeline_sendServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3f0803f2-02d9-4b76-8a2e-9b4e7ef88c72")
    public List<String> getMessageComResource_Lifeline_sendServices() {
        return this.elt.getTagValues(MessageComResourceLifeline.MdaTypes.MESSAGECOMRESOURCE_LIFELINE_SENDSERVICES_TAGTYPE_ELT);
    }

    @objid ("9a6f2be0-6a4f-49ce-829d-e4905d2d139f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'MessageComResource_Lifeline_isFixedMessageSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("afa8efaa-361d-41cd-992d-abbab689e844")
    public boolean isMessageComResource_Lifeline_isFixedMessageSize() {
        return this.elt.isTagged(MessageComResourceLifeline.MdaTypes.MESSAGECOMRESOURCE_LIFELINE_ISFIXEDMESSAGESIZE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'MessageComResource_Lifeline_isFixedMessageSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("33f6b32e-62fd-4daf-94c2-29808126c02e")
    public void setMessageComResource_Lifeline_isFixedMessageSize(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(MessageComResourceLifeline.MdaTypes.MESSAGECOMRESOURCE_LIFELINE_ISFIXEDMESSAGESIZE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(MessageComResourceLifeline.MdaTypes.MESSAGECOMRESOURCE_LIFELINE_ISFIXEDMESSAGESIZE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'MessageComResource_Lifeline_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("53b6a142-b722-41bb-8e87-c91a02515804")
    public void setMessageComResource_Lifeline_mechanism(final String value) {
        this.elt.putTagValue(MessageComResourceLifeline.MdaTypes.MESSAGECOMRESOURCE_LIFELINE_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Lifeline_messageQueueCapacityElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8cf3c7d1-83e9-4f39-8cb6-26465c6707ef")
    public void setMessageComResource_Lifeline_messageQueueCapacityElements(final List<String> values) {
        this.elt.putTagValues(MessageComResourceLifeline.MdaTypes.MESSAGECOMRESOURCE_LIFELINE_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'MessageComResource_Lifeline_messageQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0d3a2c41-cdb9-4c47-aa08-33ccd13b6000")
    public void setMessageComResource_Lifeline_messageQueuePolicy(final String value) {
        this.elt.putTagValue(MessageComResourceLifeline.MdaTypes.MESSAGECOMRESOURCE_LIFELINE_MESSAGEQUEUEPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Lifeline_messageSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ec720465-1ac4-4796-8a3e-05895cdeb4e4")
    public void setMessageComResource_Lifeline_messageSizeElements(final List<String> values) {
        this.elt.putTagValues(MessageComResourceLifeline.MdaTypes.MESSAGECOMRESOURCE_LIFELINE_MESSAGESIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Lifeline_receiveServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f1e84c98-bb69-4d69-9d8c-2d7cccfcd4a2")
    public void setMessageComResource_Lifeline_receiveServices(final List<String> values) {
        this.elt.putTagValues(MessageComResourceLifeline.MdaTypes.MESSAGECOMRESOURCE_LIFELINE_RECEIVESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Lifeline_sendServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1493316f-da12-4e8b-b9e9-9e70f223e0ef")
    public void setMessageComResource_Lifeline_sendServices(final List<String> values) {
        this.elt.putTagValues(MessageComResourceLifeline.MdaTypes.MESSAGECOMRESOURCE_LIFELINE_SENDSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("7e52b9ce-a41d-489c-9c9f-d207c9cc79a7")
    protected MessageComResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("27cef377-b1d1-4ca6-8fd9-33e07314842c")
    public static final class MdaTypes {
        @objid ("81d11cd9-dff1-4621-93cf-388432670a6b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fbc69b58-5c0e-4a9a-86d1-7f1cc00aa232")
        public static TagType MESSAGECOMRESOURCE_LIFELINE_ISFIXEDMESSAGESIZE_TAGTYPE_ELT;

        @objid ("ff8b8b7f-1c2e-47b3-bdeb-036f6a20f63d")
        public static TagType MESSAGECOMRESOURCE_LIFELINE_MECHANISM_TAGTYPE_ELT;

        @objid ("eaafed3c-3bc6-405c-928d-7e829e978f18")
        public static TagType MESSAGECOMRESOURCE_LIFELINE_MESSAGESIZEELEMENTS_TAGTYPE_ELT;

        @objid ("be614e32-d280-4b36-9f7e-8f04c05f00c2")
        public static TagType MESSAGECOMRESOURCE_LIFELINE_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT;

        @objid ("0e0ba812-89be-44e2-8446-5f9de016edd5")
        public static TagType MESSAGECOMRESOURCE_LIFELINE_MESSAGEQUEUEPOLICY_TAGTYPE_ELT;

        @objid ("abf8eed0-3d48-4375-bc25-7296301ce172")
        public static TagType MESSAGECOMRESOURCE_LIFELINE_SENDSERVICES_TAGTYPE_ELT;

        @objid ("13792fad-5a60-4595-ab03-b9281bc2c781")
        public static TagType MESSAGECOMRESOURCE_LIFELINE_RECEIVESERVICES_TAGTYPE_ELT;

        @objid ("b5780874-ed5d-48ef-bd53-ff659828a3b7")
        private static Stereotype MDAASSOCDEP;

        @objid ("a2bb3283-b994-481a-898d-562a9da7352d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1e819c63-3d35-4992-84f9-fd1a97c9f7ac")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "9562d3de-10d8-11df-81d9-0014222a9f79");
            MESSAGECOMRESOURCE_LIFELINE_ISFIXEDMESSAGESIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9562d3e1-10d8-11df-81d9-0014222a9f79");
            MESSAGECOMRESOURCE_LIFELINE_MECHANISM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9562d3e4-10d8-11df-81d9-0014222a9f79");
            MESSAGECOMRESOURCE_LIFELINE_MESSAGESIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9562d3e5-10d8-11df-81d9-0014222a9f79");
            MESSAGECOMRESOURCE_LIFELINE_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9562d3df-10d8-11df-81d9-0014222a9f79");
            MESSAGECOMRESOURCE_LIFELINE_MESSAGEQUEUEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9562d3e0-10d8-11df-81d9-0014222a9f79");
            MESSAGECOMRESOURCE_LIFELINE_SENDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9562d3e2-10d8-11df-81d9-0014222a9f79");
            MESSAGECOMRESOURCE_LIFELINE_RECEIVESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9562d3e3-10d8-11df-81d9-0014222a9f79");
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
