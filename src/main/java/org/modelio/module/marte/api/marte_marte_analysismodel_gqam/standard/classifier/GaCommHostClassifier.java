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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.CommunicationMediaClassifier;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << GaCommHost_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class GaCommHostClassifier extends CommunicationMediaClassifier {
    public static final String STEREOTYPE_NAME = "GaCommHost_Classifier";

    public static final String GACOMMHOST_CLASSIFIER_HOST_TAGTYPE = "GaCommHost_Classifier_host";

    public static final String GACOMMHOST_CLASSIFIER_ISPREEMPTIBLE_TAGTYPE = "GaCommHost_Classifier_isPreemptible";

    public static final String GACOMMHOST_CLASSIFIER_OTHERSCHEDPOLICY_TAGTYPE = "GaCommHost_Classifier_otherSchedPolicy";

    public static final String GACOMMHOST_CLASSIFIER_PROCESSINGUNITS_TAGTYPE = "GaCommHost_Classifier_processingUnits";

    public static final String GACOMMHOST_CLASSIFIER_PROTECTEDSHAREDRESOURCES_TAGTYPE = "GaCommHost_Classifier_protectedSharedResources";

    public static final String GACOMMHOST_CLASSIFIER_SCHEDPOLICY_TAGTYPE = "GaCommHost_Classifier_schedPolicy";

    public static final String GACOMMHOST_CLASSIFIER_SCHEDULABLERESOURCES_TAGTYPE = "GaCommHost_Classifier_schedulableResources";

    public static final String GACOMMHOST_CLASSIFIER_SCHEDULE_TAGTYPE = "GaCommHost_Classifier_schedule";

    public static final String GACOMMHOST_CLASSIFIER_THROUGHPUT_TAGTYPE = "GaCommHost_Classifier_throughput";

    public static final String GACOMMHOST_CLASSIFIER_UTILIZATION_TAGTYPE = "GaCommHost_Classifier_utilization";

    /**
     * Tells whether a {@link GaCommHostClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << GaCommHost_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaCommHostClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << GaCommHost_Classifier >> then instantiate a {@link GaCommHostClassifier} proxy.
     * 
     * @return a {@link GaCommHostClassifier} proxy on the created {@link Classifier}.
     */
    public static GaCommHostClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaCommHostClassifier.STEREOTYPE_NAME);
        return GaCommHostClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link GaCommHostClassifier} proxy from a {@link Classifier} stereotyped << GaCommHost_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link GaCommHostClassifier} proxy or <i>null</i>.
     */
    public static GaCommHostClassifier instantiate(final Classifier obj) {
        return GaCommHostClassifier.canInstantiate(obj) ? new GaCommHostClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaCommHostClassifier} proxy from a {@link Classifier} stereotyped << GaCommHost_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link GaCommHostClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static GaCommHostClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (GaCommHostClassifier.canInstantiate(obj))
        	return new GaCommHostClassifier(obj);
        else
        	throw new IllegalArgumentException("GaCommHostClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        GaCommHostClassifier other = (GaCommHostClassifier) obj;
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
     * Getter for string property 'GaCommHost_Classifier_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaCommHost_Classifier_host() {
        return this.elt.getTagValue(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Classifier_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaCommHost_Classifier_otherSchedPolicy() {
        return this.elt.getTagValue(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Classifier_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommHost_Classifier_processingUnits() {
        return this.elt.getTagValues(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Classifier_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommHost_Classifier_protectedSharedResources() {
        return this.elt.getTagValues(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Classifier_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaCommHost_Classifier_schedPolicy() {
        return this.elt.getTagValue(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Classifier_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommHost_Classifier_schedulableResources() {
        return this.elt.getTagValues(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Classifier_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaCommHost_Classifier_schedule() {
        return this.elt.getTagValue(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_SCHEDULE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Classifier_throughput'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommHost_Classifier_throughput() {
        return this.elt.getTagValues(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Classifier_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommHost_Classifier_utilization() {
        return this.elt.getTagValues(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_UTILIZATION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'GaCommHost_Classifier_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isGaCommHost_Classifier_isPreemptible() {
        return this.elt.isTagged(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaCommHost_Classifier_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Classifier_host(final String value) {
        this.elt.putTagValue(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'GaCommHost_Classifier_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Classifier_isPreemptible(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_ISPREEMPTIBLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaCommHost_Classifier_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Classifier_otherSchedPolicy(final String value) {
        this.elt.putTagValue(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Classifier_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Classifier_processingUnits(final List<String> values) {
        this.elt.putTagValues(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Classifier_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Classifier_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaCommHost_Classifier_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Classifier_schedPolicy(final String value) {
        this.elt.putTagValue(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Classifier_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Classifier_schedulableResources(final List<String> values) {
        this.elt.putTagValues(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaCommHost_Classifier_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Classifier_schedule(final String value) {
        this.elt.putTagValue(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_SCHEDULE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Classifier_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Classifier_throughput(final List<String> values) {
        this.elt.putTagValues(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_THROUGHPUT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Classifier_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommHost_Classifier_utilization(final List<String> values) {
        this.elt.putTagValues(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_UTILIZATION_TAGTYPE_ELT, values);
    }

    protected GaCommHostClassifier(final Classifier elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType GACOMMHOST_CLASSIFIER_THROUGHPUT_TAGTYPE_ELT;

        public static TagType GACOMMHOST_CLASSIFIER_UTILIZATION_TAGTYPE_ELT;

        public static TagType GACOMMHOST_CLASSIFIER_ISPREEMPTIBLE_TAGTYPE_ELT;

        public static TagType GACOMMHOST_CLASSIFIER_SCHEDPOLICY_TAGTYPE_ELT;

        public static TagType GACOMMHOST_CLASSIFIER_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        public static TagType GACOMMHOST_CLASSIFIER_SCHEDULE_TAGTYPE_ELT;

        public static TagType GACOMMHOST_CLASSIFIER_PROCESSINGUNITS_TAGTYPE_ELT;

        public static TagType GACOMMHOST_CLASSIFIER_HOST_TAGTYPE_ELT;

        public static TagType GACOMMHOST_CLASSIFIER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        public static TagType GACOMMHOST_CLASSIFIER_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "aece303f-14a6-11df-9d54-0014222a9f79");
            GACOMMHOST_CLASSIFIER_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "aece3040-14a6-11df-9d54-0014222a9f79");
            GACOMMHOST_CLASSIFIER_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "aece3041-14a6-11df-9d54-0014222a9f79");
            GACOMMHOST_CLASSIFIER_ISPREEMPTIBLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "99b5b65d-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_CLASSIFIER_SCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "99b5b65e-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_CLASSIFIER_OTHERSCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "99b5b65f-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_CLASSIFIER_SCHEDULE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "99b5b660-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_CLASSIFIER_PROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "99b5b661-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_CLASSIFIER_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "99b5b662-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_CLASSIFIER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "99b5b663-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_CLASSIFIER_SCHEDULABLERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "99b5b664-1669-11df-b9be-0014222a9f79");
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
