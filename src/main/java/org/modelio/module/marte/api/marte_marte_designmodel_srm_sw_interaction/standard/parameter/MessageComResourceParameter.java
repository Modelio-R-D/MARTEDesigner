/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.parameter;

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
public class MessageComResourceParameter extends SwCommunicationResourceParameter {
    public static final String STEREOTYPE_NAME = "MessageComResource_Parameter";

    public static final String MESSAGECOMRESOURCE_PARAMETER_ISFIXEDMESSAGESIZE_TAGTYPE = "MessageComResource_Parameter_isFixedMessageSize";

    public static final String MESSAGECOMRESOURCE_PARAMETER_MECHANISM_TAGTYPE = "MessageComResource_Parameter_mechanism";

    public static final String MESSAGECOMRESOURCE_PARAMETER_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE = "MessageComResource_Parameter_messageQueueCapacityElements";

    public static final String MESSAGECOMRESOURCE_PARAMETER_MESSAGEQUEUEPOLICY_TAGTYPE = "MessageComResource_Parameter_messageQueuePolicy";

    public static final String MESSAGECOMRESOURCE_PARAMETER_MESSAGESIZEELEMENTS_TAGTYPE = "MessageComResource_Parameter_messageSizeElements";

    public static final String MESSAGECOMRESOURCE_PARAMETER_RECEIVESERVICES_TAGTYPE = "MessageComResource_Parameter_receiveServices";

    public static final String MESSAGECOMRESOURCE_PARAMETER_SENDSERVICES_TAGTYPE = "MessageComResource_Parameter_sendServices";

    /**
     * Tells whether a {@link MessageComResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << MessageComResource_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MessageComResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << MessageComResource_Parameter >> then instantiate a {@link MessageComResourceParameter} proxy.
     * 
     * @return a {@link MessageComResourceParameter} proxy on the created {@link Parameter}.
     */
    public static MessageComResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MessageComResourceParameter.STEREOTYPE_NAME);
        return MessageComResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link MessageComResourceParameter} proxy from a {@link Parameter} stereotyped << MessageComResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link MessageComResourceParameter} proxy or <i>null</i>.
     */
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
    public static MessageComResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (MessageComResourceParameter.canInstantiate(obj))
        	return new MessageComResourceParameter(obj);
        else
        	throw new IllegalArgumentException("MessageComResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        MessageComResourceParameter other = (MessageComResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'MessageComResource_Parameter_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getMessageComResource_Parameter_mechanism() {
        return this.elt.getTagValue(MessageComResourceParameter.MdaTypes.MESSAGECOMRESOURCE_PARAMETER_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Parameter_messageQueueCapacityElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMessageComResource_Parameter_messageQueueCapacityElements() {
        return this.elt.getTagValues(MessageComResourceParameter.MdaTypes.MESSAGECOMRESOURCE_PARAMETER_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MessageComResource_Parameter_messageQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getMessageComResource_Parameter_messageQueuePolicy() {
        return this.elt.getTagValue(MessageComResourceParameter.MdaTypes.MESSAGECOMRESOURCE_PARAMETER_MESSAGEQUEUEPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Parameter_messageSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMessageComResource_Parameter_messageSizeElements() {
        return this.elt.getTagValues(MessageComResourceParameter.MdaTypes.MESSAGECOMRESOURCE_PARAMETER_MESSAGESIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Parameter_receiveServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMessageComResource_Parameter_receiveServices() {
        return this.elt.getTagValues(MessageComResourceParameter.MdaTypes.MESSAGECOMRESOURCE_PARAMETER_RECEIVESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Parameter_sendServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMessageComResource_Parameter_sendServices() {
        return this.elt.getTagValues(MessageComResourceParameter.MdaTypes.MESSAGECOMRESOURCE_PARAMETER_SENDSERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'MessageComResource_Parameter_isFixedMessageSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isMessageComResource_Parameter_isFixedMessageSize() {
        return this.elt.isTagged(MessageComResourceParameter.MdaTypes.MESSAGECOMRESOURCE_PARAMETER_ISFIXEDMESSAGESIZE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'MessageComResource_Parameter_isFixedMessageSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
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
    public void setMessageComResource_Parameter_mechanism(final String value) {
        this.elt.putTagValue(MessageComResourceParameter.MdaTypes.MESSAGECOMRESOURCE_PARAMETER_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Parameter_messageQueueCapacityElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMessageComResource_Parameter_messageQueueCapacityElements(final List<String> values) {
        this.elt.putTagValues(MessageComResourceParameter.MdaTypes.MESSAGECOMRESOURCE_PARAMETER_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'MessageComResource_Parameter_messageQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMessageComResource_Parameter_messageQueuePolicy(final String value) {
        this.elt.putTagValue(MessageComResourceParameter.MdaTypes.MESSAGECOMRESOURCE_PARAMETER_MESSAGEQUEUEPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Parameter_messageSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMessageComResource_Parameter_messageSizeElements(final List<String> values) {
        this.elt.putTagValues(MessageComResourceParameter.MdaTypes.MESSAGECOMRESOURCE_PARAMETER_MESSAGESIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Parameter_receiveServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMessageComResource_Parameter_receiveServices(final List<String> values) {
        this.elt.putTagValues(MessageComResourceParameter.MdaTypes.MESSAGECOMRESOURCE_PARAMETER_RECEIVESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Parameter_sendServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMessageComResource_Parameter_sendServices(final List<String> values) {
        this.elt.putTagValues(MessageComResourceParameter.MdaTypes.MESSAGECOMRESOURCE_PARAMETER_SENDSERVICES_TAGTYPE_ELT, values);
    }

    protected MessageComResourceParameter(final Parameter elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_PARAMETER_ISFIXEDMESSAGESIZE_TAGTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_PARAMETER_MECHANISM_TAGTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_PARAMETER_MESSAGESIZEELEMENTS_TAGTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_PARAMETER_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_PARAMETER_MESSAGEQUEUEPOLICY_TAGTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_PARAMETER_SENDSERVICES_TAGTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_PARAMETER_RECEIVESERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
