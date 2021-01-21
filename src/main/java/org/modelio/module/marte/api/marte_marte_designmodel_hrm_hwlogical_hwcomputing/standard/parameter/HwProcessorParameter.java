/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.parameter;

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
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << HwProcessor_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("fd2a6ecf-884f-4e92-b873-f556b98ce4e9")
public class HwProcessorParameter extends HwComputingResourceParameter {
    @objid ("a2cd60dd-c88f-446f-bbc9-c2501899166f")
    public static final String STEREOTYPE_NAME = "HwProcessor_Parameter";

    @objid ("f9f730f1-7226-491e-b311-96f188c3b439")
    public static final String HWPROCESSOR_PARAMETER_ARCHITECTURE_TAGTYPE = "HwProcessor_Parameter_architecture";

    @objid ("2cfbb159-06fc-4b38-a503-6f4748b7e792")
    public static final String HWPROCESSOR_PARAMETER_CACHES_TAGTYPE = "HwProcessor_Parameter_caches";

    @objid ("4feec9a4-dd65-4560-bb8f-a70fab654783")
    public static final String HWPROCESSOR_PARAMETER_IPC_TAGTYPE = "HwProcessor_Parameter_ipc";

    @objid ("19dd7172-d46f-40bc-960d-4b61f2e08f73")
    public static final String HWPROCESSOR_PARAMETER_MIPS_TAGTYPE = "HwProcessor_Parameter_mips";

    @objid ("061c000c-9e21-4603-8961-069bbdab01ec")
    public static final String HWPROCESSOR_PARAMETER_NBALUS_TAGTYPE = "HwProcessor_Parameter_nbALUs";

    @objid ("9a4cafec-6b0f-4c94-80e6-e78d88e238cb")
    public static final String HWPROCESSOR_PARAMETER_NBCORES_TAGTYPE = "HwProcessor_Parameter_nbCores";

    @objid ("1ab975bb-5015-4e36-a300-1ec840e7c20e")
    public static final String HWPROCESSOR_PARAMETER_NBFPUS_TAGTYPE = "HwProcessor_Parameter_nbFPUs";

    @objid ("e1e75dc1-f550-4fb2-a735-c53d16c2b2d5")
    public static final String HWPROCESSOR_PARAMETER_NBPIPELINES_TAGTYPE = "HwProcessor_Parameter_nbPipelines";

    @objid ("0dcd1f38-a8d6-4080-b879-5d302ea3e242")
    public static final String HWPROCESSOR_PARAMETER_NBSTAGES_TAGTYPE = "HwProcessor_Parameter_nbStages";

    @objid ("7d197cb6-300d-43bf-9941-c3128c8e9097")
    public static final String HWPROCESSOR_PARAMETER_OWNEDISAS_TAGTYPE = "HwProcessor_Parameter_ownedISAs";

    @objid ("6c5dbb78-3c09-441a-8eaf-b81117182491")
    public static final String HWPROCESSOR_PARAMETER_OWNEDMMUS_TAGTYPE = "HwProcessor_Parameter_ownedMMUs";

    @objid ("c48abfe3-b8da-4182-9ef0-40a3296a06df")
    public static final String HWPROCESSOR_PARAMETER_PREDICTORS_TAGTYPE = "HwProcessor_Parameter_predictors";

