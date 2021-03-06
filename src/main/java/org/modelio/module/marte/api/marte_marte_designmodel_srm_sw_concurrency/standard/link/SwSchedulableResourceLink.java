/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.link;

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
 * Proxy class to handle a {@link Link} with << SwSchedulableResource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwSchedulableResourceLink extends SwConcurrentResourceLink {
    public static final String STEREOTYPE_NAME = "SwSchedulableResource_Link";

    public static final String SWSCHEDULABLERESOURCE_LINK_DEADLINEELEMENTS_TAGTYPE = "SwSchedulableResource_Link_deadlineElements";

    public static final String SWSCHEDULABLERESOURCE_LINK_DEADLINETYPEELEMENTS_TAGTYPE = "SwSchedulableResource_Link_deadlineTypeElements";

    public static final String SWSCHEDULABLERESOURCE_LINK_DELAYSERVICES_TAGTYPE = "SwSchedulableResource_Link_delayServices";

    public static final String SWSCHEDULABLERESOURCE_LINK_DEPENDENTSCHEDULER_TAGTYPE = "SwSchedulableResource_Link_dependentScheduler";

    public static final String SWSCHEDULABLERESOURCE_LINK_HOST_TAGTYPE = "SwSchedulableResource_Link_host";

    public static final String SWSCHEDULABLERESOURCE_LINK_ISPREEMPTABLE_TAGTYPE = "SwSchedulableResource_Link_isPreemptable";

    public static final String SWSCHEDULABLERESOURCE_LINK_ISSTATICSCHEDULINGFEATURE_TAGTYPE = "SwSchedulableResource_Link_isStaticSchedulingFeature";

    public static final String SWSCHEDULABLERESOURCE_LINK_JOINSERVICES_TAGTYPE = "SwSchedulableResource_Link_joinServices";

    public static final String SWSCHEDULABLERESOURCE_LINK_SCHEDPARAMS_TAGTYPE = "SwSchedulableResource_Link_schedParams";

    public static final String SWSCHEDULABLERESOURCE_LINK_SCHEDULERS_TAGTYPE = "SwSchedulableResource_Link_schedulers";

    public static final String SWSCHEDULABLERESOURCE_LINK_TIMESLICEELEMENTS_TAGTYPE = "SwSchedulableResource_Link_timeSliceElements";

    public static final String SWSCHEDULABLERESOURCE_LINK_YIELDSERVICES_TAGTYPE = "SwSchedulableResource_Link_yieldServices";

    /**
     * Tells whether a {@link SwSchedulableResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << SwSchedulableResource_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwSchedulableResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << SwSchedulableResource_Link >> then instantiate a {@link SwSchedulableResourceLink} proxy.
     * 
     * @return a {@link SwSchedulableResourceLink} proxy on the created {@link Link}.
     */
    public static SwSchedulableResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwSchedulableResourceLink.STEREOTYPE_NAME);
        return SwSchedulableResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link SwSchedulableResourceLink} proxy from a {@link Link} stereotyped << SwSchedulableResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link SwSchedulableResourceLink} proxy or <i>null</i>.
     */
    public static SwSchedulableResourceLink instantiate(final Link obj) {
        return SwSchedulableResourceLink.canInstantiate(obj) ? new SwSchedulableResourceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwSchedulableResourceLink} proxy from a {@link Link} stereotyped << SwSchedulableResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link SwSchedulableResourceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwSchedulableResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (SwSchedulableResourceLink.canInstantiate(obj))
        	return new SwSchedulableResourceLink(obj);
        else
        	throw new IllegalArgumentException("SwSchedulableResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwSchedulableResourceLink other = (SwSchedulableResourceLink) obj;
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
     * Getter for List<String> property 'SwSchedulableResource_Link_deadlineElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Link_deadlineElements() {
        return this.elt.getTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_DEADLINEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Link_deadlineTypeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Link_deadlineTypeElements() {
        return this.elt.getTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_DEADLINETYPEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Link_delayServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Link_delayServices() {
        return this.elt.getTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_DELAYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Link_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwSchedulableResource_Link_dependentScheduler() {
        return this.elt.getTagValue(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_DEPENDENTSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Link_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwSchedulableResource_Link_host() {
        return this.elt.getTagValue(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Link_joinServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Link_joinServices() {
        return this.elt.getTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_JOINSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Link_schedParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Link_schedParams() {
        return this.elt.getTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_SCHEDPARAMS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Link_schedulers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwSchedulableResource_Link_schedulers() {
        return this.elt.getTagValue(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_SCHEDULERS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Link_timeSliceElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Link_timeSliceElements() {
        return this.elt.getTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_TIMESLICEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Link_yieldServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Link_yieldServices() {
        return this.elt.getTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_YIELDSERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwSchedulableResource_Link_isPreemptable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSwSchedulableResource_Link_isPreemptable() {
        return this.elt.isTagged(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_ISPREEMPTABLE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SwSchedulableResource_Link_isStaticSchedulingFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSwSchedulableResource_Link_isStaticSchedulingFeature() {
        return this.elt.isTagged(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Link_deadlineElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Link_deadlineElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_DEADLINEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Link_deadlineTypeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Link_deadlineTypeElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_DEADLINETYPEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Link_delayServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Link_delayServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_DELAYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Link_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Link_dependentScheduler(final String value) {
        this.elt.putTagValue(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_DEPENDENTSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Link_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Link_host(final String value) {
        this.elt.putTagValue(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SwSchedulableResource_Link_isPreemptable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Link_isPreemptable(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_ISPREEMPTABLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_ISPREEMPTABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SwSchedulableResource_Link_isStaticSchedulingFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Link_isStaticSchedulingFeature(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Link_joinServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Link_joinServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_JOINSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Link_schedParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Link_schedParams(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_SCHEDPARAMS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Link_schedulers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Link_schedulers(final String value) {
        this.elt.putTagValue(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_SCHEDULERS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Link_timeSliceElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Link_timeSliceElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_TIMESLICEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Link_yieldServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Link_yieldServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_YIELDSERVICES_TAGTYPE_ELT, values);
    }

    protected SwSchedulableResourceLink(final Link elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_LINK_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_LINK_ISPREEMPTABLE_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_LINK_SCHEDULERS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_LINK_DEADLINEELEMENTS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_LINK_DEADLINETYPEELEMENTS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_LINK_TIMESLICEELEMENTS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_LINK_DELAYSERVICES_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_LINK_JOINSERVICES_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_LINK_YIELDSERVICES_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_LINK_SCHEDPARAMS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_LINK_HOST_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_LINK_DEPENDENTSCHEDULER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01d7996c-0ccf-11df-8525-001302895b2b");
            SWSCHEDULABLERESOURCE_LINK_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ddea5e0d-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_LINK_ISPREEMPTABLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ddea5e0e-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_LINK_SCHEDULERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ddea5e0f-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_LINK_DEADLINEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ddea5e10-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_LINK_DEADLINETYPEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ddea5e11-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_LINK_TIMESLICEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ddea5e12-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_LINK_DELAYSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ddea5e13-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_LINK_JOINSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ddea5e14-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_LINK_YIELDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ddea5e15-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_LINK_SCHEDPARAMS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "973fcdf7-92ac-11e0-a69d-0027103f347c");
            SWSCHEDULABLERESOURCE_LINK_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "973fcdf6-92ac-11e0-a69d-0027103f347c");
            SWSCHEDULABLERESOURCE_LINK_DEPENDENTSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "973fcdf5-92ac-11e0-a69d-0027103f347c");
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
