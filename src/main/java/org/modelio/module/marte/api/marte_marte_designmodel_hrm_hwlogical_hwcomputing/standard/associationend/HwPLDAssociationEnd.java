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
@objid ("63fcf195-4c7e-4bb6-b6bc-88204d5d0507")
public class HwPLDAssociationEnd extends HwComputingResourceAssociationEnd {
    @objid ("73910168-2e9c-47ce-844e-aec07af306f3")
    public static final String STEREOTYPE_NAME = "HwPLD_AssociationEnd";

    @objid ("e1482eb8-047e-4e19-9010-c37c56bbfc36")
    public static final String HWPLD_ASSOCIATIONEND_BLOCKSCOMPUTING_TAGTYPE = "HwPLD_AssociationEnd_blocksComputing";

    @objid ("07a6c825-3384-421d-a4b6-ca07d6c6d8bc")
    public static final String HWPLD_ASSOCIATIONEND_BLOCKSRAM_TAGTYPE = "HwPLD_AssociationEnd_blocksRAM";

    @objid ("85b7d889-9f04-4d66-8441-4d220a7ab2b7")
    public static final String HWPLD_ASSOCIATIONEND_NBFLIPFLOPS_TAGTYPE = "HwPLD_AssociationEnd_nbFlipFlops";

    @objid ("da052695-4ea7-4237-ac51-8283f3a99f77")
    public static final String HWPLD_ASSOCIATIONEND_NBLUTS_TAGTYPE = "HwPLD_AssociationEnd_nbLUTs";

    @objid ("2aa62a54-2d92-4591-9573-42eb60ceda0c")
    public static final String HWPLD_ASSOCIATIONEND_NDLUT_INPUTS_TAGTYPE = "HwPLD_AssociationEnd_ndLUT_Inputs";

    @objid ("d2fdc80c-681e-4ab1-8022-934a36b02d6c")
    public static final String HWPLD_ASSOCIATIONEND_ORGANIZATION_TAGTYPE = "HwPLD_AssociationEnd_organization";

    @objid ("7929c84f-a86e-487c-a7fa-c9bc77c058d4")
    public static final String HWPLD_ASSOCIATIONEND_TECHNOLOGY_TAGTYPE = "HwPLD_AssociationEnd_technology";

