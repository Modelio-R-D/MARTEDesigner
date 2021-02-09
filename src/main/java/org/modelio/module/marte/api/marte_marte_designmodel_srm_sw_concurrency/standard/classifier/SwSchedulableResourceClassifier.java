/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.classifier;

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
 * Proxy class to handle a {@link Classifier} with << SwSchedulableResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwSchedulableResourceClassifier extends SwConcurrentResourceClassifier {
    public static final String STEREOTYPE_NAME = "SwSchedulableResource_Classifier";

    public static final String SWSCHEDULABLERESOURCE_CLASSIFIER_DEADLINEELEMENTS_TAGTYPE = "SwSchedulableResource_Classifier_deadlineElements";

    public static final String SWSCHEDULABLERESOURCE_CLASSIFIER_DEADLINETYPEELEMENTS_TAGTYPE = "SwSchedulableResource_Classifier_deadlineTypeElements";

    public static final String SWSCHEDULABLERESOURCE_CLASSIFIER_DELAYSERVICES_TAGTYPE = "SwSchedulableResource_Classifier_delayServices";

    public static final String SWSCHEDULABLERESOURCE_CLASSIFIER_DEPENDENTSCHEDULER_TAGTYPE = "SwSchedulableResource_Classifier_dependentScheduler";

    public static final String SWSCHEDULABLERESOURCE_CLASSIFIER_HOST_TAGTYPE = "SwSchedulableResource_Classifier_host";

    public static final String SWSCHEDULABLERESOURCE_CLASSIFIER_ISPREEMPTABLE_TAGTYPE = "SwSchedulableResource_Classifier_isPreemptable";

    public static final String SWSCHEDULABLERESOURCE_CLASSIFIER_ISSTATICSCHEDULINGFEATURE_TAGTYPE = "SwSchedulableResource_Classifier_isStaticSchedulingFeature";

    public static final String SWSCHEDULABLERESOURCE_CLASSIFIER_JOINSERVICES_TAGTYPE = "SwSchedulableResource_Classifier_joinServices";

    public static final String SWSCHEDULABLERESOURCE_CLASSIFIER_SCHEDPARAMS_TAGTYPE = "SwSchedulableResource_Classifier_schedParams";

    public static final String SWSCHEDULABLERESOURCE_CLASSIFIER_SCHEDULERS_TAGTYPE = "SwSchedulableResource_Classifier_schedulers";

    public static final String SWSCHEDULABLERESOURCE_CLASSIFIER_TIMESLICEELEMENTS_TAGTYPE = "SwSchedulableResource_Classifier_timeSliceElements";

    public static final String SWSCHEDULABLERESOURCE_CLASSIFIER_YIELDSERVICES_TAGTYPE = "SwSchedulableResource_Classifier_yieldServices";

    /**
     * Tells whether a {@link SwSchedulableResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << SwSchedulableResource_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwSchedulableResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << SwSchedulableResource_Classifier >> then instantiate a {@link SwSchedulableResourceClassifier} proxy.
     * 
     * @return a {@link SwSchedulableResourceClassifier} proxy on the created {@link Classifier}.
     */
    public static SwSchedulableResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwSchedulableResourceClassifier.STEREOTYPE_NAME);
        return SwSchedulableResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link SwSchedulableResourceClassifier} proxy from a {@link Classifier} stereotyped << SwSchedulableResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link SwSchedulableResourceClassifier} proxy or <i>null</i>.
     */
    public static SwSchedulableResourceClassifier instantiate(final Classifier obj) {
        return SwSchedulableResourceClassifier.canInstantiate(obj) ? new SwSchedulableResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwSchedulableResourceClassifier} proxy from a {@link Classifier} stereotyped << SwSchedulableResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link SwSchedulableResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwSchedulableResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (SwSchedulableResourceClassifier.canInstantiate(obj))
        	return new SwSchedulableResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("SwSchedulableResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwSchedulableResourceClassifier other = (SwSchedulableResourceClassifier) obj;
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
     * Getter for List<String> property 'SwSchedulableResource_Classifier_deadlineElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Classifier_deadlineElements() {
        return this.elt.getTagValues(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_DEADLINEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Classifier_deadlineTypeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Classifier_deadlineTypeElements() {
        return this.elt.getTagValues(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_DEADLINETYPEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Classifier_delayServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Classifier_delayServices() {
        return this.elt.getTagValues(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_DELAYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Classifier_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwSchedulableResource_Classifier_dependentScheduler() {
        return this.elt.getTagValue(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_DEPENDENTSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Classifier_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwSchedulableResource_Classifier_host() {
        return this.elt.getTagValue(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Classifier_joinServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Classifier_joinServices() {
        return this.elt.getTagValues(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_JOINSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Classifier_schedParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Classifier_schedParams() {
        return this.elt.getTagValues(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SCHEDPARAMS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Classifier_schedulers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwSchedulableResource_Classifier_schedulers() {
        return this.elt.getTagValue(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SCHEDULERS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Classifier_timeSliceElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Classifier_timeSliceElements() {
        return this.elt.getTagValues(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_TIMESLICEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Classifier_yieldServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Classifier_yieldServices() {
        return this.elt.getTagValues(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_YIELDSERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwSchedulableResource_Classifier_isPreemptable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSwSchedulableResource_Classifier_isPreemptable() {
        return this.elt.isTagged(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_ISPREEMPTABLE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SwSchedulableResource_Classifier_isStaticSchedulingFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSwSchedulableResource_Classifier_isStaticSchedulingFeature() {
        return this.elt.isTagged(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Classifier_deadlineElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Classifier_deadlineElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_DEADLINEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Classifier_deadlineTypeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Classifier_deadlineTypeElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_DEADLINETYPEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Classifier_delayServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Classifier_delayServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_DELAYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Classifier_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Classifier_dependentScheduler(final String value) {
        this.elt.putTagValue(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_DEPENDENTSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Classifier_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Classifier_host(final String value) {
        this.elt.putTagValue(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SwSchedulableResource_Classifier_isPreemptable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Classifier_isPreemptable(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_ISPREEMPTABLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_ISPREEMPTABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SwSchedulableResource_Classifier_isStaticSchedulingFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Classifier_isStaticSchedulingFeature(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Classifier_joinServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Classifier_joinServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_JOINSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Classifier_schedParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Classifier_schedParams(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SCHEDPARAMS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Classifier_schedulers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Classifier_schedulers(final String value) {
        this.elt.putTagValue(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SCHEDULERS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Classifier_timeSliceElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Classifier_timeSliceElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_TIMESLICEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Classifier_yieldServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Classifier_yieldServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_YIELDSERVICES_TAGTYPE_ELT, values);
    }

    protected SwSchedulableResourceClassifier(final Classifier elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_CLASSIFIER_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_CLASSIFIER_ISPREEMPTABLE_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_CLASSIFIER_SCHEDULERS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_CLASSIFIER_DEADLINEELEMENTS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_CLASSIFIER_DEADLINETYPEELEMENTS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_CLASSIFIER_TIMESLICEELEMENTS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_CLASSIFIER_DELAYSERVICES_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_CLASSIFIER_JOINSERVICES_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_CLASSIFIER_YIELDSERVICES_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_CLASSIFIER_SCHEDPARAMS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_CLASSIFIER_HOST_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_CLASSIFIER_DEPENDENTSCHEDULER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "adcebe18-10ce-11df-81d9-0014222a9f79");
            SWSCHEDULABLERESOURCE_CLASSIFIER_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9496971-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_CLASSIFIER_ISPREEMPTABLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9496972-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_CLASSIFIER_SCHEDULERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9496973-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_CLASSIFIER_DEADLINEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9496974-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_CLASSIFIER_DEADLINETYPEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9496975-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_CLASSIFIER_TIMESLICEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9496976-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_CLASSIFIER_DELAYSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9496977-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_CLASSIFIER_JOINSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9496978-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_CLASSIFIER_YIELDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9496979-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_CLASSIFIER_SCHEDPARAMS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "92dccc48-92ac-11e0-a69d-0027103f347c");
            SWSCHEDULABLERESOURCE_CLASSIFIER_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "92dccc47-92ac-11e0-a69d-0027103f347c");
            SWSCHEDULABLERESOURCE_CLASSIFIER_DEPENDENTSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "92dccc46-92ac-11e0-a69d-0027103f347c");
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
