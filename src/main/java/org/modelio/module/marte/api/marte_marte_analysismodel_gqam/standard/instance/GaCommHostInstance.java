/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.instance;

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
@objid ("adb79592-b89a-4928-8d1f-a714ecbf7803")
public class GaCommHostInstance extends CommunicationMediaInstance {
    @objid ("b0441f11-1b68-42ce-8092-6c1c26278ac4")
    public static final String STEREOTYPE_NAME = "GaCommHost_Instance";

    @objid ("f10de5c6-ad8a-44fc-82e5-9996b284e5b7")
    public static final String GACOMMHOST_INSTANCE_HOST_TAGTYPE = "GaCommHost_Instance_host";

    @objid ("8bd1674a-8a73-4f14-b064-05e254844fe4")
    public static final String GACOMMHOST_INSTANCE_ISPREEMPTIBLE_TAGTYPE = "GaCommHost_Instance_isPreemptible";

    @objid ("cad0b6cf-9811-459e-b39a-7338c6a443f5")
    public static final String GACOMMHOST_INSTANCE_OTHERSCHEDPOLICY_TAGTYPE = "GaCommHost_Instance_otherSchedPolicy";

    @objid ("4c090a82-2f05-4990-8d0a-489d3dbae5d4")
    public static final String GACOMMHOST_INSTANCE_PROCESSINGUNITS_TAGTYPE = "GaCommHost_Instance_processingUnits";

    @objid ("475d6733-ce86-4b8c-a398-c2a7f42fb32e")
    public static final String GACOMMHOST_INSTANCE_PROTECTEDSHAREDRESOURCES_TAGTYPE = "GaCommHost_Instance_protectedSharedResources";

    @objid ("d1f04e28-ae5d-428d-bdc0-7da112a1e887")
    public static final String GACOMMHOST_INSTANCE_SCHEDPOLICY_TAGTYPE = "GaCommHost_Instance_schedPolicy";

    @objid ("aafaad9c-6ae6-4c04-932e-7afacadb204b")
    public static final String GACOMMHOST_INSTANCE_SCHEDULABLERESOURCES_TAGTYPE = "GaCommHost_Instance_schedulableResources";

    @objid ("246f5480-0466-4c77-8a52-0cd1cedfe345")
    public static final String GACOMMHOST_INSTANCE_SCHEDULE_TAGTYPE = "GaCommHost_Instance_schedule";

    @objid ("0ac5216d-0f76-4554-a634-6947f15c72db")
    public static final String GACOMMHOST_INSTANCE_THROUGHPUT_TAGTYPE = "GaCommHost_Instance_throughput";

    @objid ("d79800fd-efee-470c-bd9c-f08db7066e87")
    public static final String GACOMMHOST_INSTANCE_UTILIZATION_TAGTYPE = "GaCommHost_Instance_utilization";

