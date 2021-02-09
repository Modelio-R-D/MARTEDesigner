/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwProcessor_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwProcessorAssociation extends HwComputingResourceAssociation {
    public static final String STEREOTYPE_NAME = "HwProcessor_Association";

    public static final String HWPROCESSOR_ASSOCIATION_ARCHITECTURE_TAGTYPE = "HwProcessor_Association_architecture";

    public static final String HWPROCESSOR_ASSOCIATION_CACHES_TAGTYPE = "HwProcessor_Association_caches";

    public static final String HWPROCESSOR_ASSOCIATION_IPC_TAGTYPE = "HwProcessor_Association_ipc";

    public static final String HWPROCESSOR_ASSOCIATION_MIPS_TAGTYPE = "HwProcessor_Association_mips";

    public static final String HWPROCESSOR_ASSOCIATION_NBALUS_TAGTYPE = "HwProcessor_Association_nbALUs";

    public static final String HWPROCESSOR_ASSOCIATION_NBCORES_TAGTYPE = "HwProcessor_Association_nbCores";

    public static final String HWPROCESSOR_ASSOCIATION_NBFPUS_TAGTYPE = "HwProcessor_Association_nbFPUs";

    public static final String HWPROCESSOR_ASSOCIATION_NBPIPELINES_TAGTYPE = "HwProcessor_Association_nbPipelines";

    public static final String HWPROCESSOR_ASSOCIATION_NBSTAGES_TAGTYPE = "HwProcessor_Association_nbStages";

    public static final String HWPROCESSOR_ASSOCIATION_OWNEDISAS_TAGTYPE = "HwProcessor_Association_ownedISAs";

    public static final String HWPROCESSOR_ASSOCIATION_OWNEDMMUS_TAGTYPE = "HwProcessor_Association_ownedMMUs";

    public static final String HWPROCESSOR_ASSOCIATION_PREDICTORS_TAGTYPE = "HwProcessor_Association_predictors";

    /**
     * Tells whether a {@link HwProcessorAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwProcessor_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwProcessorAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwProcessor_Association >> then instantiate a {@link HwProcessorAssociation} proxy.
     * 
     * @return a {@link HwProcessorAssociation} proxy on the created {@link Association}.
     */
    public static HwProcessorAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwProcessorAssociation.STEREOTYPE_NAME);
        return HwProcessorAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwProcessorAssociation} proxy from a {@link Association} stereotyped << HwProcessor_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwProcessorAssociation} proxy or <i>null</i>.
     */
    public static HwProcessorAssociation instantiate(final Association obj) {
        return HwProcessorAssociation.canInstantiate(obj) ? new HwProcessorAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwProcessorAssociation} proxy from a {@link Association} stereotyped << HwProcessor_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwProcessorAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwProcessorAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwProcessorAssociation.canInstantiate(obj))
        	return new HwProcessorAssociation(obj);
        else
        	throw new IllegalArgumentException("HwProcessorAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwProcessorAssociation other = (HwProcessorAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'HwProcessor_Association_architecture'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Association_architecture() {
        return this.elt.getTagValue(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_ARCHITECTURE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Association_caches'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwProcessor_Association_caches() {
        return this.elt.getTagValues(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_CACHES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Association_ipc'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Association_ipc() {
        return this.elt.getTagValue(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_IPC_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Association_mips'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Association_mips() {
        return this.elt.getTagValue(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_MIPS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Association_nbALUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Association_nbALUs() {
        return this.elt.getTagValue(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_NBALUS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Association_nbCores'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Association_nbCores() {
        return this.elt.getTagValue(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_NBCORES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Association_nbFPUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Association_nbFPUs() {
        return this.elt.getTagValue(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_NBFPUS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Association_nbPipelines'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Association_nbPipelines() {
        return this.elt.getTagValue(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_NBPIPELINES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Association_nbStages'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Association_nbStages() {
        return this.elt.getTagValue(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_NBSTAGES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Association_ownedISAs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwProcessor_Association_ownedISAs() {
        return this.elt.getTagValues(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_OWNEDISAS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Association_ownedMMUs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwProcessor_Association_ownedMMUs() {
        return this.elt.getTagValues(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_OWNEDMMUS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Association_predictors'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwProcessor_Association_predictors() {
        return this.elt.getTagValues(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_PREDICTORS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwProcessor_Association_architecture'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Association_architecture(final String value) {
        this.elt.putTagValue(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_ARCHITECTURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Association_caches'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Association_caches(final List<String> values) {
        this.elt.putTagValues(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_CACHES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwProcessor_Association_ipc'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Association_ipc(final String value) {
        this.elt.putTagValue(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_IPC_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Association_mips'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Association_mips(final String value) {
        this.elt.putTagValue(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_MIPS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Association_nbALUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Association_nbALUs(final String value) {
        this.elt.putTagValue(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_NBALUS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Association_nbCores'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Association_nbCores(final String value) {
        this.elt.putTagValue(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_NBCORES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Association_nbFPUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Association_nbFPUs(final String value) {
        this.elt.putTagValue(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_NBFPUS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Association_nbPipelines'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Association_nbPipelines(final String value) {
        this.elt.putTagValue(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_NBPIPELINES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Association_nbStages'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Association_nbStages(final String value) {
        this.elt.putTagValue(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_NBSTAGES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Association_ownedISAs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Association_ownedISAs(final List<String> values) {
        this.elt.putTagValues(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_OWNEDISAS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Association_ownedMMUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Association_ownedMMUs(final List<String> values) {
        this.elt.putTagValues(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_OWNEDMMUS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Association_predictors'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Association_predictors(final List<String> values) {
        this.elt.putTagValues(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_PREDICTORS_TAGTYPE_ELT, values);
    }

    protected HwProcessorAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWPROCESSOR_ASSOCIATION_ARCHITECTURE_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_ASSOCIATION_MIPS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_ASSOCIATION_IPC_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_ASSOCIATION_NBCORES_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_ASSOCIATION_NBPIPELINES_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_ASSOCIATION_NBSTAGES_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_ASSOCIATION_NBALUS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_ASSOCIATION_NBFPUS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_ASSOCIATION_OWNEDISAS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_ASSOCIATION_PREDICTORS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_ASSOCIATION_CACHES_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_ASSOCIATION_OWNEDMMUS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "087f01ce-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_ASSOCIATION_ARCHITECTURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "41d07859-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_ASSOCIATION_MIPS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "41d0784e-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_ASSOCIATION_IPC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "41d0784f-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_ASSOCIATION_NBCORES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "41d07850-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_ASSOCIATION_NBPIPELINES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "41d07851-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_ASSOCIATION_NBSTAGES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "41d07852-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_ASSOCIATION_NBALUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "41d07853-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_ASSOCIATION_NBFPUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "41d07854-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_ASSOCIATION_OWNEDISAS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "41d07855-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_ASSOCIATION_PREDICTORS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "41d07856-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_ASSOCIATION_CACHES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "41d07857-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_ASSOCIATION_OWNEDMMUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "41d07858-10a3-11df-81d9-0014222a9f79");
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
