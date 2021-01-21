/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.lifeline;

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
 * Proxy class to handle a {@link Lifeline} with << HwProcessor_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("dd4ebe3c-ffae-44b6-891a-88d371b19075")
public class HwProcessorLifeline extends HwComputingResourceLifeline {
    @objid ("d7e2b604-a8a2-4aa5-aaf7-547c326894c1")
    public static final String STEREOTYPE_NAME = "HwProcessor_Lifeline";

    @objid ("9aa3c9aa-882f-4f48-be8d-62369893d5f1")
    public static final String HWPROCESSOR_LIFELINE_ARCHITECTURE_TAGTYPE = "HwProcessor_Lifeline_architecture";

    @objid ("0a02a20c-91a7-436f-990b-31566ec137ed")
    public static final String HWPROCESSOR_LIFELINE_CACHES_TAGTYPE = "HwProcessor_Lifeline_caches";

    @objid ("ddc29612-3937-4c5d-b28b-eaf33b7f61e6")
    public static final String HWPROCESSOR_LIFELINE_IPC_TAGTYPE = "HwProcessor_Lifeline_ipc";

    @objid ("a8ce3ab6-008f-41c7-9490-caf633c99360")
    public static final String HWPROCESSOR_LIFELINE_MIPS_TAGTYPE = "HwProcessor_Lifeline_mips";

    @objid ("19e00aca-8f16-43d6-b97f-2d3dab880a8e")
    public static final String HWPROCESSOR_LIFELINE_NBALUS_TAGTYPE = "HwProcessor_Lifeline_nbALUs";

    @objid ("3b0e8f46-f57e-4d8b-a22d-8abfae7fe6f6")
    public static final String HWPROCESSOR_LIFELINE_NBCORES_TAGTYPE = "HwProcessor_Lifeline_nbCores";

    @objid ("c326bb51-0c39-49cf-b0f5-ca55f7544775")
    public static final String HWPROCESSOR_LIFELINE_NBFPUS_TAGTYPE = "HwProcessor_Lifeline_nbFPUs";

    @objid ("702a1057-9532-43ed-b4c6-5756cdccdf6a")
    public static final String HWPROCESSOR_LIFELINE_NBPIPELINES_TAGTYPE = "HwProcessor_Lifeline_nbPipelines";

    @objid ("5a552ec4-711a-4127-9a76-6254782abd53")
    public static final String HWPROCESSOR_LIFELINE_NBSTAGES_TAGTYPE = "HwProcessor_Lifeline_nbStages";

    @objid ("681d7a79-b115-487b-bb41-a41ea1c7490a")
    public static final String HWPROCESSOR_LIFELINE_OWNEDISAS_TAGTYPE = "HwProcessor_Lifeline_ownedISAs";

    @objid ("e5c70df5-f082-4bdf-99dd-e3c8eab32fd6")
    public static final String HWPROCESSOR_LIFELINE_OWNEDMMUS_TAGTYPE = "HwProcessor_Lifeline_ownedMMUs";

    @objid ("683d13be-b21a-4f26-b2bc-4bd44dc0f977")
    public static final String HWPROCESSOR_LIFELINE_PREDICTORS_TAGTYPE = "HwProcessor_Lifeline_predictors";

