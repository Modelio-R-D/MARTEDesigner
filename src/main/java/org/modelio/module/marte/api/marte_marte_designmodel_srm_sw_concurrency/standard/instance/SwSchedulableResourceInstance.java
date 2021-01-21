/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.instance;

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
@objid ("98c393b0-41c1-4101-af1b-7d45d010fa05")
public class SwSchedulableResourceInstance extends SwConcurrentResourceInstance {
    @objid ("72098ff0-cd1a-4995-8c7f-bda3e9c1c9ce")
    public static final String STEREOTYPE_NAME = "SwSchedulableResource_Instance";

    @objid ("6664a86c-be76-4787-a104-413b74a599e0")
    public static final String SWSCHEDULABLERESOURCE_INSTANCE_DEADLINEELEMENTS_TAGTYPE = "SwSchedulableResource_Instance_deadlineElements";

    @objid ("ef6965ac-55b4-441e-b1d3-6f02861f14c6")
    public static final String SWSCHEDULABLERESOURCE_INSTANCE_DEADLINETYPEELEMENTS_TAGTYPE = "SwSchedulableResource_Instance_deadlineTypeElements";

    @objid ("7fe92dd2-3650-4e58-ab5a-28c11d974f99")
    public static final String SWSCHEDULABLERESOURCE_INSTANCE_DELAYSERVICES_TAGTYPE = "SwSchedulableResource_Instance_delayServices";

    @objid ("b5f37a1c-5875-436e-b71a-ea372d11e61a")
    public static final String SWSCHEDULABLERESOURCE_INSTANCE_DEPENDENTSCHEDULER_TAGTYPE = "SwSchedulableResource_Instance_dependentScheduler";

    @objid ("be24c1d9-0710-42ed-86d8-d8846ab0fc38")
    public static final String SWSCHEDULABLERESOURCE_INSTANCE_HOST_TAGTYPE = "SwSchedulableResource_Instance_host";

    @objid ("56e7412c-b6d2-4bdf-9e34-7fccca242079")
    public static final String SWSCHEDULABLERESOURCE_INSTANCE_ISPREEMPTABLE_TAGTYPE = "SwSchedulableResource_Instance_isPreemptable";

    @objid ("ccf02684-9429-4d6a-963b-a76624b164b9")
    public static final String SWSCHEDULABLERESOURCE_INSTANCE_ISSTATICSCHEDULINGFEATURE_TAGTYPE = "SwSchedulableResource_Instance_isStaticSchedulingFeature";

    @objid ("9cb32e0a-6a1f-4c80-a34a-2a31d7e1c918")
    public static final String SWSCHEDULABLERESOURCE_INSTANCE_JOINSERVICES_TAGTYPE = "SwSchedulableResource_Instance_joinServices";

    @objid ("7dabd1c5-b36b-4be7-8da5-7f30816073f1")
    public static final String SWSCHEDULABLERESOURCE_INSTANCE_SCHEDPARAMS_TAGTYPE = "SwSchedulableResource_Instance_schedParams";

    @objid ("b59fc934-d207-4da8-a165-668006be416c")
    public static final String SWSCHEDULABLERESOURCE_INSTANCE_SCHEDULERS_TAGTYPE = "SwSchedulableResource_Instance_schedulers";

    @objid ("f37ca124-5fe6-4bec-a61a-cdf6cd0f8102")
    public static final String SWSCHEDULABLERESOURCE_INSTANCE_TIMESLICEELEMENTS_TAGTYPE = "SwSchedulableResource_Instance_timeSliceElements";

    @objid ("bb3f6c7c-4579-4b68-81f8-3be45f5c61e3")
    public static final String SWSCHEDULABLERESOURCE_INSTANCE_YIELDSERVICES_TAGTYPE = "SwSchedulableResource_Instance_yieldServices";

