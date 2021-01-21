/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.parameter;

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
@objid ("d9e88d0c-9faf-4d93-a403-8dc0f82afd2c")
public class SwSchedulableResourceParameter extends SwConcurrentResourceParameter {
    @objid ("5bb67abd-2622-4495-8477-8eb285dc9226")
    public static final String STEREOTYPE_NAME = "SwSchedulableResource_Parameter";

    @objid ("182ad959-bea5-4c17-b497-989c4965e14f")
    public static final String SWSCHEDULABLERESOURCE_PARAMETER_DEADLINEELEMENTS_TAGTYPE = "SwSchedulableResource_Parameter_deadlineElements";

    @objid ("eecc1461-e5fb-4ae5-b9f5-d129314c8661")
    public static final String SWSCHEDULABLERESOURCE_PARAMETER_DEADLINETYPEELEMENTS_TAGTYPE = "SwSchedulableResource_Parameter_deadlineTypeElements";

    @objid ("4100e5fd-2836-4355-bd57-b47e0f492475")
    public static final String SWSCHEDULABLERESOURCE_PARAMETER_DELAYSERVICES_TAGTYPE = "SwSchedulableResource_Parameter_delayServices";

    @objid ("80732ca1-0ef9-449d-9a99-3b0aac1ca573")
    public static final String SWSCHEDULABLERESOURCE_PARAMETER_DEPENDENTSCHEDULER_TAGTYPE = "SwSchedulableResource_Parameter_dependentScheduler";

    @objid ("8b7ffd3f-976a-4364-9f87-d7b63e59b563")
    public static final String SWSCHEDULABLERESOURCE_PARAMETER_HOST_TAGTYPE = "SwSchedulableResource_Parameter_host";

    @objid ("5a099756-7292-4d1b-a610-0977024787b6")
    public static final String SWSCHEDULABLERESOURCE_PARAMETER_ISPREEMPTABLE_TAGTYPE = "SwSchedulableResource_Parameter_isPreemptable";

    @objid ("1e3f3116-b76b-44c5-b84c-f24ba7433992")
    public static final String SWSCHEDULABLERESOURCE_PARAMETER_ISSTATICSCHEDULINGFEATURE_TAGTYPE = "SwSchedulableResource_Parameter_isStaticSchedulingFeature";

    @objid ("472220ff-7c38-4331-93b7-10e89e9d0a4a")
    public static final String SWSCHEDULABLERESOURCE_PARAMETER_JOINSERVICES_TAGTYPE = "SwSchedulableResource_Parameter_joinServices";

    @objid ("d4d66522-217a-45b0-ab56-b6ce69a10a36")
    public static final String SWSCHEDULABLERESOURCE_PARAMETER_SCHEDPARAMS_TAGTYPE = "SwSchedulableResource_Parameter_schedParams";

    @objid ("f6bca0b6-6c0a-41a7-aedc-e3e31995a151")
    public static final String SWSCHEDULABLERESOURCE_PARAMETER_SCHEDULERS_TAGTYPE = "SwSchedulableResource_Parameter_schedulers";

    @objid ("b433d9d6-a963-4cdd-b954-a332fb493ed1")
    public static final String SWSCHEDULABLERESOURCE_PARAMETER_TIMESLICEELEMENTS_TAGTYPE = "SwSchedulableResource_Parameter_timeSliceElements";

    @objid ("839564fc-afd7-41e8-b6fb-a4bd3cf79b69")
    public static final String SWSCHEDULABLERESOURCE_PARAMETER_YIELDSERVICES_TAGTYPE = "SwSchedulableResource_Parameter_yieldServices";

