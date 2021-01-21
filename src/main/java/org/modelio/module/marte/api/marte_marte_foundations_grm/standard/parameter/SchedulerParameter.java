/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << Scheduler_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("76d1a08e-7a93-4f9b-8997-bea2939ea791")
public class SchedulerParameter extends ResourceParameter {
    @objid ("95c1d1e8-67de-4925-a123-f5a0bd41d99c")
    public static final String STEREOTYPE_NAME = "Scheduler_Parameter";

    @objid ("2c2c5a85-b87a-4d81-9388-76ff18e24483")
    public static final String SCHEDULER_PARAMETER_HOST_TAGTYPE = "Scheduler_Parameter_host";

    @objid ("bbb4e103-3114-4975-b2f2-b6669eebc92c")
    public static final String SCHEDULER_PARAMETER_ISPREEMPTIBLE_TAGTYPE = "Scheduler_Parameter_isPreemptible";

    @objid ("8afce1af-e5d7-438a-bc61-3f6a13518907")
    public static final String SCHEDULER_PARAMETER_OTHERSCHEDPOLICY_TAGTYPE = "Scheduler_Parameter_otherSchedPolicy";

    @objid ("b702b928-b149-42e9-ad70-643a36c778f3")
    public static final String SCHEDULER_PARAMETER_PROCESSINGUNITS_TAGTYPE = "Scheduler_Parameter_processingUnits";

    @objid ("b1df02d5-a31c-4b57-b5e0-9bd04971cba4")
    public static final String SCHEDULER_PARAMETER_PROTECTEDSHAREDRESOURCES_TAGTYPE = "Scheduler_Parameter_protectedSharedResources";

    @objid ("2d224ed7-b5eb-4220-ba15-fd3b0d8708c7")
    public static final String SCHEDULER_PARAMETER_SCHEDPOLICY_TAGTYPE = "Scheduler_Parameter_schedPolicy";

    @objid ("471e10ef-4e51-4921-8328-9c666632f43f")
    public static final String SCHEDULER_PARAMETER_SCHEDULABLERESOURCES_TAGTYPE = "Scheduler_Parameter_schedulableResources";

    @objid ("57a60c7b-6e26-4de9-8d17-82d6ad9be89a")
    public static final String SCHEDULER_PARAMETER_SCHEDULE_TAGTYPE = "Scheduler_Parameter_schedule";

