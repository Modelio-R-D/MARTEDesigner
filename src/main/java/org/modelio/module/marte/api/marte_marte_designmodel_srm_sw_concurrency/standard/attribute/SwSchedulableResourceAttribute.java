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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("9b4365cb-cf7a-4eeb-8dd7-7306e4f01c98")
public class SwSchedulableResourceAttribute extends SwConcurrentResourceAttribute {
    @objid ("c4e84d5b-35c8-4fca-95e9-2e7d82220794")
    public static final String STEREOTYPE_NAME = "SwSchedulableResource_Attribute";

    @objid ("39a63029-b062-4b9c-a9bb-809022bf0994")
    public static final String SWSCHEDULABLERESOURCE_ATTRIBUTE_DEADLINEELEMENTS_TAGTYPE = "SwSchedulableResource_Attribute_deadlineElements";

    @objid ("61de224b-9eaf-45e6-a5fb-066b70b8d369")
    public static final String SWSCHEDULABLERESOURCE_ATTRIBUTE_DEADLINETYPEELEMENTS_TAGTYPE = "SwSchedulableResource_Attribute_deadlineTypeElements";

    @objid ("45e03b7d-76cd-4eda-8a18-63097e87c51d")
    public static final String SWSCHEDULABLERESOURCE_ATTRIBUTE_DELAYSERVICES_TAGTYPE = "SwSchedulableResource_Attribute_delayServices";

    @objid ("26a133a3-5c88-438e-b9dc-1d3d74ed7b99")
    public static final String SWSCHEDULABLERESOURCE_ATTRIBUTE_DEPENDENTSCHEDULER_TAGTYPE = "SwSchedulableResource_Attribute_dependentScheduler";

    @objid ("840310ad-8c25-4de9-88fd-9707db9d2d19")
    public static final String SWSCHEDULABLERESOURCE_ATTRIBUTE_HOST_TAGTYPE = "SwSchedulableResource_Attribute_host";

    @objid ("6a717f3b-f67d-4972-990e-8013aee4811a")
    public static final String SWSCHEDULABLERESOURCE_ATTRIBUTE_ISPREEMPTABLE_TAGTYPE = "SwSchedulableResource_Attribute_isPreemptable";

    @objid ("41ee1c89-9c73-41d2-9920-7d1ff2f33455")
    public static final String SWSCHEDULABLERESOURCE_ATTRIBUTE_ISSTATICSCHEDULINGFEATURE_TAGTYPE = "SwSchedulableResource_Attribute_isStaticSchedulingFeature";

    @objid ("61c63dc8-e750-4a2d-91a6-9c733c4852a6")
    public static final String SWSCHEDULABLERESOURCE_ATTRIBUTE_JOINSERVICES_TAGTYPE = "SwSchedulableResource_Attribute_joinServices";

    @objid ("3a9ed4a7-eb28-457d-ad38-21de427f0e56")
    public static final String SWSCHEDULABLERESOURCE_ATTRIBUTE_SCHEDPARAMS_TAGTYPE = "SwSchedulableResource_Attribute_schedParams";

    @objid ("bbd1e049-be01-4ae5-a089-6aefc51c987e")
    public static final String SWSCHEDULABLERESOURCE_ATTRIBUTE_SCHEDULERS_TAGTYPE = "SwSchedulableResource_Attribute_schedulers";

    @objid ("a0ba8d23-8ba7-4eb8-b331-88838f361227")
    public static final String SWSCHEDULABLERESOURCE_ATTRIBUTE_TIMESLICEELEMENTS_TAGTYPE = "SwSchedulableResource_Attribute_timeSliceElements";

    @objid ("b0e36633-44cf-4369-912f-ee02fbe28f59")
    public static final String SWSCHEDULABLERESOURCE_ATTRIBUTE_YIELDSERVICES_TAGTYPE = "SwSchedulableResource_Attribute_yieldServices";

