/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.association;

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
@objid ("150951fd-c130-4b2e-b67a-e0075a6e799c")
public class MessageComResourceAssociation extends SwCommunicationResourceAssociation {
    @objid ("3c133b92-15bb-4ba1-a880-9388b7a07600")
    public static final String STEREOTYPE_NAME = "MessageComResource_Association";

    @objid ("afb61265-a1b9-45de-b58b-93889fafde40")
    public static final String MESSAGECOMRESOURCE_ASSOCIATION_ISFIXEDMESSAGESIZE_TAGTYPE = "MessageComResource_Association_isFixedMessageSize";

    @objid ("10f6fe4d-5d23-4259-99e5-3b7d02740ec4")
    public static final String MESSAGECOMRESOURCE_ASSOCIATION_MECHANISM_TAGTYPE = "MessageComResource_Association_mechanism";

    @objid ("94a08537-5b66-47cf-bd51-164858381951")
    public static final String MESSAGECOMRESOURCE_ASSOCIATION_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE = "MessageComResource_Association_messageQueueCapacityElements";

    @objid ("8110dd64-5300-40fb-8845-ac6e458c0344")
    public static final String MESSAGECOMRESOURCE_ASSOCIATION_MESSAGEQUEUEPOLICY_TAGTYPE = "MessageComResource_Association_messageQueuePolicy";

    @objid ("a601d0e7-f274-4f52-b411-6e0906754c81")
    public static final String MESSAGECOMRESOURCE_ASSOCIATION_MESSAGESIZEELEMENTS_TAGTYPE = "MessageComResource_Association_messageSizeElements";

    @objid ("298a474a-b48f-4ec9-a0b6-adf63af4dbba")
    public static final String MESSAGECOMRESOURCE_ASSOCIATION_RECEIVESERVICES_TAGTYPE = "MessageComResource_Association_receiveServices";

    @objid ("72c387dd-d8fe-43c4-9250-31d00e0c9f4e")
    public static final String MESSAGECOMRESOURCE_ASSOCIATION_SENDSERVICES_TAGTYPE = "MessageComResource_Association_sendServices";

