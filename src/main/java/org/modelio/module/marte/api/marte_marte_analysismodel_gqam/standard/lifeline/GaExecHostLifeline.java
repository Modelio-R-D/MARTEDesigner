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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.ComputingResourceLifeline;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << GaExecHost_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class GaExecHostLifeline extends ComputingResourceLifeline {
    public static final String STEREOTYPE_NAME = "GaExecHost_Lifeline";

    public static final String GAEXECHOST_LIFELINE_CLOCKOVH_TAGTYPE = "GaExecHost_Lifeline_clockOvh";

    public static final String GAEXECHOST_LIFELINE_CNTXTSWT_TAGTYPE = "GaExecHost_Lifeline_cntxtSwT";

    public static final String GAEXECHOST_LIFELINE_COMMRCVOVH_TAGTYPE = "GaExecHost_Lifeline_commRcvOvh";

    public static final String GAEXECHOST_LIFELINE_COMMTXOVH_TAGTYPE = "GaExecHost_Lifeline_commTxOvh";

    public static final String GAEXECHOST_LIFELINE_HOST_TAGTYPE = "GaExecHost_Lifeline_host";

    public static final String GAEXECHOST_LIFELINE_ISPREEMPTIBLE_TAGTYPE = "GaExecHost_Lifeline_isPreemptible";

    public static final String GAEXECHOST_LIFELINE_MEMSIZE_TAGTYPE = "GaExecHost_Lifeline_memSize";

    public static final String GAEXECHOST_LIFELINE_OTHERSCHEDPOLICY_TAGTYPE = "GaExecHost_Lifeline_otherSchedPolicy";

    public static final String GAEXECHOST_LIFELINE_PROCESSINGUNITS_TAGTYPE = "GaExecHost_Lifeline_processingUnits";

    public static final String GAEXECHOST_LIFELINE_PROTECTEDSHAREDRESOURCES_TAGTYPE = "GaExecHost_Lifeline_protectedSharedResources";

    public static final String GAEXECHOST_LIFELINE_SCHEDPOLICY_TAGTYPE = "GaExecHost_Lifeline_schedPolicy";

    public static final String GAEXECHOST_LIFELINE_SCHEDPRIRANGE_TAGTYPE = "GaExecHost_Lifeline_schedPriRange";

    public static final String GAEXECHOST_LIFELINE_SCHEDULABLERESOURCES_TAGTYPE = "GaExecHost_Lifeline_schedulableResources";

    public static final String GAEXECHOST_LIFELINE_SCHEDULE_TAGTYPE = "GaExecHost_Lifeline_schedule";

    public static final String GAEXECHOST_LIFELINE_THROUGHPUT_TAGTYPE = "GaExecHost_Lifeline_throughput";

    public static final String GAEXECHOST_LIFELINE_UTILIZATION_TAGTYPE = "GaExecHost_Lifeline_utilization";

    /**
     * Tells whether a {@link GaExecHostLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << GaExecHost_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaExecHostLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << GaExecHost_Lifeline >> then instantiate a {@link GaExecHostLifeline} proxy.
     * 
     * @return a {@link GaExecHostLifeline} proxy on the created {@link Lifeline}.
     */
    public static GaExecHostLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaExecHostLifeline.STEREOTYPE_NAME);
        return GaExecHostLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link GaExecHostLifeline} proxy from a {@link Lifeline} stereotyped << GaExecHost_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link GaExecHostLifeline} proxy or <i>null</i>.
     */
    public static GaExecHostLifeline instantiate(final Lifeline obj) {
        return GaExecHostLifeline.canInstantiate(obj) ? new GaExecHostLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaExecHostLifeline} proxy from a {@link Lifeline} stereotyped << GaExecHost_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link GaExecHostLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static GaExecHostLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (GaExecHostLifeline.canInstantiate(obj))
        	return new GaExecHostLifeline(obj);
        else
        	throw new IllegalArgumentException("GaExecHostLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        GaExecHostLifeline other = (GaExecHostLifeline) obj;
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
     * Getter for string property 'GaExecHost_Lifeline_clockOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Lifeline_clockOvh() {
        return this.elt.getTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_CLOCKOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Lifeline_cntxtSwT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Lifeline_cntxtSwT() {
        return this.elt.getTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_CNTXTSWT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Lifeline_commRcvOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Lifeline_commRcvOvh() {
        return this.elt.getTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_COMMRCVOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Lifeline_commTxOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Lifeline_commTxOvh() {
        return this.elt.getTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_COMMTXOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Lifeline_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Lifeline_host() {
        return this.elt.getTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Lifeline_memSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Lifeline_memSize() {
        return this.elt.getTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_MEMSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Lifeline_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Lifeline_otherSchedPolicy() {
        return this.elt.getTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Lifeline_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaExecHost_Lifeline_processingUnits() {
        return this.elt.getTagValues(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Lifeline_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaExecHost_Lifeline_protectedSharedResources() {
        return this.elt.getTagValues(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Lifeline_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Lifeline_schedPolicy() {
        return this.elt.getTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Lifeline_schedPriRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Lifeline_schedPriRange() {
        return this.elt.getTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_SCHEDPRIRANGE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Lifeline_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaExecHost_Lifeline_schedulableResources() {
        return this.elt.getTagValues(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Lifeline_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Lifeline_schedule() {
        return this.elt.getTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_SCHEDULE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Lifeline_throughput'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaExecHost_Lifeline_throughput() {
        return this.elt.getTagValues(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Lifeline_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaExecHost_Lifeline_utilization() {
        return this.elt.getTagValues(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_UTILIZATION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'GaExecHost_Lifeline_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isGaExecHost_Lifeline_isPreemptible() {
        return this.elt.isTagged(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaExecHost_Lifeline_clockOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Lifeline_clockOvh(final String value) {
        this.elt.putTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_CLOCKOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Lifeline_cntxtSwT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Lifeline_cntxtSwT(final String value) {
        this.elt.putTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_CNTXTSWT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Lifeline_commRcvOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Lifeline_commRcvOvh(final String value) {
        this.elt.putTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_COMMRCVOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Lifeline_commTxOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Lifeline_commTxOvh(final String value) {
        this.elt.putTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_COMMTXOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Lifeline_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Lifeline_host(final String value) {
        this.elt.putTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'GaExecHost_Lifeline_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Lifeline_isPreemptible(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_ISPREEMPTIBLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaExecHost_Lifeline_memSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Lifeline_memSize(final String value) {
        this.elt.putTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_MEMSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Lifeline_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Lifeline_otherSchedPolicy(final String value) {
        this.elt.putTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Lifeline_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Lifeline_processingUnits(final List<String> values) {
        this.elt.putTagValues(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Lifeline_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Lifeline_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaExecHost_Lifeline_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Lifeline_schedPolicy(final String value) {
        this.elt.putTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Lifeline_schedPriRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Lifeline_schedPriRange(final String value) {
        this.elt.putTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_SCHEDPRIRANGE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Lifeline_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Lifeline_schedulableResources(final List<String> values) {
        this.elt.putTagValues(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaExecHost_Lifeline_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Lifeline_schedule(final String value) {
        this.elt.putTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_SCHEDULE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Lifeline_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Lifeline_throughput(final List<String> values) {
        this.elt.putTagValues(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_THROUGHPUT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Lifeline_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Lifeline_utilization(final List<String> values) {
        this.elt.putTagValues(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_UTILIZATION_TAGTYPE_ELT, values);
    }

    protected GaExecHostLifeline(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType GAEXECHOST_LIFELINE_COMMTXOVH_TAGTYPE_ELT;

        public static TagType GAEXECHOST_LIFELINE_COMMRCVOVH_TAGTYPE_ELT;

        public static TagType GAEXECHOST_LIFELINE_CNTXTSWT_TAGTYPE_ELT;

        public static TagType GAEXECHOST_LIFELINE_CLOCKOVH_TAGTYPE_ELT;

        public static TagType GAEXECHOST_LIFELINE_SCHEDPRIRANGE_TAGTYPE_ELT;

        public static TagType GAEXECHOST_LIFELINE_MEMSIZE_TAGTYPE_ELT;

        public static TagType GAEXECHOST_LIFELINE_UTILIZATION_TAGTYPE_ELT;

        public static TagType GAEXECHOST_LIFELINE_THROUGHPUT_TAGTYPE_ELT;

        public static TagType GAEXECHOST_LIFELINE_ISPREEMPTIBLE_TAGTYPE_ELT;

        public static TagType GAEXECHOST_LIFELINE_SCHEDPOLICY_TAGTYPE_ELT;

        public static TagType GAEXECHOST_LIFELINE_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        public static TagType GAEXECHOST_LIFELINE_SCHEDULE_TAGTYPE_ELT;

        public static TagType GAEXECHOST_LIFELINE_PROCESSINGUNITS_TAGTYPE_ELT;

        public static TagType GAEXECHOST_LIFELINE_HOST_TAGTYPE_ELT;

        public static TagType GAEXECHOST_LIFELINE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        public static TagType GAEXECHOST_LIFELINE_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "363d87c0-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_LIFELINE_COMMTXOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "363d87c1-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_LIFELINE_COMMRCVOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "363d87c2-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_LIFELINE_CNTXTSWT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "363d87c3-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_LIFELINE_CLOCKOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "363d87c4-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_LIFELINE_SCHEDPRIRANGE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "363d87c5-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_LIFELINE_MEMSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "363d87c6-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_LIFELINE_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "363d87c7-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_LIFELINE_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "363d87c8-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_LIFELINE_ISPREEMPTIBLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1d82009a-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_LIFELINE_SCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1d82009b-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_LIFELINE_OTHERSCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1d82009c-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_LIFELINE_SCHEDULE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1d82009d-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_LIFELINE_PROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1d82009e-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_LIFELINE_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1d82009f-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_LIFELINE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1d8200a0-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_LIFELINE_SCHEDULABLERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1d8200a1-16ea-11df-b92a-0014222a9f79");
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
