/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.ComputingResourceInstance;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << GaExecHost_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class GaExecHostInstance extends ComputingResourceInstance {
    public static final String STEREOTYPE_NAME = "GaExecHost_Instance";

    public static final String GAEXECHOST_INSTANCE_CLOCKOVH_TAGTYPE = "GaExecHost_Instance_clockOvh";

    public static final String GAEXECHOST_INSTANCE_CNTXTSWT_TAGTYPE = "GaExecHost_Instance_cntxtSwT";

    public static final String GAEXECHOST_INSTANCE_COMMRCVOVH_TAGTYPE = "GaExecHost_Instance_commRcvOvh";

    public static final String GAEXECHOST_INSTANCE_COMMTXOVH_TAGTYPE = "GaExecHost_Instance_commTxOvh";

    public static final String GAEXECHOST_INSTANCE_HOST_TAGTYPE = "GaExecHost_Instance_host";

    public static final String GAEXECHOST_INSTANCE_ISPREEMPTIBLE_TAGTYPE = "GaExecHost_Instance_isPreemptible";

    public static final String GAEXECHOST_INSTANCE_MEMSIZE_TAGTYPE = "GaExecHost_Instance_memSize";

    public static final String GAEXECHOST_INSTANCE_OTHERSCHEDPOLICY_TAGTYPE = "GaExecHost_Instance_otherSchedPolicy";

    public static final String GAEXECHOST_INSTANCE_PROCESSINGUNITS_TAGTYPE = "GaExecHost_Instance_processingUnits";

    public static final String GAEXECHOST_INSTANCE_PROTECTEDSHAREDRESOURCES_TAGTYPE = "GaExecHost_Instance_protectedSharedResources";

    public static final String GAEXECHOST_INSTANCE_SCHEDPOLICY_TAGTYPE = "GaExecHost_Instance_schedPolicy";

    public static final String GAEXECHOST_INSTANCE_SCHEDPRIRANGE_TAGTYPE = "GaExecHost_Instance_schedPriRange";

    public static final String GAEXECHOST_INSTANCE_SCHEDULABLERESOURCES_TAGTYPE = "GaExecHost_Instance_schedulableResources";

    public static final String GAEXECHOST_INSTANCE_SCHEDULE_TAGTYPE = "GaExecHost_Instance_schedule";

    public static final String GAEXECHOST_INSTANCE_THROUGHPUT_TAGTYPE = "GaExecHost_Instance_throughput";

    public static final String GAEXECHOST_INSTANCE_UTILIZATION_TAGTYPE = "GaExecHost_Instance_utilization";

    /**
     * Tells whether a {@link GaExecHostInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << GaExecHost_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaExecHostInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << GaExecHost_Instance >> then instantiate a {@link GaExecHostInstance} proxy.
     * 
     * @return a {@link GaExecHostInstance} proxy on the created {@link Instance}.
     */
    public static GaExecHostInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaExecHostInstance.STEREOTYPE_NAME);
        return GaExecHostInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link GaExecHostInstance} proxy from a {@link Instance} stereotyped << GaExecHost_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link GaExecHostInstance} proxy or <i>null</i>.
     */
    public static GaExecHostInstance instantiate(final Instance obj) {
        return GaExecHostInstance.canInstantiate(obj) ? new GaExecHostInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaExecHostInstance} proxy from a {@link Instance} stereotyped << GaExecHost_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link GaExecHostInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static GaExecHostInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (GaExecHostInstance.canInstantiate(obj))
        	return new GaExecHostInstance(obj);
        else
        	throw new IllegalArgumentException("GaExecHostInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        GaExecHostInstance other = (GaExecHostInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'GaExecHost_Instance_clockOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Instance_clockOvh() {
        return this.elt.getTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_CLOCKOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Instance_cntxtSwT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Instance_cntxtSwT() {
        return this.elt.getTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_CNTXTSWT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Instance_commRcvOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Instance_commRcvOvh() {
        return this.elt.getTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_COMMRCVOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Instance_commTxOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Instance_commTxOvh() {
        return this.elt.getTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_COMMTXOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Instance_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Instance_host() {
        return this.elt.getTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Instance_memSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Instance_memSize() {
        return this.elt.getTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_MEMSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Instance_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Instance_otherSchedPolicy() {
        return this.elt.getTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Instance_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaExecHost_Instance_processingUnits() {
        return this.elt.getTagValues(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Instance_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaExecHost_Instance_protectedSharedResources() {
        return this.elt.getTagValues(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Instance_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Instance_schedPolicy() {
        return this.elt.getTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Instance_schedPriRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Instance_schedPriRange() {
        return this.elt.getTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_SCHEDPRIRANGE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Instance_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaExecHost_Instance_schedulableResources() {
        return this.elt.getTagValues(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Instance_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Instance_schedule() {
        return this.elt.getTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_SCHEDULE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Instance_throughput'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaExecHost_Instance_throughput() {
        return this.elt.getTagValues(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Instance_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaExecHost_Instance_utilization() {
        return this.elt.getTagValues(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_UTILIZATION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'GaExecHost_Instance_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isGaExecHost_Instance_isPreemptible() {
        return this.elt.isTagged(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaExecHost_Instance_clockOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Instance_clockOvh(final String value) {
        this.elt.putTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_CLOCKOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Instance_cntxtSwT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Instance_cntxtSwT(final String value) {
        this.elt.putTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_CNTXTSWT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Instance_commRcvOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Instance_commRcvOvh(final String value) {
        this.elt.putTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_COMMRCVOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Instance_commTxOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Instance_commTxOvh(final String value) {
        this.elt.putTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_COMMTXOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Instance_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Instance_host(final String value) {
        this.elt.putTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'GaExecHost_Instance_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Instance_isPreemptible(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_ISPREEMPTIBLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaExecHost_Instance_memSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Instance_memSize(final String value) {
        this.elt.putTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_MEMSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Instance_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Instance_otherSchedPolicy(final String value) {
        this.elt.putTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Instance_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Instance_processingUnits(final List<String> values) {
        this.elt.putTagValues(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Instance_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Instance_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaExecHost_Instance_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Instance_schedPolicy(final String value) {
        this.elt.putTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Instance_schedPriRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Instance_schedPriRange(final String value) {
        this.elt.putTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_SCHEDPRIRANGE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Instance_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Instance_schedulableResources(final List<String> values) {
        this.elt.putTagValues(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaExecHost_Instance_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Instance_schedule(final String value) {
        this.elt.putTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_SCHEDULE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Instance_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Instance_throughput(final List<String> values) {
        this.elt.putTagValues(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_THROUGHPUT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Instance_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Instance_utilization(final List<String> values) {
        this.elt.putTagValues(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_UTILIZATION_TAGTYPE_ELT, values);
    }

    protected GaExecHostInstance(final Instance elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType GAEXECHOST_INSTANCE_COMMTXOVH_TAGTYPE_ELT;

        public static TagType GAEXECHOST_INSTANCE_COMMRCVOVH_TAGTYPE_ELT;

        public static TagType GAEXECHOST_INSTANCE_CNTXTSWT_TAGTYPE_ELT;

        public static TagType GAEXECHOST_INSTANCE_CLOCKOVH_TAGTYPE_ELT;

        public static TagType GAEXECHOST_INSTANCE_SCHEDPRIRANGE_TAGTYPE_ELT;

        public static TagType GAEXECHOST_INSTANCE_MEMSIZE_TAGTYPE_ELT;

        public static TagType GAEXECHOST_INSTANCE_UTILIZATION_TAGTYPE_ELT;

        public static TagType GAEXECHOST_INSTANCE_THROUGHPUT_TAGTYPE_ELT;

        public static TagType GAEXECHOST_INSTANCE_ISPREEMPTIBLE_TAGTYPE_ELT;

        public static TagType GAEXECHOST_INSTANCE_SCHEDPOLICY_TAGTYPE_ELT;

        public static TagType GAEXECHOST_INSTANCE_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        public static TagType GAEXECHOST_INSTANCE_SCHEDULE_TAGTYPE_ELT;

        public static TagType GAEXECHOST_INSTANCE_PROCESSINGUNITS_TAGTYPE_ELT;

        public static TagType GAEXECHOST_INSTANCE_HOST_TAGTYPE_ELT;

        public static TagType GAEXECHOST_INSTANCE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        public static TagType GAEXECHOST_INSTANCE_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0360f848-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_INSTANCE_COMMTXOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03635a9a-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_INSTANCE_COMMRCVOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03635aa1-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_INSTANCE_CNTXTSWT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bce7-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_INSTANCE_CLOCKOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bcee-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_INSTANCE_SCHEDPRIRANGE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bcf5-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_INSTANCE_MEMSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bcfc-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_INSTANCE_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bd03-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_INSTANCE_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bd0a-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_INSTANCE_ISPREEMPTIBLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1faa28c0-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_INSTANCE_SCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1faa28c1-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_INSTANCE_OTHERSCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1faa28c2-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_INSTANCE_SCHEDULE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1faa28c3-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_INSTANCE_PROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1faa28c4-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_INSTANCE_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1faa28c5-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_INSTANCE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1faa28c6-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_INSTANCE_SCHEDULABLERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1faa28c7-16ea-11df-b92a-0014222a9f79");
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
