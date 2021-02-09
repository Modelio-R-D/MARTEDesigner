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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.CommunicationMediaAttribute;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << GaCommHost_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class GaCommHostAttribute extends CommunicationMediaAttribute {
    public static final String STEREOTYPE_NAME = "GaCommHost_Attribute";

    public static final String GACOMMHOST_ATTRIBUTE_HOST_TAGTYPE = "GaCommHost_Attribute_host";

    public static final String GACOMMHOST_ATTRIBUTE_ISPREEMPTIBLE_TAGTYPE = "GaCommHost_Attribute_isPreemptible";

    public static final String GACOMMHOST_ATTRIBUTE_OTHERSCHEDPOLICY_TAGTYPE = "GaCommHost_Attribute_otherSchedPolicy";

    public static final String GACOMMHOST_ATTRIBUTE_PROCESSINGUNITS_TAGTYPE = "GaCommHost_Attribute_processingUnits";

    public static final String GACOMMHOST_ATTRIBUTE_PROTECTEDSHAREDRESOURCES_TAGTYPE = "GaCommHost_Attribute_protectedSharedResources";

    public static final String GACOMMHOST_ATTRIBUTE_SCHEDPOLICY_TAGTYPE = "GaCommHost_Attribute_schedPolicy";

    public static final String GACOMMHOST_ATTRIBUTE_SCHEDULABLERESOURCES_TAGTYPE = "GaCommHost_Attribute_schedulableResources";

    public static final String GACOMMHOST_ATTRIBUTE_SCHEDULE_TAGTYPE = "GaCommHost_Attribute_schedule";

    public static final String GACOMMHOST_ATTRIBUTE_THROUGHPUT_TAGTYPE = "GaCommHost_Attribute_throughput";

    public static final String GACOMMHOST_ATTRIBUTE_UTILIZATION_TAGTYPE = "GaCommHost_Attribute_utilization";

    /**
     * Tells whether a {@link GaCommHostAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << GaCommHost_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaCommHostAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << GaCommHost_Attribute >> then instantiate a {@link GaCommHostAttribute} proxy.
     * 
     * @return a {@link GaCommHostAttribute} proxy on the created {@link Attribute}.
     */
    public static GaCommHostAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaCommHostAttribute.STEREOTYPE_NAME);
        return GaCommHostAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link GaCommHostAttribute} proxy from a {@link Attribute} stereotyped << GaCommHost_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link GaCommHostAttribute} proxy or <i>null</i>.
     */
    public static GaCommHostAttribute instantiate(final Attribute obj) {
        return GaCommHostAttribute.canInstantiate(obj) ? new GaCommHostAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaCommHostAttribute} proxy from a {@link Attribute} stereotyped << GaCommHost_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link GaCommHostAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static GaCommHostAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (GaCommHostAttribute.canInstantiate(obj))
        	return new GaCommHostAttribute(obj);
        else
        	throw new IllegalArgumentException("GaCommHostAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        GaCommHostAttribute other = (GaCommHostAttribute) obj;
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
     * Getter for string property 'GaCommHost_Attribute_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaCommHost_Attribute_host() {
        return this.elt.getTagValue(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Attribute_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaCommHost_Attribute_otherSchedPolicy() {
        return this.elt.getTagValue(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Attribute_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommHost_Attribute_processingUnits() {
        return this.elt.getTagValues(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Attribute_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommHost_Attribute_protectedSharedResources() {
        return this.elt.getTagValues(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Attribute_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaCommHost_Attribute_schedPolicy() {
        return this.elt.getTagValue(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Attribute_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommHost_Attribute_schedulableResources() {
        return this.elt.getTagValues(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Attribute_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaCommHost_Attribute_schedule() {
        return this.elt.getTagValue(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_SCHEDULE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Attribute_throughput'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommHost_Attribute_throughput() {
        return this.elt.getTagValues(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Attribute_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommHost_Attribute_utilization() {
        return this.elt.getTagValues(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_UTILIZATION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'GaCommHost_Attribute_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isGaCommHost_Attribute_isPreemptible() {
        return this.elt.isTagged(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaCommHost_Attribute_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Attribute_host(final String value) {
        this.elt.putTagValue(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'GaCommHost_Attribute_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Attribute_isPreemptible(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_ISPREEMPTIBLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaCommHost_Attribute_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Attribute_otherSchedPolicy(final String value) {
        this.elt.putTagValue(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Attribute_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Attribute_processingUnits(final List<String> values) {
        this.elt.putTagValues(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Attribute_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Attribute_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaCommHost_Attribute_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Attribute_schedPolicy(final String value) {
        this.elt.putTagValue(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Attribute_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Attribute_schedulableResources(final List<String> values) {
        this.elt.putTagValues(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaCommHost_Attribute_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Attribute_schedule(final String value) {
        this.elt.putTagValue(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_SCHEDULE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Attribute_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Attribute_throughput(final List<String> values) {
        this.elt.putTagValues(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_THROUGHPUT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Attribute_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Attribute_utilization(final List<String> values) {
        this.elt.putTagValues(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_UTILIZATION_TAGTYPE_ELT, values);
    }

    protected GaCommHostAttribute(final Attribute elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType GACOMMHOST_ATTRIBUTE_THROUGHPUT_TAGTYPE_ELT;

        public static TagType GACOMMHOST_ATTRIBUTE_UTILIZATION_TAGTYPE_ELT;

        public static TagType GACOMMHOST_ATTRIBUTE_ISPREEMPTIBLE_TAGTYPE_ELT;

        public static TagType GACOMMHOST_ATTRIBUTE_SCHEDPOLICY_TAGTYPE_ELT;

        public static TagType GACOMMHOST_ATTRIBUTE_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        public static TagType GACOMMHOST_ATTRIBUTE_SCHEDULE_TAGTYPE_ELT;

        public static TagType GACOMMHOST_ATTRIBUTE_PROCESSINGUNITS_TAGTYPE_ELT;

        public static TagType GACOMMHOST_ATTRIBUTE_HOST_TAGTYPE_ELT;

        public static TagType GACOMMHOST_ATTRIBUTE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        public static TagType GACOMMHOST_ATTRIBUTE_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03681f3b-0ccf-11df-8525-001302895b2b");
            GACOMMHOST_ATTRIBUTE_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "036ce3dc-0ccf-11df-8525-001302895b2b");
            GACOMMHOST_ATTRIBUTE_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "036ce3e3-0ccf-11df-8525-001302895b2b");
            GACOMMHOST_ATTRIBUTE_ISPREEMPTIBLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9eef3fc8-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_ATTRIBUTE_SCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9eef3fc9-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_ATTRIBUTE_OTHERSCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9eef3fca-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_ATTRIBUTE_SCHEDULE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9eef3fcb-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_ATTRIBUTE_PROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9eef3fcc-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_ATTRIBUTE_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9eef3fcd-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_ATTRIBUTE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9eef3fce-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_ATTRIBUTE_SCHEDULABLERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9eef3fcf-1669-11df-b9be-0014222a9f79");
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
