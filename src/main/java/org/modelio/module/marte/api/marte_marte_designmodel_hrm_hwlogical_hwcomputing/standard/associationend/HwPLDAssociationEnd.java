/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("30538d61-1753-4700-8f50-535de8f7e516")
    public static final String STEREOTYPE_NAME = "HwPLD_AssociationEnd";

    @objid ("4d1daf7e-21b1-4a76-82d2-abc47d881b1a")
    public static final String HWPLD_ASSOCIATIONEND_BLOCKSCOMPUTING_TAGTYPE = "HwPLD_AssociationEnd_blocksComputing";

    @objid ("52d0e3da-17b9-4d5b-a9ea-3e34279ff37f")
    public static final String HWPLD_ASSOCIATIONEND_BLOCKSRAM_TAGTYPE = "HwPLD_AssociationEnd_blocksRAM";

    @objid ("2f1763c1-f004-4d7e-8557-38d444e71ee2")
    public static final String HWPLD_ASSOCIATIONEND_NBFLIPFLOPS_TAGTYPE = "HwPLD_AssociationEnd_nbFlipFlops";

    @objid ("202243eb-d3f5-47a7-90ce-245bc44971a0")
    public static final String HWPLD_ASSOCIATIONEND_NBLUTS_TAGTYPE = "HwPLD_AssociationEnd_nbLUTs";

    @objid ("9a939b1e-8182-4a5f-b383-de5c17cd85e1")
    public static final String HWPLD_ASSOCIATIONEND_NDLUT_INPUTS_TAGTYPE = "HwPLD_AssociationEnd_ndLUT_Inputs";

    @objid ("e9a6431a-0ce2-4981-87fb-2b69b135c5ec")
    public static final String HWPLD_ASSOCIATIONEND_ORGANIZATION_TAGTYPE = "HwPLD_AssociationEnd_organization";

    @objid ("fa0786fa-4569-408d-b3d7-b15cd7263584")
    public static final String HWPLD_ASSOCIATIONEND_TECHNOLOGY_TAGTYPE = "HwPLD_AssociationEnd_technology";

    /**
     * Tells whether a {@link HwPLDAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwPLD_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("114bbc8f-5a64-4cb7-b092-6babdd1cf6ee")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwPLDAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwPLD_AssociationEnd >> then instantiate a {@link HwPLDAssociationEnd} proxy.
     * 
     * @return a {@link HwPLDAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("4f3f9683-fc81-4fef-8733-853c386c71c4")
    public static HwPLDAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwPLDAssociationEnd.STEREOTYPE_NAME);
        return HwPLDAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwPLDAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwPLD_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwPLDAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("7aedb2de-5792-4053-afdd-09ab988064cd")
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
    @objid ("190c95bb-28fa-4b2d-bc77-5fd1e2665232")
    public static HwPLDAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwPLDAssociationEnd.canInstantiate(obj))
        	return new HwPLDAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwPLDAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("31cfbe46-2c79-4a44-bf2b-ec43d85751bc")
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
    @objid ("34e6bd19-0342-441e-a0f3-4d4b53b5a188")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwPLD_AssociationEnd_blocksComputing'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("7eb399c7-e721-4cf1-b9a2-98d6a5daf073")
    public List<String> getHwPLD_AssociationEnd_blocksComputing() {
        return this.elt.getTagValues(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_BLOCKSCOMPUTING_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwPLD_AssociationEnd_blocksRAM'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("25b5f43a-d406-4297-b5ed-ae9956810c7a")
    public List<String> getHwPLD_AssociationEnd_blocksRAM() {
        return this.elt.getTagValues(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_BLOCKSRAM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_AssociationEnd_nbFlipFlops'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d2b03559-2d32-411f-af59-88d203c7d7ab")
    public String getHwPLD_AssociationEnd_nbFlipFlops() {
        return this.elt.getTagValue(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_NBFLIPFLOPS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_AssociationEnd_nbLUTs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("469a756f-e11e-458f-8eb3-8f5d7aa9e6fa")
    public String getHwPLD_AssociationEnd_nbLUTs() {
        return this.elt.getTagValue(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_NBLUTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_AssociationEnd_ndLUT_Inputs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dc43520b-d39f-4686-a440-9ecfc8fc441e")
    public String getHwPLD_AssociationEnd_ndLUT_Inputs() {
        return this.elt.getTagValue(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_NDLUT_INPUTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_AssociationEnd_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0e9b11aa-37fa-4275-827a-948daac1dbb6")
    public String getHwPLD_AssociationEnd_organization() {
        return this.elt.getTagValue(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_AssociationEnd_technology'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("723cacbd-0ba6-4741-98b5-147885c07e7e")
    public String getHwPLD_AssociationEnd_technology() {
        return this.elt.getTagValue(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_TECHNOLOGY_TAGTYPE_ELT);
    }

    @objid ("2c16c1da-0efc-4d7f-a685-2f5293219482")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwPLD_AssociationEnd_blocksComputing'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fb77ea2c-d485-4e85-ac3f-0ec2d0fab0f4")
    public void setHwPLD_AssociationEnd_blocksComputing(final List<String> values) {
        this.elt.putTagValues(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_BLOCKSCOMPUTING_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwPLD_AssociationEnd_blocksRAM'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bffd2be1-b419-43ea-a962-d57d327a67f6")
    public void setHwPLD_AssociationEnd_blocksRAM(final List<String> values) {
        this.elt.putTagValues(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_BLOCKSRAM_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwPLD_AssociationEnd_nbFlipFlops'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f2de53c9-3bb9-486f-806d-bfbd20ebf67d")
    public void setHwPLD_AssociationEnd_nbFlipFlops(final String value) {
        this.elt.putTagValue(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_NBFLIPFLOPS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_AssociationEnd_nbLUTs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3de493a0-d1bb-4b37-bad2-4d52ae161882")
    public void setHwPLD_AssociationEnd_nbLUTs(final String value) {
        this.elt.putTagValue(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_NBLUTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_AssociationEnd_ndLUT_Inputs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("df0e7a27-3fab-4c81-8cab-2a582a4810e5")
    public void setHwPLD_AssociationEnd_ndLUT_Inputs(final String value) {
        this.elt.putTagValue(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_NDLUT_INPUTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_AssociationEnd_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("552717e1-86e6-4ad4-b709-92c61c56e05a")
    public void setHwPLD_AssociationEnd_organization(final String value) {
        this.elt.putTagValue(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_AssociationEnd_technology'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f28da256-e0ac-434a-9398-33404428befb")
    public void setHwPLD_AssociationEnd_technology(final String value) {
        this.elt.putTagValue(HwPLDAssociationEnd.MdaTypes.HWPLD_ASSOCIATIONEND_TECHNOLOGY_TAGTYPE_ELT, value);
    }

    @objid ("d272ee52-d9ff-4967-9b9b-d04712c36df6")
    protected HwPLDAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("888a8afd-137a-4085-8abb-dba1873358e9")
    public static final class MdaTypes {
        @objid ("d312df31-e6a9-41b9-81cc-1a9a99e4b1fc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c9d10f22-6655-429f-a22c-d2c2b4a218da")
        public static TagType HWPLD_ASSOCIATIONEND_TECHNOLOGY_TAGTYPE_ELT;

        @objid ("90ccd71c-1c6e-4a56-b663-8c2b8b1220aa")
        public static TagType HWPLD_ASSOCIATIONEND_ORGANIZATION_TAGTYPE_ELT;

        @objid ("7a88981f-2066-451e-a299-e4701d233040")
        public static TagType HWPLD_ASSOCIATIONEND_NBLUTS_TAGTYPE_ELT;

        @objid ("9e2013e3-0c94-418b-bfa5-c65cf31a8ec1")
        public static TagType HWPLD_ASSOCIATIONEND_NDLUT_INPUTS_TAGTYPE_ELT;

        @objid ("5f343377-25dc-4b7c-867b-7dc253c99ff8")
        public static TagType HWPLD_ASSOCIATIONEND_NBFLIPFLOPS_TAGTYPE_ELT;

        @objid ("766a8b28-acba-4782-a5ee-19633420d374")
        public static TagType HWPLD_ASSOCIATIONEND_BLOCKSRAM_TAGTYPE_ELT;

        @objid ("28725d9c-2b98-42c9-8e59-65727dbc1c31")
        public static TagType HWPLD_ASSOCIATIONEND_BLOCKSCOMPUTING_TAGTYPE_ELT;

        @objid ("92782937-a75e-4636-860a-8ed6a23a1d1f")
        private static Stereotype MDAASSOCDEP;

        @objid ("8bd93116-044b-4548-b10f-ea7691b03521")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9e069b31-5302-4762-815e-fa8ded8b3e54")
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
