/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.parameter;

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
@objid ("0b624b8b-06b1-4801-8417-b4cfeb0d3fd5")
public class GaCommHostParameter extends CommunicationMediaParameter {
    @objid ("0662597f-47fe-404e-bf19-1ee589c26372")
    public static final String STEREOTYPE_NAME = "GaCommHost_Parameter";

    @objid ("49962d97-1344-4de6-9fd6-c4b5d64db587")
    public static final String GACOMMHOST_PARAMETER_HOST_TAGTYPE = "GaCommHost_Parameter_host";

    @objid ("e513b0b7-423a-4066-9086-d3e6b232606c")
    public static final String GACOMMHOST_PARAMETER_ISPREEMPTIBLE_TAGTYPE = "GaCommHost_Parameter_isPreemptible";

    @objid ("d032b49f-62bc-469d-9d9c-8976458baaf8")
    public static final String GACOMMHOST_PARAMETER_OTHERSCHEDPOLICY_TAGTYPE = "GaCommHost_Parameter_otherSchedPolicy";

    @objid ("6d90f524-bffd-4f2c-bf27-a63ee830b470")
    public static final String GACOMMHOST_PARAMETER_PROCESSINGUNITS_TAGTYPE = "GaCommHost_Parameter_processingUnits";

    @objid ("edf63f3e-e8f7-4900-9709-d586a83efc65")
    public static final String GACOMMHOST_PARAMETER_PROTECTEDSHAREDRESOURCES_TAGTYPE = "GaCommHost_Parameter_protectedSharedResources";

    @objid ("dfbd050c-37df-4c10-9c74-8c3adcdd036d")
    public static final String GACOMMHOST_PARAMETER_SCHEDPOLICY_TAGTYPE = "GaCommHost_Parameter_schedPolicy";

    @objid ("b3526bfe-5413-4b41-9aa6-058e2d5cfb72")
    public static final String GACOMMHOST_PARAMETER_SCHEDULABLERESOURCES_TAGTYPE = "GaCommHost_Parameter_schedulableResources";

    @objid ("eff1c137-1ec8-464d-b831-f721aa3af017")
    public static final String GACOMMHOST_PARAMETER_SCHEDULE_TAGTYPE = "GaCommHost_Parameter_schedule";

    @objid ("af96e4c1-9cd4-411d-839a-fddecd1277b0")
    public static final String GACOMMHOST_PARAMETER_THROUGHPUT_TAGTYPE = "GaCommHost_Parameter_throughput";

    @objid ("c84dab5e-6c20-4704-902f-67d33d288481")
    public static final String GACOMMHOST_PARAMETER_UTILIZATION_TAGTYPE = "GaCommHost_Parameter_utilization";

