/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.parameter;

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
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << MessageComResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("4d68d116-77a3-4734-bf87-1086ae6a3617")
public class MessageComResourceParameter extends SwCommunicationResourceParameter {
    @objid ("ea5d0eed-aae6-495b-a020-04bededda66b")
    public static final String STEREOTYPE_NAME = "MessageComResource_Parameter";

    @objid ("ebac80bd-ef7e-499c-8566-c11bb2b67bd0")
    public static final String MESSAGECOMRESOURCE_PARAMETER_ISFIXEDMESSAGESIZE_TAGTYPE = "MessageComResource_Parameter_isFixedMessageSize";

    @objid ("966fa24a-4b27-4e92-b07d-aabcb8addb14")
    public static final String MESSAGECOMRESOURCE_PARAMETER_MECHANISM_TAGTYPE = "MessageComResource_Parameter_mechanism";

    @objid ("36a2e291-abee-480a-befe-0b8fbdb08f6a")
    public static final String MESSAGECOMRESOURCE_PARAMETER_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE = "MessageComResource_Parameter_messageQueueCapacityElements";

    @objid ("dec5641a-2cc3-48da-a790-808576f8bb60")
    public static final String MESSAGECOMRESOURCE_PARAMETER_MESSAGEQUEUEPOLICY_TAGTYPE = "MessageComResource_Parameter_messageQueuePolicy";

    @objid ("57e83f24-121d-4c52-8395-c707568e874c")
    public static final String MESSAGECOMRESOURCE_PARAMETER_MESSAGESIZEELEMENTS_TAGTYPE = "MessageComResource_Parameter_messageSizeElements";

    @objid ("340af8db-1e75-4057-9a38-d1aa55ce947f")
    public static final String MESSAGECOMRESOURCE_PARAMETER_RECEIVESERVICES_TAGTYPE = "MessageComResource_Parameter_receiveServices";

    @objid ("d32e67f4-e00b-4bd4-82ee-59752ef11a6d")
    public static final String MESSAGECOMRESOURCE_PARAMETER_SENDSERVICES_TAGTYPE = "MessageComResource_Parameter_sendServices";