    /**
     * Tells whether a {@link MessageComResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << MessageComResource_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("4ead37dc-df70-4ef1-9644-e1c890839bce")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MessageComResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << MessageComResource_Association >> then instantiate a {@link MessageComResourceAssociation} proxy.
     * 
     * @return a {@link MessageComResourceAssociation} proxy on the created {@link Association}.
     */
    @objid ("e0eb1ece-e253-429d-bde9-95703a06ea56")
    public static MessageComResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MessageComResourceAssociation.STEREOTYPE_NAME);
        return MessageComResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link MessageComResourceAssociation} proxy from a {@link Association} stereotyped << MessageComResource_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link MessageComResourceAssociation} proxy or <i>null</i>.
     */
    @objid ("3ae3d533-899d-43ad-9e05-4d02dfb86af8")
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
    @objid ("67930783-3f04-4b47-bb5b-a87e49af5c8e")
    public static MessageComResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (MessageComResourceAssociation.canInstantiate(obj))
        	return new MessageComResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("MessageComResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2e8184f1-c424-45fc-ae8a-b139a751f080")
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
    @objid ("9cf408c9-7da8-45fa-a01e-12065e7006b9")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'MessageComResource_Association_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8fe55690-bd26-476e-ad4e-d40b6375728f")
    public String getMessageComResource_Association_mechanism() {
        return this.elt.getTagValue(MessageComResourceAssociation.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATION_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Association_messageQueueCapacityElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ac33fb1a-82e4-42c8-8b17-ffd80ecd78fb")
    public List<String> getMessageComResource_Association_messageQueueCapacityElements() {
        return this.elt.getTagValues(MessageComResourceAssociation.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MessageComResource_Association_messageQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8c570a57-7508-4a1d-8700-c3e7e77320fb")
    public String getMessageComResource_Association_messageQueuePolicy() {
        return this.elt.getTagValue(MessageComResourceAssociation.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGEQUEUEPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Association_messageSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("368fda72-c4a0-4506-9ed9-3b579875d1be")
    public List<String> getMessageComResource_Association_messageSizeElements() {
        return this.elt.getTagValues(MessageComResourceAssociation.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGESIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Association_receiveServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ef78cd3c-8809-44c6-8f7c-f3a10724c093")
    public List<String> getMessageComResource_Association_receiveServices() {
        return this.elt.getTagValues(MessageComResourceAssociation.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATION_RECEIVESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Association_sendServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f5624c6c-019b-4697-80fb-7a59f9d770cd")
    public List<String> getMessageComResource_Association_sendServices() {
        return this.elt.getTagValues(MessageComResourceAssociation.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATION_SENDSERVICES_TAGTYPE_ELT);
    }

    @objid ("544fac6c-b8c6-4412-b8d3-359aceab25de")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'MessageComResource_Association_isFixedMessageSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a3169ca1-2f5f-46b9-8add-99e62b932cdb")
    public boolean isMessageComResource_Association_isFixedMessageSize() {
        return this.elt.isTagged(MessageComResourceAssociation.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATION_ISFIXEDMESSAGESIZE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'MessageComResource_Association_isFixedMessageSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2db0de42-f8da-46e8-9a7b-c77132f729f4")
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
    @objid ("37843853-8c0f-43a5-ad63-cb7437939cd4")
    public void setMessageComResource_Association_mechanism(final String value) {
        this.elt.putTagValue(MessageComResourceAssociation.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATION_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Association_messageQueueCapacityElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("53818641-daf8-43e4-9101-d71410bf9d5f")
    public void setMessageComResource_Association_messageQueueCapacityElements(final List<String> values) {
        this.elt.putTagValues(MessageComResourceAssociation.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'MessageComResource_Association_messageQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b02a79dd-c0f4-4a30-9e93-10904c4151db")
    public void setMessageComResource_Association_messageQueuePolicy(final String value) {
        this.elt.putTagValue(MessageComResourceAssociation.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGEQUEUEPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Association_messageSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("01ff1cdd-c9cb-4d47-a583-1f303bcfd524")
    public void setMessageComResource_Association_messageSizeElements(final List<String> values) {
        this.elt.putTagValues(MessageComResourceAssociation.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGESIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Association_receiveServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("890bb7cd-7c42-4455-9a3a-353b62e1a522")
    public void setMessageComResource_Association_receiveServices(final List<String> values) {
        this.elt.putTagValues(MessageComResourceAssociation.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATION_RECEIVESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Association_sendServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b14b4bc3-d245-40c4-bde4-24b4ac8663e8")
    public void setMessageComResource_Association_sendServices(final List<String> values) {
        this.elt.putTagValues(MessageComResourceAssociation.MdaTypes.MESSAGECOMRESOURCE_ASSOCIATION_SENDSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("21baae40-5907-48e9-ba60-299bf808edd8")
    protected MessageComResourceAssociation(final Association elt) {
        super(elt);
    }

    @objid ("311b21f5-feb8-4b7c-9b15-4d9df6f3e105")
    public static final class MdaTypes {
        @objid ("ec272811-3ac9-4519-b9fb-2b6205950e19")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5a5551f1-878d-4b8b-9b74-f6f2386d1b93")
        public static TagType MESSAGECOMRESOURCE_ASSOCIATION_ISFIXEDMESSAGESIZE_TAGTYPE_ELT;

        @objid ("c35a4ed0-7b1b-4d3c-8998-09c867cfb6d1")
        public static TagType MESSAGECOMRESOURCE_ASSOCIATION_MECHANISM_TAGTYPE_ELT;

        @objid ("f8bdae56-05d5-428b-97ea-912a1544a83e")
        public static TagType MESSAGECOMRESOURCE_ASSOCIATION_MESSAGESIZEELEMENTS_TAGTYPE_ELT;

        @objid ("65011c00-fcd1-4e7a-abbe-2f5574e1107b")
        public static TagType MESSAGECOMRESOURCE_ASSOCIATION_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT;

        @objid ("4d3b5b1e-d904-4928-a9bb-082551b43cec")
        public static TagType MESSAGECOMRESOURCE_ASSOCIATION_MESSAGEQUEUEPOLICY_TAGTYPE_ELT;

        @objid ("8394aff7-1407-4981-964e-f5958388e7c4")
        public static TagType MESSAGECOMRESOURCE_ASSOCIATION_SENDSERVICES_TAGTYPE_ELT;

        @objid ("1becebc3-e368-45f8-82c8-648cb4d8cdcb")
        public static TagType MESSAGECOMRESOURCE_ASSOCIATION_RECEIVESERVICES_TAGTYPE_ELT;

        @objid ("f24cc389-df73-4ec0-9a52-2371e96a9842")
        private static Stereotype MDAASSOCDEP;

        @objid ("e8e36ac4-9508-465a-9953-edc3e79ca247")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5e231469-a8f2-4882-98f2-5971cfee8acd")
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
