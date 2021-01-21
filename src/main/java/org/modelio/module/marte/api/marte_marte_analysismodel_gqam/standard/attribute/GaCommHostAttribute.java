/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.attribute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("8185e204-da80-4c85-acd7-8975dd2b38fa")
public class GaCommHostAttribute extends CommunicationMediaAttribute {
    @objid ("7829ec04-8958-4c70-bc6f-f6709ee4a388")
    public static final String STEREOTYPE_NAME = "GaCommHost_Attribute";

    @objid ("1017c0d0-2c7d-4f60-b35a-647741e7ab48")
    public static final String GACOMMHOST_ATTRIBUTE_HOST_TAGTYPE = "GaCommHost_Attribute_host";

    @objid ("a6d5889e-e9dd-4c18-84d0-d35bfe4c125d")
    public static final String GACOMMHOST_ATTRIBUTE_ISPREEMPTIBLE_TAGTYPE = "GaCommHost_Attribute_isPreemptible";

    @objid ("7f27a817-6e88-4596-8e17-082c54f84135")
    public static final String GACOMMHOST_ATTRIBUTE_OTHERSCHEDPOLICY_TAGTYPE = "GaCommHost_Attribute_otherSchedPolicy";

    @objid ("22b0c146-fe63-42b7-afbd-5672ba4b6a35")
    public static final String GACOMMHOST_ATTRIBUTE_PROCESSINGUNITS_TAGTYPE = "GaCommHost_Attribute_processingUnits";

    @objid ("c0b4945c-a0f9-4010-bc6a-27495f452128")
    public static final String GACOMMHOST_ATTRIBUTE_PROTECTEDSHAREDRESOURCES_TAGTYPE = "GaCommHost_Attribute_protectedSharedResources";

    @objid ("5df4e5d8-b619-4666-aac0-00c3b578975f")
    public static final String GACOMMHOST_ATTRIBUTE_SCHEDPOLICY_TAGTYPE = "GaCommHost_Attribute_schedPolicy";

    @objid ("c2f0b88c-afc8-44b1-b4d7-e6aed38461d0")
    public static final String GACOMMHOST_ATTRIBUTE_SCHEDULABLERESOURCES_TAGTYPE = "GaCommHost_Attribute_schedulableResources";

    @objid ("dd6cc6b4-a79b-45fd-a34a-c89f02245e44")
    public static final String GACOMMHOST_ATTRIBUTE_SCHEDULE_TAGTYPE = "GaCommHost_Attribute_schedule";

    @objid ("362e4bcd-6545-4bf6-8ca5-205f2890645c")
    public static final String GACOMMHOST_ATTRIBUTE_THROUGHPUT_TAGTYPE = "GaCommHost_Attribute_throughput";

    @objid ("35d90d27-3e53-4303-b33c-df498dbbcaad")
    public static final String GACOMMHOST_ATTRIBUTE_UTILIZATION_TAGTYPE = "GaCommHost_Attribute_utilization";

