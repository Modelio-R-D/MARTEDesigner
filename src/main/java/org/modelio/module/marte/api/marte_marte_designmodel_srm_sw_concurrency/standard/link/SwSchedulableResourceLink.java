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
@objid ("b148332c-382c-42bb-81f0-a34243b9c165")
public class SwSchedulableResourceLink extends SwConcurrentResourceLink {
    @objid ("22e7c97b-f484-44d5-b412-7fd08cb684cc")
    public static final String STEREOTYPE_NAME = "SwSchedulableResource_Link";

    @objid ("05996415-6dd7-4e33-8add-0cb7694ddbdb")
    public static final String SWSCHEDULABLERESOURCE_LINK_DEADLINEELEMENTS_TAGTYPE = "SwSchedulableResource_Link_deadlineElements";

    @objid ("f99220e9-4fd5-4895-9b57-9a94ccec642e")
    public static final String SWSCHEDULABLERESOURCE_LINK_DEADLINETYPEELEMENTS_TAGTYPE = "SwSchedulableResource_Link_deadlineTypeElements";

    @objid ("fefdead7-b9f5-4464-b387-9a5393f4bff5")
    public static final String SWSCHEDULABLERESOURCE_LINK_DELAYSERVICES_TAGTYPE = "SwSchedulableResource_Link_delayServices";

    @objid ("c3a4ef69-f1da-49ee-8085-ed371088b5e3")
    public static final String SWSCHEDULABLERESOURCE_LINK_DEPENDENTSCHEDULER_TAGTYPE = "SwSchedulableResource_Link_dependentScheduler";

    @objid ("9f116807-e0e3-4b00-9ac1-c3a7f08537c0")
    public static final String SWSCHEDULABLERESOURCE_LINK_HOST_TAGTYPE = "SwSchedulableResource_Link_host";

    @objid ("5040d884-4fc4-4b37-98b9-d55d75201485")
    public static final String SWSCHEDULABLERESOURCE_LINK_ISPREEMPTABLE_TAGTYPE = "SwSchedulableResource_Link_isPreemptable";

    @objid ("780e576f-f2b7-4bf4-8a4f-65a42149500c")
    public static final String SWSCHEDULABLERESOURCE_LINK_ISSTATICSCHEDULINGFEATURE_TAGTYPE = "SwSchedulableResource_Link_isStaticSchedulingFeature";

    @objid ("c9203ca9-d7ee-49a9-b05f-bc0967d08b8c")
    public static final String SWSCHEDULABLERESOURCE_LINK_JOINSERVICES_TAGTYPE = "SwSchedulableResource_Link_joinServices";

    @objid ("b5f00a0d-fb61-47ea-8c20-c535611e4972")
    public static final String SWSCHEDULABLERESOURCE_LINK_SCHEDPARAMS_TAGTYPE = "SwSchedulableResource_Link_schedParams";

    @objid ("ed1568cd-5f66-4697-93d8-5b02ae65e3fc")
    public static final String SWSCHEDULABLERESOURCE_LINK_SCHEDULERS_TAGTYPE = "SwSchedulableResource_Link_schedulers";

    @objid ("674d9322-bbc8-49c7-be3f-79b1879dcfeb")
    public static final String SWSCHEDULABLERESOURCE_LINK_TIMESLICEELEMENTS_TAGTYPE = "SwSchedulableResource_Link_timeSliceElements";

    @objid ("c20ddae8-fb9e-4824-8353-1cbfb243a593")
    public static final String SWSCHEDULABLERESOURCE_LINK_YIELDSERVICES_TAGTYPE = "SwSchedulableResource_Link_yieldServices";

