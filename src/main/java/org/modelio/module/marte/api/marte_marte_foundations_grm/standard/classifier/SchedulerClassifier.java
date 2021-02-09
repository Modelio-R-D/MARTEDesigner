/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
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
public class SchedulerClassifier extends ResourceClassifier {
    public static final String STEREOTYPE_NAME = "Scheduler_Classifier";

    public static final String SCHEDULER_CLASSIFIER_HOST_TAGTYPE = "Scheduler_Classifier_host";

    public static final String SCHEDULER_CLASSIFIER_ISPREEMPTIBLE_TAGTYPE = "Scheduler_Classifier_isPreemptible";

    public static final String SCHEDULER_CLASSIFIER_OTHERSCHEDPOLICY_TAGTYPE = "Scheduler_Classifier_otherSchedPolicy";

    public static final String SCHEDULER_CLASSIFIER_PROCESSINGUNITS_TAGTYPE = "Scheduler_Classifier_processingUnits";

    public static final String SCHEDULER_CLASSIFIER_PROTECTEDSHAREDRESOURCES_TAGTYPE = "Scheduler_Classifier_protectedSharedResources";

    public static final String SCHEDULER_CLASSIFIER_SCHEDPOLICY_TAGTYPE = "Scheduler_Classifier_schedPolicy";

    public static final String SCHEDULER_CLASSIFIER_SCHEDULABLERESOURCES_TAGTYPE = "Scheduler_Classifier_schedulableResources";

    public static final String SCHEDULER_CLASSIFIER_SCHEDULE_TAGTYPE = "Scheduler_Classifier_schedule";

    /**
     * Tells whether a {@link SchedulerClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << Scheduler_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SchedulerClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << Scheduler_Classifier >> then instantiate a {@link SchedulerClassifier} proxy.
     * 
     * @return a {@link SchedulerClassifier} proxy on the created {@link Classifier}.
     */
    public static SchedulerClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SchedulerClassifier.STEREOTYPE_NAME);
        return SchedulerClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link SchedulerClassifier} proxy from a {@link Classifier} stereotyped << Scheduler_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link SchedulerClassifier} proxy or <i>null</i>.
     */
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
    public static SchedulerClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (SchedulerClassifier.canInstantiate(obj))
        	return new SchedulerClassifier(obj);
        else
        	throw new IllegalArgumentException("SchedulerClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'Scheduler_Classifier_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getScheduler_Classifier_host() {
        return this.elt.getTagValue(SchedulerClassifier.MdaTypes.SCHEDULER_CLASSIFIER_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Classifier_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getScheduler_Classifier_otherSchedPolicy() {
        return this.elt.getTagValue(SchedulerClassifier.MdaTypes.SCHEDULER_CLASSIFIER_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Classifier_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getScheduler_Classifier_processingUnits() {
        return this.elt.getTagValues(SchedulerClassifier.MdaTypes.SCHEDULER_CLASSIFIER_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Classifier_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getScheduler_Classifier_protectedSharedResources() {
        return this.elt.getTagValues(SchedulerClassifier.MdaTypes.SCHEDULER_CLASSIFIER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Classifier_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getScheduler_Classifier_schedPolicy() {
        return this.elt.getTagValue(SchedulerClassifier.MdaTypes.SCHEDULER_CLASSIFIER_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_Classifier_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getScheduler_Classifier_schedulableResources() {
        return this.elt.getTagValues(SchedulerClassifier.MdaTypes.SCHEDULER_CLASSIFIER_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_Classifier_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getScheduler_Classifier_schedule() {
        return this.elt.getTagValue(SchedulerClassifier.MdaTypes.SCHEDULER_CLASSIFIER_SCHEDULE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Scheduler_Classifier_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isScheduler_Classifier_isPreemptible() {
        return this.elt.isTagged(SchedulerClassifier.MdaTypes.SCHEDULER_CLASSIFIER_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Scheduler_Classifier_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_Classifier_host(final String value) {
        this.elt.putTagValue(SchedulerClassifier.MdaTypes.SCHEDULER_CLASSIFIER_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'Scheduler_Classifier_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
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
    public void setScheduler_Classifier_otherSchedPolicy(final String value) {
        this.elt.putTagValue(SchedulerClassifier.MdaTypes.SCHEDULER_CLASSIFIER_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Scheduler_Classifier_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_Classifier_processingUnits(final List<String> values) {
        this.elt.putTagValues(SchedulerClassifier.MdaTypes.SCHEDULER_CLASSIFIER_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'Scheduler_Classifier_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_Classifier_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(SchedulerClassifier.MdaTypes.SCHEDULER_CLASSIFIER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Scheduler_Classifier_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_Classifier_schedPolicy(final String value) {
        this.elt.putTagValue(SchedulerClassifier.MdaTypes.SCHEDULER_CLASSIFIER_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Scheduler_Classifier_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_Classifier_schedulableResources(final List<String> values) {
        this.elt.putTagValues(SchedulerClassifier.MdaTypes.SCHEDULER_CLASSIFIER_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Scheduler_Classifier_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setScheduler_Classifier_schedule(final String value) {
        this.elt.putTagValue(SchedulerClassifier.MdaTypes.SCHEDULER_CLASSIFIER_SCHEDULE_TAGTYPE_ELT, value);
    }

    protected SchedulerClassifier(final Classifier elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SCHEDULER_CLASSIFIER_ISPREEMPTIBLE_TAGTYPE_ELT;

        public static TagType SCHEDULER_CLASSIFIER_SCHEDPOLICY_TAGTYPE_ELT;

        public static TagType SCHEDULER_CLASSIFIER_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        public static TagType SCHEDULER_CLASSIFIER_SCHEDULE_TAGTYPE_ELT;

        public static TagType SCHEDULER_CLASSIFIER_PROCESSINGUNITS_TAGTYPE_ELT;

        public static TagType SCHEDULER_CLASSIFIER_HOST_TAGTYPE_ELT;

        public static TagType SCHEDULER_CLASSIFIER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        public static TagType SCHEDULER_CLASSIFIER_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
