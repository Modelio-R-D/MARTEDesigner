/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline;

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
 * Proxy class to handle a {@link Lifeline} with << Scheduler_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f7ac3c71-cf6b-47fc-892f-562329557a1e")
public class SchedulerLifeline extends ResourceLifeline {
    @objid ("6a258470-6c91-493c-8e71-2f1e84bfaa0e")
    public static final String STEREOTYPE_NAME = "Scheduler_Lifeline";

    @objid ("a40e808b-4839-436c-b3d2-ad027ea158bf")
    public static final String SCHEDULER_LIFELINE_HOST_TAGTYPE = "Scheduler_Lifeline_host";

    @objid ("16b7c17a-99c0-4688-bff3-c0ff560e43dc")
    public static final String SCHEDULER_LIFELINE_ISPREEMPTIBLE_TAGTYPE = "Scheduler_Lifeline_isPreemptible";

    @objid ("a4c75392-e5a3-409c-a446-329c8098b158")
    public static final String SCHEDULER_LIFELINE_OTHERSCHEDPOLICY_TAGTYPE = "Scheduler_Lifeline_otherSchedPolicy";

    @objid ("e7ab95ed-f22b-4836-9647-2e4999d03d2f")
    public static final String SCHEDULER_LIFELINE_PROCESSINGUNITS_TAGTYPE = "Scheduler_Lifeline_processingUnits";

    @objid ("9daaedf5-f72d-4aed-b744-65d61e12254f")
    public static final String SCHEDULER_LIFELINE_PROTECTEDSHAREDRESOURCES_TAGTYPE = "Scheduler_Lifeline_protectedSharedResources";

    @objid ("ee5e7711-c2c9-4e0f-9518-b35874d9183c")
    public static final String SCHEDULER_LIFELINE_SCHEDPOLICY_TAGTYPE = "Scheduler_Lifeline_schedPolicy";

    @objid ("132b9fbe-90c1-42b6-8477-75081705d27f")
    public static final String SCHEDULER_LIFELINE_SCHEDULABLERESOURCES_TAGTYPE = "Scheduler_Lifeline_schedulableResources";

    @objid ("9645cd2c-765e-4280-841c-2145d6376b27")
    public static final String SCHEDULER_LIFELINE_SCHEDULE_TAGTYPE = "Scheduler_Lifeline_schedule";

