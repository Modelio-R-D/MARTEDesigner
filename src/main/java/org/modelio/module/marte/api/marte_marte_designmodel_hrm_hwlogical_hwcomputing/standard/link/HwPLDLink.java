/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.link;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("edd6c77a-ccda-466c-85d2-4f829772b47c")
public class HwPLDLink extends HwComputingResourceLink {
    @objid ("45b94240-d559-4c18-a604-62e26eccda44")
    public static final String STEREOTYPE_NAME = "HwPLD_Link";

    @objid ("9feb1ec9-bbe9-461b-9bf6-d9538df8a956")
    public static final String HWPLD_LINK_BLOCKSCOMPUTING_TAGTYPE = "HwPLD_Link_blocksComputing";

    @objid ("876549f8-de29-4ecf-bb27-0af846d0f335")
    public static final String HWPLD_LINK_BLOCKSRAM_TAGTYPE = "HwPLD_Link_blocksRAM";

    @objid ("56f26a07-ee0b-4124-82ac-fb7d3b147557")
    public static final String HWPLD_LINK_NBFLIPFLOPS_TAGTYPE = "HwPLD_Link_nbFlipFlops";

    @objid ("df108a2a-81e3-4a21-8a97-42242da00318")
    public static final String HWPLD_LINK_NBLUTS_TAGTYPE = "HwPLD_Link_nbLUTs";

    @objid ("7cebf29d-2dde-40fa-bfb1-674019187304")
    public static final String HWPLD_LINK_NDLUT_INPUTS_TAGTYPE = "HwPLD_Link_ndLUT_Inputs";

    @objid ("57d90e91-0986-4c8e-a1b2-bac7308935f6")
    public static final String HWPLD_LINK_ORGANIZATION_TAGTYPE = "HwPLD_Link_organization";

    @objid ("476be158-b7c5-4bf2-a329-fbfbcddb8bc0")
    public static final String HWPLD_LINK_TECHNOLOGY_TAGTYPE = "HwPLD_Link_technology";

