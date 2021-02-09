/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.association;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.CommunicationMediaAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << GaCommHost_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class GaCommHostAssociation extends CommunicationMediaAssociation {
    public static final String STEREOTYPE_NAME = "GaCommHost_Association";

    public static final String GACOMMHOST_ASSOCIATION_HOST_TAGTYPE = "GaCommHost_Association_host";

    public static final String GACOMMHOST_ASSOCIATION_ISPREEMPTIBLE_TAGTYPE = "GaCommHost_Association_isPreemptible";

    public static final String GACOMMHOST_ASSOCIATION_OTHERSCHEDPOLICY_TAGTYPE = "GaCommHost_Association_otherSchedPolicy";

    public static final String GACOMMHOST_ASSOCIATION_PROCESSINGUNITS_TAGTYPE = "GaCommHost_Association_processingUnits";

    public static final String GACOMMHOST_ASSOCIATION_PROTECTEDSHAREDRESOURCES_TAGTYPE = "GaCommHost_Association_protectedSharedResources";

    public static final String GACOMMHOST_ASSOCIATION_SCHEDPOLICY_TAGTYPE = "GaCommHost_Association_schedPolicy";

    public static final String GACOMMHOST_ASSOCIATION_SCHEDULABLERESOURCES_TAGTYPE = "GaCommHost_Association_schedulableResources";

    public static final String GACOMMHOST_ASSOCIATION_SCHEDULE_TAGTYPE = "GaCommHost_Association_schedule";

    public static final String GACOMMHOST_ASSOCIATION_THROUGHPUT_TAGTYPE = "GaCommHost_Association_throughput";

    public static final String GACOMMHOST_ASSOCIATION_UTILIZATION_TAGTYPE = "GaCommHost_Association_utilization";

    /**
     * Tells whether a {@link GaCommHostAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << GaCommHost_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaCommHostAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << GaCommHost_Association >> then instantiate a {@link GaCommHostAssociation} proxy.
     * 
     * @return a {@link GaCommHostAssociation} proxy on the created {@link Association}.
     */
    public static GaCommHostAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaCommHostAssociation.STEREOTYPE_NAME);
        return GaCommHostAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link GaCommHostAssociation} proxy from a {@link Association} stereotyped << GaCommHost_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link GaCommHostAssociation} proxy or <i>null</i>.
     */
    public static GaCommHostAssociation instantiate(final Association obj) {
        return GaCommHostAssociation.canInstantiate(obj) ? new GaCommHostAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaCommHostAssociation} proxy from a {@link Association} stereotyped << GaCommHost_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link GaCommHostAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static GaCommHostAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (GaCommHostAssociation.canInstantiate(obj))
        	return new GaCommHostAssociation(obj);
        else
        	throw new IllegalArgumentException("GaCommHostAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        GaCommHostAssociation other = (GaCommHostAssociation) obj;
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
     * Getter for string property 'GaCommHost_Association_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaCommHost_Association_host() {
        return this.elt.getTagValue(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Association_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaCommHost_Association_otherSchedPolicy() {
        return this.elt.getTagValue(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Association_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommHost_Association_processingUnits() {
        return this.elt.getTagValues(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Association_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommHost_Association_protectedSharedResources() {
        return this.elt.getTagValues(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Association_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaCommHost_Association_schedPolicy() {
        return this.elt.getTagValue(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Association_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommHost_Association_schedulableResources() {
        return this.elt.getTagValues(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Association_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaCommHost_Association_schedule() {
        return this.elt.getTagValue(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_SCHEDULE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Association_throughput'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommHost_Association_throughput() {
        return this.elt.getTagValues(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Association_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommHost_Association_utilization() {
        return this.elt.getTagValues(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_UTILIZATION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'GaCommHost_Association_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isGaCommHost_Association_isPreemptible() {
        return this.elt.isTagged(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaCommHost_Association_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Association_host(final String value) {
        this.elt.putTagValue(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'GaCommHost_Association_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Association_isPreemptible(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_ISPREEMPTIBLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaCommHost_Association_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Association_otherSchedPolicy(final String value) {
        this.elt.putTagValue(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Association_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Association_processingUnits(final List<String> values) {
        this.elt.putTagValues(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Association_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Association_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaCommHost_Association_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Association_schedPolicy(final String value) {
        this.elt.putTagValue(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Association_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Association_schedulableResources(final List<String> values) {
        this.elt.putTagValues(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaCommHost_Association_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Association_schedule(final String value) {
        this.elt.putTagValue(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_SCHEDULE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Association_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Association_throughput(final List<String> values) {
        this.elt.putTagValues(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_THROUGHPUT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Association_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Association_utilization(final List<String> values) {
        this.elt.putTagValues(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_UTILIZATION_TAGTYPE_ELT, values);
    }

    protected GaCommHostAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType GACOMMHOST_ASSOCIATION_THROUGHPUT_TAGTYPE_ELT;

        public static TagType GACOMMHOST_ASSOCIATION_UTILIZATION_TAGTYPE_ELT;

        public static TagType GACOMMHOST_ASSOCIATION_ISPREEMPTIBLE_TAGTYPE_ELT;

        public static TagType GACOMMHOST_ASSOCIATION_SCHEDPOLICY_TAGTYPE_ELT;

        public static TagType GACOMMHOST_ASSOCIATION_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        public static TagType GACOMMHOST_ASSOCIATION_SCHEDULE_TAGTYPE_ELT;

        public static TagType GACOMMHOST_ASSOCIATION_PROCESSINGUNITS_TAGTYPE_ELT;

        public static TagType GACOMMHOST_ASSOCIATION_HOST_TAGTYPE_ELT;

        public static TagType GACOMMHOST_ASSOCIATION_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        public static TagType GACOMMHOST_ASSOCIATION_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ae9032e7-14a6-11df-9d54-0014222a9f79");
            GACOMMHOST_ASSOCIATION_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ae9032e8-14a6-11df-9d54-0014222a9f79");
            GACOMMHOST_ASSOCIATION_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ae9032e9-14a6-11df-9d54-0014222a9f79");
            GACOMMHOST_ASSOCIATION_ISPREEMPTIBLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9b928d75-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_ASSOCIATION_SCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9b928d76-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_ASSOCIATION_OTHERSCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9b928d77-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_ASSOCIATION_SCHEDULE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9b928d78-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_ASSOCIATION_PROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9b928d79-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_ASSOCIATION_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9b928d7a-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_ASSOCIATION_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9b928d7b-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_ASSOCIATION_SCHEDULABLERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9b928d7c-1669-11df-b9be-0014222a9f79");
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
