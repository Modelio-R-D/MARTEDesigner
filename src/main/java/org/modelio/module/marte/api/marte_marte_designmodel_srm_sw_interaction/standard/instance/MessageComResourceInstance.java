/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << MessageComResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f2b5f468-d536-436d-96d6-e902ddf43546")
public class MessageComResourceInstance extends SwCommunicationResourceInstance {
    @objid ("1d303373-7888-40c4-8d41-fcb84b4a8199")
    public static final String STEREOTYPE_NAME = "MessageComResource_Instance";

    @objid ("7c5ad70f-375f-4566-9cce-a352bf4bde59")
    public static final String MESSAGECOMRESOURCE_INSTANCE_ISFIXEDMESSAGESIZE_TAGTYPE = "MessageComResource_Instance_isFixedMessageSize";

    @objid ("c14a925d-c9bf-4460-9d84-3a179b0fc466")
    public static final String MESSAGECOMRESOURCE_INSTANCE_MECHANISM_TAGTYPE = "MessageComResource_Instance_mechanism";

    @objid ("ff1fbdd7-99e2-474c-8805-a8196de20fb2")
    public static final String MESSAGECOMRESOURCE_INSTANCE_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE = "MessageComResource_Instance_messageQueueCapacityElements";

    @objid ("bca7532b-3f5f-4366-93ac-2475b9ec7a1e")
    public static final String MESSAGECOMRESOURCE_INSTANCE_MESSAGEQUEUEPOLICY_TAGTYPE = "MessageComResource_Instance_messageQueuePolicy";

    @objid ("e185bdb4-da44-407b-8d49-67c72bfd733b")
    public static final String MESSAGECOMRESOURCE_INSTANCE_MESSAGESIZEELEMENTS_TAGTYPE = "MessageComResource_Instance_messageSizeElements";

    @objid ("d2576aca-6101-4646-ab8b-bbd81f58ff40")
    public static final String MESSAGECOMRESOURCE_INSTANCE_RECEIVESERVICES_TAGTYPE = "MessageComResource_Instance_receiveServices";

    @objid ("bbba8431-8e30-4853-bfd7-3186f5b68bbb")
    public static final String MESSAGECOMRESOURCE_INSTANCE_SENDSERVICES_TAGTYPE = "MessageComResource_Instance_sendServices";

