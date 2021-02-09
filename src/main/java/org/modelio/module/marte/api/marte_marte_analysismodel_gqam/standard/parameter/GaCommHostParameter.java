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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.CommunicationMediaParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << GaCommHost_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class GaCommHostParameter extends CommunicationMediaParameter {
    public static final String STEREOTYPE_NAME = "GaCommHost_Parameter";

    public static final String GACOMMHOST_PARAMETER_HOST_TAGTYPE = "GaCommHost_Parameter_host";

    public static final String GACOMMHOST_PARAMETER_ISPREEMPTIBLE_TAGTYPE = "GaCommHost_Parameter_isPreemptible";

    public static final String GACOMMHOST_PARAMETER_OTHERSCHEDPOLICY_TAGTYPE = "GaCommHost_Parameter_otherSchedPolicy";

    public static final String GACOMMHOST_PARAMETER_PROCESSINGUNITS_TAGTYPE = "GaCommHost_Parameter_processingUnits";

    public static final String GACOMMHOST_PARAMETER_PROTECTEDSHAREDRESOURCES_TAGTYPE = "GaCommHost_Parameter_protectedSharedResources";

    public static final String GACOMMHOST_PARAMETER_SCHEDPOLICY_TAGTYPE = "GaCommHost_Parameter_schedPolicy";

    public static final String GACOMMHOST_PARAMETER_SCHEDULABLERESOURCES_TAGTYPE = "GaCommHost_Parameter_schedulableResources";

    public static final String GACOMMHOST_PARAMETER_SCHEDULE_TAGTYPE = "GaCommHost_Parameter_schedule";

    public static final String GACOMMHOST_PARAMETER_THROUGHPUT_TAGTYPE = "GaCommHost_Parameter_throughput";

    public static final String GACOMMHOST_PARAMETER_UTILIZATION_TAGTYPE = "GaCommHost_Parameter_utilization";

    /**
     * Tells whether a {@link GaCommHostParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << GaCommHost_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaCommHostParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << GaCommHost_Parameter >> then instantiate a {@link GaCommHostParameter} proxy.
     * 
     * @return a {@link GaCommHostParameter} proxy on the created {@link Parameter}.
     */
    public static GaCommHostParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaCommHostParameter.STEREOTYPE_NAME);
        return GaCommHostParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link GaCommHostParameter} proxy from a {@link Parameter} stereotyped << GaCommHost_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link GaCommHostParameter} proxy or <i>null</i>.
     */
    public static GaCommHostParameter instantiate(final Parameter obj) {
        return GaCommHostParameter.canInstantiate(obj) ? new GaCommHostParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaCommHostParameter} proxy from a {@link Parameter} stereotyped << GaCommHost_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link GaCommHostParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static GaCommHostParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (GaCommHostParameter.canInstantiate(obj))
        	return new GaCommHostParameter(obj);
        else
        	throw new IllegalArgumentException("GaCommHostParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        GaCommHostParameter other = (GaCommHostParameter) obj;
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
     * Getter for string property 'GaCommHost_Parameter_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaCommHost_Parameter_host() {
        return this.elt.getTagValue(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Parameter_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaCommHost_Parameter_otherSchedPolicy() {
        return this.elt.getTagValue(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Parameter_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommHost_Parameter_processingUnits() {
        return this.elt.getTagValues(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Parameter_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommHost_Parameter_protectedSharedResources() {
        return this.elt.getTagValues(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Parameter_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaCommHost_Parameter_schedPolicy() {
        return this.elt.getTagValue(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Parameter_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommHost_Parameter_schedulableResources() {
        return this.elt.getTagValues(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Parameter_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaCommHost_Parameter_schedule() {
        return this.elt.getTagValue(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_SCHEDULE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Parameter_throughput'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommHost_Parameter_throughput() {
        return this.elt.getTagValues(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Parameter_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommHost_Parameter_utilization() {
        return this.elt.getTagValues(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_UTILIZATION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'GaCommHost_Parameter_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isGaCommHost_Parameter_isPreemptible() {
        return this.elt.isTagged(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaCommHost_Parameter_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Parameter_host(final String value) {
        this.elt.putTagValue(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'GaCommHost_Parameter_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Parameter_isPreemptible(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_ISPREEMPTIBLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaCommHost_Parameter_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Parameter_otherSchedPolicy(final String value) {
        this.elt.putTagValue(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Parameter_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Parameter_processingUnits(final List<String> values) {
        this.elt.putTagValues(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Parameter_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Parameter_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaCommHost_Parameter_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Parameter_schedPolicy(final String value) {
        this.elt.putTagValue(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Parameter_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Parameter_schedulableResources(final List<String> values) {
        this.elt.putTagValues(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaCommHost_Parameter_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Parameter_schedule(final String value) {
        this.elt.putTagValue(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_SCHEDULE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Parameter_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Parameter_throughput(final List<String> values) {
        this.elt.putTagValues(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_THROUGHPUT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Parameter_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Parameter_utilization(final List<String> values) {
        this.elt.putTagValues(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_UTILIZATION_TAGTYPE_ELT, values);
    }

    protected GaCommHostParameter(final Parameter elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType GACOMMHOST_PARAMETER_THROUGHPUT_TAGTYPE_ELT;

        public static TagType GACOMMHOST_PARAMETER_UTILIZATION_TAGTYPE_ELT;

        public static TagType GACOMMHOST_PARAMETER_ISPREEMPTIBLE_TAGTYPE_ELT;

        public static TagType GACOMMHOST_PARAMETER_SCHEDPOLICY_TAGTYPE_ELT;

        public static TagType GACOMMHOST_PARAMETER_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        public static TagType GACOMMHOST_PARAMETER_SCHEDULE_TAGTYPE_ELT;

        public static TagType GACOMMHOST_PARAMETER_PROCESSINGUNITS_TAGTYPE_ELT;

        public static TagType GACOMMHOST_PARAMETER_HOST_TAGTYPE_ELT;

        public static TagType GACOMMHOST_PARAMETER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        public static TagType GACOMMHOST_PARAMETER_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03681f38-0ccf-11df-8525-001302895b2b");
            GACOMMHOST_PARAMETER_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "036a818a-0ccf-11df-8525-001302895b2b");
            GACOMMHOST_PARAMETER_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "036ce3e0-0ccf-11df-8525-001302895b2b");
            GACOMMHOST_PARAMETER_ISPREEMPTIBLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9731fa63-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_PARAMETER_SCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9731fa64-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_PARAMETER_OTHERSCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9731fa65-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_PARAMETER_SCHEDULE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9731fa66-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_PARAMETER_PROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9731fa67-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_PARAMETER_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9731fa68-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_PARAMETER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9731fa69-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_PARAMETER_SCHEDULABLERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9731fa6a-1669-11df-b9be-0014222a9f79");
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
