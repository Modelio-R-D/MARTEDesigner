/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << SwSchedulableResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("08719086-f878-45ec-93aa-9826363b1ee5")
public class SwSchedulableResourceLifeline extends SwConcurrentResourceLifeline {
    @objid ("12f8b57f-10c5-4fe9-8fdf-b1d205191f2b")
    public static final String STEREOTYPE_NAME = "SwSchedulableResource_Lifeline";

    @objid ("667df96a-110b-4fb6-8135-df7837b58712")
    public static final String SWSCHEDULABLERESOURCE_LIFELINE_DEADLINEELEMENTS_TAGTYPE = "SwSchedulableResource_Lifeline_deadlineElements";

    @objid ("972fb04c-e32f-476a-a350-8e050e3bf2a8")
    public static final String SWSCHEDULABLERESOURCE_LIFELINE_DEADLINETYPEELEMENTS_TAGTYPE = "SwSchedulableResource_Lifeline_deadlineTypeElements";

    @objid ("dbf4a7be-002f-43e1-bc20-1ee358b84f56")
    public static final String SWSCHEDULABLERESOURCE_LIFELINE_DELAYSERVICES_TAGTYPE = "SwSchedulableResource_Lifeline_delayServices";

    @objid ("7fb7b576-db2f-4089-a8d4-1ccf64d6c3b6")
    public static final String SWSCHEDULABLERESOURCE_LIFELINE_DEPENDENTSCHEDULER_TAGTYPE = "SwSchedulableResource_Lifeline_dependentScheduler";

    @objid ("8c5dfbdd-479e-49f4-96d4-4d8d9e17648b")
    public static final String SWSCHEDULABLERESOURCE_LIFELINE_HOST_TAGTYPE = "SwSchedulableResource_Lifeline_host";

    @objid ("a98037af-b979-4fe2-b398-df73752ee33a")
    public static final String SWSCHEDULABLERESOURCE_LIFELINE_ISPREEMPTABLE_TAGTYPE = "SwSchedulableResource_Lifeline_isPreemptable";

    @objid ("78d4a9ff-92f8-4cfb-9c47-7c5663177d8a")
    public static final String SWSCHEDULABLERESOURCE_LIFELINE_ISSTATICSCHEDULINGFEATURE_TAGTYPE = "SwSchedulableResource_Lifeline_isStaticSchedulingFeature";

    @objid ("d2ea2b04-68ef-48eb-8256-c2cc0f0f6a88")
    public static final String SWSCHEDULABLERESOURCE_LIFELINE_JOINSERVICES_TAGTYPE = "SwSchedulableResource_Lifeline_joinServices";

    @objid ("ac3f7cbc-49ac-4a01-b261-c001dea44634")
    public static final String SWSCHEDULABLERESOURCE_LIFELINE_SCHEDPARAMS_TAGTYPE = "SwSchedulableResource_Lifeline_schedParams";

    @objid ("be17efc7-23e6-4a24-beff-7ef517977bcb")
    public static final String SWSCHEDULABLERESOURCE_LIFELINE_SCHEDULERS_TAGTYPE = "SwSchedulableResource_Lifeline_schedulers";

    @objid ("62acf4dd-af83-47ed-a91b-2f5627a4d4e4")
    public static final String SWSCHEDULABLERESOURCE_LIFELINE_TIMESLICEELEMENTS_TAGTYPE = "SwSchedulableResource_Lifeline_timeSliceElements";

    @objid ("8ac2782c-4c6d-4ffa-8eed-8771a5778cc0")
    public static final String SWSCHEDULABLERESOURCE_LIFELINE_YIELDSERVICES_TAGTYPE = "SwSchedulableResource_Lifeline_yieldServices";