    /**
     * Tells whether a {@link MessageComResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << MessageComResource_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("f00821d0-4068-4277-a836-e4e035a8572b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MessageComResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << MessageComResource_Instance >> then instantiate a {@link MessageComResourceInstance} proxy.
     * 
     * @return a {@link MessageComResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("4d434f91-a070-4c5b-9d36-14d56cef9204")
    public static MessageComResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MessageComResourceInstance.STEREOTYPE_NAME);
        return MessageComResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link MessageComResourceInstance} proxy from a {@link Instance} stereotyped << MessageComResource_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link MessageComResourceInstance} proxy or <i>null</i>.
     */
    @objid ("8de2ca3f-4b02-4092-865f-f9e6b233e252")
    public static MessageComResourceInstance instantiate(final Instance obj) {
        return MessageComResourceInstance.canInstantiate(obj) ? new MessageComResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MessageComResourceInstance} proxy from a {@link Instance} stereotyped << MessageComResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link MessageComResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b91df537-16a4-4d74-9187-0363468bf09f")
    public static MessageComResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (MessageComResourceInstance.canInstantiate(obj))
        	return new MessageComResourceInstance(obj);
        else
        	throw new IllegalArgumentException("MessageComResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ae60bc4b-098d-429e-96d9-f62f34e5ec45")
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
        MessageComResourceInstance other = (MessageComResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("9fd6d7c8-d839-4028-b0c0-5d1997f905c6")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'MessageComResource_Instance_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f27960c7-3cda-48ea-83db-623dc331a05d")
    public String getMessageComResource_Instance_mechanism() {
        return this.elt.getTagValue(MessageComResourceInstance.MdaTypes.MESSAGECOMRESOURCE_INSTANCE_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Instance_messageQueueCapacityElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e61ecddf-f8e1-44dc-a065-027306af3289")
    public List<String> getMessageComResource_Instance_messageQueueCapacityElements() {
        return this.elt.getTagValues(MessageComResourceInstance.MdaTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MessageComResource_Instance_messageQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6128ae2f-f565-4c68-948d-cff51af826c9")
    public String getMessageComResource_Instance_messageQueuePolicy() {
        return this.elt.getTagValue(MessageComResourceInstance.MdaTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGEQUEUEPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Instance_messageSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("13c2a9ad-688a-4c6e-8b6a-73b76609b5f3")
    public List<String> getMessageComResource_Instance_messageSizeElements() {
        return this.elt.getTagValues(MessageComResourceInstance.MdaTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGESIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Instance_receiveServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ccf8d7f7-01d8-4198-93ec-c35c1395fb00")
    public List<String> getMessageComResource_Instance_receiveServices() {
        return this.elt.getTagValues(MessageComResourceInstance.MdaTypes.MESSAGECOMRESOURCE_INSTANCE_RECEIVESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MessageComResource_Instance_sendServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("01efafb5-3faf-46b7-8e5c-a9f0bd62c6c2")
    public List<String> getMessageComResource_Instance_sendServices() {
        return this.elt.getTagValues(MessageComResourceInstance.MdaTypes.MESSAGECOMRESOURCE_INSTANCE_SENDSERVICES_TAGTYPE_ELT);
    }

    @objid ("42d3cf57-ef9c-4db4-bd19-b34c8dbde7e4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'MessageComResource_Instance_isFixedMessageSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("68be91fc-6e5a-4521-917c-922bc4bef7e3")
    public boolean isMessageComResource_Instance_isFixedMessageSize() {
        return this.elt.isTagged(MessageComResourceInstance.MdaTypes.MESSAGECOMRESOURCE_INSTANCE_ISFIXEDMESSAGESIZE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'MessageComResource_Instance_isFixedMessageSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("379f049c-448a-4924-b03e-69809e4c6ea2")
    public void setMessageComResource_Instance_isFixedMessageSize(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(MessageComResourceInstance.MdaTypes.MESSAGECOMRESOURCE_INSTANCE_ISFIXEDMESSAGESIZE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(MessageComResourceInstance.MdaTypes.MESSAGECOMRESOURCE_INSTANCE_ISFIXEDMESSAGESIZE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'MessageComResource_Instance_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dbc82583-eb6a-40a3-9ea0-2de8b50e9696")
    public void setMessageComResource_Instance_mechanism(final String value) {
        this.elt.putTagValue(MessageComResourceInstance.MdaTypes.MESSAGECOMRESOURCE_INSTANCE_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Instance_messageQueueCapacityElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("59447c2f-5d66-4bf1-8e40-800fb6facf7c")
    public void setMessageComResource_Instance_messageQueueCapacityElements(final List<String> values) {
        this.elt.putTagValues(MessageComResourceInstance.MdaTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'MessageComResource_Instance_messageQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("302e193b-d246-4320-9b45-e0996bf7decb")
    public void setMessageComResource_Instance_messageQueuePolicy(final String value) {
        this.elt.putTagValue(MessageComResourceInstance.MdaTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGEQUEUEPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Instance_messageSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("29a37990-0b71-4297-9e6a-bd6c3b213a85")
    public void setMessageComResource_Instance_messageSizeElements(final List<String> values) {
        this.elt.putTagValues(MessageComResourceInstance.MdaTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGESIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Instance_receiveServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("aced4500-6ebd-49b6-b4e9-d16aaff2f480")
    public void setMessageComResource_Instance_receiveServices(final List<String> values) {
        this.elt.putTagValues(MessageComResourceInstance.MdaTypes.MESSAGECOMRESOURCE_INSTANCE_RECEIVESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MessageComResource_Instance_sendServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0abbfd3e-7e60-4e94-9a32-73d126b37b95")
    public void setMessageComResource_Instance_sendServices(final List<String> values) {
        this.elt.putTagValues(MessageComResourceInstance.MdaTypes.MESSAGECOMRESOURCE_INSTANCE_SENDSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("033f8420-8d5d-4f8e-b6ef-39bff394c70b")
    protected MessageComResourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("156ef815-767f-461c-9dd4-aeea2e2401b5")
    public static final class MdaTypes {
        @objid ("ef5c6d41-5390-44e0-977e-ad7f2cdd8396")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fd514aa4-56b1-4db9-b980-f7764ef58175")
        public static TagType MESSAGECOMRESOURCE_INSTANCE_ISFIXEDMESSAGESIZE_TAGTYPE_ELT;

        @objid ("9638fb7f-4e76-4757-810f-660eb2dcb25c")
        public static TagType MESSAGECOMRESOURCE_INSTANCE_MECHANISM_TAGTYPE_ELT;

        @objid ("2764d2a0-bb5b-4fa4-a93c-7c3497d6ab17")
        public static TagType MESSAGECOMRESOURCE_INSTANCE_MESSAGESIZEELEMENTS_TAGTYPE_ELT;

        @objid ("46139563-c6a7-40b8-baf8-ba61f8bd174e")
        public static TagType MESSAGECOMRESOURCE_INSTANCE_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT;

        @objid ("7fec98e3-95d9-4b14-ad63-8b68c30cd09f")
        public static TagType MESSAGECOMRESOURCE_INSTANCE_MESSAGEQUEUEPOLICY_TAGTYPE_ELT;

        @objid ("08675a47-9cac-4651-8ee0-f556b0d825fb")
        public static TagType MESSAGECOMRESOURCE_INSTANCE_SENDSERVICES_TAGTYPE_ELT;

        @objid ("7a1c2c1f-9259-4c19-947d-866bf2e9f58a")
        public static TagType MESSAGECOMRESOURCE_INSTANCE_RECEIVESERVICES_TAGTYPE_ELT;

        @objid ("006ee716-ec51-4522-8069-6993fe7a7cb3")
        private static Stereotype MDAASSOCDEP;

        @objid ("346811de-f3e6-45d6-b1c9-f6ff54b2b08f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a0893634-6c3d-443d-8155-b150d2d25816")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "022b0aa3-0ccf-11df-8525-001302895b2b");
            MESSAGECOMRESOURCE_INSTANCE_ISFIXEDMESSAGESIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "022b0aaa-0ccf-11df-8525-001302895b2b");
            MESSAGECOMRESOURCE_INSTANCE_MECHANISM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "022b0ab1-0ccf-11df-8525-001302895b2b");
            MESSAGECOMRESOURCE_INSTANCE_MESSAGESIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "022d6cf6-0ccf-11df-8525-001302895b2b");
            MESSAGECOMRESOURCE_INSTANCE_MESSAGEQUEUECAPACITYELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "022d6cfd-0ccf-11df-8525-001302895b2b");
            MESSAGECOMRESOURCE_INSTANCE_MESSAGEQUEUEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "022d6d04-0ccf-11df-8525-001302895b2b");
            MESSAGECOMRESOURCE_INSTANCE_SENDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "022d6d0b-0ccf-11df-8525-001302895b2b");
            MESSAGECOMRESOURCE_INSTANCE_RECEIVESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "022d6d12-0ccf-11df-8525-001302895b2b");
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
