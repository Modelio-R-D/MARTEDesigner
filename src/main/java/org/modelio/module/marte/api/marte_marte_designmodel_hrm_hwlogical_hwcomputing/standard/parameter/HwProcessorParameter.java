/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.parameter;

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
public class HwProcessorParameter extends HwComputingResourceParameter {
    public static final String STEREOTYPE_NAME = "HwProcessor_Parameter";

    public static final String HWPROCESSOR_PARAMETER_ARCHITECTURE_TAGTYPE = "HwProcessor_Parameter_architecture";

    public static final String HWPROCESSOR_PARAMETER_CACHES_TAGTYPE = "HwProcessor_Parameter_caches";

    public static final String HWPROCESSOR_PARAMETER_IPC_TAGTYPE = "HwProcessor_Parameter_ipc";

    public static final String HWPROCESSOR_PARAMETER_MIPS_TAGTYPE = "HwProcessor_Parameter_mips";

    public static final String HWPROCESSOR_PARAMETER_NBALUS_TAGTYPE = "HwProcessor_Parameter_nbALUs";

    public static final String HWPROCESSOR_PARAMETER_NBCORES_TAGTYPE = "HwProcessor_Parameter_nbCores";

    public static final String HWPROCESSOR_PARAMETER_NBFPUS_TAGTYPE = "HwProcessor_Parameter_nbFPUs";

    public static final String HWPROCESSOR_PARAMETER_NBPIPELINES_TAGTYPE = "HwProcessor_Parameter_nbPipelines";

    public static final String HWPROCESSOR_PARAMETER_NBSTAGES_TAGTYPE = "HwProcessor_Parameter_nbStages";

    public static final String HWPROCESSOR_PARAMETER_OWNEDISAS_TAGTYPE = "HwProcessor_Parameter_ownedISAs";

    public static final String HWPROCESSOR_PARAMETER_OWNEDMMUS_TAGTYPE = "HwProcessor_Parameter_ownedMMUs";

    public static final String HWPROCESSOR_PARAMETER_PREDICTORS_TAGTYPE = "HwProcessor_Parameter_predictors";

    /**
     * Tells whether a {@link HwProcessorParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwProcessor_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwProcessorParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwProcessor_Parameter >> then instantiate a {@link HwProcessorParameter} proxy.
     * 
     * @return a {@link HwProcessorParameter} proxy on the created {@link Parameter}.
     */
    public static HwProcessorParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwProcessorParameter.STEREOTYPE_NAME);
        return HwProcessorParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwProcessorParameter} proxy from a {@link Parameter} stereotyped << HwProcessor_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwProcessorParameter} proxy or <i>null</i>.
     */
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
    public static HwProcessorParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwProcessorParameter.canInstantiate(obj))
        	return new HwProcessorParameter(obj);
        else
        	throw new IllegalArgumentException("HwProcessorParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwProcessorParameter other = (HwProcessorParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'HwProcessor_Parameter_architecture'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Parameter_architecture() {
        return this.elt.getTagValue(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_ARCHITECTURE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Parameter_caches'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwProcessor_Parameter_caches() {
        return this.elt.getTagValues(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_CACHES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Parameter_ipc'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Parameter_ipc() {
        return this.elt.getTagValue(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_IPC_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Parameter_mips'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Parameter_mips() {
        return this.elt.getTagValue(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_MIPS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Parameter_nbALUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Parameter_nbALUs() {
        return this.elt.getTagValue(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_NBALUS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Parameter_nbCores'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Parameter_nbCores() {
        return this.elt.getTagValue(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_NBCORES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Parameter_nbFPUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Parameter_nbFPUs() {
        return this.elt.getTagValue(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_NBFPUS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Parameter_nbPipelines'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Parameter_nbPipelines() {
        return this.elt.getTagValue(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_NBPIPELINES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Parameter_nbStages'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Parameter_nbStages() {
        return this.elt.getTagValue(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_NBSTAGES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Parameter_ownedISAs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwProcessor_Parameter_ownedISAs() {
        return this.elt.getTagValues(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_OWNEDISAS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Parameter_ownedMMUs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwProcessor_Parameter_ownedMMUs() {
        return this.elt.getTagValues(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_OWNEDMMUS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Parameter_predictors'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwProcessor_Parameter_predictors() {
        return this.elt.getTagValues(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_PREDICTORS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwProcessor_Parameter_architecture'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Parameter_architecture(final String value) {
        this.elt.putTagValue(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_ARCHITECTURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Parameter_caches'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Parameter_caches(final List<String> values) {
        this.elt.putTagValues(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_CACHES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwProcessor_Parameter_ipc'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Parameter_ipc(final String value) {
        this.elt.putTagValue(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_IPC_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Parameter_mips'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Parameter_mips(final String value) {
        this.elt.putTagValue(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_MIPS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Parameter_nbALUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Parameter_nbALUs(final String value) {
        this.elt.putTagValue(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_NBALUS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Parameter_nbCores'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Parameter_nbCores(final String value) {
        this.elt.putTagValue(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_NBCORES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Parameter_nbFPUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Parameter_nbFPUs(final String value) {
        this.elt.putTagValue(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_NBFPUS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Parameter_nbPipelines'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Parameter_nbPipelines(final String value) {
        this.elt.putTagValue(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_NBPIPELINES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Parameter_nbStages'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Parameter_nbStages(final String value) {
        this.elt.putTagValue(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_NBSTAGES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Parameter_ownedISAs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Parameter_ownedISAs(final List<String> values) {
        this.elt.putTagValues(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_OWNEDISAS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Parameter_ownedMMUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Parameter_ownedMMUs(final List<String> values) {
        this.elt.putTagValues(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_OWNEDMMUS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Parameter_predictors'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Parameter_predictors(final List<String> values) {
        this.elt.putTagValues(HwProcessorParameter.MdaTypes.HWPROCESSOR_PARAMETER_PREDICTORS_TAGTYPE_ELT, values);
    }

    protected HwProcessorParameter(final Parameter elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWPROCESSOR_PARAMETER_ARCHITECTURE_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_PARAMETER_MIPS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_PARAMETER_IPC_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_PARAMETER_NBCORES_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_PARAMETER_NBPIPELINES_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_PARAMETER_NBSTAGES_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_PARAMETER_NBALUS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_PARAMETER_NBFPUS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_PARAMETER_OWNEDISAS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_PARAMETER_PREDICTORS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_PARAMETER_CACHES_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_PARAMETER_OWNEDMMUS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