    /**
     * Tells whether a {@link SwSchedulableResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << SwSchedulableResource_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("37041390-827f-45dd-a7a8-4bb08c651896")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwSchedulableResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << SwSchedulableResource_Lifeline >> then instantiate a {@link SwSchedulableResourceLifeline} proxy.
     * 
     * @return a {@link SwSchedulableResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("d2222523-266d-4bd8-9b39-9d65af8a88b1")
    public static SwSchedulableResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwSchedulableResourceLifeline.STEREOTYPE_NAME);
        return SwSchedulableResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link SwSchedulableResourceLifeline} proxy from a {@link Lifeline} stereotyped << SwSchedulableResource_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link SwSchedulableResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("3054f7e7-7317-4476-903c-b5f65a8cee68")
    public static SwSchedulableResourceLifeline instantiate(final Lifeline obj) {
        return SwSchedulableResourceLifeline.canInstantiate(obj) ? new SwSchedulableResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwSchedulableResourceLifeline} proxy from a {@link Lifeline} stereotyped << SwSchedulableResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link SwSchedulableResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("46f0aa57-eb07-469b-ad23-f0e8162c2c6e")
    public static SwSchedulableResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (SwSchedulableResourceLifeline.canInstantiate(obj))
        	return new SwSchedulableResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("SwSchedulableResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e5c9b513-58dd-44ba-a04f-e67799d4fb03")
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
        SwSchedulableResourceLifeline other = (SwSchedulableResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("11163d89-689a-43da-b5b5-d99f9996f88c")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Lifeline_deadlineElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5796eb7c-f9e3-40b9-990e-109b25c4648a")
    public List<String> getSwSchedulableResource_Lifeline_deadlineElements() {
        return this.elt.getTagValues(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_DEADLINEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Lifeline_deadlineTypeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("53da606f-f010-405e-9e89-1949a7e51366")
    public List<String> getSwSchedulableResource_Lifeline_deadlineTypeElements() {
        return this.elt.getTagValues(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_DEADLINETYPEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Lifeline_delayServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c724e1cd-cc01-49ff-a6b4-71f57c12b746")
    public List<String> getSwSchedulableResource_Lifeline_delayServices() {
        return this.elt.getTagValues(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_DELAYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Lifeline_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6b82ea6f-33ce-41a6-8086-bf36d74ee5f9")
    public String getSwSchedulableResource_Lifeline_dependentScheduler() {
        return this.elt.getTagValue(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_DEPENDENTSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Lifeline_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("83095d00-591c-4a44-aa86-5d792b521b74")
    public String getSwSchedulableResource_Lifeline_host() {
        return this.elt.getTagValue(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Lifeline_joinServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("06a6adcc-f53e-4397-afd6-1b4393236d30")
    public List<String> getSwSchedulableResource_Lifeline_joinServices() {
        return this.elt.getTagValues(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_JOINSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Lifeline_schedParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("bb48e158-5fcb-42ab-a2e1-80510994e859")
    public List<String> getSwSchedulableResource_Lifeline_schedParams() {
        return this.elt.getTagValues(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_SCHEDPARAMS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Lifeline_schedulers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8447a913-250a-4bea-a692-2aafc3c96105")
    public String getSwSchedulableResource_Lifeline_schedulers() {
        return this.elt.getTagValue(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_SCHEDULERS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Lifeline_timeSliceElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("dddae798-1e0a-49bb-8f78-50451457d867")
    public List<String> getSwSchedulableResource_Lifeline_timeSliceElements() {
        return this.elt.getTagValues(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_TIMESLICEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Lifeline_yieldServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1f5b5876-c3a2-4215-b3aa-fcc19c27f1a2")
    public List<String> getSwSchedulableResource_Lifeline_yieldServices() {
        return this.elt.getTagValues(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_YIELDSERVICES_TAGTYPE_ELT);
    }

    @objid ("9f50758b-db1f-48b6-a367-1806d5c7e6eb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwSchedulableResource_Lifeline_isPreemptable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("44652de5-37b6-4b3f-85a5-b450aa696d64")
    public boolean isSwSchedulableResource_Lifeline_isPreemptable() {
        return this.elt.isTagged(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_ISPREEMPTABLE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SwSchedulableResource_Lifeline_isStaticSchedulingFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("600d5fff-f9cf-499e-b184-cc9267030742")
    public boolean isSwSchedulableResource_Lifeline_isStaticSchedulingFeature() {
        return this.elt.isTagged(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Lifeline_deadlineElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("60adb05f-a2e4-48dc-8cf9-f4354e4cedd0")
    public void setSwSchedulableResource_Lifeline_deadlineElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_DEADLINEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Lifeline_deadlineTypeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("61204a48-8f13-4ce2-b18b-b9ce9e4f0209")
    public void setSwSchedulableResource_Lifeline_deadlineTypeElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_DEADLINETYPEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Lifeline_delayServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3d558533-7d6a-45dd-b33c-0e7d44b9405e")
    public void setSwSchedulableResource_Lifeline_delayServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_DELAYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Lifeline_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1f26aeb4-c0fa-426d-b757-5407c7a5c80d")
    public void setSwSchedulableResource_Lifeline_dependentScheduler(final String value) {
        this.elt.putTagValue(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_DEPENDENTSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Lifeline_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c89451ed-a029-4d7f-acf4-48b9b2ec94d3")
    public void setSwSchedulableResource_Lifeline_host(final String value) {
        this.elt.putTagValue(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SwSchedulableResource_Lifeline_isPreemptable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fe01a2f6-922c-44a9-b8db-1f871a4c8bf5")
    public void setSwSchedulableResource_Lifeline_isPreemptable(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_ISPREEMPTABLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_ISPREEMPTABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SwSchedulableResource_Lifeline_isStaticSchedulingFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("952debcf-fa0d-409d-9891-33976e60a115")
    public void setSwSchedulableResource_Lifeline_isStaticSchedulingFeature(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Lifeline_joinServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("56bb346b-1aef-4470-951e-68f824bc13e6")
    public void setSwSchedulableResource_Lifeline_joinServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_JOINSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Lifeline_schedParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8a74363a-3812-4c86-9836-e85976839ee1")
    public void setSwSchedulableResource_Lifeline_schedParams(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_SCHEDPARAMS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Lifeline_schedulers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5f0236e5-c494-4c50-aeae-448c03dae4ad")
    public void setSwSchedulableResource_Lifeline_schedulers(final String value) {
        this.elt.putTagValue(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_SCHEDULERS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Lifeline_timeSliceElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("01701f32-5ff2-493b-9a92-4b6f90044b57")
    public void setSwSchedulableResource_Lifeline_timeSliceElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_TIMESLICEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Lifeline_yieldServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0f556d0f-fb6a-4772-aeee-7712f0f1e06a")
    public void setSwSchedulableResource_Lifeline_yieldServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceLifeline.MdaTypes.SWSCHEDULABLERESOURCE_LIFELINE_YIELDSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("03757e64-cfe8-4bda-aa49-e7ab7fc26ec8")
    protected SwSchedulableResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("efe67330-c921-4c7b-8f62-7f370ad1459f")
    public static final class MdaTypes {
        @objid ("733fc001-d464-49f1-a631-ac48a0bc6c5d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ecd2b743-5de3-48e3-a4d0-ae0c0f28f125")
        public static TagType SWSCHEDULABLERESOURCE_LIFELINE_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT;

        @objid ("0d92526a-ed26-43c3-8eb1-21168d9ae68a")
        public static TagType SWSCHEDULABLERESOURCE_LIFELINE_ISPREEMPTABLE_TAGTYPE_ELT;

        @objid ("ea424795-3d47-4870-a933-c892316919eb")
        public static TagType SWSCHEDULABLERESOURCE_LIFELINE_SCHEDULERS_TAGTYPE_ELT;

        @objid ("c649f845-0c85-426f-b8ae-8ac993fee434")
        public static TagType SWSCHEDULABLERESOURCE_LIFELINE_DEADLINEELEMENTS_TAGTYPE_ELT;

        @objid ("ce644e5e-e11b-4188-81be-6e3cc1b34e0c")
        public static TagType SWSCHEDULABLERESOURCE_LIFELINE_DEADLINETYPEELEMENTS_TAGTYPE_ELT;

        @objid ("df3d497d-007e-4c9d-b933-78b698489352")
        public static TagType SWSCHEDULABLERESOURCE_LIFELINE_TIMESLICEELEMENTS_TAGTYPE_ELT;

        @objid ("4f25867f-83d4-4974-9111-00723e2b96e2")
        public static TagType SWSCHEDULABLERESOURCE_LIFELINE_DELAYSERVICES_TAGTYPE_ELT;

        @objid ("9ee18d5c-7156-4a63-876d-92fe3221018f")
        public static TagType SWSCHEDULABLERESOURCE_LIFELINE_JOINSERVICES_TAGTYPE_ELT;

        @objid ("f184fec3-6068-4a63-b4c6-c7da7315c71d")
        public static TagType SWSCHEDULABLERESOURCE_LIFELINE_YIELDSERVICES_TAGTYPE_ELT;

        @objid ("ad2d23aa-98a7-45f3-884e-79920a67fc93")
        public static TagType SWSCHEDULABLERESOURCE_LIFELINE_SCHEDPARAMS_TAGTYPE_ELT;

        @objid ("92737062-fd02-4aac-ad66-0abac92df1cc")
        public static TagType SWSCHEDULABLERESOURCE_LIFELINE_HOST_TAGTYPE_ELT;

        @objid ("1fe37c9e-677f-438b-93fa-2afddeb40048")
        public static TagType SWSCHEDULABLERESOURCE_LIFELINE_DEPENDENTSCHEDULER_TAGTYPE_ELT;

        @objid ("547308dd-a058-483b-8732-16fa1e6938d1")
        private static Stereotype MDAASSOCDEP;

        @objid ("1deba71f-6a2f-44b7-bae6-4b20e7b94cdb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3fe9a557-90ea-47ec-b923-f9c2f0962762")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "adb221bc-10ce-11df-81d9-0014222a9f79");
            SWSCHEDULABLERESOURCE_LIFELINE_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "da678491-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_LIFELINE_ISPREEMPTABLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "da678492-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_LIFELINE_SCHEDULERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "da678493-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_LIFELINE_DEADLINEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "da678494-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_LIFELINE_DEADLINETYPEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "da678495-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_LIFELINE_TIMESLICEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "da678496-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_LIFELINE_DELAYSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "da678497-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_LIFELINE_JOINSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "da678498-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_LIFELINE_YIELDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "da678499-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_LIFELINE_SCHEDPARAMS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "95b81280-92ac-11e0-a69d-0027103f347c");
            SWSCHEDULABLERESOURCE_LIFELINE_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "95b8127f-92ac-11e0-a69d-0027103f347c");
            SWSCHEDULABLERESOURCE_LIFELINE_DEPENDENTSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "95b8127e-92ac-11e0-a69d-0027103f347c");
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
