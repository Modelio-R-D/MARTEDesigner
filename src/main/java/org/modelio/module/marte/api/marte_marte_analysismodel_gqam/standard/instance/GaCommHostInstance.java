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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.CommunicationMediaInstance;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << GaCommHost_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class GaCommHostInstance extends CommunicationMediaInstance {
    public static final String STEREOTYPE_NAME = "GaCommHost_Instance";

    public static final String GACOMMHOST_INSTANCE_HOST_TAGTYPE = "GaCommHost_Instance_host";

    public static final String GACOMMHOST_INSTANCE_ISPREEMPTIBLE_TAGTYPE = "GaCommHost_Instance_isPreemptible";

    public static final String GACOMMHOST_INSTANCE_OTHERSCHEDPOLICY_TAGTYPE = "GaCommHost_Instance_otherSchedPolicy";

    public static final String GACOMMHOST_INSTANCE_PROCESSINGUNITS_TAGTYPE = "GaCommHost_Instance_processingUnits";

    public static final String GACOMMHOST_INSTANCE_PROTECTEDSHAREDRESOURCES_TAGTYPE = "GaCommHost_Instance_protectedSharedResources";

    public static final String GACOMMHOST_INSTANCE_SCHEDPOLICY_TAGTYPE = "GaCommHost_Instance_schedPolicy";

    public static final String GACOMMHOST_INSTANCE_SCHEDULABLERESOURCES_TAGTYPE = "GaCommHost_Instance_schedulableResources";

    public static final String GACOMMHOST_INSTANCE_SCHEDULE_TAGTYPE = "GaCommHost_Instance_schedule";

    public static final String GACOMMHOST_INSTANCE_THROUGHPUT_TAGTYPE = "GaCommHost_Instance_throughput";

    public static final String GACOMMHOST_INSTANCE_UTILIZATION_TAGTYPE = "GaCommHost_Instance_utilization";

    /**
     * Tells whether a {@link GaCommHostInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << GaCommHost_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaCommHostInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << GaCommHost_Instance >> then instantiate a {@link GaCommHostInstance} proxy.
     * 
     * @return a {@link GaCommHostInstance} proxy on the created {@link Instance}.
     */
    public static GaCommHostInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaCommHostInstance.STEREOTYPE_NAME);
        return GaCommHostInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link GaCommHostInstance} proxy from a {@link Instance} stereotyped << GaCommHost_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link GaCommHostInstance} proxy or <i>null</i>.
     */
    public static GaCommHostInstance instantiate(final Instance obj) {
        return GaCommHostInstance.canInstantiate(obj) ? new GaCommHostInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaCommHostInstance} proxy from a {@link Instance} stereotyped << GaCommHost_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link GaCommHostInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static GaCommHostInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (GaCommHostInstance.canInstantiate(obj))
        	return new GaCommHostInstance(obj);
        else
        	throw new IllegalArgumentException("GaCommHostInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        GaCommHostInstance other = (GaCommHostInstance) obj;
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
     * Getter for string property 'GaCommHost_Instance_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaCommHost_Instance_host() {
        return this.elt.getTagValue(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Instance_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaCommHost_Instance_otherSchedPolicy() {
        return this.elt.getTagValue(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Instance_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommHost_Instance_processingUnits() {
        return this.elt.getTagValues(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Instance_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommHost_Instance_protectedSharedResources() {
        return this.elt.getTagValues(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Instance_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaCommHost_Instance_schedPolicy() {
        return this.elt.getTagValue(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Instance_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommHost_Instance_schedulableResources() {
        return this.elt.getTagValues(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Instance_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaCommHost_Instance_schedule() {
        return this.elt.getTagValue(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_SCHEDULE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Instance_throughput'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommHost_Instance_throughput() {
        return this.elt.getTagValues(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Instance_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommHost_Instance_utilization() {
        return this.elt.getTagValues(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_UTILIZATION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'GaCommHost_Instance_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isGaCommHost_Instance_isPreemptible() {
        return this.elt.isTagged(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaCommHost_Instance_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Instance_host(final String value) {
        this.elt.putTagValue(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'GaCommHost_Instance_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Instance_isPreemptible(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_ISPREEMPTIBLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaCommHost_Instance_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Instance_otherSchedPolicy(final String value) {
        this.elt.putTagValue(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Instance_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Instance_processingUnits(final List<String> values) {
        this.elt.putTagValues(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Instance_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Instance_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaCommHost_Instance_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Instance_schedPolicy(final String value) {
        this.elt.putTagValue(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Instance_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Instance_schedulableResources(final List<String> values) {
        this.elt.putTagValues(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaCommHost_Instance_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Instance_schedule(final String value) {
        this.elt.putTagValue(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_SCHEDULE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Instance_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Instance_throughput(final List<String> values) {
        this.elt.putTagValues(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_THROUGHPUT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Instance_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Instance_utilization(final List<String> values) {
        this.elt.putTagValues(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_UTILIZATION_TAGTYPE_ELT, values);
    }

    protected GaCommHostInstance(final Instance elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType GACOMMHOST_INSTANCE_THROUGHPUT_TAGTYPE_ELT;

        public static TagType GACOMMHOST_INSTANCE_UTILIZATION_TAGTYPE_ELT;

        public static TagType GACOMMHOST_INSTANCE_ISPREEMPTIBLE_TAGTYPE_ELT;

        public static TagType GACOMMHOST_INSTANCE_SCHEDPOLICY_TAGTYPE_ELT;

        public static TagType GACOMMHOST_INSTANCE_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        public static TagType GACOMMHOST_INSTANCE_SCHEDULE_TAGTYPE_ELT;

        public static TagType GACOMMHOST_INSTANCE_PROCESSINGUNITS_TAGTYPE_ELT;

        public static TagType GACOMMHOST_INSTANCE_HOST_TAGTYPE_ELT;

        public static TagType GACOMMHOST_INSTANCE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        public static TagType GACOMMHOST_INSTANCE_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03681f3e-0ccf-11df-8525-001302895b2b");
            GACOMMHOST_INSTANCE_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "036ce3df-0ccf-11df-8525-001302895b2b");
            GACOMMHOST_INSTANCE_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "036ce3e6-0ccf-11df-8525-001302895b2b");
            GACOMMHOST_INSTANCE_ISPREEMPTIBLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9c80f901-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_INSTANCE_SCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9c80f902-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_INSTANCE_OTHERSCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9c80f903-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_INSTANCE_SCHEDULE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9c80f904-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_INSTANCE_PROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9c80f905-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_INSTANCE_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9c80f906-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_INSTANCE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9c80f907-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_INSTANCE_SCHEDULABLERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9c80f908-1669-11df-b9be-0014222a9f79");
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
