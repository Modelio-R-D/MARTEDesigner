/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.classifier;

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
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << MessageComResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class MessageComResourceClassifier extends SwCommunicationResourceClassifier {
    public static final String STEREOTYPE_NAME = "MessageComResource_Classifier";

    public static final String MESSAGECOMRESOURCE_CLASSIFIER_ISFIXEDMESSAGESIZE_TAGTYPE = "MessageComResource_Classifier_isFixedMessageSize";

    public static final String MESSAGECOMRESOURCE_CLASSIFIER_MECHANISM_TAGTYPE = "MessageComResource_Classifier_mechanism";

    public static final String MESSAGECOMRESOURCE_CLASSIFIER_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE = "MessageComResource_Classifier_messageQueueCapacityElements";

    public static final String MESSAGECOMRESOURCE_CLASSIFIER_MESSAGEQUEUEPOLICY_TAGTYPE = "MessageComResource_Classifier_messageQueuePolicy";

    public static final String MESSAGECOMRESOURCE_CLASSIFIER_MESSAGESIZEELEMENTS_TAGTYPE = "MessageComResource_Classifier_messageSizeElements";

    public static final String MESSAGECOMRESOURCE_CLASSIFIER_RECEIVESERVICES_TAGTYPE = "MessageComResource_Classifier_receiveServices";

    public static final String MESSAGECOMRESOURCE_CLASSIFIER_SENDSERVICES_TAGTYPE = "MessageComResource_Classifier_sendServices";

    /**
     * Tells whether a {@link MessageComResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << MessageComResource_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MessageComResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << MessageComResource_Classifier >> then instantiate a {@link MessageComResourceClassifier} proxy.
     * 
     * @return a {@link MessageComResourceClassifier} proxy on the created {@link Classifier}.
     */
    public static MessageComResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MessageComResourceClassifier.STEREOTYPE_NAME);
        return MessageComResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link MessageComResourceClassifier} proxy from a {@link Classifier} stereotyped << MessageComResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link MessageComResourceClassifier} proxy or <i>null</i>.
     */
    public static MessageComResourceClassifier instantiate(final Classifier obj) {
        return MessageComResourceClassifier.canInstantiate(obj) ? new MessageComResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MessageComResourceClassifier} proxy from a {@link Classifier} stereotyped << MessageComResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link MessageComResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static MessageComResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (MessageComResourceClassifier.canInstantiate(obj))
        	return new MessageComResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("MessageComResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        MessageComResourceClassifier other = (MessageComResourceClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'MessageComResource_Classifier_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getMessageComResource_Classifier_mechanism() {
        return this.elt.getTagValue(MessageComResourceClassifier.MdaTypes.MESSAGECOMRESOURCE_CLASSIFIER_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Classifier_messageQueueCapacityElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMessageComResource_Classifier_messageQueueCapacityElements() {
        return this.elt.getTagValues(MessageComResourceClassifier.MdaTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MessageComResource_Classifier_messageQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getMessageComResource_Classifier_messageQueuePolicy() {
        return this.elt.getTagValue(MessageComResourceClassifier.MdaTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGEQUEUEPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Classifier_messageSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMessageComResource_Classifier_messageSizeElements() {
        return this.elt.getTagValues(MessageComResourceClassifier.MdaTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGESIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Classifier_receiveServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMessageComResource_Classifier_receiveServices() {
        return this.elt.getTagValues(MessageComResourceClassifier.MdaTypes.MESSAGECOMRESOURCE_CLASSIFIER_RECEIVESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Classifier_sendServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMessageComResource_Classifier_sendServices() {
        return this.elt.getTagValues(MessageComResourceClassifier.MdaTypes.MESSAGECOMRESOURCE_CLASSIFIER_SENDSERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'MessageComResource_Classifier_isFixedMessageSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isMessageComResource_Classifier_isFixedMessageSize() {
        return this.elt.isTagged(MessageComResourceClassifier.MdaTypes.MESSAGECOMRESOURCE_CLASSIFIER_ISFIXEDMESSAGESIZE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'MessageComResource_Classifier_isFixedMessageSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMessageComResource_Classifier_isFixedMessageSize(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(MessageComResourceClassifier.MdaTypes.MESSAGECOMRESOURCE_CLASSIFIER_ISFIXEDMESSAGESIZE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(MessageComResourceClassifier.MdaTypes.MESSAGECOMRESOURCE_CLASSIFIER_ISFIXEDMESSAGESIZE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'MessageComResource_Classifier_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMessageComResource_Classifier_mechanism(final String value) {
        this.elt.putTagValue(MessageComResourceClassifier.MdaTypes.MESSAGECOMRESOURCE_CLASSIFIER_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Classifier_messageQueueCapacityElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMessageComResource_Classifier_messageQueueCapacityElements(final List<String> values) {
        this.elt.putTagValues(MessageComResourceClassifier.MdaTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'MessageComResource_Classifier_messageQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMessageComResource_Classifier_messageQueuePolicy(final String value) {
        this.elt.putTagValue(MessageComResourceClassifier.MdaTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGEQUEUEPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Classifier_messageSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMessageComResource_Classifier_messageSizeElements(final List<String> values) {
        this.elt.putTagValues(MessageComResourceClassifier.MdaTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGESIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Classifier_receiveServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMessageComResource_Classifier_receiveServices(final List<String> values) {
        this.elt.putTagValues(MessageComResourceClassifier.MdaTypes.MESSAGECOMRESOURCE_CLASSIFIER_RECEIVESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Classifier_sendServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMessageComResource_Classifier_sendServices(final List<String> values) {
        this.elt.putTagValues(MessageComResourceClassifier.MdaTypes.MESSAGECOMRESOURCE_CLASSIFIER_SENDSERVICES_TAGTYPE_ELT, values);
    }

    protected MessageComResourceClassifier(final Classifier elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_CLASSIFIER_ISFIXEDMESSAGESIZE_TAGTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_CLASSIFIER_MECHANISM_TAGTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_CLASSIFIER_MESSAGESIZEELEMENTS_TAGTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_CLASSIFIER_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_CLASSIFIER_MESSAGEQUEUEPOLICY_TAGTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_CLASSIFIER_SENDSERVICES_TAGTYPE_ELT;

        public static TagType MESSAGECOMRESOURCE_CLASSIFIER_RECEIVESERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "957f703a-10d8-11df-81d9-0014222a9f79");
            MESSAGECOMRESOURCE_CLASSIFIER_ISFIXEDMESSAGESIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9581d299-10d8-11df-81d9-0014222a9f79");
            MESSAGECOMRESOURCE_CLASSIFIER_MECHANISM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9581d29c-10d8-11df-81d9-0014222a9f79");
            MESSAGECOMRESOURCE_CLASSIFIER_MESSAGESIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9581d29d-10d8-11df-81d9-0014222a9f79");
            MESSAGECOMRESOURCE_CLASSIFIER_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9581d297-10d8-11df-81d9-0014222a9f79");
            MESSAGECOMRESOURCE_CLASSIFIER_MESSAGEQUEUEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9581d298-10d8-11df-81d9-0014222a9f79");
            MESSAGECOMRESOURCE_CLASSIFIER_SENDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9581d29a-10d8-11df-81d9-0014222a9f79");
            MESSAGECOMRESOURCE_CLASSIFIER_RECEIVESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9581d29b-10d8-11df-81d9-0014222a9f79");
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
