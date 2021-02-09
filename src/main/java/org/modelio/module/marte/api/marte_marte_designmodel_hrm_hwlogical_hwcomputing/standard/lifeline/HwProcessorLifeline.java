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
public class HwProcessorLifeline extends HwComputingResourceLifeline {
    public static final String STEREOTYPE_NAME = "HwProcessor_Lifeline";

    public static final String HWPROCESSOR_LIFELINE_ARCHITECTURE_TAGTYPE = "HwProcessor_Lifeline_architecture";

    public static final String HWPROCESSOR_LIFELINE_CACHES_TAGTYPE = "HwProcessor_Lifeline_caches";

    public static final String HWPROCESSOR_LIFELINE_IPC_TAGTYPE = "HwProcessor_Lifeline_ipc";

    public static final String HWPROCESSOR_LIFELINE_MIPS_TAGTYPE = "HwProcessor_Lifeline_mips";

    public static final String HWPROCESSOR_LIFELINE_NBALUS_TAGTYPE = "HwProcessor_Lifeline_nbALUs";

    public static final String HWPROCESSOR_LIFELINE_NBCORES_TAGTYPE = "HwProcessor_Lifeline_nbCores";

    public static final String HWPROCESSOR_LIFELINE_NBFPUS_TAGTYPE = "HwProcessor_Lifeline_nbFPUs";

    public static final String HWPROCESSOR_LIFELINE_NBPIPELINES_TAGTYPE = "HwProcessor_Lifeline_nbPipelines";

    public static final String HWPROCESSOR_LIFELINE_NBSTAGES_TAGTYPE = "HwProcessor_Lifeline_nbStages";

    public static final String HWPROCESSOR_LIFELINE_OWNEDISAS_TAGTYPE = "HwProcessor_Lifeline_ownedISAs";

    public static final String HWPROCESSOR_LIFELINE_OWNEDMMUS_TAGTYPE = "HwProcessor_Lifeline_ownedMMUs";

    public static final String HWPROCESSOR_LIFELINE_PREDICTORS_TAGTYPE = "HwProcessor_Lifeline_predictors";

    /**
     * Tells whether a {@link HwProcessorLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwProcessor_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwProcessorLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwProcessor_Lifeline >> then instantiate a {@link HwProcessorLifeline} proxy.
     * 
     * @return a {@link HwProcessorLifeline} proxy on the created {@link Lifeline}.
     */
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
    public static HwProcessorLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwProcessorLifeline.canInstantiate(obj))
        	return new HwProcessorLifeline(obj);
        else
        	throw new IllegalArgumentException("HwProcessorLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwProcessorLifeline other = (HwProcessorLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'HwProcessor_Lifeline_architecture'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Lifeline_architecture() {
        return this.elt.getTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_ARCHITECTURE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Lifeline_caches'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwProcessor_Lifeline_caches() {
        return this.elt.getTagValues(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_CACHES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Lifeline_ipc'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Lifeline_ipc() {
        return this.elt.getTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_IPC_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Lifeline_mips'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Lifeline_mips() {
        return this.elt.getTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_MIPS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Lifeline_nbALUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Lifeline_nbALUs() {
        return this.elt.getTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_NBALUS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Lifeline_nbCores'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Lifeline_nbCores() {
        return this.elt.getTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_NBCORES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Lifeline_nbFPUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Lifeline_nbFPUs() {
        return this.elt.getTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_NBFPUS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Lifeline_nbPipelines'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Lifeline_nbPipelines() {
        return this.elt.getTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_NBPIPELINES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Lifeline_nbStages'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Lifeline_nbStages() {
        return this.elt.getTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_NBSTAGES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Lifeline_ownedISAs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwProcessor_Lifeline_ownedISAs() {
        return this.elt.getTagValues(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_OWNEDISAS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Lifeline_ownedMMUs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwProcessor_Lifeline_ownedMMUs() {
        return this.elt.getTagValues(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_OWNEDMMUS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Lifeline_predictors'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwProcessor_Lifeline_predictors() {
        return this.elt.getTagValues(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_PREDICTORS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwProcessor_Lifeline_architecture'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Lifeline_architecture(final String value) {
        this.elt.putTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_ARCHITECTURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Lifeline_caches'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Lifeline_caches(final List<String> values) {
        this.elt.putTagValues(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_CACHES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwProcessor_Lifeline_ipc'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Lifeline_ipc(final String value) {
        this.elt.putTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_IPC_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Lifeline_mips'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Lifeline_mips(final String value) {
        this.elt.putTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_MIPS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Lifeline_nbALUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Lifeline_nbALUs(final String value) {
        this.elt.putTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_NBALUS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Lifeline_nbCores'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Lifeline_nbCores(final String value) {
        this.elt.putTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_NBCORES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Lifeline_nbFPUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Lifeline_nbFPUs(final String value) {
        this.elt.putTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_NBFPUS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Lifeline_nbPipelines'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Lifeline_nbPipelines(final String value) {
        this.elt.putTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_NBPIPELINES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Lifeline_nbStages'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Lifeline_nbStages(final String value) {
        this.elt.putTagValue(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_NBSTAGES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Lifeline_ownedISAs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Lifeline_ownedISAs(final List<String> values) {
        this.elt.putTagValues(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_OWNEDISAS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Lifeline_ownedMMUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Lifeline_ownedMMUs(final List<String> values) {
        this.elt.putTagValues(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_OWNEDMMUS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Lifeline_predictors'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Lifeline_predictors(final List<String> values) {
        this.elt.putTagValues(HwProcessorLifeline.MdaTypes.HWPROCESSOR_LIFELINE_PREDICTORS_TAGTYPE_ELT, values);
    }

    protected HwProcessorLifeline(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWPROCESSOR_LIFELINE_ARCHITECTURE_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_LIFELINE_MIPS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_LIFELINE_IPC_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_LIFELINE_NBCORES_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_LIFELINE_NBPIPELINES_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_LIFELINE_NBSTAGES_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_LIFELINE_NBALUS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_LIFELINE_NBFPUS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_LIFELINE_OWNEDISAS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_LIFELINE_PREDICTORS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_LIFELINE_CACHES_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_LIFELINE_OWNEDMMUS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