    /**
     * Tells whether a {@link HwProcessorParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwProcessor_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("9d071389-494d-4ae0-9b70-67bdf21c0a7b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwProcessorParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwProcessor_Parameter >> then instantiate a {@link HwProcessorParameter} proxy.
     * 
     * @return a {@link HwProcessorParameter} proxy on the created {@link Parameter}.
     */
    @objid ("839903c8-3b54-4a37-b428-06103b8a2df9")
    public static HwProcessorParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwProcessorParameter.STEREOTYPE_NAME);
        return HwProcessorParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwProcessorParameter} proxy from a {@link Parameter} stereotyped << HwProcessor_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwProcessorParameter} proxy or <i>null</i>.
     */
    @objid ("b6ebe420-4ebf-42b6-a715-438460711c0d")
    public static HwProcessorParameter instantiate(final Parameter obj) {
        return HwProcessorParameter.canInstantiate(obj) ? new HwProcessorParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwProcessorParameter} proxy from a {@link Parameter} stereotyped << HwProcessor_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwProcessorParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("95524dd0-3f14-49a9-809a-34d4bee50265")
    public static HwProcessorParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwProcessorParameter.canInstantiate(obj))
        	return new HwProcessorParameter(obj);
        else
        	throw new IllegalArgumentException("HwProcessorParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("37598a69-728e-4180-a6f8-8e0df50c8c3a")
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
        HwProcessorParameter other = (HwProcessorParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("2dec176d-b869-48b2-a9f7-2bdb9d68b3b6")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'HwProcessor_Parameter_architecture'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cc0b917d-d787-4926-ab5a-76a9d9f0e261")
    public String getHwProcessor_Parameter_architecture() {
        return this.elt.getTagValue(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_ARCHITECTURE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Parameter_caches'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("87af1e87-4c8a-444a-aa68-df8ae39ba6ac")
    public List<String> getHwProcessor_Parameter_caches() {
        return this.elt.getTagValues(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_CACHES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Parameter_ipc'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8c8fa181-e2a5-4de8-9017-d7e1038841bf")
    public String getHwProcessor_Parameter_ipc() {
        return this.elt.getTagValue(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_IPC_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Parameter_mips'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("98199073-cdbf-4d65-bf30-3f8c89eac748")
    public String getHwProcessor_Parameter_mips() {
        return this.elt.getTagValue(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_MIPS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Parameter_nbALUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f3a9d024-7ddf-40c1-a13f-229b54d02912")
    public String getHwProcessor_Parameter_nbALUs() {
        return this.elt.getTagValue(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_NBALUS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Parameter_nbCores'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f4205eaa-5dbb-486d-9b4a-2e72080b1244")
    public String getHwProcessor_Parameter_nbCores() {
        return this.elt.getTagValue(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_NBCORES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Parameter_nbFPUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cae5de4c-8de8-4863-9e0f-7bc1c6ded9d1")
    public String getHwProcessor_Parameter_nbFPUs() {
        return this.elt.getTagValue(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_NBFPUS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Parameter_nbPipelines'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("88f4597c-e680-4629-bdc4-c1bc2ac051f1")
    public String getHwProcessor_Parameter_nbPipelines() {
        return this.elt.getTagValue(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_NBPIPELINES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Parameter_nbStages'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("955c0290-ee0c-4887-afad-5086501a6b94")
    public String getHwProcessor_Parameter_nbStages() {
        return this.elt.getTagValue(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_NBSTAGES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Parameter_ownedISAs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("77976feb-5912-4246-a698-173619a4377f")
    public List<String> getHwProcessor_Parameter_ownedISAs() {
        return this.elt.getTagValues(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_OWNEDISAS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Parameter_ownedMMUs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ce6f349c-3b0b-45e5-ad75-992bf9780bcb")
    public List<String> getHwProcessor_Parameter_ownedMMUs() {
        return this.elt.getTagValues(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_OWNEDMMUS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Parameter_predictors'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("65da761b-df79-4d96-a308-1253aa0d5abf")
    public List<String> getHwProcessor_Parameter_predictors() {
        return this.elt.getTagValues(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_PREDICTORS_TAGTYPE_ELT);
    }

    @objid ("ec85a5be-c3e0-427e-b9a9-e270db8a6eb7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwProcessor_Parameter_architecture'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("96bfe3bf-85e6-48ad-99ba-870e194cfc59")
    public void setHwProcessor_Parameter_architecture(final String value) {
        this.elt.putTagValue(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_ARCHITECTURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Parameter_caches'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6e3c6a78-e85d-4fff-b6fd-3aa5171d997d")
    public void setHwProcessor_Parameter_caches(final List<String> values) {
        this.elt.putTagValues(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_CACHES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwProcessor_Parameter_ipc'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b7c4b8ce-ecf4-46ba-bc9e-7f9b5dde12dd")
    public void setHwProcessor_Parameter_ipc(final String value) {
        this.elt.putTagValue(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_IPC_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Parameter_mips'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b1d5ffdf-2b3d-4df7-a5be-ef2035e8c074")
    public void setHwProcessor_Parameter_mips(final String value) {
        this.elt.putTagValue(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_MIPS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Parameter_nbALUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a9970dae-ea91-4de3-b383-96e95f085d54")
    public void setHwProcessor_Parameter_nbALUs(final String value) {
        this.elt.putTagValue(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_NBALUS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Parameter_nbCores'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("21bf1ed6-f10b-4240-ae3f-f9bd2c113680")
    public void setHwProcessor_Parameter_nbCores(final String value) {
        this.elt.putTagValue(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_NBCORES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Parameter_nbFPUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("093315ef-e444-46ca-bfb9-325900a0ba4b")
    public void setHwProcessor_Parameter_nbFPUs(final String value) {
        this.elt.putTagValue(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_NBFPUS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Parameter_nbPipelines'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("71895f38-c8e2-4ded-bd1e-13f53821d8da")
    public void setHwProcessor_Parameter_nbPipelines(final String value) {
        this.elt.putTagValue(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_NBPIPELINES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Parameter_nbStages'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2d9dc911-f6ab-4fd4-8c6c-c83e02af1e0c")
    public void setHwProcessor_Parameter_nbStages(final String value) {
        this.elt.putTagValue(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_NBSTAGES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Parameter_ownedISAs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("107dc3f1-a964-4054-b6aa-49e827940bdb")
    public void setHwProcessor_Parameter_ownedISAs(final List<String> values) {
        this.elt.putTagValues(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_OWNEDISAS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Parameter_ownedMMUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0633b896-6d5b-4ca6-8888-08170032e21a")
    public void setHwProcessor_Parameter_ownedMMUs(final List<String> values) {
        this.elt.putTagValues(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_OWNEDMMUS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Parameter_predictors'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a86e4a34-16e1-45e7-a263-9b2147e32ca1")
    public void setHwProcessor_Parameter_predictors(final List<String> values) {
        this.elt.putTagValues(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_PREDICTORS_TAGTYPE_ELT, values);
    }

    @objid ("d61e0b61-75b4-4f10-a233-1b81798e5b42")
    protected HwProcessorParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("6e32f544-6e6f-4dfd-96a3-b1576d8a528a")
    public static final class MdaTypes {
        @objid ("67d9953e-6b57-4661-91dd-fae5f8e99466")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f34e9413-2f33-4561-9f6d-7345a67b2455")
        public static TagType HWPROCESSOR_PARAMETER_ARCHITECTURE_TAGTYPE_ELT;

        @objid ("d89fe3a7-10d9-43ba-9b7c-734134a4e30b")
        public static TagType HWPROCESSOR_PARAMETER_MIPS_TAGTYPE_ELT;

        @objid ("31031b05-7f3f-4c64-9bf8-7bdd63b64269")
        public static TagType HWPROCESSOR_PARAMETER_IPC_TAGTYPE_ELT;

        @objid ("4d9c74c0-58bc-4470-b027-7adc31254270")
        public static TagType HWPROCESSOR_PARAMETER_NBCORES_TAGTYPE_ELT;

        @objid ("7025147a-23c3-4c34-add2-f034c4f46ac4")
        public static TagType HWPROCESSOR_PARAMETER_NBPIPELINES_TAGTYPE_ELT;

        @objid ("44565db1-c26e-4b45-a59c-eeb2a2eea6d8")
        public static TagType HWPROCESSOR_PARAMETER_NBSTAGES_TAGTYPE_ELT;

        @objid ("2d4344b3-a9b3-4d22-bf03-3d3490544792")
        public static TagType HWPROCESSOR_PARAMETER_NBALUS_TAGTYPE_ELT;

        @objid ("d5800cef-813b-4979-a6b7-38145cadd791")
        public static TagType HWPROCESSOR_PARAMETER_NBFPUS_TAGTYPE_ELT;

        @objid ("2c65b9bc-9575-45f3-aab6-aee18bb9dc9f")
        public static TagType HWPROCESSOR_PARAMETER_OWNEDISAS_TAGTYPE_ELT;

        @objid ("f0c83e56-46b6-4677-927c-084fcd2f4490")
        public static TagType HWPROCESSOR_PARAMETER_PREDICTORS_TAGTYPE_ELT;

        @objid ("963e5ab3-691c-4666-81cc-83615036918e")
        public static TagType HWPROCESSOR_PARAMETER_CACHES_TAGTYPE_ELT;

        @objid ("ee9bb439-6d93-452e-bd38-96f46f256232")
        public static TagType HWPROCESSOR_PARAMETER_OWNEDMMUS_TAGTYPE_ELT;

        @objid ("40f417d8-a1cd-4f6f-965e-10b3d46965d9")
        private static Stereotype MDAASSOCDEP;

        @objid ("24859d42-479b-44e8-a9fa-955ddcf90b9f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bbfe1f37-f306-46b2-88b6-3b7bab0bf663")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00d3bc7e-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_PARAMETER_ARCHITECTURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dae380-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_PARAMETER_MIPS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dae387-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_PARAMETER_IPC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dae38e-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_PARAMETER_NBCORES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dae395-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_PARAMETER_NBPIPELINES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dae39c-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_PARAMETER_NBSTAGES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dae3a3-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_PARAMETER_NBALUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45cc-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_PARAMETER_NBFPUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45d3-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_PARAMETER_OWNEDISAS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45da-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_PARAMETER_PREDICTORS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45e1-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_PARAMETER_CACHES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45e8-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_PARAMETER_OWNEDMMUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dfa818-0ccf-11df-8525-001302895b2b");
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
