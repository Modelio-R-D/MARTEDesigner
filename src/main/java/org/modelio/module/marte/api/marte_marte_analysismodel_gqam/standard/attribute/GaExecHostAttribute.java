/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.ComputingResourceAttribute;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << GaExecHost_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class GaExecHostAttribute extends ComputingResourceAttribute {
    public static final String STEREOTYPE_NAME = "GaExecHost_Attribute";

    public static final String GAEXECHOST_ATTRIBUTE_CLOCKOVH_TAGTYPE = "GaExecHost_Attribute_clockOvh";

    public static final String GAEXECHOST_ATTRIBUTE_CNTXTSWT_TAGTYPE = "GaExecHost_Attribute_cntxtSwT";

    public static final String GAEXECHOST_ATTRIBUTE_COMMRCVOVH_TAGTYPE = "GaExecHost_Attribute_commRcvOvh";

    public static final String GAEXECHOST_ATTRIBUTE_COMMTXOVH_TAGTYPE = "GaExecHost_Attribute_commTxOvh";

    public static final String GAEXECHOST_ATTRIBUTE_HOST_TAGTYPE = "GaExecHost_Attribute_host";

    public static final String GAEXECHOST_ATTRIBUTE_ISPREEMPTIBLE_TAGTYPE = "GaExecHost_Attribute_isPreemptible";

    public static final String GAEXECHOST_ATTRIBUTE_MEMSIZE_TAGTYPE = "GaExecHost_Attribute_memSize";

    public static final String GAEXECHOST_ATTRIBUTE_OTHERSCHEDPOLICY_TAGTYPE = "GaExecHost_Attribute_otherSchedPolicy";

    public static final String GAEXECHOST_ATTRIBUTE_PROCESSINGUNITS_TAGTYPE = "GaExecHost_Attribute_processingUnits";

    public static final String GAEXECHOST_ATTRIBUTE_PROTECTEDSHAREDRESOURCES_TAGTYPE = "GaExecHost_Attribute_protectedSharedResources";

    public static final String GAEXECHOST_ATTRIBUTE_SCHEDPOLICY_TAGTYPE = "GaExecHost_Attribute_schedPolicy";

    public static final String GAEXECHOST_ATTRIBUTE_SCHEDPRIRANGE_TAGTYPE = "GaExecHost_Attribute_schedPriRange";

    public static final String GAEXECHOST_ATTRIBUTE_SCHEDULABLERESOURCES_TAGTYPE = "GaExecHost_Attribute_schedulableResources";

    public static final String GAEXECHOST_ATTRIBUTE_SCHEDULE_TAGTYPE = "GaExecHost_Attribute_schedule";

    public static final String GAEXECHOST_ATTRIBUTE_THROUGHPUT_TAGTYPE = "GaExecHost_Attribute_throughput";

    public static final String GAEXECHOST_ATTRIBUTE_UTILIZATION_TAGTYPE = "GaExecHost_Attribute_utilization";

    /**
     * Tells whether a {@link GaExecHostAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << GaExecHost_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaExecHostAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << GaExecHost_Attribute >> then instantiate a {@link GaExecHostAttribute} proxy.
     * 
     * @return a {@link GaExecHostAttribute} proxy on the created {@link Attribute}.
     */
    public static GaExecHostAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaExecHostAttribute.STEREOTYPE_NAME);
        return GaExecHostAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link GaExecHostAttribute} proxy from a {@link Attribute} stereotyped << GaExecHost_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link GaExecHostAttribute} proxy or <i>null</i>.
     */
    public static GaExecHostAttribute instantiate(final Attribute obj) {
        return GaExecHostAttribute.canInstantiate(obj) ? new GaExecHostAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaExecHostAttribute} proxy from a {@link Attribute} stereotyped << GaExecHost_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link GaExecHostAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static GaExecHostAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (GaExecHostAttribute.canInstantiate(obj))
        	return new GaExecHostAttribute(obj);
        else
        	throw new IllegalArgumentException("GaExecHostAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        GaExecHostAttribute other = (GaExecHostAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'GaExecHost_Attribute_clockOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Attribute_clockOvh() {
        return this.elt.getTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_CLOCKOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Attribute_cntxtSwT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Attribute_cntxtSwT() {
        return this.elt.getTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_CNTXTSWT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Attribute_commRcvOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Attribute_commRcvOvh() {
        return this.elt.getTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_COMMRCVOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Attribute_commTxOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Attribute_commTxOvh() {
        return this.elt.getTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_COMMTXOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Attribute_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Attribute_host() {
        return this.elt.getTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Attribute_memSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Attribute_memSize() {
        return this.elt.getTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_MEMSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Attribute_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Attribute_otherSchedPolicy() {
        return this.elt.getTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Attribute_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaExecHost_Attribute_processingUnits() {
        return this.elt.getTagValues(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Attribute_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaExecHost_Attribute_protectedSharedResources() {
        return this.elt.getTagValues(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Attribute_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Attribute_schedPolicy() {
        return this.elt.getTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Attribute_schedPriRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Attribute_schedPriRange() {
        return this.elt.getTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_SCHEDPRIRANGE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Attribute_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaExecHost_Attribute_schedulableResources() {
        return this.elt.getTagValues(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Attribute_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Attribute_schedule() {
        return this.elt.getTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_SCHEDULE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Attribute_throughput'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaExecHost_Attribute_throughput() {
        return this.elt.getTagValues(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Attribute_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaExecHost_Attribute_utilization() {
        return this.elt.getTagValues(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_UTILIZATION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'GaExecHost_Attribute_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isGaExecHost_Attribute_isPreemptible() {
        return this.elt.isTagged(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaExecHost_Attribute_clockOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Attribute_clockOvh(final String value) {
        this.elt.putTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_CLOCKOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Attribute_cntxtSwT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Attribute_cntxtSwT(final String value) {
        this.elt.putTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_CNTXTSWT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Attribute_commRcvOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Attribute_commRcvOvh(final String value) {
        this.elt.putTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_COMMRCVOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Attribute_commTxOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Attribute_commTxOvh(final String value) {
        this.elt.putTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_COMMTXOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Attribute_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Attribute_host(final String value) {
        this.elt.putTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'GaExecHost_Attribute_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Attribute_isPreemptible(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_ISPREEMPTIBLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaExecHost_Attribute_memSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Attribute_memSize(final String value) {
        this.elt.putTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_MEMSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Attribute_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Attribute_otherSchedPolicy(final String value) {
        this.elt.putTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Attribute_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Attribute_processingUnits(final List<String> values) {
        this.elt.putTagValues(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Attribute_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Attribute_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaExecHost_Attribute_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Attribute_schedPolicy(final String value) {
        this.elt.putTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Attribute_schedPriRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Attribute_schedPriRange(final String value) {
        this.elt.putTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_SCHEDPRIRANGE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Attribute_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Attribute_schedulableResources(final List<String> values) {
        this.elt.putTagValues(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaExecHost_Attribute_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Attribute_schedule(final String value) {
        this.elt.putTagValue(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_SCHEDULE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Attribute_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Attribute_throughput(final List<String> values) {
        this.elt.putTagValues(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_THROUGHPUT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Attribute_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Attribute_utilization(final List<String> values) {
        this.elt.putTagValues(GaExecHostAttribute.MdaTypes.GAEXECHOST_ATTRIBUTE_UTILIZATION_TAGTYPE_ELT, values);
    }

    protected GaExecHostAttribute(final Attribute elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType GAEXECHOST_ATTRIBUTE_COMMTXOVH_TAGTYPE_ELT;

        public static TagType GAEXECHOST_ATTRIBUTE_COMMRCVOVH_TAGTYPE_ELT;

        public static TagType GAEXECHOST_ATTRIBUTE_CNTXTSWT_TAGTYPE_ELT;

        public static TagType GAEXECHOST_ATTRIBUTE_CLOCKOVH_TAGTYPE_ELT;

        public static TagType GAEXECHOST_ATTRIBUTE_SCHEDPRIRANGE_TAGTYPE_ELT;

        public static TagType GAEXECHOST_ATTRIBUTE_MEMSIZE_TAGTYPE_ELT;

        public static TagType GAEXECHOST_ATTRIBUTE_UTILIZATION_TAGTYPE_ELT;

        public static TagType GAEXECHOST_ATTRIBUTE_THROUGHPUT_TAGTYPE_ELT;

        public static TagType GAEXECHOST_ATTRIBUTE_ISPREEMPTIBLE_TAGTYPE_ELT;

        public static TagType GAEXECHOST_ATTRIBUTE_SCHEDPOLICY_TAGTYPE_ELT;

        public static TagType GAEXECHOST_ATTRIBUTE_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        public static TagType GAEXECHOST_ATTRIBUTE_SCHEDULE_TAGTYPE_ELT;

        public static TagType GAEXECHOST_ATTRIBUTE_PROCESSINGUNITS_TAGTYPE_ELT;

        public static TagType GAEXECHOST_ATTRIBUTE_HOST_TAGTYPE_ELT;

        public static TagType GAEXECHOST_ATTRIBUTE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        public static TagType GAEXECHOST_ATTRIBUTE_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0360f845-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_ATTRIBUTE_COMMTXOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03635a97-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_ATTRIBUTE_COMMRCVOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03635a9e-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_ATTRIBUTE_CNTXTSWT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03635aa5-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_ATTRIBUTE_CLOCKOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bceb-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_ATTRIBUTE_SCHEDPRIRANGE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bcf2-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_ATTRIBUTE_MEMSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bcf9-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_ATTRIBUTE_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bd00-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_ATTRIBUTE_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bd07-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_ATTRIBUTE_ISPREEMPTIBLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "21cb2528-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_ATTRIBUTE_SCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "21cb2529-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_ATTRIBUTE_OTHERSCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "21cb252a-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_ATTRIBUTE_SCHEDULE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "21cb252b-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_ATTRIBUTE_PROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "21cb252c-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_ATTRIBUTE_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "21cb252d-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_ATTRIBUTE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "21cb252e-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_ATTRIBUTE_SCHEDULABLERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "21cb252f-16ea-11df-b92a-0014222a9f79");
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
