/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << HwProcessor_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwProcessorAttribute extends HwComputingResourceAttribute {
    public static final String STEREOTYPE_NAME = "HwProcessor_Attribute";

    public static final String HWPROCESSOR_ATTRIBUTE_ARCHITECTURE_TAGTYPE = "HwProcessor_Attribute_architecture";

    public static final String HWPROCESSOR_ATTRIBUTE_CACHES_TAGTYPE = "HwProcessor_Attribute_caches";

    public static final String HWPROCESSOR_ATTRIBUTE_IPC_TAGTYPE = "HwProcessor_Attribute_ipc";

    public static final String HWPROCESSOR_ATTRIBUTE_MIPS_TAGTYPE = "HwProcessor_Attribute_mips";

    public static final String HWPROCESSOR_ATTRIBUTE_NBALUS_TAGTYPE = "HwProcessor_Attribute_nbALUs";

    public static final String HWPROCESSOR_ATTRIBUTE_NBCORES_TAGTYPE = "HwProcessor_Attribute_nbCores";

    public static final String HWPROCESSOR_ATTRIBUTE_NBFPUS_TAGTYPE = "HwProcessor_Attribute_nbFPUs";

    public static final String HWPROCESSOR_ATTRIBUTE_NBPIPELINES_TAGTYPE = "HwProcessor_Attribute_nbPipelines";

    public static final String HWPROCESSOR_ATTRIBUTE_NBSTAGES_TAGTYPE = "HwProcessor_Attribute_nbStages";

    public static final String HWPROCESSOR_ATTRIBUTE_OWNEDISAS_TAGTYPE = "HwProcessor_Attribute_ownedISAs";

    public static final String HWPROCESSOR_ATTRIBUTE_OWNEDMMUS_TAGTYPE = "HwProcessor_Attribute_ownedMMUs";

    public static final String HWPROCESSOR_ATTRIBUTE_PREDICTORS_TAGTYPE = "HwProcessor_Attribute_predictors";

    /**
     * Tells whether a {@link HwProcessorAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwProcessor_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwProcessorAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwProcessor_Attribute >> then instantiate a {@link HwProcessorAttribute} proxy.
     * 
     * @return a {@link HwProcessorAttribute} proxy on the created {@link Attribute}.
     */
    public static HwProcessorAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwProcessorAttribute.STEREOTYPE_NAME);
        return HwProcessorAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwProcessorAttribute} proxy from a {@link Attribute} stereotyped << HwProcessor_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwProcessorAttribute} proxy or <i>null</i>.
     */
    public static HwProcessorAttribute instantiate(final Attribute obj) {
        return HwProcessorAttribute.canInstantiate(obj) ? new HwProcessorAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwProcessorAttribute} proxy from a {@link Attribute} stereotyped << HwProcessor_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwProcessorAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwProcessorAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwProcessorAttribute.canInstantiate(obj))
        	return new HwProcessorAttribute(obj);
        else
        	throw new IllegalArgumentException("HwProcessorAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwProcessorAttribute other = (HwProcessorAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'HwProcessor_Attribute_architecture'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Attribute_architecture() {
        return this.elt.getTagValue(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_ARCHITECTURE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Attribute_caches'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwProcessor_Attribute_caches() {
        return this.elt.getTagValues(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_CACHES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Attribute_ipc'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Attribute_ipc() {
        return this.elt.getTagValue(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_IPC_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Attribute_mips'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Attribute_mips() {
        return this.elt.getTagValue(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_MIPS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Attribute_nbALUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Attribute_nbALUs() {
        return this.elt.getTagValue(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_NBALUS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Attribute_nbCores'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Attribute_nbCores() {
        return this.elt.getTagValue(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_NBCORES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Attribute_nbFPUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Attribute_nbFPUs() {
        return this.elt.getTagValue(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_NBFPUS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Attribute_nbPipelines'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Attribute_nbPipelines() {
        return this.elt.getTagValue(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_NBPIPELINES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Attribute_nbStages'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwProcessor_Attribute_nbStages() {
        return this.elt.getTagValue(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_NBSTAGES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Attribute_ownedISAs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwProcessor_Attribute_ownedISAs() {
        return this.elt.getTagValues(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_OWNEDISAS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Attribute_ownedMMUs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwProcessor_Attribute_ownedMMUs() {
        return this.elt.getTagValues(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_OWNEDMMUS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Attribute_predictors'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwProcessor_Attribute_predictors() {
        return this.elt.getTagValues(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_PREDICTORS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwProcessor_Attribute_architecture'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Attribute_architecture(final String value) {
        this.elt.putTagValue(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_ARCHITECTURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Attribute_caches'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Attribute_caches(final List<String> values) {
        this.elt.putTagValues(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_CACHES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwProcessor_Attribute_ipc'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Attribute_ipc(final String value) {
        this.elt.putTagValue(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_IPC_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Attribute_mips'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Attribute_mips(final String value) {
        this.elt.putTagValue(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_MIPS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Attribute_nbALUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Attribute_nbALUs(final String value) {
        this.elt.putTagValue(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_NBALUS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Attribute_nbCores'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Attribute_nbCores(final String value) {
        this.elt.putTagValue(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_NBCORES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Attribute_nbFPUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Attribute_nbFPUs(final String value) {
        this.elt.putTagValue(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_NBFPUS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Attribute_nbPipelines'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Attribute_nbPipelines(final String value) {
        this.elt.putTagValue(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_NBPIPELINES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Attribute_nbStages'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Attribute_nbStages(final String value) {
        this.elt.putTagValue(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_NBSTAGES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Attribute_ownedISAs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Attribute_ownedISAs(final List<String> values) {
        this.elt.putTagValues(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_OWNEDISAS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Attribute_ownedMMUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Attribute_ownedMMUs(final List<String> values) {
        this.elt.putTagValues(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_OWNEDMMUS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Attribute_predictors'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwProcessor_Attribute_predictors(final List<String> values) {
        this.elt.putTagValues(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_PREDICTORS_TAGTYPE_ELT, values);
    }

    protected HwProcessorAttribute(final Attribute elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWPROCESSOR_ATTRIBUTE_ARCHITECTURE_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_ATTRIBUTE_MIPS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_ATTRIBUTE_IPC_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_ATTRIBUTE_NBCORES_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_ATTRIBUTE_NBPIPELINES_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_ATTRIBUTE_NBSTAGES_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_ATTRIBUTE_NBALUS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_ATTRIBUTE_NBFPUS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_ATTRIBUTE_OWNEDISAS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_ATTRIBUTE_PREDICTORS_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_ATTRIBUTE_CACHES_TAGTYPE_ELT;

        public static TagType HWPROCESSOR_ATTRIBUTE_OWNEDMMUS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00dae37c-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_ATTRIBUTE_ARCHITECTURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dae383-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_ATTRIBUTE_MIPS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dae38a-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_ATTRIBUTE_IPC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dae391-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_ATTRIBUTE_NBCORES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dae398-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_ATTRIBUTE_NBPIPELINES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dae39f-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_ATTRIBUTE_NBSTAGES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45c8-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_ATTRIBUTE_NBALUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45cf-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_ATTRIBUTE_NBFPUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45d6-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_ATTRIBUTE_OWNEDISAS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45dd-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_ATTRIBUTE_PREDICTORS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45e4-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_ATTRIBUTE_CACHES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45eb-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_ATTRIBUTE_OWNEDMMUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dfa81b-0ccf-11df-8525-001302895b2b");
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
