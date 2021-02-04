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
    @objid ("33f884be-010c-46f6-9a27-35da057d8600")
    public static final String STEREOTYPE_NAME = "SwSchedulableResource_Instance";

    @objid ("0d33ccba-5e6d-4c45-a5d8-4bb25566448f")
    public static final String SWSCHEDULABLERESOURCE_INSTANCE_DEADLINEELEMENTS_TAGTYPE = "SwSchedulableResource_Instance_deadlineElements";

    @objid ("192fb397-f392-46b9-848a-e43ae24846f0")
    public static final String SWSCHEDULABLERESOURCE_INSTANCE_DEADLINETYPEELEMENTS_TAGTYPE = "SwSchedulableResource_Instance_deadlineTypeElements";

    @objid ("fc40bd21-5292-42d2-85a4-7de7b4ef36b5")
    public static final String SWSCHEDULABLERESOURCE_INSTANCE_DELAYSERVICES_TAGTYPE = "SwSchedulableResource_Instance_delayServices";

    @objid ("a4e2ddc8-096f-4954-9712-e8a3f15e6c56")
    public static final String SWSCHEDULABLERESOURCE_INSTANCE_DEPENDENTSCHEDULER_TAGTYPE = "SwSchedulableResource_Instance_dependentScheduler";

    @objid ("3d7db6ea-1db8-4262-86d5-f4c185d0aa27")
    public static final String SWSCHEDULABLERESOURCE_INSTANCE_HOST_TAGTYPE = "SwSchedulableResource_Instance_host";

    @objid ("8177dae9-164a-4c6a-836e-5fd4b4800209")
    public static final String SWSCHEDULABLERESOURCE_INSTANCE_ISPREEMPTABLE_TAGTYPE = "SwSchedulableResource_Instance_isPreemptable";

    @objid ("be3994cd-6b2b-4cef-a2d2-23b88b4ac289")
    public static final String SWSCHEDULABLERESOURCE_INSTANCE_ISSTATICSCHEDULINGFEATURE_TAGTYPE = "SwSchedulableResource_Instance_isStaticSchedulingFeature";

    @objid ("1d90e4be-21f9-4eb8-93c5-3aff4690598a")
    public static final String SWSCHEDULABLERESOURCE_INSTANCE_JOINSERVICES_TAGTYPE = "SwSchedulableResource_Instance_joinServices";

    @objid ("05a751ce-fe1a-423e-b759-af06b70acb22")
    public static final String SWSCHEDULABLERESOURCE_INSTANCE_SCHEDPARAMS_TAGTYPE = "SwSchedulableResource_Instance_schedParams";

    @objid ("b38620d7-54aa-415d-9c1f-f6f15bd630ba")
    public static final String SWSCHEDULABLERESOURCE_INSTANCE_SCHEDULERS_TAGTYPE = "SwSchedulableResource_Instance_schedulers";

    @objid ("09f30163-30e1-4df6-80bb-d58aa0dae379")
    public static final String SWSCHEDULABLERESOURCE_INSTANCE_TIMESLICEELEMENTS_TAGTYPE = "SwSchedulableResource_Instance_timeSliceElements";

    @objid ("db41618b-8ab7-4b89-80b1-cf34906ee4c3")
    public static final String SWSCHEDULABLERESOURCE_INSTANCE_YIELDSERVICES_TAGTYPE = "SwSchedulableResource_Instance_yieldServices";

    /**
     * Tells whether a {@link SwSchedulableResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SwSchedulableResource_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("97e52deb-8328-4ec0-887a-676baa32a3d4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwSchedulableResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SwSchedulableResource_Instance >> then instantiate a {@link SwSchedulableResourceInstance} proxy.
     * 
     * @return a {@link SwSchedulableResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("491dc7fe-c9bc-4ae6-89c8-3b04b62b9d03")
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
    @objid ("dc33ea44-5b78-4976-856d-a8b771c12839")
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
    @objid ("733cbd57-63cb-499e-a63b-9003cc4bb4f1")
    public static SwSchedulableResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SwSchedulableResourceInstance.canInstantiate(obj))
        	return new SwSchedulableResourceInstance(obj);
        else
        	throw new IllegalArgumentException("SwSchedulableResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("94d459e8-9b03-4440-bc20-52e78abeb3b4")
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
    @objid ("0947562e-cabe-4822-97d4-4602ec52ad5e")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Instance_deadlineElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1a6d9318-1175-4943-8d6e-f4fa94e0cb0b")
    public List<String> getSwSchedulableResource_Instance_deadlineElements() {
        return this.elt.getTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_DEADLINEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Instance_deadlineTypeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c8dd0bbf-d05b-42b0-8438-c4ef6aace9e5")
    public List<String> getSwSchedulableResource_Instance_deadlineTypeElements() {
        return this.elt.getTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_DEADLINETYPEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Instance_delayServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("512f8e1f-a2fd-457c-8f66-8984a61bc1db")
    public List<String> getSwSchedulableResource_Instance_delayServices() {
        return this.elt.getTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_DELAYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Instance_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6b8746e7-90c5-42a8-91d4-cc71adcf0352")
    public String getSwSchedulableResource_Instance_dependentScheduler() {
        return this.elt.getTagValue(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_DEPENDENTSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Instance_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("17db6a8b-61a3-4316-8873-64bb04395589")
    public String getSwSchedulableResource_Instance_host() {
        return this.elt.getTagValue(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Instance_joinServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e27cc9cf-1569-4b7a-b507-3eaa9d4e1573")
    public List<String> getSwSchedulableResource_Instance_joinServices() {
        return this.elt.getTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_JOINSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Instance_schedParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("7d91d7ba-f3b1-48a3-9044-5b6b56161a7d")
    public List<String> getSwSchedulableResource_Instance_schedParams() {
        return this.elt.getTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_SCHEDPARAMS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Instance_schedulers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("90aefbf4-0c7e-4b7c-9b6f-3eb97e768174")
    public String getSwSchedulableResource_Instance_schedulers() {
        return this.elt.getTagValue(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_SCHEDULERS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Instance_timeSliceElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4ad72461-93f0-44b0-837d-92ed153c1cc9")
    public List<String> getSwSchedulableResource_Instance_timeSliceElements() {
        return this.elt.getTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_TIMESLICEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Instance_yieldServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8598d185-1203-4540-8e4b-eb7d4b9855bc")
    public List<String> getSwSchedulableResource_Instance_yieldServices() {
        return this.elt.getTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_YIELDSERVICES_TAGTYPE_ELT);
    }

    @objid ("0109df0e-9a5f-4b15-b96d-bd7700c9012f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwSchedulableResource_Instance_isPreemptable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("76af769a-50cd-422c-a85c-c52020b32b74")
    public boolean isSwSchedulableResource_Instance_isPreemptable() {
        return this.elt.isTagged(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_ISPREEMPTABLE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SwSchedulableResource_Instance_isStaticSchedulingFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ab6334be-9176-4c98-985a-8b8e0244debc")
    public boolean isSwSchedulableResource_Instance_isStaticSchedulingFeature() {
        return this.elt.isTagged(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Instance_deadlineElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d0633409-f885-4242-9178-c9906d63b410")
    public void setSwSchedulableResource_Instance_deadlineElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_DEADLINEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Instance_deadlineTypeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("72cca210-35ce-431d-9b7c-5f579d7ae7b6")
    public void setSwSchedulableResource_Instance_deadlineTypeElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_DEADLINETYPEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Instance_delayServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7995f2fd-626f-4db5-bb0d-d25b27680371")
    public void setSwSchedulableResource_Instance_delayServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_DELAYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Instance_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e33b17e0-5145-499d-b867-e5e0b3514e7d")
    public void setSwSchedulableResource_Instance_dependentScheduler(final String value) {
        this.elt.putTagValue(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_DEPENDENTSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Instance_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c733dcfa-363f-43a4-8f22-7135ffbdb039")
    public void setSwSchedulableResource_Instance_host(final String value) {
        this.elt.putTagValue(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SwSchedulableResource_Instance_isPreemptable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e9790773-bd0c-46da-8bc1-8836e0a14887")
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
    @objid ("158efccd-b3c5-4f97-9bd0-ff222658db18")
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
    @objid ("d5f7372a-d5d3-4f70-ac4f-909de81a5350")
    public void setSwSchedulableResource_Instance_joinServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_JOINSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Instance_schedParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d14cea8d-ef3e-488d-8a0b-cddbe9770a68")
    public void setSwSchedulableResource_Instance_schedParams(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_SCHEDPARAMS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Instance_schedulers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f80ef1b5-db4e-49ad-a4f9-e461a3d45e70")
    public void setSwSchedulableResource_Instance_schedulers(final String value) {
        this.elt.putTagValue(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_SCHEDULERS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Instance_timeSliceElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9f89bb70-28c0-49fd-9568-f810a8275adf")
    public void setSwSchedulableResource_Instance_timeSliceElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_TIMESLICEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Instance_yieldServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0d6cc452-ac01-48c7-a80b-51168ec2c971")
    public void setSwSchedulableResource_Instance_yieldServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceInstance.MdaTypes.SWSCHEDULABLERESOURCE_INSTANCE_YIELDSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("77e97c62-a3dd-41ac-bd4d-66adf4986f2b")
    protected SwSchedulableResourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("53b97f1b-10c9-4bec-af84-321224057ed0")
    public static final class MdaTypes {
        @objid ("4fbbeb76-dd00-4d79-a97b-3e5547571b6c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cf0232a4-31f9-4683-9880-2149990b9d86")
        public static TagType SWSCHEDULABLERESOURCE_INSTANCE_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT;

        @objid ("5f0bc86c-7a3c-491f-a067-cfbec20da6bf")
        public static TagType SWSCHEDULABLERESOURCE_INSTANCE_ISPREEMPTABLE_TAGTYPE_ELT;

        @objid ("f756b561-f3b7-46dc-83c6-6ec6b6d5dba5")
        public static TagType SWSCHEDULABLERESOURCE_INSTANCE_SCHEDULERS_TAGTYPE_ELT;

        @objid ("fb0198fe-e155-4b0c-9768-3fed0029109d")
        public static TagType SWSCHEDULABLERESOURCE_INSTANCE_DEADLINEELEMENTS_TAGTYPE_ELT;

        @objid ("d819114b-11e9-4526-939f-95c0b19749a8")
        public static TagType SWSCHEDULABLERESOURCE_INSTANCE_DEADLINETYPEELEMENTS_TAGTYPE_ELT;

        @objid ("d5c73a96-e91b-4157-a662-90344a3e5714")
        public static TagType SWSCHEDULABLERESOURCE_INSTANCE_TIMESLICEELEMENTS_TAGTYPE_ELT;

        @objid ("42556c07-d6d2-4489-8f04-1f8d1c47da98")
        public static TagType SWSCHEDULABLERESOURCE_INSTANCE_DELAYSERVICES_TAGTYPE_ELT;

        @objid ("5d33edd5-0cab-497f-afd0-95e41625bd09")
        public static TagType SWSCHEDULABLERESOURCE_INSTANCE_JOINSERVICES_TAGTYPE_ELT;

        @objid ("cfbcc4c2-4405-424f-8ef8-29bdcd9b86ee")
        public static TagType SWSCHEDULABLERESOURCE_INSTANCE_YIELDSERVICES_TAGTYPE_ELT;

        @objid ("2dc6103f-bf7c-4640-b3a1-547a2db17626")
        public static TagType SWSCHEDULABLERESOURCE_INSTANCE_SCHEDPARAMS_TAGTYPE_ELT;

        @objid ("13907257-ccc9-4d19-ae7c-7c6ec16b7a8e")
        public static TagType SWSCHEDULABLERESOURCE_INSTANCE_HOST_TAGTYPE_ELT;

        @objid ("353a5b37-7d1c-411d-ba37-b4cc672a833a")
        public static TagType SWSCHEDULABLERESOURCE_INSTANCE_DEPENDENTSCHEDULER_TAGTYPE_ELT;

        @objid ("440fe25a-31e9-4a27-8a73-23daa51f08c9")
        private static Stereotype MDAASSOCDEP;

        @objid ("76ad37a2-2d4f-46dd-a738-f089f078284e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("20bd4cfe-5f55-40d9-8bee-a115c85ebf5f")
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
