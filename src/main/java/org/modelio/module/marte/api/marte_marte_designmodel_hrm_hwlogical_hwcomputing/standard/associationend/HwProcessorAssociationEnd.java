/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.associationend;

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
public class HwProcessorAssociationEnd extends HwComputingResourceAssociationEnd {
    public static final String STEREOTYPE_NAME = "HwProcessor_AssociationEnd";

    public static final String HWPROCESSOR_ASSOCIATIONEND_ARCHITECTURE_TAGTYPE = "HwProcessor_AssociationEnd_architecture";

    public static final String HWPROCESSOR_ASSOCIATIONEND_CACHES_TAGTYPE = "HwProcessor_AssociationEnd_caches";

    public static final String HWPROCESSOR_ASSOCIATIONEND_IPC_TAGTYPE = "HwProcessor_AssociationEnd_ipc";

    public static final String HWPROCESSOR_ASSOCIATIONEND_MIPS_TAGTYPE = "HwProcessor_AssociationEnd_mips";

    public static final String HWPROCESSOR_ASSOCIATIONEND_NBALUS_TAGTYPE = "HwProcessor_AssociationEnd_nbALUs";

    public static final String HWPROCESSOR_ASSOCIATIONEND_NBCORES_TAGTYPE = "HwProcessor_AssociationEnd_nbCores";

    public static final String HWPROCESSOR_ASSOCIATIONEND_NBFPUS_TAGTYPE = "HwProcessor_AssociationEnd_nbFPUs";

    public static final String HWPROCESSOR_ASSOCIATIONEND_NBPIPELINES_TAGTYPE = "HwProcessor_AssociationEnd_nbPipelines";

    public static final String HWPROCESSOR_ASSOCIATIONEND_NBSTAGES_TAGTYPE = "HwProcessor_AssociationEnd_nbStages";

    public static final String HWPROCESSOR_ASSOCIATIONEND_OWNEDISAS_TAGTYPE = "HwProcessor_AssociationEnd_ownedISAs";

    public static final String HWPROCESSOR_ASSOCIATIONEND_OWNEDMMUS_TAGTYPE = "HwProcessor_AssociationEnd_ownedMMUs";

    public static final String HWPROCESSOR_ASSOCIATIONEND_PREDICTORS_TAGTYPE = "HwProcessor_AssociationEnd_predictors";

    /**
     * Tells whether a {@link HwProcessorAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwProcessor_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwProcessorAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwProcessor_AssociationEnd >> then instantiate a {@link HwProcessorAssociationEnd} proxy.
     * 
     * @return a {@link HwProcessorAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    public static HwProcessorAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwProcessorAssociationEnd.STEREOTYPE_NAME);
        return HwProcessorAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwProcessorAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwProcessor_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwProcessorAssociationEnd} proxy or <i>null</i>.
     */
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
    public static HwProcessorAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwProcessorAssociationEnd.canInstantiate(obj))
        	return new HwProcessorAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwProcessorAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwProcessorAssociationEnd other = (HwProcessorAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'HwProcessor_AssociationEnd_architecture'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_AssociationEnd_architecture() {
        return this.elt.getTagValue(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_ARCHITECTURE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_AssociationEnd_caches'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwProcessor_AssociationEnd_caches() {
        return this.elt.getTagValues(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_CACHES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_AssociationEnd_ipc'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_AssociationEnd_ipc() {
        return this.elt.getTagValue(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_IPC_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_AssociationEnd_mips'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_AssociationEnd_mips() {
        return this.elt.getTagValue(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_MIPS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_AssociationEnd_nbALUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_AssociationEnd_nbALUs() {
        return this.elt.getTagValue(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_NBALUS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_AssociationEnd_nbCores'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_AssociationEnd_nbCores() {
        return this.elt.getTagValue(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_NBCORES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_AssociationEnd_nbFPUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_AssociationEnd_nbFPUs() {
        return this.elt.getTagValue(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_NBFPUS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_AssociationEnd_nbPipelines'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_AssociationEnd_nbPipelines() {
        return this.elt.getTagValue(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_NBPIPELINES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_AssociationEnd_nbStages'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_AssociationEnd_nbStages() {
        return this.elt.getTagValue(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_NBSTAGES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_AssociationEnd_ownedISAs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwProcessor_AssociationEnd_ownedISAs() {
        return this.elt.getTagValues(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_OWNEDISAS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_AssociationEnd_ownedMMUs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwProcessor_AssociationEnd_ownedMMUs() {
        return this.elt.getTagValues(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_OWNEDMMUS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_AssociationEnd_predictors'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwProcessor_AssociationEnd_predictors() {
        return this.elt.getTagValues(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_PREDICTORS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwProcessor_AssociationEnd_architecture'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_AssociationEnd_architecture(final String value) {
        this.elt.putTagValue(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_ARCHITECTURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwProcessor_AssociationEnd_caches'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_AssociationEnd_caches(final List<String> values) {
        this.elt.putTagValues(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_CACHES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwProcessor_AssociationEnd_ipc'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_AssociationEnd_ipc(final String value) {
        this.elt.putTagValue(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_IPC_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_AssociationEnd_mips'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_AssociationEnd_mips(final String value) {
        this.elt.putTagValue(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_MIPS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_AssociationEnd_nbALUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_AssociationEnd_nbALUs(final String value) {
        this.elt.putTagValue(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_NBALUS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_AssociationEnd_nbCores'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_AssociationEnd_nbCores(final String value) {
        this.elt.putTagValue(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_NBCORES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_AssociationEnd_nbFPUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_AssociationEnd_nbFPUs(final String value) {
        this.elt.putTagValue(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_NBFPUS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_AssociationEnd_nbPipelines'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_AssociationEnd_nbPipelines(final String value) {
        this.elt.putTagValue(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_NBPIPELINES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_AssociationEnd_nbStages'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_AssociationEnd_nbStages(final String value) {
        this.elt.putTagValue(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_NBSTAGES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwProcessor_AssociationEnd_ownedISAs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_AssociationEnd_ownedISAs(final List<String> values) {
        this.elt.putTagValues(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_OWNEDISAS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwProcessor_AssociationEnd_ownedMMUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_AssociationEnd_ownedMMUs(final List<String> values) {
        this.elt.putTagValues(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_OWNEDMMUS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwProcessor_AssociationEnd_predictors'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_AssociationEnd_predictors(final List<String> values) {
        this.elt.putTagValues(HwProcessorAssociationEnd.MdaTypes.HWPROCESSOR_ASSOCIATIONEND_PREDICTORS_TAGTYPE_ELT, values);
    }

    protected HwProcessorAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWPROCESSOR_ASSOCIATIONEND_ARCHITECTURE_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_ASSOCIATIONEND_MIPS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_ASSOCIATIONEND_IPC_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_ASSOCIATIONEND_NBCORES_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_ASSOCIATIONEND_NBPIPELINES_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_ASSOCIATIONEND_NBSTAGES_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_ASSOCIATIONEND_NBALUS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_ASSOCIATIONEND_NBFPUS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_ASSOCIATIONEND_OWNEDISAS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_ASSOCIATIONEND_PREDICTORS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_ASSOCIATIONEND_CACHES_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_ASSOCIATIONEND_OWNEDMMUS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
