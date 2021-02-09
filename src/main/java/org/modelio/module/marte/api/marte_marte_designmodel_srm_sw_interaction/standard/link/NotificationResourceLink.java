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
public class NotificationResourceLink extends SwSynchronizationResourceLink {
    public static final String STEREOTYPE_NAME = "NotificationResource_Link";

    public static final String NOTIFICATIONRESOURCE_LINK_CLEARSERVICES_TAGTYPE = "NotificationResource_Link_clearServices";

    public static final String NOTIFICATIONRESOURCE_LINK_FLUSHSERVICES_TAGTYPE = "NotificationResource_Link_flushServices";

    public static final String NOTIFICATIONRESOURCE_LINK_MASKELEMENTS_TAGTYPE = "NotificationResource_Link_maskElements";

    public static final String NOTIFICATIONRESOURCE_LINK_MECHANISM_TAGTYPE = "NotificationResource_Link_mechanism";

    public static final String NOTIFICATIONRESOURCE_LINK_OCCURENCE_TAGTYPE = "NotificationResource_Link_occurence";

    public static final String NOTIFICATIONRESOURCE_LINK_OCCURENCECOUNTELEMENTS_TAGTYPE = "NotificationResource_Link_occurenceCountElements";

    public static final String NOTIFICATIONRESOURCE_LINK_SIGNALSERVICES_TAGTYPE = "NotificationResource_Link_signalServices";

    public static final String NOTIFICATIONRESOURCE_LINK_WAITSERVICES_TAGTYPE = "NotificationResource_Link_waitServices";

    /**
     * Tells whether a {@link NotificationResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << NotificationResource_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, NotificationResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << NotificationResource_Link >> then instantiate a {@link NotificationResourceLink} proxy.
     * 
     * @return a {@link NotificationResourceLink} proxy on the created {@link Link}.
     */
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
    public static NotificationResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (NotificationResourceLink.canInstantiate(obj))
        	return new NotificationResourceLink(obj);
        else
        	throw new IllegalArgumentException("NotificationResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        NotificationResourceLink other = (NotificationResourceLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for List<String> property 'NotificationResource_Link_clearServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Link_clearServices() {
        return this.elt.getTagValues(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_CLEARSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Link_flushServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Link_flushServices() {
        return this.elt.getTagValues(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_FLUSHSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Link_maskElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Link_maskElements() {
        return this.elt.getTagValues(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_MASKELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NotificationResource_Link_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getNotificationResource_Link_mechanism() {
        return this.elt.getTagValue(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NotificationResource_Link_occurence'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getNotificationResource_Link_occurence() {
        return this.elt.getTagValue(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_OCCURENCE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Link_occurenceCountElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Link_occurenceCountElements() {
        return this.elt.getTagValues(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Link_signalServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Link_signalServices() {
        return this.elt.getTagValues(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_SIGNALSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Link_waitServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Link_waitServices() {
        return this.elt.getTagValues(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_WAITSERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'NotificationResource_Link_clearServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Link_clearServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_CLEARSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Link_flushServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Link_flushServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_FLUSHSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Link_maskElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Link_maskElements(final List<String> values) {
        this.elt.putTagValues(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_MASKELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'NotificationResource_Link_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Link_mechanism(final String value) {
        this.elt.putTagValue(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'NotificationResource_Link_occurence'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Link_occurence(final String value) {
        this.elt.putTagValue(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_OCCURENCE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Link_occurenceCountElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Link_occurenceCountElements(final List<String> values) {
        this.elt.putTagValues(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Link_signalServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Link_signalServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_SIGNALSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Link_waitServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Link_waitServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceLink.MdaTypes.NOTIFICATIONRESOURCE_LINK_WAITSERVICES_TAGTYPE_ELT, values);
    }

    protected NotificationResourceLink(final Link elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_LINK_OCCURENCE_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_LINK_MECHANISM_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_LINK_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_LINK_MASKELEMENTS_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_LINK_FLUSHSERVICES_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_LINK_SIGNALSERVICES_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_LINK_WAITSERVICES_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_LINK_CLEARSERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