    /**
     * Tells whether a {@link HwPLDLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwPLD_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e8a1ad09-7a9e-4630-833e-cf4d4fd40939")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwPLDLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwPLD_Link >> then instantiate a {@link HwPLDLink} proxy.
     * 
     * @return a {@link HwPLDLink} proxy on the created {@link Link}.
     */
    @objid ("a7957d92-79a5-4c56-b00e-7022ee7b772d")
    public static HwPLDLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwPLDLink.STEREOTYPE_NAME);
        return HwPLDLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwPLDLink} proxy from a {@link Link} stereotyped << HwPLD_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwPLDLink} proxy or <i>null</i>.
     */
    @objid ("9ce3d10d-a8a6-411e-8808-91741e65e652")
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
    @objid ("a8fd0350-063c-47c2-aad5-ee07172e8a26")
    public static HwPLDLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwPLDLink.canInstantiate(obj))
        	return new HwPLDLink(obj);
        else
        	throw new IllegalArgumentException("HwPLDLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c61bafb3-d292-407f-bccb-4985e3dc58c0")
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
    @objid ("ca0cf146-6734-4bfc-b6e1-db892854b85a")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwPLD_Link_blocksComputing'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1f1bff1c-09bb-44b3-a05f-8556cebdfe5a")
    public List<String> getHwPLD_Link_blocksComputing() {
        return this.elt.getTagValues(HwPLDLink.MdaTypes.HWPLD_LINK_BLOCKSCOMPUTING_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwPLD_Link_blocksRAM'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("66e57528-fd57-433d-b0af-01777a4d3a11")
    public List<String> getHwPLD_Link_blocksRAM() {
        return this.elt.getTagValues(HwPLDLink.MdaTypes.HWPLD_LINK_BLOCKSRAM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Link_nbFlipFlops'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a68a2058-a6f1-4083-8f85-cbe19da6a0c4")
    public String getHwPLD_Link_nbFlipFlops() {
        return this.elt.getTagValue(HwPLDLink.MdaTypes.HWPLD_LINK_NBFLIPFLOPS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Link_nbLUTs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1f8c2126-82dc-4345-88c7-9131e5abe63b")
    public String getHwPLD_Link_nbLUTs() {
        return this.elt.getTagValue(HwPLDLink.MdaTypes.HWPLD_LINK_NBLUTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Link_ndLUT_Inputs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7ccd0f9f-2cee-429a-8b55-d4077cbac1e9")
    public String getHwPLD_Link_ndLUT_Inputs() {
        return this.elt.getTagValue(HwPLDLink.MdaTypes.HWPLD_LINK_NDLUT_INPUTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Link_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2b718df0-ecc7-4888-9f24-6fa9da2af786")
    public String getHwPLD_Link_organization() {
        return this.elt.getTagValue(HwPLDLink.MdaTypes.HWPLD_LINK_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Link_technology'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("40808ed8-9216-47ef-9939-361ee7f0fa68")
    public String getHwPLD_Link_technology() {
        return this.elt.getTagValue(HwPLDLink.MdaTypes.HWPLD_LINK_TECHNOLOGY_TAGTYPE_ELT);
    }

    @objid ("c88a2dd1-2cc5-499f-9a6d-5f75aca55155")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwPLD_Link_blocksComputing'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ba9243ea-1e0d-4973-af77-07f10b71c78b")
    public void setHwPLD_Link_blocksComputing(final List<String> values) {
        this.elt.putTagValues(HwPLDLink.MdaTypes.HWPLD_LINK_BLOCKSCOMPUTING_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwPLD_Link_blocksRAM'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b214909d-6c19-44e0-b99f-da4aa40fdd74")
    public void setHwPLD_Link_blocksRAM(final List<String> values) {
        this.elt.putTagValues(HwPLDLink.MdaTypes.HWPLD_LINK_BLOCKSRAM_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwPLD_Link_nbFlipFlops'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4e8e65f9-6990-4e01-bd97-df57a0424f74")
    public void setHwPLD_Link_nbFlipFlops(final String value) {
        this.elt.putTagValue(HwPLDLink.MdaTypes.HWPLD_LINK_NBFLIPFLOPS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Link_nbLUTs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d2037d87-f6fd-40ec-8cc2-3af3d7a4b7ac")
    public void setHwPLD_Link_nbLUTs(final String value) {
        this.elt.putTagValue(HwPLDLink.MdaTypes.HWPLD_LINK_NBLUTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Link_ndLUT_Inputs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("76a597ba-f99b-4eef-b96d-8d4257fc3a4e")
    public void setHwPLD_Link_ndLUT_Inputs(final String value) {
        this.elt.putTagValue(HwPLDLink.MdaTypes.HWPLD_LINK_NDLUT_INPUTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Link_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e117684a-787b-49fe-b35b-f29f6f7c6e79")
    public void setHwPLD_Link_organization(final String value) {
        this.elt.putTagValue(HwPLDLink.MdaTypes.HWPLD_LINK_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Link_technology'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e4a6b8d9-4eea-484e-b7cd-4453b4fc0405")
    public void setHwPLD_Link_technology(final String value) {
        this.elt.putTagValue(HwPLDLink.MdaTypes.HWPLD_LINK_TECHNOLOGY_TAGTYPE_ELT, value);
    }

    @objid ("dcb05959-6993-4668-91af-48f031c2ce48")
    protected HwPLDLink(final Link elt) {
        super(elt);
    }

    @objid ("a14b8ec1-eed0-4910-aca5-13103afcae3e")
    public static final class MdaTypes {
        @objid ("7e25ff69-1fdb-4d32-bc2d-344ed6b502ec")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1e45b781-2229-4d71-9c04-e6d36470c262")
        public static TagType HWPLD_LINK_TECHNOLOGY_TAGTYPE_ELT;

        @objid ("77894f65-66a7-47a4-8a9f-fa3a1c9f3ca6")
        public static TagType HWPLD_LINK_ORGANIZATION_TAGTYPE_ELT;

        @objid ("12feb114-567b-4602-928f-1ec1c4f80fb1")
        public static TagType HWPLD_LINK_NBLUTS_TAGTYPE_ELT;

        @objid ("59244895-0e8f-40ed-bca4-a553d7dfc7e2")
        public static TagType HWPLD_LINK_NDLUT_INPUTS_TAGTYPE_ELT;

        @objid ("e4640a5f-f241-4422-87ce-762e814fe86c")
        public static TagType HWPLD_LINK_NBFLIPFLOPS_TAGTYPE_ELT;

        @objid ("752d72a3-b680-4e1c-b351-968e7c383851")
        public static TagType HWPLD_LINK_BLOCKSRAM_TAGTYPE_ELT;

        @objid ("69fb6de4-3067-421d-a1ff-d579d8ff1227")
        public static TagType HWPLD_LINK_BLOCKSCOMPUTING_TAGTYPE_ELT;

        @objid ("d05c773a-e493-4823-8344-7c1abd58fdee")
        private static Stereotype MDAASSOCDEP;

        @objid ("dc0cd51f-1f68-44fa-9c53-eb38ae8fc8a3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("30cef9b5-3857-421d-9b4f-ff45e058b6a6")
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
