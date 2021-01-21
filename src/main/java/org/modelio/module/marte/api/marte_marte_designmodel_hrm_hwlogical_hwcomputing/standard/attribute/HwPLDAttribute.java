/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << HwPLD_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("bd11b533-37ba-4053-b257-809311c08f2f")
public class HwPLDAttribute extends HwComputingResourceAttribute {
    @objid ("d8cd5d33-7f72-493a-86ee-5f677971fb75")
    public static final String STEREOTYPE_NAME = "HwPLD_Attribute";

    @objid ("02df2dad-e191-4f29-90b1-22f797a1fc93")
    public static final String HWPLD_ATTRIBUTE_BLOCKSCOMPUTING_TAGTYPE = "HwPLD_Attribute_blocksComputing";

    @objid ("8359178c-6730-4bb5-9e6a-5af9aef45247")
    public static final String HWPLD_ATTRIBUTE_BLOCKSRAM_TAGTYPE = "HwPLD_Attribute_blocksRAM";

    @objid ("bcf30fc3-46c6-496c-bdfa-81e834f5afc9")
    public static final String HWPLD_ATTRIBUTE_NBFLIPFLOPS_TAGTYPE = "HwPLD_Attribute_nbFlipFlops";

    @objid ("0d95ff97-2d7e-40ae-bca9-4adb1ff77733")
    public static final String HWPLD_ATTRIBUTE_NBLUTS_TAGTYPE = "HwPLD_Attribute_nbLUTs";

    @objid ("b07db1c7-38fe-46b6-8616-9edd3826e458")
    public static final String HWPLD_ATTRIBUTE_NDLUT_INPUTS_TAGTYPE = "HwPLD_Attribute_ndLUT_Inputs";

    @objid ("3039d9b1-837c-46cc-8941-9ab0af1e2b17")
    public static final String HWPLD_ATTRIBUTE_ORGANIZATION_TAGTYPE = "HwPLD_Attribute_organization";

    @objid ("97522c8e-e7a4-46d8-acfe-14a84355978f")
    public static final String HWPLD_ATTRIBUTE_TECHNOLOGY_TAGTYPE = "HwPLD_Attribute_technology";