    /**
     * Tells whether a {@link MessageComResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << MessageComResource_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("5b5e170a-5bdb-4a86-b82d-1611591742b7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MessageComResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << MessageComResource_Parameter >> then instantiate a {@link MessageComResourceParameter} proxy.
     * 
     * @return a {@link MessageComResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("ce82ca88-df49-4c42-8d1d-e88246cb9fc5")
    public static MessageComResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MessageComResourceParameter.STEREOTYPE_NAME);
        return MessageComResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link MessageComResourceParameter} proxy from a {@link Parameter} stereotyped << MessageComResource_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link MessageComResourceParameter} proxy or <i>null</i>.
     */
    @objid ("60067193-73e5-4b34-9fb1-026b85ed6804")
    public static MessageComResourceParameter instantiate(final Parameter obj) {
        return MessageComResourceParameter.canInstantiate(obj) ? new MessageComResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MessageComResourceParameter} proxy from a {@link Parameter} stereotyped << MessageComResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link MessageComResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e2f376cc-e159-4c8d-8f2f-afb9ac4a6e50")
    public static MessageComResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (MessageComResourceParameter.canInstantiate(obj))
        	return new MessageComResourceParameter(obj);
        else
        	throw new IllegalArgumentException("MessageComResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c32fba3e-09ff-4537-94b5-f9414bbb7ba9")
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
        MessageComResourceParameter other = (MessageComResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("5f66a9ed-12db-4ff0-818e-a4b74aa9a502")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'MessageComResource_Parameter_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7c35971c-495c-44de-8629-fb648dc0fb1c")
    public String getMessageComResource_Parameter_mechanism() {
        return this.elt.getTagValue(MessageComResourceParameter.MdaTypes.MESSAGECOMRESOURCE_PARAMETER_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Parameter_messageQueueCapacityElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5868da60-1407-4351-a9a1-dd0875040b11")
    public List<String> getMessageComResource_Parameter_messageQueueCapacityElements() {
        return this.elt.getTagValues(MessageComResourceParameter.MdaTypes.MESSAGECOMRESOURCE_PARAMETER_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MessageComResource_Parameter_messageQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("16c72c1c-8729-402f-a711-23fab9e1fd47")
    public String getMessageComResource_Parameter_messageQueuePolicy() {
        return this.elt.getTagValue(MessageComResourceParameter.MdaTypes.MESSAGECOMRESOURCE_PARAMETER_MESSAGEQUEUEPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Parameter_messageSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("953cd616-933c-4d92-8fd1-607eb21777b8")
    public List<String> getMessageComResource_Parameter_messageSizeElements() {
        return this.elt.getTagValues(MessageComResourceParameter.MdaTypes.MESSAGECOMRESOURCE_PARAMETER_MESSAGESIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Parameter_receiveServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6ee0f73a-a1d4-4dd3-b7e3-1c4a787e7313")
    public List<String> getMessageComResource_Parameter_receiveServices() {
        return this.elt.getTagValues(MessageComResourceParameter.MdaTypes.MESSAGECOMRESOURCE_PARAMETER_RECEIVESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Parameter_sendServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("547f7f27-d219-4afc-85d8-19ae9d28eeae")
    public List<String> getMessageComResource_Parameter_sendServices() {
        return this.elt.getTagValues(MessageComResourceParameter.MdaTypes.MESSAGECOMRESOURCE_PARAMETER_SENDSERVICES_TAGTYPE_ELT);
    }

    @objid ("adac80f3-3feb-4cba-ae01-c34336251310")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'MessageComResource_Parameter_isFixedMessageSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a730670f-e389-4298-962d-edd6043d5fc5")
    public boolean isMessageComResource_Parameter_isFixedMessageSize() {
        return this.elt.isTagged(MessageComResourceParameter.MdaTypes.MESSAGECOMRESOURCE_PARAMETER_ISFIXEDMESSAGESIZE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'MessageComResource_Parameter_isFixedMessageSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6435c9b2-d5b4-4acf-9a9e-39b915530d9d")
    public void setMessageComResource_Parameter_isFixedMessageSize(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(MessageComResourceParameter.MdaTypes.MESSAGECOMRESOURCE_PARAMETER_ISFIXEDMESSAGESIZE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(MessageComResourceParameter.MdaTypes.MESSAGECOMRESOURCE_PARAMETER_ISFIXEDMESSAGESIZE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'MessageComResource_Parameter_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("258d47c1-3ab4-42de-89b3-e3433eae56ad")
    public void setMessageComResource_Parameter_mechanism(final String value) {
        this.elt.putTagValue(MessageComResourceParameter.MdaTypes.MESSAGECOMRESOURCE_PARAMETER_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Parameter_messageQueueCapacityElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("51668ab4-8a41-483d-afa7-d128a9e45b99")
    public void setMessageComResource_Parameter_messageQueueCapacityElements(final List<String> values) {
        this.elt.putTagValues(MessageComResourceParameter.MdaTypes.MESSAGECOMRESOURCE_PARAMETER_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'MessageComResource_Parameter_messageQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e2e335f4-3244-4ba7-9aa5-97d5a999303f")
    public void setMessageComResource_Parameter_messageQueuePolicy(final String value) {
        this.elt.putTagValue(MessageComResourceParameter.MdaTypes.MESSAGECOMRESOURCE_PARAMETER_MESSAGEQUEUEPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Parameter_messageSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e7ad3551-4a16-40ae-9639-7b2f8e01d26b")
    public void setMessageComResource_Parameter_messageSizeElements(final List<String> values) {
        this.elt.putTagValues(MessageComResourceParameter.MdaTypes.MESSAGECOMRESOURCE_PARAMETER_MESSAGESIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Parameter_receiveServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d5a0cc4a-b299-43a5-b647-baea44a63788")
    public void setMessageComResource_Parameter_receiveServices(final List<String> values) {
        this.elt.putTagValues(MessageComResourceParameter.MdaTypes.MESSAGECOMRESOURCE_PARAMETER_RECEIVESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Parameter_sendServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8d8cd769-0cdf-45bd-9c94-c24cf4649657")
    public void setMessageComResource_Parameter_sendServices(final List<String> values) {
        this.elt.putTagValues(MessageComResourceParameter.MdaTypes.MESSAGECOMRESOURCE_PARAMETER_SENDSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("8a960aa1-6fe9-40c1-8d5b-8bd6f1965834")
    protected MessageComResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("c7d35e96-d753-4bbf-84d3-302cd583e165")
    public static final class MdaTypes {
        @objid ("80b4d109-2aad-4ee6-ae05-c6e6b4e23413")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bb391685-3159-40cb-8052-65aa7431f29f")
        public static TagType MESSAGECOMRESOURCE_PARAMETER_ISFIXEDMESSAGESIZE_TAGTYPE_ELT;

        @objid ("2186d70b-a2dc-4c30-b77f-522e928ee5ea")
        public static TagType MESSAGECOMRESOURCE_PARAMETER_MECHANISM_TAGTYPE_ELT;

        @objid ("8d8f2a6c-28dd-4a91-b35f-e632743b4c56")
        public static TagType MESSAGECOMRESOURCE_PARAMETER_MESSAGESIZEELEMENTS_TAGTYPE_ELT;

        @objid ("f8e1ac54-c231-4563-a8d8-9fa5dbd15233")
        public static TagType MESSAGECOMRESOURCE_PARAMETER_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT;

        @objid ("fb61430a-8ac1-4ca8-adfc-819570f68157")
        public static TagType MESSAGECOMRESOURCE_PARAMETER_MESSAGEQUEUEPOLICY_TAGTYPE_ELT;

        @objid ("ff59a557-58cb-46a8-b7d8-f36f10735e79")
        public static TagType MESSAGECOMRESOURCE_PARAMETER_SENDSERVICES_TAGTYPE_ELT;

        @objid ("c48d1628-6eb5-430a-b653-ad7c02b79fbe")
        public static TagType MESSAGECOMRESOURCE_PARAMETER_RECEIVESERVICES_TAGTYPE_ELT;

        @objid ("8f8d0044-862f-42bf-ad5e-e40591b09f4b")
        private static Stereotype MDAASSOCDEP;

        @objid ("f2b39a6b-bde6-4119-abfd-216a45e9cd39")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6ea9924c-ab05-4d8c-97f5-3665c6cd2778")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0223e3a8-0ccf-11df-8525-001302895b2b");
            MESSAGECOMRESOURCE_PARAMETER_ISFIXEDMESSAGESIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "022b0aa4-0ccf-11df-8525-001302895b2b");
            MESSAGECOMRESOURCE_PARAMETER_MECHANISM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "022b0aab-0ccf-11df-8525-001302895b2b");
            MESSAGECOMRESOURCE_PARAMETER_MESSAGESIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "022d6cf0-0ccf-11df-8525-001302895b2b");
            MESSAGECOMRESOURCE_PARAMETER_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "022d6cf7-0ccf-11df-8525-001302895b2b");
            MESSAGECOMRESOURCE_PARAMETER_MESSAGEQUEUEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "022d6cfe-0ccf-11df-8525-001302895b2b");
            MESSAGECOMRESOURCE_PARAMETER_SENDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "022d6d05-0ccf-11df-8525-001302895b2b");
            MESSAGECOMRESOURCE_PARAMETER_RECEIVESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "022d6d0c-0ccf-11df-8525-001302895b2b");
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
