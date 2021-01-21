/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("0823c30e-7dd8-4549-ae53-411e82172562")
    public static final String STEREOTYPE_NAME = "NotificationResource_Link";

    @objid ("06704928-3357-42d4-a578-d9815c7d9a5a")
    public static final String NOTIFICATIONRESOURCE_LINK_CLEARSERVICES_TAGTYPE = "NotificationResource_Link_clearServices";

    @objid ("3c998c02-2710-42d0-bf65-eb96f9c4d40c")
    public static final String NOTIFICATIONRESOURCE_LINK_FLUSHSERVICES_TAGTYPE = "NotificationResource_Link_flushServices";

    @objid ("d899986b-943d-407f-ac3e-53e7c3f5205e")
    public static final String NOTIFICATIONRESOURCE_LINK_MASKELEMENTS_TAGTYPE = "NotificationResource_Link_maskElements";

    @objid ("f5ac8181-64ce-40bf-be80-1987d92f6aca")
    public static final String NOTIFICATIONRESOURCE_LINK_MECHANISM_TAGTYPE = "NotificationResource_Link_mechanism";

    @objid ("5bb070ae-03bc-4070-9898-aaeedafcf760")
    public static final String NOTIFICATIONRESOURCE_LINK_OCCURENCE_TAGTYPE = "NotificationResource_Link_occurence";

    @objid ("65086096-b91d-41fb-be29-17922e5fa632")
    public static final String NOTIFICATIONRESOURCE_LINK_OCCURENCECOUNTELEMENTS_TAGTYPE = "NotificationResource_Link_occurenceCountElements";

    @objid ("c792c8e2-915b-4cc4-8a17-3410113f68c9")
    public static final String NOTIFICATIONRESOURCE_LINK_SIGNALSERVICES_TAGTYPE = "NotificationResource_Link_signalServices";

    @objid ("13fbf9c3-a0fc-4d8f-8ae1-c4a4adf1622e")
    public static final String NOTIFICATIONRESOURCE_LINK_WAITSERVICES_TAGTYPE = "NotificationResource_Link_waitServices";

    /**
     * Tells whether a {@link NotificationResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << NotificationResource_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("22d93505-ca1c-426f-96fe-1df4730476e3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, NotificationResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << NotificationResource_Link >> then instantiate a {@link NotificationResourceLink} proxy.
     * 
     * @return a {@link NotificationResourceLink} proxy on the created {@link Link}.
     */
    @objid ("804296b4-70a3-497e-bf72-ae815c4ce9b2")
    public static NotificationResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, NotificationResourceLink.STEREOTYPE_NAME);
        return NotificationResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link NotificationResourceLink} proxy from a {@link Link} stereotyped << NotificationResource_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link NotificationResourceLink} proxy or <i>null</i>.
     */
    @objid ("72abe713-8d36-4ee1-b158-824cdc71a316")
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
    @objid ("89ff9c00-5e8f-47d0-9aba-3b12e997a723")
    public static NotificationResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (NotificationResourceLink.canInstantiate(obj))
        	return new NotificationResourceLink(obj);
        else
        	throw new IllegalArgumentException("NotificationResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("52ca27c5-4595-44b4-9858-0e8674a8ca8d")
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
    @objid ("6b74468b-adf1-43f2-86d9-8d3057e851a3")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for List<String> property 'NotificationResource_Link_clearServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("bdddabcc-6dff-44bc-9607-babc4ab7c79b")
    public List<String> getNotificationResource_Link_clearServices() {
        return this.elt.getTagValues(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_CLEARSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Link_flushServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("7aac908a-70ef-42f0-9a14-79c0287ccc0d")
    public List<String> getNotificationResource_Link_flushServices() {
        return this.elt.getTagValues(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_FLUSHSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Link_maskElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8b649110-d8ce-484e-b42b-8b2c06e416fb")
    public List<String> getNotificationResource_Link_maskElements() {
        return this.elt.getTagValues(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_MASKELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NotificationResource_Link_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c9b55473-8a74-4add-b4c2-94362c57b900")
    public String getNotificationResource_Link_mechanism() {
        return this.elt.getTagValue(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NotificationResource_Link_occurence'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ea089d9a-a27d-4c60-875e-e35828561122")
    public String getNotificationResource_Link_occurence() {
        return this.elt.getTagValue(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_OCCURENCE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Link_occurenceCountElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("7cf07b5e-139b-471d-850c-659a23d840b4")
    public List<String> getNotificationResource_Link_occurenceCountElements() {
        return this.elt.getTagValues(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Link_signalServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("dbf10007-2d48-45a0-a195-d9195831aad1")
    public List<String> getNotificationResource_Link_signalServices() {
        return this.elt.getTagValues(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_SIGNALSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Link_waitServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c76e89e7-aa1a-4977-aba9-99006fe13a85")
    public List<String> getNotificationResource_Link_waitServices() {
        return this.elt.getTagValues(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_WAITSERVICES_TAGTYPE_ELT);
    }

    @objid ("e3d4c722-c2d4-44c4-89b8-bead17e1c2cc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'NotificationResource_Link_clearServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c2f727e9-0c7b-4c34-ab6f-04728644cc8b")
    public void setNotificationResource_Link_clearServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_CLEARSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Link_flushServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2454ca7c-3956-47df-aa7f-e5ee237b6a07")
    public void setNotificationResource_Link_flushServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_FLUSHSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Link_maskElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3c7ef5d7-3acd-4cfd-83e2-6de804f0b67b")
    public void setNotificationResource_Link_maskElements(final List<String> values) {
        this.elt.putTagValues(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_MASKELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'NotificationResource_Link_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ff3b51ee-4dbf-4d5d-8254-cf0aac7370f2")
    public void setNotificationResource_Link_mechanism(final String value) {
        this.elt.putTagValue(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'NotificationResource_Link_occurence'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4c96765f-2ed3-46ae-bfdf-e2059e8380fd")
    public void setNotificationResource_Link_occurence(final String value) {
        this.elt.putTagValue(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_OCCURENCE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Link_occurenceCountElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("31747426-63eb-4dd5-bfa8-b09ffe969d01")
    public void setNotificationResource_Link_occurenceCountElements(final List<String> values) {
        this.elt.putTagValues(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Link_signalServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8247dd79-8f4c-40ac-b379-f4515047f7dc")
    public void setNotificationResource_Link_signalServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_SIGNALSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Link_waitServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7fa81980-b30f-42fa-84bb-c4b2e54e56ad")
    public void setNotificationResource_Link_waitServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_WAITSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("533bcb4e-613f-4a46-82af-d1779f33350e")
    protected NotificationResourceLink(final Link elt) {
        super(elt);
    }

    @objid ("bb766916-e58e-46e2-9510-4e6950150cde")
    public static final class MdaTypes {
        @objid ("c1f30bdc-55a0-4cb9-b181-273ef809d3ba")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f764cd48-faf9-4735-93bc-b6c087876c1f")
        public static TagType NOTIFICATIONRESOURCE_LINK_OCCURENCE_TAGTYPE_ELT;

        @objid ("b2ec8828-cb4d-45f0-b17d-55b26b5fb9e8")
        public static TagType NOTIFICATIONRESOURCE_LINK_MECHANISM_TAGTYPE_ELT;

        @objid ("8e842828-c2cc-4a84-beec-dbdda95d86e3")
        public static TagType NOTIFICATIONRESOURCE_LINK_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT;

        @objid ("17ed1afd-13bd-46db-b993-ecc31b3e2e23")
        public static TagType NOTIFICATIONRESOURCE_LINK_MASKELEMENTS_TAGTYPE_ELT;

        @objid ("b9615c24-9dd5-4c94-8e5b-6c9c5422f6c5")
        public static TagType NOTIFICATIONRESOURCE_LINK_FLUSHSERVICES_TAGTYPE_ELT;

        @objid ("3d2b8e26-834c-41cc-bac1-22b02f72d88c")
        public static TagType NOTIFICATIONRESOURCE_LINK_SIGNALSERVICES_TAGTYPE_ELT;

        @objid ("512c1f25-6ee3-4516-9f2a-a266eb56c92f")
        public static TagType NOTIFICATIONRESOURCE_LINK_WAITSERVICES_TAGTYPE_ELT;

        @objid ("9c3f7ceb-538c-4b2e-b1ea-b27d91f80888")
        public static TagType NOTIFICATIONRESOURCE_LINK_CLEARSERVICES_TAGTYPE_ELT;

        @objid ("8b03f4d0-23b4-4d30-8baf-0c4e39d25d51")
        private static Stereotype MDAASSOCDEP;

        @objid ("ec1a2a6b-f497-48ba-8107-88175004718c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0c765e51-e0ae-49a5-9559-35be5e3b6748")
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
