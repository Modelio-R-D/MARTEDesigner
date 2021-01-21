/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << SwSchedulableResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("963c9943-a8f8-4eca-9fc2-b8fdc75ba799")
public class SwSchedulableResourceAssociationEnd extends SwConcurrentResourceAssociationEnd {
    @objid ("b6813704-c8b7-4154-b449-35a4c030df06")
    public static final String STEREOTYPE_NAME = "SwSchedulableResource_AssociationEnd";

    @objid ("d48066ab-495f-465f-a2c6-ffa9561e975d")
    public static final String SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DEADLINEELEMENTS_TAGTYPE = "SwSchedulableResource_AssociationEnd_deadlineElements";

    @objid ("8b09918f-bf48-4750-be41-4155acc7a352")
    public static final String SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DEADLINETYPEELEMENTS_TAGTYPE = "SwSchedulableResource_AssociationEnd_deadlineTypeElements";

    @objid ("dc39ddf6-147f-4f5a-8208-681b343b4ace")
    public static final String SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DELAYSERVICES_TAGTYPE = "SwSchedulableResource_AssociationEnd_delayServices";

    @objid ("0b140e3e-e479-4ddf-9512-680bf262f1b9")
    public static final String SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DEPENDENTSCHEDULER_TAGTYPE = "SwSchedulableResource_AssociationEnd_dependentScheduler";

    @objid ("da928383-561a-4539-9269-9a45809b31ca")
    public static final String SWSCHEDULABLERESOURCE_ASSOCIATIONEND_HOST_TAGTYPE = "SwSchedulableResource_AssociationEnd_host";

    @objid ("119966e8-3b6b-47e1-8565-9ab60652303c")
    public static final String SWSCHEDULABLERESOURCE_ASSOCIATIONEND_ISPREEMPTABLE_TAGTYPE = "SwSchedulableResource_AssociationEnd_isPreemptable";

    @objid ("be618b58-73ff-4c16-96e3-ed2fec0f4589")
    public static final String SWSCHEDULABLERESOURCE_ASSOCIATIONEND_ISSTATICSCHEDULINGFEATURE_TAGTYPE = "SwSchedulableResource_AssociationEnd_isStaticSchedulingFeature";

    @objid ("bedccad7-f10a-4347-8efb-6bc091784e20")
    public static final String SWSCHEDULABLERESOURCE_ASSOCIATIONEND_JOINSERVICES_TAGTYPE = "SwSchedulableResource_AssociationEnd_joinServices";

    @objid ("f3c136b3-b12d-4117-8be0-16d19f8c56bd")
    public static final String SWSCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDPARAMS_TAGTYPE = "SwSchedulableResource_AssociationEnd_schedParams";

    @objid ("fdf2109a-2b76-444d-916d-3d7a9cf6fd47")
    public static final String SWSCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDULERS_TAGTYPE = "SwSchedulableResource_AssociationEnd_schedulers";

    @objid ("c71ba5b3-fd07-4634-abac-99885e40e4c0")
    public static final String SWSCHEDULABLERESOURCE_ASSOCIATIONEND_TIMESLICEELEMENTS_TAGTYPE = "SwSchedulableResource_AssociationEnd_timeSliceElements";

    @objid ("6d80d233-c6b3-4cbc-9758-e45ef1c61dfc")
    public static final String SWSCHEDULABLERESOURCE_ASSOCIATIONEND_YIELDSERVICES_TAGTYPE = "SwSchedulableResource_AssociationEnd_yieldServices";

