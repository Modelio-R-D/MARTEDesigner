/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << NotificationResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class NotificationResourceAssociation extends SwSynchronizationResourceAssociation {
    public static final String STEREOTYPE_NAME = "NotificationResource_Association";

    public static final String NOTIFICATIONRESOURCE_ASSOCIATION_CLEARSERVICES_TAGTYPE = "NotificationResource_Association_clearServices";

    public static final String NOTIFICATIONRESOURCE_ASSOCIATION_FLUSHSERVICES_TAGTYPE = "NotificationResource_Association_flushServices";

    public static final String NOTIFICATIONRESOURCE_ASSOCIATION_MASKELEMENTS_TAGTYPE = "NotificationResource_Association_maskElements";

    public static final String NOTIFICATIONRESOURCE_ASSOCIATION_MECHANISM_TAGTYPE = "NotificationResource_Association_mechanism";

    public static final String NOTIFICATIONRESOURCE_ASSOCIATION_OCCURENCE_TAGTYPE = "NotificationResource_Association_occurence";

    public static final String NOTIFICATIONRESOURCE_ASSOCIATION_OCCURENCECOUNTELEMENTS_TAGTYPE = "NotificationResource_Association_occurenceCountElements";

    public static final String NOTIFICATIONRESOURCE_ASSOCIATION_SIGNALSERVICES_TAGTYPE = "NotificationResource_Association_signalServices";

    public static final String NOTIFICATIONRESOURCE_ASSOCIATION_WAITSERVICES_TAGTYPE = "NotificationResource_Association_waitServices";

    /**
     * Tells whether a {@link NotificationResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << NotificationResource_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, NotificationResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << NotificationResource_Association >> then instantiate a {@link NotificationResourceAssociation} proxy.
     * 
     * @return a {@link NotificationResourceAssociation} proxy on the created {@link Association}.
     */
    public static NotificationResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, NotificationResourceAssociation.STEREOTYPE_NAME);
        return NotificationResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link NotificationResourceAssociation} proxy from a {@link Association} stereotyped << NotificationResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link NotificationResourceAssociation} proxy or <i>null</i>.
     */
    public static NotificationResourceAssociation instantiate(final Association obj) {
        return NotificationResourceAssociation.canInstantiate(obj) ? new NotificationResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link NotificationResourceAssociation} proxy from a {@link Association} stereotyped << NotificationResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link NotificationResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static NotificationResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (NotificationResourceAssociation.canInstantiate(obj))
        	return new NotificationResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("NotificationResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        NotificationResourceAssociation other = (NotificationResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for List<String> property 'NotificationResource_Association_clearServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Association_clearServices() {
        return this.elt.getTagValues(NotificationResourceAssociation.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATION_CLEARSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Association_flushServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Association_flushServices() {
        return this.elt.getTagValues(NotificationResourceAssociation.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATION_FLUSHSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Association_maskElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Association_maskElements() {
        return this.elt.getTagValues(NotificationResourceAssociation.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATION_MASKELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NotificationResource_Association_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getNotificationResource_Association_mechanism() {
        return this.elt.getTagValue(NotificationResourceAssociation.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATION_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NotificationResource_Association_occurence'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getNotificationResource_Association_occurence() {
        return this.elt.getTagValue(NotificationResourceAssociation.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATION_OCCURENCE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Association_occurenceCountElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Association_occurenceCountElements() {
        return this.elt.getTagValues(NotificationResourceAssociation.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATION_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Association_signalServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Association_signalServices() {
        return this.elt.getTagValues(NotificationResourceAssociation.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATION_SIGNALSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Association_waitServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Association_waitServices() {
        return this.elt.getTagValues(NotificationResourceAssociation.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATION_WAITSERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'NotificationResource_Association_clearServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Association_clearServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceAssociation.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATION_CLEARSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Association_flushServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Association_flushServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceAssociation.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATION_FLUSHSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Association_maskElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Association_maskElements(final List<String> values) {
        this.elt.putTagValues(NotificationResourceAssociation.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATION_MASKELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'NotificationResource_Association_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Association_mechanism(final String value) {
        this.elt.putTagValue(NotificationResourceAssociation.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATION_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'NotificationResource_Association_occurence'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Association_occurence(final String value) {
        this.elt.putTagValue(NotificationResourceAssociation.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATION_OCCURENCE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Association_occurenceCountElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Association_occurenceCountElements(final List<String> values) {
        this.elt.putTagValues(NotificationResourceAssociation.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATION_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Association_signalServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Association_signalServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceAssociation.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATION_SIGNALSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Association_waitServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Association_waitServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceAssociation.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATION_WAITSERVICES_TAGTYPE_ELT, values);
    }

    protected NotificationResourceAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_ASSOCIATION_OCCURENCE_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_ASSOCIATION_MECHANISM_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_ASSOCIATION_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_ASSOCIATION_MASKELEMENTS_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_ASSOCIATION_FLUSHSERVICES_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_ASSOCIATION_SIGNALSERVICES_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_ASSOCIATION_WAITSERVICES_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_ASSOCIATION_CLEARSERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d2933aa0-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_ASSOCIATION_OCCURENCE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2933aa5-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_ASSOCIATION_MECHANISM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2933aa6-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_ASSOCIATION_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2933aa7-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_ASSOCIATION_MASKELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2933aa8-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_ASSOCIATION_FLUSHSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2933aa1-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_ASSOCIATION_SIGNALSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2933aa2-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_ASSOCIATION_WAITSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2933aa3-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_ASSOCIATION_CLEARSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2933aa4-10d8-11df-81d9-0014222a9f79");
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
