/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << HwProcessor_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d3d4cc5b-d5eb-4a45-af05-6dfabb575a11")
public class HwProcessorInstance extends HwComputingResourceInstance {
    @objid ("06c3507b-0af5-4874-98b4-2be03d56ae55")
    public static final String STEREOTYPE_NAME = "HwProcessor_Instance";

    @objid ("6ed06fa8-363a-454b-bb9b-560c35727c55")
    public static final String HWPROCESSOR_INSTANCE_ARCHITECTURE_TAGTYPE = "HwProcessor_Instance_architecture";

    @objid ("0e8063d3-0ff9-408f-8522-91ee3e914cc5")
    public static final String HWPROCESSOR_INSTANCE_CACHES_TAGTYPE = "HwProcessor_Instance_caches";

    @objid ("954d50bc-2060-43d0-988b-d1762002a47b")
    public static final String HWPROCESSOR_INSTANCE_IPC_TAGTYPE = "HwProcessor_Instance_ipc";

    @objid ("d8db7019-c07f-4bdf-8ccf-a58d84716954")
    public static final String HWPROCESSOR_INSTANCE_MIPS_TAGTYPE = "HwProcessor_Instance_mips";

    @objid ("382dc540-7fc8-4e32-8eb2-638353aee7fc")
    public static final String HWPROCESSOR_INSTANCE_NBALUS_TAGTYPE = "HwProcessor_Instance_nbALUs";

    @objid ("983b7092-4117-48f7-9db9-7456b3c56cd8")
    public static final String HWPROCESSOR_INSTANCE_NBCORES_TAGTYPE = "HwProcessor_Instance_nbCores";

    @objid ("ce102629-948e-47d9-b786-d3bc013c760f")
    public static final String HWPROCESSOR_INSTANCE_NBFPUS_TAGTYPE = "HwProcessor_Instance_nbFPUs";

    @objid ("dc25c27b-f5c1-4f00-8c0a-6025b9e34aa0")
    public static final String HWPROCESSOR_INSTANCE_NBPIPELINES_TAGTYPE = "HwProcessor_Instance_nbPipelines";

    @objid ("99dc2a7b-419d-4ffb-b501-f0546bdf1a56")
    public static final String HWPROCESSOR_INSTANCE_NBSTAGES_TAGTYPE = "HwProcessor_Instance_nbStages";

    @objid ("3bb2c55c-4fa6-4bb5-8dcc-7b1963470679")
    public static final String HWPROCESSOR_INSTANCE_OWNEDISAS_TAGTYPE = "HwProcessor_Instance_ownedISAs";

    @objid ("8a9bafce-4329-4038-ac33-6e13e96b41eb")
    public static final String HWPROCESSOR_INSTANCE_OWNEDMMUS_TAGTYPE = "HwProcessor_Instance_ownedMMUs";

    @objid ("7c4f8374-2b72-4077-b770-d8d51ac6c1b5")
    public static final String HWPROCESSOR_INSTANCE_PREDICTORS_TAGTYPE = "HwProcessor_Instance_predictors";