    /**
     * Tells whether a {@link HwPLDAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwPLD_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("64a0bc6c-80c8-49b2-a66d-c92df612bdcb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwPLDAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwPLD_AssociationEnd >> then instantiate a {@link HwPLDAssociationEnd} proxy.
     * 
     * @return a {@link HwPLDAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("a6a94b8c-3f4d-42dc-9d94-c904b16e49bc")
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
    @objid ("a4a6c345-420b-424a-9c9b-2ece113c84e0")
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
    @objid ("9eaa0215-281e-4a0d-8186-4a998c7cfcf5")
    public static HwPLDAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwPLDAssociationEnd.canInstantiate(obj))
        	return new HwPLDAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwPLDAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("78b4220c-22ef-47cb-9b18-423e351478bf")
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
    @objid ("e803515b-4a9d-4595-a126-590f21458e3f")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwPLD_AssociationEnd_blocksComputing'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("464ccd9c-02d8-4192-bfbd-94c353bcfa59")
    public List<String> getHwPLD_AssociationEnd_blocksComputing() {
        return this.elt.getTagValues(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_BLOCKSCOMPUTING_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwPLD_AssociationEnd_blocksRAM'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d29c504f-3648-4863-a897-645f1db0afbf")
    public List<String> getHwPLD_AssociationEnd_blocksRAM() {
        return this.elt.getTagValues(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_BLOCKSRAM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_AssociationEnd_nbFlipFlops'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("129f3a70-e2b0-421c-9382-c827e620d116")
    public String getHwPLD_AssociationEnd_nbFlipFlops() {
        return this.elt.getTagValue(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_NBFLIPFLOPS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_AssociationEnd_nbLUTs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0b8ad138-04d7-475a-a94b-b9ac35eefdae")
    public String getHwPLD_AssociationEnd_nbLUTs() {
        return this.elt.getTagValue(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_NBLUTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_AssociationEnd_ndLUT_Inputs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("67a129ab-b256-4d7b-8b01-a060b83ba0ed")
    public String getHwPLD_AssociationEnd_ndLUT_Inputs() {
        return this.elt.getTagValue(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_NDLUT_INPUTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_AssociationEnd_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f0482e72-cc20-4cc1-9cc9-25127432c760")
    public String getHwPLD_AssociationEnd_organization() {
        return this.elt.getTagValue(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_AssociationEnd_technology'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("45444422-2592-4960-ab46-b107d522cee0")
    public String getHwPLD_AssociationEnd_technology() {
        return this.elt.getTagValue(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_TECHNOLOGY_TAGTYPE_ELT);
    }

    @objid ("df20a3cd-ee33-491c-a570-da08f51c3072")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwPLD_AssociationEnd_blocksComputing'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7677c5ac-f584-4418-a10c-5a5762cfaae0")
    public void setHwPLD_AssociationEnd_blocksComputing(final List<String> values) {
        this.elt.putTagValues(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_BLOCKSCOMPUTING_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwPLD_AssociationEnd_blocksRAM'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("919c9648-71da-425e-baa8-fa09a5e6899b")
    public void setHwPLD_AssociationEnd_blocksRAM(final List<String> values) {
        this.elt.putTagValues(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_BLOCKSRAM_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwPLD_AssociationEnd_nbFlipFlops'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2494c6b1-d590-4da3-8a5a-448edfcbb8e5")
    public void setHwPLD_AssociationEnd_nbFlipFlops(final String value) {
        this.elt.putTagValue(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_NBFLIPFLOPS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_AssociationEnd_nbLUTs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0ac768d3-fb20-4d81-b233-8d4574c2f41b")
    public void setHwPLD_AssociationEnd_nbLUTs(final String value) {
        this.elt.putTagValue(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_NBLUTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_AssociationEnd_ndLUT_Inputs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1ad33e58-f01e-4932-916e-1738516aa51c")
    public void setHwPLD_AssociationEnd_ndLUT_Inputs(final String value) {
        this.elt.putTagValue(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_NDLUT_INPUTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_AssociationEnd_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bf8e603c-7581-4748-9dd0-57ba960bfec7")
    public void setHwPLD_AssociationEnd_organization(final String value) {
        this.elt.putTagValue(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_AssociationEnd_technology'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4dabca1f-ecd7-41e5-b897-3a2894eaba58")
    public void setHwPLD_AssociationEnd_technology(final String value) {
        this.elt.putTagValue(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_TECHNOLOGY_TAGTYPE_ELT, value);
    }

    @objid ("6a9ca514-75eb-4ec4-86b3-5ff79db8f41c")
    protected HwPLDAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("888a8afd-137a-4085-8abb-dba1873358e9")
    public static final class MdaTypes {
        @objid ("0776d386-e078-4e3c-93ab-cd7d2706d8f4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("57bae6de-93fc-4ff0-853c-2c58f9b8facf")
        public static TagType HWPLD_ASSOCIATIONEND_TECHNOLOGY_TAGTYPE_ELT;

        @objid ("bed44942-39c8-48c3-80ed-1db60cc40c6d")
        public static TagType HWPLD_ASSOCIATIONEND_ORGANIZATION_TAGTYPE_ELT;

        @objid ("90750f56-c6b1-4bee-b426-78049629c3f1")
        public static TagType HWPLD_ASSOCIATIONEND_NBLUTS_TAGTYPE_ELT;

        @objid ("8aa367f4-69e5-4de9-a91b-5e8fa68fe576")
        public static TagType HWPLD_ASSOCIATIONEND_NDLUT_INPUTS_TAGTYPE_ELT;

        @objid ("ff8373b5-4dfe-472f-b17d-080e2eeca0bb")
        public static TagType HWPLD_ASSOCIATIONEND_NBFLIPFLOPS_TAGTYPE_ELT;

        @objid ("9c816461-f6f2-4229-8ac5-8cab1919b47a")
        public static TagType HWPLD_ASSOCIATIONEND_BLOCKSRAM_TAGTYPE_ELT;

        @objid ("0d23a4d2-8c07-40a9-8364-4d717ee202be")
        public static TagType HWPLD_ASSOCIATIONEND_BLOCKSCOMPUTING_TAGTYPE_ELT;

        @objid ("ee91967b-620a-4c57-ace1-8b792e3c0d0f")
        private static Stereotype MDAASSOCDEP;

        @objid ("3448d0d1-ca7d-4a63-ad72-f4374b86c593")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2448ea74-4577-49a0-bce9-44700f252d72")
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
