/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.classifier;

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
 * Proxy class to handle a {@link Classifier} with << HwProcessor_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("891dd52a-cbe7-4818-b218-6d8529300ccc")
public class HwProcessorClassifier extends HwComputingResourceClassifier {
    @objid ("1e3c31c8-5fdf-4273-bff8-d8fd45aa089c")
    public static final String STEREOTYPE_NAME = "HwProcessor_Classifier";

    @objid ("0ce8ccd4-f161-43bf-b8f9-246c6ffbae89")
    public static final String HWPROCESSOR_CLASSIFIER_ARCHITECTURE_TAGTYPE = "HwProcessor_Classifier_architecture";

    @objid ("74dba65f-b8e6-4db0-a185-c94dae57dee7")
    public static final String HWPROCESSOR_CLASSIFIER_CACHES_TAGTYPE = "HwProcessor_Classifier_caches";

    @objid ("f6f15c63-194a-425c-ad89-86ce1b6e9373")
    public static final String HWPROCESSOR_CLASSIFIER_IPC_TAGTYPE = "HwProcessor_Classifier_ipc";

    @objid ("8450fd4c-bf89-47a4-8b48-f701a199dde4")
    public static final String HWPROCESSOR_CLASSIFIER_MIPS_TAGTYPE = "HwProcessor_Classifier_mips";

    @objid ("a7af0c76-9700-4df1-8fd6-caa9a85e28f5")
    public static final String HWPROCESSOR_CLASSIFIER_NBALUS_TAGTYPE = "HwProcessor_Classifier_nbALUs";

    @objid ("ce53b354-90e1-4acd-9e09-c54ffef7835e")
    public static final String HWPROCESSOR_CLASSIFIER_NBCORES_TAGTYPE = "HwProcessor_Classifier_nbCores";

    @objid ("b61848bf-11e1-4afb-9d35-f8bf42710098")
    public static final String HWPROCESSOR_CLASSIFIER_NBFPUS_TAGTYPE = "HwProcessor_Classifier_nbFPUs";

    @objid ("efb168be-4b3a-4580-9ac6-a93bc412a263")
    public static final String HWPROCESSOR_CLASSIFIER_NBPIPELINES_TAGTYPE = "HwProcessor_Classifier_nbPipelines";

    @objid ("39e0088b-9d0e-4f5a-8f21-4a319280a0ef")
    public static final String HWPROCESSOR_CLASSIFIER_NBSTAGES_TAGTYPE = "HwProcessor_Classifier_nbStages";

    @objid ("5c4bcdc5-9587-46d9-8d21-e1fdc04922b6")
    public static final String HWPROCESSOR_CLASSIFIER_OWNEDISAS_TAGTYPE = "HwProcessor_Classifier_ownedISAs";

    @objid ("12162d00-7a1e-4022-88e7-a0cdf214efd6")
    public static final String HWPROCESSOR_CLASSIFIER_OWNEDMMUS_TAGTYPE = "HwProcessor_Classifier_ownedMMUs";

    @objid ("5427830e-356f-46a2-a1fc-f14e6e13a6cb")
    public static final String HWPROCESSOR_CLASSIFIER_PREDICTORS_TAGTYPE = "HwProcessor_Classifier_predictors";