    /**
     * Tells whether a {@link SwSchedulableResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SwSchedulableResource_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("cbcc1678-f3ca-4ec0-b20e-eb5487ed5d5a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwSchedulableResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SwSchedulableResource_Instance >> then instantiate a {@link SwSchedulableResourceInstance} proxy.
     * 
     * @return a {@link SwSchedulableResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("e2a169c1-0760-4c8c-b645-51ea0ffd03a3")
    public static SwSchedulableResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwSchedulableResourceInstance.STEREOTYPE_NAME);
        return SwSchedulableResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link SwSchedulableResourceInstance} proxy from a {@link Instance} stereotyped << SwSchedulableResource_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link SwSchedulableResourceInstance} proxy or <i>null</i>.
     */
    @objid ("23011e2e-92cd-4740-914a-b8d585feb475")
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
    @objid ("791c907a-95f8-46aa-8103-e8f73734bae3")
    public static SwSchedulableResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SwSchedulableResourceInstance.canInstantiate(obj))
        	return new SwSchedulableResourceInstance(obj);
        else
        	throw new IllegalArgumentException("SwSchedulableResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("39d32507-38f6-444d-8a0f-a2ea5419795a")
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
    @objid ("a097aa61-79e6-42b7-8329-04141839195f")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Instance_deadlineElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("44d234d6-0b02-4e06-a339-e5d0055fc771")
    public List<String> getSwSchedulableResource_Instance_deadlineElements() {
        return this.elt.getTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_DEADLINEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Instance_deadlineTypeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("34c442de-88b7-4b8c-8174-a1ab1006a205")
    public List<String> getSwSchedulableResource_Instance_deadlineTypeElements() {
        return this.elt.getTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_DEADLINETYPEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Instance_delayServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("fb65e8a1-a42f-450d-a947-bcbfe17e3220")
    public List<String> getSwSchedulableResource_Instance_delayServices() {
        return this.elt.getTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_DELAYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Instance_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1ee5f754-33e3-438a-9a48-35437ec3cb1d")
    public String getSwSchedulableResource_Instance_dependentScheduler() {
        return this.elt.getTagValue(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_DEPENDENTSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Instance_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a638f7be-79a6-496f-b98d-0c45c0f4b94a")
    public String getSwSchedulableResource_Instance_host() {
        return this.elt.getTagValue(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Instance_joinServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5363bf4e-bfb8-43ac-9a0d-caed2073f43e")
    public List<String> getSwSchedulableResource_Instance_joinServices() {
        return this.elt.getTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_JOINSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Instance_schedParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("df858a42-4027-4a88-89b7-56a087ca1d29")
    public List<String> getSwSchedulableResource_Instance_schedParams() {
        return this.elt.getTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_SCHEDPARAMS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Instance_schedulers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2bf6b269-0694-42c7-b669-4fdc49ad46c4")
    public String getSwSchedulableResource_Instance_schedulers() {
        return this.elt.getTagValue(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_SCHEDULERS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Instance_timeSliceElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0b878159-f5f3-456c-916c-a8a324752f43")
    public List<String> getSwSchedulableResource_Instance_timeSliceElements() {
        return this.elt.getTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_TIMESLICEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Instance_yieldServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3e660021-e1fd-4830-8b5f-04f51bc23d42")
    public List<String> getSwSchedulableResource_Instance_yieldServices() {
        return this.elt.getTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_YIELDSERVICES_TAGTYPE_ELT);
    }

    @objid ("b00e530f-9f2d-4ba7-9f16-9976214c4291")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwSchedulableResource_Instance_isPreemptable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("247667f3-536a-4d80-b10b-1f8ebe591244")
    public boolean isSwSchedulableResource_Instance_isPreemptable() {
        return this.elt.isTagged(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_ISPREEMPTABLE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SwSchedulableResource_Instance_isStaticSchedulingFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("95f92c93-a7a7-458f-a67d-345e6028dfbf")
    public boolean isSwSchedulableResource_Instance_isStaticSchedulingFeature() {
        return this.elt.isTagged(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Instance_deadlineElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b980f28c-0032-4ce7-9b91-bb315550249f")
    public void setSwSchedulableResource_Instance_deadlineElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_DEADLINEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Instance_deadlineTypeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a5b3f7f0-b982-4734-9f54-fb57fb7ae587")
    public void setSwSchedulableResource_Instance_deadlineTypeElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_DEADLINETYPEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Instance_delayServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fe2c4d15-bbca-472f-8dc5-cbe46f95515d")
    public void setSwSchedulableResource_Instance_delayServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_DELAYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Instance_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a74d969b-cfe6-4a73-a1a1-9143e1d34ba5")
    public void setSwSchedulableResource_Instance_dependentScheduler(final String value) {
        this.elt.putTagValue(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_DEPENDENTSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Instance_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fe5fb9ac-03d2-42fe-a70b-a33aca7fa1ff")
    public void setSwSchedulableResource_Instance_host(final String value) {
        this.elt.putTagValue(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SwSchedulableResource_Instance_isPreemptable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c2dcdffb-c418-439c-8dc6-85907e0d97a4")
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
    @objid ("4c4c0c1a-f5c3-43fe-afa3-9b11930a50f7")
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
    @objid ("9b657276-ca9f-4639-9c39-ea9076e97be3")
    public void setSwSchedulableResource_Instance_joinServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_JOINSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Instance_schedParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ba6825c2-1bf1-4e01-b193-4a1a2705cf84")
    public void setSwSchedulableResource_Instance_schedParams(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_SCHEDPARAMS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Instance_schedulers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5f980cae-cf25-4887-a583-a1fb2755f15b")
    public void setSwSchedulableResource_Instance_schedulers(final String value) {
        this.elt.putTagValue(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_SCHEDULERS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Instance_timeSliceElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e1e6fdde-0e5a-4eb6-a491-91a705a7fe7b")
    public void setSwSchedulableResource_Instance_timeSliceElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_TIMESLICEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Instance_yieldServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("60f52457-ea0c-483c-a163-8258b60bd30a")
    public void setSwSchedulableResource_Instance_yieldServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_YIELDSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("8887af0c-bb3c-41e0-a2e6-36347140895c")
    protected SwSchedulableResourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("53b97f1b-10c9-4bec-af84-321224057ed0")
    public static final class MdaTypes {
        @objid ("fa57ea83-bc45-4981-93ca-0607762d850d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a1050a22-4754-474c-a189-c8a2f9c867ce")
        public static TagType SWSCHEDULABLERESOURCE_INSTANCE_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT;

        @objid ("b1a16a26-9c7c-45e7-ba6c-34335247f39b")
        public static TagType SWSCHEDULABLERESOURCE_INSTANCE_ISPREEMPTABLE_TAGTYPE_ELT;

        @objid ("ee5297cb-2f23-4120-9ded-bd563226a062")
        public static TagType SWSCHEDULABLERESOURCE_INSTANCE_SCHEDULERS_TAGTYPE_ELT;

        @objid ("362fdc02-3e53-4152-833c-6571b8207077")
        public static TagType SWSCHEDULABLERESOURCE_INSTANCE_DEADLINEELEMENTS_TAGTYPE_ELT;

        @objid ("c205077f-dd85-4c06-98f1-beb458b9dfd9")
        public static TagType SWSCHEDULABLERESOURCE_INSTANCE_DEADLINETYPEELEMENTS_TAGTYPE_ELT;

        @objid ("0a0466fd-c6e3-4c37-ae2a-662cf9a992a0")
        public static TagType SWSCHEDULABLERESOURCE_INSTANCE_TIMESLICEELEMENTS_TAGTYPE_ELT;

        @objid ("433f8c60-ce93-45b4-807d-9701ad6feeba")
        public static TagType SWSCHEDULABLERESOURCE_INSTANCE_DELAYSERVICES_TAGTYPE_ELT;

        @objid ("498acd69-6e87-4527-8b36-cec112f4df38")
        public static TagType SWSCHEDULABLERESOURCE_INSTANCE_JOINSERVICES_TAGTYPE_ELT;

        @objid ("e0cb9beb-22d7-4455-8a99-638d45e7d034")
        public static TagType SWSCHEDULABLERESOURCE_INSTANCE_YIELDSERVICES_TAGTYPE_ELT;

        @objid ("36c4ad17-7210-49b9-b747-63f2f7cb5f83")
        public static TagType SWSCHEDULABLERESOURCE_INSTANCE_SCHEDPARAMS_TAGTYPE_ELT;

        @objid ("6e7772b3-7780-4497-967d-0b720eee95b2")
        public static TagType SWSCHEDULABLERESOURCE_INSTANCE_HOST_TAGTYPE_ELT;

        @objid ("1efd9bb0-e7f6-40a3-a934-4cb697f02d94")
        public static TagType SWSCHEDULABLERESOURCE_INSTANCE_DEPENDENTSCHEDULER_TAGTYPE_ELT;

        @objid ("3f98f480-7866-42d1-977d-8c6f4d84a469")
        private static Stereotype MDAASSOCDEP;

        @objid ("ac098cf0-5380-4a70-9c9c-fda17beb68d2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("36dadbc5-33ea-4798-877f-e374cba03744")
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