    /**
     * Tells whether a {@link GaCommHostAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << GaCommHost_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("bfa7c809-d1af-4b42-97e9-e72c16417392")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaCommHostAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << GaCommHost_Attribute >> then instantiate a {@link GaCommHostAttribute} proxy.
     * 
     * @return a {@link GaCommHostAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("c5b4e313-d55f-4493-b974-0e69e64085cc")
    public static GaCommHostAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaCommHostAttribute.STEREOTYPE_NAME);
        return GaCommHostAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link GaCommHostAttribute} proxy from a {@link Attribute} stereotyped << GaCommHost_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link GaCommHostAttribute} proxy or <i>null</i>.
     */
    @objid ("a982b833-beea-4c79-b870-d81392e2db59")
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
    @objid ("daa283a2-9d10-4571-b7cd-75cd97265c5f")
    public static GaCommHostAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (GaCommHostAttribute.canInstantiate(obj))
        	return new GaCommHostAttribute(obj);
        else
        	throw new IllegalArgumentException("GaCommHostAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("42e31ccc-6653-4a82-aa8d-ff79857ecbfd")
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
    @objid ("d9eebbc4-995d-4ec5-aba8-6a718446e79c")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'GaCommHost_Attribute_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b6656892-e575-4d37-ad5c-443c6707cacc")
    public String getGaCommHost_Attribute_host() {
        return this.elt.getTagValue(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Attribute_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2341e32e-e91f-4253-9015-215722e13c1e")
    public String getGaCommHost_Attribute_otherSchedPolicy() {
        return this.elt.getTagValue(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Attribute_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("add8ae8f-cb86-4659-a6c0-eed63b0e71ab")
    public List<String> getGaCommHost_Attribute_processingUnits() {
        return this.elt.getTagValues(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Attribute_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("7e5a0aa2-17fe-4b2d-b2d7-1909f41a4c56")
    public List<String> getGaCommHost_Attribute_protectedSharedResources() {
        return this.elt.getTagValues(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Attribute_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bc8a713c-a305-4002-95d4-574e1c4725c7")
    public String getGaCommHost_Attribute_schedPolicy() {
        return this.elt.getTagValue(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Attribute_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e709175f-d0f3-4a8e-9ca3-1def672cae7b")
    public List<String> getGaCommHost_Attribute_schedulableResources() {
        return this.elt.getTagValues(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Attribute_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0cd3abc0-f0cf-4771-9514-5bbf8d6ef8a1")
    public String getGaCommHost_Attribute_schedule() {
        return this.elt.getTagValue(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_SCHEDULE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Attribute_throughput'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a5138d34-9d1e-4872-8a1e-34344af0e746")
    public List<String> getGaCommHost_Attribute_throughput() {
        return this.elt.getTagValues(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Attribute_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8512c8a4-8f4a-42c7-93c7-efaf2e6169ca")
    public List<String> getGaCommHost_Attribute_utilization() {
        return this.elt.getTagValues(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("49a76029-a1d4-44e4-879a-0671f0877854")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'GaCommHost_Attribute_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d94f8f03-a0c7-43b2-a73c-c1b092669b92")
    public boolean isGaCommHost_Attribute_isPreemptible() {
        return this.elt.isTagged(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaCommHost_Attribute_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ccace93a-f722-4b32-9ba1-083e0c29b592")
    public void setGaCommHost_Attribute_host(final String value) {
        this.elt.putTagValue(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'GaCommHost_Attribute_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6cbcb7be-5d58-4fcf-855d-ce2f329e6ee2")
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
    @objid ("9ef307ec-fb45-4ef9-9d0a-5b5c5ff3a2f2")
    public void setGaCommHost_Attribute_otherSchedPolicy(final String value) {
        this.elt.putTagValue(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Attribute_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2bb6f84e-8dad-4b06-ac97-fc14ac6fb600")
    public void setGaCommHost_Attribute_processingUnits(final List<String> values) {
        this.elt.putTagValues(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Attribute_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("18749d36-fcf9-41d0-9ca0-a40bcbcf56fb")
    public void setGaCommHost_Attribute_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaCommHost_Attribute_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("948b8828-7fef-48fa-a562-6e99ff162782")
    public void setGaCommHost_Attribute_schedPolicy(final String value) {
        this.elt.putTagValue(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Attribute_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e2f4fd90-59ba-4f15-ae5a-3ee477d94363")
    public void setGaCommHost_Attribute_schedulableResources(final List<String> values) {
        this.elt.putTagValues(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaCommHost_Attribute_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("19be7d39-d2af-41ca-b860-55f32a2dcb24")
    public void setGaCommHost_Attribute_schedule(final String value) {
        this.elt.putTagValue(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_SCHEDULE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Attribute_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cd4de0c3-2ca1-4a96-bf2c-e76e2d4be617")
    public void setGaCommHost_Attribute_throughput(final List<String> values) {
        this.elt.putTagValues(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_THROUGHPUT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Attribute_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("419a43bd-7f8e-47b1-87a0-2f5e1b59b787")
    public void setGaCommHost_Attribute_utilization(final List<String> values) {
        this.elt.putTagValues(GaCommHostAttribute.MdaTypes.GACOMMHOST_ATTRIBUTE_UTILIZATION_TAGTYPE_ELT, values);
    }

    @objid ("177150a2-8458-4251-acb5-6d89025e188e")
    protected GaCommHostAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("4ec5ea52-fcaf-4d8d-b286-c4ff615c8c60")
    public static final class MdaTypes {
        @objid ("90539c3c-173c-45cf-9f50-8166f9fd475c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f322fa20-0e4f-470b-b9ed-4d028ec50ed9")
        public static TagType GACOMMHOST_ATTRIBUTE_THROUGHPUT_TAGTYPE_ELT;

        @objid ("4d2daf5c-2b7a-4575-a4cb-37a5d6cd4d6f")
        public static TagType GACOMMHOST_ATTRIBUTE_UTILIZATION_TAGTYPE_ELT;

        @objid ("9cc6900b-fd7a-413a-9a53-9bd33882b5ef")
        public static TagType GACOMMHOST_ATTRIBUTE_ISPREEMPTIBLE_TAGTYPE_ELT;

        @objid ("1767b5b6-0636-4a51-8219-6d628ba40fa3")
        public static TagType GACOMMHOST_ATTRIBUTE_SCHEDPOLICY_TAGTYPE_ELT;

        @objid ("35e5bc13-267d-456e-ba69-e941795eed23")
        public static TagType GACOMMHOST_ATTRIBUTE_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        @objid ("d2a0f88d-1ff8-489c-96c3-1b5eb2018937")
        public static TagType GACOMMHOST_ATTRIBUTE_SCHEDULE_TAGTYPE_ELT;

        @objid ("843c9a95-18b9-4055-a96e-39c454db722d")
        public static TagType GACOMMHOST_ATTRIBUTE_PROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("4354b7c1-6ce9-45e1-9319-cd1b3a5eff5b")
        public static TagType GACOMMHOST_ATTRIBUTE_HOST_TAGTYPE_ELT;

        @objid ("d725c74c-e00b-4ae1-927e-0fed28a2aa0a")
        public static TagType GACOMMHOST_ATTRIBUTE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        @objid ("7c4e28a3-25f1-4a82-8430-e92ff637b818")
        public static TagType GACOMMHOST_ATTRIBUTE_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        @objid ("247e6cb1-638f-4a59-ae04-37235f413e5e")
        private static Stereotype MDAASSOCDEP;

        @objid ("c69043ad-3438-4984-b43d-b4eb494f86bc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("32ee22d2-a031-4311-b126-247ebc985c42")
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