    /**
     * Tells whether a {@link HwProcessorClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwProcessor_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("7199c8b0-5d78-4dd6-95b0-78aaa3fa618a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwProcessorClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwProcessor_Classifier >> then instantiate a {@link HwProcessorClassifier} proxy.
     * 
     * @return a {@link HwProcessorClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("3201326e-a98e-4235-9b53-6aeeff8e6f2a")
    public static HwProcessorClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwProcessorClassifier.STEREOTYPE_NAME);
        return HwProcessorClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwProcessorClassifier} proxy from a {@link Classifier} stereotyped << HwProcessor_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwProcessorClassifier} proxy or <i>null</i>.
     */
    @objid ("9aba2cbb-af89-4bd7-b2ba-4061ea05d321")
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
    @objid ("6ad578c1-ff6a-482b-bdbd-4f747ee8b88c")
    public static HwProcessorClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwProcessorClassifier.canInstantiate(obj))
        	return new HwProcessorClassifier(obj);
        else
        	throw new IllegalArgumentException("HwProcessorClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("72289162-9b33-4017-8111-ca581556c00f")
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
    @objid ("f329ed6c-e501-439e-b39e-0c9678e40527")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'HwProcessor_Classifier_architecture'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7d6b56c3-0ae8-45a4-9324-b9d83f621c86")
    public String getHwProcessor_Classifier_architecture() {
        return this.elt.getTagValue(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_ARCHITECTURE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Classifier_caches'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("31ab5c4f-2fb6-4442-88b3-8ca710c0df46")
    public List<String> getHwProcessor_Classifier_caches() {
        return this.elt.getTagValues(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_CACHES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Classifier_ipc'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ee80bc2e-4d83-47bf-a746-b368d2361fba")
    public String getHwProcessor_Classifier_ipc() {
        return this.elt.getTagValue(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_IPC_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Classifier_mips'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ef130271-142a-4466-9b64-c0a0b89cb390")
    public String getHwProcessor_Classifier_mips() {
        return this.elt.getTagValue(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_MIPS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Classifier_nbALUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8d0c4f9b-f228-4e99-8c5c-fc78dd6835c1")
    public String getHwProcessor_Classifier_nbALUs() {
        return this.elt.getTagValue(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_NBALUS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Classifier_nbCores'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("65c84347-7526-49bb-8eaa-b404a5d06d42")
    public String getHwProcessor_Classifier_nbCores() {
        return this.elt.getTagValue(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_NBCORES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Classifier_nbFPUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b0e152ab-162b-4fce-8414-82d709a65740")
    public String getHwProcessor_Classifier_nbFPUs() {
        return this.elt.getTagValue(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_NBFPUS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Classifier_nbPipelines'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("74722255-cca2-48ed-ab4c-ac8b6c3a78ae")
    public String getHwProcessor_Classifier_nbPipelines() {
        return this.elt.getTagValue(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_NBPIPELINES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Classifier_nbStages'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2fb92448-5e33-4f67-82d7-a96405d031b0")
    public String getHwProcessor_Classifier_nbStages() {
        return this.elt.getTagValue(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_NBSTAGES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Classifier_ownedISAs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("bdfb3c51-900a-49f7-aeb4-df82fa498893")
    public List<String> getHwProcessor_Classifier_ownedISAs() {
        return this.elt.getTagValues(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_OWNEDISAS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Classifier_ownedMMUs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("64129f7f-67c7-4501-bc9b-4eb48a4fdc6e")
    public List<String> getHwProcessor_Classifier_ownedMMUs() {
        return this.elt.getTagValues(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_OWNEDMMUS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Classifier_predictors'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5e18607a-5be5-45a9-a4b2-52a684539a9c")
    public List<String> getHwProcessor_Classifier_predictors() {
        return this.elt.getTagValues(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_PREDICTORS_TAGTYPE_ELT);
    }

    @objid ("6406ab72-84ca-4fd2-9816-0d8a425779f7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwProcessor_Classifier_architecture'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5226a559-1c83-4b12-83eb-babbc4d435dc")
    public void setHwProcessor_Classifier_architecture(final String value) {
        this.elt.putTagValue(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_ARCHITECTURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Classifier_caches'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f5a7a69d-4c70-497e-a9b7-704ff9dadb44")
    public void setHwProcessor_Classifier_caches(final List<String> values) {
        this.elt.putTagValues(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_CACHES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwProcessor_Classifier_ipc'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3a48ed67-61e6-4565-a60d-1340577a092c")
    public void setHwProcessor_Classifier_ipc(final String value) {
        this.elt.putTagValue(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_IPC_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Classifier_mips'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("353781a6-99b9-4538-a2e7-a72dd784ce63")
    public void setHwProcessor_Classifier_mips(final String value) {
        this.elt.putTagValue(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_MIPS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Classifier_nbALUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("49871a28-9751-453e-a6da-a295b9804da7")
    public void setHwProcessor_Classifier_nbALUs(final String value) {
        this.elt.putTagValue(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_NBALUS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Classifier_nbCores'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e88d6967-1a09-473d-9fc8-3ced3b73a243")
    public void setHwProcessor_Classifier_nbCores(final String value) {
        this.elt.putTagValue(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_NBCORES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Classifier_nbFPUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f9c284a0-0c1e-48d7-93c9-27912fb82782")
    public void setHwProcessor_Classifier_nbFPUs(final String value) {
        this.elt.putTagValue(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_NBFPUS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Classifier_nbPipelines'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b485a95e-a218-4663-aa4d-b6c995aa5be2")
    public void setHwProcessor_Classifier_nbPipelines(final String value) {
        this.elt.putTagValue(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_NBPIPELINES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Classifier_nbStages'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("751d4f7c-1bf9-4a87-a3f5-432261c1aeb3")
    public void setHwProcessor_Classifier_nbStages(final String value) {
        this.elt.putTagValue(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_NBSTAGES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Classifier_ownedISAs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0a2d30b2-84e4-45e0-adc5-d33bc73d45bf")
    public void setHwProcessor_Classifier_ownedISAs(final List<String> values) {
        this.elt.putTagValues(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_OWNEDISAS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Classifier_ownedMMUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("26379624-5bee-4710-99c4-ce7a9185b4ba")
    public void setHwProcessor_Classifier_ownedMMUs(final List<String> values) {
        this.elt.putTagValues(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_OWNEDMMUS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Classifier_predictors'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("10e13f2e-50a0-4b8c-b542-fa4b2a4dc711")
    public void setHwProcessor_Classifier_predictors(final List<String> values) {
        this.elt.putTagValues(HwProcessorClassifier.MdaTypes.HWPROCESSOR_CLASSIFIER_PREDICTORS_TAGTYPE_ELT, values);
    }

    @objid ("e2f6ae7c-0356-425a-bb8c-b94c3755384a")
    protected HwProcessorClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("1e83dfc0-62ef-4adf-a1ce-8b06a3eb4d34")
    public static final class MdaTypes {
        @objid ("8d8d1ad2-7f40-4b30-a945-6cbb9f4a1f76")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5ca704c2-6647-4b58-98e2-47af13e909d7")
        public static TagType HWPROCESSOR_CLASSIFIER_ARCHITECTURE_TAGTYPE_ELT;

        @objid ("c36fb7a8-ae3b-434a-a3c0-e9f2b194c555")
        public static TagType HWPROCESSOR_CLASSIFIER_MIPS_TAGTYPE_ELT;

        @objid ("600178a1-fc58-4b0d-adf9-4e4c0492609b")
        public static TagType HWPROCESSOR_CLASSIFIER_IPC_TAGTYPE_ELT;

        @objid ("a242e3a8-fcad-473c-b910-0f4a962484ef")
        public static TagType HWPROCESSOR_CLASSIFIER_NBCORES_TAGTYPE_ELT;

        @objid ("7b0f975d-9514-463c-8520-a0e84c4f2609")
        public static TagType HWPROCESSOR_CLASSIFIER_NBPIPELINES_TAGTYPE_ELT;

        @objid ("a0b1615f-3540-4877-9c0a-62e8bd6322de")
        public static TagType HWPROCESSOR_CLASSIFIER_NBSTAGES_TAGTYPE_ELT;

        @objid ("2e3fcf4a-910b-495d-9532-f59b2bd2e4c0")
        public static TagType HWPROCESSOR_CLASSIFIER_NBALUS_TAGTYPE_ELT;

        @objid ("d6e626da-0867-47d2-a635-dcf8586943e3")
        public static TagType HWPROCESSOR_CLASSIFIER_NBFPUS_TAGTYPE_ELT;

        @objid ("88aab73c-73b3-4047-9a17-654fdd58ca50")
        public static TagType HWPROCESSOR_CLASSIFIER_OWNEDISAS_TAGTYPE_ELT;

        @objid ("9a9da68d-04f3-41ba-8ac0-a3d028544292")
        public static TagType HWPROCESSOR_CLASSIFIER_PREDICTORS_TAGTYPE_ELT;

        @objid ("0a20ee32-d2b8-4b56-92c5-fe868e4cb752")
        public static TagType HWPROCESSOR_CLASSIFIER_CACHES_TAGTYPE_ELT;

        @objid ("6c088168-707a-4330-b1e2-8c83327df8df")
        public static TagType HWPROCESSOR_CLASSIFIER_OWNEDMMUS_TAGTYPE_ELT;

        @objid ("165e7cdd-8000-40f6-a84f-5e33ab8ffe4e")
        private static Stereotype MDAASSOCDEP;

        @objid ("22eea525-e95c-4825-bd30-71930f58e73c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bf236765-10c9-4388-a569-1ab165df7f1c")
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
