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
 * Proxy class to handle a {@link Instance} with << HwPLD_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwPLDInstance extends HwComputingResourceInstance {
    public static final String STEREOTYPE_NAME = "HwPLD_Instance";

    public static final String HWPLD_INSTANCE_BLOCKSCOMPUTING_TAGTYPE = "HwPLD_Instance_blocksComputing";

    public static final String HWPLD_INSTANCE_BLOCKSRAM_TAGTYPE = "HwPLD_Instance_blocksRAM";

    public static final String HWPLD_INSTANCE_NBFLIPFLOPS_TAGTYPE = "HwPLD_Instance_nbFlipFlops";

    public static final String HWPLD_INSTANCE_NBLUTS_TAGTYPE = "HwPLD_Instance_nbLUTs";

    public static final String HWPLD_INSTANCE_NDLUT_INPUTS_TAGTYPE = "HwPLD_Instance_ndLUT_Inputs";

    public static final String HWPLD_INSTANCE_ORGANIZATION_TAGTYPE = "HwPLD_Instance_organization";

    public static final String HWPLD_INSTANCE_TECHNOLOGY_TAGTYPE = "HwPLD_Instance_technology";

    /**
     * Tells whether a {@link HwPLDInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwPLD_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwPLDInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwPLD_Instance >> then instantiate a {@link HwPLDInstance} proxy.
     * 
     * @return a {@link HwPLDInstance} proxy on the created {@link Instance}.
     */
    public static HwPLDInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwPLDInstance.STEREOTYPE_NAME);
        return HwPLDInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwPLDInstance} proxy from a {@link Instance} stereotyped << HwPLD_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwPLDInstance} proxy or <i>null</i>.
     */
    public static HwPLDInstance instantiate(final Instance obj) {
        return HwPLDInstance.canInstantiate(obj) ? new HwPLDInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwPLDInstance} proxy from a {@link Instance} stereotyped << HwPLD_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link HwPLDInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwPLDInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwPLDInstance.canInstantiate(obj))
        	return new HwPLDInstance(obj);
        else
        	throw new IllegalArgumentException("HwPLDInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwPLDInstance other = (HwPLDInstance) obj;
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
     * Getter for List<String> property 'HwPLD_Instance_blocksComputing'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwPLD_Instance_blocksComputing() {
        return this.elt.getTagValues(HwPLDInstance.MdaTypes.HWPLD_INSTANCE_BLOCKSCOMPUTING_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwPLD_Instance_blocksRAM'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwPLD_Instance_blocksRAM() {
        return this.elt.getTagValues(HwPLDInstance.MdaTypes.HWPLD_INSTANCE_BLOCKSRAM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Instance_nbFlipFlops'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwPLD_Instance_nbFlipFlops() {
        return this.elt.getTagValue(HwPLDInstance.MdaTypes.HWPLD_INSTANCE_NBFLIPFLOPS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Instance_nbLUTs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwPLD_Instance_nbLUTs() {
        return this.elt.getTagValue(HwPLDInstance.MdaTypes.HWPLD_INSTANCE_NBLUTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Instance_ndLUT_Inputs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwPLD_Instance_ndLUT_Inputs() {
        return this.elt.getTagValue(HwPLDInstance.MdaTypes.HWPLD_INSTANCE_NDLUT_INPUTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Instance_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwPLD_Instance_organization() {
        return this.elt.getTagValue(HwPLDInstance.MdaTypes.HWPLD_INSTANCE_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Instance_technology'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwPLD_Instance_technology() {
        return this.elt.getTagValue(HwPLDInstance.MdaTypes.HWPLD_INSTANCE_TECHNOLOGY_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwPLD_Instance_blocksComputing'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_Instance_blocksComputing(final List<String> values) {
        this.elt.putTagValues(HwPLDInstance.MdaTypes.HWPLD_INSTANCE_BLOCKSCOMPUTING_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwPLD_Instance_blocksRAM'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_Instance_blocksRAM(final List<String> values) {
        this.elt.putTagValues(HwPLDInstance.MdaTypes.HWPLD_INSTANCE_BLOCKSRAM_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwPLD_Instance_nbFlipFlops'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_Instance_nbFlipFlops(final String value) {
        this.elt.putTagValue(HwPLDInstance.MdaTypes.HWPLD_INSTANCE_NBFLIPFLOPS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Instance_nbLUTs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_Instance_nbLUTs(final String value) {
        this.elt.putTagValue(HwPLDInstance.MdaTypes.HWPLD_INSTANCE_NBLUTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Instance_ndLUT_Inputs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_Instance_ndLUT_Inputs(final String value) {
        this.elt.putTagValue(HwPLDInstance.MdaTypes.HWPLD_INSTANCE_NDLUT_INPUTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Instance_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_Instance_organization(final String value) {
        this.elt.putTagValue(HwPLDInstance.MdaTypes.HWPLD_INSTANCE_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Instance_technology'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_Instance_technology(final String value) {
        this.elt.putTagValue(HwPLDInstance.MdaTypes.HWPLD_INSTANCE_TECHNOLOGY_TAGTYPE_ELT, value);
    }

    protected HwPLDInstance(final Instance elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWPLD_INSTANCE_TECHNOLOGY_TAGTYPE_ELT;

        public static TagType HWPLD_INSTANCE_ORGANIZATION_TAGTYPE_ELT;

        public static TagType HWPLD_INSTANCE_NBLUTS_TAGTYPE_ELT;

        public static TagType HWPLD_INSTANCE_NDLUT_INPUTS_TAGTYPE_ELT;

        public static TagType HWPLD_INSTANCE_NBFLIPFLOPS_TAGTYPE_ELT;

        public static TagType HWPLD_INSTANCE_BLOCKSRAM_TAGTYPE_ELT;

        public static TagType HWPLD_INSTANCE_BLOCKSCOMPUTING_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00f2baad-0ccf-11df-8525-001302895b2b");
            HWPLD_INSTANCE_TECHNOLOGY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2bab4-0ccf-11df-8525-001302895b2b");
            HWPLD_INSTANCE_ORGANIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2babb-0ccf-11df-8525-001302895b2b");
            HWPLD_INSTANCE_NBLUTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2bac2-0ccf-11df-8525-001302895b2b");
            HWPLD_INSTANCE_NDLUT_INPUTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2bac9-0ccf-11df-8525-001302895b2b");
            HWPLD_INSTANCE_NBFLIPFLOPS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2bad0-0ccf-11df-8525-001302895b2b");
            HWPLD_INSTANCE_BLOCKSRAM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2bad7-0ccf-11df-8525-001302895b2b");
            HWPLD_INSTANCE_BLOCKSCOMPUTING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f51cfd-0ccf-11df-8525-001302895b2b");
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
