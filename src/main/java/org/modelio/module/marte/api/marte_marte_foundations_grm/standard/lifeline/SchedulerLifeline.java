/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << Scheduler_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f7ac3c71-cf6b-47fc-892f-562329557a1e")
public class SchedulerLifeline extends ResourceLifeline {
    @objid ("ba31f228-da1b-4e4e-a96e-682c43d74129")
    public static final String STEREOTYPE_NAME = "Scheduler_Lifeline";

    @objid ("8a2ebdc2-6fc7-4152-bb1e-5b4bdbcaa324")
    public static final String SCHEDULER_LIFELINE_HOST_TAGTYPE = "Scheduler_Lifeline_host";

    @objid ("58eff265-9dfa-46a6-9576-2e1a84d18eda")
    public static final String SCHEDULER_LIFELINE_ISPREEMPTIBLE_TAGTYPE = "Scheduler_Lifeline_isPreemptible";

    @objid ("c8ee78d8-3656-40fd-ab22-ff7298556b60")
    public static final String SCHEDULER_LIFELINE_OTHERSCHEDPOLICY_TAGTYPE = "Scheduler_Lifeline_otherSchedPolicy";

    @objid ("b5702807-0c11-4842-8c84-9bc4af6bb7d2")
    public static final String SCHEDULER_LIFELINE_PROCESSINGUNITS_TAGTYPE = "Scheduler_Lifeline_processingUnits";

    @objid ("bf23ae0c-5867-4c36-a722-f105f492d9fe")
    public static final String SCHEDULER_LIFELINE_PROTECTEDSHAREDRESOURCES_TAGTYPE = "Scheduler_Lifeline_protectedSharedResources";

    @objid ("abe09c7b-8f86-4063-bf3f-2db3aa203fc0")
    public static final String SCHEDULER_LIFELINE_SCHEDPOLICY_TAGTYPE = "Scheduler_Lifeline_schedPolicy";

    @objid ("2dfa99de-3ea8-4219-a576-c4d4bf7adfd4")
    public static final String SCHEDULER_LIFELINE_SCHEDULABLERESOURCES_TAGTYPE = "Scheduler_Lifeline_schedulableResources";

    @objid ("b654b403-df8e-46e0-9b8d-f3685082457b")
    public static final String SCHEDULER_LIFELINE_SCHEDULE_TAGTYPE = "Scheduler_Lifeline_schedule";

