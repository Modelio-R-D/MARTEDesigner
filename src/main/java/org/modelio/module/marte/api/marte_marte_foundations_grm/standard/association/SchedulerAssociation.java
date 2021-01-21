/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << Scheduler_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("e293690c-7d9b-4cf7-809e-a40d224d0918")
public class SchedulerAssociation extends ResourceAssociation {
    @objid ("8e09a7d3-6c1a-4a8d-9f22-ca2444ed0cd9")
    public static final String STEREOTYPE_NAME = "Scheduler_Association";

    @objid ("31e62b1b-c775-44fb-a12c-ff8599f3a115")
    public static final String SCHEDULER_ASSOCIATION_HOST_TAGTYPE = "Scheduler_Association_host";

    @objid ("04bdee69-48a8-4697-b4ce-6abb0202374f")
    public static final String SCHEDULER_ASSOCIATION_ISPREEMPTIBLE_TAGTYPE = "Scheduler_Association_isPreemptible";

    @objid ("aa34d6a9-51cc-421a-b0a0-24303b0fc603")
    public static final String SCHEDULER_ASSOCIATION_OTHERSCHEDPOLICY_TAGTYPE = "Scheduler_Association_otherSchedPolicy";

    @objid ("5d929f70-d43c-46f5-aa53-e37240dd3f05")
    public static final String SCHEDULER_ASSOCIATION_PROCESSINGUNITS_TAGTYPE = "Scheduler_Association_processingUnits";

    @objid ("40dc5438-edf5-4874-809b-64ba528ddde9")
    public static final String SCHEDULER_ASSOCIATION_PROTECTEDSHAREDRESOURCES_TAGTYPE = "Scheduler_Association_protectedSharedResources";

    @objid ("1c7e8858-483c-4ccd-ac9e-6c8e38712e51")
    public static final String SCHEDULER_ASSOCIATION_SCHEDPOLICY_TAGTYPE = "Scheduler_Association_schedPolicy";

    @objid ("26cb958b-24ad-493e-8a06-ac0051c8acf5")
    public static final String SCHEDULER_ASSOCIATION_SCHEDULABLERESOURCES_TAGTYPE = "Scheduler_Association_schedulableResources";

    @objid ("0a7574ad-5e92-4319-8534-cade648c14bb")
    public static final String SCHEDULER_ASSOCIATION_SCHEDULE_TAGTYPE = "Scheduler_Association_schedule";