    /**
     * Tells whether a {@link GaCommHostParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << GaCommHost_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("d0153d54-a43b-4d51-b1ed-5916ff8ffffc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaCommHostParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << GaCommHost_Parameter >> then instantiate a {@link GaCommHostParameter} proxy.
     * 
     * @return a {@link GaCommHostParameter} proxy on the created {@link Parameter}.
     */
    @objid ("e9634a54-6fbb-43c7-bf58-f7108e7cd590")
    public static GaCommHostParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaCommHostParameter.STEREOTYPE_NAME);
        return GaCommHostParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link GaCommHostParameter} proxy from a {@link Parameter} stereotyped << GaCommHost_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link GaCommHostParameter} proxy or <i>null</i>.
     */
    @objid ("2ff3ff3b-bf04-4880-80c2-e945ab0f8ae4")
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
    @objid ("62989950-9b42-4a1a-b691-36fbd394ef55")
    public static GaCommHostParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (GaCommHostParameter.canInstantiate(obj))
        	return new GaCommHostParameter(obj);
        else
        	throw new IllegalArgumentException("GaCommHostParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("475c176a-2cbe-4f39-94e5-cd7ab0c267d9")
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
    @objid ("fffe6558-de0a-4d66-9b00-660ab4cc53d9")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'GaCommHost_Parameter_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8f53ecbc-a6e5-4e3b-a724-94c778fac11c")
    public String getGaCommHost_Parameter_host() {
        return this.elt.getTagValue(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Parameter_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9055268d-4062-4bd8-a5ce-a341bb5058b0")
    public String getGaCommHost_Parameter_otherSchedPolicy() {
        return this.elt.getTagValue(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Parameter_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ebd59ed7-b549-4fee-bacc-e2c205dacd9d")
    public List<String> getGaCommHost_Parameter_processingUnits() {
        return this.elt.getTagValues(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Parameter_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("55571aa2-e099-441d-acf1-ff68e5d37694")
    public List<String> getGaCommHost_Parameter_protectedSharedResources() {
        return this.elt.getTagValues(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Parameter_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("04e893fd-f7bf-454f-b680-b80b69a59a6b")
    public String getGaCommHost_Parameter_schedPolicy() {
        return this.elt.getTagValue(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Parameter_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c6413cf2-c241-4687-816c-7166a8e96ef4")
    public List<String> getGaCommHost_Parameter_schedulableResources() {
        return this.elt.getTagValues(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Parameter_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("95129cce-7cdb-4fcb-96ad-e956aa3fe34f")
    public String getGaCommHost_Parameter_schedule() {
        return this.elt.getTagValue(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_SCHEDULE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Parameter_throughput'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b210f0ee-3949-4360-a7be-0004b4f8a725")
    public List<String> getGaCommHost_Parameter_throughput() {
        return this.elt.getTagValues(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Parameter_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("89b44b0b-7d0b-4812-ad25-b80fcad43110")
    public List<String> getGaCommHost_Parameter_utilization() {
        return this.elt.getTagValues(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("e2507256-4a47-49f5-89a1-3bcfcd8a1812")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'GaCommHost_Parameter_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("96ad5d8a-116b-4f2f-8d53-a1da0e79bdc0")
    public boolean isGaCommHost_Parameter_isPreemptible() {
        return this.elt.isTagged(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaCommHost_Parameter_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b89c47fa-efe5-4f71-ad95-6419ca15b984")
    public void setGaCommHost_Parameter_host(final String value) {
        this.elt.putTagValue(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'GaCommHost_Parameter_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7c53827e-0e42-45cf-ba9e-0e6800577edc")
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
    @objid ("2fd85496-53fc-4263-bc11-fb61c33acce4")
    public void setGaCommHost_Parameter_otherSchedPolicy(final String value) {
        this.elt.putTagValue(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Parameter_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4a5cf840-432c-4f7b-b08d-2e7493151c13")
    public void setGaCommHost_Parameter_processingUnits(final List<String> values) {
        this.elt.putTagValues(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Parameter_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2620acc0-6939-421f-b274-82aa3efb3a84")
    public void setGaCommHost_Parameter_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaCommHost_Parameter_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1fbca913-8ed2-4eb9-9e00-a7962c21d08f")
    public void setGaCommHost_Parameter_schedPolicy(final String value) {
        this.elt.putTagValue(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Parameter_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cfdaaa27-4f00-49c1-aadf-7a8a69e675f8")
    public void setGaCommHost_Parameter_schedulableResources(final List<String> values) {
        this.elt.putTagValues(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaCommHost_Parameter_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dd7e45af-c57e-4881-88a3-345c2d6fb6cb")
    public void setGaCommHost_Parameter_schedule(final String value) {
        this.elt.putTagValue(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_SCHEDULE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Parameter_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6d62884d-1083-4bae-a9e8-f376ec5fc4d3")
    public void setGaCommHost_Parameter_throughput(final List<String> values) {
        this.elt.putTagValues(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_THROUGHPUT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Parameter_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2e017680-bdb8-4df1-a060-89958ef8cba2")
    public void setGaCommHost_Parameter_utilization(final List<String> values) {
        this.elt.putTagValues(GaCommHostParameter.MdaTypes.GACOMMHOST_PARAMETER_UTILIZATION_TAGTYPE_ELT, values);
    }

    @objid ("73b2e15d-0351-4b0e-a06f-e1fbed3180ad")
    protected GaCommHostParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("dbc1960a-164f-48ac-a428-3d76781d28ae")
    public static final class MdaTypes {
        @objid ("e443174b-d0bd-4fab-b13d-e210d1b7234a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b1b8706c-d719-46df-8482-467f19bebe14")
        public static TagType GACOMMHOST_PARAMETER_THROUGHPUT_TAGTYPE_ELT;

        @objid ("b0da8f07-8db9-4951-8d73-07e7960256c6")
        public static TagType GACOMMHOST_PARAMETER_UTILIZATION_TAGTYPE_ELT;

        @objid ("f69160f2-b6cb-456e-9d99-f9f750f648d4")
        public static TagType GACOMMHOST_PARAMETER_ISPREEMPTIBLE_TAGTYPE_ELT;

        @objid ("99aa504a-8269-431d-a998-f8911fdc0853")
        public static TagType GACOMMHOST_PARAMETER_SCHEDPOLICY_TAGTYPE_ELT;

        @objid ("a3041495-8f56-4323-bf1a-79b4bd427eba")
        public static TagType GACOMMHOST_PARAMETER_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        @objid ("455f4a62-d0cd-4c4b-bbab-1f48d82c6cb1")
        public static TagType GACOMMHOST_PARAMETER_SCHEDULE_TAGTYPE_ELT;

        @objid ("4de151fb-7fb7-425d-b417-125cd8a7df96")
        public static TagType GACOMMHOST_PARAMETER_PROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("742ef54b-63df-41aa-aa0a-69b9d139b4a9")
        public static TagType GACOMMHOST_PARAMETER_HOST_TAGTYPE_ELT;

        @objid ("15633aaa-efd4-4d18-a17f-d7f6f6d703fa")
        public static TagType GACOMMHOST_PARAMETER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        @objid ("46d92c82-f7a0-466d-a3d8-9ef12b2ae6e5")
        public static TagType GACOMMHOST_PARAMETER_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        @objid ("9bbf8222-3e9b-44cb-a2bf-4b56b2eac6ef")
        private static Stereotype MDAASSOCDEP;

        @objid ("1eb144e3-e8a9-4946-b8fa-64b15b2a50b0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("672b421f-bcd7-46de-a789-de01c4ec725f")
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
