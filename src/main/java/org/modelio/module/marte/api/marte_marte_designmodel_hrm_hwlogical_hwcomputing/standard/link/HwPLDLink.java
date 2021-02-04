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
    @objid ("2924eda8-295c-4c74-97c5-58751c4f4034")
    public static final String STEREOTYPE_NAME = "HwPLD_Link";

    @objid ("656b7830-a502-4bb2-845b-b1e04a9b4377")
    public static final String HWPLD_LINK_BLOCKSCOMPUTING_TAGTYPE = "HwPLD_Link_blocksComputing";

    @objid ("3f8cacb0-2fa7-4d5a-a3fc-6558d01536a6")
    public static final String HWPLD_LINK_BLOCKSRAM_TAGTYPE = "HwPLD_Link_blocksRAM";

    @objid ("350b1135-3bb8-4a30-9507-7a1d9b24bb83")
    public static final String HWPLD_LINK_NBFLIPFLOPS_TAGTYPE = "HwPLD_Link_nbFlipFlops";

    @objid ("82db785d-a11f-4ad2-9473-b70eccd58709")
    public static final String HWPLD_LINK_NBLUTS_TAGTYPE = "HwPLD_Link_nbLUTs";

    @objid ("f74350fc-9928-4912-8a51-f276fa7e8534")
    public static final String HWPLD_LINK_NDLUT_INPUTS_TAGTYPE = "HwPLD_Link_ndLUT_Inputs";

    @objid ("8fc745cf-8546-4869-81ca-a66cdcfb63b1")
    public static final String HWPLD_LINK_ORGANIZATION_TAGTYPE = "HwPLD_Link_organization";

    @objid ("8a199c8f-85c0-4438-aa01-d15bfcecf799")
    public static final String HWPLD_LINK_TECHNOLOGY_TAGTYPE = "HwPLD_Link_technology";

    /**
     * Tells whether a {@link HwPLDLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwPLD_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("aad3b1a3-0828-4728-872a-6a5b021b57dd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwPLDLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwPLD_Link >> then instantiate a {@link HwPLDLink} proxy.
     * 
     * @return a {@link HwPLDLink} proxy on the created {@link Link}.
     */
    @objid ("0086cf37-e237-49c2-9aad-77918f28ae2b")
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
    @objid ("0ac9c1df-f496-41ba-8c35-75b6393de8a2")
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
    @objid ("e39ce17f-b93c-4460-a301-79bcffa22f89")
    public static HwPLDLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwPLDLink.canInstantiate(obj))
        	return new HwPLDLink(obj);
        else
        	throw new IllegalArgumentException("HwPLDLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3a6bf15c-b70e-4607-b192-2c9ca4fd1af9")
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
    @objid ("9b9a3d30-6686-4cbe-b6bd-d0b5e4adc6ca")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwPLD_Link_blocksComputing'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6539014e-13dd-4b7c-b5fd-ced9e3c40c14")
    public List<String> getHwPLD_Link_blocksComputing() {
        return this.elt.getTagValues(HwPLDLink.MdaTypes.HWPLD_LINK_BLOCKSCOMPUTING_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwPLD_Link_blocksRAM'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1eaafcc3-3bff-424d-9e80-e73350ed4c44")
    public List<String> getHwPLD_Link_blocksRAM() {
        return this.elt.getTagValues(HwPLDLink.MdaTypes.HWPLD_LINK_BLOCKSRAM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Link_nbFlipFlops'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b670b903-3e5f-489e-b4e0-ec3967a1876f")
    public String getHwPLD_Link_nbFlipFlops() {
        return this.elt.getTagValue(HwPLDLink.MdaTypes.HWPLD_LINK_NBFLIPFLOPS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Link_nbLUTs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0447f7ae-6e5b-434a-95c4-8146351cdc94")
    public String getHwPLD_Link_nbLUTs() {
        return this.elt.getTagValue(HwPLDLink.MdaTypes.HWPLD_LINK_NBLUTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Link_ndLUT_Inputs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4bd132cc-6853-4b7c-b934-faddd78b8624")
    public String getHwPLD_Link_ndLUT_Inputs() {
        return this.elt.getTagValue(HwPLDLink.MdaTypes.HWPLD_LINK_NDLUT_INPUTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Link_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5b5544ae-409b-4159-8ff2-986db5ea9d39")
    public String getHwPLD_Link_organization() {
        return this.elt.getTagValue(HwPLDLink.MdaTypes.HWPLD_LINK_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Link_technology'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6feac5c2-1e72-4bd6-bdd5-c60d1b4dd1df")
    public String getHwPLD_Link_technology() {
        return this.elt.getTagValue(HwPLDLink.MdaTypes.HWPLD_LINK_TECHNOLOGY_TAGTYPE_ELT);
    }

    @objid ("d5f57412-cbf2-4648-a9ee-b0abb89d8388")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwPLD_Link_blocksComputing'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e910d3a4-dd8e-4da5-9c5d-2498f8b4eef0")
    public void setHwPLD_Link_blocksComputing(final List<String> values) {
        this.elt.putTagValues(HwPLDLink.MdaTypes.HWPLD_LINK_BLOCKSCOMPUTING_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwPLD_Link_blocksRAM'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("475065d6-622f-4c20-be36-fc5f0eba7e8d")
    public void setHwPLD_Link_blocksRAM(final List<String> values) {
        this.elt.putTagValues(HwPLDLink.MdaTypes.HWPLD_LINK_BLOCKSRAM_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwPLD_Link_nbFlipFlops'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d4044170-e223-4ace-a113-c0a42b0543dc")
    public void setHwPLD_Link_nbFlipFlops(final String value) {
        this.elt.putTagValue(HwPLDLink.MdaTypes.HWPLD_LINK_NBFLIPFLOPS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Link_nbLUTs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("45d91d15-8c5c-4eee-a2c7-42c41ce7c3b2")
    public void setHwPLD_Link_nbLUTs(final String value) {
        this.elt.putTagValue(HwPLDLink.MdaTypes.HWPLD_LINK_NBLUTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Link_ndLUT_Inputs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("99cf36ef-a378-4b87-b69d-afdf6db010e5")
    public void setHwPLD_Link_ndLUT_Inputs(final String value) {
        this.elt.putTagValue(HwPLDLink.MdaTypes.HWPLD_LINK_NDLUT_INPUTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Link_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("67f4a9f4-1a09-4278-9743-216aff47aece")
    public void setHwPLD_Link_organization(final String value) {
        this.elt.putTagValue(HwPLDLink.MdaTypes.HWPLD_LINK_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Link_technology'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("eac0cd8b-5214-4b75-bea8-8efc80f8830d")
    public void setHwPLD_Link_technology(final String value) {
        this.elt.putTagValue(HwPLDLink.MdaTypes.HWPLD_LINK_TECHNOLOGY_TAGTYPE_ELT, value);
    }

    @objid ("f4063071-cb97-4e81-ac44-f4cec85c33d5")
    protected HwPLDLink(final Link elt) {
        super(elt);
    }

    @objid ("a14b8ec1-eed0-4910-aca5-13103afcae3e")
    public static final class MdaTypes {
        @objid ("a9a601ff-b275-45d9-9839-53b5b0fccbc0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4484b8a1-c679-4225-9622-685af698bf10")
        public static TagType HWPLD_LINK_TECHNOLOGY_TAGTYPE_ELT;

        @objid ("177146c6-1639-407b-9e75-22c0ac91ac10")
        public static TagType HWPLD_LINK_ORGANIZATION_TAGTYPE_ELT;

        @objid ("d91a7126-19c5-4d3c-86cf-be7be9853e1a")
        public static TagType HWPLD_LINK_NBLUTS_TAGTYPE_ELT;

        @objid ("3afd105e-f183-4749-b503-5a2fc3e43138")
        public static TagType HWPLD_LINK_NDLUT_INPUTS_TAGTYPE_ELT;

        @objid ("26efc5c3-d98e-4813-bc1d-0b600bf56321")
        public static TagType HWPLD_LINK_NBFLIPFLOPS_TAGTYPE_ELT;

        @objid ("cac95d53-fb39-47fb-8059-1176c07e2847")
        public static TagType HWPLD_LINK_BLOCKSRAM_TAGTYPE_ELT;

        @objid ("8538483e-256d-4b74-bdda-4ccb15547785")
        public static TagType HWPLD_LINK_BLOCKSCOMPUTING_TAGTYPE_ELT;

        @objid ("1b39dee3-c23c-4ae8-9bac-1eaba4f3938f")
        private static Stereotype MDAASSOCDEP;

        @objid ("0aea6abe-2336-493c-a52c-5d9ef570387e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5994829e-4dfe-4791-9d4b-fe7616177451")
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
