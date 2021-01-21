/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << SwSchedulableResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("8dcea2fd-1ea1-4ae5-9e85-c4648eaf28c3")
public class SwSchedulableResourceAssociation extends SwConcurrentResourceAssociation {
    @objid ("51ef1723-d26e-4979-b666-64b14bd8febd")
    public static final String STEREOTYPE_NAME = "SwSchedulableResource_Association";

    @objid ("00aee2f7-4afb-4fa8-b979-02b0034a3f03")
    public static final String SWSCHEDULABLERESOURCE_ASSOCIATION_DEADLINEELEMENTS_TAGTYPE = "SwSchedulableResource_Association_deadlineElements";

    @objid ("c9d785ca-34da-4fc2-8a68-585d080ab09c")
    public static final String SWSCHEDULABLERESOURCE_ASSOCIATION_DEADLINETYPEELEMENTS_TAGTYPE = "SwSchedulableResource_Association_deadlineTypeElements";

    @objid ("2444cd7c-bf8c-44f5-91d8-933341689d64")
    public static final String SWSCHEDULABLERESOURCE_ASSOCIATION_DELAYSERVICES_TAGTYPE = "SwSchedulableResource_Association_delayServices";

    @objid ("06d08cb2-5a77-4c83-a5f2-c72c344ea5f9")
    public static final String SWSCHEDULABLERESOURCE_ASSOCIATION_DEPENDENTSCHEDULER_TAGTYPE = "SwSchedulableResource_Association_dependentScheduler";

    @objid ("39d5d498-0712-4c2f-84e6-030fab23d4fe")
    public static final String SWSCHEDULABLERESOURCE_ASSOCIATION_HOST_TAGTYPE = "SwSchedulableResource_Association_host";

    @objid ("bf56814d-e36a-4fc0-b456-6bb30264f2ed")
    public static final String SWSCHEDULABLERESOURCE_ASSOCIATION_ISPREEMPTABLE_TAGTYPE = "SwSchedulableResource_Association_isPreemptable";

    @objid ("49c14451-6222-4a14-a12f-b70b6cf4deec")
    public static final String SWSCHEDULABLERESOURCE_ASSOCIATION_ISSTATICSCHEDULINGFEATURE_TAGTYPE = "SwSchedulableResource_Association_isStaticSchedulingFeature";

    @objid ("25ba49ea-f27a-4210-aa9c-d819a220b3d7")
    public static final String SWSCHEDULABLERESOURCE_ASSOCIATION_JOINSERVICES_TAGTYPE = "SwSchedulableResource_Association_joinServices";

    @objid ("1f8f7c7e-9aba-4de1-b03e-78a36f7b0a57")
    public static final String SWSCHEDULABLERESOURCE_ASSOCIATION_SCHEDPARAMS_TAGTYPE = "SwSchedulableResource_Association_schedParams";

    @objid ("d3fc9949-a459-4d7c-9e20-9b7faf1e5dc5")
    public static final String SWSCHEDULABLERESOURCE_ASSOCIATION_SCHEDULERS_TAGTYPE = "SwSchedulableResource_Association_schedulers";

    @objid ("1a640cb3-b7c0-43c7-bc42-64c68bc1e87f")
    public static final String SWSCHEDULABLERESOURCE_ASSOCIATION_TIMESLICEELEMENTS_TAGTYPE = "SwSchedulableResource_Association_timeSliceElements";

    @objid ("40811b55-dc2e-4c9b-b0b1-12ff1e527cca")
    public static final String SWSCHEDULABLERESOURCE_ASSOCIATION_YIELDSERVICES_TAGTYPE = "SwSchedulableResource_Association_yieldServices";

