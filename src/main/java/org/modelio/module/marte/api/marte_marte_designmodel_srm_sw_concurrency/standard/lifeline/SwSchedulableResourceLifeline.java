/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.lifeline;

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
 * Proxy class to handle a {@link Lifeline} with << SwSchedulableResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwSchedulableResourceLifeline extends SwConcurrentResourceLifeline {
    public static final String STEREOTYPE_NAME = "SwSchedulableResource_Lifeline";

    public static final String SWSCHEDULABLERESOURCE_LIFELINE_DEADLINEELEMENTS_TAGTYPE = "SwSchedulableResource_Lifeline_deadlineElements";

    public static final String SWSCHEDULABLERESOURCE_LIFELINE_DEADLINETYPEELEMENTS_TAGTYPE = "SwSchedulableResource_Lifeline_deadlineTypeElements";

    public static final String SWSCHEDULABLERESOURCE_LIFELINE_DELAYSERVICES_TAGTYPE = "SwSchedulableResource_Lifeline_delayServices";

    public static final String SWSCHEDULABLERESOURCE_LIFELINE_DEPENDENTSCHEDULER_TAGTYPE = "SwSchedulableResource_Lifeline_dependentScheduler";

    public static final String SWSCHEDULABLERESOURCE_LIFELINE_HOST_TAGTYPE = "SwSchedulableResource_Lifeline_host";

    public static final String SWSCHEDULABLERESOURCE_LIFELINE_ISPREEMPTABLE_TAGTYPE = "SwSchedulableResource_Lifeline_isPreemptable";

    public static final String SWSCHEDULABLERESOURCE_LIFELINE_ISSTATICSCHEDULINGFEATURE_TAGTYPE = "SwSchedulableResource_Lifeline_isStaticSchedulingFeature";

    public static final String SWSCHEDULABLERESOURCE_LIFELINE_JOINSERVICES_TAGTYPE = "SwSchedulableResource_Lifeline_joinServices";

    public static final String SWSCHEDULABLERESOURCE_LIFELINE_SCHEDPARAMS_TAGTYPE = "SwSchedulableResource_Lifeline_schedParams";

    public static final String SWSCHEDULABLERESOURCE_LIFELINE_SCHEDULERS_TAGTYPE = "SwSchedulableResource_Lifeline_schedulers";

    public static final String SWSCHEDULABLERESOURCE_LIFELINE_TIMESLICEELEMENTS_TAGTYPE = "SwSchedulableResource_Lifeline_timeSliceElements";

    public static final String SWSCHEDULABLERESOURCE_LIFELINE_YIELDSERVICES_TAGTYPE = "SwSchedulableResource_Lifeline_yieldServices";

    /**
     * Tells whether a {@link SwSchedulableResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << SwSchedulableResource_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwSchedulableResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << SwSchedulableResource_Lifeline >> then instantiate a {@link SwSchedulableResourceLifeline} proxy.
     * 
     * @return a {@link SwSchedulableResourceLifeline} proxy on the created {@link Lifeline}.
     */
    public static SwSchedulableResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwSchedulableResourceLifeline.STEREOTYPE_NAME);
        return SwSchedulableResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link SwSchedulableResourceLifeline} proxy from a {@link Lifeline} stereotyped << SwSchedulableResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link SwSchedulableResourceLifeline} proxy or <i>null</i>.
     */
    public static SwSchedulableResourceLifeline instantiate(final Lifeline obj) {
        return SwSchedulableResourceLifeline.canInstantiate(obj) ? new SwSchedulableResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwSchedulableResourceLifeline} proxy from a {@link Lifeline} stereotyped << SwSchedulableResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link SwSchedulableResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwSchedulableResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (SwSchedulableResourceLifeline.canInstantiate(obj))
        	return new SwSchedulableResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("SwSchedulableResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwSchedulableResourceLifeline other = (SwSchedulableResourceLifeline) obj;
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
     * Getter for List<String> property 'SwSchedulableResource_Lifeline_deadlineElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Lifeline_deadlineElements() {
        return this.elt.getTagValues(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_DEADLINEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Lifeline_deadlineTypeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Lifeline_deadlineTypeElements() {
        return this.elt.getTagValues(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_DEADLINETYPEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Lifeline_delayServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Lifeline_delayServices() {
        return this.elt.getTagValues(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_DELAYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Lifeline_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwSchedulableResource_Lifeline_dependentScheduler() {
        return this.elt.getTagValue(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_DEPENDENTSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Lifeline_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwSchedulableResource_Lifeline_host() {
        return this.elt.getTagValue(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Lifeline_joinServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Lifeline_joinServices() {
        return this.elt.getTagValues(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_JOINSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Lifeline_schedParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Lifeline_schedParams() {
        return this.elt.getTagValues(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_SCHEDPARAMS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Lifeline_schedulers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwSchedulableResource_Lifeline_schedulers() {
        return this.elt.getTagValue(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_SCHEDULERS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Lifeline_timeSliceElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Lifeline_timeSliceElements() {
        return this.elt.getTagValues(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_TIMESLICEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Lifeline_yieldServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Lifeline_yieldServices() {
        return this.elt.getTagValues(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_YIELDSERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwSchedulableResource_Lifeline_isPreemptable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSwSchedulableResource_Lifeline_isPreemptable() {
        return this.elt.isTagged(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_ISPREEMPTABLE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SwSchedulableResource_Lifeline_isStaticSchedulingFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSwSchedulableResource_Lifeline_isStaticSchedulingFeature() {
        return this.elt.isTagged(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Lifeline_deadlineElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Lifeline_deadlineElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_DEADLINEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Lifeline_deadlineTypeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Lifeline_deadlineTypeElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_DEADLINETYPEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Lifeline_delayServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Lifeline_delayServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_DELAYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Lifeline_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Lifeline_dependentScheduler(final String value) {
        this.elt.putTagValue(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_DEPENDENTSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Lifeline_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Lifeline_host(final String value) {
        this.elt.putTagValue(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SwSchedulableResource_Lifeline_isPreemptable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Lifeline_isPreemptable(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_ISPREEMPTABLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_ISPREEMPTABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SwSchedulableResource_Lifeline_isStaticSchedulingFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Lifeline_isStaticSchedulingFeature(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Lifeline_joinServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Lifeline_joinServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_JOINSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Lifeline_schedParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Lifeline_schedParams(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_SCHEDPARAMS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Lifeline_schedulers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Lifeline_schedulers(final String value) {
        this.elt.putTagValue(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_SCHEDULERS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Lifeline_timeSliceElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Lifeline_timeSliceElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_TIMESLICEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Lifeline_yieldServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Lifeline_yieldServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_YIELDSERVICES_TAGTYPE_ELT, values);
    }

    protected SwSchedulableResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_LIFELINE_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_LIFELINE_ISPREEMPTABLE_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_LIFELINE_SCHEDULERS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_LIFELINE_DEADLINEELEMENTS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_LIFELINE_DEADLINETYPEELEMENTS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_LIFELINE_TIMESLICEELEMENTS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_LIFELINE_DELAYSERVICES_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_LIFELINE_JOINSERVICES_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_LIFELINE_YIELDSERVICES_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_LIFELINE_SCHEDPARAMS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_LIFELINE_HOST_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_LIFELINE_DEPENDENTSCHEDULER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "adb221bc-10ce-11df-81d9-0014222a9f79");
            SWSCHEDULABLERESOURCE_LIFELINE_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "da678491-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_LIFELINE_ISPREEMPTABLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "da678492-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_LIFELINE_SCHEDULERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "da678493-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_LIFELINE_DEADLINEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "da678494-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_LIFELINE_DEADLINETYPEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "da678495-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_LIFELINE_TIMESLICEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "da678496-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_LIFELINE_DELAYSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "da678497-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_LIFELINE_JOINSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "da678498-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_LIFELINE_YIELDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "da678499-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_LIFELINE_SCHEDPARAMS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "95b81280-92ac-11e0-a69d-0027103f347c");
            SWSCHEDULABLERESOURCE_LIFELINE_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "95b8127f-92ac-11e0-a69d-0027103f347c");
            SWSCHEDULABLERESOURCE_LIFELINE_DEPENDENTSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "95b8127e-92ac-11e0-a69d-0027103f347c");
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
