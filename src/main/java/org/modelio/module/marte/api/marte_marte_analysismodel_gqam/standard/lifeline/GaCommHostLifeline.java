/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("ed2f317a-ef8b-4b13-81bd-47ad1f646325")
public class GaCommHostLifeline extends CommunicationMediaLifeline {
    @objid ("1e5a82d2-9159-4a18-98fa-f2985fd59b67")
    public static final String STEREOTYPE_NAME = "GaCommHost_Lifeline";

    @objid ("0b62f28a-73fc-43dc-81cb-a5399f4618c6")
    public static final String GACOMMHOST_LIFELINE_HOST_TAGTYPE = "GaCommHost_Lifeline_host";

    @objid ("80ba525c-093a-4179-94e7-0c392d648f44")
    public static final String GACOMMHOST_LIFELINE_ISPREEMPTIBLE_TAGTYPE = "GaCommHost_Lifeline_isPreemptible";

    @objid ("ec507e33-71f8-4c77-a8a8-023185faeded")
    public static final String GACOMMHOST_LIFELINE_OTHERSCHEDPOLICY_TAGTYPE = "GaCommHost_Lifeline_otherSchedPolicy";

    @objid ("5cf08d45-68a2-43b4-8511-556c85f663d8")
    public static final String GACOMMHOST_LIFELINE_PROCESSINGUNITS_TAGTYPE = "GaCommHost_Lifeline_processingUnits";

    @objid ("09f77e66-04e3-4c97-b87b-a7515f1031a6")
    public static final String GACOMMHOST_LIFELINE_PROTECTEDSHAREDRESOURCES_TAGTYPE = "GaCommHost_Lifeline_protectedSharedResources";

    @objid ("63bb86d7-6c12-487e-8f27-3d0162580e27")
    public static final String GACOMMHOST_LIFELINE_SCHEDPOLICY_TAGTYPE = "GaCommHost_Lifeline_schedPolicy";

    @objid ("63c4d54e-a915-4ef2-8d7c-6b0032bb93c4")
    public static final String GACOMMHOST_LIFELINE_SCHEDULABLERESOURCES_TAGTYPE = "GaCommHost_Lifeline_schedulableResources";

    @objid ("67e272c3-f8d7-46e7-8a5b-d763b873b947")
    public static final String GACOMMHOST_LIFELINE_SCHEDULE_TAGTYPE = "GaCommHost_Lifeline_schedule";

    @objid ("89844c4c-efa2-488d-b570-e023a3382974")
    public static final String GACOMMHOST_LIFELINE_THROUGHPUT_TAGTYPE = "GaCommHost_Lifeline_throughput";

    @objid ("64518935-d0cf-4e4e-a672-b0ca48ada3be")
    public static final String GACOMMHOST_LIFELINE_UTILIZATION_TAGTYPE = "GaCommHost_Lifeline_utilization";

