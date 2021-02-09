/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link;

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
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << Scheduler_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SchedulerLink extends ResourceLink {
    public static final String STEREOTYPE_NAME = "Scheduler_Link";

    public static final String SCHEDULER_LINK_HOST_TAGTYPE = "Scheduler_Link_host";

    public static final String SCHEDULER_LINK_ISPREEMPTIBLE_TAGTYPE = "Scheduler_Link_isPreemptible";

    public static final String SCHEDULER_LINK_OTHERSCHEDPOLICY_TAGTYPE = "Scheduler_Link_otherSchedPolicy";

    public static final String SCHEDULER_LINK_PROCESSINGUNITS_TAGTYPE = "Scheduler_Link_processingUnits";

    public static final String SCHEDULER_LINK_PROTECTEDSHAREDRESOURCES_TAGTYPE = "Scheduler_Link_protectedSharedResources";

    public static final String SCHEDULER_LINK_SCHEDPOLICY_TAGTYPE = "Scheduler_Link_schedPolicy";

    public static final String SCHEDULER_LINK_SCHEDULABLERESOURCES_TAGTYPE = "Scheduler_Link_schedulableResources";

    public static final String SCHEDULER_LINK_SCHEDULE_TAGTYPE = "Scheduler_Link_schedule";

    /**
     * Tells whether a {@link SchedulerLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << Scheduler_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SchedulerLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << Scheduler_Link >> then instantiate a {@link SchedulerLink} proxy.
     * 
     * @return a {@link SchedulerLink} proxy on the created {@link Link}.
     */
    public static SchedulerLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SchedulerLink.STEREOTYPE_NAME);
        return SchedulerLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link SchedulerLink} proxy from a {@link Link} stereotyped << Scheduler_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link SchedulerLink} proxy or <i>null</i>.
     */
    public static SchedulerLink instantiate(final Link obj) {
        return SchedulerLink.canInstantiate(obj) ? new SchedulerLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SchedulerLink} proxy from a {@link Link} stereotyped << Scheduler_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link SchedulerLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SchedulerLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (SchedulerLink.canInstantiate(obj))
        	return new SchedulerLink(obj);
        else
        	throw new IllegalArgumentException("SchedulerLink: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SchedulerLink other = (SchedulerLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'Scheduler_Link_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getScheduler_Link_host() {
        return this.elt.getTagValue(SchedulerLink.MdaTypes.SCHEDULER_LINK_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Link_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getScheduler_Link_otherSchedPolicy() {
        return this.elt.getTagValue(SchedulerLink.MdaTypes.SCHEDULER_LINK_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Link_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getScheduler_Link_processingUnits() {
        return this.elt.getTagValues(SchedulerLink.MdaTypes.SCHEDULER_LINK_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Link_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getScheduler_Link_protectedSharedResources() {
        return this.elt.getTagValues(SchedulerLink.MdaTypes.SCHEDULER_LINK_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Link_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getScheduler_Link_schedPolicy() {
        return this.elt.getTagValue(SchedulerLink.MdaTypes.SCHEDULER_LINK_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Link_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getScheduler_Link_schedulableResources() {
        return this.elt.getTagValues(SchedulerLink.MdaTypes.SCHEDULER_LINK_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Link_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getScheduler_Link_schedule() {
        return this.elt.getTagValue(SchedulerLink.MdaTypes.SCHEDULER_LINK_SCHEDULE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Scheduler_Link_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isScheduler_Link_isPreemptible() {
        return this.elt.isTagged(SchedulerLink.MdaTypes.SCHEDULER_LINK_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Scheduler_Link_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_Link_host(final String value) {
        this.elt.putTagValue(SchedulerLink.MdaTypes.SCHEDULER_LINK_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'Scheduler_Link_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_Link_isPreemptible(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SchedulerLink.MdaTypes.SCHEDULER_LINK_ISPREEMPTIBLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SchedulerLink.MdaTypes.SCHEDULER_LINK_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Scheduler_Link_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_Link_otherSchedPolicy(final String value) {
        this.elt.putTagValue(SchedulerLink.MdaTypes.SCHEDULER_LINK_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Scheduler_Link_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_Link_processingUnits(final List<String> values) {
        this.elt.putTagValues(SchedulerLink.MdaTypes.SCHEDULER_LINK_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'Scheduler_Link_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_Link_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(SchedulerLink.MdaTypes.SCHEDULER_LINK_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Scheduler_Link_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_Link_schedPolicy(final String value) {
        this.elt.putTagValue(SchedulerLink.MdaTypes.SCHEDULER_LINK_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Scheduler_Link_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_Link_schedulableResources(final List<String> values) {
        this.elt.putTagValues(SchedulerLink.MdaTypes.SCHEDULER_LINK_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Scheduler_Link_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_Link_schedule(final String value) {
        this.elt.putTagValue(SchedulerLink.MdaTypes.SCHEDULER_LINK_SCHEDULE_TAGTYPE_ELT, value);
    }

    protected SchedulerLink(final Link elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SCHEDULER_LINK_ISPREEMPTIBLE_TAGTYPE_ELT;

        public static TagType SCHEDULER_LINK_SCHEDPOLICY_TAGTYPE_ELT;

        public static TagType SCHEDULER_LINK_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        public static TagType SCHEDULER_LINK_SCHEDULE_TAGTYPE_ELT;

        public static TagType SCHEDULER_LINK_PROCESSINGUNITS_TAGTYPE_ELT;

        public static TagType SCHEDULER_LINK_HOST_TAGTYPE_ELT;

        public static TagType SCHEDULER_LINK_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        public static TagType SCHEDULER_LINK_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0025b320-0ccf-11df-8525-001302895b2b");
            SCHEDULER_LINK_ISPREEMPTIBLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0025b327-0ccf-11df-8525-001302895b2b");
            SCHEDULER_LINK_SCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00281573-0ccf-11df-8525-001302895b2b");
            SCHEDULER_LINK_OTHERSCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0028157a-0ccf-11df-8525-001302895b2b");
            SCHEDULER_LINK_SCHEDULE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00281581-0ccf-11df-8525-001302895b2b");
            SCHEDULER_LINK_PROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00281588-0ccf-11df-8525-001302895b2b");
            SCHEDULER_LINK_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0028158f-0ccf-11df-8525-001302895b2b");
            SCHEDULER_LINK_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00281596-0ccf-11df-8525-001302895b2b");
            SCHEDULER_LINK_SCHEDULABLERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "002a77c1-0ccf-11df-8525-001302895b2b");
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
