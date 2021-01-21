/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link;

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
@objid ("f808ce72-3b99-4b35-bb23-3809cd8ebcfb")
public class SchedulerLink extends ResourceLink {
    @objid ("377b6c08-ce6f-4c13-9540-8d4f2624f9c0")
    public static final String STEREOTYPE_NAME = "Scheduler_Link";

    @objid ("1edeea5d-6394-47f9-8baa-e86ea177b1fc")
    public static final String SCHEDULER_LINK_HOST_TAGTYPE = "Scheduler_Link_host";

    @objid ("30e5f76c-fa43-4021-b22e-1cc619f0941c")
    public static final String SCHEDULER_LINK_ISPREEMPTIBLE_TAGTYPE = "Scheduler_Link_isPreemptible";

    @objid ("351e1340-0457-4176-bbd3-629ddb92e2dc")
    public static final String SCHEDULER_LINK_OTHERSCHEDPOLICY_TAGTYPE = "Scheduler_Link_otherSchedPolicy";

    @objid ("59b8ef7c-e4cf-488b-ad95-75066e32899e")
    public static final String SCHEDULER_LINK_PROCESSINGUNITS_TAGTYPE = "Scheduler_Link_processingUnits";

    @objid ("2b891289-e8ab-4360-9870-fb22a8bd6c54")
    public static final String SCHEDULER_LINK_PROTECTEDSHAREDRESOURCES_TAGTYPE = "Scheduler_Link_protectedSharedResources";

    @objid ("bab72039-ab1f-4ee9-a291-13e8a6f95e6e")
    public static final String SCHEDULER_LINK_SCHEDPOLICY_TAGTYPE = "Scheduler_Link_schedPolicy";

    @objid ("684c5067-de05-4c66-acd6-b645bdcbd171")
    public static final String SCHEDULER_LINK_SCHEDULABLERESOURCES_TAGTYPE = "Scheduler_Link_schedulableResources";

    @objid ("c9ad9272-bad4-4042-9c18-ed6fd0fc466b")
    public static final String SCHEDULER_LINK_SCHEDULE_TAGTYPE = "Scheduler_Link_schedule";

