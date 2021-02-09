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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.CommunicationMediaLink;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << GaCommHost_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class GaCommHostLink extends CommunicationMediaLink {
    public static final String STEREOTYPE_NAME = "GaCommHost_Link";

    public static final String GACOMMHOST_LINK_HOST_TAGTYPE = "GaCommHost_Link_host";

    public static final String GACOMMHOST_LINK_ISPREEMPTIBLE_TAGTYPE = "GaCommHost_Link_isPreemptible";

    public static final String GACOMMHOST_LINK_OTHERSCHEDPOLICY_TAGTYPE = "GaCommHost_Link_otherSchedPolicy";

    public static final String GACOMMHOST_LINK_PROCESSINGUNITS_TAGTYPE = "GaCommHost_Link_processingUnits";

    public static final String GACOMMHOST_LINK_PROTECTEDSHAREDRESOURCES_TAGTYPE = "GaCommHost_Link_protectedSharedResources";

    public static final String GACOMMHOST_LINK_SCHEDPOLICY_TAGTYPE = "GaCommHost_Link_schedPolicy";

    public static final String GACOMMHOST_LINK_SCHEDULABLERESOURCES_TAGTYPE = "GaCommHost_Link_schedulableResources";

    public static final String GACOMMHOST_LINK_SCHEDULE_TAGTYPE = "GaCommHost_Link_schedule";

    public static final String GACOMMHOST_LINK_THROUGHPUT_TAGTYPE = "GaCommHost_Link_throughput";

    public static final String GACOMMHOST_LINK_UTILIZATION_TAGTYPE = "GaCommHost_Link_utilization";

    /**
     * Tells whether a {@link GaCommHostLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << GaCommHost_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaCommHostLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << GaCommHost_Link >> then instantiate a {@link GaCommHostLink} proxy.
     * 
     * @return a {@link GaCommHostLink} proxy on the created {@link Link}.
     */
    public static GaCommHostLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaCommHostLink.STEREOTYPE_NAME);
        return GaCommHostLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link GaCommHostLink} proxy from a {@link Link} stereotyped << GaCommHost_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link GaCommHostLink} proxy or <i>null</i>.
     */
    public static GaCommHostLink instantiate(final Link obj) {
        return GaCommHostLink.canInstantiate(obj) ? new GaCommHostLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaCommHostLink} proxy from a {@link Link} stereotyped << GaCommHost_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link GaCommHostLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static GaCommHostLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (GaCommHostLink.canInstantiate(obj))
        	return new GaCommHostLink(obj);
        else
        	throw new IllegalArgumentException("GaCommHostLink: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        GaCommHostLink other = (GaCommHostLink) obj;
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
     * Getter for string property 'GaCommHost_Link_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaCommHost_Link_host() {
        return this.elt.getTagValue(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Link_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaCommHost_Link_otherSchedPolicy() {
        return this.elt.getTagValue(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Link_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommHost_Link_processingUnits() {
        return this.elt.getTagValues(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Link_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommHost_Link_protectedSharedResources() {
        return this.elt.getTagValues(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Link_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaCommHost_Link_schedPolicy() {
        return this.elt.getTagValue(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Link_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommHost_Link_schedulableResources() {
        return this.elt.getTagValues(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Link_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaCommHost_Link_schedule() {
        return this.elt.getTagValue(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_SCHEDULE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Link_throughput'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommHost_Link_throughput() {
        return this.elt.getTagValues(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Link_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommHost_Link_utilization() {
        return this.elt.getTagValues(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_UTILIZATION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'GaCommHost_Link_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isGaCommHost_Link_isPreemptible() {
        return this.elt.isTagged(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaCommHost_Link_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Link_host(final String value) {
        this.elt.putTagValue(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'GaCommHost_Link_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Link_isPreemptible(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_ISPREEMPTIBLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaCommHost_Link_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Link_otherSchedPolicy(final String value) {
        this.elt.putTagValue(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Link_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Link_processingUnits(final List<String> values) {
        this.elt.putTagValues(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Link_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Link_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaCommHost_Link_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Link_schedPolicy(final String value) {
        this.elt.putTagValue(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Link_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Link_schedulableResources(final List<String> values) {
        this.elt.putTagValues(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaCommHost_Link_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Link_schedule(final String value) {
        this.elt.putTagValue(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_SCHEDULE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Link_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Link_throughput(final List<String> values) {
        this.elt.putTagValues(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_THROUGHPUT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Link_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Link_utilization(final List<String> values) {
        this.elt.putTagValues(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_UTILIZATION_TAGTYPE_ELT, values);
    }

    protected GaCommHostLink(final Link elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType GACOMMHOST_LINK_THROUGHPUT_TAGTYPE_ELT;

        public static TagType GACOMMHOST_LINK_UTILIZATION_TAGTYPE_ELT;

        public static TagType GACOMMHOST_LINK_ISPREEMPTIBLE_TAGTYPE_ELT;

        public static TagType GACOMMHOST_LINK_SCHEDPOLICY_TAGTYPE_ELT;

        public static TagType GACOMMHOST_LINK_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        public static TagType GACOMMHOST_LINK_SCHEDULE_TAGTYPE_ELT;

        public static TagType GACOMMHOST_LINK_PROCESSINGUNITS_TAGTYPE_ELT;

        public static TagType GACOMMHOST_LINK_HOST_TAGTYPE_ELT;

        public static TagType GACOMMHOST_LINK_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        public static TagType GACOMMHOST_LINK_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03681f3d-0ccf-11df-8525-001302895b2b");
            GACOMMHOST_LINK_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "036ce3de-0ccf-11df-8525-001302895b2b");
            GACOMMHOST_LINK_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "036ce3e5-0ccf-11df-8525-001302895b2b");
            GACOMMHOST_LINK_ISPREEMPTIBLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9d71c6e8-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_LINK_SCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9d71c6e9-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_LINK_OTHERSCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9d71c6ea-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_LINK_SCHEDULE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9d71c6eb-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_LINK_PROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9d71c6ec-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_LINK_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9d742943-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_LINK_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9d742944-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_LINK_SCHEDULABLERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9d742945-1669-11df-b9be-0014222a9f79");
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
