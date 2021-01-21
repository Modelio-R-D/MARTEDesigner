/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << Scheduler_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("590dc3dd-7e82-45aa-9e4a-4da7a58ff2dc")
public class SchedulerInstance extends ResourceInstance {
    @objid ("04b0d56d-1bd8-4cd2-a2ee-c946df827eaf")
    public static final String STEREOTYPE_NAME = "Scheduler_Instance";

    @objid ("1257c99c-2621-43ca-b566-8399674b8523")
    public static final String SCHEDULER_INSTANCE_HOST_TAGTYPE = "Scheduler_Instance_host";

    @objid ("33f21d45-7b81-47a4-b9ac-df293466f7a5")
    public static final String SCHEDULER_INSTANCE_ISPREEMPTIBLE_TAGTYPE = "Scheduler_Instance_isPreemptible";

    @objid ("345a2688-9e24-4da8-bf15-5f7fecde9f2a")
    public static final String SCHEDULER_INSTANCE_OTHERSCHEDPOLICY_TAGTYPE = "Scheduler_Instance_otherSchedPolicy";

    @objid ("a8b698f8-b8d3-4893-98fa-9353426eced0")
    public static final String SCHEDULER_INSTANCE_PROCESSINGUNITS_TAGTYPE = "Scheduler_Instance_processingUnits";

    @objid ("2f857e4e-8d12-4226-8e75-fa5c788bd8e1")
    public static final String SCHEDULER_INSTANCE_PROTECTEDSHAREDRESOURCES_TAGTYPE = "Scheduler_Instance_protectedSharedResources";

    @objid ("3d6d8cd0-a4eb-4acf-ad14-60682db33e4d")
    public static final String SCHEDULER_INSTANCE_SCHEDPOLICY_TAGTYPE = "Scheduler_Instance_schedPolicy";

    @objid ("f1b072d9-8bdc-40cc-a7ca-6f62a58e5fbe")
    public static final String SCHEDULER_INSTANCE_SCHEDULABLERESOURCES_TAGTYPE = "Scheduler_Instance_schedulableResources";

    @objid ("f970f15e-ea03-4ca9-bb87-872fae81ef37")
    public static final String SCHEDULER_INSTANCE_SCHEDULE_TAGTYPE = "Scheduler_Instance_schedule";

