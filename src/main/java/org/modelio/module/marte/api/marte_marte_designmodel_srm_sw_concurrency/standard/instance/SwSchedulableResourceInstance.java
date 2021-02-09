/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.instance;

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
 * Proxy class to handle a {@link Instance} with << SwSchedulableResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwSchedulableResourceInstance extends SwConcurrentResourceInstance {
    public static final String STEREOTYPE_NAME = "SwSchedulableResource_Instance";

    public static final String SWSCHEDULABLERESOURCE_INSTANCE_DEADLINEELEMENTS_TAGTYPE = "SwSchedulableResource_Instance_deadlineElements";

    public static final String SWSCHEDULABLERESOURCE_INSTANCE_DEADLINETYPEELEMENTS_TAGTYPE = "SwSchedulableResource_Instance_deadlineTypeElements";

    public static final String SWSCHEDULABLERESOURCE_INSTANCE_DELAYSERVICES_TAGTYPE = "SwSchedulableResource_Instance_delayServices";

    public static final String SWSCHEDULABLERESOURCE_INSTANCE_DEPENDENTSCHEDULER_TAGTYPE = "SwSchedulableResource_Instance_dependentScheduler";

    public static final String SWSCHEDULABLERESOURCE_INSTANCE_HOST_TAGTYPE = "SwSchedulableResource_Instance_host";

    public static final String SWSCHEDULABLERESOURCE_INSTANCE_ISPREEMPTABLE_TAGTYPE = "SwSchedulableResource_Instance_isPreemptable";

    public static final String SWSCHEDULABLERESOURCE_INSTANCE_ISSTATICSCHEDULINGFEATURE_TAGTYPE = "SwSchedulableResource_Instance_isStaticSchedulingFeature";

    public static final String SWSCHEDULABLERESOURCE_INSTANCE_JOINSERVICES_TAGTYPE = "SwSchedulableResource_Instance_joinServices";

    public static final String SWSCHEDULABLERESOURCE_INSTANCE_SCHEDPARAMS_TAGTYPE = "SwSchedulableResource_Instance_schedParams";

    public static final String SWSCHEDULABLERESOURCE_INSTANCE_SCHEDULERS_TAGTYPE = "SwSchedulableResource_Instance_schedulers";

    public static final String SWSCHEDULABLERESOURCE_INSTANCE_TIMESLICEELEMENTS_TAGTYPE = "SwSchedulableResource_Instance_timeSliceElements";

    public static final String SWSCHEDULABLERESOURCE_INSTANCE_YIELDSERVICES_TAGTYPE = "SwSchedulableResource_Instance_yieldServices";

    /**
     * Tells whether a {@link SwSchedulableResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SwSchedulableResource_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwSchedulableResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SwSchedulableResource_Instance >> then instantiate a {@link SwSchedulableResourceInstance} proxy.
     * 
     * @return a {@link SwSchedulableResourceInstance} proxy on the created {@link Instance}.
     */
    public static SwSchedulableResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwSchedulableResourceInstance.STEREOTYPE_NAME);
        return SwSchedulableResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link SwSchedulableResourceInstance} proxy from a {@link Instance} stereotyped << SwSchedulableResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link SwSchedulableResourceInstance} proxy or <i>null</i>.
     */
    public static SwSchedulableResourceInstance instantiate(final Instance obj) {
        return SwSchedulableResourceInstance.canInstantiate(obj) ? new SwSchedulableResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwSchedulableResourceInstance} proxy from a {@link Instance} stereotyped << SwSchedulableResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link SwSchedulableResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwSchedulableResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SwSchedulableResourceInstance.canInstantiate(obj))
        	return new SwSchedulableResourceInstance(obj);
        else
        	throw new IllegalArgumentException("SwSchedulableResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwSchedulableResourceInstance other = (SwSchedulableResourceInstance) obj;
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
     * Getter for List<String> property 'SwSchedulableResource_Instance_deadlineElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Instance_deadlineElements() {
        return this.elt.getTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_DEADLINEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Instance_deadlineTypeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Instance_deadlineTypeElements() {
        return this.elt.getTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_DEADLINETYPEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Instance_delayServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Instance_delayServices() {
        return this.elt.getTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_DELAYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Instance_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwSchedulableResource_Instance_dependentScheduler() {
        return this.elt.getTagValue(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_DEPENDENTSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Instance_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwSchedulableResource_Instance_host() {
        return this.elt.getTagValue(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Instance_joinServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Instance_joinServices() {
        return this.elt.getTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_JOINSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Instance_schedParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Instance_schedParams() {
        return this.elt.getTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_SCHEDPARAMS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Instance_schedulers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwSchedulableResource_Instance_schedulers() {
        return this.elt.getTagValue(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_SCHEDULERS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Instance_timeSliceElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Instance_timeSliceElements() {
        return this.elt.getTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_TIMESLICEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Instance_yieldServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Instance_yieldServices() {
        return this.elt.getTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_YIELDSERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwSchedulableResource_Instance_isPreemptable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSwSchedulableResource_Instance_isPreemptable() {
        return this.elt.isTagged(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_ISPREEMPTABLE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SwSchedulableResource_Instance_isStaticSchedulingFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSwSchedulableResource_Instance_isStaticSchedulingFeature() {
        return this.elt.isTagged(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Instance_deadlineElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Instance_deadlineElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_DEADLINEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Instance_deadlineTypeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Instance_deadlineTypeElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_DEADLINETYPEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Instance_delayServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Instance_delayServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_DELAYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Instance_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Instance_dependentScheduler(final String value) {
        this.elt.putTagValue(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_DEPENDENTSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Instance_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Instance_host(final String value) {
        this.elt.putTagValue(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SwSchedulableResource_Instance_isPreemptable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Instance_isPreemptable(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_ISPREEMPTABLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_ISPREEMPTABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SwSchedulableResource_Instance_isStaticSchedulingFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Instance_isStaticSchedulingFeature(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Instance_joinServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Instance_joinServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_JOINSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Instance_schedParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Instance_schedParams(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_SCHEDPARAMS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Instance_schedulers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Instance_schedulers(final String value) {
        this.elt.putTagValue(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_SCHEDULERS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Instance_timeSliceElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Instance_timeSliceElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_TIMESLICEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Instance_yieldServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Instance_yieldServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_YIELDSERVICES_TAGTYPE_ELT, values);
    }

    protected SwSchedulableResourceInstance(final Instance elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_INSTANCE_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_INSTANCE_ISPREEMPTABLE_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_INSTANCE_SCHEDULERS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_INSTANCE_DEADLINEELEMENTS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_INSTANCE_DEADLINETYPEELEMENTS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_INSTANCE_TIMESLICEELEMENTS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_INSTANCE_DELAYSERVICES_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_INSTANCE_JOINSERVICES_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_INSTANCE_YIELDSERVICES_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_INSTANCE_SCHEDPARAMS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_INSTANCE_HOST_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_INSTANCE_DEPENDENTSCHEDULER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01d7996d-0ccf-11df-8525-001302895b2b");
            SWSCHEDULABLERESOURCE_INSTANCE_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dcc51bd9-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_INSTANCE_ISPREEMPTABLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dcc51bda-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_INSTANCE_SCHEDULERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dcc51bdb-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_INSTANCE_DEADLINEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dcc51bdc-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_INSTANCE_DEADLINETYPEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dcc51bdd-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_INSTANCE_TIMESLICEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dcc51bde-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_INSTANCE_DELAYSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dcc51bdf-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_INSTANCE_JOINSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dcc51be0-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_INSTANCE_YIELDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dcc51be1-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_INSTANCE_SCHEDPARAMS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "940c2c4c-92ac-11e0-a69d-0027103f347c");
            SWSCHEDULABLERESOURCE_INSTANCE_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "940c2c4b-92ac-11e0-a69d-0027103f347c");
            SWSCHEDULABLERESOURCE_INSTANCE_DEPENDENTSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "940c2c4a-92ac-11e0-a69d-0027103f347c");
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