    /**
     * Tells whether a {@link SwSchedulableResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << SwSchedulableResource_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("21937283-75c6-458b-a236-a6cc9a81835c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwSchedulableResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << SwSchedulableResource_Link >> then instantiate a {@link SwSchedulableResourceLink} proxy.
     * 
     * @return a {@link SwSchedulableResourceLink} proxy on the created {@link Link}.
     */
    @objid ("f8eb4d60-a73b-429a-88bc-8998ec077f57")
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
    @objid ("e4918ff8-fd53-46f7-b4f3-fbc93426ab73")
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
    @objid ("60a8b2a1-57d5-4e4d-9112-815a3580cc7f")
    public static SwSchedulableResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (SwSchedulableResourceLink.canInstantiate(obj))
        	return new SwSchedulableResourceLink(obj);
        else
        	throw new IllegalArgumentException("SwSchedulableResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b69de68e-3c49-4a7f-85fc-0703e4bb6814")
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
    @objid ("63a02b66-b6df-4312-b5d6-3891e2586db5")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Link_deadlineElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("99d0b932-e726-4fbc-aca7-c3a44b85eec7")
    public List<String> getSwSchedulableResource_Link_deadlineElements() {
        return this.elt.getTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_DEADLINEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Link_deadlineTypeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0cc7cdf3-6d96-4000-8b82-baeb58d7b05d")
    public List<String> getSwSchedulableResource_Link_deadlineTypeElements() {
        return this.elt.getTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_DEADLINETYPEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Link_delayServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5b927e40-9d25-4b03-a0b6-8e01c25ec251")
    public List<String> getSwSchedulableResource_Link_delayServices() {
        return this.elt.getTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_DELAYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Link_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8751bf16-29de-4c20-8fa4-21abe6838f97")
    public String getSwSchedulableResource_Link_dependentScheduler() {
        return this.elt.getTagValue(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_DEPENDENTSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Link_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8c29acd1-45b5-45d7-8a2a-a1240eccba37")
    public String getSwSchedulableResource_Link_host() {
        return this.elt.getTagValue(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Link_joinServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("47816cdf-adc4-4ed5-add8-eaa90b02fe91")
    public List<String> getSwSchedulableResource_Link_joinServices() {
        return this.elt.getTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_JOINSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Link_schedParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("321b29b4-408f-4d10-b698-76ae3c4cd2e9")
    public List<String> getSwSchedulableResource_Link_schedParams() {
        return this.elt.getTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_SCHEDPARAMS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Link_schedulers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1180f61b-94b0-424c-bc19-361b63e9e048")
    public String getSwSchedulableResource_Link_schedulers() {
        return this.elt.getTagValue(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_SCHEDULERS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Link_timeSliceElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9b48c5e1-cfd0-4ee3-b685-9dab1209fb6f")
    public List<String> getSwSchedulableResource_Link_timeSliceElements() {
        return this.elt.getTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_TIMESLICEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Link_yieldServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0d8f5da4-46ac-4e8f-b553-bd35c9d04b69")
    public List<String> getSwSchedulableResource_Link_yieldServices() {
        return this.elt.getTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_YIELDSERVICES_TAGTYPE_ELT);
    }

    @objid ("f558921c-ec5f-483d-8e5e-9fc2fb8030bf")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwSchedulableResource_Link_isPreemptable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9bf90fed-08da-45c7-82d0-2397beced2f1")
    public boolean isSwSchedulableResource_Link_isPreemptable() {
        return this.elt.isTagged(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_ISPREEMPTABLE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SwSchedulableResource_Link_isStaticSchedulingFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8698fb93-298e-4ede-9bfc-c283bd7c21f7")
    public boolean isSwSchedulableResource_Link_isStaticSchedulingFeature() {
        return this.elt.isTagged(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Link_deadlineElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1a4c5c9f-1117-4db3-ad82-e96cb21cb0e4")
    public void setSwSchedulableResource_Link_deadlineElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_DEADLINEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Link_deadlineTypeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("21173ff1-0c35-4c3b-aa31-22f77245164f")
    public void setSwSchedulableResource_Link_deadlineTypeElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_DEADLINETYPEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Link_delayServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f29ff169-687b-487f-803f-3779cbdeae38")
    public void setSwSchedulableResource_Link_delayServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_DELAYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Link_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8bbfb3d2-a4dc-45de-af0c-695bf5c58c92")
    public void setSwSchedulableResource_Link_dependentScheduler(final String value) {
        this.elt.putTagValue(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_DEPENDENTSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Link_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("555516c7-b6d6-4373-8d05-9691ec03790c")
    public void setSwSchedulableResource_Link_host(final String value) {
        this.elt.putTagValue(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SwSchedulableResource_Link_isPreemptable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c5795278-8ac7-4cc3-a60b-60b6989f86a7")
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
    @objid ("4112e565-b0a6-42b0-a554-23b7dfda7fbf")
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
    @objid ("bdeb3707-14a0-49fc-add7-4f5b9a8c033d")
    public void setSwSchedulableResource_Link_joinServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_JOINSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Link_schedParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bb0d1066-78d3-4fc8-9746-3acd78493e71")
    public void setSwSchedulableResource_Link_schedParams(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_SCHEDPARAMS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Link_schedulers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0c389681-6035-468f-9cd5-2b98e2446eed")
    public void setSwSchedulableResource_Link_schedulers(final String value) {
        this.elt.putTagValue(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_SCHEDULERS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Link_timeSliceElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b7e9ffd2-2cc7-4ef7-9f7a-f61c733f0b6e")
    public void setSwSchedulableResource_Link_timeSliceElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_TIMESLICEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Link_yieldServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d4eeebf8-c58e-4f9c-bf8e-d8f475c68abc")
    public void setSwSchedulableResource_Link_yieldServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_YIELDSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("ea11bd03-090b-4647-a545-095e1cd7b6fa")
    protected SwSchedulableResourceLink(final Link elt) {
        super(elt);
    }

    @objid ("96fa8383-3293-4868-9105-94d2a2d8037c")
    public static final class MdaTypes {
        @objid ("1471a671-1e12-4a0c-b268-2012b4c607bf")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e458a220-7310-4dc0-9d24-8a378ed60770")
        public static TagType SWSCHEDULABLERESOURCE_LINK_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT;

        @objid ("0c689a57-3638-4d38-9233-1deb52802c5f")
        public static TagType SWSCHEDULABLERESOURCE_LINK_ISPREEMPTABLE_TAGTYPE_ELT;

        @objid ("dd04c575-7fbd-4c80-a351-351d5e915211")
        public static TagType SWSCHEDULABLERESOURCE_LINK_SCHEDULERS_TAGTYPE_ELT;

        @objid ("35bbe9b3-5d17-485c-9638-d40402baa411")
        public static TagType SWSCHEDULABLERESOURCE_LINK_DEADLINEELEMENTS_TAGTYPE_ELT;

        @objid ("f29d9eb0-42d9-4012-9813-03696bcde0f4")
        public static TagType SWSCHEDULABLERESOURCE_LINK_DEADLINETYPEELEMENTS_TAGTYPE_ELT;

        @objid ("3d0b7126-4c35-4a6a-8348-fd169c745e0e")
        public static TagType SWSCHEDULABLERESOURCE_LINK_TIMESLICEELEMENTS_TAGTYPE_ELT;

        @objid ("c58d9342-331d-4072-9a34-675fb3f85960")
        public static TagType SWSCHEDULABLERESOURCE_LINK_DELAYSERVICES_TAGTYPE_ELT;

        @objid ("b76fd773-ce8f-406e-9201-5b776043dcd9")
        public static TagType SWSCHEDULABLERESOURCE_LINK_JOINSERVICES_TAGTYPE_ELT;

        @objid ("25f6b7c9-0e9d-4afc-8407-7d6c8e33c61a")
        public static TagType SWSCHEDULABLERESOURCE_LINK_YIELDSERVICES_TAGTYPE_ELT;

        @objid ("2aad4b1b-a472-47fd-b7db-1c347296d99a")
        public static TagType SWSCHEDULABLERESOURCE_LINK_SCHEDPARAMS_TAGTYPE_ELT;

        @objid ("4da8a88c-9816-4312-9d71-869484551b9e")
        public static TagType SWSCHEDULABLERESOURCE_LINK_HOST_TAGTYPE_ELT;

        @objid ("8171a201-e531-4539-9b54-836e58070e79")
        public static TagType SWSCHEDULABLERESOURCE_LINK_DEPENDENTSCHEDULER_TAGTYPE_ELT;

        @objid ("76cbbb58-10b7-4be8-afee-f9b91b73fd08")
        private static Stereotype MDAASSOCDEP;

        @objid ("855535a9-66bf-4759-88a1-00d370c44ffb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("72b83a81-ae3d-49e1-afed-75486f5affe1")
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
