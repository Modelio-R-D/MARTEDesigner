/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.instance;

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
@objid ("e9678599-8c0d-49d0-ad80-f1eeb502abab")
public class HwPLDInstance extends HwComputingResourceInstance {
    @objid ("28d027e7-6198-4537-b397-8693fea515a2")
    public static final String STEREOTYPE_NAME = "HwPLD_Instance";

    @objid ("2fedfaa1-eb2a-45a3-8aa7-17013876b29f")
    public static final String HWPLD_INSTANCE_BLOCKSCOMPUTING_TAGTYPE = "HwPLD_Instance_blocksComputing";

    @objid ("4f21daf1-bfe6-4518-a892-9fe2687a8f36")
    public static final String HWPLD_INSTANCE_BLOCKSRAM_TAGTYPE = "HwPLD_Instance_blocksRAM";

    @objid ("72dbc4c4-b6ea-46d5-a017-94f291036aae")
    public static final String HWPLD_INSTANCE_NBFLIPFLOPS_TAGTYPE = "HwPLD_Instance_nbFlipFlops";

    @objid ("61c3910d-e88d-40a3-a2dc-ea06a8f44c5a")
    public static final String HWPLD_INSTANCE_NBLUTS_TAGTYPE = "HwPLD_Instance_nbLUTs";

    @objid ("12f71e58-a8f8-4936-9fea-8435bd9b2ce0")
    public static final String HWPLD_INSTANCE_NDLUT_INPUTS_TAGTYPE = "HwPLD_Instance_ndLUT_Inputs";

    @objid ("440e7e6e-1329-4ecb-825f-9bd664eb2bfa")
    public static final String HWPLD_INSTANCE_ORGANIZATION_TAGTYPE = "HwPLD_Instance_organization";

    @objid ("30783a56-41f9-4786-8b67-b83a115bc7a7")
    public static final String HWPLD_INSTANCE_TECHNOLOGY_TAGTYPE = "HwPLD_Instance_technology";