    /**
     * Tells whether a {@link GaCommHostInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << GaCommHost_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("f447fb1f-3f92-4d0b-9a8b-d21b900795e6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaCommHostInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << GaCommHost_Instance >> then instantiate a {@link GaCommHostInstance} proxy.
     * 
     * @return a {@link GaCommHostInstance} proxy on the created {@link Instance}.
     */
    @objid ("611689c2-469e-43ae-ae0c-a2559e0834a9")
    public static GaCommHostInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaCommHostInstance.STEREOTYPE_NAME);
        return GaCommHostInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link GaCommHostInstance} proxy from a {@link Instance} stereotyped << GaCommHost_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link GaCommHostInstance} proxy or <i>null</i>.
     */
    @objid ("be9b12ef-bf46-4ebb-b301-142c6778ffc6")
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
    @objid ("b1bc349a-88e2-462d-b725-7cae9d9170f2")
    public static GaCommHostInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (GaCommHostInstance.canInstantiate(obj))
        	return new GaCommHostInstance(obj);
        else
        	throw new IllegalArgumentException("GaCommHostInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a6a49fbe-2182-4c34-9ded-8de00317d56e")
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
    @objid ("8076f53a-2964-4637-a4bb-bb3197bf0a63")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'GaCommHost_Instance_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f927f68a-1d08-421d-bf7a-9fde310e84e9")
    public String getGaCommHost_Instance_host() {
        return this.elt.getTagValue(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Instance_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c7766f1b-7586-461a-9d04-a1a7db6fb206")
    public String getGaCommHost_Instance_otherSchedPolicy() {
        return this.elt.getTagValue(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Instance_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b4874bc6-e2d7-4bd1-b98b-3e5c6c31968d")
    public List<String> getGaCommHost_Instance_processingUnits() {
        return this.elt.getTagValues(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Instance_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4e7a0ce8-8f87-4ec9-9b17-43a4a433a594")
    public List<String> getGaCommHost_Instance_protectedSharedResources() {
        return this.elt.getTagValues(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Instance_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("194e6924-d561-4028-b23c-8d6fb9a4e45e")
    public String getGaCommHost_Instance_schedPolicy() {
        return this.elt.getTagValue(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Instance_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ceb8dcd4-0435-4884-95da-b3db04387750")
    public List<String> getGaCommHost_Instance_schedulableResources() {
        return this.elt.getTagValues(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Instance_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b5a73c69-0e89-431b-ae80-9ac891075645")
    public String getGaCommHost_Instance_schedule() {
        return this.elt.getTagValue(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_SCHEDULE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Instance_throughput'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a3cc339e-8b6e-4d52-a2f2-12baf783b61d")
    public List<String> getGaCommHost_Instance_throughput() {
        return this.elt.getTagValues(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Instance_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d47e697f-06cd-4416-bb24-3381a20bd7f9")
    public List<String> getGaCommHost_Instance_utilization() {
        return this.elt.getTagValues(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("0e20fe41-b8fd-479f-8827-b1432cb002b9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'GaCommHost_Instance_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cb426bfc-51c5-4911-ac6c-4d1e65aaa4b3")
    public boolean isGaCommHost_Instance_isPreemptible() {
        return this.elt.isTagged(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaCommHost_Instance_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a2cea19f-dc8a-485b-963f-198cb854153f")
    public void setGaCommHost_Instance_host(final String value) {
        this.elt.putTagValue(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'GaCommHost_Instance_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0830b91c-4f5b-415b-b2dc-a9c61cdc1e22")
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
    @objid ("de8d8149-b38b-433b-b947-9b18a568234e")
    public void setGaCommHost_Instance_otherSchedPolicy(final String value) {
        this.elt.putTagValue(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Instance_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9fc3a014-76f8-4fe2-8d8e-78bfe795ee46")
    public void setGaCommHost_Instance_processingUnits(final List<String> values) {
        this.elt.putTagValues(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Instance_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("89a74455-5efa-4d05-8e99-cb863fe54df8")
    public void setGaCommHost_Instance_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaCommHost_Instance_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6789f730-3656-4032-9e69-c886755a40a7")
    public void setGaCommHost_Instance_schedPolicy(final String value) {
        this.elt.putTagValue(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Instance_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ea3292cb-92cb-4fae-b5ad-10b14b3f20ff")
    public void setGaCommHost_Instance_schedulableResources(final List<String> values) {
        this.elt.putTagValues(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaCommHost_Instance_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("14dfab8b-f0a0-4538-b57a-c51fb368f6e0")
    public void setGaCommHost_Instance_schedule(final String value) {
        this.elt.putTagValue(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_SCHEDULE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Instance_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("089cd2fc-581f-410b-a053-2b3d10c9c648")
    public void setGaCommHost_Instance_throughput(final List<String> values) {
        this.elt.putTagValues(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_THROUGHPUT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Instance_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("730389a1-d6b8-4c72-b865-06d324807c8b")
    public void setGaCommHost_Instance_utilization(final List<String> values) {
        this.elt.putTagValues(GaCommHostInstance.MdaTypes.GACOMMHOST_INSTANCE_UTILIZATION_TAGTYPE_ELT, values);
    }

    @objid ("4d49f366-e97d-4bc4-804f-63532421c32f")
    protected GaCommHostInstance(final Instance elt) {
        super(elt);
    }

    @objid ("3478147f-9b7e-40c7-9873-4ba8d2b9596b")
    public static final class MdaTypes {
        @objid ("480f275a-b68e-49a0-9049-d04baff3c77f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("15303827-d14a-42cd-939d-c13e3295d4ad")
        public static TagType GACOMMHOST_INSTANCE_THROUGHPUT_TAGTYPE_ELT;

        @objid ("ab2571e7-ae3a-4d14-af0e-099227cccd1d")
        public static TagType GACOMMHOST_INSTANCE_UTILIZATION_TAGTYPE_ELT;

        @objid ("66f6e832-c26e-4433-ba1d-e4a2729ca53e")
        public static TagType GACOMMHOST_INSTANCE_ISPREEMPTIBLE_TAGTYPE_ELT;

        @objid ("ed38e30c-27fa-48dd-9763-206f8b9fcd5c")
        public static TagType GACOMMHOST_INSTANCE_SCHEDPOLICY_TAGTYPE_ELT;

        @objid ("6b7e0e00-9ddb-42b2-8fbe-365047ed5c00")
        public static TagType GACOMMHOST_INSTANCE_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        @objid ("f3a82425-9e17-4922-ae1a-aba28678148c")
        public static TagType GACOMMHOST_INSTANCE_SCHEDULE_TAGTYPE_ELT;

        @objid ("b2e3b84e-3b19-4c93-8237-046280edcd82")
        public static TagType GACOMMHOST_INSTANCE_PROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("a81a2465-26fb-4652-9675-52e47fbf0bc6")
        public static TagType GACOMMHOST_INSTANCE_HOST_TAGTYPE_ELT;

        @objid ("ce4980e4-180b-48fe-af38-4ea97518976c")
        public static TagType GACOMMHOST_INSTANCE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        @objid ("752adf15-7735-4615-8c2d-e4ea2b30c819")
        public static TagType GACOMMHOST_INSTANCE_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        @objid ("1fd2b670-d6c8-4318-9861-3947a7798942")
        private static Stereotype MDAASSOCDEP;

        @objid ("faa243b5-d599-4831-bc35-244f46fc1543")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("88dcdf7e-b599-42bc-8909-66a417709de9")
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
