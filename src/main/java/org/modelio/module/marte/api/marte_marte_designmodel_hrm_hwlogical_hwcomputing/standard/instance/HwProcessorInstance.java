/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.instance;

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
public class HwProcessorInstance extends HwComputingResourceInstance {
    public static final String STEREOTYPE_NAME = "HwProcessor_Instance";

    public static final String HWPROCESSOR_INSTANCE_ARCHITECTURE_TAGTYPE = "HwProcessor_Instance_architecture";

    public static final String HWPROCESSOR_INSTANCE_CACHES_TAGTYPE = "HwProcessor_Instance_caches";

    public static final String HWPROCESSOR_INSTANCE_IPC_TAGTYPE = "HwProcessor_Instance_ipc";

    public static final String HWPROCESSOR_INSTANCE_MIPS_TAGTYPE = "HwProcessor_Instance_mips";

    public static final String HWPROCESSOR_INSTANCE_NBALUS_TAGTYPE = "HwProcessor_Instance_nbALUs";

    public static final String HWPROCESSOR_INSTANCE_NBCORES_TAGTYPE = "HwProcessor_Instance_nbCores";

    public static final String HWPROCESSOR_INSTANCE_NBFPUS_TAGTYPE = "HwProcessor_Instance_nbFPUs";

    public static final String HWPROCESSOR_INSTANCE_NBPIPELINES_TAGTYPE = "HwProcessor_Instance_nbPipelines";

    public static final String HWPROCESSOR_INSTANCE_NBSTAGES_TAGTYPE = "HwProcessor_Instance_nbStages";

    public static final String HWPROCESSOR_INSTANCE_OWNEDISAS_TAGTYPE = "HwProcessor_Instance_ownedISAs";

    public static final String HWPROCESSOR_INSTANCE_OWNEDMMUS_TAGTYPE = "HwProcessor_Instance_ownedMMUs";

    public static final String HWPROCESSOR_INSTANCE_PREDICTORS_TAGTYPE = "HwProcessor_Instance_predictors";

    /**
     * Tells whether a {@link HwProcessorInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwProcessor_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwProcessorInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwProcessor_Instance >> then instantiate a {@link HwProcessorInstance} proxy.
     * 
     * @return a {@link HwProcessorInstance} proxy on the created {@link Instance}.
     */
    public static HwProcessorInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwProcessorInstance.STEREOTYPE_NAME);
        return HwProcessorInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwProcessorInstance} proxy from a {@link Instance} stereotyped << HwProcessor_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwProcessorInstance} proxy or <i>null</i>.
     */
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
    public static HwProcessorInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwProcessorInstance.canInstantiate(obj))
        	return new HwProcessorInstance(obj);
        else
        	throw new IllegalArgumentException("HwProcessorInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwProcessorInstance other = (HwProcessorInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'HwProcessor_Instance_architecture'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Instance_architecture() {
        return this.elt.getTagValue(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_ARCHITECTURE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Instance_caches'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwProcessor_Instance_caches() {
        return this.elt.getTagValues(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_CACHES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Instance_ipc'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Instance_ipc() {
        return this.elt.getTagValue(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_IPC_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Instance_mips'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Instance_mips() {
        return this.elt.getTagValue(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_MIPS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Instance_nbALUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Instance_nbALUs() {
        return this.elt.getTagValue(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_NBALUS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Instance_nbCores'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Instance_nbCores() {
        return this.elt.getTagValue(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_NBCORES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Instance_nbFPUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Instance_nbFPUs() {
        return this.elt.getTagValue(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_NBFPUS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Instance_nbPipelines'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Instance_nbPipelines() {
        return this.elt.getTagValue(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_NBPIPELINES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Instance_nbStages'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Instance_nbStages() {
        return this.elt.getTagValue(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_NBSTAGES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Instance_ownedISAs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwProcessor_Instance_ownedISAs() {
        return this.elt.getTagValues(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_OWNEDISAS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Instance_ownedMMUs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwProcessor_Instance_ownedMMUs() {
        return this.elt.getTagValues(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_OWNEDMMUS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Instance_predictors'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwProcessor_Instance_predictors() {
        return this.elt.getTagValues(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_PREDICTORS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwProcessor_Instance_architecture'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Instance_architecture(final String value) {
        this.elt.putTagValue(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_ARCHITECTURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Instance_caches'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Instance_caches(final List<String> values) {
        this.elt.putTagValues(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_CACHES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwProcessor_Instance_ipc'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Instance_ipc(final String value) {
        this.elt.putTagValue(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_IPC_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Instance_mips'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Instance_mips(final String value) {
        this.elt.putTagValue(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_MIPS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Instance_nbALUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Instance_nbALUs(final String value) {
        this.elt.putTagValue(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_NBALUS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Instance_nbCores'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Instance_nbCores(final String value) {
        this.elt.putTagValue(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_NBCORES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Instance_nbFPUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Instance_nbFPUs(final String value) {
        this.elt.putTagValue(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_NBFPUS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Instance_nbPipelines'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Instance_nbPipelines(final String value) {
        this.elt.putTagValue(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_NBPIPELINES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Instance_nbStages'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Instance_nbStages(final String value) {
        this.elt.putTagValue(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_NBSTAGES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Instance_ownedISAs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Instance_ownedISAs(final List<String> values) {
        this.elt.putTagValues(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_OWNEDISAS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Instance_ownedMMUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Instance_ownedMMUs(final List<String> values) {
        this.elt.putTagValues(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_OWNEDMMUS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Instance_predictors'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Instance_predictors(final List<String> values) {
        this.elt.putTagValues(HwProcessorInstance.MdaTypes.HWPROCESSOR_INSTANCE_PREDICTORS_TAGTYPE_ELT, values);
    }

    protected HwProcessorInstance(final Instance elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWPROCESSOR_INSTANCE_ARCHITECTURE_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_INSTANCE_MIPS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_INSTANCE_IPC_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_INSTANCE_NBCORES_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_INSTANCE_NBPIPELINES_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_INSTANCE_NBSTAGES_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_INSTANCE_NBALUS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_INSTANCE_NBFPUS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_INSTANCE_OWNEDISAS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_INSTANCE_PREDICTORS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_INSTANCE_CACHES_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_INSTANCE_OWNEDMMUS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
