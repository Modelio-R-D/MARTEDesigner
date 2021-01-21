/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier;

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
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << Scheduler_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("059d9fb2-5934-44df-ae8f-665ff39e06da")
public class SchedulerClassifier extends ResourceClassifier {
    @objid ("d498011b-2518-4ee7-bfb8-64e1b956e7bb")
    public static final String STEREOTYPE_NAME = "Scheduler_Classifier";

    @objid ("f5322a5b-991f-450d-89e8-a664aaf646aa")
    public static final String SCHEDULER_CLASSIFIER_HOST_TAGTYPE = "Scheduler_Classifier_host";

    @objid ("349291c6-3e7b-47bf-a9a2-58b19a44d33c")
    public static final String SCHEDULER_CLASSIFIER_ISPREEMPTIBLE_TAGTYPE = "Scheduler_Classifier_isPreemptible";

    @objid ("11ca0bac-c0f5-41aa-91f3-929a79ed5b24")
    public static final String SCHEDULER_CLASSIFIER_OTHERSCHEDPOLICY_TAGTYPE = "Scheduler_Classifier_otherSchedPolicy";

    @objid ("05998108-262c-4b81-91a1-6d9769fa6f12")
    public static final String SCHEDULER_CLASSIFIER_PROCESSINGUNITS_TAGTYPE = "Scheduler_Classifier_processingUnits";

    @objid ("e9eb75d6-4770-4087-abeb-06c95bcec5d0")
    public static final String SCHEDULER_CLASSIFIER_PROTECTEDSHAREDRESOURCES_TAGTYPE = "Scheduler_Classifier_protectedSharedResources";

    @objid ("e2f34b61-cea1-49d0-8d6e-92a8c4dd75d5")
    public static final String SCHEDULER_CLASSIFIER_SCHEDPOLICY_TAGTYPE = "Scheduler_Classifier_schedPolicy";

    @objid ("8dc91fe0-a78a-42a6-87ba-05d8ebb23e55")
    public static final String SCHEDULER_CLASSIFIER_SCHEDULABLERESOURCES_TAGTYPE = "Scheduler_Classifier_schedulableResources";

    @objid ("9528b243-13f6-441b-ae47-febfea6adcbe")
    public static final String SCHEDULER_CLASSIFIER_SCHEDULE_TAGTYPE = "Scheduler_Classifier_schedule";