    /**
     * Tells whether a {@link HwPLDAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwPLD_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("487e9912-9c9e-405b-ba47-8765454a9bc7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwPLDAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwPLD_Attribute >> then instantiate a {@link HwPLDAttribute} proxy.
     * 
     * @return a {@link HwPLDAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("6fda095c-6eb2-4b26-8d0b-56cf6ef34f20")
    public static HwPLDAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwPLDAttribute.STEREOTYPE_NAME);
        return HwPLDAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwPLDAttribute} proxy from a {@link Attribute} stereotyped << HwPLD_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwPLDAttribute} proxy or <i>null</i>.
     */
    @objid ("bc5ae029-f9d8-43f4-9095-df66dde194d0")
    public static HwPLDAttribute instantiate(final Attribute obj) {
        return HwPLDAttribute.canInstantiate(obj) ? new HwPLDAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwPLDAttribute} proxy from a {@link Attribute} stereotyped << HwPLD_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwPLDAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3c1b532f-ed4b-4aec-92ce-07e65222a922")
    public static HwPLDAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwPLDAttribute.canInstantiate(obj))
        	return new HwPLDAttribute(obj);
        else
        	throw new IllegalArgumentException("HwPLDAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3eb45752-5e1d-4811-9d26-ee964b3ca935")
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
        HwPLDAttribute other = (HwPLDAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("863a91df-5249-4d2d-b6af-7e6dbf96bb56")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwPLD_Attribute_blocksComputing'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e02298ed-9ea6-4e95-a4d3-c8827710b4ff")
    public List<String> getHwPLD_Attribute_blocksComputing() {
        return this.elt.getTagValues(HwPLDAttribute.MdaTypes.HWPLD_ATTRIBUTE_BLOCKSCOMPUTING_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwPLD_Attribute_blocksRAM'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("55cd2527-f35a-4d35-8ce6-a593f22a1461")
    public List<String> getHwPLD_Attribute_blocksRAM() {
        return this.elt.getTagValues(HwPLDAttribute.MdaTypes.HWPLD_ATTRIBUTE_BLOCKSRAM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Attribute_nbFlipFlops'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ae42f46d-1bf7-4ccf-8cde-fc8ad28adc75")
    public String getHwPLD_Attribute_nbFlipFlops() {
        return this.elt.getTagValue(HwPLDAttribute.MdaTypes.HWPLD_ATTRIBUTE_NBFLIPFLOPS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Attribute_nbLUTs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a96eac1e-7f9d-4bf3-bdee-a49e062b01ad")
    public String getHwPLD_Attribute_nbLUTs() {
        return this.elt.getTagValue(HwPLDAttribute.MdaTypes.HWPLD_ATTRIBUTE_NBLUTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Attribute_ndLUT_Inputs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b24d3158-17be-4f03-a4cc-31503445c2b2")
    public String getHwPLD_Attribute_ndLUT_Inputs() {
        return this.elt.getTagValue(HwPLDAttribute.MdaTypes.HWPLD_ATTRIBUTE_NDLUT_INPUTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Attribute_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("83513e7c-54ee-4ef3-b70d-2831d5ece7d9")
    public String getHwPLD_Attribute_organization() {
        return this.elt.getTagValue(HwPLDAttribute.MdaTypes.HWPLD_ATTRIBUTE_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Attribute_technology'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("57d6b4cd-de12-46fc-8991-b613a275a1e7")
    public String getHwPLD_Attribute_technology() {
        return this.elt.getTagValue(HwPLDAttribute.MdaTypes.HWPLD_ATTRIBUTE_TECHNOLOGY_TAGTYPE_ELT);
    }

    @objid ("15287315-9ae0-4a12-be36-93a5adda03bf")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwPLD_Attribute_blocksComputing'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("185be34e-7d41-4c99-bd23-f4cc6adb55ff")
    public void setHwPLD_Attribute_blocksComputing(final List<String> values) {
        this.elt.putTagValues(HwPLDAttribute.MdaTypes.HWPLD_ATTRIBUTE_BLOCKSCOMPUTING_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwPLD_Attribute_blocksRAM'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5b4c45c3-de0d-4934-a196-30f180062dc3")
    public void setHwPLD_Attribute_blocksRAM(final List<String> values) {
        this.elt.putTagValues(HwPLDAttribute.MdaTypes.HWPLD_ATTRIBUTE_BLOCKSRAM_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwPLD_Attribute_nbFlipFlops'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5b6c53b0-9c5f-4188-9a13-3f28c204f33a")
    public void setHwPLD_Attribute_nbFlipFlops(final String value) {
        this.elt.putTagValue(HwPLDAttribute.MdaTypes.HWPLD_ATTRIBUTE_NBFLIPFLOPS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Attribute_nbLUTs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("94b1b490-7e5b-4b15-9454-e18d190f0231")
    public void setHwPLD_Attribute_nbLUTs(final String value) {
        this.elt.putTagValue(HwPLDAttribute.MdaTypes.HWPLD_ATTRIBUTE_NBLUTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Attribute_ndLUT_Inputs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b71ce809-ddc8-498b-b598-06bae8b1d9e9")
    public void setHwPLD_Attribute_ndLUT_Inputs(final String value) {
        this.elt.putTagValue(HwPLDAttribute.MdaTypes.HWPLD_ATTRIBUTE_NDLUT_INPUTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Attribute_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d112f9bf-6058-42f8-b7c9-c31d77b4faf4")
    public void setHwPLD_Attribute_organization(final String value) {
        this.elt.putTagValue(HwPLDAttribute.MdaTypes.HWPLD_ATTRIBUTE_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Attribute_technology'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("60181f5b-a1fe-40c3-a021-b2b97f349f4f")
    public void setHwPLD_Attribute_technology(final String value) {
        this.elt.putTagValue(HwPLDAttribute.MdaTypes.HWPLD_ATTRIBUTE_TECHNOLOGY_TAGTYPE_ELT, value);
    }

    @objid ("acf912f2-4160-4382-b043-4059a7e531ee")
    protected HwPLDAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("eb1e9efa-801f-45df-bf93-9df502872961")
    public static final class MdaTypes {
        @objid ("f57e30bd-232d-4088-b3c6-b8570e90cee6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bf9ae768-6dd0-4bc3-8a76-4e868a8428b8")
        public static TagType HWPLD_ATTRIBUTE_TECHNOLOGY_TAGTYPE_ELT;

        @objid ("b7aa39f1-d363-4c28-9e95-ae31cfc472eb")
        public static TagType HWPLD_ATTRIBUTE_ORGANIZATION_TAGTYPE_ELT;

        @objid ("19ffac3b-7f9e-4b3e-9017-a817d43540ae")
        public static TagType HWPLD_ATTRIBUTE_NBLUTS_TAGTYPE_ELT;

        @objid ("f8e3bbe6-66a2-44cf-b0c0-0eb0a4b92f16")
        public static TagType HWPLD_ATTRIBUTE_NDLUT_INPUTS_TAGTYPE_ELT;

        @objid ("5935d04f-419a-4ed2-8f8c-7e8a1bfdbbe0")
        public static TagType HWPLD_ATTRIBUTE_NBFLIPFLOPS_TAGTYPE_ELT;

        @objid ("3593c2af-ce00-4193-a04c-817e585bd0d1")
        public static TagType HWPLD_ATTRIBUTE_BLOCKSRAM_TAGTYPE_ELT;

        @objid ("a0fdfa44-bbe7-473c-a7e8-bf5ef1db5ac2")
        public static TagType HWPLD_ATTRIBUTE_BLOCKSCOMPUTING_TAGTYPE_ELT;

        @objid ("f1a266f8-4d37-4bac-a90f-93bc55c8982f")
        private static Stereotype MDAASSOCDEP;

        @objid ("ed0960c0-83ca-4823-9fbe-6d007309f008")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("26885383-d218-4018-ba1f-019f5833763f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00f2baaa-0ccf-11df-8525-001302895b2b");
            HWPLD_ATTRIBUTE_TECHNOLOGY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2bab1-0ccf-11df-8525-001302895b2b");
            HWPLD_ATTRIBUTE_ORGANIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2bab8-0ccf-11df-8525-001302895b2b");
            HWPLD_ATTRIBUTE_NBLUTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2babf-0ccf-11df-8525-001302895b2b");
            HWPLD_ATTRIBUTE_NDLUT_INPUTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2bac6-0ccf-11df-8525-001302895b2b");
            HWPLD_ATTRIBUTE_NBFLIPFLOPS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2bacd-0ccf-11df-8525-001302895b2b");
            HWPLD_ATTRIBUTE_BLOCKSRAM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2bad4-0ccf-11df-8525-001302895b2b");
            HWPLD_ATTRIBUTE_BLOCKSCOMPUTING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f51cfa-0ccf-11df-8525-001302895b2b");
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