    /**
     * Tells whether a {@link HwPLDInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwPLD_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("5d44bffd-be3d-463b-bc47-e1ca2b739906")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwPLDInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwPLD_Instance >> then instantiate a {@link HwPLDInstance} proxy.
     * 
     * @return a {@link HwPLDInstance} proxy on the created {@link Instance}.
     */
    @objid ("30beb05a-d395-4468-8cae-f563eef99ced")
    public static HwPLDInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwPLDInstance.STEREOTYPE_NAME);
        return HwPLDInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwPLDInstance} proxy from a {@link Instance} stereotyped << HwPLD_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwPLDInstance} proxy or <i>null</i>.
     */
    @objid ("89c44ff7-d618-4a27-bfde-f26575eeb7cb")
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
    @objid ("bb71efec-bdcb-4319-a141-2b58bbc0d90a")
    public static HwPLDInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwPLDInstance.canInstantiate(obj))
        	return new HwPLDInstance(obj);
        else
        	throw new IllegalArgumentException("HwPLDInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8bcea36c-b3f0-4959-ad62-63979b49beb8")
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
    @objid ("18ae25f9-797b-4d3e-8104-5404d27f3150")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwPLD_Instance_blocksComputing'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("351a827c-0870-4cd6-a324-c624ccea80c1")
    public List<String> getHwPLD_Instance_blocksComputing() {
        return this.elt.getTagValues(HwPLDInstance.MdaTypes.HWPLD_INSTANCE_BLOCKSCOMPUTING_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwPLD_Instance_blocksRAM'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f1362cf1-c253-4e8f-9881-00758dd15c9d")
    public List<String> getHwPLD_Instance_blocksRAM() {
        return this.elt.getTagValues(HwPLDInstance.MdaTypes.HWPLD_INSTANCE_BLOCKSRAM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Instance_nbFlipFlops'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1de3812b-aae0-42e4-8488-bc5dd1c3914e")
    public String getHwPLD_Instance_nbFlipFlops() {
        return this.elt.getTagValue(HwPLDInstance.MdaTypes.HWPLD_INSTANCE_NBFLIPFLOPS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Instance_nbLUTs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5e79d418-7f2d-45c2-811b-4d87a5bcdaff")
    public String getHwPLD_Instance_nbLUTs() {
        return this.elt.getTagValue(HwPLDInstance.MdaTypes.HWPLD_INSTANCE_NBLUTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Instance_ndLUT_Inputs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9bb57bf5-1eb0-4e84-bfd1-a77aa800f283")
    public String getHwPLD_Instance_ndLUT_Inputs() {
        return this.elt.getTagValue(HwPLDInstance.MdaTypes.HWPLD_INSTANCE_NDLUT_INPUTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Instance_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e44d73d4-dd0d-4c91-a09a-1e87d098bf10")
    public String getHwPLD_Instance_organization() {
        return this.elt.getTagValue(HwPLDInstance.MdaTypes.HWPLD_INSTANCE_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Instance_technology'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b273caf3-9d4f-4156-ac88-6a59f6f8bd58")
    public String getHwPLD_Instance_technology() {
        return this.elt.getTagValue(HwPLDInstance.MdaTypes.HWPLD_INSTANCE_TECHNOLOGY_TAGTYPE_ELT);
    }

    @objid ("b0ab6d96-23e8-468a-b1fa-55d05bfd47e3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwPLD_Instance_blocksComputing'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bdaf8a8c-aea6-477d-ac1a-b80e8b0f1cda")
    public void setHwPLD_Instance_blocksComputing(final List<String> values) {
        this.elt.putTagValues(HwPLDInstance.MdaTypes.HWPLD_INSTANCE_BLOCKSCOMPUTING_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwPLD_Instance_blocksRAM'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e48083cc-a92f-42e9-8858-5d6063554396")
    public void setHwPLD_Instance_blocksRAM(final List<String> values) {
        this.elt.putTagValues(HwPLDInstance.MdaTypes.HWPLD_INSTANCE_BLOCKSRAM_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwPLD_Instance_nbFlipFlops'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e36bb405-1fe6-46ab-9bc9-c1c6dd4c7cc9")
    public void setHwPLD_Instance_nbFlipFlops(final String value) {
        this.elt.putTagValue(HwPLDInstance.MdaTypes.HWPLD_INSTANCE_NBFLIPFLOPS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Instance_nbLUTs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bfccecff-a4cf-45e9-9d81-00b29eb8daf9")
    public void setHwPLD_Instance_nbLUTs(final String value) {
        this.elt.putTagValue(HwPLDInstance.MdaTypes.HWPLD_INSTANCE_NBLUTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Instance_ndLUT_Inputs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("31b1fc6d-ada7-4358-a00c-dee6ae8b2876")
    public void setHwPLD_Instance_ndLUT_Inputs(final String value) {
        this.elt.putTagValue(HwPLDInstance.MdaTypes.HWPLD_INSTANCE_NDLUT_INPUTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Instance_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fae4884e-a9b8-4b9b-976d-e256799cda67")
    public void setHwPLD_Instance_organization(final String value) {
        this.elt.putTagValue(HwPLDInstance.MdaTypes.HWPLD_INSTANCE_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Instance_technology'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("98ad9689-5520-40cb-a33c-4301a6e2a540")
    public void setHwPLD_Instance_technology(final String value) {
        this.elt.putTagValue(HwPLDInstance.MdaTypes.HWPLD_INSTANCE_TECHNOLOGY_TAGTYPE_ELT, value);
    }

    @objid ("054ae0e5-6c8c-43eb-b6f8-1bc18c3af93c")
    protected HwPLDInstance(final Instance elt) {
        super(elt);
    }

    @objid ("6bf18779-ffe7-4532-9b86-fe4a10def4a5")
    public static final class MdaTypes {
        @objid ("ac55e524-84b3-44a7-b26a-289ce15a5479")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1a63f836-135a-4cd6-a9e6-66a8ce7250db")
        public static TagType HWPLD_INSTANCE_TECHNOLOGY_TAGTYPE_ELT;

        @objid ("7d9fa53f-874f-4bf4-af03-6b2ae28e6a53")
        public static TagType HWPLD_INSTANCE_ORGANIZATION_TAGTYPE_ELT;

        @objid ("632fa567-b56f-46b5-aacd-4c3147fa29c4")
        public static TagType HWPLD_INSTANCE_NBLUTS_TAGTYPE_ELT;

        @objid ("cbdd1d57-32ae-4554-97bb-e61ae41c66de")
        public static TagType HWPLD_INSTANCE_NDLUT_INPUTS_TAGTYPE_ELT;

        @objid ("2f71dbdd-1101-4e12-ae51-1e4c1ce79bb9")
        public static TagType HWPLD_INSTANCE_NBFLIPFLOPS_TAGTYPE_ELT;

        @objid ("b2d67f42-37e0-4473-ae47-e99043c54a35")
        public static TagType HWPLD_INSTANCE_BLOCKSRAM_TAGTYPE_ELT;

        @objid ("313c0ab4-3ac2-46c8-bcc1-4281e2cbb283")
        public static TagType HWPLD_INSTANCE_BLOCKSCOMPUTING_TAGTYPE_ELT;

        @objid ("948b2628-7afa-41e4-9662-f2311feb7c4d")
        private static Stereotype MDAASSOCDEP;

        @objid ("e2be46a1-5e0d-4bb4-bee7-0d257b465873")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e8e3aecd-1a36-4d32-95c8-fb31ca83e9ac")
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
