/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << NotificationResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class NotificationResourceInstance extends SwSynchronizationResourceInstance {
    public static final String STEREOTYPE_NAME = "NotificationResource_Instance";

    public static final String NOTIFICATIONRESOURCE_INSTANCE_CLEARSERVICES_TAGTYPE = "NotificationResource_Instance_clearServices";

    public static final String NOTIFICATIONRESOURCE_INSTANCE_FLUSHSERVICES_TAGTYPE = "NotificationResource_Instance_flushServices";

    public static final String NOTIFICATIONRESOURCE_INSTANCE_MASKELEMENTS_TAGTYPE = "NotificationResource_Instance_maskElements";

    public static final String NOTIFICATIONRESOURCE_INSTANCE_MECHANISM_TAGTYPE = "NotificationResource_Instance_mechanism";

    public static final String NOTIFICATIONRESOURCE_INSTANCE_OCCURENCE_TAGTYPE = "NotificationResource_Instance_occurence";

    public static final String NOTIFICATIONRESOURCE_INSTANCE_OCCURENCECOUNTELEMENTS_TAGTYPE = "NotificationResource_Instance_occurenceCountElements";

    public static final String NOTIFICATIONRESOURCE_INSTANCE_SIGNALSERVICES_TAGTYPE = "NotificationResource_Instance_signalServices";

    public static final String NOTIFICATIONRESOURCE_INSTANCE_WAITSERVICES_TAGTYPE = "NotificationResource_Instance_waitServices";

    /**
     * Tells whether a {@link NotificationResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << NotificationResource_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, NotificationResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << NotificationResource_Instance >> then instantiate a {@link NotificationResourceInstance} proxy.
     * 
     * @return a {@link NotificationResourceInstance} proxy on the created {@link Instance}.
     */
    public static NotificationResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, NotificationResourceInstance.STEREOTYPE_NAME);
        return NotificationResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link NotificationResourceInstance} proxy from a {@link Instance} stereotyped << NotificationResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link NotificationResourceInstance} proxy or <i>null</i>.
     */
    public static NotificationResourceInstance instantiate(final Instance obj) {
        return NotificationResourceInstance.canInstantiate(obj) ? new NotificationResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link NotificationResourceInstance} proxy from a {@link Instance} stereotyped << NotificationResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link NotificationResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static NotificationResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (NotificationResourceInstance.canInstantiate(obj))
        	return new NotificationResourceInstance(obj);
        else
        	throw new IllegalArgumentException("NotificationResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        NotificationResourceInstance other = (NotificationResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for List<String> property 'NotificationResource_Instance_clearServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Instance_clearServices() {
        return this.elt.getTagValues(NotificationResourceInstance.MdaTypes.NOTIFICATIONRESOURCE_INSTANCE_CLEARSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Instance_flushServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Instance_flushServices() {
        return this.elt.getTagValues(NotificationResourceInstance.MdaTypes.NOTIFICATIONRESOURCE_INSTANCE_FLUSHSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Instance_maskElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Instance_maskElements() {
        return this.elt.getTagValues(NotificationResourceInstance.MdaTypes.NOTIFICATIONRESOURCE_INSTANCE_MASKELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NotificationResource_Instance_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getNotificationResource_Instance_mechanism() {
        return this.elt.getTagValue(NotificationResourceInstance.MdaTypes.NOTIFICATIONRESOURCE_INSTANCE_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NotificationResource_Instance_occurence'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getNotificationResource_Instance_occurence() {
        return this.elt.getTagValue(NotificationResourceInstance.MdaTypes.NOTIFICATIONRESOURCE_INSTANCE_OCCURENCE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Instance_occurenceCountElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Instance_occurenceCountElements() {
        return this.elt.getTagValues(NotificationResourceInstance.MdaTypes.NOTIFICATIONRESOURCE_INSTANCE_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Instance_signalServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Instance_signalServices() {
        return this.elt.getTagValues(NotificationResourceInstance.MdaTypes.NOTIFICATIONRESOURCE_INSTANCE_SIGNALSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Instance_waitServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Instance_waitServices() {
        return this.elt.getTagValues(NotificationResourceInstance.MdaTypes.NOTIFICATIONRESOURCE_INSTANCE_WAITSERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'NotificationResource_Instance_clearServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Instance_clearServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceInstance.MdaTypes.NOTIFICATIONRESOURCE_INSTANCE_CLEARSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Instance_flushServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Instance_flushServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceInstance.MdaTypes.NOTIFICATIONRESOURCE_INSTANCE_FLUSHSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Instance_maskElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Instance_maskElements(final List<String> values) {
        this.elt.putTagValues(NotificationResourceInstance.MdaTypes.NOTIFICATIONRESOURCE_INSTANCE_MASKELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'NotificationResource_Instance_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Instance_mechanism(final String value) {
        this.elt.putTagValue(NotificationResourceInstance.MdaTypes.NOTIFICATIONRESOURCE_INSTANCE_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'NotificationResource_Instance_occurence'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Instance_occurence(final String value) {
        this.elt.putTagValue(NotificationResourceInstance.MdaTypes.NOTIFICATIONRESOURCE_INSTANCE_OCCURENCE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Instance_occurenceCountElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Instance_occurenceCountElements(final List<String> values) {
        this.elt.putTagValues(NotificationResourceInstance.MdaTypes.NOTIFICATIONRESOURCE_INSTANCE_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Instance_signalServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Instance_signalServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceInstance.MdaTypes.NOTIFICATIONRESOURCE_INSTANCE_SIGNALSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Instance_waitServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Instance_waitServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceInstance.MdaTypes.NOTIFICATIONRESOURCE_INSTANCE_WAITSERVICES_TAGTYPE_ELT, values);
    }

    protected NotificationResourceInstance(final Instance elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_INSTANCE_OCCURENCE_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_INSTANCE_MECHANISM_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_INSTANCE_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_INSTANCE_MASKELEMENTS_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_INSTANCE_FLUSHSERVICES_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_INSTANCE_SIGNALSERVICES_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_INSTANCE_WAITSERVICES_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_INSTANCE_CLEARSERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0236f63d-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_INSTANCE_OCCURENCE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0236f644-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_INSTANCE_MECHANISM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0236f64b-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_INSTANCE_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0236f652-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_INSTANCE_MASKELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0239588a-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_INSTANCE_FLUSHSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02395891-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_INSTANCE_SIGNALSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02395898-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_INSTANCE_WAITSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0239589f-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_INSTANCE_CLEARSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "023bbade-0ccf-11df-8525-001302895b2b");
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
