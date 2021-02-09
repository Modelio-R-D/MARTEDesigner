/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << NotificationResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class NotificationResourceLifeline extends SwSynchronizationResourceLifeline {
    public static final String STEREOTYPE_NAME = "NotificationResource_Lifeline";

    public static final String NOTIFICATIONRESOURCE_LIFELINE_CLEARSERVICES_TAGTYPE = "NotificationResource_Lifeline_clearServices";

    public static final String NOTIFICATIONRESOURCE_LIFELINE_FLUSHSERVICES_TAGTYPE = "NotificationResource_Lifeline_flushServices";

    public static final String NOTIFICATIONRESOURCE_LIFELINE_MASKELEMENTS_TAGTYPE = "NotificationResource_Lifeline_maskElements";

    public static final String NOTIFICATIONRESOURCE_LIFELINE_MECHANISM_TAGTYPE = "NotificationResource_Lifeline_mechanism";

    public static final String NOTIFICATIONRESOURCE_LIFELINE_OCCURENCE_TAGTYPE = "NotificationResource_Lifeline_occurence";

    public static final String NOTIFICATIONRESOURCE_LIFELINE_OCCURENCECOUNTELEMENTS_TAGTYPE = "NotificationResource_Lifeline_occurenceCountElements";

    public static final String NOTIFICATIONRESOURCE_LIFELINE_SIGNALSERVICES_TAGTYPE = "NotificationResource_Lifeline_signalServices";

    public static final String NOTIFICATIONRESOURCE_LIFELINE_WAITSERVICES_TAGTYPE = "NotificationResource_Lifeline_waitServices";

    /**
     * Tells whether a {@link NotificationResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << NotificationResource_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, NotificationResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << NotificationResource_Lifeline >> then instantiate a {@link NotificationResourceLifeline} proxy.
     * 
     * @return a {@link NotificationResourceLifeline} proxy on the created {@link Lifeline}.
     */
    public static NotificationResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, NotificationResourceLifeline.STEREOTYPE_NAME);
        return NotificationResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link NotificationResourceLifeline} proxy from a {@link Lifeline} stereotyped << NotificationResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link NotificationResourceLifeline} proxy or <i>null</i>.
     */
    public static NotificationResourceLifeline instantiate(final Lifeline obj) {
        return NotificationResourceLifeline.canInstantiate(obj) ? new NotificationResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link NotificationResourceLifeline} proxy from a {@link Lifeline} stereotyped << NotificationResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link NotificationResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static NotificationResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (NotificationResourceLifeline.canInstantiate(obj))
        	return new NotificationResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("NotificationResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        NotificationResourceLifeline other = (NotificationResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for List<String> property 'NotificationResource_Lifeline_clearServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Lifeline_clearServices() {
        return this.elt.getTagValues(NotificationResourceLifeline.MdaTypes.NOTIFICATIONRESOURCE_LIFELINE_CLEARSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Lifeline_flushServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Lifeline_flushServices() {
        return this.elt.getTagValues(NotificationResourceLifeline.MdaTypes.NOTIFICATIONRESOURCE_LIFELINE_FLUSHSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Lifeline_maskElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Lifeline_maskElements() {
        return this.elt.getTagValues(NotificationResourceLifeline.MdaTypes.NOTIFICATIONRESOURCE_LIFELINE_MASKELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NotificationResource_Lifeline_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getNotificationResource_Lifeline_mechanism() {
        return this.elt.getTagValue(NotificationResourceLifeline.MdaTypes.NOTIFICATIONRESOURCE_LIFELINE_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NotificationResource_Lifeline_occurence'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getNotificationResource_Lifeline_occurence() {
        return this.elt.getTagValue(NotificationResourceLifeline.MdaTypes.NOTIFICATIONRESOURCE_LIFELINE_OCCURENCE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Lifeline_occurenceCountElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Lifeline_occurenceCountElements() {
        return this.elt.getTagValues(NotificationResourceLifeline.MdaTypes.NOTIFICATIONRESOURCE_LIFELINE_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Lifeline_signalServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Lifeline_signalServices() {
        return this.elt.getTagValues(NotificationResourceLifeline.MdaTypes.NOTIFICATIONRESOURCE_LIFELINE_SIGNALSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Lifeline_waitServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Lifeline_waitServices() {
        return this.elt.getTagValues(NotificationResourceLifeline.MdaTypes.NOTIFICATIONRESOURCE_LIFELINE_WAITSERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'NotificationResource_Lifeline_clearServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Lifeline_clearServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceLifeline.MdaTypes.NOTIFICATIONRESOURCE_LIFELINE_CLEARSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Lifeline_flushServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Lifeline_flushServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceLifeline.MdaTypes.NOTIFICATIONRESOURCE_LIFELINE_FLUSHSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Lifeline_maskElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Lifeline_maskElements(final List<String> values) {
        this.elt.putTagValues(NotificationResourceLifeline.MdaTypes.NOTIFICATIONRESOURCE_LIFELINE_MASKELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'NotificationResource_Lifeline_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Lifeline_mechanism(final String value) {
        this.elt.putTagValue(NotificationResourceLifeline.MdaTypes.NOTIFICATIONRESOURCE_LIFELINE_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'NotificationResource_Lifeline_occurence'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Lifeline_occurence(final String value) {
        this.elt.putTagValue(NotificationResourceLifeline.MdaTypes.NOTIFICATIONRESOURCE_LIFELINE_OCCURENCE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Lifeline_occurenceCountElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Lifeline_occurenceCountElements(final List<String> values) {
        this.elt.putTagValues(NotificationResourceLifeline.MdaTypes.NOTIFICATIONRESOURCE_LIFELINE_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Lifeline_signalServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Lifeline_signalServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceLifeline.MdaTypes.NOTIFICATIONRESOURCE_LIFELINE_SIGNALSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Lifeline_waitServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Lifeline_waitServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceLifeline.MdaTypes.NOTIFICATIONRESOURCE_LIFELINE_WAITSERVICES_TAGTYPE_ELT, values);
    }

    protected NotificationResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_LIFELINE_OCCURENCE_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_LIFELINE_MECHANISM_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_LIFELINE_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_LIFELINE_MASKELEMENTS_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_LIFELINE_FLUSHSERVICES_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_LIFELINE_SIGNALSERVICES_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_LIFELINE_WAITSERVICES_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_LIFELINE_CLEARSERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d2b23959-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_LIFELINE_OCCURENCE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2b2395e-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_LIFELINE_MECHANISM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2b2395f-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_LIFELINE_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2b23960-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_LIFELINE_MASKELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2b23961-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_LIFELINE_FLUSHSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2b2395a-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_LIFELINE_SIGNALSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2b2395b-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_LIFELINE_WAITSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2b2395c-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_LIFELINE_CLEARSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2b2395d-10d8-11df-81d9-0014222a9f79");
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