    /**
     * Tells whether a {@link SchedulerLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << Scheduler_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("672b9865-d05d-4333-9e6d-ca7ab8f457d3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SchedulerLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << Scheduler_Link >> then instantiate a {@link SchedulerLink} proxy.
     * 
     * @return a {@link SchedulerLink} proxy on the created {@link Link}.
     */
    @objid ("41d6662f-247a-4cb3-8b8c-091b6bed7fc3")
    public static SchedulerLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SchedulerLink.STEREOTYPE_NAME);
        return SchedulerLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link SchedulerLink} proxy from a {@link Link} stereotyped << Scheduler_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link SchedulerLink} proxy or <i>null</i>.
     */
    @objid ("46505003-08cb-4f0a-ae5a-53f9236f0dfc")
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
    @objid ("cf3a3087-298f-4c81-a1a8-4fb311b5a7ce")
    public static SchedulerLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (SchedulerLink.canInstantiate(obj))
        	return new SchedulerLink(obj);
        else
        	throw new IllegalArgumentException("SchedulerLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e3defa7c-727c-443f-a1bd-dd4ae009f13d")
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
    @objid ("3024cd11-8f34-48a4-b7a8-db21f61e5211")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'Scheduler_Link_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("53243e20-20a9-4a2d-9a69-481c4f7510a2")
    public String getScheduler_Link_host() {
        return this.elt.getTagValue(SchedulerLink.MdaTypes.SCHEDULER_LINK_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Link_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("144f9eeb-fcc3-42b6-bd92-798e30822be4")
    public String getScheduler_Link_otherSchedPolicy() {
        return this.elt.getTagValue(SchedulerLink.MdaTypes.SCHEDULER_LINK_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Link_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c55fd141-6886-4914-8841-1094d0ad3d10")
    public List<String> getScheduler_Link_processingUnits() {
        return this.elt.getTagValues(SchedulerLink.MdaTypes.SCHEDULER_LINK_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Link_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("64a0699d-51b9-46f6-8a7b-acdf1024737c")
    public List<String> getScheduler_Link_protectedSharedResources() {
        return this.elt.getTagValues(SchedulerLink.MdaTypes.SCHEDULER_LINK_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Link_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("84d72990-6cb5-44aa-afe2-1dbbb0865a17")
    public String getScheduler_Link_schedPolicy() {
        return this.elt.getTagValue(SchedulerLink.MdaTypes.SCHEDULER_LINK_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Link_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("18a78a85-e921-4e3d-a4ef-4fc3588868c8")
    public List<String> getScheduler_Link_schedulableResources() {
        return this.elt.getTagValues(SchedulerLink.MdaTypes.SCHEDULER_LINK_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Link_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("529befa4-6547-4161-bf73-c74180355a62")
    public String getScheduler_Link_schedule() {
        return this.elt.getTagValue(SchedulerLink.MdaTypes.SCHEDULER_LINK_SCHEDULE_TAGTYPE_ELT);
    }

    @objid ("73db5207-34c9-43e2-bfc2-5ae06ae466e4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Scheduler_Link_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1e5f75b9-fa2d-42ba-982e-03643d80d070")
    public boolean isScheduler_Link_isPreemptible() {
        return this.elt.isTagged(SchedulerLink.MdaTypes.SCHEDULER_LINK_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Scheduler_Link_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f495e8cf-407e-4e6d-884b-9109933bd3ce")
    public void setScheduler_Link_host(final String value) {
        this.elt.putTagValue(SchedulerLink.MdaTypes.SCHEDULER_LINK_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'Scheduler_Link_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("79cac788-258e-4a36-bb16-09be239a9cd8")
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
    @objid ("461b9e30-4714-40d1-85fe-6b6d1adfaedf")
    public void setScheduler_Link_otherSchedPolicy(final String value) {
        this.elt.putTagValue(SchedulerLink.MdaTypes.SCHEDULER_LINK_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Scheduler_Link_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("16e14740-9416-4c6f-b0a7-ce04be97a23e")
    public void setScheduler_Link_processingUnits(final List<String> values) {
        this.elt.putTagValues(SchedulerLink.MdaTypes.SCHEDULER_LINK_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'Scheduler_Link_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("becaf8a9-297e-4b71-8f6d-1ff5769fe26c")
    public void setScheduler_Link_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(SchedulerLink.MdaTypes.SCHEDULER_LINK_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Scheduler_Link_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fa512fb1-add7-4336-83fb-dade4fc550b4")
    public void setScheduler_Link_schedPolicy(final String value) {
        this.elt.putTagValue(SchedulerLink.MdaTypes.SCHEDULER_LINK_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Scheduler_Link_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fc46ca3b-2a6a-4c5d-8745-722def0f5cc8")
    public void setScheduler_Link_schedulableResources(final List<String> values) {
        this.elt.putTagValues(SchedulerLink.MdaTypes.SCHEDULER_LINK_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Scheduler_Link_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6575d791-9c03-4593-a23d-a96a57e35f33")
    public void setScheduler_Link_schedule(final String value) {
        this.elt.putTagValue(SchedulerLink.MdaTypes.SCHEDULER_LINK_SCHEDULE_TAGTYPE_ELT, value);
    }

    @objid ("30d8e6e1-18c5-4d78-93bc-e32fbbaa3701")
    protected SchedulerLink(final Link elt) {
        super(elt);
    }

    @objid ("f720b7f3-b37c-4d50-b001-b66c7288bfd6")
    public static final class MdaTypes {
        @objid ("2b045afd-9f9c-4072-a593-43ac61b46689")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1c2d40b7-4a16-421b-a9f5-9714317c90b2")
        public static TagType SCHEDULER_LINK_ISPREEMPTIBLE_TAGTYPE_ELT;

        @objid ("242eebd2-a55f-496a-aaa4-d0d98b1769ae")
        public static TagType SCHEDULER_LINK_SCHEDPOLICY_TAGTYPE_ELT;

        @objid ("7299f7cc-e1bd-449b-ba59-2265322bd598")
        public static TagType SCHEDULER_LINK_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        @objid ("4a26c02a-3af3-4b3a-bf59-d46e1a3a7673")
        public static TagType SCHEDULER_LINK_SCHEDULE_TAGTYPE_ELT;

        @objid ("15fcb151-1ab8-47a9-a902-e20ff5748492")
        public static TagType SCHEDULER_LINK_PROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("97892b4c-2b8d-498f-b329-c78ba81df873")
        public static TagType SCHEDULER_LINK_HOST_TAGTYPE_ELT;

        @objid ("0b207ddf-33d0-4d58-af3a-2279fce08449")
        public static TagType SCHEDULER_LINK_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        @objid ("eaf57f99-fbc8-45dc-855e-238d594081d3")
        public static TagType SCHEDULER_LINK_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        @objid ("8cb9761c-177a-488b-b11b-d4aac4481040")
        private static Stereotype MDAASSOCDEP;

        @objid ("e2ab2f63-8275-4eba-9669-fe0e6bb7d571")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b16da68a-552f-4b3a-8898-69ff2fd53047")
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
