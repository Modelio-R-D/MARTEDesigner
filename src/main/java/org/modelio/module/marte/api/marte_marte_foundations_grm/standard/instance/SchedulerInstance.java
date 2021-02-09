/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
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
 * Proxy class to handle a {@link Instance} with << Scheduler_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SchedulerInstance extends ResourceInstance {
    public static final String STEREOTYPE_NAME = "Scheduler_Instance";

    public static final String SCHEDULER_INSTANCE_HOST_TAGTYPE = "Scheduler_Instance_host";

    public static final String SCHEDULER_INSTANCE_ISPREEMPTIBLE_TAGTYPE = "Scheduler_Instance_isPreemptible";

    public static final String SCHEDULER_INSTANCE_OTHERSCHEDPOLICY_TAGTYPE = "Scheduler_Instance_otherSchedPolicy";

    public static final String SCHEDULER_INSTANCE_PROCESSINGUNITS_TAGTYPE = "Scheduler_Instance_processingUnits";

    public static final String SCHEDULER_INSTANCE_PROTECTEDSHAREDRESOURCES_TAGTYPE = "Scheduler_Instance_protectedSharedResources";

    public static final String SCHEDULER_INSTANCE_SCHEDPOLICY_TAGTYPE = "Scheduler_Instance_schedPolicy";

    public static final String SCHEDULER_INSTANCE_SCHEDULABLERESOURCES_TAGTYPE = "Scheduler_Instance_schedulableResources";

    public static final String SCHEDULER_INSTANCE_SCHEDULE_TAGTYPE = "Scheduler_Instance_schedule";

    /**
     * Tells whether a {@link SchedulerInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << Scheduler_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SchedulerInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << Scheduler_Instance >> then instantiate a {@link SchedulerInstance} proxy.
     * 
     * @return a {@link SchedulerInstance} proxy on the created {@link Instance}.
     */
    public static SchedulerInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SchedulerInstance.STEREOTYPE_NAME);
        return SchedulerInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link SchedulerInstance} proxy from a {@link Instance} stereotyped << Scheduler_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link SchedulerInstance} proxy or <i>null</i>.
     */
    public static SchedulerInstance instantiate(final Instance obj) {
        return SchedulerInstance.canInstantiate(obj) ? new SchedulerInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SchedulerInstance} proxy from a {@link Instance} stereotyped << Scheduler_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link SchedulerInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SchedulerInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SchedulerInstance.canInstantiate(obj))
        	return new SchedulerInstance(obj);
        else
        	throw new IllegalArgumentException("SchedulerInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SchedulerInstance other = (SchedulerInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'Scheduler_Instance_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getScheduler_Instance_host() {
        return this.elt.getTagValue(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Instance_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getScheduler_Instance_otherSchedPolicy() {
        return this.elt.getTagValue(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Instance_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getScheduler_Instance_processingUnits() {
        return this.elt.getTagValues(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Instance_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getScheduler_Instance_protectedSharedResources() {
        return this.elt.getTagValues(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Instance_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getScheduler_Instance_schedPolicy() {
        return this.elt.getTagValue(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Instance_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getScheduler_Instance_schedulableResources() {
        return this.elt.getTagValues(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Instance_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getScheduler_Instance_schedule() {
        return this.elt.getTagValue(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_SCHEDULE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Scheduler_Instance_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isScheduler_Instance_isPreemptible() {
        return this.elt.isTagged(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Scheduler_Instance_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_Instance_host(final String value) {
        this.elt.putTagValue(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'Scheduler_Instance_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_Instance_isPreemptible(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_ISPREEMPTIBLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Scheduler_Instance_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_Instance_otherSchedPolicy(final String value) {
        this.elt.putTagValue(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Scheduler_Instance_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_Instance_processingUnits(final List<String> values) {
        this.elt.putTagValues(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'Scheduler_Instance_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_Instance_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Scheduler_Instance_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_Instance_schedPolicy(final String value) {
        this.elt.putTagValue(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Scheduler_Instance_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_Instance_schedulableResources(final List<String> values) {
        this.elt.putTagValues(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Scheduler_Instance_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_Instance_schedule(final String value) {
        this.elt.putTagValue(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_SCHEDULE_TAGTYPE_ELT, value);
    }

    protected SchedulerInstance(final Instance elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SCHEDULER_INSTANCE_ISPREEMPTIBLE_TAGTYPE_ELT;

        public static TagType SCHEDULER_INSTANCE_SCHEDPOLICY_TAGTYPE_ELT;

        public static TagType SCHEDULER_INSTANCE_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        public static TagType SCHEDULER_INSTANCE_SCHEDULE_TAGTYPE_ELT;

        public static TagType SCHEDULER_INSTANCE_PROCESSINGUNITS_TAGTYPE_ELT;

        public static TagType SCHEDULER_INSTANCE_HOST_TAGTYPE_ELT;

        public static TagType SCHEDULER_INSTANCE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        public static TagType SCHEDULER_INSTANCE_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0025b321-0ccf-11df-8525-001302895b2b");
            SCHEDULER_INSTANCE_ISPREEMPTIBLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0025b328-0ccf-11df-8525-001302895b2b");
            SCHEDULER_INSTANCE_SCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00281574-0ccf-11df-8525-001302895b2b");
            SCHEDULER_INSTANCE_OTHERSCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0028157b-0ccf-11df-8525-001302895b2b");
            SCHEDULER_INSTANCE_SCHEDULE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00281582-0ccf-11df-8525-001302895b2b");
            SCHEDULER_INSTANCE_PROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00281589-0ccf-11df-8525-001302895b2b");
            SCHEDULER_INSTANCE_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00281590-0ccf-11df-8525-001302895b2b");
            SCHEDULER_INSTANCE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00281597-0ccf-11df-8525-001302895b2b");
            SCHEDULER_INSTANCE_SCHEDULABLERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "002a77c2-0ccf-11df-8525-001302895b2b");
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
