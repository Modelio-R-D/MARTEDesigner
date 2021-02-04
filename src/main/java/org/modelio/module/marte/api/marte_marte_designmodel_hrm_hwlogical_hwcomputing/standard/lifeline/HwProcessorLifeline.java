/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("34b0907f-0573-4e39-9cfc-a11e09844f29")
    public static final String STEREOTYPE_NAME = "HwProcessor_Lifeline";

    @objid ("5af0e040-4c39-4555-b9d6-d2843fa3f0f2")
    public static final String HWPROCESSOR_LIFELINE_ARCHITECTURE_TAGTYPE = "HwProcessor_Lifeline_architecture";

    @objid ("f09e3e45-1d3d-4afc-ba5a-ddb26c7474f7")
    public static final String HWPROCESSOR_LIFELINE_CACHES_TAGTYPE = "HwProcessor_Lifeline_caches";

    @objid ("c642b78f-2a8c-475f-bcfd-c942bcfbf3f5")
    public static final String HWPROCESSOR_LIFELINE_IPC_TAGTYPE = "HwProcessor_Lifeline_ipc";

    @objid ("7eb18151-4561-41f1-8418-994df50b4b76")
    public static final String HWPROCESSOR_LIFELINE_MIPS_TAGTYPE = "HwProcessor_Lifeline_mips";

    @objid ("4cf2efaf-9d7c-4e0e-b88c-cde25504a56b")
    public static final String HWPROCESSOR_LIFELINE_NBALUS_TAGTYPE = "HwProcessor_Lifeline_nbALUs";

    @objid ("beee1edc-5c94-4aad-bef5-c0eb0756ef14")
    public static final String HWPROCESSOR_LIFELINE_NBCORES_TAGTYPE = "HwProcessor_Lifeline_nbCores";

    @objid ("f5b7aff4-0d88-4b06-9fe9-ef9a8289c20b")
    public static final String HWPROCESSOR_LIFELINE_NBFPUS_TAGTYPE = "HwProcessor_Lifeline_nbFPUs";

    @objid ("cb7a3336-4a0e-4152-a817-785945afea10")
    public static final String HWPROCESSOR_LIFELINE_NBPIPELINES_TAGTYPE = "HwProcessor_Lifeline_nbPipelines";

    @objid ("5b1f6806-3787-406f-8e47-5916905fd07e")
    public static final String HWPROCESSOR_LIFELINE_NBSTAGES_TAGTYPE = "HwProcessor_Lifeline_nbStages";

    @objid ("c558d0b2-1c91-432f-809c-5cfb391a5033")
    public static final String HWPROCESSOR_LIFELINE_OWNEDISAS_TAGTYPE = "HwProcessor_Lifeline_ownedISAs";

    @objid ("e08fbfca-72e1-491a-9259-fdd25b817be3")
    public static final String HWPROCESSOR_LIFELINE_OWNEDMMUS_TAGTYPE = "HwProcessor_Lifeline_ownedMMUs";

    @objid ("3f0866c0-9f46-4ec2-97f7-9f89387ef609")
    public static final String HWPROCESSOR_LIFELINE_PREDICTORS_TAGTYPE = "HwProcessor_Lifeline_predictors";

    /**
     * Tells whether a {@link HwProcessorLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwProcessor_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bb09cec9-18c3-418f-913e-a53e6e81b41c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwProcessorLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwProcessor_Lifeline >> then instantiate a {@link HwProcessorLifeline} proxy.
     * 
     * @return a {@link HwProcessorLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("9464cc38-763c-4fb2-9885-c8f89babfb76")
    public static HwProcessorLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwProcessorLifeline.STEREOTYPE_NAME);
        return HwProcessorLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwProcessorLifeline} proxy from a {@link Lifeline} stereotyped << HwProcessor_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwProcessorLifeline} proxy or <i>null</i>.
     */
    @objid ("411395d4-cb4e-47f8-bfe0-a0dcc5d05c42")
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
    @objid ("40da03b8-617a-4fd0-ae97-a026b0a66c0b")
    public static HwProcessorLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwProcessorLifeline.canInstantiate(obj))
        	return new HwProcessorLifeline(obj);
        else
        	throw new IllegalArgumentException("HwProcessorLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("921d79d6-c9dc-45d1-bffa-1e386f607170")
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
    @objid ("9411267b-b443-438a-bb46-4c35230faf2b")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'HwProcessor_Lifeline_architecture'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b59bf4cf-372a-4a99-ac2f-532a2f61f6f7")
    public String getHwProcessor_Lifeline_architecture() {
        return this.elt.getTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_ARCHITECTURE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Lifeline_caches'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b4c1b8d0-3fc9-4574-8b2e-7d4ee993a98f")
    public List<String> getHwProcessor_Lifeline_caches() {
        return this.elt.getTagValues(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_CACHES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Lifeline_ipc'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("81dedbe9-4fba-4295-92fc-a4924beba346")
    public String getHwProcessor_Lifeline_ipc() {
        return this.elt.getTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_IPC_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Lifeline_mips'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cef15fe4-df46-4ed6-87c5-1425d38e9d9b")
    public String getHwProcessor_Lifeline_mips() {
        return this.elt.getTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_MIPS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Lifeline_nbALUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7529af30-ca2f-44d6-b749-c896350f4ff2")
    public String getHwProcessor_Lifeline_nbALUs() {
        return this.elt.getTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_NBALUS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Lifeline_nbCores'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f9377064-de7c-4112-aa39-3c0b5827541c")
    public String getHwProcessor_Lifeline_nbCores() {
        return this.elt.getTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_NBCORES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Lifeline_nbFPUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7950080d-f90d-4df1-aced-7c078a63ff34")
    public String getHwProcessor_Lifeline_nbFPUs() {
        return this.elt.getTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_NBFPUS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Lifeline_nbPipelines'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("45f3f79d-fb8b-4e2a-9c4c-e00b0ad09313")
    public String getHwProcessor_Lifeline_nbPipelines() {
        return this.elt.getTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_NBPIPELINES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Lifeline_nbStages'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ca08f619-2d00-47d1-af67-4ee02977c100")
    public String getHwProcessor_Lifeline_nbStages() {
        return this.elt.getTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_NBSTAGES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Lifeline_ownedISAs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("7e595d51-26c5-4c7e-a7f2-27efc42e131d")
    public List<String> getHwProcessor_Lifeline_ownedISAs() {
        return this.elt.getTagValues(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_OWNEDISAS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Lifeline_ownedMMUs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("08f69ba4-5aac-4522-9706-bf1021f1c166")
    public List<String> getHwProcessor_Lifeline_ownedMMUs() {
        return this.elt.getTagValues(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_OWNEDMMUS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Lifeline_predictors'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9d9c31c8-27c3-4da6-ba42-68514db53a65")
    public List<String> getHwProcessor_Lifeline_predictors() {
        return this.elt.getTagValues(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_PREDICTORS_TAGTYPE_ELT);
    }

    @objid ("6fff3f47-de50-4726-9d84-a2b1ce2e3ba3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwProcessor_Lifeline_architecture'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ebe48044-001c-4cd4-854c-d36bb3092b61")
    public void setHwProcessor_Lifeline_architecture(final String value) {
        this.elt.putTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_ARCHITECTURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Lifeline_caches'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d7507c19-bfce-41a1-8fc7-9f248361516b")
    public void setHwProcessor_Lifeline_caches(final List<String> values) {
        this.elt.putTagValues(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_CACHES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwProcessor_Lifeline_ipc'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7dfcc903-2bd1-4df0-8c32-a2230e194343")
    public void setHwProcessor_Lifeline_ipc(final String value) {
        this.elt.putTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_IPC_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Lifeline_mips'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("64dd96d7-8d12-43d9-8d70-1d792b16c837")
    public void setHwProcessor_Lifeline_mips(final String value) {
        this.elt.putTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_MIPS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Lifeline_nbALUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("eb3c965d-4332-43b7-98a7-b87d258ed5d1")
    public void setHwProcessor_Lifeline_nbALUs(final String value) {
        this.elt.putTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_NBALUS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Lifeline_nbCores'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e6f2c1d5-0d55-4c84-86f0-bff14a4d2c83")
    public void setHwProcessor_Lifeline_nbCores(final String value) {
        this.elt.putTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_NBCORES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Lifeline_nbFPUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1b2490ba-e3ef-4ba3-b63b-1f950bdcc322")
    public void setHwProcessor_Lifeline_nbFPUs(final String value) {
        this.elt.putTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_NBFPUS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Lifeline_nbPipelines'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("36f6e1c6-db2e-4446-ae98-8c830a44f81c")
    public void setHwProcessor_Lifeline_nbPipelines(final String value) {
        this.elt.putTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_NBPIPELINES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Lifeline_nbStages'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8a882ce8-406a-4569-9b36-7774728d8e79")
    public void setHwProcessor_Lifeline_nbStages(final String value) {
        this.elt.putTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_NBSTAGES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Lifeline_ownedISAs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9fb10556-d35c-4ebe-a388-dc704018b461")
    public void setHwProcessor_Lifeline_ownedISAs(final List<String> values) {
        this.elt.putTagValues(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_OWNEDISAS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Lifeline_ownedMMUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3a04c5ef-7be5-4f82-a4d7-fce8ed71b982")
    public void setHwProcessor_Lifeline_ownedMMUs(final List<String> values) {
        this.elt.putTagValues(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_OWNEDMMUS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Lifeline_predictors'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8ad83977-1f6c-4b68-b62e-525da92403f8")
    public void setHwProcessor_Lifeline_predictors(final List<String> values) {
        this.elt.putTagValues(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_PREDICTORS_TAGTYPE_ELT, values);
    }

    @objid ("d9c66062-f9fb-4ba5-871a-39100bfc71e5")
    protected HwProcessorLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("2347a7a7-cf0a-4bfe-85af-eea85d1ee51a")
    public static final class MdaTypes {
        @objid ("87e09e14-e0b6-4bec-8609-4d8c9916bfe9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("93e8cb76-8bbb-4abd-8c7f-91ff749d7f32")
        public static TagType HWPROCESSOR_LIFELINE_ARCHITECTURE_TAGTYPE_ELT;

        @objid ("39c7139d-8694-4b83-8d1a-202c62426ceb")
        public static TagType HWPROCESSOR_LIFELINE_MIPS_TAGTYPE_ELT;

        @objid ("7c1b0db4-312c-44b1-bedd-3fea0bd14dce")
        public static TagType HWPROCESSOR_LIFELINE_IPC_TAGTYPE_ELT;

        @objid ("52dcf4e8-8dca-4f21-9b73-7ce6303283d5")
        public static TagType HWPROCESSOR_LIFELINE_NBCORES_TAGTYPE_ELT;

        @objid ("3a7a6d40-0343-4b8e-a145-2f23f248b7f5")
        public static TagType HWPROCESSOR_LIFELINE_NBPIPELINES_TAGTYPE_ELT;

        @objid ("27f20d71-5247-459c-9d39-db849136ab3b")
        public static TagType HWPROCESSOR_LIFELINE_NBSTAGES_TAGTYPE_ELT;

        @objid ("6521f56a-b2dd-4ebc-b1d2-eead17318b46")
        public static TagType HWPROCESSOR_LIFELINE_NBALUS_TAGTYPE_ELT;

        @objid ("b8466566-8aa4-4676-bc0a-5371645b813c")
        public static TagType HWPROCESSOR_LIFELINE_NBFPUS_TAGTYPE_ELT;

        @objid ("9f1ca053-723d-4526-9b37-841e93742480")
        public static TagType HWPROCESSOR_LIFELINE_OWNEDISAS_TAGTYPE_ELT;

        @objid ("417e4cab-5e0b-406f-a00d-fd9cd0894222")
        public static TagType HWPROCESSOR_LIFELINE_PREDICTORS_TAGTYPE_ELT;

        @objid ("bf43fbdd-c404-45c2-80c7-0741bd140d3d")
        public static TagType HWPROCESSOR_LIFELINE_CACHES_TAGTYPE_ELT;

        @objid ("833ce7ff-dbfb-43a5-83a2-dab8274794e0")
        public static TagType HWPROCESSOR_LIFELINE_OWNEDMMUS_TAGTYPE_ELT;

        @objid ("b3ad7d00-7f05-44b8-b369-cc9b2dc99ff1")
        private static Stereotype MDAASSOCDEP;

        @objid ("b658c709-f9b0-4b5b-bc04-778e6a4af696")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0f1d49d2-7ec5-4f22-b28d-f93cb88a8805")
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