    /**
     * Tells whether a {@link SwSchedulableResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << SwSchedulableResource_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ab320f59-7b12-4e75-811d-6822588d1248")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwSchedulableResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << SwSchedulableResource_Attribute >> then instantiate a {@link SwSchedulableResourceAttribute} proxy.
     * 
     * @return a {@link SwSchedulableResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("49bd2e8b-a19c-4332-b985-250a81359529")
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
    @objid ("53f402e4-f2cc-4934-b2c8-4f86e31a5f76")
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
    @objid ("aa7d16f0-601c-43bd-974b-5de4d0b39e9d")
    public static SwSchedulableResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (SwSchedulableResourceAttribute.canInstantiate(obj))
        	return new SwSchedulableResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("SwSchedulableResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b3796279-2506-4c80-b25c-3ba5b539faef")
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
    @objid ("0bd94fe6-6639-490f-b65a-0b33158796eb")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Attribute_deadlineElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6dd1aeb8-4a5d-4abe-b3e1-b1ac72d1f4a9")
    public List<String> getSwSchedulableResource_Attribute_deadlineElements() {
        return this.elt.getTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_DEADLINEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Attribute_deadlineTypeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c4ee3052-a5e5-4abd-a25a-90f9da97ca16")
    public List<String> getSwSchedulableResource_Attribute_deadlineTypeElements() {
        return this.elt.getTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_DEADLINETYPEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Attribute_delayServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b51ab90c-1021-4360-a32f-e3e32d2dd3b6")
    public List<String> getSwSchedulableResource_Attribute_delayServices() {
        return this.elt.getTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_DELAYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Attribute_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ce0e3d8c-19e4-4eec-9d9a-7d5c0ec8826f")
    public String getSwSchedulableResource_Attribute_dependentScheduler() {
        return this.elt.getTagValue(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_DEPENDENTSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Attribute_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2a09a4ed-6ee6-4133-88f0-0eb2eecd7193")
    public String getSwSchedulableResource_Attribute_host() {
        return this.elt.getTagValue(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Attribute_joinServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("53ff443d-fc63-4843-9017-8f47cac9637a")
    public List<String> getSwSchedulableResource_Attribute_joinServices() {
        return this.elt.getTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_JOINSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Attribute_schedParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a3258f39-ca68-4835-b4af-a9777bba3fae")
    public List<String> getSwSchedulableResource_Attribute_schedParams() {
        return this.elt.getTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_SCHEDPARAMS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Attribute_schedulers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("911da625-badc-42ee-9a07-33fae949bcb9")
    public String getSwSchedulableResource_Attribute_schedulers() {
        return this.elt.getTagValue(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_SCHEDULERS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Attribute_timeSliceElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a51a99ef-6090-4421-b066-b28bf2ca3ae7")
    public List<String> getSwSchedulableResource_Attribute_timeSliceElements() {
        return this.elt.getTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_TIMESLICEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Attribute_yieldServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e487954b-33a0-493c-9421-806db060eb4a")
    public List<String> getSwSchedulableResource_Attribute_yieldServices() {
        return this.elt.getTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_YIELDSERVICES_TAGTYPE_ELT);
    }

    @objid ("64fa8a9a-a8b7-4ea9-bda3-a9155a5b4a33")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwSchedulableResource_Attribute_isPreemptable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6ec1f73c-e3b8-47dc-b12e-7bf15e8b7d33")
    public boolean isSwSchedulableResource_Attribute_isPreemptable() {
        return this.elt.isTagged(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_ISPREEMPTABLE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SwSchedulableResource_Attribute_isStaticSchedulingFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f6084ddd-662e-45f2-b765-f08cd522f0fc")
    public boolean isSwSchedulableResource_Attribute_isStaticSchedulingFeature() {
        return this.elt.isTagged(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Attribute_deadlineElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("02344c82-3c01-4e2e-bf57-a701102e7085")
    public void setSwSchedulableResource_Attribute_deadlineElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_DEADLINEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Attribute_deadlineTypeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8ec57d3b-ba1d-4284-9bcd-cdfb30ef5ad8")
    public void setSwSchedulableResource_Attribute_deadlineTypeElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_DEADLINETYPEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Attribute_delayServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b5daf939-152b-4b12-bfdb-4f3fbbde5b6d")
    public void setSwSchedulableResource_Attribute_delayServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_DELAYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Attribute_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f2c3420c-acc4-40e1-9ace-39eeb0bbca22")
    public void setSwSchedulableResource_Attribute_dependentScheduler(final String value) {
        this.elt.putTagValue(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_DEPENDENTSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Attribute_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6051b3b5-f4d3-4758-b660-035eb325f77d")
    public void setSwSchedulableResource_Attribute_host(final String value) {
        this.elt.putTagValue(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SwSchedulableResource_Attribute_isPreemptable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("14397706-b031-4d96-a01a-3da2939fab37")
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
    @objid ("918e4f01-9745-419e-8e74-258697203108")
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
    @objid ("26142590-d631-49cc-887b-d714d94786af")
    public void setSwSchedulableResource_Attribute_joinServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_JOINSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Attribute_schedParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9c1ee94e-f0b3-4ac0-a2ac-cdc3205efa8e")
    public void setSwSchedulableResource_Attribute_schedParams(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_SCHEDPARAMS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Attribute_schedulers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("edc5568f-927b-4aeb-be29-f168907abca9")
    public void setSwSchedulableResource_Attribute_schedulers(final String value) {
        this.elt.putTagValue(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_SCHEDULERS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Attribute_timeSliceElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3b520bbd-eff0-455f-9e89-da06d5086f75")
    public void setSwSchedulableResource_Attribute_timeSliceElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_TIMESLICEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Attribute_yieldServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f5c46dc1-c0f5-451c-b1c6-f81b2fc53ba5")
    public void setSwSchedulableResource_Attribute_yieldServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_YIELDSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("414ad408-0a57-4cf3-9b88-ad682fd7722f")
    protected SwSchedulableResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("cdf64c79-a9fe-4a04-b757-494a993d6949")
    public static final class MdaTypes {
        @objid ("de04bb08-6aa2-4d1a-991c-0a79d6a144bd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0039e7e4-a5d0-496f-a02a-1c6e448673d3")
        public static TagType SWSCHEDULABLERESOURCE_ATTRIBUTE_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT;

        @objid ("42b8c4f4-c0a7-415b-ab15-c9f10f2edc56")
        public static TagType SWSCHEDULABLERESOURCE_ATTRIBUTE_ISPREEMPTABLE_TAGTYPE_ELT;

        @objid ("1d62c1c9-fbcb-4d04-8e3d-f5b48b74a766")
        public static TagType SWSCHEDULABLERESOURCE_ATTRIBUTE_SCHEDULERS_TAGTYPE_ELT;

        @objid ("18d75dfc-3cb7-4834-adac-822b326d0e4e")
        public static TagType SWSCHEDULABLERESOURCE_ATTRIBUTE_DEADLINEELEMENTS_TAGTYPE_ELT;

        @objid ("7f02e163-4220-4863-9486-1c7006476945")
        public static TagType SWSCHEDULABLERESOURCE_ATTRIBUTE_DEADLINETYPEELEMENTS_TAGTYPE_ELT;

        @objid ("a6e1f667-c816-4f84-ad76-7beadae1c9c7")
        public static TagType SWSCHEDULABLERESOURCE_ATTRIBUTE_TIMESLICEELEMENTS_TAGTYPE_ELT;

        @objid ("39cc7e22-1305-4252-8888-5532c04c4446")
        public static TagType SWSCHEDULABLERESOURCE_ATTRIBUTE_DELAYSERVICES_TAGTYPE_ELT;

        @objid ("2640f370-3314-4f93-92bd-54382132d4d2")
        public static TagType SWSCHEDULABLERESOURCE_ATTRIBUTE_JOINSERVICES_TAGTYPE_ELT;

        @objid ("b9fc6ace-f117-4ff4-b2d4-4a3863a06219")
        public static TagType SWSCHEDULABLERESOURCE_ATTRIBUTE_YIELDSERVICES_TAGTYPE_ELT;

        @objid ("43880324-feb7-49c1-acb5-80b74100f2fb")
        public static TagType SWSCHEDULABLERESOURCE_ATTRIBUTE_SCHEDPARAMS_TAGTYPE_ELT;

        @objid ("e375eb4d-7ba7-4400-a093-3d14701aff4d")
        public static TagType SWSCHEDULABLERESOURCE_ATTRIBUTE_HOST_TAGTYPE_ELT;

        @objid ("fc981280-8951-4225-9a1f-f2520d9bfdc8")
        public static TagType SWSCHEDULABLERESOURCE_ATTRIBUTE_DEPENDENTSCHEDULER_TAGTYPE_ELT;

        @objid ("f398f3ec-d64f-466f-b7d3-a3a22dd706e2")
        private static Stereotype MDAASSOCDEP;

        @objid ("7aaa2fd8-898b-432b-92aa-0d61f81cff5d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2a720cf7-20ee-42fc-9201-024547cb0e78")
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
