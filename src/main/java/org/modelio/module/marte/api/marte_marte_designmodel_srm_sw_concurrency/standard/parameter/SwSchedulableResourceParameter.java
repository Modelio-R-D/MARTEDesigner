/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.parameter;

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
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << SwSchedulableResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwSchedulableResourceParameter extends SwConcurrentResourceParameter {
    public static final String STEREOTYPE_NAME = "SwSchedulableResource_Parameter";

    public static final String SWSCHEDULABLERESOURCE_PARAMETER_DEADLINEELEMENTS_TAGTYPE = "SwSchedulableResource_Parameter_deadlineElements";

    public static final String SWSCHEDULABLERESOURCE_PARAMETER_DEADLINETYPEELEMENTS_TAGTYPE = "SwSchedulableResource_Parameter_deadlineTypeElements";

    public static final String SWSCHEDULABLERESOURCE_PARAMETER_DELAYSERVICES_TAGTYPE = "SwSchedulableResource_Parameter_delayServices";

    public static final String SWSCHEDULABLERESOURCE_PARAMETER_DEPENDENTSCHEDULER_TAGTYPE = "SwSchedulableResource_Parameter_dependentScheduler";

    public static final String SWSCHEDULABLERESOURCE_PARAMETER_HOST_TAGTYPE = "SwSchedulableResource_Parameter_host";

    public static final String SWSCHEDULABLERESOURCE_PARAMETER_ISPREEMPTABLE_TAGTYPE = "SwSchedulableResource_Parameter_isPreemptable";

    public static final String SWSCHEDULABLERESOURCE_PARAMETER_ISSTATICSCHEDULINGFEATURE_TAGTYPE = "SwSchedulableResource_Parameter_isStaticSchedulingFeature";

    public static final String SWSCHEDULABLERESOURCE_PARAMETER_JOINSERVICES_TAGTYPE = "SwSchedulableResource_Parameter_joinServices";

    public static final String SWSCHEDULABLERESOURCE_PARAMETER_SCHEDPARAMS_TAGTYPE = "SwSchedulableResource_Parameter_schedParams";

    public static final String SWSCHEDULABLERESOURCE_PARAMETER_SCHEDULERS_TAGTYPE = "SwSchedulableResource_Parameter_schedulers";

    public static final String SWSCHEDULABLERESOURCE_PARAMETER_TIMESLICEELEMENTS_TAGTYPE = "SwSchedulableResource_Parameter_timeSliceElements";

    public static final String SWSCHEDULABLERESOURCE_PARAMETER_YIELDSERVICES_TAGTYPE = "SwSchedulableResource_Parameter_yieldServices";

    /**
     * Tells whether a {@link SwSchedulableResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << SwSchedulableResource_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwSchedulableResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << SwSchedulableResource_Parameter >> then instantiate a {@link SwSchedulableResourceParameter} proxy.
     * 
     * @return a {@link SwSchedulableResourceParameter} proxy on the created {@link Parameter}.
     */
    public static SwSchedulableResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwSchedulableResourceParameter.STEREOTYPE_NAME);
        return SwSchedulableResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link SwSchedulableResourceParameter} proxy from a {@link Parameter} stereotyped << SwSchedulableResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link SwSchedulableResourceParameter} proxy or <i>null</i>.
     */
    public static SwSchedulableResourceParameter instantiate(final Parameter obj) {
        return SwSchedulableResourceParameter.canInstantiate(obj) ? new SwSchedulableResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwSchedulableResourceParameter} proxy from a {@link Parameter} stereotyped << SwSchedulableResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link SwSchedulableResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwSchedulableResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (SwSchedulableResourceParameter.canInstantiate(obj))
        	return new SwSchedulableResourceParameter(obj);
        else
        	throw new IllegalArgumentException("SwSchedulableResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwSchedulableResourceParameter other = (SwSchedulableResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Parameter_deadlineElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Parameter_deadlineElements() {
        return this.elt.getTagValues(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_DEADLINEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Parameter_deadlineTypeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Parameter_deadlineTypeElements() {
        return this.elt.getTagValues(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_DEADLINETYPEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Parameter_delayServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Parameter_delayServices() {
        return this.elt.getTagValues(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_DELAYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Parameter_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwSchedulableResource_Parameter_dependentScheduler() {
        return this.elt.getTagValue(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_DEPENDENTSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Parameter_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwSchedulableResource_Parameter_host() {
        return this.elt.getTagValue(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Parameter_joinServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Parameter_joinServices() {
        return this.elt.getTagValues(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_JOINSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Parameter_schedParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Parameter_schedParams() {
        return this.elt.getTagValues(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_SCHEDPARAMS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Parameter_schedulers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwSchedulableResource_Parameter_schedulers() {
        return this.elt.getTagValue(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_SCHEDULERS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Parameter_timeSliceElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Parameter_timeSliceElements() {
        return this.elt.getTagValues(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_TIMESLICEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Parameter_yieldServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Parameter_yieldServices() {
        return this.elt.getTagValues(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_YIELDSERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwSchedulableResource_Parameter_isPreemptable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSwSchedulableResource_Parameter_isPreemptable() {
        return this.elt.isTagged(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_ISPREEMPTABLE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SwSchedulableResource_Parameter_isStaticSchedulingFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSwSchedulableResource_Parameter_isStaticSchedulingFeature() {
        return this.elt.isTagged(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Parameter_deadlineElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Parameter_deadlineElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_DEADLINEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Parameter_deadlineTypeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Parameter_deadlineTypeElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_DEADLINETYPEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Parameter_delayServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Parameter_delayServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_DELAYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Parameter_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Parameter_dependentScheduler(final String value) {
        this.elt.putTagValue(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_DEPENDENTSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Parameter_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Parameter_host(final String value) {
        this.elt.putTagValue(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SwSchedulableResource_Parameter_isPreemptable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Parameter_isPreemptable(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_ISPREEMPTABLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_ISPREEMPTABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SwSchedulableResource_Parameter_isStaticSchedulingFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Parameter_isStaticSchedulingFeature(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Parameter_joinServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Parameter_joinServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_JOINSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Parameter_schedParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Parameter_schedParams(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_SCHEDPARAMS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Parameter_schedulers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Parameter_schedulers(final String value) {
        this.elt.putTagValue(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_SCHEDULERS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Parameter_timeSliceElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Parameter_timeSliceElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_TIMESLICEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Parameter_yieldServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Parameter_yieldServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_YIELDSERVICES_TAGTYPE_ELT, values);
    }

    protected SwSchedulableResourceParameter(final Parameter elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_PARAMETER_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_PARAMETER_ISPREEMPTABLE_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_PARAMETER_SCHEDULERS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_PARAMETER_DEADLINEELEMENTS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_PARAMETER_DEADLINETYPEELEMENTS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_PARAMETER_TIMESLICEELEMENTS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_PARAMETER_DELAYSERVICES_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_PARAMETER_JOINSERVICES_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_PARAMETER_YIELDSERVICES_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_PARAMETER_SCHEDPARAMS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_PARAMETER_HOST_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_PARAMETER_DEPENDENTSCHEDULER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01cbadd7-0ccf-11df-8525-001302895b2b");
            SWSCHEDULABLERESOURCE_PARAMETER_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01d9fbba-0ccf-11df-8525-001302895b2b");
            SWSCHEDULABLERESOURCE_PARAMETER_ISPREEMPTABLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01d9fbc1-0ccf-11df-8525-001302895b2b");
            SWSCHEDULABLERESOURCE_PARAMETER_SCHEDULERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01d9fbc8-0ccf-11df-8525-001302895b2b");
            SWSCHEDULABLERESOURCE_PARAMETER_DEADLINEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01d9fbcf-0ccf-11df-8525-001302895b2b");
            SWSCHEDULABLERESOURCE_PARAMETER_DEADLINETYPEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01d9fbd6-0ccf-11df-8525-001302895b2b");
            SWSCHEDULABLERESOURCE_PARAMETER_TIMESLICEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01dc5e0e-0ccf-11df-8525-001302895b2b");
            SWSCHEDULABLERESOURCE_PARAMETER_DELAYSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01dc5e15-0ccf-11df-8525-001302895b2b");
            SWSCHEDULABLERESOURCE_PARAMETER_JOINSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01dc5e1c-0ccf-11df-8525-001302895b2b");
            SWSCHEDULABLERESOURCE_PARAMETER_YIELDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01dc5e23-0ccf-11df-8525-001302895b2b");
            SWSCHEDULABLERESOURCE_PARAMETER_SCHEDPARAMS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "98db38fb-92ac-11e0-a69d-0027103f347c");
            SWSCHEDULABLERESOURCE_PARAMETER_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "98db38fa-92ac-11e0-a69d-0027103f347c");
            SWSCHEDULABLERESOURCE_PARAMETER_DEPENDENTSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "98db11ec-92ac-11e0-a69d-0027103f347c");
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
