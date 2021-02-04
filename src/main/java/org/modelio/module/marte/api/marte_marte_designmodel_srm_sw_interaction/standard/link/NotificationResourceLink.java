/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.link;

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
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << NotificationResource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("342d4431-45e1-429a-9424-9dce6a611cb3")
public class NotificationResourceLink extends SwSynchronizationResourceLink {
    @objid ("e0ca7089-ed5d-45f4-8438-873d370b925d")
    public static final String STEREOTYPE_NAME = "NotificationResource_Link";

    @objid ("501e4ae9-8c2d-4b03-8322-17bc622c57b8")
    public static final String NOTIFICATIONRESOURCE_LINK_CLEARSERVICES_TAGTYPE = "NotificationResource_Link_clearServices";

    @objid ("de31a8c8-1075-4ab0-81b4-77fd475f1666")
    public static final String NOTIFICATIONRESOURCE_LINK_FLUSHSERVICES_TAGTYPE = "NotificationResource_Link_flushServices";

    @objid ("fd6f2ae5-1289-476d-86d7-298b1c87a773")
    public static final String NOTIFICATIONRESOURCE_LINK_MASKELEMENTS_TAGTYPE = "NotificationResource_Link_maskElements";

    @objid ("11b3a87d-4cf9-482f-b5d0-9a64d05c12d8")
    public static final String NOTIFICATIONRESOURCE_LINK_MECHANISM_TAGTYPE = "NotificationResource_Link_mechanism";

    @objid ("f69076b5-0e3f-40a2-8cbe-23fbe1b2627a")
    public static final String NOTIFICATIONRESOURCE_LINK_OCCURENCE_TAGTYPE = "NotificationResource_Link_occurence";

    @objid ("e464091b-0e83-47a2-8eb5-2e8c2e98b91a")
    public static final String NOTIFICATIONRESOURCE_LINK_OCCURENCECOUNTELEMENTS_TAGTYPE = "NotificationResource_Link_occurenceCountElements";

    @objid ("1b1ca02e-3a1f-46ac-8904-d7939d44265e")
    public static final String NOTIFICATIONRESOURCE_LINK_SIGNALSERVICES_TAGTYPE = "NotificationResource_Link_signalServices";

    @objid ("272575f9-8f60-48cb-b297-36b3e931975a")
    public static final String NOTIFICATIONRESOURCE_LINK_WAITSERVICES_TAGTYPE = "NotificationResource_Link_waitServices";

