/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.link;

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
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << HwProcessor_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwProcessorLink extends HwComputingResourceLink {
    public static final String STEREOTYPE_NAME = "HwProcessor_Link";

    public static final String HWPROCESSOR_LINK_ARCHITECTURE_TAGTYPE = "HwProcessor_Link_architecture";

    public static final String HWPROCESSOR_LINK_CACHES_TAGTYPE = "HwProcessor_Link_caches";

    public static final String HWPROCESSOR_LINK_IPC_TAGTYPE = "HwProcessor_Link_ipc";

    public static final String HWPROCESSOR_LINK_MIPS_TAGTYPE = "HwProcessor_Link_mips";

    public static final String HWPROCESSOR_LINK_NBALUS_TAGTYPE = "HwProcessor_Link_nbALUs";

    public static final String HWPROCESSOR_LINK_NBCORES_TAGTYPE = "HwProcessor_Link_nbCores";

    public static final String HWPROCESSOR_LINK_NBFPUS_TAGTYPE = "HwProcessor_Link_nbFPUs";

    public static final String HWPROCESSOR_LINK_NBPIPELINES_TAGTYPE = "HwProcessor_Link_nbPipelines";

    public static final String HWPROCESSOR_LINK_NBSTAGES_TAGTYPE = "HwProcessor_Link_nbStages";

    public static final String HWPROCESSOR_LINK_OWNEDISAS_TAGTYPE = "HwProcessor_Link_ownedISAs";

    public static final String HWPROCESSOR_LINK_OWNEDMMUS_TAGTYPE = "HwProcessor_Link_ownedMMUs";

    public static final String HWPROCESSOR_LINK_PREDICTORS_TAGTYPE = "HwProcessor_Link_predictors";

    /**
     * Tells whether a {@link HwProcessorLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwProcessor_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwProcessorLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwProcessor_Link >> then instantiate a {@link HwProcessorLink} proxy.
     * 
     * @return a {@link HwProcessorLink} proxy on the created {@link Link}.
     */
    public static HwProcessorLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwProcessorLink.STEREOTYPE_NAME);
        return HwProcessorLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwProcessorLink} proxy from a {@link Link} stereotyped << HwProcessor_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwProcessorLink} proxy or <i>null</i>.
     */
    public static HwProcessorLink instantiate(final Link obj) {
        return HwProcessorLink.canInstantiate(obj) ? new HwProcessorLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwProcessorLink} proxy from a {@link Link} stereotyped << HwProcessor_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link HwProcessorLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwProcessorLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwProcessorLink.canInstantiate(obj))
        	return new HwProcessorLink(obj);
        else
        	throw new IllegalArgumentException("HwProcessorLink: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwProcessorLink other = (HwProcessorLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'HwProcessor_Link_architecture'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Link_architecture() {
        return this.elt.getTagValue(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_ARCHITECTURE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Link_caches'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwProcessor_Link_caches() {
        return this.elt.getTagValues(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_CACHES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Link_ipc'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Link_ipc() {
        return this.elt.getTagValue(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_IPC_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Link_mips'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Link_mips() {
        return this.elt.getTagValue(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_MIPS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Link_nbALUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Link_nbALUs() {
        return this.elt.getTagValue(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_NBALUS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Link_nbCores'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Link_nbCores() {
        return this.elt.getTagValue(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_NBCORES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Link_nbFPUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Link_nbFPUs() {
        return this.elt.getTagValue(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_NBFPUS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Link_nbPipelines'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Link_nbPipelines() {
        return this.elt.getTagValue(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_NBPIPELINES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Link_nbStages'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Link_nbStages() {
        return this.elt.getTagValue(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_NBSTAGES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Link_ownedISAs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwProcessor_Link_ownedISAs() {
        return this.elt.getTagValues(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_OWNEDISAS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Link_ownedMMUs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwProcessor_Link_ownedMMUs() {
        return this.elt.getTagValues(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_OWNEDMMUS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Link_predictors'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwProcessor_Link_predictors() {
        return this.elt.getTagValues(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_PREDICTORS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwProcessor_Link_architecture'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Link_architecture(final String value) {
        this.elt.putTagValue(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_ARCHITECTURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Link_caches'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Link_caches(final List<String> values) {
        this.elt.putTagValues(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_CACHES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwProcessor_Link_ipc'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Link_ipc(final String value) {
        this.elt.putTagValue(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_IPC_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Link_mips'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Link_mips(final String value) {
        this.elt.putTagValue(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_MIPS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Link_nbALUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Link_nbALUs(final String value) {
        this.elt.putTagValue(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_NBALUS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Link_nbCores'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Link_nbCores(final String value) {
        this.elt.putTagValue(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_NBCORES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Link_nbFPUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Link_nbFPUs(final String value) {
        this.elt.putTagValue(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_NBFPUS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Link_nbPipelines'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Link_nbPipelines(final String value) {
        this.elt.putTagValue(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_NBPIPELINES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Link_nbStages'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Link_nbStages(final String value) {
        this.elt.putTagValue(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_NBSTAGES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Link_ownedISAs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Link_ownedISAs(final List<String> values) {
        this.elt.putTagValues(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_OWNEDISAS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Link_ownedMMUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Link_ownedMMUs(final List<String> values) {
        this.elt.putTagValues(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_OWNEDMMUS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Link_predictors'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Link_predictors(final List<String> values) {
        this.elt.putTagValues(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_PREDICTORS_TAGTYPE_ELT, values);
    }

    protected HwProcessorLink(final Link elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWPROCESSOR_LINK_ARCHITECTURE_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_LINK_MIPS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_LINK_IPC_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_LINK_NBCORES_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_LINK_NBPIPELINES_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_LINK_NBSTAGES_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_LINK_NBALUS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_LINK_NBFPUS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_LINK_OWNEDISAS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_LINK_PREDICTORS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_LINK_CACHES_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_LINK_OWNEDMMUS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00dae37e-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_LINK_ARCHITECTURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dae385-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_LINK_MIPS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dae38c-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_LINK_IPC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dae393-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_LINK_NBCORES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dae39a-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_LINK_NBPIPELINES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dae3a1-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_LINK_NBSTAGES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45ca-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_LINK_NBALUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45d1-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_LINK_NBFPUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45d8-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_LINK_OWNEDISAS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45df-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_LINK_PREDICTORS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45e6-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_LINK_CACHES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45ed-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_LINK_OWNEDMMUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dfa81d-0ccf-11df-8525-001302895b2b");
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
