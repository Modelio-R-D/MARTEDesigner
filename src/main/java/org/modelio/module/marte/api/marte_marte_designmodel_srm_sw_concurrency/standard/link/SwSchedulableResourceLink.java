/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("62514137-11bf-433f-806b-6d92d21fec4d")
    public static final String STEREOTYPE_NAME = "SwSchedulableResource_Link";

    @objid ("bb60524d-9ddc-4574-87b6-3f1f0a73b8a7")
    public static final String SWSCHEDULABLERESOURCE_LINK_DEADLINEELEMENTS_TAGTYPE = "SwSchedulableResource_Link_deadlineElements";

    @objid ("8dad5a28-a52d-467a-ab41-c8f27362d121")
    public static final String SWSCHEDULABLERESOURCE_LINK_DEADLINETYPEELEMENTS_TAGTYPE = "SwSchedulableResource_Link_deadlineTypeElements";

    @objid ("49763248-339a-4b0d-9ee0-6c4dd7a01698")
    public static final String SWSCHEDULABLERESOURCE_LINK_DELAYSERVICES_TAGTYPE = "SwSchedulableResource_Link_delayServices";

    @objid ("648e3013-e305-4b77-a1ca-ac86d4aca18d")
    public static final String SWSCHEDULABLERESOURCE_LINK_DEPENDENTSCHEDULER_TAGTYPE = "SwSchedulableResource_Link_dependentScheduler";

    @objid ("b98f0c5e-1b18-49e9-8dc9-877274cd392b")
    public static final String SWSCHEDULABLERESOURCE_LINK_HOST_TAGTYPE = "SwSchedulableResource_Link_host";

    @objid ("450b8e7a-f06b-46d2-8ab4-7308fd7a9b8e")
    public static final String SWSCHEDULABLERESOURCE_LINK_ISPREEMPTABLE_TAGTYPE = "SwSchedulableResource_Link_isPreemptable";

    @objid ("df7bd958-c2a2-4766-91a6-91ebc33eb016")
    public static final String SWSCHEDULABLERESOURCE_LINK_ISSTATICSCHEDULINGFEATURE_TAGTYPE = "SwSchedulableResource_Link_isStaticSchedulingFeature";

    @objid ("8f4bea91-e1ae-464d-86c1-160e12f575bc")
    public static final String SWSCHEDULABLERESOURCE_LINK_JOINSERVICES_TAGTYPE = "SwSchedulableResource_Link_joinServices";

    @objid ("48bcbcbe-ebd0-4722-9b70-acf7db39ec6c")
    public static final String SWSCHEDULABLERESOURCE_LINK_SCHEDPARAMS_TAGTYPE = "SwSchedulableResource_Link_schedParams";

    @objid ("0d263d9e-b11b-4434-9874-567df15dc4a0")
    public static final String SWSCHEDULABLERESOURCE_LINK_SCHEDULERS_TAGTYPE = "SwSchedulableResource_Link_schedulers";

    @objid ("530b0741-bf16-435a-8f49-3f7b05b13f06")
    public static final String SWSCHEDULABLERESOURCE_LINK_TIMESLICEELEMENTS_TAGTYPE = "SwSchedulableResource_Link_timeSliceElements";

    @objid ("b1d60099-2644-44a1-bb79-39d340b2e746")
    public static final String SWSCHEDULABLERESOURCE_LINK_YIELDSERVICES_TAGTYPE = "SwSchedulableResource_Link_yieldServices";

    /**
     * Tells whether a {@link SwSchedulableResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << SwSchedulableResource_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("cf4df71e-422e-4d98-b546-6bb07a16866a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwSchedulableResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << SwSchedulableResource_Link >> then instantiate a {@link SwSchedulableResourceLink} proxy.
     * 
     * @return a {@link SwSchedulableResourceLink} proxy on the created {@link Link}.
     */
    @objid ("a3444aad-5705-4354-93b2-b8662ecc936a")
    public static SwSchedulableResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwSchedulableResourceLink.STEREOTYPE_NAME);
        return SwSchedulableResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link SwSchedulableResourceLink} proxy from a {@link Link} stereotyped << SwSchedulableResource_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link SwSchedulableResourceLink} proxy or <i>null</i>.
     */
    @objid ("38afd895-2b01-4b4b-bb26-ef1737cf715d")
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
    @objid ("68f406fc-6265-477a-8395-4bf6489c562b")
    public static SwSchedulableResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (SwSchedulableResourceLink.canInstantiate(obj))
        	return new SwSchedulableResourceLink(obj);
        else
        	throw new IllegalArgumentException("SwSchedulableResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("881cfda2-684f-4ab9-8aa7-ded4f029450f")
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
    @objid ("e820e127-6b5c-43b3-a480-92391749ea58")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Link_deadlineElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c93b101e-44b9-475c-9fda-541feb106404")
    public List<String> getSwSchedulableResource_Link_deadlineElements() {
        return this.elt.getTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_DEADLINEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Link_deadlineTypeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("dd4adb5e-8c60-48e0-99ce-1954d51ea67f")
    public List<String> getSwSchedulableResource_Link_deadlineTypeElements() {
        return this.elt.getTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_DEADLINETYPEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Link_delayServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4c834b17-82a5-42d7-ba7d-0a49cebbb1f6")
    public List<String> getSwSchedulableResource_Link_delayServices() {
        return this.elt.getTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_DELAYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Link_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("79321bee-94f1-4172-b5c1-129ab151bac5")
    public String getSwSchedulableResource_Link_dependentScheduler() {
        return this.elt.getTagValue(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_DEPENDENTSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Link_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8a93b446-be6d-4a3d-9d4d-5e46b6725298")
    public String getSwSchedulableResource_Link_host() {
        return this.elt.getTagValue(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Link_joinServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("62a72214-e9a0-48ad-a57a-c0f592f1a6d9")
    public List<String> getSwSchedulableResource_Link_joinServices() {
        return this.elt.getTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_JOINSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Link_schedParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("dc325820-4040-4bf3-b9e3-96c12ff72ab3")
    public List<String> getSwSchedulableResource_Link_schedParams() {
        return this.elt.getTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_SCHEDPARAMS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Link_schedulers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("464ec1d5-690b-4659-aed3-fc5538daa5a6")
    public String getSwSchedulableResource_Link_schedulers() {
        return this.elt.getTagValue(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_SCHEDULERS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Link_timeSliceElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b3a02a41-9007-4461-b247-112339de92fd")
    public List<String> getSwSchedulableResource_Link_timeSliceElements() {
        return this.elt.getTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_TIMESLICEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Link_yieldServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f7e71814-9828-4e72-ac82-10af44ade3a5")
    public List<String> getSwSchedulableResource_Link_yieldServices() {
        return this.elt.getTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_YIELDSERVICES_TAGTYPE_ELT);
    }

    @objid ("ff9a29eb-26a2-4992-9ad7-ba174ee06009")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwSchedulableResource_Link_isPreemptable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("de529447-374d-45ec-ba28-0f6afdb8622c")
    public boolean isSwSchedulableResource_Link_isPreemptable() {
        return this.elt.isTagged(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_ISPREEMPTABLE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SwSchedulableResource_Link_isStaticSchedulingFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5d05244b-f958-4fb3-9b66-e1134637d92a")
    public boolean isSwSchedulableResource_Link_isStaticSchedulingFeature() {
        return this.elt.isTagged(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Link_deadlineElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("320419e3-23fd-4aed-abb6-4afe0d0d8b84")
    public void setSwSchedulableResource_Link_deadlineElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_DEADLINEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Link_deadlineTypeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7683d955-0d0b-4958-9d33-8ef435e5470c")
    public void setSwSchedulableResource_Link_deadlineTypeElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_DEADLINETYPEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Link_delayServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b33cdf0f-f9a5-412e-ac52-c73f2bf5384a")
    public void setSwSchedulableResource_Link_delayServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_DELAYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Link_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cc692769-0896-48ec-b6f0-a4ebb8da1751")
    public void setSwSchedulableResource_Link_dependentScheduler(final String value) {
        this.elt.putTagValue(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_DEPENDENTSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Link_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("626b8c24-93c4-4ead-9db2-28eabbed0455")
    public void setSwSchedulableResource_Link_host(final String value) {
        this.elt.putTagValue(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SwSchedulableResource_Link_isPreemptable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b72b2866-d31d-4cb6-8465-ff0db4ccbba0")
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
    @objid ("b25f5e9e-fca9-4d23-8477-b897851b508c")
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
    @objid ("0effb864-74d4-4a59-ac26-5558ba9fe3d6")
    public void setSwSchedulableResource_Link_joinServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_JOINSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Link_schedParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5d6163de-3a1a-426a-a5e7-a1411ac8bfb1")
    public void setSwSchedulableResource_Link_schedParams(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_SCHEDPARAMS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Link_schedulers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9cc5c14f-54dc-4271-a7e0-6059d097196c")
    public void setSwSchedulableResource_Link_schedulers(final String value) {
        this.elt.putTagValue(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_SCHEDULERS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Link_timeSliceElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("330bb85b-f629-4843-a6de-8177b95fe571")
    public void setSwSchedulableResource_Link_timeSliceElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_TIMESLICEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Link_yieldServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ecc47586-cf97-425a-a2bb-c57df1f16ab3")
    public void setSwSchedulableResource_Link_yieldServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceLink.MdaTypes.SWSCHEDULABLERESOURCE_LINK_YIELDSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("f93ef540-9855-4392-ac01-f3f8ac24d992")
    protected SwSchedulableResourceLink(final Link elt) {
        super(elt);
    }

    @objid ("96fa8383-3293-4868-9105-94d2a2d8037c")
    public static final class MdaTypes {
        @objid ("98772e5b-c333-4d1d-9557-8276ba35f880")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("35990b3c-526c-4a7e-8bcf-c4b3721bd8ca")
        public static TagType SWSCHEDULABLERESOURCE_LINK_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT;

        @objid ("82baa40a-deea-442b-9301-9618b6acc72d")
        public static TagType SWSCHEDULABLERESOURCE_LINK_ISPREEMPTABLE_TAGTYPE_ELT;

        @objid ("12768f0b-3afe-4679-b053-dc0e840a964e")
        public static TagType SWSCHEDULABLERESOURCE_LINK_SCHEDULERS_TAGTYPE_ELT;

        @objid ("d3352b6d-4e01-4a48-93bf-dc0dfc6a8a5a")
        public static TagType SWSCHEDULABLERESOURCE_LINK_DEADLINEELEMENTS_TAGTYPE_ELT;

        @objid ("f8ef46f4-a211-4f63-9f56-03fa4c61573d")
        public static TagType SWSCHEDULABLERESOURCE_LINK_DEADLINETYPEELEMENTS_TAGTYPE_ELT;

        @objid ("66e2f9c5-4bd1-4c5f-90c6-494a987fb68b")
        public static TagType SWSCHEDULABLERESOURCE_LINK_TIMESLICEELEMENTS_TAGTYPE_ELT;

        @objid ("2b815f9c-a416-4661-9944-17873ed3eb0d")
        public static TagType SWSCHEDULABLERESOURCE_LINK_DELAYSERVICES_TAGTYPE_ELT;

        @objid ("d39e28e4-b0f0-4d04-b13e-7314cdb259c0")
        public static TagType SWSCHEDULABLERESOURCE_LINK_JOINSERVICES_TAGTYPE_ELT;

        @objid ("2dd55ee3-468b-4da3-961b-b34e6430f3e5")
        public static TagType SWSCHEDULABLERESOURCE_LINK_YIELDSERVICES_TAGTYPE_ELT;

        @objid ("6c654f2b-abe2-41b0-9ea6-fdca1f650a9f")
        public static TagType SWSCHEDULABLERESOURCE_LINK_SCHEDPARAMS_TAGTYPE_ELT;

        @objid ("68e96df4-02d6-4112-bd6f-21cc6ea1e192")
        public static TagType SWSCHEDULABLERESOURCE_LINK_HOST_TAGTYPE_ELT;

        @objid ("db67dc4b-17e9-4b06-8904-33f3ad08b586")
        public static TagType SWSCHEDULABLERESOURCE_LINK_DEPENDENTSCHEDULER_TAGTYPE_ELT;

        @objid ("cd058024-4735-4e22-8be3-9ecf995454e9")
        private static Stereotype MDAASSOCDEP;

        @objid ("674289a2-7345-4647-a1e3-28e4dae988e6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("618518b4-f13c-4725-9bba-71d799b1d38d")
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