    /**
     * Tells whether a {@link NotificationResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << NotificationResource_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0c7a1764-576c-4276-9498-53cb52ca8edd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, NotificationResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << NotificationResource_Link >> then instantiate a {@link NotificationResourceLink} proxy.
     * 
     * @return a {@link NotificationResourceLink} proxy on the created {@link Link}.
     */
    @objid ("744f95cf-ee55-481b-8ed6-839690d4770d")
    public static NotificationResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, NotificationResourceLink.STEREOTYPE_NAME);
        return NotificationResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link NotificationResourceLink} proxy from a {@link Link} stereotyped << NotificationResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link NotificationResourceLink} proxy or <i>null</i>.
     */
    @objid ("5e7d1f77-f6a8-4fca-9164-8da9d8945b37")
    public static NotificationResourceLink instantiate(final Link obj) {
        return NotificationResourceLink.canInstantiate(obj) ? new NotificationResourceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link NotificationResourceLink} proxy from a {@link Link} stereotyped << NotificationResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link NotificationResourceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ae47d489-e649-4397-90d9-5aabd01886a5")
    public static NotificationResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (NotificationResourceLink.canInstantiate(obj))
        	return new NotificationResourceLink(obj);
        else
        	throw new IllegalArgumentException("NotificationResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("62ce53e5-50cd-4c9b-8503-5b4c43cc311c")
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
        NotificationResourceLink other = (NotificationResourceLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("7b0900b8-ec6c-4b3d-b6b7-a7e19dcfe8c3")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for List<String> property 'NotificationResource_Link_clearServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d5b8f788-6eff-4384-b390-c7ba45bde93d")
    public List<String> getNotificationResource_Link_clearServices() {
        return this.elt.getTagValues(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_CLEARSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Link_flushServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5999ffd4-fabc-450b-97a3-1b621349d16b")
    public List<String> getNotificationResource_Link_flushServices() {
        return this.elt.getTagValues(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_FLUSHSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Link_maskElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9f6cc758-38ed-4173-9a03-48aa25814a8f")
    public List<String> getNotificationResource_Link_maskElements() {
        return this.elt.getTagValues(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_MASKELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NotificationResource_Link_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0ef7a89b-f90d-462a-843a-52fba3fbdaf6")
    public String getNotificationResource_Link_mechanism() {
        return this.elt.getTagValue(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NotificationResource_Link_occurence'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dff2227b-d039-4037-b7df-171b2d9b6882")
    public String getNotificationResource_Link_occurence() {
        return this.elt.getTagValue(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_OCCURENCE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Link_occurenceCountElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6017bc97-4611-4ad8-a78e-5ebdcd44ced5")
    public List<String> getNotificationResource_Link_occurenceCountElements() {
        return this.elt.getTagValues(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Link_signalServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1d0cc0be-2997-4631-a8ce-19587b94cf7c")
    public List<String> getNotificationResource_Link_signalServices() {
        return this.elt.getTagValues(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_SIGNALSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Link_waitServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2fc9c1b2-6e24-4064-8940-6707e95aa053")
    public List<String> getNotificationResource_Link_waitServices() {
        return this.elt.getTagValues(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_WAITSERVICES_TAGTYPE_ELT);
    }

    @objid ("d930d44d-72a2-4175-904d-e1d6000d0482")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'NotificationResource_Link_clearServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("051f9c5f-aa94-4ec5-bd72-a312b5407d1c")
    public void setNotificationResource_Link_clearServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_CLEARSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Link_flushServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("25e39074-0eeb-45d9-8931-412f51b38a4d")
    public void setNotificationResource_Link_flushServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_FLUSHSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Link_maskElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("954c2cc1-b123-46e5-bbde-712475833376")
    public void setNotificationResource_Link_maskElements(final List<String> values) {
        this.elt.putTagValues(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_MASKELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'NotificationResource_Link_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c125ef4f-963e-4311-b1d7-c9485918b112")
    public void setNotificationResource_Link_mechanism(final String value) {
        this.elt.putTagValue(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'NotificationResource_Link_occurence'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("48167eb3-eecf-4c8d-87fe-64c79dbfca7f")
    public void setNotificationResource_Link_occurence(final String value) {
        this.elt.putTagValue(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_OCCURENCE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Link_occurenceCountElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("02965d4f-bbd7-40be-acfc-9b71dd651103")
    public void setNotificationResource_Link_occurenceCountElements(final List<String> values) {
        this.elt.putTagValues(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Link_signalServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8b2e5b2a-00c4-42fb-a58b-89e36bad8c17")
    public void setNotificationResource_Link_signalServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_SIGNALSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Link_waitServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3484ad05-d10b-4052-936b-5f0b8ae0636c")
    public void setNotificationResource_Link_waitServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_WAITSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("cfc94d88-c866-4e7c-8906-1df23295914b")
    protected NotificationResourceLink(final Link elt) {
        super(elt);
    }

    @objid ("bb766916-e58e-46e2-9510-4e6950150cde")
    public static final class MdaTypes {
        @objid ("1a1b724b-92b3-4a0d-aed5-4dcb88bba373")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("be1b61a6-ebcd-43ff-b669-7909421e7e58")
        public static TagType NOTIFICATIONRESOURCE_LINK_OCCURENCE_TAGTYPE_ELT;

        @objid ("f2297666-d60d-4cfb-abc5-17d1d122eedc")
        public static TagType NOTIFICATIONRESOURCE_LINK_MECHANISM_TAGTYPE_ELT;

        @objid ("9a0bb939-a4b0-42ae-805f-2fb7c2fc95f1")
        public static TagType NOTIFICATIONRESOURCE_LINK_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT;

        @objid ("055181fb-afe3-4e1d-ad29-9de480064eeb")
        public static TagType NOTIFICATIONRESOURCE_LINK_MASKELEMENTS_TAGTYPE_ELT;

        @objid ("2d4a98f1-be12-4581-a0ae-5968a2790a2f")
        public static TagType NOTIFICATIONRESOURCE_LINK_FLUSHSERVICES_TAGTYPE_ELT;

        @objid ("2a29cdf7-0e20-44ae-8e9a-cc9b048fb2f8")
        public static TagType NOTIFICATIONRESOURCE_LINK_SIGNALSERVICES_TAGTYPE_ELT;

        @objid ("ef414ebc-4b6e-4a9f-9eca-9ee3e0740bdb")
        public static TagType NOTIFICATIONRESOURCE_LINK_WAITSERVICES_TAGTYPE_ELT;

        @objid ("2a26d6c8-f9be-40e5-96c1-17a594b07dc1")
        public static TagType NOTIFICATIONRESOURCE_LINK_CLEARSERVICES_TAGTYPE_ELT;

        @objid ("00f851d1-17eb-47bb-8e53-1af89046ed1a")
        private static Stereotype MDAASSOCDEP;

        @objid ("67b59414-83e2-49cd-8840-e4e44b3ded64")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("10ea932d-36d5-4842-9df5-234708941978")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0236f63c-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_LINK_OCCURENCE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0236f643-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_LINK_MECHANISM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0236f64a-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_LINK_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0236f651-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_LINK_MASKELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0236f658-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_LINK_FLUSHSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02395890-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_LINK_SIGNALSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02395897-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_LINK_WAITSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0239589e-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_LINK_CLEARSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "023bbadd-0ccf-11df-8525-001302895b2b");
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
