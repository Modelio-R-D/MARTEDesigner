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
 * Proxy class to handle a {@link AssociationEnd} with << HwPLD_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwPLDAssociationEnd extends HwComputingResourceAssociationEnd {
    public static final String STEREOTYPE_NAME = "HwPLD_AssociationEnd";

    public static final String HWPLD_ASSOCIATIONEND_BLOCKSCOMPUTING_TAGTYPE = "HwPLD_AssociationEnd_blocksComputing";

    public static final String HWPLD_ASSOCIATIONEND_BLOCKSRAM_TAGTYPE = "HwPLD_AssociationEnd_blocksRAM";

    public static final String HWPLD_ASSOCIATIONEND_NBFLIPFLOPS_TAGTYPE = "HwPLD_AssociationEnd_nbFlipFlops";

    public static final String HWPLD_ASSOCIATIONEND_NBLUTS_TAGTYPE = "HwPLD_AssociationEnd_nbLUTs";

    public static final String HWPLD_ASSOCIATIONEND_NDLUT_INPUTS_TAGTYPE = "HwPLD_AssociationEnd_ndLUT_Inputs";

    public static final String HWPLD_ASSOCIATIONEND_ORGANIZATION_TAGTYPE = "HwPLD_AssociationEnd_organization";

    public static final String HWPLD_ASSOCIATIONEND_TECHNOLOGY_TAGTYPE = "HwPLD_AssociationEnd_technology";

    /**
     * Tells whether a {@link HwPLDAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwPLD_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwPLDAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwPLD_AssociationEnd >> then instantiate a {@link HwPLDAssociationEnd} proxy.
     * 
     * @return a {@link HwPLDAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    public static HwPLDAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwPLDAssociationEnd.STEREOTYPE_NAME);
        return HwPLDAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwPLDAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwPLD_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwPLDAssociationEnd} proxy or <i>null</i>.
     */
    public static HwPLDAssociationEnd instantiate(final AssociationEnd obj) {
        return HwPLDAssociationEnd.canInstantiate(obj) ? new HwPLDAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwPLDAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwPLD_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwPLDAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwPLDAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwPLDAssociationEnd.canInstantiate(obj))
        	return new HwPLDAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwPLDAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwPLDAssociationEnd other = (HwPLDAssociationEnd) obj;
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
     * Getter for List<String> property 'HwPLD_AssociationEnd_blocksComputing'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwPLD_AssociationEnd_blocksComputing() {
        return this.elt.getTagValues(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_BLOCKSCOMPUTING_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwPLD_AssociationEnd_blocksRAM'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwPLD_AssociationEnd_blocksRAM() {
        return this.elt.getTagValues(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_BLOCKSRAM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_AssociationEnd_nbFlipFlops'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwPLD_AssociationEnd_nbFlipFlops() {
        return this.elt.getTagValue(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_NBFLIPFLOPS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_AssociationEnd_nbLUTs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwPLD_AssociationEnd_nbLUTs() {
        return this.elt.getTagValue(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_NBLUTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_AssociationEnd_ndLUT_Inputs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwPLD_AssociationEnd_ndLUT_Inputs() {
        return this.elt.getTagValue(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_NDLUT_INPUTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_AssociationEnd_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwPLD_AssociationEnd_organization() {
        return this.elt.getTagValue(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_AssociationEnd_technology'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwPLD_AssociationEnd_technology() {
        return this.elt.getTagValue(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_TECHNOLOGY_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwPLD_AssociationEnd_blocksComputing'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_AssociationEnd_blocksComputing(final List<String> values) {
        this.elt.putTagValues(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_BLOCKSCOMPUTING_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwPLD_AssociationEnd_blocksRAM'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_AssociationEnd_blocksRAM(final List<String> values) {
        this.elt.putTagValues(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_BLOCKSRAM_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwPLD_AssociationEnd_nbFlipFlops'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_AssociationEnd_nbFlipFlops(final String value) {
        this.elt.putTagValue(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_NBFLIPFLOPS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_AssociationEnd_nbLUTs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_AssociationEnd_nbLUTs(final String value) {
        this.elt.putTagValue(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_NBLUTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_AssociationEnd_ndLUT_Inputs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_AssociationEnd_ndLUT_Inputs(final String value) {
        this.elt.putTagValue(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_NDLUT_INPUTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_AssociationEnd_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_AssociationEnd_organization(final String value) {
        this.elt.putTagValue(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_AssociationEnd_technology'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_AssociationEnd_technology(final String value) {
        this.elt.putTagValue(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_TECHNOLOGY_TAGTYPE_ELT, value);
    }

    protected HwPLDAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWPLD_ASSOCIATIONEND_TECHNOLOGY_TAGTYPE_ELT;

        public static TagType HWPLD_ASSOCIATIONEND_ORGANIZATION_TAGTYPE_ELT;

        public static TagType HWPLD_ASSOCIATIONEND_NBLUTS_TAGTYPE_ELT;

        public static TagType HWPLD_ASSOCIATIONEND_NDLUT_INPUTS_TAGTYPE_ELT;

        public static TagType HWPLD_ASSOCIATIONEND_NBFLIPFLOPS_TAGTYPE_ELT;

        public static TagType HWPLD_ASSOCIATIONEND_BLOCKSRAM_TAGTYPE_ELT;

        public static TagType HWPLD_ASSOCIATIONEND_BLOCKSCOMPUTING_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00f2baa8-0ccf-11df-8525-001302895b2b");
            HWPLD_ASSOCIATIONEND_TECHNOLOGY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2baaf-0ccf-11df-8525-001302895b2b");
            HWPLD_ASSOCIATIONEND_ORGANIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2bab6-0ccf-11df-8525-001302895b2b");
            HWPLD_ASSOCIATIONEND_NBLUTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2babd-0ccf-11df-8525-001302895b2b");
            HWPLD_ASSOCIATIONEND_NDLUT_INPUTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2bac4-0ccf-11df-8525-001302895b2b");
            HWPLD_ASSOCIATIONEND_NBFLIPFLOPS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2bacb-0ccf-11df-8525-001302895b2b");
            HWPLD_ASSOCIATIONEND_BLOCKSRAM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2bad2-0ccf-11df-8525-001302895b2b");
            HWPLD_ASSOCIATIONEND_BLOCKSCOMPUTING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2bad9-0ccf-11df-8525-001302895b2b");
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
