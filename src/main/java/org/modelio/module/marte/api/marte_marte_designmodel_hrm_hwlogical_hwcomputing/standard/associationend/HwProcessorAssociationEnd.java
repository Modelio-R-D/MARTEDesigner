/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << HwProcessor_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c1736053-35f4-4352-88ca-d418e7d74f79")
public class HwProcessorAssociationEnd extends HwComputingResourceAssociationEnd {
    @objid ("36cf92c3-f4a6-40e5-96dd-d82676f361b0")
    public static final String STEREOTYPE_NAME = "HwProcessor_AssociationEnd";

    @objid ("f78983ef-2850-4bb1-8c58-ceb473a30dc2")
    public static final String HWPROCESSOR_ASSOCIATIONEND_ARCHITECTURE_TAGTYPE = "HwProcessor_AssociationEnd_architecture";

    @objid ("acd7f3ca-5050-4fc6-9482-17379702b20e")
    public static final String HWPROCESSOR_ASSOCIATIONEND_CACHES_TAGTYPE = "HwProcessor_AssociationEnd_caches";

    @objid ("211145d0-8a50-482c-9151-ea029b3704c7")
    public static final String HWPROCESSOR_ASSOCIATIONEND_IPC_TAGTYPE = "HwProcessor_AssociationEnd_ipc";

    @objid ("a3a4f18e-4613-4726-b728-ce7795f450ee")
    public static final String HWPROCESSOR_ASSOCIATIONEND_MIPS_TAGTYPE = "HwProcessor_AssociationEnd_mips";

    @objid ("d2577b98-b45e-4f9e-a7b2-f70b6e193be1")
    public static final String HWPROCESSOR_ASSOCIATIONEND_NBALUS_TAGTYPE = "HwProcessor_AssociationEnd_nbALUs";

    @objid ("ad3c29ba-8b11-488f-a439-05696ca3d0d2")
    public static final String HWPROCESSOR_ASSOCIATIONEND_NBCORES_TAGTYPE = "HwProcessor_AssociationEnd_nbCores";

    @objid ("47e1e1c8-ee5d-4204-85af-7dbfca161852")
    public static final String HWPROCESSOR_ASSOCIATIONEND_NBFPUS_TAGTYPE = "HwProcessor_AssociationEnd_nbFPUs";

    @objid ("0db643d8-a805-4beb-90de-743d1c475872")
    public static final String HWPROCESSOR_ASSOCIATIONEND_NBPIPELINES_TAGTYPE = "HwProcessor_AssociationEnd_nbPipelines";

    @objid ("889d358a-d9ba-47cd-a6ce-cc0004a7bc9f")
    public static final String HWPROCESSOR_ASSOCIATIONEND_NBSTAGES_TAGTYPE = "HwProcessor_AssociationEnd_nbStages";

    @objid ("72bcf363-7473-463e-acc6-697a2160481e")
    public static final String HWPROCESSOR_ASSOCIATIONEND_OWNEDISAS_TAGTYPE = "HwProcessor_AssociationEnd_ownedISAs";

    @objid ("ae555243-9c59-427f-b883-43e9135adc41")
    public static final String HWPROCESSOR_ASSOCIATIONEND_OWNEDMMUS_TAGTYPE = "HwProcessor_AssociationEnd_ownedMMUs";

    @objid ("273a5c62-cd6e-4506-8e12-a1e924f5b31a")
    public static final String HWPROCESSOR_ASSOCIATIONEND_PREDICTORS_TAGTYPE = "HwProcessor_AssociationEnd_predictors";

