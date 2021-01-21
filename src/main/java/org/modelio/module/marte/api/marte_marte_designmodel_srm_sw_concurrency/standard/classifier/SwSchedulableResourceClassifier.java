/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.classifier;

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
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << SwSchedulableResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("def399a8-f75b-491f-8ade-6d1fca710890")
public class SwSchedulableResourceClassifier extends SwConcurrentResourceClassifier {
    @objid ("a80f6a45-e2d0-4786-aba7-ea754f0c18c3")
    public static final String STEREOTYPE_NAME = "SwSchedulableResource_Classifier";

    @objid ("1bfd10a7-8698-49d9-a267-559647a7e2ee")
    public static final String SWSCHEDULABLERESOURCE_CLASSIFIER_DEADLINEELEMENTS_TAGTYPE = "SwSchedulableResource_Classifier_deadlineElements";

    @objid ("3514a1c4-b7f6-45e4-819b-c0888217bf58")
    public static final String SWSCHEDULABLERESOURCE_CLASSIFIER_DEADLINETYPEELEMENTS_TAGTYPE = "SwSchedulableResource_Classifier_deadlineTypeElements";

    @objid ("2cba89f6-86a0-4b50-b4b5-024eeca6bd72")
    public static final String SWSCHEDULABLERESOURCE_CLASSIFIER_DELAYSERVICES_TAGTYPE = "SwSchedulableResource_Classifier_delayServices";

    @objid ("37558658-e036-4146-8d51-671dd583c96e")
    public static final String SWSCHEDULABLERESOURCE_CLASSIFIER_DEPENDENTSCHEDULER_TAGTYPE = "SwSchedulableResource_Classifier_dependentScheduler";

    @objid ("0f602c2c-66bf-458e-94b9-ea869e1d3990")
    public static final String SWSCHEDULABLERESOURCE_CLASSIFIER_HOST_TAGTYPE = "SwSchedulableResource_Classifier_host";

    @objid ("233dad37-2789-48a5-b9d5-001e8d7bba1c")
    public static final String SWSCHEDULABLERESOURCE_CLASSIFIER_ISPREEMPTABLE_TAGTYPE = "SwSchedulableResource_Classifier_isPreemptable";

    @objid ("b61b70db-ac37-4eff-8bfc-afa1d197f485")
    public static final String SWSCHEDULABLERESOURCE_CLASSIFIER_ISSTATICSCHEDULINGFEATURE_TAGTYPE = "SwSchedulableResource_Classifier_isStaticSchedulingFeature";

    @objid ("a0c832c2-14af-4110-8db6-f6e9a890d495")
    public static final String SWSCHEDULABLERESOURCE_CLASSIFIER_JOINSERVICES_TAGTYPE = "SwSchedulableResource_Classifier_joinServices";

    @objid ("a76209e2-c2f0-4dd4-9384-7fbef426b596")
    public static final String SWSCHEDULABLERESOURCE_CLASSIFIER_SCHEDPARAMS_TAGTYPE = "SwSchedulableResource_Classifier_schedParams";

    @objid ("51eed86a-92de-4ed7-898a-30a4fb0dd42e")
    public static final String SWSCHEDULABLERESOURCE_CLASSIFIER_SCHEDULERS_TAGTYPE = "SwSchedulableResource_Classifier_schedulers";

    @objid ("16e5479e-44af-4ddf-b3bf-ed178d810800")
    public static final String SWSCHEDULABLERESOURCE_CLASSIFIER_TIMESLICEELEMENTS_TAGTYPE = "SwSchedulableResource_Classifier_timeSliceElements";

    @objid ("f8065446-0992-44e7-8d2a-1eea9867600c")
    public static final String SWSCHEDULABLERESOURCE_CLASSIFIER_YIELDSERVICES_TAGTYPE = "SwSchedulableResource_Classifier_yieldServices";