    /**
     * Tells whether a {@link SchedulerParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << Scheduler_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("28166d71-905a-4698-acac-2e7fb6f39229")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SchedulerParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << Scheduler_Parameter >> then instantiate a {@link SchedulerParameter} proxy.
     * 
     * @return a {@link SchedulerParameter} proxy on the created {@link Parameter}.
     */
    @objid ("811bd991-0900-4534-a645-fc27a381d4f1")
    public static SchedulerParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SchedulerParameter.STEREOTYPE_NAME);
        return SchedulerParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link SchedulerParameter} proxy from a {@link Parameter} stereotyped << Scheduler_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link SchedulerParameter} proxy or <i>null</i>.
     */
    @objid ("2831bbc8-a668-42ea-a45b-6c62e844ecc9")
    public static SchedulerParameter instantiate(final Parameter obj) {
        return SchedulerParameter.canInstantiate(obj) ? new SchedulerParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SchedulerParameter} proxy from a {@link Parameter} stereotyped << Scheduler_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link SchedulerParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e662e277-faac-436d-a95d-90c428d9acfd")
    public static SchedulerParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (SchedulerParameter.canInstantiate(obj))
        	return new SchedulerParameter(obj);
        else
        	throw new IllegalArgumentException("SchedulerParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("67001b43-65c4-4c15-ad59-ed0f4f16a1c1")
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
        SchedulerParameter other = (SchedulerParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("6d7b0493-0f11-4bb1-acc6-efb816a9c5eb")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'Scheduler_Parameter_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ebeb75d8-abf5-4ce6-bc73-e418b77a17d3")
    public String getScheduler_Parameter_host() {
        return this.elt.getTagValue(SchedulerParameter.MdaTypes.SCHEDULER_PARAMETER_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Parameter_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d3403ddb-7098-4a84-b056-8a30d3aa248c")
    public String getScheduler_Parameter_otherSchedPolicy() {
        return this.elt.getTagValue(SchedulerParameter.MdaTypes.SCHEDULER_PARAMETER_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Parameter_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c4cd6e32-69aa-42c8-89b7-870522bf539d")
    public List<String> getScheduler_Parameter_processingUnits() {
        return this.elt.getTagValues(SchedulerParameter.MdaTypes.SCHEDULER_PARAMETER_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Parameter_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4c25ca97-65b3-4458-83ae-b3ebac8b67c6")
    public List<String> getScheduler_Parameter_protectedSharedResources() {
        return this.elt.getTagValues(SchedulerParameter.MdaTypes.SCHEDULER_PARAMETER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Parameter_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1472a322-ca77-45e6-9bf7-318c330ee7d6")
    public String getScheduler_Parameter_schedPolicy() {
        return this.elt.getTagValue(SchedulerParameter.MdaTypes.SCHEDULER_PARAMETER_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Parameter_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0a668d33-0e9a-43df-8e87-4e5e255da976")
    public List<String> getScheduler_Parameter_schedulableResources() {
        return this.elt.getTagValues(SchedulerParameter.MdaTypes.SCHEDULER_PARAMETER_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Parameter_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e4c017ef-a673-4ea2-acce-cf171f6f56e1")
    public String getScheduler_Parameter_schedule() {
        return this.elt.getTagValue(SchedulerParameter.MdaTypes.SCHEDULER_PARAMETER_SCHEDULE_TAGTYPE_ELT);
    }

    @objid ("08db014e-a5d1-4b99-a914-13747585f61c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Scheduler_Parameter_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e1bc1775-c19f-4c30-b483-7c3c0b7f585b")
    public boolean isScheduler_Parameter_isPreemptible() {
        return this.elt.isTagged(SchedulerParameter.MdaTypes.SCHEDULER_PARAMETER_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Scheduler_Parameter_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c4ec3d14-bc87-4326-95df-7b928a352da3")
    public void setScheduler_Parameter_host(final String value) {
        this.elt.putTagValue(SchedulerParameter.MdaTypes.SCHEDULER_PARAMETER_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'Scheduler_Parameter_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("435c5c67-4674-4c26-8cee-f7beff50aef3")
    public void setScheduler_Parameter_isPreemptible(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SchedulerParameter.MdaTypes.SCHEDULER_PARAMETER_ISPREEMPTIBLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SchedulerParameter.MdaTypes.SCHEDULER_PARAMETER_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Scheduler_Parameter_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("014ceefe-7b17-46b6-94ca-732c7dd21011")
    public void setScheduler_Parameter_otherSchedPolicy(final String value) {
        this.elt.putTagValue(SchedulerParameter.MdaTypes.SCHEDULER_PARAMETER_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Scheduler_Parameter_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7494256d-2d4a-4d13-80af-fd1af0add5a5")
    public void setScheduler_Parameter_processingUnits(final List<String> values) {
        this.elt.putTagValues(SchedulerParameter.MdaTypes.SCHEDULER_PARAMETER_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'Scheduler_Parameter_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1a3ed693-8e7d-4194-98cb-cf1cf8b2fe72")
    public void setScheduler_Parameter_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(SchedulerParameter.MdaTypes.SCHEDULER_PARAMETER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Scheduler_Parameter_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fc0f465c-b641-4ef7-ab21-7a5c0fc05632")
    public void setScheduler_Parameter_schedPolicy(final String value) {
        this.elt.putTagValue(SchedulerParameter.MdaTypes.SCHEDULER_PARAMETER_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Scheduler_Parameter_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bc9eb59b-df8b-472b-9043-4d2a73db4f79")
    public void setScheduler_Parameter_schedulableResources(final List<String> values) {
        this.elt.putTagValues(SchedulerParameter.MdaTypes.SCHEDULER_PARAMETER_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Scheduler_Parameter_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("13825566-99a8-4348-a6ae-6f1cd55cb103")
    public void setScheduler_Parameter_schedule(final String value) {
        this.elt.putTagValue(SchedulerParameter.MdaTypes.SCHEDULER_PARAMETER_SCHEDULE_TAGTYPE_ELT, value);
    }

    @objid ("cc0fa1b8-188a-4d5b-a47f-a6fcc4eb094a")
    protected SchedulerParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("5f44d631-13ac-4090-abc3-aa8edd7bb341")
    public static final class MdaTypes {
        @objid ("434fe2e1-c162-4ff1-b0ec-7f54e2629660")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d344e7a6-8ae3-4056-a533-df51fc82343b")
        public static TagType SCHEDULER_PARAMETER_ISPREEMPTIBLE_TAGTYPE_ELT;

        @objid ("55a7272c-62fc-40bd-9ee0-b8914ac1ae25")
        public static TagType SCHEDULER_PARAMETER_SCHEDPOLICY_TAGTYPE_ELT;

        @objid ("362df596-7b9f-4366-9014-d497ab101987")
        public static TagType SCHEDULER_PARAMETER_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        @objid ("a1eeeac4-49bb-4782-82e7-160a3026c5b3")
        public static TagType SCHEDULER_PARAMETER_SCHEDULE_TAGTYPE_ELT;

        @objid ("ca8c8a0a-0ded-448b-9384-cf5e6b0b111a")
        public static TagType SCHEDULER_PARAMETER_PROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("9f2b8de7-bba6-490c-9ec1-48bb11d10c92")
        public static TagType SCHEDULER_PARAMETER_HOST_TAGTYPE_ELT;

        @objid ("c7cfeaec-dd3c-45a6-8ce5-418df7d1a751")
        public static TagType SCHEDULER_PARAMETER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        @objid ("514ed69b-b429-4e55-b3b0-bbda606f6a6a")
        public static TagType SCHEDULER_PARAMETER_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        @objid ("700ea3e4-0e34-4d69-bc6b-c4b0854120d6")
        private static Stereotype MDAASSOCDEP;

        @objid ("fb643298-d9c3-475f-9e09-638e9f9d512b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6185f5a1-d4f7-4fe5-a52f-0dfa5fa71da1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fff8670d-0cce-11df-8525-001302895b2b");
            SCHEDULER_PARAMETER_ISPREEMPTIBLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0025b322-0ccf-11df-8525-001302895b2b");
            SCHEDULER_PARAMETER_SCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0028156e-0ccf-11df-8525-001302895b2b");
            SCHEDULER_PARAMETER_OTHERSCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00281575-0ccf-11df-8525-001302895b2b");
            SCHEDULER_PARAMETER_SCHEDULE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0028157c-0ccf-11df-8525-001302895b2b");
            SCHEDULER_PARAMETER_PROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00281583-0ccf-11df-8525-001302895b2b");
            SCHEDULER_PARAMETER_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0028158a-0ccf-11df-8525-001302895b2b");
            SCHEDULER_PARAMETER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00281591-0ccf-11df-8525-001302895b2b");
            SCHEDULER_PARAMETER_SCHEDULABLERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00281598-0ccf-11df-8525-001302895b2b");
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