    /**
     * Tells whether a {@link SchedulerInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << Scheduler_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("37ae9002-43c7-42ae-8c90-956cc15cdf85")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SchedulerInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << Scheduler_Instance >> then instantiate a {@link SchedulerInstance} proxy.
     * 
     * @return a {@link SchedulerInstance} proxy on the created {@link Instance}.
     */
    @objid ("123a2713-4a0e-4a4a-93a5-941035f637be")
    public static SchedulerInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SchedulerInstance.STEREOTYPE_NAME);
        return SchedulerInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link SchedulerInstance} proxy from a {@link Instance} stereotyped << Scheduler_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link SchedulerInstance} proxy or <i>null</i>.
     */
    @objid ("285584aa-3e49-45cd-8256-00656a9fb7f1")
    public static SchedulerInstance instantiate(final Instance obj) {
        return SchedulerInstance.canInstantiate(obj) ? new SchedulerInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SchedulerInstance} proxy from a {@link Instance} stereotyped << Scheduler_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link SchedulerInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("bb94b453-a30f-459e-b6cb-fe51b1f5862c")
    public static SchedulerInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SchedulerInstance.canInstantiate(obj))
        	return new SchedulerInstance(obj);
        else
        	throw new IllegalArgumentException("SchedulerInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("274a8bbb-95b1-49b9-877d-d4ebc96c1caa")
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
        SchedulerInstance other = (SchedulerInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("26a2af07-4ee3-4424-b971-6f77cf956597")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'Scheduler_Instance_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("91d0d2d0-bff5-4d58-bed4-0e4ef534a1bf")
    public String getScheduler_Instance_host() {
        return this.elt.getTagValue(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Instance_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b89b96d4-e706-4d68-ae8a-c448e1340ba4")
    public String getScheduler_Instance_otherSchedPolicy() {
        return this.elt.getTagValue(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Instance_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("63d51759-3f28-4882-b6a8-165958aa90e3")
    public List<String> getScheduler_Instance_processingUnits() {
        return this.elt.getTagValues(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Instance_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1e67aaae-d530-43b9-978c-82be8d933bd5")
    public List<String> getScheduler_Instance_protectedSharedResources() {
        return this.elt.getTagValues(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Instance_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d1fbf474-0584-4fc6-b85e-40564d7ea6a9")
    public String getScheduler_Instance_schedPolicy() {
        return this.elt.getTagValue(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Instance_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6bfbaea0-3d0f-4fb8-836b-51d84e30ea64")
    public List<String> getScheduler_Instance_schedulableResources() {
        return this.elt.getTagValues(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Instance_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("54e34d2f-6bd5-46bb-b61e-4c5ea6286e63")
    public String getScheduler_Instance_schedule() {
        return this.elt.getTagValue(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_SCHEDULE_TAGTYPE_ELT);
    }

    @objid ("0e3a7aab-e90e-47e7-a022-b7bd580c6958")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Scheduler_Instance_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2e9f2eea-7342-4d2a-80a1-32aeab28b850")
    public boolean isScheduler_Instance_isPreemptible() {
        return this.elt.isTagged(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Scheduler_Instance_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2a3d7dd3-1b3e-4297-aa2a-889cc83c2391")
    public void setScheduler_Instance_host(final String value) {
        this.elt.putTagValue(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'Scheduler_Instance_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("93ca2b2b-fe1b-4617-bb5d-f25e1468f142")
    public void setScheduler_Instance_isPreemptible(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_ISPREEMPTIBLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Scheduler_Instance_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("90956486-9f63-470c-8488-7c92a518f38b")
    public void setScheduler_Instance_otherSchedPolicy(final String value) {
        this.elt.putTagValue(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Scheduler_Instance_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2373d12d-94f3-46c0-969f-49849b1013f2")
    public void setScheduler_Instance_processingUnits(final List<String> values) {
        this.elt.putTagValues(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'Scheduler_Instance_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a4690679-6985-4546-9127-d57af5c6bbf2")
    public void setScheduler_Instance_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Scheduler_Instance_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fc1ddc29-d532-4787-8170-732c3cfc1f8f")
    public void setScheduler_Instance_schedPolicy(final String value) {
        this.elt.putTagValue(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Scheduler_Instance_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e48cc984-a188-474c-926c-7bb71c06e275")
    public void setScheduler_Instance_schedulableResources(final List<String> values) {
        this.elt.putTagValues(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Scheduler_Instance_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f9e601b5-61bd-47e2-af30-564b126acfac")
    public void setScheduler_Instance_schedule(final String value) {
        this.elt.putTagValue(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_SCHEDULE_TAGTYPE_ELT, value);
    }

    @objid ("8949f416-06a2-4b44-aeae-0795ad3a49aa")
    protected SchedulerInstance(final Instance elt) {
        super(elt);
    }

    @objid ("73cb0f8c-e603-49ca-aa72-9d92ae0e4884")
    public static final class MdaTypes {
        @objid ("1580f6d0-42c1-4979-ad83-c2b55e6a9d1d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d36fdc72-b0a5-4fcb-91ca-6129ccb9eec5")
        public static TagType SCHEDULER_INSTANCE_ISPREEMPTIBLE_TAGTYPE_ELT;

        @objid ("0c99a27d-babf-43d6-a590-912d1611254d")
        public static TagType SCHEDULER_INSTANCE_SCHEDPOLICY_TAGTYPE_ELT;

        @objid ("bd8ac707-fac4-45dd-961b-420983924ec6")
        public static TagType SCHEDULER_INSTANCE_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        @objid ("04f17a48-994d-468e-8f37-109597bc54f6")
        public static TagType SCHEDULER_INSTANCE_SCHEDULE_TAGTYPE_ELT;

        @objid ("f5b0dbf5-4c82-4506-a71f-a17e243f1a03")
        public static TagType SCHEDULER_INSTANCE_PROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("fbd20e74-1a93-4db2-956f-7faeab8adfd4")
        public static TagType SCHEDULER_INSTANCE_HOST_TAGTYPE_ELT;

        @objid ("599d83f8-dcb5-4e8f-804b-fd3cc9ffa604")
        public static TagType SCHEDULER_INSTANCE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        @objid ("d689a036-00ad-4390-bf78-e9739482ecf1")
        public static TagType SCHEDULER_INSTANCE_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        @objid ("c6efbe2e-6a0f-4f1a-8f9c-cbc7b236c175")
        private static Stereotype MDAASSOCDEP;

        @objid ("7f4bcda0-abe1-4111-89e8-a5cb1ef91fe4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e669bdaf-cf99-4913-9539-5167132a8933")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0025b321-0ccf-11df-8525-001302895b2b");
            SCHEDULER_INSTANCE_ISPREEMPTIBLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0025b328-0ccf-11df-8525-001302895b2b");
            SCHEDULER_INSTANCE_SCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00281574-0ccf-11df-8525-001302895b2b");
            SCHEDULER_INSTANCE_OTHERSCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0028157b-0ccf-11df-8525-001302895b2b");
            SCHEDULER_INSTANCE_SCHEDULE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00281582-0ccf-11df-8525-001302895b2b");
            SCHEDULER_INSTANCE_PROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00281589-0ccf-11df-8525-001302895b2b");
            SCHEDULER_INSTANCE_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00281590-0ccf-11df-8525-001302895b2b");
            SCHEDULER_INSTANCE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00281597-0ccf-11df-8525-001302895b2b");
            SCHEDULER_INSTANCE_SCHEDULABLERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "002a77c2-0ccf-11df-8525-001302895b2b");
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