    /**
     * Tells whether a {@link SwSchedulableResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << SwSchedulableResource_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("43bad7d6-13b7-4a8c-9db1-ea98be747c27")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwSchedulableResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << SwSchedulableResource_Classifier >> then instantiate a {@link SwSchedulableResourceClassifier} proxy.
     * 
     * @return a {@link SwSchedulableResourceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("757d621c-df6b-4f0e-b172-8879a752d787")
    public static SwSchedulableResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwSchedulableResourceClassifier.STEREOTYPE_NAME);
        return SwSchedulableResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link SwSchedulableResourceClassifier} proxy from a {@link Classifier} stereotyped << SwSchedulableResource_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link SwSchedulableResourceClassifier} proxy or <i>null</i>.
     */
    @objid ("a470e669-f92b-4af6-b80b-aa5bbd478e37")
    public static SwSchedulableResourceClassifier instantiate(final Classifier obj) {
        return SwSchedulableResourceClassifier.canInstantiate(obj) ? new SwSchedulableResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwSchedulableResourceClassifier} proxy from a {@link Classifier} stereotyped << SwSchedulableResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link SwSchedulableResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a70aa486-c88d-4dc3-87e2-6c7aa0f17e50")
    public static SwSchedulableResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (SwSchedulableResourceClassifier.canInstantiate(obj))
        	return new SwSchedulableResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("SwSchedulableResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6c7590a8-1fb0-43eb-a2d5-153139210c18")
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
        SwSchedulableResourceClassifier other = (SwSchedulableResourceClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("70598a5f-1660-4048-95bc-bb3961e1bf29")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Classifier_deadlineElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d4b8a74d-4959-4385-b750-3a075e6b853a")
    public List<String> getSwSchedulableResource_Classifier_deadlineElements() {
        return this.elt.getTagValues(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_DEADLINEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Classifier_deadlineTypeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f1d3a153-949c-4b31-821f-9dd7609147a6")
    public List<String> getSwSchedulableResource_Classifier_deadlineTypeElements() {
        return this.elt.getTagValues(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_DEADLINETYPEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Classifier_delayServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("97e52eb5-4a72-4407-85fa-e3c7bf2706c8")
    public List<String> getSwSchedulableResource_Classifier_delayServices() {
        return this.elt.getTagValues(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_DELAYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Classifier_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c08dd2a1-18df-425b-9fae-be5cec3a4cbd")
    public String getSwSchedulableResource_Classifier_dependentScheduler() {
        return this.elt.getTagValue(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_DEPENDENTSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Classifier_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f93ac6f0-a835-4a88-b864-543750c66576")
    public String getSwSchedulableResource_Classifier_host() {
        return this.elt.getTagValue(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Classifier_joinServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("acde3bc6-53ce-43d0-9cd5-df88160ba6fa")
    public List<String> getSwSchedulableResource_Classifier_joinServices() {
        return this.elt.getTagValues(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_JOINSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Classifier_schedParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("855ea194-53f7-4fe9-a0a5-e4b2d483078e")
    public List<String> getSwSchedulableResource_Classifier_schedParams() {
        return this.elt.getTagValues(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SCHEDPARAMS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Classifier_schedulers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b487710a-1026-4571-b1a2-f63372219db1")
    public String getSwSchedulableResource_Classifier_schedulers() {
        return this.elt.getTagValue(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SCHEDULERS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Classifier_timeSliceElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1b68be9b-0112-4145-847e-588e54a80f35")
    public List<String> getSwSchedulableResource_Classifier_timeSliceElements() {
        return this.elt.getTagValues(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_TIMESLICEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Classifier_yieldServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f501bb6d-e447-4fd6-a4df-7d526d7ec08c")
    public List<String> getSwSchedulableResource_Classifier_yieldServices() {
        return this.elt.getTagValues(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_YIELDSERVICES_TAGTYPE_ELT);
    }

    @objid ("eba40bf5-6f8f-4145-9ac5-b9e5029b7446")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwSchedulableResource_Classifier_isPreemptable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9f2c8933-5efd-456b-9f76-bc163e875337")
    public boolean isSwSchedulableResource_Classifier_isPreemptable() {
        return this.elt.isTagged(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_ISPREEMPTABLE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SwSchedulableResource_Classifier_isStaticSchedulingFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9b9960d5-1c24-484e-a63c-3fc2dc3e4ffe")
    public boolean isSwSchedulableResource_Classifier_isStaticSchedulingFeature() {
        return this.elt.isTagged(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Classifier_deadlineElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1255f668-4e9d-4fa4-9c13-01b8ceae112b")
    public void setSwSchedulableResource_Classifier_deadlineElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_DEADLINEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Classifier_deadlineTypeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("64f14c6f-9d5c-4944-aa97-1fbcf9b068cd")
    public void setSwSchedulableResource_Classifier_deadlineTypeElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_DEADLINETYPEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Classifier_delayServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("acd3c8c5-d61f-4699-af16-b49fc92161a9")
    public void setSwSchedulableResource_Classifier_delayServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_DELAYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Classifier_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5f7696dd-bfef-455a-abf8-0cce3c81fa0f")
    public void setSwSchedulableResource_Classifier_dependentScheduler(final String value) {
        this.elt.putTagValue(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_DEPENDENTSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Classifier_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7b830fd6-c0d3-42b7-8412-0b9002f3b0c3")
    public void setSwSchedulableResource_Classifier_host(final String value) {
        this.elt.putTagValue(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SwSchedulableResource_Classifier_isPreemptable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d610004c-107b-4203-a64a-bfd63a11f948")
    public void setSwSchedulableResource_Classifier_isPreemptable(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_ISPREEMPTABLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_ISPREEMPTABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SwSchedulableResource_Classifier_isStaticSchedulingFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0c5bf43e-1cd4-4bf2-8af8-6b3d5f30feb9")
    public void setSwSchedulableResource_Classifier_isStaticSchedulingFeature(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Classifier_joinServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("69dcc248-865e-4d72-843b-1e220a1e7924")
    public void setSwSchedulableResource_Classifier_joinServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_JOINSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Classifier_schedParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e626ce3b-48cb-48be-ab51-e6c58688f60d")
    public void setSwSchedulableResource_Classifier_schedParams(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SCHEDPARAMS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Classifier_schedulers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3651e35e-2357-44ce-ac57-a785da74cb0a")
    public void setSwSchedulableResource_Classifier_schedulers(final String value) {
        this.elt.putTagValue(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SCHEDULERS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Classifier_timeSliceElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0697d306-8f7c-4593-99da-584b88ab7c60")
    public void setSwSchedulableResource_Classifier_timeSliceElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_TIMESLICEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Classifier_yieldServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ed406e98-5558-4e9e-8b0a-ffba3268521a")
    public void setSwSchedulableResource_Classifier_yieldServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceClassifier.MdaTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_YIELDSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("e7cc631e-d846-44c4-96d6-910f8972d023")
    protected SwSchedulableResourceClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("d9e58dec-e3c1-4704-b680-038b05d21266")
    public static final class MdaTypes {
        @objid ("1c5c700e-8455-4082-82a4-370ce97c0168")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("60ea98eb-141e-403e-8abc-dab4fb3dd532")
        public static TagType SWSCHEDULABLERESOURCE_CLASSIFIER_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT;

        @objid ("ddb12a96-3a9d-4049-ba70-36d9b8b38804")
        public static TagType SWSCHEDULABLERESOURCE_CLASSIFIER_ISPREEMPTABLE_TAGTYPE_ELT;

        @objid ("952bc81b-783d-48d9-ab18-943da0daf891")
        public static TagType SWSCHEDULABLERESOURCE_CLASSIFIER_SCHEDULERS_TAGTYPE_ELT;

        @objid ("11317b1b-c935-4691-9646-cac8b3d6c133")
        public static TagType SWSCHEDULABLERESOURCE_CLASSIFIER_DEADLINEELEMENTS_TAGTYPE_ELT;

        @objid ("87f8548e-81e8-475b-993a-5b3774e9a390")
        public static TagType SWSCHEDULABLERESOURCE_CLASSIFIER_DEADLINETYPEELEMENTS_TAGTYPE_ELT;

        @objid ("d9cf0973-c566-4bf1-80ae-904a5e212677")
        public static TagType SWSCHEDULABLERESOURCE_CLASSIFIER_TIMESLICEELEMENTS_TAGTYPE_ELT;

        @objid ("67830ed1-6f32-4fe4-86e0-6656b3b3c4b7")
        public static TagType SWSCHEDULABLERESOURCE_CLASSIFIER_DELAYSERVICES_TAGTYPE_ELT;

        @objid ("00ee52b1-5ac8-41cc-af35-f8c1afadb544")
        public static TagType SWSCHEDULABLERESOURCE_CLASSIFIER_JOINSERVICES_TAGTYPE_ELT;

        @objid ("820fc6eb-3969-4f71-b365-39d51f87ff21")
        public static TagType SWSCHEDULABLERESOURCE_CLASSIFIER_YIELDSERVICES_TAGTYPE_ELT;

        @objid ("20a3a8bd-c491-48d8-a100-f110978b77e0")
        public static TagType SWSCHEDULABLERESOURCE_CLASSIFIER_SCHEDPARAMS_TAGTYPE_ELT;

        @objid ("4a253654-301c-43e2-a7fc-6af97241988d")
        public static TagType SWSCHEDULABLERESOURCE_CLASSIFIER_HOST_TAGTYPE_ELT;

        @objid ("14f11a22-0b53-4fd7-902a-19d41064fda6")
        public static TagType SWSCHEDULABLERESOURCE_CLASSIFIER_DEPENDENTSCHEDULER_TAGTYPE_ELT;

        @objid ("1bc72512-6dd1-4663-a262-792399b0cb56")
        private static Stereotype MDAASSOCDEP;

        @objid ("12718b5c-815f-41ff-945e-cbb04b3a46c8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e7e542d5-cc72-47a1-862a-aa3da26b95bd")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "adcebe18-10ce-11df-81d9-0014222a9f79");
            SWSCHEDULABLERESOURCE_CLASSIFIER_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9496971-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_CLASSIFIER_ISPREEMPTABLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9496972-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_CLASSIFIER_SCHEDULERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9496973-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_CLASSIFIER_DEADLINEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9496974-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_CLASSIFIER_DEADLINETYPEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9496975-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_CLASSIFIER_TIMESLICEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9496976-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_CLASSIFIER_DELAYSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9496977-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_CLASSIFIER_JOINSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9496978-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_CLASSIFIER_YIELDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9496979-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_CLASSIFIER_SCHEDPARAMS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "92dccc48-92ac-11e0-a69d-0027103f347c");
            SWSCHEDULABLERESOURCE_CLASSIFIER_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "92dccc47-92ac-11e0-a69d-0027103f347c");
            SWSCHEDULABLERESOURCE_CLASSIFIER_DEPENDENTSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "92dccc46-92ac-11e0-a69d-0027103f347c");
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
