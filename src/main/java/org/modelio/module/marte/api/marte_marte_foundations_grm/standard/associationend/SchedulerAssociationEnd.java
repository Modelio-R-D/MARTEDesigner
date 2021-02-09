/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << Scheduler_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SchedulerAssociationEnd extends ResourceAssociationEnd {
    public static final String STEREOTYPE_NAME = "Scheduler_AssociationEnd";

    public static final String SCHEDULER_ASSOCIATIONEND_HOST_TAGTYPE = "Scheduler_AssociationEnd_host";

    public static final String SCHEDULER_ASSOCIATIONEND_ISPREEMPTIBLE_TAGTYPE = "Scheduler_AssociationEnd_isPreemptible";

    public static final String SCHEDULER_ASSOCIATIONEND_OTHERSCHEDPOLICY_TAGTYPE = "Scheduler_AssociationEnd_otherSchedPolicy";

    public static final String SCHEDULER_ASSOCIATIONEND_PROCESSINGUNITS_TAGTYPE = "Scheduler_AssociationEnd_processingUnits";

    public static final String SCHEDULER_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES_TAGTYPE = "Scheduler_AssociationEnd_protectedSharedResources";

    public static final String SCHEDULER_ASSOCIATIONEND_SCHEDPOLICY_TAGTYPE = "Scheduler_AssociationEnd_schedPolicy";

    public static final String SCHEDULER_ASSOCIATIONEND_SCHEDULABLERESOURCES_TAGTYPE = "Scheduler_AssociationEnd_schedulableResources";

    public static final String SCHEDULER_ASSOCIATIONEND_SCHEDULE_TAGTYPE = "Scheduler_AssociationEnd_schedule";

    /**
     * Tells whether a {@link SchedulerAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << Scheduler_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SchedulerAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << Scheduler_AssociationEnd >> then instantiate a {@link SchedulerAssociationEnd} proxy.
     * 
     * @return a {@link SchedulerAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    public static SchedulerAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SchedulerAssociationEnd.STEREOTYPE_NAME);
        return SchedulerAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link SchedulerAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << Scheduler_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link SchedulerAssociationEnd} proxy or <i>null</i>.
     */
    public static SchedulerAssociationEnd instantiate(final AssociationEnd obj) {
        return SchedulerAssociationEnd.canInstantiate(obj) ? new SchedulerAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SchedulerAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << Scheduler_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link SchedulerAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SchedulerAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (SchedulerAssociationEnd.canInstantiate(obj))
        	return new SchedulerAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("SchedulerAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SchedulerAssociationEnd other = (SchedulerAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'Scheduler_AssociationEnd_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getScheduler_AssociationEnd_host() {
        return this.elt.getTagValue(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_AssociationEnd_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getScheduler_AssociationEnd_otherSchedPolicy() {
        return this.elt.getTagValue(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_AssociationEnd_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getScheduler_AssociationEnd_processingUnits() {
        return this.elt.getTagValues(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_AssociationEnd_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getScheduler_AssociationEnd_protectedSharedResources() {
        return this.elt.getTagValues(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_AssociationEnd_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getScheduler_AssociationEnd_schedPolicy() {
        return this.elt.getTagValue(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_AssociationEnd_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getScheduler_AssociationEnd_schedulableResources() {
        return this.elt.getTagValues(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_AssociationEnd_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getScheduler_AssociationEnd_schedule() {
        return this.elt.getTagValue(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_SCHEDULE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Scheduler_AssociationEnd_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isScheduler_AssociationEnd_isPreemptible() {
        return this.elt.isTagged(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Scheduler_AssociationEnd_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_AssociationEnd_host(final String value) {
        this.elt.putTagValue(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'Scheduler_AssociationEnd_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_AssociationEnd_isPreemptible(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_ISPREEMPTIBLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Scheduler_AssociationEnd_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_AssociationEnd_otherSchedPolicy(final String value) {
        this.elt.putTagValue(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Scheduler_AssociationEnd_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_AssociationEnd_processingUnits(final List<String> values) {
        this.elt.putTagValues(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'Scheduler_AssociationEnd_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_AssociationEnd_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Scheduler_AssociationEnd_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_AssociationEnd_schedPolicy(final String value) {
        this.elt.putTagValue(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Scheduler_AssociationEnd_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_AssociationEnd_schedulableResources(final List<String> values) {
        this.elt.putTagValues(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Scheduler_AssociationEnd_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_AssociationEnd_schedule(final String value) {
        this.elt.putTagValue(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_SCHEDULE_TAGTYPE_ELT, value);
    }

    protected SchedulerAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SCHEDULER_ASSOCIATIONEND_ISPREEMPTIBLE_TAGTYPE_ELT;

        public static TagType SCHEDULER_ASSOCIATIONEND_SCHEDPOLICY_TAGTYPE_ELT;

        public static TagType SCHEDULER_ASSOCIATIONEND_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        public static TagType SCHEDULER_ASSOCIATIONEND_SCHEDULE_TAGTYPE_ELT;

        public static TagType SCHEDULER_ASSOCIATIONEND_PROCESSINGUNITS_TAGTYPE_ELT;

        public static TagType SCHEDULER_ASSOCIATIONEND_HOST_TAGTYPE_ELT;

        public static TagType SCHEDULER_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        public static TagType SCHEDULER_ASSOCIATIONEND_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0025b31c-0ccf-11df-8525-001302895b2b");
            SCHEDULER_ASSOCIATIONEND_ISPREEMPTIBLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0025b323-0ccf-11df-8525-001302895b2b");
            SCHEDULER_ASSOCIATIONEND_SCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0028156f-0ccf-11df-8525-001302895b2b");
            SCHEDULER_ASSOCIATIONEND_OTHERSCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00281576-0ccf-11df-8525-001302895b2b");
            SCHEDULER_ASSOCIATIONEND_SCHEDULE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0028157d-0ccf-11df-8525-001302895b2b");
            SCHEDULER_ASSOCIATIONEND_PROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00281584-0ccf-11df-8525-001302895b2b");
            SCHEDULER_ASSOCIATIONEND_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0028158b-0ccf-11df-8525-001302895b2b");
            SCHEDULER_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00281592-0ccf-11df-8525-001302895b2b");
            SCHEDULER_ASSOCIATIONEND_SCHEDULABLERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00281599-0ccf-11df-8525-001302895b2b");
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