    /**
     * Tells whether a {@link SwSchedulableResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << SwSchedulableResource_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("193ab61b-6687-4c91-8836-fe8a16024bec")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwSchedulableResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << SwSchedulableResource_AssociationEnd >> then instantiate a {@link SwSchedulableResourceAssociationEnd} proxy.
     * 
     * @return a {@link SwSchedulableResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("b4404d9f-d827-49f7-8710-1b99adea0e92")
    public static SwSchedulableResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwSchedulableResourceAssociationEnd.STEREOTYPE_NAME);
        return SwSchedulableResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link SwSchedulableResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SwSchedulableResource_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link SwSchedulableResourceAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("86ebfe34-f133-42ec-aa6a-4335a6c802c7")
    public static SwSchedulableResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return SwSchedulableResourceAssociationEnd.canInstantiate(obj) ? new SwSchedulableResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwSchedulableResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SwSchedulableResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link SwSchedulableResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("dd5d02d4-9cc3-4723-9f9c-8e1a1c74e1cb")
    public static SwSchedulableResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (SwSchedulableResourceAssociationEnd.canInstantiate(obj))
        	return new SwSchedulableResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("SwSchedulableResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6e450eed-5dba-4824-944b-4514f160d48e")
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
        SwSchedulableResourceAssociationEnd other = (SwSchedulableResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("60077785-4068-4409-9908-4c7cfba83bec")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_AssociationEnd_deadlineElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8fcf9627-8b95-4de7-aa74-e548eeca483f")
    public List<String> getSwSchedulableResource_AssociationEnd_deadlineElements() {
        return this.elt.getTagValues(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DEADLINEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_AssociationEnd_deadlineTypeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("867eb667-9cd1-41f4-9861-30995af69134")
    public List<String> getSwSchedulableResource_AssociationEnd_deadlineTypeElements() {
        return this.elt.getTagValues(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DEADLINETYPEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_AssociationEnd_delayServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("259f607b-62f0-4739-98b9-bc6350293f15")
    public List<String> getSwSchedulableResource_AssociationEnd_delayServices() {
        return this.elt.getTagValues(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DELAYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_AssociationEnd_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("40743869-8325-465d-86d5-3afcef1f2331")
    public String getSwSchedulableResource_AssociationEnd_dependentScheduler() {
        return this.elt.getTagValue(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DEPENDENTSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_AssociationEnd_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ca9f6182-07b1-46c0-99c7-d76696db0d06")
    public String getSwSchedulableResource_AssociationEnd_host() {
        return this.elt.getTagValue(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_AssociationEnd_joinServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("16591d96-0aac-48fa-9606-aa9aa847fcad")
    public List<String> getSwSchedulableResource_AssociationEnd_joinServices() {
        return this.elt.getTagValues(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_JOINSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_AssociationEnd_schedParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("27cdfa8a-1f49-4022-a430-12b500f45e2a")
    public List<String> getSwSchedulableResource_AssociationEnd_schedParams() {
        return this.elt.getTagValues(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDPARAMS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_AssociationEnd_schedulers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("60b9a914-8fbd-4efc-b79f-da6686194571")
    public String getSwSchedulableResource_AssociationEnd_schedulers() {
        return this.elt.getTagValue(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDULERS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_AssociationEnd_timeSliceElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8ad5a0d0-73bb-4ff5-8218-a93f67a51ca8")
    public List<String> getSwSchedulableResource_AssociationEnd_timeSliceElements() {
        return this.elt.getTagValues(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_TIMESLICEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_AssociationEnd_yieldServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("25de2351-e93b-4593-b8cd-f47772569bd1")
    public List<String> getSwSchedulableResource_AssociationEnd_yieldServices() {
        return this.elt.getTagValues(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_YIELDSERVICES_TAGTYPE_ELT);
    }

    @objid ("3fdb236a-5240-430c-af5a-660b37cddf0c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwSchedulableResource_AssociationEnd_isPreemptable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d0be86cc-f94a-4602-84ce-6ec97a588571")
    public boolean isSwSchedulableResource_AssociationEnd_isPreemptable() {
        return this.elt.isTagged(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_ISPREEMPTABLE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SwSchedulableResource_AssociationEnd_isStaticSchedulingFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b86dec8d-e8ac-4e5b-a22d-071dbf938dae")
    public boolean isSwSchedulableResource_AssociationEnd_isStaticSchedulingFeature() {
        return this.elt.isTagged(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_AssociationEnd_deadlineElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("039b4109-217a-4f0b-88b9-86b68353c88c")
    public void setSwSchedulableResource_AssociationEnd_deadlineElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DEADLINEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_AssociationEnd_deadlineTypeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2aec13e0-ca97-4478-a90a-e65b22b87edb")
    public void setSwSchedulableResource_AssociationEnd_deadlineTypeElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DEADLINETYPEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_AssociationEnd_delayServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("996557e9-1167-41c8-bf24-40230c8fca25")
    public void setSwSchedulableResource_AssociationEnd_delayServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DELAYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwSchedulableResource_AssociationEnd_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dccfb1ef-91a9-4420-a0c4-af895020a4ad")
    public void setSwSchedulableResource_AssociationEnd_dependentScheduler(final String value) {
        this.elt.putTagValue(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DEPENDENTSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwSchedulableResource_AssociationEnd_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0a860e4e-4442-490a-9314-fa56304ddd89")
    public void setSwSchedulableResource_AssociationEnd_host(final String value) {
        this.elt.putTagValue(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SwSchedulableResource_AssociationEnd_isPreemptable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5d3878bc-b371-46c6-85c7-304e1708efe9")
    public void setSwSchedulableResource_AssociationEnd_isPreemptable(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_ISPREEMPTABLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_ISPREEMPTABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SwSchedulableResource_AssociationEnd_isStaticSchedulingFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a84b45ff-b606-4d63-bf95-df85fa66ff26")
    public void setSwSchedulableResource_AssociationEnd_isStaticSchedulingFeature(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_AssociationEnd_joinServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1810d1f2-62f9-4074-854f-33db3503ec7f")
    public void setSwSchedulableResource_AssociationEnd_joinServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_JOINSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_AssociationEnd_schedParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("342a6429-752c-4057-9a7e-546c2e3d682f")
    public void setSwSchedulableResource_AssociationEnd_schedParams(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDPARAMS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwSchedulableResource_AssociationEnd_schedulers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c6387b20-9e52-4811-9b6a-48d16e8a338c")
    public void setSwSchedulableResource_AssociationEnd_schedulers(final String value) {
        this.elt.putTagValue(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDULERS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_AssociationEnd_timeSliceElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8acd8ce1-edde-4476-98ea-d2bfcf4302f8")
    public void setSwSchedulableResource_AssociationEnd_timeSliceElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_TIMESLICEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_AssociationEnd_yieldServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4d0a8cd7-0e5e-4da5-b42f-ee2048a0de95")
    public void setSwSchedulableResource_AssociationEnd_yieldServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_YIELDSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("9ca08b75-0fac-4580-8568-f726b16933d3")
    protected SwSchedulableResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("e94099bf-3e04-4466-8f7b-6e9e4981f681")
    public static final class MdaTypes {
        @objid ("d7fc1457-d120-4c63-9112-95b593f08992")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("25e8d9a8-b7dc-4ab1-bf69-43d99ec8d8e4")
        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATIONEND_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT;

        @objid ("898aac10-1068-467f-95d8-7151ce328a20")
        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATIONEND_ISPREEMPTABLE_TAGTYPE_ELT;

        @objid ("eb2e8785-3fbd-418b-95fc-ef376ba0945b")
        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDULERS_TAGTYPE_ELT;

        @objid ("e6775142-e1c8-48a7-a6cb-1c721e299711")
        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DEADLINEELEMENTS_TAGTYPE_ELT;

        @objid ("49c3df56-be84-401d-b9a7-d6a729d04db6")
        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DEADLINETYPEELEMENTS_TAGTYPE_ELT;

        @objid ("7f465190-1df1-41d2-be9d-1bc775dde5c5")
        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATIONEND_TIMESLICEELEMENTS_TAGTYPE_ELT;

        @objid ("9eab769d-cdb8-46d4-8f36-0edf119eef99")
        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DELAYSERVICES_TAGTYPE_ELT;

        @objid ("84069df1-c13d-4fa4-a008-965336df977e")
        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATIONEND_JOINSERVICES_TAGTYPE_ELT;

        @objid ("1b3b69a9-28a7-4702-85ff-a1ad0a0000dc")
        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATIONEND_YIELDSERVICES_TAGTYPE_ELT;

        @objid ("f4f7dec8-3a15-44d3-b238-4779271569b4")
        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDPARAMS_TAGTYPE_ELT;

        @objid ("74de92e8-5a77-45b1-b2f8-5eaf71bb3644")
        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATIONEND_HOST_TAGTYPE_ELT;

        @objid ("3716f7f0-4406-462f-a4fa-c9968caf7245")
        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DEPENDENTSCHEDULER_TAGTYPE_ELT;

        @objid ("2d3274d4-63f6-4513-b50d-e0fffbc3935a")
        private static Stereotype MDAASSOCDEP;

        @objid ("b9173e94-670b-4384-9568-cb07b567130d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("755f1499-3818-4704-8952-c322f6d28a64")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01d79968-0ccf-11df-8525-001302895b2b");
            SWSCHEDULABLERESOURCE_ASSOCIATIONEND_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e3bee305-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ASSOCIATIONEND_ISPREEMPTABLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e3bee306-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDULERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e3bee307-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DEADLINEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e3bee308-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DEADLINETYPEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e3bee309-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ASSOCIATIONEND_TIMESLICEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e3bee30a-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DELAYSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e3bee30b-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ASSOCIATIONEND_JOINSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e3bee30c-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ASSOCIATIONEND_YIELDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e3bee30d-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDPARAMS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "90b8ccd1-92ac-11e0-a69d-0027103f347c");
            SWSCHEDULABLERESOURCE_ASSOCIATIONEND_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "90b8ccd0-92ac-11e0-a69d-0027103f347c");
            SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DEPENDENTSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "90b8cccf-92ac-11e0-a69d-0027103f347c");
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