    /**
     * Tells whether a {@link SchedulerAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << Scheduler_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("59d3a854-532f-4ecb-bf9c-b7c88261db2f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SchedulerAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << Scheduler_Association >> then instantiate a {@link SchedulerAssociation} proxy.
     * 
     * @return a {@link SchedulerAssociation} proxy on the created {@link Association}.
     */
    @objid ("d221cc9f-12f3-4e5a-8d73-febd37912ecb")
    public static SchedulerAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SchedulerAssociation.STEREOTYPE_NAME);
        return SchedulerAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link SchedulerAssociation} proxy from a {@link Association} stereotyped << Scheduler_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link SchedulerAssociation} proxy or <i>null</i>.
     */
    @objid ("19284aff-eea4-4f66-ae6c-58684457a61b")
    public static SchedulerAssociation instantiate(final Association obj) {
        return SchedulerAssociation.canInstantiate(obj) ? new SchedulerAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SchedulerAssociation} proxy from a {@link Association} stereotyped << Scheduler_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link SchedulerAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6b6008b1-ce5b-466c-ac35-85edb5a16d00")
    public static SchedulerAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (SchedulerAssociation.canInstantiate(obj))
        	return new SchedulerAssociation(obj);
        else
        	throw new IllegalArgumentException("SchedulerAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f2a01005-6ff3-4a1f-9cce-8f6def2e09ee")
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
        SchedulerAssociation other = (SchedulerAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("22705b04-0f58-4c43-9523-d8c19659694c")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'Scheduler_Association_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c2f56cbe-0e01-484f-a5b3-0a969a5ebe4e")
    public String getScheduler_Association_host() {
        return this.elt.getTagValue(SchedulerAssociation.MdaTypes.SCHEDULER_ASSOCIATION_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Association_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7a602387-ea50-4bea-bc66-cd821ceaf78a")
    public String getScheduler_Association_otherSchedPolicy() {
        return this.elt.getTagValue(SchedulerAssociation.MdaTypes.SCHEDULER_ASSOCIATION_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Association_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("212803e6-8ef5-4fd6-b1ce-a3b1dc997003")
    public List<String> getScheduler_Association_processingUnits() {
        return this.elt.getTagValues(SchedulerAssociation.MdaTypes.SCHEDULER_ASSOCIATION_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Association_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a5acdd38-b5de-4309-982f-65db4d41e4c2")
    public List<String> getScheduler_Association_protectedSharedResources() {
        return this.elt.getTagValues(SchedulerAssociation.MdaTypes.SCHEDULER_ASSOCIATION_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Association_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f8db1f3b-cb84-4aa2-82d4-89ab537fba1f")
    public String getScheduler_Association_schedPolicy() {
        return this.elt.getTagValue(SchedulerAssociation.MdaTypes.SCHEDULER_ASSOCIATION_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Association_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6ea71273-8d2b-4e94-9e7e-ae15482f6f2d")
    public List<String> getScheduler_Association_schedulableResources() {
        return this.elt.getTagValues(SchedulerAssociation.MdaTypes.SCHEDULER_ASSOCIATION_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Association_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("15705e9f-7df8-4317-81bc-7889fb3cbcd7")
    public String getScheduler_Association_schedule() {
        return this.elt.getTagValue(SchedulerAssociation.MdaTypes.SCHEDULER_ASSOCIATION_SCHEDULE_TAGTYPE_ELT);
    }

    @objid ("ce9381b7-7887-4501-a136-096ebe321411")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Scheduler_Association_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("90e0fbf5-99ff-40a7-8bf9-6100cfed3dd8")
    public boolean isScheduler_Association_isPreemptible() {
        return this.elt.isTagged(SchedulerAssociation.MdaTypes.SCHEDULER_ASSOCIATION_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Scheduler_Association_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9f0cda02-9fa8-498f-9661-a133a034161e")
    public void setScheduler_Association_host(final String value) {
        this.elt.putTagValue(SchedulerAssociation.MdaTypes.SCHEDULER_ASSOCIATION_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'Scheduler_Association_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b4cee866-0667-4b08-accb-2cf287c9bc67")
    public void setScheduler_Association_isPreemptible(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SchedulerAssociation.MdaTypes.SCHEDULER_ASSOCIATION_ISPREEMPTIBLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SchedulerAssociation.MdaTypes.SCHEDULER_ASSOCIATION_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Scheduler_Association_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9cfe2970-7f23-4055-a48b-5b45d936e025")
    public void setScheduler_Association_otherSchedPolicy(final String value) {
        this.elt.putTagValue(SchedulerAssociation.MdaTypes.SCHEDULER_ASSOCIATION_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Scheduler_Association_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1ca7d1d8-4ca8-474f-afb5-e8b41faef07d")
    public void setScheduler_Association_processingUnits(final List<String> values) {
        this.elt.putTagValues(SchedulerAssociation.MdaTypes.SCHEDULER_ASSOCIATION_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'Scheduler_Association_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("88fad5e7-2791-4a54-968e-41c01832b6e7")
    public void setScheduler_Association_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(SchedulerAssociation.MdaTypes.SCHEDULER_ASSOCIATION_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Scheduler_Association_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6e8de821-7bd6-42af-b282-589911850450")
    public void setScheduler_Association_schedPolicy(final String value) {
        this.elt.putTagValue(SchedulerAssociation.MdaTypes.SCHEDULER_ASSOCIATION_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Scheduler_Association_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("294b9cbd-4032-428a-a9ab-f2a14094d6d0")
    public void setScheduler_Association_schedulableResources(final List<String> values) {
        this.elt.putTagValues(SchedulerAssociation.MdaTypes.SCHEDULER_ASSOCIATION_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Scheduler_Association_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8911ae06-ba41-4991-8756-dd0917562772")
    public void setScheduler_Association_schedule(final String value) {
        this.elt.putTagValue(SchedulerAssociation.MdaTypes.SCHEDULER_ASSOCIATION_SCHEDULE_TAGTYPE_ELT, value);
    }

    @objid ("da302dc6-1590-499b-8ec3-05e6a514d755")
    protected SchedulerAssociation(final Association elt) {
        super(elt);
    }

    @objid ("26b99033-65d2-41bf-bf3a-27eb401d21fc")
    public static final class MdaTypes {
        @objid ("757cd80c-7565-44d3-afc2-69e82e408443")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("10b7452b-1df6-4809-8504-cb3650ca30a8")
        public static TagType SCHEDULER_ASSOCIATION_ISPREEMPTIBLE_TAGTYPE_ELT;

        @objid ("c86965e5-f9bc-468a-81c2-4c2a51739687")
        public static TagType SCHEDULER_ASSOCIATION_SCHEDPOLICY_TAGTYPE_ELT;

        @objid ("fc768d12-e7ec-48a8-b544-a42c0b0c19cc")
        public static TagType SCHEDULER_ASSOCIATION_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        @objid ("af771fe6-5c1b-4517-a94b-8ca9e0e711a3")
        public static TagType SCHEDULER_ASSOCIATION_SCHEDULE_TAGTYPE_ELT;

        @objid ("89b59cb8-d508-47ed-85d2-5826391b7cba")
        public static TagType SCHEDULER_ASSOCIATION_PROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("fffc8022-474e-4627-9ec6-421ac72c711a")
        public static TagType SCHEDULER_ASSOCIATION_HOST_TAGTYPE_ELT;

        @objid ("c0055b36-f56c-459f-8b2d-439149e84f7d")
        public static TagType SCHEDULER_ASSOCIATION_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        @objid ("b5efad68-9016-4c4b-a06d-ffd9583315a6")
        public static TagType SCHEDULER_ASSOCIATION_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        @objid ("21c52b04-dfc1-488f-9957-fd0cfded5e43")
        private static Stereotype MDAASSOCDEP;

        @objid ("22224ecd-3558-4915-a5c2-0d02aa9914dc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ea13e183-6635-4659-90e1-b0e2f36dda16")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "9a8f3c07-1017-11df-86fe-0014222a9f79");
            SCHEDULER_ASSOCIATION_ISPREEMPTIBLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ce768e98-1017-11df-86fe-0014222a9f79");
            SCHEDULER_ASSOCIATION_SCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ce768e99-1017-11df-86fe-0014222a9f79");
            SCHEDULER_ASSOCIATION_OTHERSCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ce768e9a-1017-11df-86fe-0014222a9f79");
            SCHEDULER_ASSOCIATION_SCHEDULE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ce768e9b-1017-11df-86fe-0014222a9f79");
            SCHEDULER_ASSOCIATION_PROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ce768e9c-1017-11df-86fe-0014222a9f79");
            SCHEDULER_ASSOCIATION_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ce768e9d-1017-11df-86fe-0014222a9f79");
            SCHEDULER_ASSOCIATION_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ce768e9e-1017-11df-86fe-0014222a9f79");
            SCHEDULER_ASSOCIATION_SCHEDULABLERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ce768e9f-1017-11df-86fe-0014222a9f79");
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
