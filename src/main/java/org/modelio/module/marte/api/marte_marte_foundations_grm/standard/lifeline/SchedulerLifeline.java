/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
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
public class SchedulerLifeline extends ResourceLifeline {
    public static final String STEREOTYPE_NAME = "Scheduler_Lifeline";

    public static final String SCHEDULER_LIFELINE_HOST_TAGTYPE = "Scheduler_Lifeline_host";

    public static final String SCHEDULER_LIFELINE_ISPREEMPTIBLE_TAGTYPE = "Scheduler_Lifeline_isPreemptible";

    public static final String SCHEDULER_LIFELINE_OTHERSCHEDPOLICY_TAGTYPE = "Scheduler_Lifeline_otherSchedPolicy";

    public static final String SCHEDULER_LIFELINE_PROCESSINGUNITS_TAGTYPE = "Scheduler_Lifeline_processingUnits";

    public static final String SCHEDULER_LIFELINE_PROTECTEDSHAREDRESOURCES_TAGTYPE = "Scheduler_Lifeline_protectedSharedResources";

    public static final String SCHEDULER_LIFELINE_SCHEDPOLICY_TAGTYPE = "Scheduler_Lifeline_schedPolicy";

    public static final String SCHEDULER_LIFELINE_SCHEDULABLERESOURCES_TAGTYPE = "Scheduler_Lifeline_schedulableResources";

    public static final String SCHEDULER_LIFELINE_SCHEDULE_TAGTYPE = "Scheduler_Lifeline_schedule";

    /**
     * Tells whether a {@link SchedulerLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << Scheduler_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SchedulerLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << Scheduler_Lifeline >> then instantiate a {@link SchedulerLifeline} proxy.
     * 
     * @return a {@link SchedulerLifeline} proxy on the created {@link Lifeline}.
     */
    public static SchedulerLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SchedulerLifeline.STEREOTYPE_NAME);
        return SchedulerLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link SchedulerLifeline} proxy from a {@link Lifeline} stereotyped << Scheduler_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link SchedulerLifeline} proxy or <i>null</i>.
     */
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
    public static SchedulerLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (SchedulerLifeline.canInstantiate(obj))
        	return new SchedulerLifeline(obj);
        else
        	throw new IllegalArgumentException("SchedulerLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'Scheduler_Lifeline_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getScheduler_Lifeline_host() {
        return this.elt.getTagValue(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Lifeline_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getScheduler_Lifeline_otherSchedPolicy() {
        return this.elt.getTagValue(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Lifeline_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getScheduler_Lifeline_processingUnits() {
        return this.elt.getTagValues(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Lifeline_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getScheduler_Lifeline_protectedSharedResources() {
        return this.elt.getTagValues(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Lifeline_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getScheduler_Lifeline_schedPolicy() {
        return this.elt.getTagValue(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Lifeline_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getScheduler_Lifeline_schedulableResources() {
        return this.elt.getTagValues(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Lifeline_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getScheduler_Lifeline_schedule() {
        return this.elt.getTagValue(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_SCHEDULE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Scheduler_Lifeline_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isScheduler_Lifeline_isPreemptible() {
        return this.elt.isTagged(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Scheduler_Lifeline_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_Lifeline_host(final String value) {
        this.elt.putTagValue(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'Scheduler_Lifeline_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
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
    public void setScheduler_Lifeline_otherSchedPolicy(final String value) {
        this.elt.putTagValue(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Scheduler_Lifeline_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_Lifeline_processingUnits(final List<String> values) {
        this.elt.putTagValues(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'Scheduler_Lifeline_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_Lifeline_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Scheduler_Lifeline_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_Lifeline_schedPolicy(final String value) {
        this.elt.putTagValue(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Scheduler_Lifeline_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_Lifeline_schedulableResources(final List<String> values) {
        this.elt.putTagValues(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Scheduler_Lifeline_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_Lifeline_schedule(final String value) {
        this.elt.putTagValue(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_SCHEDULE_TAGTYPE_ELT, value);
    }

    protected SchedulerLifeline(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SCHEDULER_LIFELINE_ISPREEMPTIBLE_TAGTYPE_ELT;

        public static TagType SCHEDULER_LIFELINE_SCHEDPOLICY_TAGTYPE_ELT;

        public static TagType SCHEDULER_LIFELINE_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        public static TagType SCHEDULER_LIFELINE_SCHEDULE_TAGTYPE_ELT;

        public static TagType SCHEDULER_LIFELINE_PROCESSINGUNITS_TAGTYPE_ELT;

        public static TagType SCHEDULER_LIFELINE_HOST_TAGTYPE_ELT;

        public static TagType SCHEDULER_LIFELINE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        public static TagType SCHEDULER_LIFELINE_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