    /**
     * Tells whether a {@link SwSchedulableResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << SwSchedulableResource_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("3e703c01-42f4-4238-96c5-68f64acbf01b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwSchedulableResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << SwSchedulableResource_Association >> then instantiate a {@link SwSchedulableResourceAssociation} proxy.
     * 
     * @return a {@link SwSchedulableResourceAssociation} proxy on the created {@link Association}.
     */
    @objid ("f0e54c0c-2796-4c81-a54d-6c37242d3f3c")
    public static SwSchedulableResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwSchedulableResourceAssociation.STEREOTYPE_NAME);
        return SwSchedulableResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link SwSchedulableResourceAssociation} proxy from a {@link Association} stereotyped << SwSchedulableResource_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link SwSchedulableResourceAssociation} proxy or <i>null</i>.
     */
    @objid ("c0053ecf-6610-4bf4-82a5-dce23db20fc5")
    public static SwSchedulableResourceAssociation instantiate(final Association obj) {
        return SwSchedulableResourceAssociation.canInstantiate(obj) ? new SwSchedulableResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwSchedulableResourceAssociation} proxy from a {@link Association} stereotyped << SwSchedulableResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link SwSchedulableResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4895b2b0-1d37-4d2d-981e-77d3e57c2b0e")
    public static SwSchedulableResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (SwSchedulableResourceAssociation.canInstantiate(obj))
        	return new SwSchedulableResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("SwSchedulableResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ecc62644-6515-4ad1-b553-c3d79e09d85d")
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
        SwSchedulableResourceAssociation other = (SwSchedulableResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("ebf905bf-ea55-4885-9f4a-031cc7be1970")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Association_deadlineElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5b6c08cf-c44e-48eb-be49-e78b5d5b8bec")
    public List<String> getSwSchedulableResource_Association_deadlineElements() {
        return this.elt.getTagValues(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_DEADLINEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Association_deadlineTypeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1f64fb3a-bf42-4749-a13e-73b6ea7c04f6")
    public List<String> getSwSchedulableResource_Association_deadlineTypeElements() {
        return this.elt.getTagValues(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_DEADLINETYPEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Association_delayServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9630de2d-a3af-45b8-84b9-c026a75ffbd0")
    public List<String> getSwSchedulableResource_Association_delayServices() {
        return this.elt.getTagValues(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_DELAYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Association_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dbcdb6ac-90d2-443d-96b1-bd4e123d2230")
    public String getSwSchedulableResource_Association_dependentScheduler() {
        return this.elt.getTagValue(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_DEPENDENTSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Association_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("46ad6fd5-a4a0-4bd4-8388-7a53a686a81f")
    public String getSwSchedulableResource_Association_host() {
        return this.elt.getTagValue(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Association_joinServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("77dc966f-cb33-4480-bbd9-eb9ea71aabcb")
    public List<String> getSwSchedulableResource_Association_joinServices() {
        return this.elt.getTagValues(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_JOINSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Association_schedParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("132f7a5f-2b04-44d8-9837-e79f434bc1ef")
    public List<String> getSwSchedulableResource_Association_schedParams() {
        return this.elt.getTagValues(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_SCHEDPARAMS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Association_schedulers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4cfad1c5-8208-4b8a-a2ef-af5c2f4bf5db")
    public String getSwSchedulableResource_Association_schedulers() {
        return this.elt.getTagValue(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_SCHEDULERS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Association_timeSliceElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("378d3110-da7c-40a5-a79f-9c0dd10025a6")
    public List<String> getSwSchedulableResource_Association_timeSliceElements() {
        return this.elt.getTagValues(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_TIMESLICEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Association_yieldServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("10787655-b228-49e1-89ef-01c2936772d8")
    public List<String> getSwSchedulableResource_Association_yieldServices() {
        return this.elt.getTagValues(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_YIELDSERVICES_TAGTYPE_ELT);
    }

    @objid ("b8ceaa00-b019-4335-8fa9-12cc855a9128")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwSchedulableResource_Association_isPreemptable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f24f6268-0d4b-45ee-bcfa-c45bea928588")
    public boolean isSwSchedulableResource_Association_isPreemptable() {
        return this.elt.isTagged(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_ISPREEMPTABLE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SwSchedulableResource_Association_isStaticSchedulingFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0703cc63-1256-4f4c-9265-e897378cbb9c")
    public boolean isSwSchedulableResource_Association_isStaticSchedulingFeature() {
        return this.elt.isTagged(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Association_deadlineElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("333ba1a6-c9bb-4dda-b701-2952a4d31c05")
    public void setSwSchedulableResource_Association_deadlineElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_DEADLINEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Association_deadlineTypeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f09da510-08fc-4b04-9f34-e2e1443fce4d")
    public void setSwSchedulableResource_Association_deadlineTypeElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_DEADLINETYPEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Association_delayServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("da954a1a-f8a2-49cd-8365-508132aa3109")
    public void setSwSchedulableResource_Association_delayServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_DELAYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Association_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("702ed605-0340-4839-b7e1-7c8d43b4057f")
    public void setSwSchedulableResource_Association_dependentScheduler(final String value) {
        this.elt.putTagValue(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_DEPENDENTSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Association_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("edab146d-0390-488c-8d66-8f93d6750114")
    public void setSwSchedulableResource_Association_host(final String value) {
        this.elt.putTagValue(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SwSchedulableResource_Association_isPreemptable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4673dfd8-5cce-492c-82ad-60d950ce50b4")
    public void setSwSchedulableResource_Association_isPreemptable(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_ISPREEMPTABLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_ISPREEMPTABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SwSchedulableResource_Association_isStaticSchedulingFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("392b2cec-def7-4785-a50e-92b0d4bef619")
    public void setSwSchedulableResource_Association_isStaticSchedulingFeature(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Association_joinServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4eb8f860-3eee-46e6-b389-ff62e53c31b6")
    public void setSwSchedulableResource_Association_joinServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_JOINSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Association_schedParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4ce60c69-187e-40cf-96e1-4444eb7f3634")
    public void setSwSchedulableResource_Association_schedParams(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_SCHEDPARAMS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Association_schedulers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4ca21fb6-d1c9-42fd-8b22-035358c5d0e2")
    public void setSwSchedulableResource_Association_schedulers(final String value) {
        this.elt.putTagValue(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_SCHEDULERS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Association_timeSliceElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2e6d04c2-b73a-4f08-8254-22f4b6f18acf")
    public void setSwSchedulableResource_Association_timeSliceElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_TIMESLICEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Association_yieldServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("778055a7-af65-4427-a3e9-7ed19a4ab9a8")
    public void setSwSchedulableResource_Association_yieldServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_YIELDSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("1854ad72-436f-4498-8b9d-186a5866ead3")
    protected SwSchedulableResourceAssociation(final Association elt) {
        super(elt);
    }

    @objid ("07e3886f-adc5-48d6-9197-59a0914e16c7")
    public static final class MdaTypes {
        @objid ("70d28030-312f-4741-83e1-fca28181b34d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("42c3921d-b46d-431c-a35f-824c54a8b801")
        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATION_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT;

        @objid ("18ae0ced-bbc2-4851-a9ab-c487714bd4fd")
        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATION_ISPREEMPTABLE_TAGTYPE_ELT;

        @objid ("e3f7fad5-39b2-4955-9a53-c6de789e6e0e")
        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATION_SCHEDULERS_TAGTYPE_ELT;

        @objid ("24c40828-faed-45ec-861c-c90ce95f3eb2")
        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATION_DEADLINEELEMENTS_TAGTYPE_ELT;

        @objid ("1b66756a-4b7f-43d4-bbe5-ed00ae5c5f91")
        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATION_DEADLINETYPEELEMENTS_TAGTYPE_ELT;

        @objid ("6616d883-c708-4864-9bab-bd38b32221ab")
        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATION_TIMESLICEELEMENTS_TAGTYPE_ELT;

        @objid ("f45af838-07f8-4127-aa5a-77e0b30e62b5")
        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATION_DELAYSERVICES_TAGTYPE_ELT;

        @objid ("ab7881b2-0ed8-4bee-9097-5d3c280286c7")
        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATION_JOINSERVICES_TAGTYPE_ELT;

        @objid ("5c67c38f-a3ec-4e7b-8681-87ce88fe4420")
        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATION_YIELDSERVICES_TAGTYPE_ELT;

        @objid ("ac88e2b9-a8e6-48c9-b951-187d73a98398")
        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATION_SCHEDPARAMS_TAGTYPE_ELT;

        @objid ("3f86478d-7bc4-4f4e-9158-ba8753dfe95c")
        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATION_HOST_TAGTYPE_ELT;

        @objid ("86727e34-8d09-4cc7-880a-2146799f9f41")
        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATION_DEPENDENTSCHEDULER_TAGTYPE_ELT;

        @objid ("fd41db68-605c-4bb2-809b-0361652dba5a")
        private static Stereotype MDAASSOCDEP;

        @objid ("0e5c1cdc-ba60-4f35-b1c1-d6e820c76326")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("86f8061c-4fff-4a41-99b3-d782fae930ce")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ad90c0a6-10ce-11df-81d9-0014222a9f79");
            SWSCHEDULABLERESOURCE_ASSOCIATION_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dbc13aad-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ASSOCIATION_ISPREEMPTABLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dbc13aae-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ASSOCIATION_SCHEDULERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dbc13aaf-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ASSOCIATION_DEADLINEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dbc13ab0-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ASSOCIATION_DEADLINETYPEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dbc13ab1-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ASSOCIATION_TIMESLICEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dbc13ab2-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ASSOCIATION_DELAYSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dbc13ab3-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ASSOCIATION_JOINSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dbc13ab4-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ASSOCIATION_YIELDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dbc13ab5-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ASSOCIATION_SCHEDPARAMS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "812cc1db-92ac-11e0-a69d-0027103f347c");
            SWSCHEDULABLERESOURCE_ASSOCIATION_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "812cc1dc-92ac-11e0-a69d-0027103f347c");
            SWSCHEDULABLERESOURCE_ASSOCIATION_DEPENDENTSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "812cc1dd-92ac-11e0-a69d-0027103f347c");
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
