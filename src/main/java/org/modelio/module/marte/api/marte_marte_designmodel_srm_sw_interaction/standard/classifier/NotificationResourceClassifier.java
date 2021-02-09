/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.classifier;

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
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << NotificationResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class NotificationResourceClassifier extends SwSynchronizationResourceClassifier {
    public static final String STEREOTYPE_NAME = "NotificationResource_Classifier";

    public static final String NOTIFICATIONRESOURCE_CLASSIFIER_CLEARSERVICES_TAGTYPE = "NotificationResource_Classifier_clearServices";

    public static final String NOTIFICATIONRESOURCE_CLASSIFIER_FLUSHSERVICES_TAGTYPE = "NotificationResource_Classifier_flushServices";

    public static final String NOTIFICATIONRESOURCE_CLASSIFIER_MASKELEMENTS_TAGTYPE = "NotificationResource_Classifier_maskElements";

    public static final String NOTIFICATIONRESOURCE_CLASSIFIER_MECHANISM_TAGTYPE = "NotificationResource_Classifier_mechanism";

    public static final String NOTIFICATIONRESOURCE_CLASSIFIER_OCCURENCE_TAGTYPE = "NotificationResource_Classifier_occurence";

    public static final String NOTIFICATIONRESOURCE_CLASSIFIER_OCCURENCECOUNTELEMENTS_TAGTYPE = "NotificationResource_Classifier_occurenceCountElements";

    public static final String NOTIFICATIONRESOURCE_CLASSIFIER_SIGNALSERVICES_TAGTYPE = "NotificationResource_Classifier_signalServices";

    public static final String NOTIFICATIONRESOURCE_CLASSIFIER_WAITSERVICES_TAGTYPE = "NotificationResource_Classifier_waitServices";

    /**
     * Tells whether a {@link NotificationResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << NotificationResource_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, NotificationResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << NotificationResource_Classifier >> then instantiate a {@link NotificationResourceClassifier} proxy.
     * 
     * @return a {@link NotificationResourceClassifier} proxy on the created {@link Classifier}.
     */
    public static NotificationResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, NotificationResourceClassifier.STEREOTYPE_NAME);
        return NotificationResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link NotificationResourceClassifier} proxy from a {@link Classifier} stereotyped << NotificationResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link NotificationResourceClassifier} proxy or <i>null</i>.
     */
    public static NotificationResourceClassifier instantiate(final Classifier obj) {
        return NotificationResourceClassifier.canInstantiate(obj) ? new NotificationResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link NotificationResourceClassifier} proxy from a {@link Classifier} stereotyped << NotificationResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link NotificationResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static NotificationResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (NotificationResourceClassifier.canInstantiate(obj))
        	return new NotificationResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("NotificationResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        NotificationResourceClassifier other = (NotificationResourceClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for List<String> property 'NotificationResource_Classifier_clearServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Classifier_clearServices() {
        return this.elt.getTagValues(NotificationResourceClassifier.MdaTypes.NOTIFICATIONRESOURCE_CLASSIFIER_CLEARSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Classifier_flushServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Classifier_flushServices() {
        return this.elt.getTagValues(NotificationResourceClassifier.MdaTypes.NOTIFICATIONRESOURCE_CLASSIFIER_FLUSHSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Classifier_maskElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Classifier_maskElements() {
        return this.elt.getTagValues(NotificationResourceClassifier.MdaTypes.NOTIFICATIONRESOURCE_CLASSIFIER_MASKELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NotificationResource_Classifier_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getNotificationResource_Classifier_mechanism() {
        return this.elt.getTagValue(NotificationResourceClassifier.MdaTypes.NOTIFICATIONRESOURCE_CLASSIFIER_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NotificationResource_Classifier_occurence'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getNotificationResource_Classifier_occurence() {
        return this.elt.getTagValue(NotificationResourceClassifier.MdaTypes.NOTIFICATIONRESOURCE_CLASSIFIER_OCCURENCE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Classifier_occurenceCountElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Classifier_occurenceCountElements() {
        return this.elt.getTagValues(NotificationResourceClassifier.MdaTypes.NOTIFICATIONRESOURCE_CLASSIFIER_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Classifier_signalServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Classifier_signalServices() {
        return this.elt.getTagValues(NotificationResourceClassifier.MdaTypes.NOTIFICATIONRESOURCE_CLASSIFIER_SIGNALSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Classifier_waitServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Classifier_waitServices() {
        return this.elt.getTagValues(NotificationResourceClassifier.MdaTypes.NOTIFICATIONRESOURCE_CLASSIFIER_WAITSERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'NotificationResource_Classifier_clearServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Classifier_clearServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceClassifier.MdaTypes.NOTIFICATIONRESOURCE_CLASSIFIER_CLEARSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Classifier_flushServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Classifier_flushServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceClassifier.MdaTypes.NOTIFICATIONRESOURCE_CLASSIFIER_FLUSHSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Classifier_maskElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Classifier_maskElements(final List<String> values) {
        this.elt.putTagValues(NotificationResourceClassifier.MdaTypes.NOTIFICATIONRESOURCE_CLASSIFIER_MASKELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'NotificationResource_Classifier_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Classifier_mechanism(final String value) {
        this.elt.putTagValue(NotificationResourceClassifier.MdaTypes.NOTIFICATIONRESOURCE_CLASSIFIER_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'NotificationResource_Classifier_occurence'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Classifier_occurence(final String value) {
        this.elt.putTagValue(NotificationResourceClassifier.MdaTypes.NOTIFICATIONRESOURCE_CLASSIFIER_OCCURENCE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Classifier_occurenceCountElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Classifier_occurenceCountElements(final List<String> values) {
        this.elt.putTagValues(NotificationResourceClassifier.MdaTypes.NOTIFICATIONRESOURCE_CLASSIFIER_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Classifier_signalServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Classifier_signalServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceClassifier.MdaTypes.NOTIFICATIONRESOURCE_CLASSIFIER_SIGNALSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Classifier_waitServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Classifier_waitServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceClassifier.MdaTypes.NOTIFICATIONRESOURCE_CLASSIFIER_WAITSERVICES_TAGTYPE_ELT, values);
    }

    protected NotificationResourceClassifier(final Classifier elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_CLASSIFIER_OCCURENCE_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_CLASSIFIER_MECHANISM_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_CLASSIFIER_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_CLASSIFIER_MASKELEMENTS_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_CLASSIFIER_FLUSHSERVICES_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_CLASSIFIER_SIGNALSERVICES_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_CLASSIFIER_WAITSERVICES_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_CLASSIFIER_CLEARSERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d2d13812-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_CLASSIFIER_OCCURENCE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2d13817-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_CLASSIFIER_MECHANISM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2d13818-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_CLASSIFIER_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2d13819-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_CLASSIFIER_MASKELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2d1381a-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_CLASSIFIER_FLUSHSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2d13813-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_CLASSIFIER_SIGNALSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2d13814-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_CLASSIFIER_WAITSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2d13815-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_CLASSIFIER_CLEARSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2d13816-10d8-11df-81d9-0014222a9f79");
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
