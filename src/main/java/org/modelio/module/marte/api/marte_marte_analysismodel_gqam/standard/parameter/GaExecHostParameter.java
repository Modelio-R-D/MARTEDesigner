/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.parameter;

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
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.ComputingResourceParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << GaExecHost_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class GaExecHostParameter extends ComputingResourceParameter {
    public static final String STEREOTYPE_NAME = "GaExecHost_Parameter";

    public static final String GAEXECHOST_PARAMETER_CLOCKOVH_TAGTYPE = "GaExecHost_Parameter_clockOvh";

    public static final String GAEXECHOST_PARAMETER_CNTXTSWT_TAGTYPE = "GaExecHost_Parameter_cntxtSwT";

    public static final String GAEXECHOST_PARAMETER_COMMRCVOVH_TAGTYPE = "GaExecHost_Parameter_commRcvOvh";

    public static final String GAEXECHOST_PARAMETER_COMMTXOVH_TAGTYPE = "GaExecHost_Parameter_commTxOvh";

    public static final String GAEXECHOST_PARAMETER_HOST_TAGTYPE = "GaExecHost_Parameter_host";

    public static final String GAEXECHOST_PARAMETER_ISPREEMPTIBLE_TAGTYPE = "GaExecHost_Parameter_isPreemptible";

    public static final String GAEXECHOST_PARAMETER_MEMSIZE_TAGTYPE = "GaExecHost_Parameter_memSize";

    public static final String GAEXECHOST_PARAMETER_OTHERSCHEDPOLICY_TAGTYPE = "GaExecHost_Parameter_otherSchedPolicy";

    public static final String GAEXECHOST_PARAMETER_PROCESSINGUNITS_TAGTYPE = "GaExecHost_Parameter_processingUnits";

    public static final String GAEXECHOST_PARAMETER_PROTECTEDSHAREDRESOURCES_TAGTYPE = "GaExecHost_Parameter_protectedSharedResources";

    public static final String GAEXECHOST_PARAMETER_SCHEDPOLICY_TAGTYPE = "GaExecHost_Parameter_schedPolicy";

    public static final String GAEXECHOST_PARAMETER_SCHEDPRIRANGE_TAGTYPE = "GaExecHost_Parameter_schedPriRange";

    public static final String GAEXECHOST_PARAMETER_SCHEDULABLERESOURCES_TAGTYPE = "GaExecHost_Parameter_schedulableResources";

    public static final String GAEXECHOST_PARAMETER_SCHEDULE_TAGTYPE = "GaExecHost_Parameter_schedule";

    public static final String GAEXECHOST_PARAMETER_THROUGHPUT_TAGTYPE = "GaExecHost_Parameter_throughput";

    public static final String GAEXECHOST_PARAMETER_UTILIZATION_TAGTYPE = "GaExecHost_Parameter_utilization";

    /**
     * Tells whether a {@link GaExecHostParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << GaExecHost_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaExecHostParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << GaExecHost_Parameter >> then instantiate a {@link GaExecHostParameter} proxy.
     * 
     * @return a {@link GaExecHostParameter} proxy on the created {@link Parameter}.
     */
    public static GaExecHostParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaExecHostParameter.STEREOTYPE_NAME);
        return GaExecHostParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link GaExecHostParameter} proxy from a {@link Parameter} stereotyped << GaExecHost_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link GaExecHostParameter} proxy or <i>null</i>.
     */
    public static GaExecHostParameter instantiate(final Parameter obj) {
        return GaExecHostParameter.canInstantiate(obj) ? new GaExecHostParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaExecHostParameter} proxy from a {@link Parameter} stereotyped << GaExecHost_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link GaExecHostParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static GaExecHostParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (GaExecHostParameter.canInstantiate(obj))
        	return new GaExecHostParameter(obj);
        else
        	throw new IllegalArgumentException("GaExecHostParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        GaExecHostParameter other = (GaExecHostParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'GaExecHost_Parameter_clockOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Parameter_clockOvh() {
        return this.elt.getTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_CLOCKOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Parameter_cntxtSwT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Parameter_cntxtSwT() {
        return this.elt.getTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_CNTXTSWT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Parameter_commRcvOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Parameter_commRcvOvh() {
        return this.elt.getTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_COMMRCVOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Parameter_commTxOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Parameter_commTxOvh() {
        return this.elt.getTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_COMMTXOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Parameter_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Parameter_host() {
        return this.elt.getTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Parameter_memSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Parameter_memSize() {
        return this.elt.getTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_MEMSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Parameter_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Parameter_otherSchedPolicy() {
        return this.elt.getTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Parameter_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaExecHost_Parameter_processingUnits() {
        return this.elt.getTagValues(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Parameter_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaExecHost_Parameter_protectedSharedResources() {
        return this.elt.getTagValues(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Parameter_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Parameter_schedPolicy() {
        return this.elt.getTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Parameter_schedPriRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Parameter_schedPriRange() {
        return this.elt.getTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_SCHEDPRIRANGE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Parameter_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaExecHost_Parameter_schedulableResources() {
        return this.elt.getTagValues(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Parameter_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Parameter_schedule() {
        return this.elt.getTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_SCHEDULE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Parameter_throughput'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaExecHost_Parameter_throughput() {
        return this.elt.getTagValues(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Parameter_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaExecHost_Parameter_utilization() {
        return this.elt.getTagValues(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_UTILIZATION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'GaExecHost_Parameter_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isGaExecHost_Parameter_isPreemptible() {
        return this.elt.isTagged(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaExecHost_Parameter_clockOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Parameter_clockOvh(final String value) {
        this.elt.putTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_CLOCKOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Parameter_cntxtSwT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Parameter_cntxtSwT(final String value) {
        this.elt.putTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_CNTXTSWT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Parameter_commRcvOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Parameter_commRcvOvh(final String value) {
        this.elt.putTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_COMMRCVOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Parameter_commTxOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Parameter_commTxOvh(final String value) {
        this.elt.putTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_COMMTXOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Parameter_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Parameter_host(final String value) {
        this.elt.putTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'GaExecHost_Parameter_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Parameter_isPreemptible(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_ISPREEMPTIBLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaExecHost_Parameter_memSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Parameter_memSize(final String value) {
        this.elt.putTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_MEMSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Parameter_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Parameter_otherSchedPolicy(final String value) {
        this.elt.putTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Parameter_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Parameter_processingUnits(final List<String> values) {
        this.elt.putTagValues(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Parameter_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Parameter_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaExecHost_Parameter_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Parameter_schedPolicy(final String value) {
        this.elt.putTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Parameter_schedPriRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Parameter_schedPriRange(final String value) {
        this.elt.putTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_SCHEDPRIRANGE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Parameter_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Parameter_schedulableResources(final List<String> values) {
        this.elt.putTagValues(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaExecHost_Parameter_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Parameter_schedule(final String value) {
        this.elt.putTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_SCHEDULE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Parameter_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Parameter_throughput(final List<String> values) {
        this.elt.putTagValues(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_THROUGHPUT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Parameter_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Parameter_utilization(final List<String> values) {
        this.elt.putTagValues(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_UTILIZATION_TAGTYPE_ELT, values);
    }

    protected GaExecHostParameter(final Parameter elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType GAEXECHOST_PARAMETER_COMMTXOVH_TAGTYPE_ELT;

        public static TagType GAEXECHOST_PARAMETER_COMMRCVOVH_TAGTYPE_ELT;

        public static TagType GAEXECHOST_PARAMETER_CNTXTSWT_TAGTYPE_ELT;

        public static TagType GAEXECHOST_PARAMETER_CLOCKOVH_TAGTYPE_ELT;

        public static TagType GAEXECHOST_PARAMETER_SCHEDPRIRANGE_TAGTYPE_ELT;

        public static TagType GAEXECHOST_PARAMETER_MEMSIZE_TAGTYPE_ELT;

        public static TagType GAEXECHOST_PARAMETER_UTILIZATION_TAGTYPE_ELT;

        public static TagType GAEXECHOST_PARAMETER_THROUGHPUT_TAGTYPE_ELT;

        public static TagType GAEXECHOST_PARAMETER_ISPREEMPTIBLE_TAGTYPE_ELT;

        public static TagType GAEXECHOST_PARAMETER_SCHEDPOLICY_TAGTYPE_ELT;

        public static TagType GAEXECHOST_PARAMETER_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        public static TagType GAEXECHOST_PARAMETER_SCHEDULE_TAGTYPE_ELT;

        public static TagType GAEXECHOST_PARAMETER_PROCESSINGUNITS_TAGTYPE_ELT;

        public static TagType GAEXECHOST_PARAMETER_HOST_TAGTYPE_ELT;

        public static TagType GAEXECHOST_PARAMETER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        public static TagType GAEXECHOST_PARAMETER_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0360f842-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_PARAMETER_COMMTXOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03635a94-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_PARAMETER_COMMRCVOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03635a9b-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_PARAMETER_CNTXTSWT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03635aa2-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_PARAMETER_CLOCKOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bce8-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_PARAMETER_SCHEDPRIRANGE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bcef-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_PARAMETER_MEMSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bcf6-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_PARAMETER_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bcfd-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_PARAMETER_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bd04-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_PARAMETER_ISPREEMPTIBLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "197239fd-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_PARAMETER_SCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "197239fe-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_PARAMETER_OTHERSCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "197239ff-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_PARAMETER_SCHEDULE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "19723a00-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_PARAMETER_PROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "19723a01-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_PARAMETER_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "19723a02-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_PARAMETER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "19723a03-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_PARAMETER_SCHEDULABLERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "19723a04-16ea-11df-b92a-0014222a9f79");
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
