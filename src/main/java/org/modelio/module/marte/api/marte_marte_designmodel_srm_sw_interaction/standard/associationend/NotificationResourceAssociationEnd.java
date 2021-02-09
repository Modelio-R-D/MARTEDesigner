/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << NotificationResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class NotificationResourceAssociationEnd extends SwSynchronizationResourceAssociationEnd {
    public static final String STEREOTYPE_NAME = "NotificationResource_AssociationEnd";

    public static final String NOTIFICATIONRESOURCE_ASSOCIATIONEND_CLEARSERVICES_TAGTYPE = "NotificationResource_AssociationEnd_clearServices";

    public static final String NOTIFICATIONRESOURCE_ASSOCIATIONEND_FLUSHSERVICES_TAGTYPE = "NotificationResource_AssociationEnd_flushServices";

    public static final String NOTIFICATIONRESOURCE_ASSOCIATIONEND_MASKELEMENTS_TAGTYPE = "NotificationResource_AssociationEnd_maskElements";

    public static final String NOTIFICATIONRESOURCE_ASSOCIATIONEND_MECHANISM_TAGTYPE = "NotificationResource_AssociationEnd_mechanism";

    public static final String NOTIFICATIONRESOURCE_ASSOCIATIONEND_OCCURENCE_TAGTYPE = "NotificationResource_AssociationEnd_occurence";

    public static final String NOTIFICATIONRESOURCE_ASSOCIATIONEND_OCCURENCECOUNTELEMENTS_TAGTYPE = "NotificationResource_AssociationEnd_occurenceCountElements";

    public static final String NOTIFICATIONRESOURCE_ASSOCIATIONEND_SIGNALSERVICES_TAGTYPE = "NotificationResource_AssociationEnd_signalServices";

    public static final String NOTIFICATIONRESOURCE_ASSOCIATIONEND_WAITSERVICES_TAGTYPE = "NotificationResource_AssociationEnd_waitServices";

    /**
     * Tells whether a {@link NotificationResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << NotificationResource_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, NotificationResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << NotificationResource_AssociationEnd >> then instantiate a {@link NotificationResourceAssociationEnd} proxy.
     * 
     * @return a {@link NotificationResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    public static NotificationResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, NotificationResourceAssociationEnd.STEREOTYPE_NAME);
        return NotificationResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link NotificationResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << NotificationResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link NotificationResourceAssociationEnd} proxy or <i>null</i>.
     */
    public static NotificationResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return NotificationResourceAssociationEnd.canInstantiate(obj) ? new NotificationResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link NotificationResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << NotificationResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link NotificationResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static NotificationResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (NotificationResourceAssociationEnd.canInstantiate(obj))
        	return new NotificationResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("NotificationResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        NotificationResourceAssociationEnd other = (NotificationResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for List<String> property 'NotificationResource_AssociationEnd_clearServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_AssociationEnd_clearServices() {
        return this.elt.getTagValues(NotificationResourceAssociationEnd.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATIONEND_CLEARSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_AssociationEnd_flushServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_AssociationEnd_flushServices() {
        return this.elt.getTagValues(NotificationResourceAssociationEnd.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATIONEND_FLUSHSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_AssociationEnd_maskElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_AssociationEnd_maskElements() {
        return this.elt.getTagValues(NotificationResourceAssociationEnd.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATIONEND_MASKELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NotificationResource_AssociationEnd_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getNotificationResource_AssociationEnd_mechanism() {
        return this.elt.getTagValue(NotificationResourceAssociationEnd.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATIONEND_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NotificationResource_AssociationEnd_occurence'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getNotificationResource_AssociationEnd_occurence() {
        return this.elt.getTagValue(NotificationResourceAssociationEnd.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATIONEND_OCCURENCE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_AssociationEnd_occurenceCountElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_AssociationEnd_occurenceCountElements() {
        return this.elt.getTagValues(NotificationResourceAssociationEnd.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATIONEND_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_AssociationEnd_signalServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_AssociationEnd_signalServices() {
        return this.elt.getTagValues(NotificationResourceAssociationEnd.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATIONEND_SIGNALSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_AssociationEnd_waitServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_AssociationEnd_waitServices() {
        return this.elt.getTagValues(NotificationResourceAssociationEnd.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATIONEND_WAITSERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'NotificationResource_AssociationEnd_clearServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_AssociationEnd_clearServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceAssociationEnd.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATIONEND_CLEARSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_AssociationEnd_flushServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_AssociationEnd_flushServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceAssociationEnd.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATIONEND_FLUSHSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_AssociationEnd_maskElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_AssociationEnd_maskElements(final List<String> values) {
        this.elt.putTagValues(NotificationResourceAssociationEnd.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATIONEND_MASKELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'NotificationResource_AssociationEnd_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_AssociationEnd_mechanism(final String value) {
        this.elt.putTagValue(NotificationResourceAssociationEnd.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATIONEND_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'NotificationResource_AssociationEnd_occurence'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_AssociationEnd_occurence(final String value) {
        this.elt.putTagValue(NotificationResourceAssociationEnd.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATIONEND_OCCURENCE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'NotificationResource_AssociationEnd_occurenceCountElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_AssociationEnd_occurenceCountElements(final List<String> values) {
        this.elt.putTagValues(NotificationResourceAssociationEnd.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATIONEND_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_AssociationEnd_signalServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_AssociationEnd_signalServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceAssociationEnd.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATIONEND_SIGNALSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_AssociationEnd_waitServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_AssociationEnd_waitServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceAssociationEnd.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATIONEND_WAITSERVICES_TAGTYPE_ELT, values);
    }

    protected NotificationResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_ASSOCIATIONEND_OCCURENCE_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_ASSOCIATIONEND_MECHANISM_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_ASSOCIATIONEND_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_ASSOCIATIONEND_MASKELEMENTS_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_ASSOCIATIONEND_FLUSHSERVICES_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_ASSOCIATIONEND_SIGNALSERVICES_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_ASSOCIATIONEND_WAITSERVICES_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_ASSOCIATIONEND_CLEARSERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0236f638-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_ASSOCIATIONEND_OCCURENCE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0236f63f-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_ASSOCIATIONEND_MECHANISM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0236f646-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_ASSOCIATIONEND_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0236f64d-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_ASSOCIATIONEND_MASKELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0236f654-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_ASSOCIATIONEND_FLUSHSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0239588c-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_ASSOCIATIONEND_SIGNALSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02395893-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_ASSOCIATIONEND_WAITSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0239589a-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_ASSOCIATIONEND_CLEARSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "023958a1-0ccf-11df-8525-001302895b2b");
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
