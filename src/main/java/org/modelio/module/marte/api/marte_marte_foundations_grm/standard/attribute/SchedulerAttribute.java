/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("7959dd53-c8b6-4e0a-8f2c-64dd4196053c")
    public static final String STEREOTYPE_NAME = "Scheduler_Attribute";

    @objid ("b2053fd8-a2fe-4e5a-ac42-f700966821b8")
    public static final String SCHEDULER_ATTRIBUTE_HOST_TAGTYPE = "Scheduler_Attribute_host";

    @objid ("8d30ca80-78d4-44fc-ae09-7e2bb8b25660")
    public static final String SCHEDULER_ATTRIBUTE_ISPREEMPTIBLE_TAGTYPE = "Scheduler_Attribute_isPreemptible";

    @objid ("50415870-7b60-4e0c-9968-131e46de3ecd")
    public static final String SCHEDULER_ATTRIBUTE_OTHERSCHEDPOLICY_TAGTYPE = "Scheduler_Attribute_otherSchedPolicy";

    @objid ("8ddec707-3055-481d-accc-453742988c4d")
    public static final String SCHEDULER_ATTRIBUTE_PROCESSINGUNITS_TAGTYPE = "Scheduler_Attribute_processingUnits";

    @objid ("66cec184-fe28-43c6-82cd-617c5d88968e")
    public static final String SCHEDULER_ATTRIBUTE_PROTECTEDSHAREDRESOURCES_TAGTYPE = "Scheduler_Attribute_protectedSharedResources";

    @objid ("b910f9df-377b-4658-835d-65612888a497")
    public static final String SCHEDULER_ATTRIBUTE_SCHEDPOLICY_TAGTYPE = "Scheduler_Attribute_schedPolicy";

    @objid ("2a3408f2-d375-4abe-9a49-9b5a6b7de28f")
    public static final String SCHEDULER_ATTRIBUTE_SCHEDULABLERESOURCES_TAGTYPE = "Scheduler_Attribute_schedulableResources";

    @objid ("95c8b903-d910-48a6-8def-31658f90e15d")
    public static final String SCHEDULER_ATTRIBUTE_SCHEDULE_TAGTYPE = "Scheduler_Attribute_schedule";

    /**
     * Tells whether a {@link SchedulerAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << Scheduler_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("19c07f30-2574-4ada-92c1-f9f1406d08af")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SchedulerAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << Scheduler_Attribute >> then instantiate a {@link SchedulerAttribute} proxy.
     * 
     * @return a {@link SchedulerAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("2019f154-c447-4d77-bdfc-aeb9c63aec27")
    public static SchedulerAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SchedulerAttribute.STEREOTYPE_NAME);
        return SchedulerAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link SchedulerAttribute} proxy from a {@link Attribute} stereotyped << Scheduler_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link SchedulerAttribute} proxy or <i>null</i>.
     */
    @objid ("3ca0ff34-de05-4180-b704-33556280a2c7")
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
    @objid ("df406972-fb55-49a4-af9d-3c974f9919e2")
    public static SchedulerAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (SchedulerAttribute.canInstantiate(obj))
        	return new SchedulerAttribute(obj);
        else
        	throw new IllegalArgumentException("SchedulerAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a9407a59-40c4-48eb-9b81-113fb620b9e6")
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
    @objid ("1d1cdfa0-8899-4dc4-b0ce-73097c2bc7a9")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'Scheduler_Attribute_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a7419506-98e3-4f0e-b1eb-dfe32f9832af")
    public String getScheduler_Attribute_host() {
        return this.elt.getTagValue(SchedulerAttribute.MdaTypes.SCHEDULER_ATTRIBUTE_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Attribute_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dac8ab1e-7850-4697-915a-8c2ea9daca71")
    public String getScheduler_Attribute_otherSchedPolicy() {
        return this.elt.getTagValue(SchedulerAttribute.MdaTypes.SCHEDULER_ATTRIBUTE_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Attribute_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("69250b8b-da6a-4217-915d-87e925714e30")
    public List<String> getScheduler_Attribute_processingUnits() {
        return this.elt.getTagValues(SchedulerAttribute.MdaTypes.SCHEDULER_ATTRIBUTE_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Attribute_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5b6a314a-2708-4ce3-a505-4954ef837c4b")
    public List<String> getScheduler_Attribute_protectedSharedResources() {
        return this.elt.getTagValues(SchedulerAttribute.MdaTypes.SCHEDULER_ATTRIBUTE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Attribute_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("462b4a78-169a-4e5e-8198-f80101b6cc64")
    public String getScheduler_Attribute_schedPolicy() {
        return this.elt.getTagValue(SchedulerAttribute.MdaTypes.SCHEDULER_ATTRIBUTE_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Attribute_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("914570da-ec6c-427c-9baa-f9e0f80a7522")
    public List<String> getScheduler_Attribute_schedulableResources() {
        return this.elt.getTagValues(SchedulerAttribute.MdaTypes.SCHEDULER_ATTRIBUTE_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Attribute_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0f024c1e-9d3c-4c89-8ca6-cf9111de85db")
    public String getScheduler_Attribute_schedule() {
        return this.elt.getTagValue(SchedulerAttribute.MdaTypes.SCHEDULER_ATTRIBUTE_SCHEDULE_TAGTYPE_ELT);
    }

    @objid ("a84a16c4-6d17-4c61-9978-a7d45f921bc7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Scheduler_Attribute_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dc9fa723-00ce-48fa-8f9e-8c792e0d78e9")
    public boolean isScheduler_Attribute_isPreemptible() {
        return this.elt.isTagged(SchedulerAttribute.MdaTypes.SCHEDULER_ATTRIBUTE_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Scheduler_Attribute_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("eab012c5-3bb4-4c2f-93ee-1abe1f277caf")
    public void setScheduler_Attribute_host(final String value) {
        this.elt.putTagValue(SchedulerAttribute.MdaTypes.SCHEDULER_ATTRIBUTE_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'Scheduler_Attribute_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("60b03ad7-fdbb-4eed-84e0-9efcfb61b5b6")
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
    @objid ("e562cd26-2888-49a3-8757-e8c340169beb")
    public void setScheduler_Attribute_otherSchedPolicy(final String value) {
        this.elt.putTagValue(SchedulerAttribute.MdaTypes.SCHEDULER_ATTRIBUTE_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Scheduler_Attribute_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("168e72c4-37bf-4bd5-a591-8f77a0915062")
    public void setScheduler_Attribute_processingUnits(final List<String> values) {
        this.elt.putTagValues(SchedulerAttribute.MdaTypes.SCHEDULER_ATTRIBUTE_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'Scheduler_Attribute_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("20cb95f9-7e7d-4d2b-a339-7474ea06c5e8")
    public void setScheduler_Attribute_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(SchedulerAttribute.MdaTypes.SCHEDULER_ATTRIBUTE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Scheduler_Attribute_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c71171b8-d081-401a-9bd0-73067d4b7806")
    public void setScheduler_Attribute_schedPolicy(final String value) {
        this.elt.putTagValue(SchedulerAttribute.MdaTypes.SCHEDULER_ATTRIBUTE_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Scheduler_Attribute_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d556efeb-c12a-4de9-9145-080f096d652a")
    public void setScheduler_Attribute_schedulableResources(final List<String> values) {
        this.elt.putTagValues(SchedulerAttribute.MdaTypes.SCHEDULER_ATTRIBUTE_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Scheduler_Attribute_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ab5a5856-3327-42a2-b293-578190d1d8e8")
    public void setScheduler_Attribute_schedule(final String value) {
        this.elt.putTagValue(SchedulerAttribute.MdaTypes.SCHEDULER_ATTRIBUTE_SCHEDULE_TAGTYPE_ELT, value);
    }

    @objid ("e9c6aeea-1c58-4564-9c6f-2dc1c17ba6e1")
    protected SchedulerAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("f85d8006-103f-49ce-b8d6-fa72b4bdb9dd")
    public static final class MdaTypes {
        @objid ("e77581e3-1f58-4dba-8885-86ceaacbe8c3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bf7e4165-27b7-4de1-b296-a481df65aeac")
        public static TagType SCHEDULER_ATTRIBUTE_ISPREEMPTIBLE_TAGTYPE_ELT;

        @objid ("17939df7-0ec5-4ece-bc71-68162e36f798")
        public static TagType SCHEDULER_ATTRIBUTE_SCHEDPOLICY_TAGTYPE_ELT;

        @objid ("338d2918-8bbe-40d6-9d43-037cc6239320")
        public static TagType SCHEDULER_ATTRIBUTE_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        @objid ("e5bcee94-382a-4a82-b632-9158691ed3aa")
        public static TagType SCHEDULER_ATTRIBUTE_SCHEDULE_TAGTYPE_ELT;

        @objid ("ce1411b9-8e32-4069-8850-5ba711864b1f")
        public static TagType SCHEDULER_ATTRIBUTE_PROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("538f7c44-e82e-499e-bf0f-f93ca3ba82de")
        public static TagType SCHEDULER_ATTRIBUTE_HOST_TAGTYPE_ELT;

        @objid ("8955e667-59bb-4be1-b40a-c4d7ce80caca")
        public static TagType SCHEDULER_ATTRIBUTE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        @objid ("64c9c6dc-d226-4276-b8b1-a3d6c62b5ddf")
        public static TagType SCHEDULER_ATTRIBUTE_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        @objid ("a7867ca5-eb5e-4465-9221-fa6ef8db431c")
        private static Stereotype MDAASSOCDEP;

        @objid ("d6efece9-37ef-4c7e-92c9-8a1830a5676d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8abd00df-48e4-44fc-8c6d-25ef4e293b72")
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
