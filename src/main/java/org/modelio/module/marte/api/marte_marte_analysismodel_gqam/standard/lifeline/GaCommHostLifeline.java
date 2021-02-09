/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.lifeline;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.CommunicationMediaLifeline;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << GaCommHost_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class GaCommHostLifeline extends CommunicationMediaLifeline {
    public static final String STEREOTYPE_NAME = "GaCommHost_Lifeline";

    public static final String GACOMMHOST_LIFELINE_HOST_TAGTYPE = "GaCommHost_Lifeline_host";

    public static final String GACOMMHOST_LIFELINE_ISPREEMPTIBLE_TAGTYPE = "GaCommHost_Lifeline_isPreemptible";

    public static final String GACOMMHOST_LIFELINE_OTHERSCHEDPOLICY_TAGTYPE = "GaCommHost_Lifeline_otherSchedPolicy";

    public static final String GACOMMHOST_LIFELINE_PROCESSINGUNITS_TAGTYPE = "GaCommHost_Lifeline_processingUnits";

    public static final String GACOMMHOST_LIFELINE_PROTECTEDSHAREDRESOURCES_TAGTYPE = "GaCommHost_Lifeline_protectedSharedResources";

    public static final String GACOMMHOST_LIFELINE_SCHEDPOLICY_TAGTYPE = "GaCommHost_Lifeline_schedPolicy";

    public static final String GACOMMHOST_LIFELINE_SCHEDULABLERESOURCES_TAGTYPE = "GaCommHost_Lifeline_schedulableResources";

    public static final String GACOMMHOST_LIFELINE_SCHEDULE_TAGTYPE = "GaCommHost_Lifeline_schedule";

    public static final String GACOMMHOST_LIFELINE_THROUGHPUT_TAGTYPE = "GaCommHost_Lifeline_throughput";

    public static final String GACOMMHOST_LIFELINE_UTILIZATION_TAGTYPE = "GaCommHost_Lifeline_utilization";

    /**
     * Tells whether a {@link GaCommHostLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << GaCommHost_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaCommHostLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << GaCommHost_Lifeline >> then instantiate a {@link GaCommHostLifeline} proxy.
     * 
     * @return a {@link GaCommHostLifeline} proxy on the created {@link Lifeline}.
     */
    public static GaCommHostLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaCommHostLifeline.STEREOTYPE_NAME);
        return GaCommHostLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link GaCommHostLifeline} proxy from a {@link Lifeline} stereotyped << GaCommHost_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link GaCommHostLifeline} proxy or <i>null</i>.
     */
    public static GaCommHostLifeline instantiate(final Lifeline obj) {
        return GaCommHostLifeline.canInstantiate(obj) ? new GaCommHostLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaCommHostLifeline} proxy from a {@link Lifeline} stereotyped << GaCommHost_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link GaCommHostLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static GaCommHostLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (GaCommHostLifeline.canInstantiate(obj))
        	return new GaCommHostLifeline(obj);
        else
        	throw new IllegalArgumentException("GaCommHostLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        GaCommHostLifeline other = (GaCommHostLifeline) obj;
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
     * Getter for string property 'GaCommHost_Lifeline_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaCommHost_Lifeline_host() {
        return this.elt.getTagValue(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Lifeline_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaCommHost_Lifeline_otherSchedPolicy() {
        return this.elt.getTagValue(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Lifeline_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommHost_Lifeline_processingUnits() {
        return this.elt.getTagValues(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Lifeline_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommHost_Lifeline_protectedSharedResources() {
        return this.elt.getTagValues(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Lifeline_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaCommHost_Lifeline_schedPolicy() {
        return this.elt.getTagValue(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Lifeline_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommHost_Lifeline_schedulableResources() {
        return this.elt.getTagValues(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Lifeline_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaCommHost_Lifeline_schedule() {
        return this.elt.getTagValue(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_SCHEDULE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Lifeline_throughput'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommHost_Lifeline_throughput() {
        return this.elt.getTagValues(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Lifeline_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommHost_Lifeline_utilization() {
        return this.elt.getTagValues(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_UTILIZATION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'GaCommHost_Lifeline_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isGaCommHost_Lifeline_isPreemptible() {
        return this.elt.isTagged(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaCommHost_Lifeline_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Lifeline_host(final String value) {
        this.elt.putTagValue(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'GaCommHost_Lifeline_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Lifeline_isPreemptible(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_ISPREEMPTIBLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaCommHost_Lifeline_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Lifeline_otherSchedPolicy(final String value) {
        this.elt.putTagValue(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Lifeline_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Lifeline_processingUnits(final List<String> values) {
        this.elt.putTagValues(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Lifeline_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Lifeline_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaCommHost_Lifeline_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Lifeline_schedPolicy(final String value) {
        this.elt.putTagValue(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Lifeline_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Lifeline_schedulableResources(final List<String> values) {
        this.elt.putTagValues(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaCommHost_Lifeline_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Lifeline_schedule(final String value) {
        this.elt.putTagValue(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_SCHEDULE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Lifeline_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Lifeline_throughput(final List<String> values) {
        this.elt.putTagValues(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_THROUGHPUT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Lifeline_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Lifeline_utilization(final List<String> values) {
        this.elt.putTagValues(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_UTILIZATION_TAGTYPE_ELT, values);
    }

    protected GaCommHostLifeline(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType GACOMMHOST_LIFELINE_THROUGHPUT_TAGTYPE_ELT;

        public static TagType GACOMMHOST_LIFELINE_UTILIZATION_TAGTYPE_ELT;

        public static TagType GACOMMHOST_LIFELINE_ISPREEMPTIBLE_TAGTYPE_ELT;

        public static TagType GACOMMHOST_LIFELINE_SCHEDPOLICY_TAGTYPE_ELT;

        public static TagType GACOMMHOST_LIFELINE_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        public static TagType GACOMMHOST_LIFELINE_SCHEDULE_TAGTYPE_ELT;

        public static TagType GACOMMHOST_LIFELINE_PROCESSINGUNITS_TAGTYPE_ELT;

        public static TagType GACOMMHOST_LIFELINE_HOST_TAGTYPE_ELT;

        public static TagType GACOMMHOST_LIFELINE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        public static TagType GACOMMHOST_LIFELINE_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "aeaf3193-14a6-11df-9d54-0014222a9f79");
            GACOMMHOST_LIFELINE_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "aeaf3194-14a6-11df-9d54-0014222a9f79");
            GACOMMHOST_LIFELINE_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "aeaf3195-14a6-11df-9d54-0014222a9f79");
            GACOMMHOST_LIFELINE_ISPREEMPTIBLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9a9f5d33-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_LIFELINE_SCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9a9f5d34-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_LIFELINE_OTHERSCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9a9f5d35-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_LIFELINE_SCHEDULE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9a9f5d36-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_LIFELINE_PROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9a9f5d37-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_LIFELINE_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9a9f5d38-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_LIFELINE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9a9f5d39-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_LIFELINE_SCHEDULABLERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9a9f5d3a-1669-11df-b9be-0014222a9f79");
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
