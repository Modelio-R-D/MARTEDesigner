/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.classifier;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.ComputingResourceClassifier;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << GaExecHost_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class GaExecHostClassifier extends ComputingResourceClassifier {
    public static final String STEREOTYPE_NAME = "GaExecHost_Classifier";

    public static final String GAEXECHOST_CLASSIFIER_CLOCKOVH_TAGTYPE = "GaExecHost_Classifier_clockOvh";

    public static final String GAEXECHOST_CLASSIFIER_CNTXTSWT_TAGTYPE = "GaExecHost_Classifier_cntxtSwT";

    public static final String GAEXECHOST_CLASSIFIER_COMMRCVOVH_TAGTYPE = "GaExecHost_Classifier_commRcvOvh";

    public static final String GAEXECHOST_CLASSIFIER_COMMTXOVH_TAGTYPE = "GaExecHost_Classifier_commTxOvh";

    public static final String GAEXECHOST_CLASSIFIER_HOST_TAGTYPE = "GaExecHost_Classifier_host";

    public static final String GAEXECHOST_CLASSIFIER_ISPREEMPTIBLE_TAGTYPE = "GaExecHost_Classifier_isPreemptible";

    public static final String GAEXECHOST_CLASSIFIER_MEMSIZE_TAGTYPE = "GaExecHost_Classifier_memSize";

    public static final String GAEXECHOST_CLASSIFIER_OTHERSCHEDPOLICY_TAGTYPE = "GaExecHost_Classifier_otherSchedPolicy";

    public static final String GAEXECHOST_CLASSIFIER_PROCESSINGUNITS_TAGTYPE = "GaExecHost_Classifier_processingUnits";

    public static final String GAEXECHOST_CLASSIFIER_PROTECTEDSHAREDRESOURCES_TAGTYPE = "GaExecHost_Classifier_protectedSharedResources";

    public static final String GAEXECHOST_CLASSIFIER_SCHEDPOLICY_TAGTYPE = "GaExecHost_Classifier_schedPolicy";

    public static final String GAEXECHOST_CLASSIFIER_SCHEDPRIRANGE_TAGTYPE = "GaExecHost_Classifier_schedPriRange";

    public static final String GAEXECHOST_CLASSIFIER_SCHEDULABLERESOURCES_TAGTYPE = "GaExecHost_Classifier_schedulableResources";

    public static final String GAEXECHOST_CLASSIFIER_SCHEDULE_TAGTYPE = "GaExecHost_Classifier_schedule";

    public static final String GAEXECHOST_CLASSIFIER_THROUGHPUT_TAGTYPE = "GaExecHost_Classifier_throughput";

    public static final String GAEXECHOST_CLASSIFIER_UTILIZATION_TAGTYPE = "GaExecHost_Classifier_utilization";

    /**
     * Tells whether a {@link GaExecHostClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << GaExecHost_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaExecHostClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << GaExecHost_Classifier >> then instantiate a {@link GaExecHostClassifier} proxy.
     * 
     * @return a {@link GaExecHostClassifier} proxy on the created {@link Classifier}.
     */
    public static GaExecHostClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaExecHostClassifier.STEREOTYPE_NAME);
        return GaExecHostClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link GaExecHostClassifier} proxy from a {@link Classifier} stereotyped << GaExecHost_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link GaExecHostClassifier} proxy or <i>null</i>.
     */
    public static GaExecHostClassifier instantiate(final Classifier obj) {
        return GaExecHostClassifier.canInstantiate(obj) ? new GaExecHostClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaExecHostClassifier} proxy from a {@link Classifier} stereotyped << GaExecHost_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link GaExecHostClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static GaExecHostClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (GaExecHostClassifier.canInstantiate(obj))
        	return new GaExecHostClassifier(obj);
        else
        	throw new IllegalArgumentException("GaExecHostClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        GaExecHostClassifier other = (GaExecHostClassifier) obj;
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
     * Getter for string property 'GaExecHost_Classifier_clockOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Classifier_clockOvh() {
        return this.elt.getTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_CLOCKOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Classifier_cntxtSwT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Classifier_cntxtSwT() {
        return this.elt.getTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_CNTXTSWT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Classifier_commRcvOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Classifier_commRcvOvh() {
        return this.elt.getTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_COMMRCVOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Classifier_commTxOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Classifier_commTxOvh() {
        return this.elt.getTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_COMMTXOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Classifier_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Classifier_host() {
        return this.elt.getTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Classifier_memSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Classifier_memSize() {
        return this.elt.getTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_MEMSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Classifier_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Classifier_otherSchedPolicy() {
        return this.elt.getTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Classifier_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaExecHost_Classifier_processingUnits() {
        return this.elt.getTagValues(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Classifier_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaExecHost_Classifier_protectedSharedResources() {
        return this.elt.getTagValues(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Classifier_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Classifier_schedPolicy() {
        return this.elt.getTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Classifier_schedPriRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Classifier_schedPriRange() {
        return this.elt.getTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_SCHEDPRIRANGE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Classifier_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaExecHost_Classifier_schedulableResources() {
        return this.elt.getTagValues(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Classifier_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaExecHost_Classifier_schedule() {
        return this.elt.getTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_SCHEDULE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Classifier_throughput'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaExecHost_Classifier_throughput() {
        return this.elt.getTagValues(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Classifier_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaExecHost_Classifier_utilization() {
        return this.elt.getTagValues(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_UTILIZATION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'GaExecHost_Classifier_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isGaExecHost_Classifier_isPreemptible() {
        return this.elt.isTagged(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaExecHost_Classifier_clockOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Classifier_clockOvh(final String value) {
        this.elt.putTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_CLOCKOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Classifier_cntxtSwT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Classifier_cntxtSwT(final String value) {
        this.elt.putTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_CNTXTSWT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Classifier_commRcvOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Classifier_commRcvOvh(final String value) {
        this.elt.putTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_COMMRCVOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Classifier_commTxOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Classifier_commTxOvh(final String value) {
        this.elt.putTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_COMMTXOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Classifier_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Classifier_host(final String value) {
        this.elt.putTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'GaExecHost_Classifier_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Classifier_isPreemptible(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_ISPREEMPTIBLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaExecHost_Classifier_memSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Classifier_memSize(final String value) {
        this.elt.putTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_MEMSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Classifier_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Classifier_otherSchedPolicy(final String value) {
        this.elt.putTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Classifier_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Classifier_processingUnits(final List<String> values) {
        this.elt.putTagValues(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Classifier_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Classifier_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaExecHost_Classifier_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Classifier_schedPolicy(final String value) {
        this.elt.putTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Classifier_schedPriRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Classifier_schedPriRange(final String value) {
        this.elt.putTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_SCHEDPRIRANGE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Classifier_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Classifier_schedulableResources(final List<String> values) {
        this.elt.putTagValues(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaExecHost_Classifier_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Classifier_schedule(final String value) {
        this.elt.putTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_SCHEDULE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Classifier_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Classifier_throughput(final List<String> values) {
        this.elt.putTagValues(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_THROUGHPUT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Classifier_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaExecHost_Classifier_utilization(final List<String> values) {
        this.elt.putTagValues(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_UTILIZATION_TAGTYPE_ELT, values);
    }

    protected GaExecHostClassifier(final Classifier elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType GAEXECHOST_CLASSIFIER_COMMTXOVH_TAGTYPE_ELT;

        public static TagType GAEXECHOST_CLASSIFIER_COMMRCVOVH_TAGTYPE_ELT;

        public static TagType GAEXECHOST_CLASSIFIER_CNTXTSWT_TAGTYPE_ELT;

        public static TagType GAEXECHOST_CLASSIFIER_CLOCKOVH_TAGTYPE_ELT;

        public static TagType GAEXECHOST_CLASSIFIER_SCHEDPRIRANGE_TAGTYPE_ELT;

        public static TagType GAEXECHOST_CLASSIFIER_MEMSIZE_TAGTYPE_ELT;

        public static TagType GAEXECHOST_CLASSIFIER_UTILIZATION_TAGTYPE_ELT;

        public static TagType GAEXECHOST_CLASSIFIER_THROUGHPUT_TAGTYPE_ELT;

        public static TagType GAEXECHOST_CLASSIFIER_ISPREEMPTIBLE_TAGTYPE_ELT;

        public static TagType GAEXECHOST_CLASSIFIER_SCHEDPOLICY_TAGTYPE_ELT;

        public static TagType GAEXECHOST_CLASSIFIER_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        public static TagType GAEXECHOST_CLASSIFIER_SCHEDULE_TAGTYPE_ELT;

        public static TagType GAEXECHOST_CLASSIFIER_PROCESSINGUNITS_TAGTYPE_ELT;

        public static TagType GAEXECHOST_CLASSIFIER_HOST_TAGTYPE_ELT;

        public static TagType GAEXECHOST_CLASSIFIER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        public static TagType GAEXECHOST_CLASSIFIER_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "3663ad70-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_CLASSIFIER_COMMTXOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3663ad71-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_CLASSIFIER_COMMRCVOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3663ad72-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_CLASSIFIER_CNTXTSWT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3663ad73-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_CLASSIFIER_CLOCKOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3663ad74-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_CLASSIFIER_SCHEDPRIRANGE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3663ad75-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_CLASSIFIER_MEMSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3663ad76-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_CLASSIFIER_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3663ad77-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_CLASSIFIER_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3663ad78-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_CLASSIFIER_ISPREEMPTIBLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1c718266-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_CLASSIFIER_SCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1c718267-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_CLASSIFIER_OTHERSCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1c718268-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_CLASSIFIER_SCHEDULE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1c718269-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_CLASSIFIER_PROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1c71826a-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_CLASSIFIER_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1c71826b-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_CLASSIFIER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1c71826c-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_CLASSIFIER_SCHEDULABLERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1c71826d-16ea-11df-b92a-0014222a9f79");
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