    /**
     * Tells whether a {@link GaCommHostLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << GaCommHost_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("97509209-51e1-4107-a20d-6c730d2f64fb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaCommHostLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << GaCommHost_Lifeline >> then instantiate a {@link GaCommHostLifeline} proxy.
     * 
     * @return a {@link GaCommHostLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("dd04c91b-6df9-4c2c-a8b4-9e4371a83939")
    public static GaCommHostLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaCommHostLifeline.STEREOTYPE_NAME);
        return GaCommHostLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link GaCommHostLifeline} proxy from a {@link Lifeline} stereotyped << GaCommHost_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link GaCommHostLifeline} proxy or <i>null</i>.
     */
    @objid ("a2f422e8-623b-4717-9a62-b2eeaf7c9486")
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
    @objid ("b903f6a8-aaf0-4918-a4f7-d2a8b6f74c45")
    public static GaCommHostLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (GaCommHostLifeline.canInstantiate(obj))
        	return new GaCommHostLifeline(obj);
        else
        	throw new IllegalArgumentException("GaCommHostLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f432bcda-63a6-4faf-985d-a01d529d6da9")
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
    @objid ("1cbae24c-73f2-4538-baeb-f4234f2d192d")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'GaCommHost_Lifeline_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a941a780-484c-417b-aa2f-7eb35b3502d8")
    public String getGaCommHost_Lifeline_host() {
        return this.elt.getTagValue(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Lifeline_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1d5ba329-15e8-4853-a714-2142da99b708")
    public String getGaCommHost_Lifeline_otherSchedPolicy() {
        return this.elt.getTagValue(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Lifeline_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("7c4d10e9-babf-434f-b5fe-79d663de1831")
    public List<String> getGaCommHost_Lifeline_processingUnits() {
        return this.elt.getTagValues(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Lifeline_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b6f47a7a-37d2-4fed-9829-13aa2e7126d8")
    public List<String> getGaCommHost_Lifeline_protectedSharedResources() {
        return this.elt.getTagValues(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Lifeline_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("66159b29-f393-4c59-9ea6-c8cc50e93ac2")
    public String getGaCommHost_Lifeline_schedPolicy() {
        return this.elt.getTagValue(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Lifeline_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("23326c66-9ec7-444a-bbe9-b55e8e2ab9e7")
    public List<String> getGaCommHost_Lifeline_schedulableResources() {
        return this.elt.getTagValues(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Lifeline_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7d9c240c-b75e-4ffa-abdb-cc0606475858")
    public String getGaCommHost_Lifeline_schedule() {
        return this.elt.getTagValue(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_SCHEDULE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Lifeline_throughput'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("23c83929-8609-4f0d-b8b3-3606a6c320ec")
    public List<String> getGaCommHost_Lifeline_throughput() {
        return this.elt.getTagValues(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Lifeline_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ea2335c4-f831-42bf-b997-9fcf26c63a60")
    public List<String> getGaCommHost_Lifeline_utilization() {
        return this.elt.getTagValues(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("88ddf135-41d8-46cc-b5d8-1759c0850a95")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'GaCommHost_Lifeline_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dc831786-6ec7-4336-90e1-92602a877c32")
    public boolean isGaCommHost_Lifeline_isPreemptible() {
        return this.elt.isTagged(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaCommHost_Lifeline_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c373ec6b-5d42-47a0-8709-9412ae6311e2")
    public void setGaCommHost_Lifeline_host(final String value) {
        this.elt.putTagValue(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'GaCommHost_Lifeline_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7e487f24-0282-4cb7-afde-00854fc8aadd")
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
    @objid ("1e1438ff-725a-43eb-b69e-c1fa49ffeea7")
    public void setGaCommHost_Lifeline_otherSchedPolicy(final String value) {
        this.elt.putTagValue(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Lifeline_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d12feb34-645a-45bb-8563-390375319ce4")
    public void setGaCommHost_Lifeline_processingUnits(final List<String> values) {
        this.elt.putTagValues(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Lifeline_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9e80b490-c347-47e3-a773-2393789e6778")
    public void setGaCommHost_Lifeline_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaCommHost_Lifeline_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("80e23650-d2d1-4929-be0f-ed7c856a4bb6")
    public void setGaCommHost_Lifeline_schedPolicy(final String value) {
        this.elt.putTagValue(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Lifeline_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("94066ff6-33b5-42b4-a0f1-78424f88760e")
    public void setGaCommHost_Lifeline_schedulableResources(final List<String> values) {
        this.elt.putTagValues(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaCommHost_Lifeline_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f59ecf21-279a-4f89-8f33-d612304817b8")
    public void setGaCommHost_Lifeline_schedule(final String value) {
        this.elt.putTagValue(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_SCHEDULE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Lifeline_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f6a5ac75-e06c-45a8-ac54-cab1e5860a66")
    public void setGaCommHost_Lifeline_throughput(final List<String> values) {
        this.elt.putTagValues(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_THROUGHPUT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Lifeline_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7b6f5768-7175-4af9-a4fb-264703ce70fc")
    public void setGaCommHost_Lifeline_utilization(final List<String> values) {
        this.elt.putTagValues(GaCommHostLifeline.MdaTypes.GACOMMHOST_LIFELINE_UTILIZATION_TAGTYPE_ELT, values);
    }

    @objid ("8ddbe1da-0fc5-4234-9ba0-98948aef2f09")
    protected GaCommHostLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("d7badf2b-94a6-4030-98ad-bb985e050122")
    public static final class MdaTypes {
        @objid ("b6a3d3d9-3e3a-432f-b870-0eaf5b2949d5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c6fe1a40-497c-49de-b2ad-67a342482fe8")
        public static TagType GACOMMHOST_LIFELINE_THROUGHPUT_TAGTYPE_ELT;

        @objid ("539a8065-789c-46d4-9da6-50afc58cb182")
        public static TagType GACOMMHOST_LIFELINE_UTILIZATION_TAGTYPE_ELT;

        @objid ("2fac6cba-2b40-40d0-abcf-03db1412a193")
        public static TagType GACOMMHOST_LIFELINE_ISPREEMPTIBLE_TAGTYPE_ELT;

        @objid ("5045b2bd-5733-4624-ac73-f3ea4552474a")
        public static TagType GACOMMHOST_LIFELINE_SCHEDPOLICY_TAGTYPE_ELT;

        @objid ("ed189b3d-d2b7-42fd-9370-55ef69a19853")
        public static TagType GACOMMHOST_LIFELINE_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        @objid ("2e1e8f27-fb64-45f8-8003-02e95ef672f5")
        public static TagType GACOMMHOST_LIFELINE_SCHEDULE_TAGTYPE_ELT;

        @objid ("939ae66a-7111-4b7f-ba8d-7d0b8f07cc7d")
        public static TagType GACOMMHOST_LIFELINE_PROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("da39bf9c-fe28-47e2-bd8e-b7ff56029087")
        public static TagType GACOMMHOST_LIFELINE_HOST_TAGTYPE_ELT;

        @objid ("2c1d3c7e-14a2-41df-8385-c3200be799ac")
        public static TagType GACOMMHOST_LIFELINE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        @objid ("a63a2be3-19d0-4c64-9630-4319681586fa")
        public static TagType GACOMMHOST_LIFELINE_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        @objid ("93532434-4acf-46c9-8a41-00ae6241c2aa")
        private static Stereotype MDAASSOCDEP;

        @objid ("1c0b88ab-b5e9-4f96-a510-b3c80cc5a13e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("93417775-a90c-4327-9883-9478bab20975")
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