    /**
     * Tells whether a {@link HwProcessorLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwProcessor_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e82989e3-4074-49a2-b4a6-06b3a0381164")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwProcessorLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwProcessor_Lifeline >> then instantiate a {@link HwProcessorLifeline} proxy.
     * 
     * @return a {@link HwProcessorLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("ac753010-86f7-4079-bb7b-9f039907c878")
    public static HwProcessorLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwProcessorLifeline.STEREOTYPE_NAME);
        return HwProcessorLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwProcessorLifeline} proxy from a {@link Lifeline} stereotyped << HwProcessor_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwProcessorLifeline} proxy or <i>null</i>.
     */
    @objid ("2795bb27-d8a4-4003-a390-6651a73239f9")
    public static HwProcessorLifeline instantiate(final Lifeline obj) {
        return HwProcessorLifeline.canInstantiate(obj) ? new HwProcessorLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwProcessorLifeline} proxy from a {@link Lifeline} stereotyped << HwProcessor_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwProcessorLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0ded62ba-2600-4ae0-8d6e-f2cc9ea65b8b")
    public static HwProcessorLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwProcessorLifeline.canInstantiate(obj))
        	return new HwProcessorLifeline(obj);
        else
        	throw new IllegalArgumentException("HwProcessorLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("db619d84-b261-4bb4-8cc6-4f1fe43a956b")
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
        HwProcessorLifeline other = (HwProcessorLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("6d3d06ad-35bb-4f05-9752-79b012c2c426")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'HwProcessor_Lifeline_architecture'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5c9c30a2-d72d-4a08-a5a6-3bd193ae0518")
    public String getHwProcessor_Lifeline_architecture() {
        return this.elt.getTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_ARCHITECTURE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Lifeline_caches'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2bd4365c-9c59-452c-bb40-e562b8416f8c")
    public List<String> getHwProcessor_Lifeline_caches() {
        return this.elt.getTagValues(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_CACHES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Lifeline_ipc'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2b3b2f3a-26d6-4ce9-90e8-2f0ab18aa7ec")
    public String getHwProcessor_Lifeline_ipc() {
        return this.elt.getTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_IPC_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Lifeline_mips'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("81571fda-bef6-401c-9d2a-91304f1bc01b")
    public String getHwProcessor_Lifeline_mips() {
        return this.elt.getTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_MIPS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Lifeline_nbALUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d15815cd-b858-43ec-8e45-64dd94666a8d")
    public String getHwProcessor_Lifeline_nbALUs() {
        return this.elt.getTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_NBALUS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Lifeline_nbCores'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b44bf431-3788-4378-9fea-436b71bf5a50")
    public String getHwProcessor_Lifeline_nbCores() {
        return this.elt.getTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_NBCORES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Lifeline_nbFPUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4883d37d-10f0-4bfe-9d19-d8d3f19a70bc")
    public String getHwProcessor_Lifeline_nbFPUs() {
        return this.elt.getTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_NBFPUS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Lifeline_nbPipelines'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7206ad3d-beeb-4d90-878a-e098ecb2fb0d")
    public String getHwProcessor_Lifeline_nbPipelines() {
        return this.elt.getTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_NBPIPELINES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Lifeline_nbStages'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ef589224-1b26-4f10-9ef9-1afc66cbebdd")
    public String getHwProcessor_Lifeline_nbStages() {
        return this.elt.getTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_NBSTAGES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Lifeline_ownedISAs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("dd596d98-e293-44c1-bf57-c7c93cb56a2c")
    public List<String> getHwProcessor_Lifeline_ownedISAs() {
        return this.elt.getTagValues(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_OWNEDISAS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Lifeline_ownedMMUs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("cfd242fe-20c9-4f16-9acf-69b8e96d5052")
    public List<String> getHwProcessor_Lifeline_ownedMMUs() {
        return this.elt.getTagValues(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_OWNEDMMUS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Lifeline_predictors'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("34b48f00-f97e-425b-a144-9a4287a87398")
    public List<String> getHwProcessor_Lifeline_predictors() {
        return this.elt.getTagValues(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_PREDICTORS_TAGTYPE_ELT);
    }

    @objid ("0e437ee9-fa25-4382-b1a9-2ab5eea7a4bd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwProcessor_Lifeline_architecture'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1598f326-4a4f-46f5-988c-ef26cd27e064")
    public void setHwProcessor_Lifeline_architecture(final String value) {
        this.elt.putTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_ARCHITECTURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Lifeline_caches'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b0b9d0d9-0ec2-4277-a7e8-353b7d1bf7b4")
    public void setHwProcessor_Lifeline_caches(final List<String> values) {
        this.elt.putTagValues(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_CACHES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwProcessor_Lifeline_ipc'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("abf0f2ee-6428-4136-81c3-d009bc83734a")
    public void setHwProcessor_Lifeline_ipc(final String value) {
        this.elt.putTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_IPC_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Lifeline_mips'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f4812e34-5d3f-4d93-a634-54e5bc420dcd")
    public void setHwProcessor_Lifeline_mips(final String value) {
        this.elt.putTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_MIPS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Lifeline_nbALUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f99457d6-08ed-4210-8e3a-674d0e912bd7")
    public void setHwProcessor_Lifeline_nbALUs(final String value) {
        this.elt.putTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_NBALUS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Lifeline_nbCores'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0c6a91cf-61da-4dbd-be89-8e4df97de948")
    public void setHwProcessor_Lifeline_nbCores(final String value) {
        this.elt.putTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_NBCORES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Lifeline_nbFPUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("02a8a53f-a53c-490b-b00e-63db7269547e")
    public void setHwProcessor_Lifeline_nbFPUs(final String value) {
        this.elt.putTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_NBFPUS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Lifeline_nbPipelines'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("080d8584-4618-403e-a067-04c3e393b066")
    public void setHwProcessor_Lifeline_nbPipelines(final String value) {
        this.elt.putTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_NBPIPELINES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Lifeline_nbStages'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b0cb6c20-33d5-4404-aaeb-b056e474cb54")
    public void setHwProcessor_Lifeline_nbStages(final String value) {
        this.elt.putTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_NBSTAGES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Lifeline_ownedISAs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ca4f0fd2-a009-423c-9f0a-b150de53b937")
    public void setHwProcessor_Lifeline_ownedISAs(final List<String> values) {
        this.elt.putTagValues(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_OWNEDISAS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Lifeline_ownedMMUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c30253a9-edfd-4d49-aaab-c005b8ad28ec")
    public void setHwProcessor_Lifeline_ownedMMUs(final List<String> values) {
        this.elt.putTagValues(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_OWNEDMMUS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Lifeline_predictors'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1cee601c-6ece-4c3d-a8a0-2e2edf2b8b30")
    public void setHwProcessor_Lifeline_predictors(final List<String> values) {
        this.elt.putTagValues(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_PREDICTORS_TAGTYPE_ELT, values);
    }

    @objid ("b8466233-9717-4862-abe6-36ff331d776e")
    protected HwProcessorLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("2347a7a7-cf0a-4bfe-85af-eea85d1ee51a")
    public static final class MdaTypes {
        @objid ("c02b5cf4-fb95-41a7-841f-e339e9645d30")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0bc703e8-662d-48f5-a5dd-224f14389e1c")
        public static TagType HWPROCESSOR_LIFELINE_ARCHITECTURE_TAGTYPE_ELT;

        @objid ("997f639a-f424-4dde-bff6-b0ded39d4e52")
        public static TagType HWPROCESSOR_LIFELINE_MIPS_TAGTYPE_ELT;

        @objid ("5fb5a93a-5026-4dc2-a991-1824335d7382")
        public static TagType HWPROCESSOR_LIFELINE_IPC_TAGTYPE_ELT;

        @objid ("da9b3676-d199-49fc-aea3-9ddfaf15063b")
        public static TagType HWPROCESSOR_LIFELINE_NBCORES_TAGTYPE_ELT;

        @objid ("437ed218-e5bf-4edc-9627-f695623af5d4")
        public static TagType HWPROCESSOR_LIFELINE_NBPIPELINES_TAGTYPE_ELT;

        @objid ("edeeb7e6-e245-427d-98c9-63e280a4f184")
        public static TagType HWPROCESSOR_LIFELINE_NBSTAGES_TAGTYPE_ELT;

        @objid ("7e9db5b3-2822-498c-90d6-d2f8a8996a65")
        public static TagType HWPROCESSOR_LIFELINE_NBALUS_TAGTYPE_ELT;

        @objid ("70fea9c7-994e-44a1-a9f8-1bab731cecfc")
        public static TagType HWPROCESSOR_LIFELINE_NBFPUS_TAGTYPE_ELT;

        @objid ("9620d430-b89b-4a53-b0dd-20b5e2ba9dee")
        public static TagType HWPROCESSOR_LIFELINE_OWNEDISAS_TAGTYPE_ELT;

        @objid ("d8b55234-9d1b-4dc1-8609-da665a9b34aa")
        public static TagType HWPROCESSOR_LIFELINE_PREDICTORS_TAGTYPE_ELT;

        @objid ("86658d16-c832-4a58-9ef6-3b4cb37176e5")
        public static TagType HWPROCESSOR_LIFELINE_CACHES_TAGTYPE_ELT;

        @objid ("ae54ff21-0802-4757-9186-300d00fed92d")
        public static TagType HWPROCESSOR_LIFELINE_OWNEDMMUS_TAGTYPE_ELT;

        @objid ("9dc07274-b012-4edd-8ed7-03bb92b29c95")
        private static Stereotype MDAASSOCDEP;

        @objid ("3bda90c0-eee9-45d2-8621-bf207973c9f9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("883b8a8e-4d2b-40de-985c-5c95af742816")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "1043e6ce-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_LIFELINE_ARCHITECTURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "77d35759-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_LIFELINE_MIPS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "77d3574e-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_LIFELINE_IPC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "77d3574f-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_LIFELINE_NBCORES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "77d35750-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_LIFELINE_NBPIPELINES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "77d35751-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_LIFELINE_NBSTAGES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "77d35752-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_LIFELINE_NBALUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "77d35753-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_LIFELINE_NBFPUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "77d35754-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_LIFELINE_OWNEDISAS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "77d35755-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_LIFELINE_PREDICTORS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "77d35756-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_LIFELINE_CACHES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "77d35757-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_LIFELINE_OWNEDMMUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "77d35758-10a3-11df-81d9-0014222a9f79");
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
