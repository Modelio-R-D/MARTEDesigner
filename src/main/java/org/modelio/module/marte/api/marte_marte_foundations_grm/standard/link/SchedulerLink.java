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
    @objid ("d4c0cc28-0b86-4f5e-9433-555752ed78e0")
    public static final String STEREOTYPE_NAME = "Scheduler_Link";

    @objid ("48d855b8-152b-42f7-9128-62ca2ede3c76")
    public static final String SCHEDULER_LINK_HOST_TAGTYPE = "Scheduler_Link_host";

    @objid ("2e44f7c6-afaa-46ce-88c2-08c815cb1f15")
    public static final String SCHEDULER_LINK_ISPREEMPTIBLE_TAGTYPE = "Scheduler_Link_isPreemptible";

    @objid ("04993c5a-bbe0-4a01-ba90-e7ef9cc54799")
    public static final String SCHEDULER_LINK_OTHERSCHEDPOLICY_TAGTYPE = "Scheduler_Link_otherSchedPolicy";

    @objid ("84ff1704-1cbb-4e96-b5c4-cb0bdbf03022")
    public static final String SCHEDULER_LINK_PROCESSINGUNITS_TAGTYPE = "Scheduler_Link_processingUnits";

    @objid ("ceb72837-d989-4490-8512-e515b3634ddc")
    public static final String SCHEDULER_LINK_PROTECTEDSHAREDRESOURCES_TAGTYPE = "Scheduler_Link_protectedSharedResources";

    @objid ("3bbb63ed-988d-45b8-9993-abc63018e834")
    public static final String SCHEDULER_LINK_SCHEDPOLICY_TAGTYPE = "Scheduler_Link_schedPolicy";

    @objid ("c37399e8-0ef4-437b-827f-d4e92ce43a17")
    public static final String SCHEDULER_LINK_SCHEDULABLERESOURCES_TAGTYPE = "Scheduler_Link_schedulableResources";

    @objid ("b8bdab39-09f1-41cb-b921-eff8b2ef03d4")
    public static final String SCHEDULER_LINK_SCHEDULE_TAGTYPE = "Scheduler_Link_schedule";

    /**
     * Tells whether a {@link SchedulerLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << Scheduler_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a7f5df0f-44b0-4812-88e6-6ff254b582c2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SchedulerLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << Scheduler_Link >> then instantiate a {@link SchedulerLink} proxy.
     * 
     * @return a {@link SchedulerLink} proxy on the created {@link Link}.
     */
    @objid ("e634a43a-1d28-431b-8665-b8c899b8a52e")
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
    @objid ("4f734137-048c-42a4-a94f-7813707cba80")
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
    @objid ("53164994-7b38-49c0-9b66-480ad40385a8")
    public static SchedulerLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (SchedulerLink.canInstantiate(obj))
        	return new SchedulerLink(obj);
        else
        	throw new IllegalArgumentException("SchedulerLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5721ff6f-2875-4316-a712-432128140af0")
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
    @objid ("7c0adb24-733c-49d0-aec9-49ec7a98acb8")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'Scheduler_Link_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a9a772b4-8281-472d-a706-74c3d9db4076")
    public String getScheduler_Link_host() {
        return this.elt.getTagValue(SchedulerLink.MdaTypes.SCHEDULER_LINK_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Link_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8947bc0b-2e11-46ef-816b-34863abde2fe")
    public String getScheduler_Link_otherSchedPolicy() {
        return this.elt.getTagValue(SchedulerLink.MdaTypes.SCHEDULER_LINK_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Link_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e103753d-cb47-4d4d-bd35-12594c935149")
    public List<String> getScheduler_Link_processingUnits() {
        return this.elt.getTagValues(SchedulerLink.MdaTypes.SCHEDULER_LINK_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Link_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d9403815-55ec-41a5-9b5e-5bac9a5b8ed0")
    public List<String> getScheduler_Link_protectedSharedResources() {
        return this.elt.getTagValues(SchedulerLink.MdaTypes.SCHEDULER_LINK_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Link_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("918dbed6-466d-4595-86d2-c5d2ef6f68b9")
    public String getScheduler_Link_schedPolicy() {
        return this.elt.getTagValue(SchedulerLink.MdaTypes.SCHEDULER_LINK_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Link_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("7f596259-4b1f-4aba-90ed-0cc26ac7e472")
    public List<String> getScheduler_Link_schedulableResources() {
        return this.elt.getTagValues(SchedulerLink.MdaTypes.SCHEDULER_LINK_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Link_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fdb203d2-acff-432b-8b11-21fd2fda3e59")
    public String getScheduler_Link_schedule() {
        return this.elt.getTagValue(SchedulerLink.MdaTypes.SCHEDULER_LINK_SCHEDULE_TAGTYPE_ELT);
    }

    @objid ("c28ae152-a0a0-4b67-aed9-4cd87f458e05")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Scheduler_Link_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cf487592-e70a-4ade-b2d9-999b905c1eb5")
    public boolean isScheduler_Link_isPreemptible() {
        return this.elt.isTagged(SchedulerLink.MdaTypes.SCHEDULER_LINK_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Scheduler_Link_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("461f0b68-4a4e-4d0f-a637-36edce3578ea")
    public void setScheduler_Link_host(final String value) {
        this.elt.putTagValue(SchedulerLink.MdaTypes.SCHEDULER_LINK_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'Scheduler_Link_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9804ae0f-e421-4b0c-9e4c-835e17cc89ac")
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
    @objid ("fcba8ab3-09f4-400e-b263-73f370b2ebb1")
    public void setScheduler_Link_otherSchedPolicy(final String value) {
        this.elt.putTagValue(SchedulerLink.MdaTypes.SCHEDULER_LINK_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Scheduler_Link_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("79a0d721-e874-4325-8b59-43e570f3aace")
    public void setScheduler_Link_processingUnits(final List<String> values) {
        this.elt.putTagValues(SchedulerLink.MdaTypes.SCHEDULER_LINK_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'Scheduler_Link_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("973cbc2a-8dab-4aa9-af78-2f47010ad0d5")
    public void setScheduler_Link_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(SchedulerLink.MdaTypes.SCHEDULER_LINK_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Scheduler_Link_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("def43d92-eb68-41ee-be94-d21dc40c92ef")
    public void setScheduler_Link_schedPolicy(final String value) {
        this.elt.putTagValue(SchedulerLink.MdaTypes.SCHEDULER_LINK_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Scheduler_Link_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9714c05f-7628-4b7f-a13c-58f4614ebe50")
    public void setScheduler_Link_schedulableResources(final List<String> values) {
        this.elt.putTagValues(SchedulerLink.MdaTypes.SCHEDULER_LINK_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Scheduler_Link_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0acea0a7-861d-44b0-8771-1812198c2a3c")
    public void setScheduler_Link_schedule(final String value) {
        this.elt.putTagValue(SchedulerLink.MdaTypes.SCHEDULER_LINK_SCHEDULE_TAGTYPE_ELT, value);
    }

    @objid ("aae5994e-ae6c-417a-8c97-896ae018151f")
    protected SchedulerLink(final Link elt) {
        super(elt);
    }

    @objid ("f720b7f3-b37c-4d50-b001-b66c7288bfd6")
    public static final class MdaTypes {
        @objid ("d17fb103-c03c-41f7-a5e4-3d8c81cbd5e6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("155684db-115d-431f-8d9b-d47088e00149")
        public static TagType SCHEDULER_LINK_ISPREEMPTIBLE_TAGTYPE_ELT;

        @objid ("b088552c-a9de-4dca-a82d-f541655bd090")
        public static TagType SCHEDULER_LINK_SCHEDPOLICY_TAGTYPE_ELT;

        @objid ("be533df3-c9bf-43e7-aa43-cbc1dd8a1ca5")
        public static TagType SCHEDULER_LINK_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        @objid ("abda1e48-2604-45cc-a2ea-4895eca1092e")
        public static TagType SCHEDULER_LINK_SCHEDULE_TAGTYPE_ELT;

        @objid ("ecdd3098-a73d-4bb9-83eb-dd78fc1788cf")
        public static TagType SCHEDULER_LINK_PROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("86b42b1e-5477-4a91-894c-01cb0c8799e8")
        public static TagType SCHEDULER_LINK_HOST_TAGTYPE_ELT;

        @objid ("021c3b8d-9f63-461a-aaa9-256627ca6186")
        public static TagType SCHEDULER_LINK_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        @objid ("de35e218-c181-44d2-aa84-1edab5b0132d")
        public static TagType SCHEDULER_LINK_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        @objid ("c7249cd9-c339-4463-ad74-01febaf9e51d")
        private static Stereotype MDAASSOCDEP;

        @objid ("6e1c03f0-6173-4168-a3a6-fe142ab352f7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7493d251-1610-4b2e-b982-a69334d0748b")
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
