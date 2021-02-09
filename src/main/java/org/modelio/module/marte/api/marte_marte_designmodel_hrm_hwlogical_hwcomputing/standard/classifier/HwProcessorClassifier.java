/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.classifier;

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
 * Proxy class to handle a {@link Classifier} with << HwProcessor_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwProcessorClassifier extends HwComputingResourceClassifier {
    public static final String STEREOTYPE_NAME = "HwProcessor_Classifier";

    public static final String HWPROCESSOR_CLASSIFIER_ARCHITECTURE_TAGTYPE = "HwProcessor_Classifier_architecture";

    public static final String HWPROCESSOR_CLASSIFIER_CACHES_TAGTYPE = "HwProcessor_Classifier_caches";

    public static final String HWPROCESSOR_CLASSIFIER_IPC_TAGTYPE = "HwProcessor_Classifier_ipc";

    public static final String HWPROCESSOR_CLASSIFIER_MIPS_TAGTYPE = "HwProcessor_Classifier_mips";

    public static final String HWPROCESSOR_CLASSIFIER_NBALUS_TAGTYPE = "HwProcessor_Classifier_nbALUs";

    public static final String HWPROCESSOR_CLASSIFIER_NBCORES_TAGTYPE = "HwProcessor_Classifier_nbCores";

    public static final String HWPROCESSOR_CLASSIFIER_NBFPUS_TAGTYPE = "HwProcessor_Classifier_nbFPUs";

    public static final String HWPROCESSOR_CLASSIFIER_NBPIPELINES_TAGTYPE = "HwProcessor_Classifier_nbPipelines";

    public static final String HWPROCESSOR_CLASSIFIER_NBSTAGES_TAGTYPE = "HwProcessor_Classifier_nbStages";

    public static final String HWPROCESSOR_CLASSIFIER_OWNEDISAS_TAGTYPE = "HwProcessor_Classifier_ownedISAs";

    public static final String HWPROCESSOR_CLASSIFIER_OWNEDMMUS_TAGTYPE = "HwProcessor_Classifier_ownedMMUs";

    public static final String HWPROCESSOR_CLASSIFIER_PREDICTORS_TAGTYPE = "HwProcessor_Classifier_predictors";

    /**
     * Tells whether a {@link HwProcessorClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwProcessor_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwProcessorClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwProcessor_Classifier >> then instantiate a {@link HwProcessorClassifier} proxy.
     * 
     * @return a {@link HwProcessorClassifier} proxy on the created {@link Classifier}.
     */
    public static HwProcessorClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwProcessorClassifier.STEREOTYPE_NAME);
        return HwProcessorClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwProcessorClassifier} proxy from a {@link Classifier} stereotyped << HwProcessor_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwProcessorClassifier} proxy or <i>null</i>.
     */
    public static HwProcessorClassifier instantiate(final Classifier obj) {
        return HwProcessorClassifier.canInstantiate(obj) ? new HwProcessorClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwProcessorClassifier} proxy from a {@link Classifier} stereotyped << HwProcessor_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwProcessorClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwProcessorClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwProcessorClassifier.canInstantiate(obj))
        	return new HwProcessorClassifier(obj);
        else
        	throw new IllegalArgumentException("HwProcessorClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwProcessorClassifier other = (HwProcessorClassifier) obj;
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
     * Getter for string property 'HwProcessor_Classifier_architecture'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Classifier_architecture() {
        return this.elt.getTagValue(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_ARCHITECTURE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Classifier_caches'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwProcessor_Classifier_caches() {
        return this.elt.getTagValues(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_CACHES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Classifier_ipc'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Classifier_ipc() {
        return this.elt.getTagValue(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_IPC_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Classifier_mips'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Classifier_mips() {
        return this.elt.getTagValue(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_MIPS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Classifier_nbALUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Classifier_nbALUs() {
        return this.elt.getTagValue(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_NBALUS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Classifier_nbCores'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Classifier_nbCores() {
        return this.elt.getTagValue(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_NBCORES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Classifier_nbFPUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Classifier_nbFPUs() {
        return this.elt.getTagValue(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_NBFPUS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Classifier_nbPipelines'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Classifier_nbPipelines() {
        return this.elt.getTagValue(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_NBPIPELINES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Classifier_nbStages'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Classifier_nbStages() {
        return this.elt.getTagValue(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_NBSTAGES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Classifier_ownedISAs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwProcessor_Classifier_ownedISAs() {
        return this.elt.getTagValues(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_OWNEDISAS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Classifier_ownedMMUs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwProcessor_Classifier_ownedMMUs() {
        return this.elt.getTagValues(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_OWNEDMMUS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Classifier_predictors'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwProcessor_Classifier_predictors() {
        return this.elt.getTagValues(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_PREDICTORS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwProcessor_Classifier_architecture'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Classifier_architecture(final String value) {
        this.elt.putTagValue(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_ARCHITECTURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Classifier_caches'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Classifier_caches(final List<String> values) {
        this.elt.putTagValues(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_CACHES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwProcessor_Classifier_ipc'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Classifier_ipc(final String value) {
        this.elt.putTagValue(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_IPC_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Classifier_mips'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Classifier_mips(final String value) {
        this.elt.putTagValue(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_MIPS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Classifier_nbALUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Classifier_nbALUs(final String value) {
        this.elt.putTagValue(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_NBALUS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Classifier_nbCores'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Classifier_nbCores(final String value) {
        this.elt.putTagValue(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_NBCORES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Classifier_nbFPUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Classifier_nbFPUs(final String value) {
        this.elt.putTagValue(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_NBFPUS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Classifier_nbPipelines'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Classifier_nbPipelines(final String value) {
        this.elt.putTagValue(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_NBPIPELINES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Classifier_nbStages'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Classifier_nbStages(final String value) {
        this.elt.putTagValue(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_NBSTAGES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Classifier_ownedISAs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Classifier_ownedISAs(final List<String> values) {
        this.elt.putTagValues(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_OWNEDISAS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Classifier_ownedMMUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Classifier_ownedMMUs(final List<String> values) {
        this.elt.putTagValues(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_OWNEDMMUS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Classifier_predictors'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Classifier_predictors(final List<String> values) {
        this.elt.putTagValues(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_PREDICTORS_TAGTYPE_ELT, values);
    }

    protected HwProcessorClassifier(final Classifier elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWPROCESSOR_CLASSIFIER_ARCHITECTURE_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_CLASSIFIER_MIPS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_CLASSIFIER_IPC_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_CLASSIFIER_NBCORES_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_CLASSIFIER_NBPIPELINES_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_CLASSIFIER_NBSTAGES_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_CLASSIFIER_NBALUS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_CLASSIFIER_NBFPUS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_CLASSIFIER_OWNEDISAS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_CLASSIFIER_PREDICTORS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_CLASSIFIER_CACHES_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_CLASSIFIER_OWNEDMMUS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "1c1fb54e-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_CLASSIFIER_ARCHITECTURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "795cd3d9-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_CLASSIFIER_MIPS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "795cd3ce-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_CLASSIFIER_IPC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "795cd3cf-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_CLASSIFIER_NBCORES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "795cd3d0-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_CLASSIFIER_NBPIPELINES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "795cd3d1-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_CLASSIFIER_NBSTAGES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "795cd3d2-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_CLASSIFIER_NBALUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "795cd3d3-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_CLASSIFIER_NBFPUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "795cd3d4-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_CLASSIFIER_OWNEDISAS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "795cd3d5-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_CLASSIFIER_PREDICTORS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "795cd3d6-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_CLASSIFIER_CACHES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "795cd3d7-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_CLASSIFIER_OWNEDMMUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "795cd3d8-10a3-11df-81d9-0014222a9f79");
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
