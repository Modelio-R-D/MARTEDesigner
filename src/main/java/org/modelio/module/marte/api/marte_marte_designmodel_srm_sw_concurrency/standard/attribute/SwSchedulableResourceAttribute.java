/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.attribute;

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
 * Proxy class to handle a {@link Attribute} with << SwSchedulableResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwSchedulableResourceAttribute extends SwConcurrentResourceAttribute {
    public static final String STEREOTYPE_NAME = "SwSchedulableResource_Attribute";

    public static final String SWSCHEDULABLERESOURCE_ATTRIBUTE_DEADLINEELEMENTS_TAGTYPE = "SwSchedulableResource_Attribute_deadlineElements";

    public static final String SWSCHEDULABLERESOURCE_ATTRIBUTE_DEADLINETYPEELEMENTS_TAGTYPE = "SwSchedulableResource_Attribute_deadlineTypeElements";

    public static final String SWSCHEDULABLERESOURCE_ATTRIBUTE_DELAYSERVICES_TAGTYPE = "SwSchedulableResource_Attribute_delayServices";

    public static final String SWSCHEDULABLERESOURCE_ATTRIBUTE_DEPENDENTSCHEDULER_TAGTYPE = "SwSchedulableResource_Attribute_dependentScheduler";

    public static final String SWSCHEDULABLERESOURCE_ATTRIBUTE_HOST_TAGTYPE = "SwSchedulableResource_Attribute_host";

    public static final String SWSCHEDULABLERESOURCE_ATTRIBUTE_ISPREEMPTABLE_TAGTYPE = "SwSchedulableResource_Attribute_isPreemptable";

    public static final String SWSCHEDULABLERESOURCE_ATTRIBUTE_ISSTATICSCHEDULINGFEATURE_TAGTYPE = "SwSchedulableResource_Attribute_isStaticSchedulingFeature";

    public static final String SWSCHEDULABLERESOURCE_ATTRIBUTE_JOINSERVICES_TAGTYPE = "SwSchedulableResource_Attribute_joinServices";

    public static final String SWSCHEDULABLERESOURCE_ATTRIBUTE_SCHEDPARAMS_TAGTYPE = "SwSchedulableResource_Attribute_schedParams";

    public static final String SWSCHEDULABLERESOURCE_ATTRIBUTE_SCHEDULERS_TAGTYPE = "SwSchedulableResource_Attribute_schedulers";

    public static final String SWSCHEDULABLERESOURCE_ATTRIBUTE_TIMESLICEELEMENTS_TAGTYPE = "SwSchedulableResource_Attribute_timeSliceElements";

    public static final String SWSCHEDULABLERESOURCE_ATTRIBUTE_YIELDSERVICES_TAGTYPE = "SwSchedulableResource_Attribute_yieldServices";

    /**
     * Tells whether a {@link SwSchedulableResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << SwSchedulableResource_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwSchedulableResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << SwSchedulableResource_Attribute >> then instantiate a {@link SwSchedulableResourceAttribute} proxy.
     * 
     * @return a {@link SwSchedulableResourceAttribute} proxy on the created {@link Attribute}.
     */
    public static SwSchedulableResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwSchedulableResourceAttribute.STEREOTYPE_NAME);
        return SwSchedulableResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link SwSchedulableResourceAttribute} proxy from a {@link Attribute} stereotyped << SwSchedulableResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link SwSchedulableResourceAttribute} proxy or <i>null</i>.
     */
    public static SwSchedulableResourceAttribute instantiate(final Attribute obj) {
        return SwSchedulableResourceAttribute.canInstantiate(obj) ? new SwSchedulableResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwSchedulableResourceAttribute} proxy from a {@link Attribute} stereotyped << SwSchedulableResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link SwSchedulableResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwSchedulableResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (SwSchedulableResourceAttribute.canInstantiate(obj))
        	return new SwSchedulableResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("SwSchedulableResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwSchedulableResourceAttribute other = (SwSchedulableResourceAttribute) obj;
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
     * Getter for List<String> property 'SwSchedulableResource_Attribute_deadlineElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Attribute_deadlineElements() {
        return this.elt.getTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_DEADLINEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Attribute_deadlineTypeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Attribute_deadlineTypeElements() {
        return this.elt.getTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_DEADLINETYPEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Attribute_delayServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Attribute_delayServices() {
        return this.elt.getTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_DELAYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Attribute_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwSchedulableResource_Attribute_dependentScheduler() {
        return this.elt.getTagValue(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_DEPENDENTSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Attribute_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwSchedulableResource_Attribute_host() {
        return this.elt.getTagValue(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Attribute_joinServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Attribute_joinServices() {
        return this.elt.getTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_JOINSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Attribute_schedParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Attribute_schedParams() {
        return this.elt.getTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_SCHEDPARAMS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Attribute_schedulers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwSchedulableResource_Attribute_schedulers() {
        return this.elt.getTagValue(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_SCHEDULERS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Attribute_timeSliceElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Attribute_timeSliceElements() {
        return this.elt.getTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_TIMESLICEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Attribute_yieldServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Attribute_yieldServices() {
        return this.elt.getTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_YIELDSERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwSchedulableResource_Attribute_isPreemptable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSwSchedulableResource_Attribute_isPreemptable() {
        return this.elt.isTagged(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_ISPREEMPTABLE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SwSchedulableResource_Attribute_isStaticSchedulingFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSwSchedulableResource_Attribute_isStaticSchedulingFeature() {
        return this.elt.isTagged(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Attribute_deadlineElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Attribute_deadlineElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_DEADLINEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Attribute_deadlineTypeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Attribute_deadlineTypeElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_DEADLINETYPEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Attribute_delayServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Attribute_delayServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_DELAYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Attribute_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Attribute_dependentScheduler(final String value) {
        this.elt.putTagValue(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_DEPENDENTSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Attribute_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Attribute_host(final String value) {
        this.elt.putTagValue(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SwSchedulableResource_Attribute_isPreemptable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Attribute_isPreemptable(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_ISPREEMPTABLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_ISPREEMPTABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SwSchedulableResource_Attribute_isStaticSchedulingFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Attribute_isStaticSchedulingFeature(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Attribute_joinServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Attribute_joinServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_JOINSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Attribute_schedParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Attribute_schedParams(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_SCHEDPARAMS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Attribute_schedulers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Attribute_schedulers(final String value) {
        this.elt.putTagValue(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_SCHEDULERS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Attribute_timeSliceElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Attribute_timeSliceElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_TIMESLICEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Attribute_yieldServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Attribute_yieldServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_YIELDSERVICES_TAGTYPE_ELT, values);
    }

    protected SwSchedulableResourceAttribute(final Attribute elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_ATTRIBUTE_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_ATTRIBUTE_ISPREEMPTABLE_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_ATTRIBUTE_SCHEDULERS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_ATTRIBUTE_DEADLINEELEMENTS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_ATTRIBUTE_DEADLINETYPEELEMENTS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_ATTRIBUTE_TIMESLICEELEMENTS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_ATTRIBUTE_DELAYSERVICES_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_ATTRIBUTE_JOINSERVICES_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_ATTRIBUTE_YIELDSERVICES_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_ATTRIBUTE_SCHEDPARAMS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_ATTRIBUTE_HOST_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_ATTRIBUTE_DEPENDENTSCHEDULER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01d7996a-0ccf-11df-8525-001302895b2b");
            SWSCHEDULABLERESOURCE_ATTRIBUTE_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e16d3789-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ATTRIBUTE_ISPREEMPTABLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e16d378a-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ATTRIBUTE_SCHEDULERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e16d378b-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ATTRIBUTE_DEADLINEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e16d378c-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ATTRIBUTE_DEADLINETYPEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e16d378d-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ATTRIBUTE_TIMESLICEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e16d378e-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ATTRIBUTE_DELAYSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e16d378f-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ATTRIBUTE_JOINSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e16d3790-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ATTRIBUTE_YIELDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e16d3791-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ATTRIBUTE_SCHEDPARAMS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "91dfc82c-92ac-11e0-a69d-0027103f347c");
            SWSCHEDULABLERESOURCE_ATTRIBUTE_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "91dfc82b-92ac-11e0-a69d-0027103f347c");
            SWSCHEDULABLERESOURCE_ATTRIBUTE_DEPENDENTSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "91dfc82a-92ac-11e0-a69d-0027103f347c");
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
