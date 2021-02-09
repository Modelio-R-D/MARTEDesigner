/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.classifier;

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
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << HwPLD_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwPLDClassifier extends HwComputingResourceClassifier {
    public static final String STEREOTYPE_NAME = "HwPLD_Classifier";

    public static final String HWPLD_CLASSIFIER_BLOCKSCOMPUTING_TAGTYPE = "HwPLD_Classifier_blocksComputing";

    public static final String HWPLD_CLASSIFIER_BLOCKSRAM_TAGTYPE = "HwPLD_Classifier_blocksRAM";

    public static final String HWPLD_CLASSIFIER_NBFLIPFLOPS_TAGTYPE = "HwPLD_Classifier_nbFlipFlops";

    public static final String HWPLD_CLASSIFIER_NBLUTS_TAGTYPE = "HwPLD_Classifier_nbLUTs";

    public static final String HWPLD_CLASSIFIER_NDLUT_INPUTS_TAGTYPE = "HwPLD_Classifier_ndLUT_Inputs";

    public static final String HWPLD_CLASSIFIER_ORGANIZATION_TAGTYPE = "HwPLD_Classifier_organization";

    public static final String HWPLD_CLASSIFIER_TECHNOLOGY_TAGTYPE = "HwPLD_Classifier_technology";

    /**
     * Tells whether a {@link HwPLDClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwPLD_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwPLDClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwPLD_Classifier >> then instantiate a {@link HwPLDClassifier} proxy.
     * 
     * @return a {@link HwPLDClassifier} proxy on the created {@link Classifier}.
     */
    public static HwPLDClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwPLDClassifier.STEREOTYPE_NAME);
        return HwPLDClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwPLDClassifier} proxy from a {@link Classifier} stereotyped << HwPLD_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwPLDClassifier} proxy or <i>null</i>.
     */
    public static HwPLDClassifier instantiate(final Classifier obj) {
        return HwPLDClassifier.canInstantiate(obj) ? new HwPLDClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwPLDClassifier} proxy from a {@link Classifier} stereotyped << HwPLD_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwPLDClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwPLDClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwPLDClassifier.canInstantiate(obj))
        	return new HwPLDClassifier(obj);
        else
        	throw new IllegalArgumentException("HwPLDClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwPLDClassifier other = (HwPLDClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwPLD_Classifier_blocksComputing'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwPLD_Classifier_blocksComputing() {
        return this.elt.getTagValues(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_BLOCKSCOMPUTING_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwPLD_Classifier_blocksRAM'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwPLD_Classifier_blocksRAM() {
        return this.elt.getTagValues(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_BLOCKSRAM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Classifier_nbFlipFlops'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwPLD_Classifier_nbFlipFlops() {
        return this.elt.getTagValue(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_NBFLIPFLOPS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Classifier_nbLUTs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwPLD_Classifier_nbLUTs() {
        return this.elt.getTagValue(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_NBLUTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Classifier_ndLUT_Inputs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwPLD_Classifier_ndLUT_Inputs() {
        return this.elt.getTagValue(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_NDLUT_INPUTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Classifier_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwPLD_Classifier_organization() {
        return this.elt.getTagValue(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Classifier_technology'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwPLD_Classifier_technology() {
        return this.elt.getTagValue(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_TECHNOLOGY_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwPLD_Classifier_blocksComputing'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_Classifier_blocksComputing(final List<String> values) {
        this.elt.putTagValues(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_BLOCKSCOMPUTING_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwPLD_Classifier_blocksRAM'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_Classifier_blocksRAM(final List<String> values) {
        this.elt.putTagValues(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_BLOCKSRAM_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwPLD_Classifier_nbFlipFlops'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_Classifier_nbFlipFlops(final String value) {
        this.elt.putTagValue(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_NBFLIPFLOPS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Classifier_nbLUTs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_Classifier_nbLUTs(final String value) {
        this.elt.putTagValue(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_NBLUTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Classifier_ndLUT_Inputs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_Classifier_ndLUT_Inputs(final String value) {
        this.elt.putTagValue(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_NDLUT_INPUTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Classifier_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_Classifier_organization(final String value) {
        this.elt.putTagValue(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Classifier_technology'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_Classifier_technology(final String value) {
        this.elt.putTagValue(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_TECHNOLOGY_TAGTYPE_ELT, value);
    }

    protected HwPLDClassifier(final Classifier elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWPLD_CLASSIFIER_TECHNOLOGY_TAGTYPE_ELT;

        public static TagType HWPLD_CLASSIFIER_ORGANIZATION_TAGTYPE_ELT;

        public static TagType HWPLD_CLASSIFIER_NBLUTS_TAGTYPE_ELT;

        public static TagType HWPLD_CLASSIFIER_NDLUT_INPUTS_TAGTYPE_ELT;

        public static TagType HWPLD_CLASSIFIER_NBFLIPFLOPS_TAGTYPE_ELT;

        public static TagType HWPLD_CLASSIFIER_BLOCKSRAM_TAGTYPE_ELT;

        public static TagType HWPLD_CLASSIFIER_BLOCKSCOMPUTING_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "7495c7c8-10a5-11df-81d9-0014222a9f79");
            HWPLD_CLASSIFIER_TECHNOLOGY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7495c7c9-10a5-11df-81d9-0014222a9f79");
            HWPLD_CLASSIFIER_ORGANIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7495c7ca-10a5-11df-81d9-0014222a9f79");
            HWPLD_CLASSIFIER_NBLUTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7495c7cb-10a5-11df-81d9-0014222a9f79");
            HWPLD_CLASSIFIER_NDLUT_INPUTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7495c7cc-10a5-11df-81d9-0014222a9f79");
            HWPLD_CLASSIFIER_NBFLIPFLOPS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7495c7cd-10a5-11df-81d9-0014222a9f79");
            HWPLD_CLASSIFIER_BLOCKSRAM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7495c7ce-10a5-11df-81d9-0014222a9f79");
            HWPLD_CLASSIFIER_BLOCKSCOMPUTING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7495c7cf-10a5-11df-81d9-0014222a9f79");
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
