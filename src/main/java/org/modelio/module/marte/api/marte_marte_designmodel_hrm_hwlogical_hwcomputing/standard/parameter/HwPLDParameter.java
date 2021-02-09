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
 * Proxy class to handle a {@link Parameter} with << HwPLD_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwPLDParameter extends HwComputingResourceParameter {
    public static final String STEREOTYPE_NAME = "HwPLD_Parameter";

    public static final String HWPLD_PARAMETER_BLOCKSCOMPUTING_TAGTYPE = "HwPLD_Parameter_blocksComputing";

    public static final String HWPLD_PARAMETER_BLOCKSRAM_TAGTYPE = "HwPLD_Parameter_blocksRAM";

    public static final String HWPLD_PARAMETER_NBFLIPFLOPS_TAGTYPE = "HwPLD_Parameter_nbFlipFlops";

    public static final String HWPLD_PARAMETER_NBLUTS_TAGTYPE = "HwPLD_Parameter_nbLUTs";

    public static final String HWPLD_PARAMETER_NDLUT_INPUTS_TAGTYPE = "HwPLD_Parameter_ndLUT_Inputs";

    public static final String HWPLD_PARAMETER_ORGANIZATION_TAGTYPE = "HwPLD_Parameter_organization";

    public static final String HWPLD_PARAMETER_TECHNOLOGY_TAGTYPE = "HwPLD_Parameter_technology";

    /**
     * Tells whether a {@link HwPLDParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwPLD_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwPLDParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwPLD_Parameter >> then instantiate a {@link HwPLDParameter} proxy.
     * 
     * @return a {@link HwPLDParameter} proxy on the created {@link Parameter}.
     */
    public static HwPLDParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwPLDParameter.STEREOTYPE_NAME);
        return HwPLDParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwPLDParameter} proxy from a {@link Parameter} stereotyped << HwPLD_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwPLDParameter} proxy or <i>null</i>.
     */
    public static HwPLDParameter instantiate(final Parameter obj) {
        return HwPLDParameter.canInstantiate(obj) ? new HwPLDParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwPLDParameter} proxy from a {@link Parameter} stereotyped << HwPLD_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwPLDParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwPLDParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwPLDParameter.canInstantiate(obj))
        	return new HwPLDParameter(obj);
        else
        	throw new IllegalArgumentException("HwPLDParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwPLDParameter other = (HwPLDParameter) obj;
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
     * Getter for List<String> property 'HwPLD_Parameter_blocksComputing'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwPLD_Parameter_blocksComputing() {
        return this.elt.getTagValues(HwPLDParameter.MdaTypes.HWPLD_PARAMETER_BLOCKSCOMPUTING_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwPLD_Parameter_blocksRAM'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwPLD_Parameter_blocksRAM() {
        return this.elt.getTagValues(HwPLDParameter.MdaTypes.HWPLD_PARAMETER_BLOCKSRAM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Parameter_nbFlipFlops'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwPLD_Parameter_nbFlipFlops() {
        return this.elt.getTagValue(HwPLDParameter.MdaTypes.HWPLD_PARAMETER_NBFLIPFLOPS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Parameter_nbLUTs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwPLD_Parameter_nbLUTs() {
        return this.elt.getTagValue(HwPLDParameter.MdaTypes.HWPLD_PARAMETER_NBLUTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Parameter_ndLUT_Inputs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwPLD_Parameter_ndLUT_Inputs() {
        return this.elt.getTagValue(HwPLDParameter.MdaTypes.HWPLD_PARAMETER_NDLUT_INPUTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Parameter_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwPLD_Parameter_organization() {
        return this.elt.getTagValue(HwPLDParameter.MdaTypes.HWPLD_PARAMETER_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Parameter_technology'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwPLD_Parameter_technology() {
        return this.elt.getTagValue(HwPLDParameter.MdaTypes.HWPLD_PARAMETER_TECHNOLOGY_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwPLD_Parameter_blocksComputing'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_Parameter_blocksComputing(final List<String> values) {
        this.elt.putTagValues(HwPLDParameter.MdaTypes.HWPLD_PARAMETER_BLOCKSCOMPUTING_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwPLD_Parameter_blocksRAM'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_Parameter_blocksRAM(final List<String> values) {
        this.elt.putTagValues(HwPLDParameter.MdaTypes.HWPLD_PARAMETER_BLOCKSRAM_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwPLD_Parameter_nbFlipFlops'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_Parameter_nbFlipFlops(final String value) {
        this.elt.putTagValue(HwPLDParameter.MdaTypes.HWPLD_PARAMETER_NBFLIPFLOPS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Parameter_nbLUTs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_Parameter_nbLUTs(final String value) {
        this.elt.putTagValue(HwPLDParameter.MdaTypes.HWPLD_PARAMETER_NBLUTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Parameter_ndLUT_Inputs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_Parameter_ndLUT_Inputs(final String value) {
        this.elt.putTagValue(HwPLDParameter.MdaTypes.HWPLD_PARAMETER_NDLUT_INPUTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Parameter_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_Parameter_organization(final String value) {
        this.elt.putTagValue(HwPLDParameter.MdaTypes.HWPLD_PARAMETER_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Parameter_technology'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_Parameter_technology(final String value) {
        this.elt.putTagValue(HwPLDParameter.MdaTypes.HWPLD_PARAMETER_TECHNOLOGY_TAGTYPE_ELT, value);
    }

    protected HwPLDParameter(final Parameter elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWPLD_PARAMETER_TECHNOLOGY_TAGTYPE_ELT;

        public static TagType HWPLD_PARAMETER_ORGANIZATION_TAGTYPE_ELT;

        public static TagType HWPLD_PARAMETER_NBLUTS_TAGTYPE_ELT;

        public static TagType HWPLD_PARAMETER_NDLUT_INPUTS_TAGTYPE_ELT;

        public static TagType HWPLD_PARAMETER_NBFLIPFLOPS_TAGTYPE_ELT;

        public static TagType HWPLD_PARAMETER_BLOCKSRAM_TAGTYPE_ELT;

        public static TagType HWPLD_PARAMETER_BLOCKSCOMPUTING_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00eb93b2-0ccf-11df-8525-001302895b2b");
            HWPLD_PARAMETER_TECHNOLOGY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2baae-0ccf-11df-8525-001302895b2b");
            HWPLD_PARAMETER_ORGANIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2bab5-0ccf-11df-8525-001302895b2b");
            HWPLD_PARAMETER_NBLUTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2babc-0ccf-11df-8525-001302895b2b");
            HWPLD_PARAMETER_NDLUT_INPUTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2bac3-0ccf-11df-8525-001302895b2b");
            HWPLD_PARAMETER_NBFLIPFLOPS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2baca-0ccf-11df-8525-001302895b2b");
            HWPLD_PARAMETER_BLOCKSRAM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2bad1-0ccf-11df-8525-001302895b2b");
            HWPLD_PARAMETER_BLOCKSCOMPUTING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2bad8-0ccf-11df-8525-001302895b2b");
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
