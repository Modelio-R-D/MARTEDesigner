/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute;

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
 * Proxy class to handle a {@link Attribute} with << Scheduler_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("95da49e1-7b3d-473a-ae8b-757628d28d8b")
public class SchedulerAttribute extends ResourceAttribute {
    @objid ("a62977ec-0fb9-4170-8317-d334c587f015")
    public static final String STEREOTYPE_NAME = "Scheduler_Attribute";

    @objid ("ce26c68b-cae7-41ad-8b4e-d66d8097c450")
    public static final String SCHEDULER_ATTRIBUTE_HOST_TAGTYPE = "Scheduler_Attribute_host";

    @objid ("ca50420a-c11d-4a54-b121-a98481794ebc")
    public static final String SCHEDULER_ATTRIBUTE_ISPREEMPTIBLE_TAGTYPE = "Scheduler_Attribute_isPreemptible";

    @objid ("c0949bca-e616-400d-9c1b-7168dd76775f")
    public static final String SCHEDULER_ATTRIBUTE_OTHERSCHEDPOLICY_TAGTYPE = "Scheduler_Attribute_otherSchedPolicy";

    @objid ("a3ab6e16-2388-4e54-863d-8b0ad2be7070")
    public static final String SCHEDULER_ATTRIBUTE_PROCESSINGUNITS_TAGTYPE = "Scheduler_Attribute_processingUnits";

    @objid ("c69af116-5eac-493e-81a0-7e48c79ff808")
    public static final String SCHEDULER_ATTRIBUTE_PROTECTEDSHAREDRESOURCES_TAGTYPE = "Scheduler_Attribute_protectedSharedResources";

    @objid ("8af9a0bc-01ed-4ecb-ab56-4be0a610976c")
    public static final String SCHEDULER_ATTRIBUTE_SCHEDPOLICY_TAGTYPE = "Scheduler_Attribute_schedPolicy";

    @objid ("18dec126-011d-4bf1-ac2d-e4d782d15044")
    public static final String SCHEDULER_ATTRIBUTE_SCHEDULABLERESOURCES_TAGTYPE = "Scheduler_Attribute_schedulableResources";

    @objid ("4484a18f-f67e-447c-9ccc-0f7192589a52")
    public static final String SCHEDULER_ATTRIBUTE_SCHEDULE_TAGTYPE = "Scheduler_Attribute_schedule";

