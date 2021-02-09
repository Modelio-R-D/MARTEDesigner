/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.link;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.ComputingResourceLink;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << GaExecHost_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class GaExecHostLink extends ComputingResourceLink {
    public static final String STEREOTYPE_NAME = "GaExecHost_Link";

    public static final String GAEXECHOST_LINK_CLOCKOVH_TAGTYPE = "GaExecHost_Link_clockOvh";

    public static final String GAEXECHOST_LINK_CNTXTSWT_TAGTYPE = "GaExecHost_Link_cntxtSwT";

    public static final String GAEXECHOST_LINK_COMMRCVOVH_TAGTYPE = "GaExecHost_Link_commRcvOvh";

    public static final String GAEXECHOST_LINK_COMMTXOVH_TAGTYPE = "GaExecHost_Link_commTxOvh";

    public static final String GAEXECHOST_LINK_HOST_TAGTYPE = "GaExecHost_Link_host";

    public static final String GAEXECHOST_LINK_ISPREEMPTIBLE_TAGTYPE = "GaExecHost_Link_isPreemptible";

    public static final String GAEXECHOST_LINK_MEMSIZE_TAGTYPE = "GaExecHost_Link_memSize";

    public static final String GAEXECHOST_LINK_OTHERSCHEDPOLICY_TAGTYPE = "GaExecHost_Link_otherSchedPolicy";

    public static final String GAEXECHOST_LINK_PROCESSINGUNITS_TAGTYPE = "GaExecHost_Link_processingUnits";

    public static final String GAEXECHOST_LINK_PROTECTEDSHAREDRESOURCES_TAGTYPE = "GaExecHost_Link_protectedSharedResources";

    public static final String GAEXECHOST_LINK_SCHEDPOLICY_TAGTYPE = "GaExecHost_Link_schedPolicy";

    public static final String GAEXECHOST_LINK_SCHEDPRIRANGE_TAGTYPE = "GaExecHost_Link_schedPriRange";

    public static final String GAEXECHOST_LINK_SCHEDULABLERESOURCES_TAGTYPE = "GaExecHost_Link_schedulableResources";

    public static final String GAEXECHOST_LINK_SCHEDULE_TAGTYPE = "GaExecHost_Link_schedule";

    public static final String GAEXECHOST_LINK_THROUGHPUT_TAGTYPE = "GaExecHost_Link_throughput";

    public static final String GAEXECHOST_LINK_UTILIZATION_TAGTYPE = "GaExecHost_Link_utilization";

    /**
     * Tells whether a {@link GaExecHostLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << GaExecHost_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaExecHostLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << GaExecHost_Link >> then instantiate a {@link GaExecHostLink} proxy.
     * 
     * @return a {@link GaExecHostLink} proxy on the created {@link Link}.
     */
    public static GaExecHostLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaExecHostLink.STEREOTYPE_NAME);
        return GaExecHostLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link GaExecHostLink} proxy from a {@link Link} stereotyped << GaExecHost_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link GaExecHostLink} proxy or <i>null</i>.
     */
    public static GaExecHostLink instantiate(final Link obj) {
        return GaExecHostLink.canInstantiate(obj) ? new GaExecHostLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaExecHostLink} proxy from a {@link Link} stereotyped << GaExecHost_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link GaExecHostLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static GaExecHostLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (GaExecHostLink.canInstantiate(obj))
        	return new GaExecHostLink(obj);
        else
        	throw new IllegalArgumentException("GaExecHostLink: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        GaExecHostLink other = (GaExecHostLink) obj;
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
     * Getter for string property 'GaExecHost_Link_clockOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Link_clockOvh() {
        return this.elt.getTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_CLOCKOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Link_cntxtSwT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Link_cntxtSwT() {
        return this.elt.getTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_CNTXTSWT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Link_commRcvOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Link_commRcvOvh() {
        return this.elt.getTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_COMMRCVOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Link_commTxOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Link_commTxOvh() {
        return this.elt.getTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_COMMTXOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Link_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Link_host() {
        return this.elt.getTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Link_memSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Link_memSize() {
        return this.elt.getTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_MEMSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Link_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Link_otherSchedPolicy() {
        return this.elt.getTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Link_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaExecHost_Link_processingUnits() {
        return this.elt.getTagValues(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Link_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaExecHost_Link_protectedSharedResources() {
        return this.elt.getTagValues(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Link_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Link_schedPolicy() {
        return this.elt.getTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Link_schedPriRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Link_schedPriRange() {
        return this.elt.getTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_SCHEDPRIRANGE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Link_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaExecHost_Link_schedulableResources() {
        return this.elt.getTagValues(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Link_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Link_schedule() {
        return this.elt.getTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_SCHEDULE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Link_throughput'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaExecHost_Link_throughput() {
        return this.elt.getTagValues(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Link_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaExecHost_Link_utilization() {
        return this.elt.getTagValues(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_UTILIZATION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'GaExecHost_Link_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isGaExecHost_Link_isPreemptible() {
        return this.elt.isTagged(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaExecHost_Link_clockOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Link_clockOvh(final String value) {
        this.elt.putTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_CLOCKOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Link_cntxtSwT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Link_cntxtSwT(final String value) {
        this.elt.putTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_CNTXTSWT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Link_commRcvOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Link_commRcvOvh(final String value) {
        this.elt.putTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_COMMRCVOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Link_commTxOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Link_commTxOvh(final String value) {
        this.elt.putTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_COMMTXOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Link_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Link_host(final String value) {
        this.elt.putTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'GaExecHost_Link_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Link_isPreemptible(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_ISPREEMPTIBLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaExecHost_Link_memSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Link_memSize(final String value) {
        this.elt.putTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_MEMSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Link_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Link_otherSchedPolicy(final String value) {
        this.elt.putTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Link_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Link_processingUnits(final List<String> values) {
        this.elt.putTagValues(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Link_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Link_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaExecHost_Link_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Link_schedPolicy(final String value) {
        this.elt.putTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Link_schedPriRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Link_schedPriRange(final String value) {
        this.elt.putTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_SCHEDPRIRANGE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Link_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Link_schedulableResources(final List<String> values) {
        this.elt.putTagValues(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaExecHost_Link_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Link_schedule(final String value) {
        this.elt.putTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_SCHEDULE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Link_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Link_throughput(final List<String> values) {
        this.elt.putTagValues(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_THROUGHPUT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Link_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Link_utilization(final List<String> values) {
        this.elt.putTagValues(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_UTILIZATION_TAGTYPE_ELT, values);
    }

    protected GaExecHostLink(final Link elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType GAEXECHOST_LINK_COMMTXOVH_TAGTYPE_ELT;

        public static TagType GAEXECHOST_LINK_COMMRCVOVH_TAGTYPE_ELT;

        public static TagType GAEXECHOST_LINK_CNTXTSWT_TAGTYPE_ELT;

        public static TagType GAEXECHOST_LINK_CLOCKOVH_TAGTYPE_ELT;

        public static TagType GAEXECHOST_LINK_SCHEDPRIRANGE_TAGTYPE_ELT;

        public static TagType GAEXECHOST_LINK_MEMSIZE_TAGTYPE_ELT;

        public static TagType GAEXECHOST_LINK_UTILIZATION_TAGTYPE_ELT;

        public static TagType GAEXECHOST_LINK_THROUGHPUT_TAGTYPE_ELT;

        public static TagType GAEXECHOST_LINK_ISPREEMPTIBLE_TAGTYPE_ELT;

        public static TagType GAEXECHOST_LINK_SCHEDPOLICY_TAGTYPE_ELT;

        public static TagType GAEXECHOST_LINK_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        public static TagType GAEXECHOST_LINK_SCHEDULE_TAGTYPE_ELT;

        public static TagType GAEXECHOST_LINK_PROCESSINGUNITS_TAGTYPE_ELT;

        public static TagType GAEXECHOST_LINK_HOST_TAGTYPE_ELT;

        public static TagType GAEXECHOST_LINK_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        public static TagType GAEXECHOST_LINK_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0360f847-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_LINK_COMMTXOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03635a99-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_LINK_COMMRCVOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03635aa0-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_LINK_CNTXTSWT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bce6-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_LINK_CLOCKOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bced-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_LINK_SCHEDPRIRANGE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bcf4-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_LINK_MEMSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bcfb-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_LINK_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bd02-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_LINK_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bd09-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_LINK_ISPREEMPTIBLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "20a787a4-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_LINK_SCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "20a787a5-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_LINK_OTHERSCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "20a787a6-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_LINK_SCHEDULE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "20a787a7-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_LINK_PROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "20a787a8-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_LINK_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "20a787a9-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_LINK_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "20a787aa-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_LINK_SCHEDULABLERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "20a787ab-16ea-11df-b92a-0014222a9f79");
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