    /**
     * Tells whether a {@link HwProcessorInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwProcessor_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("19f73a27-f6df-4daf-9f80-5558b7fa0490")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwProcessorInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwProcessor_Instance >> then instantiate a {@link HwProcessorInstance} proxy.
     * 
     * @return a {@link HwProcessorInstance} proxy on the created {@link Instance}.
     */
    @objid ("fdd7f3d1-22b2-4c85-bdb0-bdbf9b7e8c35")
    public static HwProcessorInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwProcessorInstance.STEREOTYPE_NAME);
        return HwProcessorInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwProcessorInstance} proxy from a {@link Instance} stereotyped << HwProcessor_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwProcessorInstance} proxy or <i>null</i>.
     */
    @objid ("65a6f6cf-3f9d-44d3-aaef-c190d557c36c")
    public static HwProcessorInstance instantiate(final Instance obj) {
        return HwProcessorInstance.canInstantiate(obj) ? new HwProcessorInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwProcessorInstance} proxy from a {@link Instance} stereotyped << HwProcessor_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link HwProcessorInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("82a4b003-6cc5-4279-9147-5df16d2656da")
    public static HwProcessorInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwProcessorInstance.canInstantiate(obj))
        	return new HwProcessorInstance(obj);
        else
        	throw new IllegalArgumentException("HwProcessorInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5cab8073-c282-46f6-ae86-bcb6978fbc3e")
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
        HwProcessorInstance other = (HwProcessorInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("ff76f625-1e3a-4a1b-8fdc-5b347f171da3")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'HwProcessor_Instance_architecture'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("184bb26b-9dc8-4d00-b274-c17f66f640e7")
    public String getHwProcessor_Instance_architecture() {
        return this.elt.getTagValue(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_ARCHITECTURE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Instance_caches'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("cab2233d-9ca5-4024-acbb-89a6deea51b2")
    public List<String> getHwProcessor_Instance_caches() {
        return this.elt.getTagValues(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_CACHES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Instance_ipc'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4b28b5a4-a255-447a-8321-3827f2540e8a")
    public String getHwProcessor_Instance_ipc() {
        return this.elt.getTagValue(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_IPC_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Instance_mips'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("84d1e4e1-1150-460f-a652-c72c8635d189")
    public String getHwProcessor_Instance_mips() {
        return this.elt.getTagValue(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_MIPS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Instance_nbALUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ba0213d4-9246-4691-808a-01cd91cc932a")
    public String getHwProcessor_Instance_nbALUs() {
        return this.elt.getTagValue(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_NBALUS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Instance_nbCores'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5ed5aff8-ca21-44e7-9940-d907a36db7f0")
    public String getHwProcessor_Instance_nbCores() {
        return this.elt.getTagValue(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_NBCORES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Instance_nbFPUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a5a58830-36e3-414c-835d-7fe68a686396")
    public String getHwProcessor_Instance_nbFPUs() {
        return this.elt.getTagValue(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_NBFPUS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Instance_nbPipelines'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8ca8d758-a19a-413e-9b37-adbc892a8e3d")
    public String getHwProcessor_Instance_nbPipelines() {
        return this.elt.getTagValue(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_NBPIPELINES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Instance_nbStages'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7d671a69-a61b-4ed0-8a6b-d0b1ffa2a41d")
    public String getHwProcessor_Instance_nbStages() {
        return this.elt.getTagValue(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_NBSTAGES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Instance_ownedISAs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("61e60e0b-f5ab-4fee-98a8-277e713c4d92")
    public List<String> getHwProcessor_Instance_ownedISAs() {
        return this.elt.getTagValues(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_OWNEDISAS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Instance_ownedMMUs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ca5c2ec4-8e96-43dc-a0bc-caa1aa0f72ac")
    public List<String> getHwProcessor_Instance_ownedMMUs() {
        return this.elt.getTagValues(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_OWNEDMMUS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Instance_predictors'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3eb4a426-9f3f-474e-b86f-525ded845147")
    public List<String> getHwProcessor_Instance_predictors() {
        return this.elt.getTagValues(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_PREDICTORS_TAGTYPE_ELT);
    }

    @objid ("f8795c88-7a7b-4627-8fe3-6eb7a0679312")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwProcessor_Instance_architecture'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("93c225ae-d12b-4de0-85f5-39ddba565f05")
    public void setHwProcessor_Instance_architecture(final String value) {
        this.elt.putTagValue(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_ARCHITECTURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Instance_caches'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("122f4ff5-e06d-45d4-8bea-7aaba4088d19")
    public void setHwProcessor_Instance_caches(final List<String> values) {
        this.elt.putTagValues(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_CACHES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwProcessor_Instance_ipc'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f313a9fa-0c24-4118-b466-4ce4eff85cb5")
    public void setHwProcessor_Instance_ipc(final String value) {
        this.elt.putTagValue(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_IPC_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Instance_mips'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f3776900-d2e6-4c83-a942-743351f5c786")
    public void setHwProcessor_Instance_mips(final String value) {
        this.elt.putTagValue(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_MIPS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Instance_nbALUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7bf0487c-d585-4dd3-a8d3-05fe22ced63d")
    public void setHwProcessor_Instance_nbALUs(final String value) {
        this.elt.putTagValue(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_NBALUS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Instance_nbCores'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("282c0b9b-3bf5-4528-9728-b33d9f777dbe")
    public void setHwProcessor_Instance_nbCores(final String value) {
        this.elt.putTagValue(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_NBCORES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Instance_nbFPUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("64c7dff6-1d63-4f75-8fa8-fc0d122597f4")
    public void setHwProcessor_Instance_nbFPUs(final String value) {
        this.elt.putTagValue(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_NBFPUS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Instance_nbPipelines'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("30b166fb-b00a-47a9-90ac-754af7310d07")
    public void setHwProcessor_Instance_nbPipelines(final String value) {
        this.elt.putTagValue(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_NBPIPELINES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Instance_nbStages'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("41327b59-4e9a-481d-bc73-28aef2d0fbff")
    public void setHwProcessor_Instance_nbStages(final String value) {
        this.elt.putTagValue(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_NBSTAGES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Instance_ownedISAs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7fef2aff-160d-410c-be0f-beca36971660")
    public void setHwProcessor_Instance_ownedISAs(final List<String> values) {
        this.elt.putTagValues(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_OWNEDISAS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Instance_ownedMMUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("911d2583-c936-49bd-9ab6-ab777c22c7af")
    public void setHwProcessor_Instance_ownedMMUs(final List<String> values) {
        this.elt.putTagValues(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_OWNEDMMUS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Instance_predictors'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a119f182-9d58-4482-8eb7-f483adf55d65")
    public void setHwProcessor_Instance_predictors(final List<String> values) {
        this.elt.putTagValues(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_PREDICTORS_TAGTYPE_ELT, values);
    }

    @objid ("487fcf9a-1597-4716-b30f-82fdd10ad938")
    protected HwProcessorInstance(final Instance elt) {
        super(elt);
    }

    @objid ("b618a912-b714-44fc-adb6-8e9295cb7329")
    public static final class MdaTypes {
        @objid ("8d392aeb-1461-4811-982b-a584726a6fd3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c4ccce65-2438-4100-9207-f2b547a01f6a")
        public static TagType HWPROCESSOR_INSTANCE_ARCHITECTURE_TAGTYPE_ELT;

        @objid ("cf9ba4c8-ace1-47f4-8a6c-12fd30ccd582")
        public static TagType HWPROCESSOR_INSTANCE_MIPS_TAGTYPE_ELT;

        @objid ("21a3cda3-3769-423c-a9a9-87a0b9202531")
        public static TagType HWPROCESSOR_INSTANCE_IPC_TAGTYPE_ELT;

        @objid ("c5f4af18-3f4d-4153-a72b-13cc864f9d1a")
        public static TagType HWPROCESSOR_INSTANCE_NBCORES_TAGTYPE_ELT;

        @objid ("b36d4837-9ba7-42f9-845b-22f2adb51021")
        public static TagType HWPROCESSOR_INSTANCE_NBPIPELINES_TAGTYPE_ELT;

        @objid ("2b4cdf1e-9880-40d4-a662-ee8b7b0dd1af")
        public static TagType HWPROCESSOR_INSTANCE_NBSTAGES_TAGTYPE_ELT;

        @objid ("be2bc08d-1ec7-4937-885a-be05a7a23d62")
        public static TagType HWPROCESSOR_INSTANCE_NBALUS_TAGTYPE_ELT;

        @objid ("3d57188c-5450-4b9a-9db6-1bd6b7b5ffc9")
        public static TagType HWPROCESSOR_INSTANCE_NBFPUS_TAGTYPE_ELT;

        @objid ("c66b0858-043f-496d-9b86-ecbeb6c57e9c")
        public static TagType HWPROCESSOR_INSTANCE_OWNEDISAS_TAGTYPE_ELT;

        @objid ("107741b3-b5ee-47dd-993a-8f2c25bc7e48")
        public static TagType HWPROCESSOR_INSTANCE_PREDICTORS_TAGTYPE_ELT;

        @objid ("03ba3719-75b8-408a-a7c5-2c73f5bca273")
        public static TagType HWPROCESSOR_INSTANCE_CACHES_TAGTYPE_ELT;

        @objid ("1008333c-0e62-4048-a3fa-778288b7abd7")
        public static TagType HWPROCESSOR_INSTANCE_OWNEDMMUS_TAGTYPE_ELT;

        @objid ("49a50bf4-18f0-4d70-88a1-2e7c28a60945")
        private static Stereotype MDAASSOCDEP;

        @objid ("fc40ed1b-62f6-4166-ae64-3254c6472dd3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("42fc78f8-2dd7-4297-860e-fb3105529221")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00dae37f-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_INSTANCE_ARCHITECTURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dae386-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_INSTANCE_MIPS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dae38d-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_INSTANCE_IPC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dae394-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_INSTANCE_NBCORES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dae39b-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_INSTANCE_NBPIPELINES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dae3a2-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_INSTANCE_NBSTAGES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45cb-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_INSTANCE_NBALUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45d2-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_INSTANCE_NBFPUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45d9-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_INSTANCE_OWNEDISAS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45e0-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_INSTANCE_PREDICTORS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45e7-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_INSTANCE_CACHES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45ee-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_INSTANCE_OWNEDMMUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dfa81e-0ccf-11df-8525-001302895b2b");
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
