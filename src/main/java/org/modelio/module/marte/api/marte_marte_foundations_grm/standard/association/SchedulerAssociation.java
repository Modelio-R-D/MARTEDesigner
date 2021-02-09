/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << Scheduler_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SchedulerAssociation extends ResourceAssociation {
    public static final String STEREOTYPE_NAME = "Scheduler_Association";

    public static final String SCHEDULER_ASSOCIATION_HOST_TAGTYPE = "Scheduler_Association_host";

    public static final String SCHEDULER_ASSOCIATION_ISPREEMPTIBLE_TAGTYPE = "Scheduler_Association_isPreemptible";

    public static final String SCHEDULER_ASSOCIATION_OTHERSCHEDPOLICY_TAGTYPE = "Scheduler_Association_otherSchedPolicy";

    public static final String SCHEDULER_ASSOCIATION_PROCESSINGUNITS_TAGTYPE = "Scheduler_Association_processingUnits";

    public static final String SCHEDULER_ASSOCIATION_PROTECTEDSHAREDRESOURCES_TAGTYPE = "Scheduler_Association_protectedSharedResources";

    public static final String SCHEDULER_ASSOCIATION_SCHEDPOLICY_TAGTYPE = "Scheduler_Association_schedPolicy";

    public static final String SCHEDULER_ASSOCIATION_SCHEDULABLERESOURCES_TAGTYPE = "Scheduler_Association_schedulableResources";

    public static final String SCHEDULER_ASSOCIATION_SCHEDULE_TAGTYPE = "Scheduler_Association_schedule";

    /**
     * Tells whether a {@link SchedulerAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << Scheduler_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SchedulerAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << Scheduler_Association >> then instantiate a {@link SchedulerAssociation} proxy.
     * 
     * @return a {@link SchedulerAssociation} proxy on the created {@link Association}.
     */
    public static SchedulerAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SchedulerAssociation.STEREOTYPE_NAME);
        return SchedulerAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link SchedulerAssociation} proxy from a {@link Association} stereotyped << Scheduler_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link SchedulerAssociation} proxy or <i>null</i>.
     */
    public static SchedulerAssociation instantiate(final Association obj) {
        return SchedulerAssociation.canInstantiate(obj) ? new SchedulerAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SchedulerAssociation} proxy from a {@link Association} stereotyped << Scheduler_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link SchedulerAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SchedulerAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (SchedulerAssociation.canInstantiate(obj))
        	return new SchedulerAssociation(obj);
        else
        	throw new IllegalArgumentException("SchedulerAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SchedulerAssociation other = (SchedulerAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'Scheduler_Association_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getScheduler_Association_host() {
        return this.elt.getTagValue(SchedulerAssociation.MdaTypes.SCHEDULER_ASSOCIATION_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Association_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getScheduler_Association_otherSchedPolicy() {
        return this.elt.getTagValue(SchedulerAssociation.MdaTypes.SCHEDULER_ASSOCIATION_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Association_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getScheduler_Association_processingUnits() {
        return this.elt.getTagValues(SchedulerAssociation.MdaTypes.SCHEDULER_ASSOCIATION_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Association_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getScheduler_Association_protectedSharedResources() {
        return this.elt.getTagValues(SchedulerAssociation.MdaTypes.SCHEDULER_ASSOCIATION_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Association_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getScheduler_Association_schedPolicy() {
        return this.elt.getTagValue(SchedulerAssociation.MdaTypes.SCHEDULER_ASSOCIATION_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Association_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getScheduler_Association_schedulableResources() {
        return this.elt.getTagValues(SchedulerAssociation.MdaTypes.SCHEDULER_ASSOCIATION_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Association_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getScheduler_Association_schedule() {
        return this.elt.getTagValue(SchedulerAssociation.MdaTypes.SCHEDULER_ASSOCIATION_SCHEDULE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Scheduler_Association_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isScheduler_Association_isPreemptible() {
        return this.elt.isTagged(SchedulerAssociation.MdaTypes.SCHEDULER_ASSOCIATION_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Scheduler_Association_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_Association_host(final String value) {
        this.elt.putTagValue(SchedulerAssociation.MdaTypes.SCHEDULER_ASSOCIATION_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'Scheduler_Association_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_Association_isPreemptible(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SchedulerAssociation.MdaTypes.SCHEDULER_ASSOCIATION_ISPREEMPTIBLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SchedulerAssociation.MdaTypes.SCHEDULER_ASSOCIATION_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Scheduler_Association_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_Association_otherSchedPolicy(final String value) {
        this.elt.putTagValue(SchedulerAssociation.MdaTypes.SCHEDULER_ASSOCIATION_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Scheduler_Association_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_Association_processingUnits(final List<String> values) {
        this.elt.putTagValues(SchedulerAssociation.MdaTypes.SCHEDULER_ASSOCIATION_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'Scheduler_Association_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_Association_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(SchedulerAssociation.MdaTypes.SCHEDULER_ASSOCIATION_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Scheduler_Association_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_Association_schedPolicy(final String value) {
        this.elt.putTagValue(SchedulerAssociation.MdaTypes.SCHEDULER_ASSOCIATION_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Scheduler_Association_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_Association_schedulableResources(final List<String> values) {
        this.elt.putTagValues(SchedulerAssociation.MdaTypes.SCHEDULER_ASSOCIATION_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Scheduler_Association_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_Association_schedule(final String value) {
        this.elt.putTagValue(SchedulerAssociation.MdaTypes.SCHEDULER_ASSOCIATION_SCHEDULE_TAGTYPE_ELT, value);
    }

    protected SchedulerAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SCHEDULER_ASSOCIATION_ISPREEMPTIBLE_TAGTYPE_ELT;

        public static TagType SCHEDULER_ASSOCIATION_SCHEDPOLICY_TAGTYPE_ELT;

        public static TagType SCHEDULER_ASSOCIATION_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        public static TagType SCHEDULER_ASSOCIATION_SCHEDULE_TAGTYPE_ELT;

        public static TagType SCHEDULER_ASSOCIATION_PROCESSINGUNITS_TAGTYPE_ELT;

        public static TagType SCHEDULER_ASSOCIATION_HOST_TAGTYPE_ELT;

        public static TagType SCHEDULER_ASSOCIATION_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        public static TagType SCHEDULER_ASSOCIATION_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "9a8f3c07-1017-11df-86fe-0014222a9f79");
            SCHEDULER_ASSOCIATION_ISPREEMPTIBLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ce768e98-1017-11df-86fe-0014222a9f79");
            SCHEDULER_ASSOCIATION_SCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ce768e99-1017-11df-86fe-0014222a9f79");
            SCHEDULER_ASSOCIATION_OTHERSCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ce768e9a-1017-11df-86fe-0014222a9f79");
            SCHEDULER_ASSOCIATION_SCHEDULE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ce768e9b-1017-11df-86fe-0014222a9f79");
            SCHEDULER_ASSOCIATION_PROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ce768e9c-1017-11df-86fe-0014222a9f79");
            SCHEDULER_ASSOCIATION_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ce768e9d-1017-11df-86fe-0014222a9f79");
            SCHEDULER_ASSOCIATION_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ce768e9e-1017-11df-86fe-0014222a9f79");
            SCHEDULER_ASSOCIATION_SCHEDULABLERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ce768e9f-1017-11df-86fe-0014222a9f79");
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