    /**
     * Tells whether a {@link SchedulerLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << Scheduler_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("1e1ab3f2-a5ca-4faa-a538-27e0e5465d7d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SchedulerLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << Scheduler_Lifeline >> then instantiate a {@link SchedulerLifeline} proxy.
     * 
     * @return a {@link SchedulerLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("a8ae44d3-a522-4453-bb6c-0bed3ae9ce0d")
    public static SchedulerLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SchedulerLifeline.STEREOTYPE_NAME);
        return SchedulerLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link SchedulerLifeline} proxy from a {@link Lifeline} stereotyped << Scheduler_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link SchedulerLifeline} proxy or <i>null</i>.
     */
    @objid ("403fa564-22ad-468d-b6fe-7badd9151710")
    public static SchedulerLifeline instantiate(final Lifeline obj) {
        return SchedulerLifeline.canInstantiate(obj) ? new SchedulerLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SchedulerLifeline} proxy from a {@link Lifeline} stereotyped << Scheduler_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link SchedulerLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("23c346f4-582a-416e-a1a4-35f3d475cc5a")
    public static SchedulerLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (SchedulerLifeline.canInstantiate(obj))
        	return new SchedulerLifeline(obj);
        else
        	throw new IllegalArgumentException("SchedulerLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d3a400e2-0cf6-4ea3-88a1-7ef1a0517141")
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
        SchedulerLifeline other = (SchedulerLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("26d1afa8-4aed-4c21-87a7-64bfb67c16c8")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'Scheduler_Lifeline_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("40e01c3e-1d15-4ce4-b444-22200fbe6049")
    public String getScheduler_Lifeline_host() {
        return this.elt.getTagValue(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Lifeline_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b9d932a8-86f6-4d3e-8cd7-315afcf10786")
    public String getScheduler_Lifeline_otherSchedPolicy() {
        return this.elt.getTagValue(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Lifeline_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("948cf38b-1483-46ce-9b2f-35b64cd98513")
    public List<String> getScheduler_Lifeline_processingUnits() {
        return this.elt.getTagValues(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Lifeline_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9dace465-99a6-44bf-8a70-fed3faee25ab")
    public List<String> getScheduler_Lifeline_protectedSharedResources() {
        return this.elt.getTagValues(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Lifeline_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("eef932fb-a377-4697-b408-edb24cb40be0")
    public String getScheduler_Lifeline_schedPolicy() {
        return this.elt.getTagValue(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Lifeline_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4ce1eb44-2432-42fa-a16b-672f0b4d72a0")
    public List<String> getScheduler_Lifeline_schedulableResources() {
        return this.elt.getTagValues(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Lifeline_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3ca1d777-d9cb-4339-b8b3-50a5c6fb3394")
    public String getScheduler_Lifeline_schedule() {
        return this.elt.getTagValue(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_SCHEDULE_TAGTYPE_ELT);
    }

    @objid ("c6df60b8-396c-4def-bead-8c8a45335aba")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Scheduler_Lifeline_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fcbcbb6a-a633-4d79-9818-4ca66d5c9b45")
    public boolean isScheduler_Lifeline_isPreemptible() {
        return this.elt.isTagged(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Scheduler_Lifeline_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("98e2842a-a9e1-45ec-a4d0-72c61991c6bb")
    public void setScheduler_Lifeline_host(final String value) {
        this.elt.putTagValue(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'Scheduler_Lifeline_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("61ca6836-954f-450d-96f6-d902c4fae26e")
    public void setScheduler_Lifeline_isPreemptible(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_ISPREEMPTIBLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Scheduler_Lifeline_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3233c726-72c6-4c9f-92b5-8e97b37b0680")
    public void setScheduler_Lifeline_otherSchedPolicy(final String value) {
        this.elt.putTagValue(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Scheduler_Lifeline_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("48ecf74a-75d5-49fb-9c3a-78bb3aebc2de")
    public void setScheduler_Lifeline_processingUnits(final List<String> values) {
        this.elt.putTagValues(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'Scheduler_Lifeline_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1b2c5fa0-14bb-4e73-891b-90d5957e17af")
    public void setScheduler_Lifeline_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Scheduler_Lifeline_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d331383f-f69c-4ed7-9015-d55c8d89765b")
    public void setScheduler_Lifeline_schedPolicy(final String value) {
        this.elt.putTagValue(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Scheduler_Lifeline_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("87d7736f-b978-49f0-be80-5bab371c3ca8")
    public void setScheduler_Lifeline_schedulableResources(final List<String> values) {
        this.elt.putTagValues(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Scheduler_Lifeline_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cf6bfb14-d18e-4346-9f95-d23816a10d1f")
    public void setScheduler_Lifeline_schedule(final String value) {
        this.elt.putTagValue(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_SCHEDULE_TAGTYPE_ELT, value);
    }

    @objid ("aee95d65-214b-460f-a203-69ca9431ef98")
    protected SchedulerLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("a11a11cd-2d5b-45bc-9895-2806a98e095f")
    public static final class MdaTypes {
        @objid ("7e731a2e-b7e2-4f77-ad16-b16836912d4e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b49f5ffd-02b8-4779-bd39-db33ac7496fe")
        public static TagType SCHEDULER_LIFELINE_ISPREEMPTIBLE_TAGTYPE_ELT;

        @objid ("51bd893e-8b97-4aa5-8720-242e806f04d5")
        public static TagType SCHEDULER_LIFELINE_SCHEDPOLICY_TAGTYPE_ELT;

        @objid ("66382b9f-dac7-432e-a0bf-8dc4468be6a2")
        public static TagType SCHEDULER_LIFELINE_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        @objid ("05ad3cff-ccbe-4595-9370-1e4c0eee9f9b")
        public static TagType SCHEDULER_LIFELINE_SCHEDULE_TAGTYPE_ELT;

        @objid ("fbc999f1-901c-4c38-9c88-826486dd4ed3")
        public static TagType SCHEDULER_LIFELINE_PROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("5ef5a168-b86c-400b-8fbd-d5f4197ff04d")
        public static TagType SCHEDULER_LIFELINE_HOST_TAGTYPE_ELT;

        @objid ("3328bb81-4a9e-494d-97e5-4321b8093812")
        public static TagType SCHEDULER_LIFELINE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        @objid ("2bba4937-d649-46d9-9db4-5c0bfebf27a0")
        public static TagType SCHEDULER_LIFELINE_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        @objid ("4175a4a2-35f4-4966-92dc-5304e98c37a3")
        private static Stereotype MDAASSOCDEP;

        @objid ("c0559fae-7e35-47ac-b6f1-ff0087c049ae")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("de708f3b-869f-4a8c-beeb-bd4ff713cfd0")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "a2e9e3e4-1017-11df-86fe-0014222a9f79");
            SCHEDULER_LIFELINE_ISPREEMPTIBLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cfc1f717-1017-11df-86fe-0014222a9f79");
            SCHEDULER_LIFELINE_SCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cfc1f718-1017-11df-86fe-0014222a9f79");
            SCHEDULER_LIFELINE_OTHERSCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cfc1f719-1017-11df-86fe-0014222a9f79");
            SCHEDULER_LIFELINE_SCHEDULE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cfc1f71a-1017-11df-86fe-0014222a9f79");
            SCHEDULER_LIFELINE_PROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cfc1f71b-1017-11df-86fe-0014222a9f79");
            SCHEDULER_LIFELINE_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cfc1f71c-1017-11df-86fe-0014222a9f79");
            SCHEDULER_LIFELINE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cfc1f71d-1017-11df-86fe-0014222a9f79");
            SCHEDULER_LIFELINE_SCHEDULABLERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cfc1f71e-1017-11df-86fe-0014222a9f79");
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
