/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("8d3eac25-704a-47cf-a852-35fdb36041b0")
    public static final String STEREOTYPE_NAME = "Scheduler_Instance";

    @objid ("80ba3c64-72f5-43f8-806c-27e567da5fb1")
    public static final String SCHEDULER_INSTANCE_HOST_TAGTYPE = "Scheduler_Instance_host";

    @objid ("40d19826-4a1e-45a4-81a0-7f447dde094f")
    public static final String SCHEDULER_INSTANCE_ISPREEMPTIBLE_TAGTYPE = "Scheduler_Instance_isPreemptible";

    @objid ("a7b28f81-8eca-45fa-b31d-cb97e61c67de")
    public static final String SCHEDULER_INSTANCE_OTHERSCHEDPOLICY_TAGTYPE = "Scheduler_Instance_otherSchedPolicy";

    @objid ("28321e53-3d2e-4454-9960-b9035de75737")
    public static final String SCHEDULER_INSTANCE_PROCESSINGUNITS_TAGTYPE = "Scheduler_Instance_processingUnits";

    @objid ("27ba320d-0e4b-44ba-b4ec-c8b1676b7be4")
    public static final String SCHEDULER_INSTANCE_PROTECTEDSHAREDRESOURCES_TAGTYPE = "Scheduler_Instance_protectedSharedResources";

    @objid ("0fcb3065-a752-4adb-b7ab-3488b4d4fb30")
    public static final String SCHEDULER_INSTANCE_SCHEDPOLICY_TAGTYPE = "Scheduler_Instance_schedPolicy";

    @objid ("e758e7bb-82de-4940-b5df-2db0b569b99a")
    public static final String SCHEDULER_INSTANCE_SCHEDULABLERESOURCES_TAGTYPE = "Scheduler_Instance_schedulableResources";

    @objid ("bd2b9917-8463-4877-b15e-75195c52ca18")
    public static final String SCHEDULER_INSTANCE_SCHEDULE_TAGTYPE = "Scheduler_Instance_schedule";

    /**
     * Tells whether a {@link SchedulerInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << Scheduler_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6bd65eff-0aa6-43ad-b9f4-9e69caccc66e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SchedulerInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << Scheduler_Instance >> then instantiate a {@link SchedulerInstance} proxy.
     * 
     * @return a {@link SchedulerInstance} proxy on the created {@link Instance}.
     */
    @objid ("7fb4af35-80a9-4b2c-a1ec-c7ecccd45fd5")
    public static SchedulerInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SchedulerInstance.STEREOTYPE_NAME);
        return SchedulerInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link SchedulerInstance} proxy from a {@link Instance} stereotyped << Scheduler_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link SchedulerInstance} proxy or <i>null</i>.
     */
    @objid ("29998ba7-7185-4047-8f80-b5c4d4a420ca")
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
    @objid ("d2ab487f-f9f0-45e1-bf42-064576a62835")
    public static SchedulerInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SchedulerInstance.canInstantiate(obj))
        	return new SchedulerInstance(obj);
        else
        	throw new IllegalArgumentException("SchedulerInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("845437dd-8d0c-4ae4-8177-431aa717feb7")
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
    @objid ("10debf7e-ca08-4ec9-85d3-0cb6184dd98d")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'Scheduler_Instance_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9cb41ded-f7a2-47c0-bc14-21e9423426e6")
    public String getScheduler_Instance_host() {
        return this.elt.getTagValue(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Instance_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e83a1a3e-9a8a-4ea4-a828-bf65a7fd0872")
    public String getScheduler_Instance_otherSchedPolicy() {
        return this.elt.getTagValue(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Instance_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("37f83f51-da37-4671-a08f-4b77abb58767")
    public List<String> getScheduler_Instance_processingUnits() {
        return this.elt.getTagValues(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Instance_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("458d746a-1b68-4aec-a8cf-4f987cb29516")
    public List<String> getScheduler_Instance_protectedSharedResources() {
        return this.elt.getTagValues(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Instance_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("600dbeb1-910f-45c0-86da-ba3b828e8d47")
    public String getScheduler_Instance_schedPolicy() {
        return this.elt.getTagValue(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Instance_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("88dca763-30c4-490f-9ad3-2c55a37cab94")
    public List<String> getScheduler_Instance_schedulableResources() {
        return this.elt.getTagValues(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Instance_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2f7d10e6-eba1-43ff-b21f-bee6720d8762")
    public String getScheduler_Instance_schedule() {
        return this.elt.getTagValue(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_SCHEDULE_TAGTYPE_ELT);
    }

    @objid ("630554a7-dc95-4570-bba4-049c5b7ae2b0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Scheduler_Instance_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cc5eeabf-2be1-4338-82c9-7ac9621fa7d8")
    public boolean isScheduler_Instance_isPreemptible() {
        return this.elt.isTagged(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Scheduler_Instance_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("51a9fbd2-405a-47c7-8612-2c9eb1312644")
    public void setScheduler_Instance_host(final String value) {
        this.elt.putTagValue(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'Scheduler_Instance_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b2804d1f-9054-4501-8db3-5775608bb214")
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
    @objid ("ea18e159-c73d-4188-bd2b-bf20fe913399")
    public void setScheduler_Instance_otherSchedPolicy(final String value) {
        this.elt.putTagValue(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Scheduler_Instance_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d4f6b363-26aa-4e3d-b2f2-89a2eef7263d")
    public void setScheduler_Instance_processingUnits(final List<String> values) {
        this.elt.putTagValues(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'Scheduler_Instance_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7953f542-6b06-4853-b518-2ad3568289db")
    public void setScheduler_Instance_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Scheduler_Instance_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("90886866-c1fa-4eb8-a4ed-170d8a0de60d")
    public void setScheduler_Instance_schedPolicy(final String value) {
        this.elt.putTagValue(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Scheduler_Instance_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8e18d605-0302-43ce-a9c5-b5e0db2c277c")
    public void setScheduler_Instance_schedulableResources(final List<String> values) {
        this.elt.putTagValues(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Scheduler_Instance_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("821c9bf8-22a8-42b4-b1ec-a6890e5ce9dd")
    public void setScheduler_Instance_schedule(final String value) {
        this.elt.putTagValue(SchedulerInstance.MdaTypes.SCHEDULER_INSTANCE_SCHEDULE_TAGTYPE_ELT, value);
    }

    @objid ("3b9c0b65-e83d-4f7f-8db2-6ea81d4e9bb1")
    protected SchedulerInstance(final Instance elt) {
        super(elt);
    }

    @objid ("73cb0f8c-e603-49ca-aa72-9d92ae0e4884")
    public static final class MdaTypes {
        @objid ("150dcbf7-1db5-45aa-a06b-36ab78c94b88")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("daef8876-4058-47be-9b10-10b82fb98190")
        public static TagType SCHEDULER_INSTANCE_ISPREEMPTIBLE_TAGTYPE_ELT;

        @objid ("ac401fda-d6ca-41dc-833e-c9a2366bb8e6")
        public static TagType SCHEDULER_INSTANCE_SCHEDPOLICY_TAGTYPE_ELT;

        @objid ("631c719c-9e38-4d08-95ab-6ae4dc85bf11")
        public static TagType SCHEDULER_INSTANCE_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        @objid ("c250c133-78ac-42c0-b2e3-ba34a384ad4c")
        public static TagType SCHEDULER_INSTANCE_SCHEDULE_TAGTYPE_ELT;

        @objid ("1548903a-415e-4130-8bde-92eafcf48f68")
        public static TagType SCHEDULER_INSTANCE_PROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("7c3161c5-498a-430a-8679-c5062f1e0359")
        public static TagType SCHEDULER_INSTANCE_HOST_TAGTYPE_ELT;

        @objid ("5098fd74-0e8d-4234-a946-9a278a794842")
        public static TagType SCHEDULER_INSTANCE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        @objid ("e4063fe7-954d-44f5-b8e8-3a8767e4174c")
        public static TagType SCHEDULER_INSTANCE_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        @objid ("e656eb9f-0aba-42da-838d-d70b36cd88f4")
        private static Stereotype MDAASSOCDEP;

        @objid ("cace055e-45ff-4e0e-8fc3-9333ee02f492")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4c360046-5553-46d3-a488-d48e2ccee9a3")
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
