/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("185c011d-2cfc-491a-9dd9-56718ae24671")
    public static final String STEREOTYPE_NAME = "SwSchedulableResource_Attribute";

    @objid ("48999504-0c14-495f-a7ae-f1d30f9bb8c2")
    public static final String SWSCHEDULABLERESOURCE_ATTRIBUTE_DEADLINEELEMENTS_TAGTYPE = "SwSchedulableResource_Attribute_deadlineElements";

    @objid ("bf63213e-67cb-486a-af62-0272d15bbafa")
    public static final String SWSCHEDULABLERESOURCE_ATTRIBUTE_DEADLINETYPEELEMENTS_TAGTYPE = "SwSchedulableResource_Attribute_deadlineTypeElements";

    @objid ("b7c30595-d303-4dfc-8adf-8ccd73b0e551")
    public static final String SWSCHEDULABLERESOURCE_ATTRIBUTE_DELAYSERVICES_TAGTYPE = "SwSchedulableResource_Attribute_delayServices";

    @objid ("40cff06b-eae3-4a60-bb2f-79bde3690d9e")
    public static final String SWSCHEDULABLERESOURCE_ATTRIBUTE_DEPENDENTSCHEDULER_TAGTYPE = "SwSchedulableResource_Attribute_dependentScheduler";

    @objid ("9de088c0-77e6-44e4-abce-bedd078cb10e")
    public static final String SWSCHEDULABLERESOURCE_ATTRIBUTE_HOST_TAGTYPE = "SwSchedulableResource_Attribute_host";

    @objid ("73b81208-ea83-45f8-a216-68255832dd6e")
    public static final String SWSCHEDULABLERESOURCE_ATTRIBUTE_ISPREEMPTABLE_TAGTYPE = "SwSchedulableResource_Attribute_isPreemptable";

    @objid ("9830da81-38c3-4bdc-9811-e16a7ebb6b5f")
    public static final String SWSCHEDULABLERESOURCE_ATTRIBUTE_ISSTATICSCHEDULINGFEATURE_TAGTYPE = "SwSchedulableResource_Attribute_isStaticSchedulingFeature";

    @objid ("ad4c03aa-c959-4467-ada0-7ef1d70590db")
    public static final String SWSCHEDULABLERESOURCE_ATTRIBUTE_JOINSERVICES_TAGTYPE = "SwSchedulableResource_Attribute_joinServices";

    @objid ("b2f03a47-593a-44bb-aad8-81ec904e7cf4")
    public static final String SWSCHEDULABLERESOURCE_ATTRIBUTE_SCHEDPARAMS_TAGTYPE = "SwSchedulableResource_Attribute_schedParams";

    @objid ("37e83fe4-5920-45f5-8a16-1474a80924a6")
    public static final String SWSCHEDULABLERESOURCE_ATTRIBUTE_SCHEDULERS_TAGTYPE = "SwSchedulableResource_Attribute_schedulers";

    @objid ("ee7adba9-dd88-4a62-ac32-ee82e7ac3c24")
    public static final String SWSCHEDULABLERESOURCE_ATTRIBUTE_TIMESLICEELEMENTS_TAGTYPE = "SwSchedulableResource_Attribute_timeSliceElements";

    @objid ("894b087e-ce22-451a-b943-8eb8c8f5b698")
    public static final String SWSCHEDULABLERESOURCE_ATTRIBUTE_YIELDSERVICES_TAGTYPE = "SwSchedulableResource_Attribute_yieldServices";

    /**
     * Tells whether a {@link SwSchedulableResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << SwSchedulableResource_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("0980a81d-15a5-485e-ad90-d3effbe31ecb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwSchedulableResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << SwSchedulableResource_Attribute >> then instantiate a {@link SwSchedulableResourceAttribute} proxy.
     * 
     * @return a {@link SwSchedulableResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("56cc10d7-545a-4868-8170-7afc734c3b82")
    public static SwSchedulableResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwSchedulableResourceAttribute.STEREOTYPE_NAME);
        return SwSchedulableResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link SwSchedulableResourceAttribute} proxy from a {@link Attribute} stereotyped << SwSchedulableResource_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link SwSchedulableResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("3f7388d4-a94a-47da-b1df-72b4e975c4ea")
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
    @objid ("755e70ea-14c0-48c5-b6ea-3c5efc370021")
    public static SwSchedulableResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (SwSchedulableResourceAttribute.canInstantiate(obj))
        	return new SwSchedulableResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("SwSchedulableResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a090c884-b56a-41a9-bbc9-69cf1cadfee8")
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
    @objid ("b10f3d90-cc7e-46f2-9edb-8a4a4f3cce4c")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Attribute_deadlineElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("91778e32-7e22-4116-9a8a-bd0cdf782d12")
    public List<String> getSwSchedulableResource_Attribute_deadlineElements() {
        return this.elt.getTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_DEADLINEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Attribute_deadlineTypeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("089bf744-1207-4c35-bdeb-a1a936e1efd2")
    public List<String> getSwSchedulableResource_Attribute_deadlineTypeElements() {
        return this.elt.getTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_DEADLINETYPEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Attribute_delayServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("deb78e71-cc6d-4073-a8f0-491ec14647b0")
    public List<String> getSwSchedulableResource_Attribute_delayServices() {
        return this.elt.getTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_DELAYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Attribute_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bb81190e-889a-47d2-a9e3-9308b5b8b2d4")
    public String getSwSchedulableResource_Attribute_dependentScheduler() {
        return this.elt.getTagValue(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_DEPENDENTSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Attribute_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7726863f-4042-4464-8f40-37c8aa6d8c9a")
    public String getSwSchedulableResource_Attribute_host() {
        return this.elt.getTagValue(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Attribute_joinServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0ad45e7e-f485-414f-ba3b-faa2503cfba5")
    public List<String> getSwSchedulableResource_Attribute_joinServices() {
        return this.elt.getTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_JOINSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Attribute_schedParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3153af3a-89db-4015-8662-a77d7608bd19")
    public List<String> getSwSchedulableResource_Attribute_schedParams() {
        return this.elt.getTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_SCHEDPARAMS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Attribute_schedulers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("46083d0f-9e62-4e3e-aea0-edb979a6c781")
    public String getSwSchedulableResource_Attribute_schedulers() {
        return this.elt.getTagValue(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_SCHEDULERS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Attribute_timeSliceElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("df7450b7-3086-41a6-8898-d65f3fe3bf79")
    public List<String> getSwSchedulableResource_Attribute_timeSliceElements() {
        return this.elt.getTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_TIMESLICEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Attribute_yieldServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e30bc965-9d2f-44bf-8a90-2fc64d960532")
    public List<String> getSwSchedulableResource_Attribute_yieldServices() {
        return this.elt.getTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_YIELDSERVICES_TAGTYPE_ELT);
    }

    @objid ("500de42c-bc32-448c-acd6-fd1c0504b58a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwSchedulableResource_Attribute_isPreemptable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8be90571-29ac-4bd7-8841-518eecaa9ba3")
    public boolean isSwSchedulableResource_Attribute_isPreemptable() {
        return this.elt.isTagged(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_ISPREEMPTABLE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SwSchedulableResource_Attribute_isStaticSchedulingFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("963e203a-9018-400f-9af6-909e35b8fbe8")
    public boolean isSwSchedulableResource_Attribute_isStaticSchedulingFeature() {
        return this.elt.isTagged(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Attribute_deadlineElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f96fd9a6-374b-4863-835d-2307615e0815")
    public void setSwSchedulableResource_Attribute_deadlineElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_DEADLINEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Attribute_deadlineTypeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("350569a9-9241-4766-a78f-5afb0c07addc")
    public void setSwSchedulableResource_Attribute_deadlineTypeElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_DEADLINETYPEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Attribute_delayServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("80e77e5d-cbba-49e2-b7be-126eb0a04353")
    public void setSwSchedulableResource_Attribute_delayServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_DELAYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Attribute_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b4b15bd7-3f4f-4c50-b358-b045e194b3d9")
    public void setSwSchedulableResource_Attribute_dependentScheduler(final String value) {
        this.elt.putTagValue(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_DEPENDENTSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Attribute_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8690a4f4-1014-4abe-a688-d3a37d74edcc")
    public void setSwSchedulableResource_Attribute_host(final String value) {
        this.elt.putTagValue(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SwSchedulableResource_Attribute_isPreemptable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ce54421d-5ae6-4e22-acc3-00ba79a4664a")
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
    @objid ("d63e1614-1407-458c-8bd6-5bac1731623b")
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
    @objid ("32781ea7-0bbb-4fa5-a685-e1d7d03f2ead")
    public void setSwSchedulableResource_Attribute_joinServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_JOINSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Attribute_schedParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c3009a3d-e32f-4b0d-aac5-5246292d4dd9")
    public void setSwSchedulableResource_Attribute_schedParams(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_SCHEDPARAMS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Attribute_schedulers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("60d8de22-f5b5-4105-9af6-f4ea17a537d3")
    public void setSwSchedulableResource_Attribute_schedulers(final String value) {
        this.elt.putTagValue(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_SCHEDULERS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Attribute_timeSliceElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a5f6134b-542d-4f01-b35e-880dffae5312")
    public void setSwSchedulableResource_Attribute_timeSliceElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_TIMESLICEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Attribute_yieldServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1e1d17ef-056d-43c4-872a-812121aaa10d")
    public void setSwSchedulableResource_Attribute_yieldServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAttribute.MdaTypes.SWSCHEDULABLERESOURCE_ATTRIBUTE_YIELDSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("f2d3e4c5-a518-4717-a49a-33ac331569b3")
    protected SwSchedulableResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("cdf64c79-a9fe-4a04-b757-494a993d6949")
    public static final class MdaTypes {
        @objid ("6b204525-c925-402a-9d44-049ec088222c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("82245311-b003-4e82-b23f-d99877f48f7a")
        public static TagType SWSCHEDULABLERESOURCE_ATTRIBUTE_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT;

        @objid ("afe61cba-3703-4acd-a39c-28a0c5588fc0")
        public static TagType SWSCHEDULABLERESOURCE_ATTRIBUTE_ISPREEMPTABLE_TAGTYPE_ELT;

        @objid ("9683a489-8fc9-4e30-90dc-9d7c0c427899")
        public static TagType SWSCHEDULABLERESOURCE_ATTRIBUTE_SCHEDULERS_TAGTYPE_ELT;

        @objid ("9d42fbfe-1229-4e52-bceb-01f717dc458d")
        public static TagType SWSCHEDULABLERESOURCE_ATTRIBUTE_DEADLINEELEMENTS_TAGTYPE_ELT;

        @objid ("c374f027-1999-4d75-a611-02790b248f6b")
        public static TagType SWSCHEDULABLERESOURCE_ATTRIBUTE_DEADLINETYPEELEMENTS_TAGTYPE_ELT;

        @objid ("e1553ed9-9a1b-4e4a-9ddc-5082d017111c")
        public static TagType SWSCHEDULABLERESOURCE_ATTRIBUTE_TIMESLICEELEMENTS_TAGTYPE_ELT;

        @objid ("52008cf9-f9d5-4aed-a8ce-9b4ab7bfc798")
        public static TagType SWSCHEDULABLERESOURCE_ATTRIBUTE_DELAYSERVICES_TAGTYPE_ELT;

        @objid ("e40934b1-89af-4bd5-942b-64d1c6f02767")
        public static TagType SWSCHEDULABLERESOURCE_ATTRIBUTE_JOINSERVICES_TAGTYPE_ELT;

        @objid ("3111c549-d4cc-4c46-a4b7-95eacbce900f")
        public static TagType SWSCHEDULABLERESOURCE_ATTRIBUTE_YIELDSERVICES_TAGTYPE_ELT;

        @objid ("8c67af9a-43b8-4303-a72a-34c580dc56a2")
        public static TagType SWSCHEDULABLERESOURCE_ATTRIBUTE_SCHEDPARAMS_TAGTYPE_ELT;

        @objid ("0b01c622-62ba-4b11-b721-b3c101186f0a")
        public static TagType SWSCHEDULABLERESOURCE_ATTRIBUTE_HOST_TAGTYPE_ELT;

        @objid ("99a9fb0d-63b6-4da9-9b9b-cb1d4bdcf898")
        public static TagType SWSCHEDULABLERESOURCE_ATTRIBUTE_DEPENDENTSCHEDULER_TAGTYPE_ELT;

        @objid ("1ca91333-2e6c-4ecc-9aa1-fa3067774247")
        private static Stereotype MDAASSOCDEP;

        @objid ("c5a55b3f-8cc6-468b-aa68-521445f14bad")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("638de2cb-793c-4cf8-b52a-71c515f9a332")
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