    /**
     * Tells whether a {@link SchedulerAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << Scheduler_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("db1c61ef-45e8-4df1-bbdc-5226a5ecf4ff")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SchedulerAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << Scheduler_Attribute >> then instantiate a {@link SchedulerAttribute} proxy.
     * 
     * @return a {@link SchedulerAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("f7cd821a-7f1a-4062-964f-720dd43f3859")
    public static SchedulerAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SchedulerAttribute.STEREOTYPE_NAME);
        return SchedulerAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link SchedulerAttribute} proxy from a {@link Attribute} stereotyped << Scheduler_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link SchedulerAttribute} proxy or <i>null</i>.
     */
    @objid ("d43d5d1f-a832-4f7a-af8b-d4b2677ab227")
    public static SchedulerAttribute instantiate(final Attribute obj) {
        return SchedulerAttribute.canInstantiate(obj) ? new SchedulerAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SchedulerAttribute} proxy from a {@link Attribute} stereotyped << Scheduler_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link SchedulerAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("80f69a1a-37ca-42b7-b63a-508e3b9626e8")
    public static SchedulerAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (SchedulerAttribute.canInstantiate(obj))
        	return new SchedulerAttribute(obj);
        else
        	throw new IllegalArgumentException("SchedulerAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("07595b0c-da19-4db1-b7fc-4f87a1c15999")
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
        SchedulerAttribute other = (SchedulerAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("a3062551-392f-4f5b-a58c-64d2e15711cc")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'Scheduler_Attribute_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8ffc651f-ab6c-4e88-b52f-358d24d6e729")
    public String getScheduler_Attribute_host() {
        return this.elt.getTagValue(SchedulerAttribute.MdaTypes.SCHEDULER_ATTRIBUTE_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Attribute_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e9b7571a-666c-441c-9e10-0e6f108ffe91")
    public String getScheduler_Attribute_otherSchedPolicy() {
        return this.elt.getTagValue(SchedulerAttribute.MdaTypes.SCHEDULER_ATTRIBUTE_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Attribute_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("01b8a850-f0ed-4463-b87b-f06d209700f9")
    public List<String> getScheduler_Attribute_processingUnits() {
        return this.elt.getTagValues(SchedulerAttribute.MdaTypes.SCHEDULER_ATTRIBUTE_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Attribute_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("932b05b0-6d58-4cbc-b424-5888b7a08437")
    public List<String> getScheduler_Attribute_protectedSharedResources() {
        return this.elt.getTagValues(SchedulerAttribute.MdaTypes.SCHEDULER_ATTRIBUTE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Attribute_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4454865d-aa39-4f79-b23a-5ee8dddbd945")
    public String getScheduler_Attribute_schedPolicy() {
        return this.elt.getTagValue(SchedulerAttribute.MdaTypes.SCHEDULER_ATTRIBUTE_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Attribute_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e2d57b4a-36b8-4090-97be-8332d6e54df9")
    public List<String> getScheduler_Attribute_schedulableResources() {
        return this.elt.getTagValues(SchedulerAttribute.MdaTypes.SCHEDULER_ATTRIBUTE_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Attribute_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a95ec7c6-ed72-4139-bbe3-066294bfdfe7")
    public String getScheduler_Attribute_schedule() {
        return this.elt.getTagValue(SchedulerAttribute.MdaTypes.SCHEDULER_ATTRIBUTE_SCHEDULE_TAGTYPE_ELT);
    }

    @objid ("464e4043-2f0f-46da-a0b6-177596ffdfb2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Scheduler_Attribute_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("86eec149-89c6-462c-9402-f22268c0b9cc")
    public boolean isScheduler_Attribute_isPreemptible() {
        return this.elt.isTagged(SchedulerAttribute.MdaTypes.SCHEDULER_ATTRIBUTE_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Scheduler_Attribute_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2041c84e-d377-4aad-a5f9-88648b95b8f9")
    public void setScheduler_Attribute_host(final String value) {
        this.elt.putTagValue(SchedulerAttribute.MdaTypes.SCHEDULER_ATTRIBUTE_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'Scheduler_Attribute_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d9b2e165-d3ed-4206-b297-21b5e4448fcd")
    public void setScheduler_Attribute_isPreemptible(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SchedulerAttribute.MdaTypes.SCHEDULER_ATTRIBUTE_ISPREEMPTIBLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SchedulerAttribute.MdaTypes.SCHEDULER_ATTRIBUTE_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Scheduler_Attribute_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c30bd7c7-496b-4bf4-8ee3-d4e3c76dac95")
    public void setScheduler_Attribute_otherSchedPolicy(final String value) {
        this.elt.putTagValue(SchedulerAttribute.MdaTypes.SCHEDULER_ATTRIBUTE_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Scheduler_Attribute_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3fa78e5a-e5d6-4ff2-a22b-38c0c262fdef")
    public void setScheduler_Attribute_processingUnits(final List<String> values) {
        this.elt.putTagValues(SchedulerAttribute.MdaTypes.SCHEDULER_ATTRIBUTE_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'Scheduler_Attribute_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8eb2b254-426a-4825-86e6-e293c1b55304")
    public void setScheduler_Attribute_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(SchedulerAttribute.MdaTypes.SCHEDULER_ATTRIBUTE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Scheduler_Attribute_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5b7dd9ca-c474-4ffe-87e4-2b2702ee903c")
    public void setScheduler_Attribute_schedPolicy(final String value) {
        this.elt.putTagValue(SchedulerAttribute.MdaTypes.SCHEDULER_ATTRIBUTE_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Scheduler_Attribute_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1ab29833-2fca-4bd6-b0fb-efaa1f94af42")
    public void setScheduler_Attribute_schedulableResources(final List<String> values) {
        this.elt.putTagValues(SchedulerAttribute.MdaTypes.SCHEDULER_ATTRIBUTE_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Scheduler_Attribute_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("124a8be4-0d02-436e-ae6a-7a4b75caf505")
    public void setScheduler_Attribute_schedule(final String value) {
        this.elt.putTagValue(SchedulerAttribute.MdaTypes.SCHEDULER_ATTRIBUTE_SCHEDULE_TAGTYPE_ELT, value);
    }

    @objid ("fc7f5713-13fb-4c23-94d1-48becf4654a1")
    protected SchedulerAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("f85d8006-103f-49ce-b8d6-fa72b4bdb9dd")
    public static final class MdaTypes {
        @objid ("94694bee-cc98-4d11-8a7a-0405dfc73d61")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0774464c-7082-477d-9736-755b65b6f07c")
        public static TagType SCHEDULER_ATTRIBUTE_ISPREEMPTIBLE_TAGTYPE_ELT;

        @objid ("7644594c-357b-4533-a88d-6aa957c08372")
        public static TagType SCHEDULER_ATTRIBUTE_SCHEDPOLICY_TAGTYPE_ELT;

        @objid ("a01dde1b-2f15-41cf-a040-c15a14c46d5e")
        public static TagType SCHEDULER_ATTRIBUTE_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        @objid ("8c124361-daf2-4c3d-9004-19de6472ceef")
        public static TagType SCHEDULER_ATTRIBUTE_SCHEDULE_TAGTYPE_ELT;

        @objid ("1663096b-9ee0-4ac3-bfac-24576b68283f")
        public static TagType SCHEDULER_ATTRIBUTE_PROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("691da0d6-a5ba-4ff1-ba26-78e213b5e295")
        public static TagType SCHEDULER_ATTRIBUTE_HOST_TAGTYPE_ELT;

        @objid ("2b4339de-1713-4e84-86b0-53587523ac50")
        public static TagType SCHEDULER_ATTRIBUTE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        @objid ("497015ba-bf42-4b3d-be1f-b13ef1bcef83")
        public static TagType SCHEDULER_ATTRIBUTE_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        @objid ("c368742c-ccdf-474a-acc7-59be2a500ec8")
        private static Stereotype MDAASSOCDEP;

        @objid ("8b61816c-acef-49bb-84dc-b16b151b20ba")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6a4923e5-6172-49a7-a291-346c2e02860e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0025b31e-0ccf-11df-8525-001302895b2b");
            SCHEDULER_ATTRIBUTE_ISPREEMPTIBLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0025b325-0ccf-11df-8525-001302895b2b");
            SCHEDULER_ATTRIBUTE_SCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00281571-0ccf-11df-8525-001302895b2b");
            SCHEDULER_ATTRIBUTE_OTHERSCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00281578-0ccf-11df-8525-001302895b2b");
            SCHEDULER_ATTRIBUTE_SCHEDULE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0028157f-0ccf-11df-8525-001302895b2b");
            SCHEDULER_ATTRIBUTE_PROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00281586-0ccf-11df-8525-001302895b2b");
            SCHEDULER_ATTRIBUTE_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0028158d-0ccf-11df-8525-001302895b2b");
            SCHEDULER_ATTRIBUTE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00281594-0ccf-11df-8525-001302895b2b");
            SCHEDULER_ATTRIBUTE_SCHEDULABLERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0028159b-0ccf-11df-8525-001302895b2b");
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