    /**
     * Tells whether a {@link HwProcessorAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwProcessor_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("d7bda609-f7e7-4e5f-b4c1-5cd47b7cbb65")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwProcessorAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwProcessor_AssociationEnd >> then instantiate a {@link HwProcessorAssociationEnd} proxy.
     * 
     * @return a {@link HwProcessorAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("784cbae6-5633-45e5-b19a-09edf9561e09")
    public static HwProcessorAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwProcessorAssociationEnd.STEREOTYPE_NAME);
        return HwProcessorAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwProcessorAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwProcessor_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwProcessorAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("8452499e-6705-46c1-9025-ecd56c998fb1")
    public static HwProcessorAssociationEnd instantiate(final AssociationEnd obj) {
        return HwProcessorAssociationEnd.canInstantiate(obj) ? new HwProcessorAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwProcessorAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwProcessor_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwProcessorAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("dc9a989b-0f5b-42f6-aca5-d40c757a9e06")
    public static HwProcessorAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwProcessorAssociationEnd.canInstantiate(obj))
        	return new HwProcessorAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwProcessorAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b6d2cb84-7945-45e5-9d91-b228d464db4e")
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
        HwProcessorAssociationEnd other = (HwProcessorAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("faaa09ec-1b30-478c-85b5-5ed7f8852227")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'HwProcessor_AssociationEnd_architecture'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("76ce3546-64bd-423f-9d79-d25b70d24d28")
    public String getHwProcessor_AssociationEnd_architecture() {
        return this.elt.getTagValue(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_ARCHITECTURE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_AssociationEnd_caches'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("528ff4d1-18a7-482f-b6a4-79fe73f69d01")
    public List<String> getHwProcessor_AssociationEnd_caches() {
        return this.elt.getTagValues(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_CACHES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_AssociationEnd_ipc'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("291ddfe2-3ff6-4f9b-b1e0-44706e9160b7")
    public String getHwProcessor_AssociationEnd_ipc() {
        return this.elt.getTagValue(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_IPC_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_AssociationEnd_mips'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e583e5e7-3fa8-401b-85bb-0f4bc9b22dd3")
    public String getHwProcessor_AssociationEnd_mips() {
        return this.elt.getTagValue(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_MIPS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_AssociationEnd_nbALUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1f7aa472-3311-4085-ab2e-228f19ba0786")
    public String getHwProcessor_AssociationEnd_nbALUs() {
        return this.elt.getTagValue(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_NBALUS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_AssociationEnd_nbCores'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("57309682-495e-4e3f-94b2-ebea703cda31")
    public String getHwProcessor_AssociationEnd_nbCores() {
        return this.elt.getTagValue(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_NBCORES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_AssociationEnd_nbFPUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2efee297-8dfd-4852-85d4-f5dae5377d28")
    public String getHwProcessor_AssociationEnd_nbFPUs() {
        return this.elt.getTagValue(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_NBFPUS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_AssociationEnd_nbPipelines'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dec5fe8f-bb1e-4b41-a7e3-6af9c0595994")
    public String getHwProcessor_AssociationEnd_nbPipelines() {
        return this.elt.getTagValue(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_NBPIPELINES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_AssociationEnd_nbStages'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("01bf1e9b-2f65-4620-b96a-e2bed17c7329")
    public String getHwProcessor_AssociationEnd_nbStages() {
        return this.elt.getTagValue(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_NBSTAGES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_AssociationEnd_ownedISAs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a0acd0c4-790c-483a-adb4-98d607765e6b")
    public List<String> getHwProcessor_AssociationEnd_ownedISAs() {
        return this.elt.getTagValues(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_OWNEDISAS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_AssociationEnd_ownedMMUs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("eeb667d7-b0b4-4801-a26a-0adee1b57f42")
    public List<String> getHwProcessor_AssociationEnd_ownedMMUs() {
        return this.elt.getTagValues(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_OWNEDMMUS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_AssociationEnd_predictors'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d85394f0-a0e9-44ed-b59a-40e6b9595a23")
    public List<String> getHwProcessor_AssociationEnd_predictors() {
        return this.elt.getTagValues(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_PREDICTORS_TAGTYPE_ELT);
    }

    @objid ("d78883f8-aafd-40ba-8c2a-5aec428cae45")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwProcessor_AssociationEnd_architecture'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("07d88ab4-f2b5-4b10-ad5c-e7b9049f1408")
    public void setHwProcessor_AssociationEnd_architecture(final String value) {
        this.elt.putTagValue(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_ARCHITECTURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwProcessor_AssociationEnd_caches'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e7c5e9a0-b93c-4da7-9da9-aa11029a98bd")
    public void setHwProcessor_AssociationEnd_caches(final List<String> values) {
        this.elt.putTagValues(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_CACHES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwProcessor_AssociationEnd_ipc'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4b404f19-da61-4e49-bd5c-dcc5260bb4d6")
    public void setHwProcessor_AssociationEnd_ipc(final String value) {
        this.elt.putTagValue(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_IPC_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_AssociationEnd_mips'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ac670169-bd4f-464b-9725-2e439aa6ef76")
    public void setHwProcessor_AssociationEnd_mips(final String value) {
        this.elt.putTagValue(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_MIPS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_AssociationEnd_nbALUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4a2ffbd8-a227-4fcd-a324-b2f9a5c8d58c")
    public void setHwProcessor_AssociationEnd_nbALUs(final String value) {
        this.elt.putTagValue(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_NBALUS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_AssociationEnd_nbCores'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9d11b518-6005-4017-9831-f14ca9567d19")
    public void setHwProcessor_AssociationEnd_nbCores(final String value) {
        this.elt.putTagValue(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_NBCORES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_AssociationEnd_nbFPUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2c1fd8db-6a87-44b1-ab62-3fc05c5eb919")
    public void setHwProcessor_AssociationEnd_nbFPUs(final String value) {
        this.elt.putTagValue(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_NBFPUS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_AssociationEnd_nbPipelines'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5e803ca6-3433-4173-a3d2-5f53b6bc3ead")
    public void setHwProcessor_AssociationEnd_nbPipelines(final String value) {
        this.elt.putTagValue(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_NBPIPELINES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_AssociationEnd_nbStages'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("512f804b-e851-42b1-bf21-d715b8c773aa")
    public void setHwProcessor_AssociationEnd_nbStages(final String value) {
        this.elt.putTagValue(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_NBSTAGES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwProcessor_AssociationEnd_ownedISAs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("93b1dc86-140f-4d4c-9f5a-662be8e2d1ee")
    public void setHwProcessor_AssociationEnd_ownedISAs(final List<String> values) {
        this.elt.putTagValues(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_OWNEDISAS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwProcessor_AssociationEnd_ownedMMUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2f1f8efc-bbff-42b8-9813-52b8d57bf896")
    public void setHwProcessor_AssociationEnd_ownedMMUs(final List<String> values) {
        this.elt.putTagValues(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_OWNEDMMUS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwProcessor_AssociationEnd_predictors'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b6f9be4f-e2ce-42bc-a517-36ac8639b130")
    public void setHwProcessor_AssociationEnd_predictors(final List<String> values) {
        this.elt.putTagValues(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_PREDICTORS_TAGTYPE_ELT, values);
    }

    @objid ("20a9e564-c884-43da-95ca-eb2a6b5b95c9")
    protected HwProcessorAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("5a5786a8-4448-4ad7-aca2-b273741f26c3")
    public static final class MdaTypes {
        @objid ("17205399-df67-4a86-892c-799423df3935")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b9de4f2c-2a74-4c37-8de2-3c58468d9de8")
        public static TagType HWPROCESSOR_ASSOCIATIONEND_ARCHITECTURE_TAGTYPE_ELT;

        @objid ("4738ca6b-2e65-481e-bc4f-f4854818397f")
        public static TagType HWPROCESSOR_ASSOCIATIONEND_MIPS_TAGTYPE_ELT;

        @objid ("5afd9957-c9ad-48bc-8d0c-661467bc92c6")
        public static TagType HWPROCESSOR_ASSOCIATIONEND_IPC_TAGTYPE_ELT;

        @objid ("d793c392-171f-492b-9951-12b532822041")
        public static TagType HWPROCESSOR_ASSOCIATIONEND_NBCORES_TAGTYPE_ELT;

        @objid ("41743324-45ea-4e1f-aff1-2b426030aeb1")
        public static TagType HWPROCESSOR_ASSOCIATIONEND_NBPIPELINES_TAGTYPE_ELT;

        @objid ("c3e760e8-c84e-4f2f-893f-123e96636c9e")
        public static TagType HWPROCESSOR_ASSOCIATIONEND_NBSTAGES_TAGTYPE_ELT;

        @objid ("1bde78c2-21bf-45a0-8f4c-d5c1191e329e")
        public static TagType HWPROCESSOR_ASSOCIATIONEND_NBALUS_TAGTYPE_ELT;

        @objid ("3f135aaa-6ff5-46f2-baa2-16d731123d96")
        public static TagType HWPROCESSOR_ASSOCIATIONEND_NBFPUS_TAGTYPE_ELT;

        @objid ("8155923c-17f5-49d4-81ea-05ca8c9ed497")
        public static TagType HWPROCESSOR_ASSOCIATIONEND_OWNEDISAS_TAGTYPE_ELT;

        @objid ("1a6058f6-6a17-4771-8e5d-a66fa74c128b")
        public static TagType HWPROCESSOR_ASSOCIATIONEND_PREDICTORS_TAGTYPE_ELT;

        @objid ("ad7ef711-75aa-406f-980e-b395823e4489")
        public static TagType HWPROCESSOR_ASSOCIATIONEND_CACHES_TAGTYPE_ELT;

        @objid ("d5416c6f-b266-4646-98b8-e2a0682a2251")
        public static TagType HWPROCESSOR_ASSOCIATIONEND_OWNEDMMUS_TAGTYPE_ELT;

        @objid ("9c9f78de-8f2a-4611-8136-5e0f5ecb6b0e")
        private static Stereotype MDAASSOCDEP;

        @objid ("44521bff-b700-4dab-b6d8-82248faf7acf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("19ae834d-8a17-40aa-82a7-cc887cad5b3d")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00dae37a-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_ASSOCIATIONEND_ARCHITECTURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dae381-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_ASSOCIATIONEND_MIPS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dae388-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_ASSOCIATIONEND_IPC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dae38f-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_ASSOCIATIONEND_NBCORES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dae396-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_ASSOCIATIONEND_NBPIPELINES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dae39d-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_ASSOCIATIONEND_NBSTAGES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45c6-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_ASSOCIATIONEND_NBALUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45cd-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_ASSOCIATIONEND_NBFPUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45d4-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_ASSOCIATIONEND_OWNEDISAS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45db-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_ASSOCIATIONEND_PREDICTORS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45e2-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_ASSOCIATIONEND_CACHES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45e9-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_ASSOCIATIONEND_OWNEDMMUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dfa819-0ccf-11df-8525-001302895b2b");
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