    /**
     * Tells whether a {@link SchedulerLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << Scheduler_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e4a55c86-3493-4120-88f1-7797a02454ae")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SchedulerLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << Scheduler_Lifeline >> then instantiate a {@link SchedulerLifeline} proxy.
     * 
     * @return a {@link SchedulerLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("a6d29b37-0fee-4380-811a-2ae3e13d0798")
    public static SchedulerLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SchedulerLifeline.STEREOTYPE_NAME);
        return SchedulerLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link SchedulerLifeline} proxy from a {@link Lifeline} stereotyped << Scheduler_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link SchedulerLifeline} proxy or <i>null</i>.
     */
    @objid ("0a9654a5-29f7-41fb-832a-fbd40edcf651")
    public static SchedulerLifeline instantiate(final Lifeline obj) {
        return SchedulerLifeline.canInstantiate(obj) ? new SchedulerLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SchedulerLifeline} proxy from a {@link Lifeline} stereotyped << Scheduler_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link SchedulerLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7e9b019f-f53d-439e-bfe1-9c6adb22bd06")
    public static SchedulerLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (SchedulerLifeline.canInstantiate(obj))
        	return new SchedulerLifeline(obj);
        else
        	throw new IllegalArgumentException("SchedulerLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("da216097-e16e-4cbd-b1f5-e3bf9fd9ca29")
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
        SchedulerLifeline other = (SchedulerLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("e81439ae-3c43-4f07-bf4c-dd0ab1637eaf")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'Scheduler_Lifeline_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fe8caf02-fc57-403a-9db3-644c34160926")
    public String getScheduler_Lifeline_host() {
        return this.elt.getTagValue(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Lifeline_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e5b88c3a-7a72-4c39-bdd9-7bc81c49b590")
    public String getScheduler_Lifeline_otherSchedPolicy() {
        return this.elt.getTagValue(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Lifeline_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5facd467-2669-44c9-877d-397fa114c015")
    public List<String> getScheduler_Lifeline_processingUnits() {
        return this.elt.getTagValues(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Lifeline_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ea06eeee-7266-485c-9262-82e352a3acca")
    public List<String> getScheduler_Lifeline_protectedSharedResources() {
        return this.elt.getTagValues(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Lifeline_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b3e2892e-08f9-4186-ad0e-930fdb38c75a")
    public String getScheduler_Lifeline_schedPolicy() {
        return this.elt.getTagValue(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Lifeline_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("57e3ca61-1729-4e5a-8659-e985f1080b88")
    public List<String> getScheduler_Lifeline_schedulableResources() {
        return this.elt.getTagValues(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Lifeline_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("de41dfe3-85b9-4281-bd26-557dff292a53")
    public String getScheduler_Lifeline_schedule() {
        return this.elt.getTagValue(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_SCHEDULE_TAGTYPE_ELT);
    }

    @objid ("64f06233-129b-4e69-8a2e-1883f610ac03")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Scheduler_Lifeline_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5aa2b50d-081d-45af-8fd9-c59d616249e7")
    public boolean isScheduler_Lifeline_isPreemptible() {
        return this.elt.isTagged(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Scheduler_Lifeline_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("52ace7c6-5857-4911-a9c8-c428b994b39e")
    public void setScheduler_Lifeline_host(final String value) {
        this.elt.putTagValue(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'Scheduler_Lifeline_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("59a37e28-0dfe-4828-85e3-890be14efa6a")
    public void setScheduler_Lifeline_isPreemptible(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_ISPREEMPTIBLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Scheduler_Lifeline_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("efd9e351-07ca-49c0-bee5-8e39c1811847")
    public void setScheduler_Lifeline_otherSchedPolicy(final String value) {
        this.elt.putTagValue(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Scheduler_Lifeline_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5cd34b2d-5247-49dd-8af3-90dae83cf62c")
    public void setScheduler_Lifeline_processingUnits(final List<String> values) {
        this.elt.putTagValues(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'Scheduler_Lifeline_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("06f00f84-3a9f-4063-b800-cc9c108b9cd1")
    public void setScheduler_Lifeline_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Scheduler_Lifeline_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dad61b11-d7a4-436a-ba55-7c88de23c744")
    public void setScheduler_Lifeline_schedPolicy(final String value) {
        this.elt.putTagValue(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Scheduler_Lifeline_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9d9c4313-eb7c-4f32-96f1-5ab506ad250b")
    public void setScheduler_Lifeline_schedulableResources(final List<String> values) {
        this.elt.putTagValues(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Scheduler_Lifeline_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fcbcfba0-8060-4a93-94af-3c2477bd430e")
    public void setScheduler_Lifeline_schedule(final String value) {
        this.elt.putTagValue(SchedulerLifeline.MdaTypes.SCHEDULER_LIFELINE_SCHEDULE_TAGTYPE_ELT, value);
    }

    @objid ("5a5992be-c8fe-4b2b-90a1-a66551e5a75c")
    protected SchedulerLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("a11a11cd-2d5b-45bc-9895-2806a98e095f")
    public static final class MdaTypes {
        @objid ("9c8ce946-b8d8-4a9a-b49d-ebf02d334aac")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("90ee99fc-3043-4fc0-91a7-85ef226aeb42")
        public static TagType SCHEDULER_LIFELINE_ISPREEMPTIBLE_TAGTYPE_ELT;

        @objid ("77f35856-2afb-49df-b612-05f1151e7018")
        public static TagType SCHEDULER_LIFELINE_SCHEDPOLICY_TAGTYPE_ELT;

        @objid ("4e185764-7121-4fc1-b687-1e402ebf5f54")
        public static TagType SCHEDULER_LIFELINE_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        @objid ("bd445261-9ce4-478b-bc36-2e33132e578d")
        public static TagType SCHEDULER_LIFELINE_SCHEDULE_TAGTYPE_ELT;

        @objid ("ac4fb07f-831c-4e4d-855a-e5265a4e6332")
        public static TagType SCHEDULER_LIFELINE_PROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("73138cc4-b9a2-4d03-a4ab-972a608912f0")
        public static TagType SCHEDULER_LIFELINE_HOST_TAGTYPE_ELT;

        @objid ("5aa212ce-fc76-4ef4-a8c3-e0925af9cd25")
        public static TagType SCHEDULER_LIFELINE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        @objid ("6182a640-8359-49d0-9df6-70576c9bdbd8")
        public static TagType SCHEDULER_LIFELINE_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        @objid ("2592aff5-d8db-4beb-8c07-3bcf1067beff")
        private static Stereotype MDAASSOCDEP;

        @objid ("ee1c6e25-185b-44e0-a449-0c1b16ee1346")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("747c6de9-a9e2-43ba-93d9-132e43193bf3")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "a2e9e3e4-1017-11df-86fe-0014222a9f79");
            SCHEDULER_LIFELINE_ISPREEMPTIBLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cfc1f717-1017-11df-86fe-0014222a9f79");
            SCHEDULER_LIFELINE_SCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cfc1f718-1017-11df-86fe-0014222a9f79");
            SCHEDULER_LIFELINE_OTHERSCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cfc1f719-1017-11df-86fe-0014222a9f79");
            SCHEDULER_LIFELINE_SCHEDULE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cfc1f71a-1017-11df-86fe-0014222a9f79");
            SCHEDULER_LIFELINE_PROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cfc1f71b-1017-11df-86fe-0014222a9f79");
            SCHEDULER_LIFELINE_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cfc1f71c-1017-11df-86fe-0014222a9f79");
            SCHEDULER_LIFELINE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cfc1f71d-1017-11df-86fe-0014222a9f79");
            SCHEDULER_LIFELINE_SCHEDULABLERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cfc1f71e-1017-11df-86fe-0014222a9f79");
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
