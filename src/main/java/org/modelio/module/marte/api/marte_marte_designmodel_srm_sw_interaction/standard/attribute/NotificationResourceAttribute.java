/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << NotificationResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class NotificationResourceAttribute extends SwSynchronizationResourceAttribute {
    public static final String STEREOTYPE_NAME = "NotificationResource_Attribute";

    public static final String NOTIFICATIONRESOURCE_ATTRIBUTE_CLEARSERVICES_TAGTYPE = "NotificationResource_Attribute_clearServices";

    public static final String NOTIFICATIONRESOURCE_ATTRIBUTE_FLUSHSERVICES_TAGTYPE = "NotificationResource_Attribute_flushServices";

    public static final String NOTIFICATIONRESOURCE_ATTRIBUTE_MASKELEMENTS_TAGTYPE = "NotificationResource_Attribute_maskElements";

    public static final String NOTIFICATIONRESOURCE_ATTRIBUTE_MECHANISM_TAGTYPE = "NotificationResource_Attribute_mechanism";

    public static final String NOTIFICATIONRESOURCE_ATTRIBUTE_OCCURENCE_TAGTYPE = "NotificationResource_Attribute_occurence";

    public static final String NOTIFICATIONRESOURCE_ATTRIBUTE_OCCURENCECOUNTELEMENTS_TAGTYPE = "NotificationResource_Attribute_occurenceCountElements";

    public static final String NOTIFICATIONRESOURCE_ATTRIBUTE_SIGNALSERVICES_TAGTYPE = "NotificationResource_Attribute_signalServices";

    public static final String NOTIFICATIONRESOURCE_ATTRIBUTE_WAITSERVICES_TAGTYPE = "NotificationResource_Attribute_waitServices";

    /**
     * Tells whether a {@link NotificationResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << NotificationResource_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, NotificationResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << NotificationResource_Attribute >> then instantiate a {@link NotificationResourceAttribute} proxy.
     * 
     * @return a {@link NotificationResourceAttribute} proxy on the created {@link Attribute}.
     */
    public static NotificationResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, NotificationResourceAttribute.STEREOTYPE_NAME);
        return NotificationResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link NotificationResourceAttribute} proxy from a {@link Attribute} stereotyped << NotificationResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link NotificationResourceAttribute} proxy or <i>null</i>.
     */
    public static NotificationResourceAttribute instantiate(final Attribute obj) {
        return NotificationResourceAttribute.canInstantiate(obj) ? new NotificationResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link NotificationResourceAttribute} proxy from a {@link Attribute} stereotyped << NotificationResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link NotificationResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static NotificationResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (NotificationResourceAttribute.canInstantiate(obj))
        	return new NotificationResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("NotificationResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        NotificationResourceAttribute other = (NotificationResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for List<String> property 'NotificationResource_Attribute_clearServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Attribute_clearServices() {
        return this.elt.getTagValues(NotificationResourceAttribute.MdaTypes.NOTIFICATIONRESOURCE_ATTRIBUTE_CLEARSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Attribute_flushServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Attribute_flushServices() {
        return this.elt.getTagValues(NotificationResourceAttribute.MdaTypes.NOTIFICATIONRESOURCE_ATTRIBUTE_FLUSHSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Attribute_maskElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Attribute_maskElements() {
        return this.elt.getTagValues(NotificationResourceAttribute.MdaTypes.NOTIFICATIONRESOURCE_ATTRIBUTE_MASKELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NotificationResource_Attribute_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getNotificationResource_Attribute_mechanism() {
        return this.elt.getTagValue(NotificationResourceAttribute.MdaTypes.NOTIFICATIONRESOURCE_ATTRIBUTE_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NotificationResource_Attribute_occurence'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getNotificationResource_Attribute_occurence() {
        return this.elt.getTagValue(NotificationResourceAttribute.MdaTypes.NOTIFICATIONRESOURCE_ATTRIBUTE_OCCURENCE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Attribute_occurenceCountElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Attribute_occurenceCountElements() {
        return this.elt.getTagValues(NotificationResourceAttribute.MdaTypes.NOTIFICATIONRESOURCE_ATTRIBUTE_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Attribute_signalServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Attribute_signalServices() {
        return this.elt.getTagValues(NotificationResourceAttribute.MdaTypes.NOTIFICATIONRESOURCE_ATTRIBUTE_SIGNALSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Attribute_waitServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Attribute_waitServices() {
        return this.elt.getTagValues(NotificationResourceAttribute.MdaTypes.NOTIFICATIONRESOURCE_ATTRIBUTE_WAITSERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'NotificationResource_Attribute_clearServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Attribute_clearServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceAttribute.MdaTypes.NOTIFICATIONRESOURCE_ATTRIBUTE_CLEARSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Attribute_flushServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Attribute_flushServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceAttribute.MdaTypes.NOTIFICATIONRESOURCE_ATTRIBUTE_FLUSHSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Attribute_maskElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Attribute_maskElements(final List<String> values) {
        this.elt.putTagValues(NotificationResourceAttribute.MdaTypes.NOTIFICATIONRESOURCE_ATTRIBUTE_MASKELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'NotificationResource_Attribute_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Attribute_mechanism(final String value) {
        this.elt.putTagValue(NotificationResourceAttribute.MdaTypes.NOTIFICATIONRESOURCE_ATTRIBUTE_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'NotificationResource_Attribute_occurence'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Attribute_occurence(final String value) {
        this.elt.putTagValue(NotificationResourceAttribute.MdaTypes.NOTIFICATIONRESOURCE_ATTRIBUTE_OCCURENCE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Attribute_occurenceCountElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Attribute_occurenceCountElements(final List<String> values) {
        this.elt.putTagValues(NotificationResourceAttribute.MdaTypes.NOTIFICATIONRESOURCE_ATTRIBUTE_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Attribute_signalServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Attribute_signalServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceAttribute.MdaTypes.NOTIFICATIONRESOURCE_ATTRIBUTE_SIGNALSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Attribute_waitServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Attribute_waitServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceAttribute.MdaTypes.NOTIFICATIONRESOURCE_ATTRIBUTE_WAITSERVICES_TAGTYPE_ELT, values);
    }

    protected NotificationResourceAttribute(final Attribute elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_ATTRIBUTE_OCCURENCE_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_ATTRIBUTE_MECHANISM_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_ATTRIBUTE_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_ATTRIBUTE_MASKELEMENTS_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_ATTRIBUTE_FLUSHSERVICES_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_ATTRIBUTE_SIGNALSERVICES_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_ATTRIBUTE_WAITSERVICES_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_ATTRIBUTE_CLEARSERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0236f63a-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_ATTRIBUTE_OCCURENCE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0236f641-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_ATTRIBUTE_MECHANISM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0236f648-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_ATTRIBUTE_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0236f64f-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_ATTRIBUTE_MASKELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0236f656-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_ATTRIBUTE_FLUSHSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0239588e-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_ATTRIBUTE_SIGNALSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02395895-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_ATTRIBUTE_WAITSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0239589c-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_ATTRIBUTE_CLEARSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "023958a3-0ccf-11df-8525-001302895b2b");
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