    /**
     * Tells whether a {@link SchedulerClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << Scheduler_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("8afa47f8-a8ed-4668-a48b-29e460862a67")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SchedulerClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << Scheduler_Classifier >> then instantiate a {@link SchedulerClassifier} proxy.
     * 
     * @return a {@link SchedulerClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("0d49706a-dcc8-4098-95b8-62194e8594be")
    public static SchedulerClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SchedulerClassifier.STEREOTYPE_NAME);
        return SchedulerClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link SchedulerClassifier} proxy from a {@link Classifier} stereotyped << Scheduler_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link SchedulerClassifier} proxy or <i>null</i>.
     */
    @objid ("a5bd087e-80c2-41aa-bd8c-a35321d8302f")
    public static SchedulerClassifier instantiate(final Classifier obj) {
        return SchedulerClassifier.canInstantiate(obj) ? new SchedulerClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SchedulerClassifier} proxy from a {@link Classifier} stereotyped << Scheduler_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link SchedulerClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7438e656-dab2-490c-8ce5-3bb821ed5c03")
    public static SchedulerClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (SchedulerClassifier.canInstantiate(obj))
        	return new SchedulerClassifier(obj);
        else
        	throw new IllegalArgumentException("SchedulerClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a2323884-8f44-4a38-aa25-644ab2c50d54")
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
        SchedulerClassifier other = (SchedulerClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("b99788db-25b7-44c2-b8f4-c37e666f262f")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'Scheduler_Classifier_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d617df9f-72c6-4dc0-b533-563338b21564")
    public String getScheduler_Classifier_host() {
        return this.elt.getTagValue(SchedulerClassifier.MdaTypes.SCHEDULER_CLASSIFIER_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Classifier_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("755453f2-2eeb-422d-9e72-8beb777db1fc")
    public String getScheduler_Classifier_otherSchedPolicy() {
        return this.elt.getTagValue(SchedulerClassifier.MdaTypes.SCHEDULER_CLASSIFIER_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Classifier_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d1884b08-ee76-44b4-b890-1e5d101f8092")
    public List<String> getScheduler_Classifier_processingUnits() {
        return this.elt.getTagValues(SchedulerClassifier.MdaTypes.SCHEDULER_CLASSIFIER_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Classifier_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("191a6aa0-dd59-46d1-b340-04bef063d509")
    public List<String> getScheduler_Classifier_protectedSharedResources() {
        return this.elt.getTagValues(SchedulerClassifier.MdaTypes.SCHEDULER_CLASSIFIER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Classifier_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9ea5e183-a415-474e-a0ac-d6395f3add29")
    public String getScheduler_Classifier_schedPolicy() {
        return this.elt.getTagValue(SchedulerClassifier.MdaTypes.SCHEDULER_CLASSIFIER_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Classifier_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0120e097-e590-4bde-8868-fca6bdababaa")
    public List<String> getScheduler_Classifier_schedulableResources() {
        return this.elt.getTagValues(SchedulerClassifier.MdaTypes.SCHEDULER_CLASSIFIER_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Classifier_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("91c55256-6a2b-4d53-a2e8-6f575daad954")
    public String getScheduler_Classifier_schedule() {
        return this.elt.getTagValue(SchedulerClassifier.MdaTypes.SCHEDULER_CLASSIFIER_SCHEDULE_TAGTYPE_ELT);
    }

    @objid ("cfee6d90-b4f7-4992-86b1-6a47862bffd9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Scheduler_Classifier_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d59c9145-771a-4d92-8af9-359311b42566")
    public boolean isScheduler_Classifier_isPreemptible() {
        return this.elt.isTagged(SchedulerClassifier.MdaTypes.SCHEDULER_CLASSIFIER_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Scheduler_Classifier_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("31c76501-1883-47a2-bd0f-12e35f4a20e4")
    public void setScheduler_Classifier_host(final String value) {
        this.elt.putTagValue(SchedulerClassifier.MdaTypes.SCHEDULER_CLASSIFIER_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'Scheduler_Classifier_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("864e6a32-fb62-46d7-a859-246345a3cb1a")
    public void setScheduler_Classifier_isPreemptible(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SchedulerClassifier.MdaTypes.SCHEDULER_CLASSIFIER_ISPREEMPTIBLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SchedulerClassifier.MdaTypes.SCHEDULER_CLASSIFIER_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Scheduler_Classifier_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("955e1aef-a0a3-46bd-9b28-116e1c550f8a")
    public void setScheduler_Classifier_otherSchedPolicy(final String value) {
        this.elt.putTagValue(SchedulerClassifier.MdaTypes.SCHEDULER_CLASSIFIER_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Scheduler_Classifier_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a5976709-6134-48c4-8897-e1dc9534d642")
    public void setScheduler_Classifier_processingUnits(final List<String> values) {
        this.elt.putTagValues(SchedulerClassifier.MdaTypes.SCHEDULER_CLASSIFIER_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'Scheduler_Classifier_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("23527a98-b823-4883-86b2-5599ade5f58b")
    public void setScheduler_Classifier_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(SchedulerClassifier.MdaTypes.SCHEDULER_CLASSIFIER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Scheduler_Classifier_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("58865c48-6754-4339-a271-8b168e9433a0")
    public void setScheduler_Classifier_schedPolicy(final String value) {
        this.elt.putTagValue(SchedulerClassifier.MdaTypes.SCHEDULER_CLASSIFIER_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Scheduler_Classifier_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f99f3d31-8081-4552-a8a1-4e91297e0f77")
    public void setScheduler_Classifier_schedulableResources(final List<String> values) {
        this.elt.putTagValues(SchedulerClassifier.MdaTypes.SCHEDULER_CLASSIFIER_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Scheduler_Classifier_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4b0b4783-9576-4c99-89ed-7edc4bbc4136")
    public void setScheduler_Classifier_schedule(final String value) {
        this.elt.putTagValue(SchedulerClassifier.MdaTypes.SCHEDULER_CLASSIFIER_SCHEDULE_TAGTYPE_ELT, value);
    }

    @objid ("ff4af614-81f0-4560-b2db-59a9a16e32d6")
    protected SchedulerClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("2a4b2e5a-6099-4e62-9af3-9ae373e01155")
    public static final class MdaTypes {
        @objid ("0c2da9ea-e114-43a7-aeec-7b19629bbf5b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("02730c11-5ae0-4d14-aa65-9d3ca63a7427")
        public static TagType SCHEDULER_CLASSIFIER_ISPREEMPTIBLE_TAGTYPE_ELT;

        @objid ("25cc78b3-75c9-4b56-8486-3a5176676a51")
        public static TagType SCHEDULER_CLASSIFIER_SCHEDPOLICY_TAGTYPE_ELT;

        @objid ("41976507-2ecc-459e-8624-6eba17678da8")
        public static TagType SCHEDULER_CLASSIFIER_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        @objid ("82aee7d5-f023-4b6f-89ae-60cc8d22b592")
        public static TagType SCHEDULER_CLASSIFIER_SCHEDULE_TAGTYPE_ELT;

        @objid ("08349e88-7565-4137-949c-4eba0a282ea4")
        public static TagType SCHEDULER_CLASSIFIER_PROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("0aa008bb-aa20-4724-ad44-1fa061855f63")
        public static TagType SCHEDULER_CLASSIFIER_HOST_TAGTYPE_ELT;

        @objid ("549074b2-0541-46fa-82b2-1b926df17d7f")
        public static TagType SCHEDULER_CLASSIFIER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        @objid ("668b4f09-15ff-4614-bb33-27fd0da6cdd4")
        public static TagType SCHEDULER_CLASSIFIER_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        @objid ("bbf1c948-d29d-4d20-9f11-dfa9abf92506")
        private static Stereotype MDAASSOCDEP;

        @objid ("e1aa6182-fe7e-43d9-b1ef-a244288e5883")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e16a1a77-5d7e-40bc-b966-563cacc8a736")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ad1a3d52-1017-11df-86fe-0014222a9f79");
            SCHEDULER_CLASSIFIER_ISPREEMPTIBLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d129fbf2-1017-11df-86fe-0014222a9f79");
            SCHEDULER_CLASSIFIER_SCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d129fbf3-1017-11df-86fe-0014222a9f79");
            SCHEDULER_CLASSIFIER_OTHERSCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d129fbf4-1017-11df-86fe-0014222a9f79");
            SCHEDULER_CLASSIFIER_SCHEDULE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d129fbf5-1017-11df-86fe-0014222a9f79");
            SCHEDULER_CLASSIFIER_PROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d129fbf6-1017-11df-86fe-0014222a9f79");
            SCHEDULER_CLASSIFIER_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d129fbf7-1017-11df-86fe-0014222a9f79");
            SCHEDULER_CLASSIFIER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d129fbf8-1017-11df-86fe-0014222a9f79");
            SCHEDULER_CLASSIFIER_SCHEDULABLERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d129fbf9-1017-11df-86fe-0014222a9f79");
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
