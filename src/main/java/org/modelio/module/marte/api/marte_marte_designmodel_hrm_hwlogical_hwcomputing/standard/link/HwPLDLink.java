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
 * Proxy class to handle a {@link Link} with << HwPLD_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwPLDLink extends HwComputingResourceLink {
    public static final String STEREOTYPE_NAME = "HwPLD_Link";

    public static final String HWPLD_LINK_BLOCKSCOMPUTING_TAGTYPE = "HwPLD_Link_blocksComputing";

    public static final String HWPLD_LINK_BLOCKSRAM_TAGTYPE = "HwPLD_Link_blocksRAM";

    public static final String HWPLD_LINK_NBFLIPFLOPS_TAGTYPE = "HwPLD_Link_nbFlipFlops";

    public static final String HWPLD_LINK_NBLUTS_TAGTYPE = "HwPLD_Link_nbLUTs";

    public static final String HWPLD_LINK_NDLUT_INPUTS_TAGTYPE = "HwPLD_Link_ndLUT_Inputs";

    public static final String HWPLD_LINK_ORGANIZATION_TAGTYPE = "HwPLD_Link_organization";

    public static final String HWPLD_LINK_TECHNOLOGY_TAGTYPE = "HwPLD_Link_technology";

    /**
     * Tells whether a {@link HwPLDLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwPLD_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwPLDLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwPLD_Link >> then instantiate a {@link HwPLDLink} proxy.
     * 
     * @return a {@link HwPLDLink} proxy on the created {@link Link}.
     */
    public static HwPLDLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwPLDLink.STEREOTYPE_NAME);
        return HwPLDLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwPLDLink} proxy from a {@link Link} stereotyped << HwPLD_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwPLDLink} proxy or <i>null</i>.
     */
    public static HwPLDLink instantiate(final Link obj) {
        return HwPLDLink.canInstantiate(obj) ? new HwPLDLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwPLDLink} proxy from a {@link Link} stereotyped << HwPLD_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link HwPLDLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwPLDLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwPLDLink.canInstantiate(obj))
        	return new HwPLDLink(obj);
        else
        	throw new IllegalArgumentException("HwPLDLink: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwPLDLink other = (HwPLDLink) obj;
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
     * Getter for List<String> property 'HwPLD_Link_blocksComputing'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwPLD_Link_blocksComputing() {
        return this.elt.getTagValues(HwPLDLink.MdaTypes.HWPLD_LINK_BLOCKSCOMPUTING_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwPLD_Link_blocksRAM'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwPLD_Link_blocksRAM() {
        return this.elt.getTagValues(HwPLDLink.MdaTypes.HWPLD_LINK_BLOCKSRAM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Link_nbFlipFlops'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwPLD_Link_nbFlipFlops() {
        return this.elt.getTagValue(HwPLDLink.MdaTypes.HWPLD_LINK_NBFLIPFLOPS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Link_nbLUTs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwPLD_Link_nbLUTs() {
        return this.elt.getTagValue(HwPLDLink.MdaTypes.HWPLD_LINK_NBLUTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Link_ndLUT_Inputs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwPLD_Link_ndLUT_Inputs() {
        return this.elt.getTagValue(HwPLDLink.MdaTypes.HWPLD_LINK_NDLUT_INPUTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Link_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwPLD_Link_organization() {
        return this.elt.getTagValue(HwPLDLink.MdaTypes.HWPLD_LINK_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Link_technology'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwPLD_Link_technology() {
        return this.elt.getTagValue(HwPLDLink.MdaTypes.HWPLD_LINK_TECHNOLOGY_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwPLD_Link_blocksComputing'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_Link_blocksComputing(final List<String> values) {
        this.elt.putTagValues(HwPLDLink.MdaTypes.HWPLD_LINK_BLOCKSCOMPUTING_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwPLD_Link_blocksRAM'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_Link_blocksRAM(final List<String> values) {
        this.elt.putTagValues(HwPLDLink.MdaTypes.HWPLD_LINK_BLOCKSRAM_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwPLD_Link_nbFlipFlops'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_Link_nbFlipFlops(final String value) {
        this.elt.putTagValue(HwPLDLink.MdaTypes.HWPLD_LINK_NBFLIPFLOPS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Link_nbLUTs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_Link_nbLUTs(final String value) {
        this.elt.putTagValue(HwPLDLink.MdaTypes.HWPLD_LINK_NBLUTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Link_ndLUT_Inputs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_Link_ndLUT_Inputs(final String value) {
        this.elt.putTagValue(HwPLDLink.MdaTypes.HWPLD_LINK_NDLUT_INPUTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Link_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_Link_organization(final String value) {
        this.elt.putTagValue(HwPLDLink.MdaTypes.HWPLD_LINK_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Link_technology'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_Link_technology(final String value) {
        this.elt.putTagValue(HwPLDLink.MdaTypes.HWPLD_LINK_TECHNOLOGY_TAGTYPE_ELT, value);
    }

    protected HwPLDLink(final Link elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWPLD_LINK_TECHNOLOGY_TAGTYPE_ELT;

        public static TagType HWPLD_LINK_ORGANIZATION_TAGTYPE_ELT;

        public static TagType HWPLD_LINK_NBLUTS_TAGTYPE_ELT;

        public static TagType HWPLD_LINK_NDLUT_INPUTS_TAGTYPE_ELT;

        public static TagType HWPLD_LINK_NBFLIPFLOPS_TAGTYPE_ELT;

        public static TagType HWPLD_LINK_BLOCKSRAM_TAGTYPE_ELT;

        public static TagType HWPLD_LINK_BLOCKSCOMPUTING_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00f2baac-0ccf-11df-8525-001302895b2b");
            HWPLD_LINK_TECHNOLOGY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2bab3-0ccf-11df-8525-001302895b2b");
            HWPLD_LINK_ORGANIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2baba-0ccf-11df-8525-001302895b2b");
            HWPLD_LINK_NBLUTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2bac1-0ccf-11df-8525-001302895b2b");
            HWPLD_LINK_NDLUT_INPUTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2bac8-0ccf-11df-8525-001302895b2b");
            HWPLD_LINK_NBFLIPFLOPS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2bacf-0ccf-11df-8525-001302895b2b");
            HWPLD_LINK_BLOCKSRAM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2bad6-0ccf-11df-8525-001302895b2b");
            HWPLD_LINK_BLOCKSCOMPUTING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f51cfc-0ccf-11df-8525-001302895b2b");
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