    /**
     * Tells whether a {@link SwSchedulableResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << SwSchedulableResource_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("9a2cb8d4-fe61-420e-aa5d-c1458d1e5817")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwSchedulableResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << SwSchedulableResource_Parameter >> then instantiate a {@link SwSchedulableResourceParameter} proxy.
     * 
     * @return a {@link SwSchedulableResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("5f5f3b59-4107-43d4-883a-8c21e73f2059")
    public static SwSchedulableResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwSchedulableResourceParameter.STEREOTYPE_NAME);
        return SwSchedulableResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link SwSchedulableResourceParameter} proxy from a {@link Parameter} stereotyped << SwSchedulableResource_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link SwSchedulableResourceParameter} proxy or <i>null</i>.
     */
    @objid ("2692ad39-aec3-474a-acf9-041229b68a24")
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
    @objid ("d3be6b52-ce50-47f5-85f0-a4ef768d3085")
    public static SwSchedulableResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (SwSchedulableResourceParameter.canInstantiate(obj))
        	return new SwSchedulableResourceParameter(obj);
        else
        	throw new IllegalArgumentException("SwSchedulableResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9cad776f-7563-47ef-9a5b-7cb400d5326d")
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
    @objid ("977afbe6-d557-4584-8ab2-d099fe9df516")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Parameter_deadlineElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("db087e44-8898-4a4a-be91-ab2c4873a9c4")
    public List<String> getSwSchedulableResource_Parameter_deadlineElements() {
        return this.elt.getTagValues(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_DEADLINEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Parameter_deadlineTypeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6a7f39e9-5d21-4ea4-a9f4-d5cc849c63f4")
    public List<String> getSwSchedulableResource_Parameter_deadlineTypeElements() {
        return this.elt.getTagValues(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_DEADLINETYPEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Parameter_delayServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3b7ab7de-9a66-4e60-a682-4f8e3363f474")
    public List<String> getSwSchedulableResource_Parameter_delayServices() {
        return this.elt.getTagValues(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_DELAYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Parameter_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e6f8f44c-d527-4623-9f38-fd9029437d4d")
    public String getSwSchedulableResource_Parameter_dependentScheduler() {
        return this.elt.getTagValue(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_DEPENDENTSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Parameter_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2b0c6b00-6077-435c-9eb6-a79e80d9eaa0")
    public String getSwSchedulableResource_Parameter_host() {
        return this.elt.getTagValue(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Parameter_joinServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("002c3bb9-5a32-4482-9f9b-178fc32652d7")
    public List<String> getSwSchedulableResource_Parameter_joinServices() {
        return this.elt.getTagValues(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_JOINSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Parameter_schedParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("93e4ce1c-0069-475d-b568-2fea07de195a")
    public List<String> getSwSchedulableResource_Parameter_schedParams() {
        return this.elt.getTagValues(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_SCHEDPARAMS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Parameter_schedulers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("163ae56f-1151-45e7-b45d-3a6b34aa5a60")
    public String getSwSchedulableResource_Parameter_schedulers() {
        return this.elt.getTagValue(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_SCHEDULERS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Parameter_timeSliceElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b9b21ef1-0d4e-4072-b235-166597b43d38")
    public List<String> getSwSchedulableResource_Parameter_timeSliceElements() {
        return this.elt.getTagValues(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_TIMESLICEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Parameter_yieldServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("08e37acc-6ffe-44a1-9d8d-e33ac6e81240")
    public List<String> getSwSchedulableResource_Parameter_yieldServices() {
        return this.elt.getTagValues(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_YIELDSERVICES_TAGTYPE_ELT);
    }

    @objid ("c5d5e74e-aa53-41dc-8ba9-885987c1b554")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwSchedulableResource_Parameter_isPreemptable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7c09ad8e-41dd-4136-9178-1a68c06b1c49")
    public boolean isSwSchedulableResource_Parameter_isPreemptable() {
        return this.elt.isTagged(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_ISPREEMPTABLE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SwSchedulableResource_Parameter_isStaticSchedulingFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c2ed7db1-1daa-4903-8d27-d31029446124")
    public boolean isSwSchedulableResource_Parameter_isStaticSchedulingFeature() {
        return this.elt.isTagged(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Parameter_deadlineElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d8c76e74-2427-493d-83af-74b47fd45f58")
    public void setSwSchedulableResource_Parameter_deadlineElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_DEADLINEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Parameter_deadlineTypeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d1adf647-2149-41fc-8fde-e7d5aacd625d")
    public void setSwSchedulableResource_Parameter_deadlineTypeElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_DEADLINETYPEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Parameter_delayServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c3d6c4aa-5e19-4f59-a55b-03f67de42b70")
    public void setSwSchedulableResource_Parameter_delayServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_DELAYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Parameter_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3deec6a8-12ee-40a6-a950-67738b3e8122")
    public void setSwSchedulableResource_Parameter_dependentScheduler(final String value) {
        this.elt.putTagValue(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_DEPENDENTSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Parameter_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("353c3910-fb35-45d3-873b-3338d021f793")
    public void setSwSchedulableResource_Parameter_host(final String value) {
        this.elt.putTagValue(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SwSchedulableResource_Parameter_isPreemptable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4ed3eb7f-83b6-4fa1-9615-9ae67ea71fbc")
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
    @objid ("6f56ae89-0fde-4b93-b8a2-c84683236550")
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
    @objid ("eead10db-e8bb-4aa4-9b6f-2e5eddaa0b3d")
    public void setSwSchedulableResource_Parameter_joinServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_JOINSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Parameter_schedParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b0a808a8-4c27-40c9-be5e-f04ca9e74a9b")
    public void setSwSchedulableResource_Parameter_schedParams(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_SCHEDPARAMS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Parameter_schedulers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4d31fa41-0a06-41ad-8b7d-3b200a0ac9b4")
    public void setSwSchedulableResource_Parameter_schedulers(final String value) {
        this.elt.putTagValue(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_SCHEDULERS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Parameter_timeSliceElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4ee6d77b-1a22-49fe-ac95-fbe82216cd50")
    public void setSwSchedulableResource_Parameter_timeSliceElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_TIMESLICEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Parameter_yieldServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bee0cba6-e03a-4d20-895d-65863ffddb69")
    public void setSwSchedulableResource_Parameter_yieldServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceParameter.MdaTypes.SWSCHEDULABLERESOURCE_PARAMETER_YIELDSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("43063884-1d3c-4a8f-86dc-dc8e8a19f3af")
    protected SwSchedulableResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("05eeb3eb-340b-49e7-9709-3629a643c85a")
    public static final class MdaTypes {
        @objid ("514db85d-451b-4cce-bb30-e9d44d83933b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f9bf180d-7ef7-4b7c-8a1d-54757b7225c5")
        public static TagType SWSCHEDULABLERESOURCE_PARAMETER_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT;

        @objid ("1780fda9-02f3-4e7d-b165-6cc49ae7c27b")
        public static TagType SWSCHEDULABLERESOURCE_PARAMETER_ISPREEMPTABLE_TAGTYPE_ELT;

        @objid ("5febcadf-1948-46a3-8eab-c6d0facc580a")
        public static TagType SWSCHEDULABLERESOURCE_PARAMETER_SCHEDULERS_TAGTYPE_ELT;

        @objid ("17f5b620-1af0-4380-afb1-1f7a935d99eb")
        public static TagType SWSCHEDULABLERESOURCE_PARAMETER_DEADLINEELEMENTS_TAGTYPE_ELT;

        @objid ("459f033d-f0bc-4e86-b4a9-6e637c634113")
        public static TagType SWSCHEDULABLERESOURCE_PARAMETER_DEADLINETYPEELEMENTS_TAGTYPE_ELT;

        @objid ("ee9e2c29-aa16-4cba-8820-d7c242e8c682")
        public static TagType SWSCHEDULABLERESOURCE_PARAMETER_TIMESLICEELEMENTS_TAGTYPE_ELT;

        @objid ("fd7421e1-689c-4896-a32d-a02370e856de")
        public static TagType SWSCHEDULABLERESOURCE_PARAMETER_DELAYSERVICES_TAGTYPE_ELT;

        @objid ("bda5e5ba-e211-4303-8127-6f2b86849f09")
        public static TagType SWSCHEDULABLERESOURCE_PARAMETER_JOINSERVICES_TAGTYPE_ELT;

        @objid ("0bba4887-2a9b-42a4-8812-90a1dd4a667e")
        public static TagType SWSCHEDULABLERESOURCE_PARAMETER_YIELDSERVICES_TAGTYPE_ELT;

        @objid ("8465a3e0-c506-4460-8255-fd63a24cc03b")
        public static TagType SWSCHEDULABLERESOURCE_PARAMETER_SCHEDPARAMS_TAGTYPE_ELT;

        @objid ("fa10076b-9a14-4965-a05d-8603cc6cd11d")
        public static TagType SWSCHEDULABLERESOURCE_PARAMETER_HOST_TAGTYPE_ELT;

        @objid ("8303e8ae-acac-40d0-9876-542403b2e410")
        public static TagType SWSCHEDULABLERESOURCE_PARAMETER_DEPENDENTSCHEDULER_TAGTYPE_ELT;

        @objid ("eb78cfcf-8148-4a59-a6c2-454978af8447")
        private static Stereotype MDAASSOCDEP;

        @objid ("f6a86ae5-b575-4582-8de1-6877607258ff")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3d6e0dc7-e3ab-46e8-85ad-ffd4fc16041b")
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
