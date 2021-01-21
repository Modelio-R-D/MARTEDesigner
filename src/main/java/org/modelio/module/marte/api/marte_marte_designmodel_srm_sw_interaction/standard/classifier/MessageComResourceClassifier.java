/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.classifier;

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
@objid ("d23f2eb9-8698-4d94-8859-61852980c5d1")
public class MessageComResourceClassifier extends SwCommunicationResourceClassifier {
    @objid ("16753185-b7c9-4896-ac78-c7e5f173f1a3")
    public static final String STEREOTYPE_NAME = "MessageComResource_Classifier";

    @objid ("a7191d64-492b-4b64-bd70-7106f77bf435")
    public static final String MESSAGECOMRESOURCE_CLASSIFIER_ISFIXEDMESSAGESIZE_TAGTYPE = "MessageComResource_Classifier_isFixedMessageSize";

    @objid ("12c3830e-888a-4725-8593-3b4560d34e34")
    public static final String MESSAGECOMRESOURCE_CLASSIFIER_MECHANISM_TAGTYPE = "MessageComResource_Classifier_mechanism";

    @objid ("0b2bddfc-e0db-4d1c-99f5-d2774faea547")
    public static final String MESSAGECOMRESOURCE_CLASSIFIER_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE = "MessageComResource_Classifier_messageQueueCapacityElements";

    @objid ("06981efb-90a9-4660-96f7-80e6331622ba")
    public static final String MESSAGECOMRESOURCE_CLASSIFIER_MESSAGEQUEUEPOLICY_TAGTYPE = "MessageComResource_Classifier_messageQueuePolicy";

    @objid ("9ec11011-46a0-4d35-b8c7-426216978ab8")
    public static final String MESSAGECOMRESOURCE_CLASSIFIER_MESSAGESIZEELEMENTS_TAGTYPE = "MessageComResource_Classifier_messageSizeElements";

    @objid ("cde741e5-4e0e-457f-aa3e-8a979ee7879b")
    public static final String MESSAGECOMRESOURCE_CLASSIFIER_RECEIVESERVICES_TAGTYPE = "MessageComResource_Classifier_receiveServices";

    @objid ("6a4086f3-a332-46a4-8317-5ede731ce3ee")
    public static final String MESSAGECOMRESOURCE_CLASSIFIER_SENDSERVICES_TAGTYPE = "MessageComResource_Classifier_sendServices";

    /**
     * Tells whether a {@link MessageComResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << MessageComResource_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e42bbca4-f78a-48e4-84d8-a89631cba00e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MessageComResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << MessageComResource_Classifier >> then instantiate a {@link MessageComResourceClassifier} proxy.
     * 
     * @return a {@link MessageComResourceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("9c42701c-e960-422e-9a49-349d83b71267")
    public static MessageComResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MessageComResourceClassifier.STEREOTYPE_NAME);
        return MessageComResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link MessageComResourceClassifier} proxy from a {@link Classifier} stereotyped << MessageComResource_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link MessageComResourceClassifier} proxy or <i>null</i>.
     */
    @objid ("f26d6ad7-3fb7-4ba3-abbb-71aaeb9d751c")
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
    @objid ("d31ec952-6cf5-4cf3-bb81-842aff603af0")
    public static MessageComResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (MessageComResourceClassifier.canInstantiate(obj))
        	return new MessageComResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("MessageComResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0e8be372-c552-47b1-85d4-4c2cfcd2919b")
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
    @objid ("6e694a57-4fec-46f7-b5e8-73cbfe39857f")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'MessageComResource_Classifier_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("898698cd-9188-4336-8c2d-1e9101bb9851")
    public String getMessageComResource_Classifier_mechanism() {
        return this.elt.getTagValue(MessageComResourceClassifier.MdaTypes.MESSAGECOMRESOURCE_CLASSIFIER_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Classifier_messageQueueCapacityElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("79fcf2f4-65fb-441e-9a72-d8d09ec32771")
    public List<String> getMessageComResource_Classifier_messageQueueCapacityElements() {
        return this.elt.getTagValues(MessageComResourceClassifier.MdaTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MessageComResource_Classifier_messageQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8abe0fb9-27a9-48c4-958f-592d15a2ff91")
    public String getMessageComResource_Classifier_messageQueuePolicy() {
        return this.elt.getTagValue(MessageComResourceClassifier.MdaTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGEQUEUEPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Classifier_messageSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("801a527d-83ba-4617-a97f-7f8b781d8595")
    public List<String> getMessageComResource_Classifier_messageSizeElements() {
        return this.elt.getTagValues(MessageComResourceClassifier.MdaTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGESIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Classifier_receiveServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("40635699-fdaa-4224-968c-89237978aba5")
    public List<String> getMessageComResource_Classifier_receiveServices() {
        return this.elt.getTagValues(MessageComResourceClassifier.MdaTypes.MESSAGECOMRESOURCE_CLASSIFIER_RECEIVESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Classifier_sendServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("fb753037-8c9e-4de3-9c03-06ca56c96334")
    public List<String> getMessageComResource_Classifier_sendServices() {
        return this.elt.getTagValues(MessageComResourceClassifier.MdaTypes.MESSAGECOMRESOURCE_CLASSIFIER_SENDSERVICES_TAGTYPE_ELT);
    }

    @objid ("488d72fe-03f6-4a0b-b34b-9aa99bf67660")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'MessageComResource_Classifier_isFixedMessageSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d853e177-163a-4af1-adbd-af3903800268")
    public boolean isMessageComResource_Classifier_isFixedMessageSize() {
        return this.elt.isTagged(MessageComResourceClassifier.MdaTypes.MESSAGECOMRESOURCE_CLASSIFIER_ISFIXEDMESSAGESIZE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'MessageComResource_Classifier_isFixedMessageSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1a76ae3f-b566-4775-971b-f78462103ee5")
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
    @objid ("2dd6d9a0-2fde-4fc6-b27a-15d2711c1b58")
    public void setMessageComResource_Classifier_mechanism(final String value) {
        this.elt.putTagValue(MessageComResourceClassifier.MdaTypes.MESSAGECOMRESOURCE_CLASSIFIER_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Classifier_messageQueueCapacityElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1f294e08-7c19-4a61-bc57-7c3a1327a127")
    public void setMessageComResource_Classifier_messageQueueCapacityElements(final List<String> values) {
        this.elt.putTagValues(MessageComResourceClassifier.MdaTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'MessageComResource_Classifier_messageQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("62d7dd11-9311-41b6-b788-a898c65e153a")
    public void setMessageComResource_Classifier_messageQueuePolicy(final String value) {
        this.elt.putTagValue(MessageComResourceClassifier.MdaTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGEQUEUEPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Classifier_messageSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3de7ccc0-c600-4f03-9b1c-47e5e18c013b")
    public void setMessageComResource_Classifier_messageSizeElements(final List<String> values) {
        this.elt.putTagValues(MessageComResourceClassifier.MdaTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGESIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Classifier_receiveServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4b955ec0-e653-461d-9a53-0a003056f874")
    public void setMessageComResource_Classifier_receiveServices(final List<String> values) {
        this.elt.putTagValues(MessageComResourceClassifier.MdaTypes.MESSAGECOMRESOURCE_CLASSIFIER_RECEIVESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Classifier_sendServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("089ea66b-214b-4eea-8737-7aea1232e178")
    public void setMessageComResource_Classifier_sendServices(final List<String> values) {
        this.elt.putTagValues(MessageComResourceClassifier.MdaTypes.MESSAGECOMRESOURCE_CLASSIFIER_SENDSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("111d3e6a-7d9e-4e21-bb47-655e2edd4595")
    protected MessageComResourceClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("60fa7d6d-af21-44a8-b981-813f51b1a99b")
    public static final class MdaTypes {
        @objid ("8e3e2292-d52f-44ca-87aa-1146eac16fa3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2e247b35-c9ab-4afa-aa4a-322ebddd5d3e")
        public static TagType MESSAGECOMRESOURCE_CLASSIFIER_ISFIXEDMESSAGESIZE_TAGTYPE_ELT;

        @objid ("1fc479d6-92f1-451c-9de5-6e047130184f")
        public static TagType MESSAGECOMRESOURCE_CLASSIFIER_MECHANISM_TAGTYPE_ELT;

        @objid ("fad17933-07ed-47aa-814a-27f73f7177f4")
        public static TagType MESSAGECOMRESOURCE_CLASSIFIER_MESSAGESIZEELEMENTS_TAGTYPE_ELT;

        @objid ("a46c03df-cf65-46eb-8687-756573781f66")
        public static TagType MESSAGECOMRESOURCE_CLASSIFIER_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT;

        @objid ("1ee9c1db-2f4f-4fcc-8125-b4b21dfee902")
        public static TagType MESSAGECOMRESOURCE_CLASSIFIER_MESSAGEQUEUEPOLICY_TAGTYPE_ELT;

        @objid ("8af2c411-563f-462d-9f08-219f3712f82b")
        public static TagType MESSAGECOMRESOURCE_CLASSIFIER_SENDSERVICES_TAGTYPE_ELT;

        @objid ("55d28568-0451-4a4b-a067-65b5c879ebe2")
        public static TagType MESSAGECOMRESOURCE_CLASSIFIER_RECEIVESERVICES_TAGTYPE_ELT;

        @objid ("1cd28004-1cbc-459b-af52-2a61d8144451")
        private static Stereotype MDAASSOCDEP;

        @objid ("191e271a-1208-4dce-ae54-b809d9d6cb0e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("beeeff57-f491-4185-8546-1873d69bda61")
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
