/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << HwPLD_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b831eecd-e9e6-454e-a0a3-4c2f86457be3")
public class HwPLDLifeline extends HwComputingResourceLifeline {
    @objid ("a0acae63-5563-4509-a09c-3f3ed8a2e0db")
    public static final String STEREOTYPE_NAME = "HwPLD_Lifeline";

    @objid ("826e6d10-d97b-4a7f-9094-f36918ad947e")
    public static final String HWPLD_LIFELINE_BLOCKSCOMPUTING_TAGTYPE = "HwPLD_Lifeline_blocksComputing";

    @objid ("c1133149-d50d-4191-98aa-1d878dc7f4f8")
    public static final String HWPLD_LIFELINE_BLOCKSRAM_TAGTYPE = "HwPLD_Lifeline_blocksRAM";

    @objid ("f7ce9c97-e2c2-477a-93ed-88b924843ec8")
    public static final String HWPLD_LIFELINE_NBFLIPFLOPS_TAGTYPE = "HwPLD_Lifeline_nbFlipFlops";

    @objid ("8af39a35-57c6-4f7d-9a3f-42c5ec7ed3bd")
    public static final String HWPLD_LIFELINE_NBLUTS_TAGTYPE = "HwPLD_Lifeline_nbLUTs";

    @objid ("c96fd6a8-33a5-41e9-9b25-7b8b86ad9139")
    public static final String HWPLD_LIFELINE_NDLUT_INPUTS_TAGTYPE = "HwPLD_Lifeline_ndLUT_Inputs";

    @objid ("a3978e4b-62ac-47a4-a1b1-11a6c7e14563")
    public static final String HWPLD_LIFELINE_ORGANIZATION_TAGTYPE = "HwPLD_Lifeline_organization";

    @objid ("d5e51868-6a11-4f7c-b6b1-fa27d770230f")
    public static final String HWPLD_LIFELINE_TECHNOLOGY_TAGTYPE = "HwPLD_Lifeline_technology";

    /**
     * Tells whether a {@link HwPLDLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwPLD_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("aa6ee52a-e43f-44ce-b449-81577e46ad5e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwPLDLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwPLD_Lifeline >> then instantiate a {@link HwPLDLifeline} proxy.
     * 
     * @return a {@link HwPLDLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("58f26489-f2e4-4df4-9060-bb274e3888a0")
    public static HwPLDLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwPLDLifeline.STEREOTYPE_NAME);
        return HwPLDLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwPLDLifeline} proxy from a {@link Lifeline} stereotyped << HwPLD_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwPLDLifeline} proxy or <i>null</i>.
     */
    @objid ("7befbef6-d6e9-4191-81c5-a7c077b4163f")
    public static HwPLDLifeline instantiate(final Lifeline obj) {
        return HwPLDLifeline.canInstantiate(obj) ? new HwPLDLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwPLDLifeline} proxy from a {@link Lifeline} stereotyped << HwPLD_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwPLDLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f55c75b4-33a3-4c70-9926-babf0f83a1c8")
    public static HwPLDLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwPLDLifeline.canInstantiate(obj))
        	return new HwPLDLifeline(obj);
        else
        	throw new IllegalArgumentException("HwPLDLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5e039947-be2b-47f3-9c5e-ce1e917f8843")
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
        HwPLDLifeline other = (HwPLDLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("9027a931-79cb-4a18-a20d-12844a39ea32")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwPLD_Lifeline_blocksComputing'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b7b3d1f5-2868-43c2-a527-783937cab2ec")
    public List<String> getHwPLD_Lifeline_blocksComputing() {
        return this.elt.getTagValues(HwPLDLifeline.MdaTypes.HWPLD_LIFELINE_BLOCKSCOMPUTING_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwPLD_Lifeline_blocksRAM'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d2927360-b2df-419a-a2a3-db7c47a0d492")
    public List<String> getHwPLD_Lifeline_blocksRAM() {
        return this.elt.getTagValues(HwPLDLifeline.MdaTypes.HWPLD_LIFELINE_BLOCKSRAM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Lifeline_nbFlipFlops'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b187a368-0d82-4818-aa11-b0370f5d4e87")
    public String getHwPLD_Lifeline_nbFlipFlops() {
        return this.elt.getTagValue(HwPLDLifeline.MdaTypes.HWPLD_LIFELINE_NBFLIPFLOPS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Lifeline_nbLUTs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4a1bbaea-eabb-4c8b-beaf-3ff8bcf01a48")
    public String getHwPLD_Lifeline_nbLUTs() {
        return this.elt.getTagValue(HwPLDLifeline.MdaTypes.HWPLD_LIFELINE_NBLUTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Lifeline_ndLUT_Inputs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2e566e4c-98a4-4014-9586-e99ae7ef1400")
    public String getHwPLD_Lifeline_ndLUT_Inputs() {
        return this.elt.getTagValue(HwPLDLifeline.MdaTypes.HWPLD_LIFELINE_NDLUT_INPUTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Lifeline_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cea33dd8-2ad3-4d56-bd9a-489d2aede76f")
    public String getHwPLD_Lifeline_organization() {
        return this.elt.getTagValue(HwPLDLifeline.MdaTypes.HWPLD_LIFELINE_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Lifeline_technology'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a86b9bab-482a-46ab-b909-1ac2a15c8839")
    public String getHwPLD_Lifeline_technology() {
        return this.elt.getTagValue(HwPLDLifeline.MdaTypes.HWPLD_LIFELINE_TECHNOLOGY_TAGTYPE_ELT);
    }

    @objid ("baf06e67-0004-4a61-99db-5014b9bacd30")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwPLD_Lifeline_blocksComputing'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0fc6b57c-797e-42a5-9ace-80247061a942")
    public void setHwPLD_Lifeline_blocksComputing(final List<String> values) {
        this.elt.putTagValues(HwPLDLifeline.MdaTypes.HWPLD_LIFELINE_BLOCKSCOMPUTING_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwPLD_Lifeline_blocksRAM'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6b8cea9c-32e0-41a9-b909-cc3582ba1259")
    public void setHwPLD_Lifeline_blocksRAM(final List<String> values) {
        this.elt.putTagValues(HwPLDLifeline.MdaTypes.HWPLD_LIFELINE_BLOCKSRAM_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwPLD_Lifeline_nbFlipFlops'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6ca006e8-4f2a-4711-9806-d1e1920dd7d5")
    public void setHwPLD_Lifeline_nbFlipFlops(final String value) {
        this.elt.putTagValue(HwPLDLifeline.MdaTypes.HWPLD_LIFELINE_NBFLIPFLOPS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Lifeline_nbLUTs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f36ce8e8-b091-48a7-aa65-18cf5f47c9f7")
    public void setHwPLD_Lifeline_nbLUTs(final String value) {
        this.elt.putTagValue(HwPLDLifeline.MdaTypes.HWPLD_LIFELINE_NBLUTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Lifeline_ndLUT_Inputs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1fa1e9bc-e41d-4ab7-abd1-c75405e0762c")
    public void setHwPLD_Lifeline_ndLUT_Inputs(final String value) {
        this.elt.putTagValue(HwPLDLifeline.MdaTypes.HWPLD_LIFELINE_NDLUT_INPUTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Lifeline_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a061a1e2-ec6d-4fff-90d7-96d03010f7b4")
    public void setHwPLD_Lifeline_organization(final String value) {
        this.elt.putTagValue(HwPLDLifeline.MdaTypes.HWPLD_LIFELINE_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Lifeline_technology'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1c4c5198-8d5b-430c-b28b-cc2c86eb4e22")
    public void setHwPLD_Lifeline_technology(final String value) {
        this.elt.putTagValue(HwPLDLifeline.MdaTypes.HWPLD_LIFELINE_TECHNOLOGY_TAGTYPE_ELT, value);
    }

    @objid ("c315669c-6635-42d8-b746-01645ad1107c")
    protected HwPLDLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("6ff89d0a-ce08-4016-ae99-1ec316c6ebfa")
    public static final class MdaTypes {
        @objid ("c82088f5-85d4-4688-b212-0beda19a83c7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("796be643-3e83-476a-915e-1a2f85dc0a9e")
        public static TagType HWPLD_LIFELINE_TECHNOLOGY_TAGTYPE_ELT;

        @objid ("eac06a08-8a1e-4b75-b5d2-133edf4d4491")
        public static TagType HWPLD_LIFELINE_ORGANIZATION_TAGTYPE_ELT;

        @objid ("58cbc9cb-609a-4caa-bc65-2a5e41500c4f")
        public static TagType HWPLD_LIFELINE_NBLUTS_TAGTYPE_ELT;

        @objid ("c167ded3-725b-49f7-a952-3cebd6b95e18")
        public static TagType HWPLD_LIFELINE_NDLUT_INPUTS_TAGTYPE_ELT;

        @objid ("b01c497b-7914-4d41-a5f1-620945b5b4b0")
        public static TagType HWPLD_LIFELINE_NBFLIPFLOPS_TAGTYPE_ELT;

        @objid ("92f4b64f-f95a-47f3-878e-d85ea249328b")
        public static TagType HWPLD_LIFELINE_BLOCKSRAM_TAGTYPE_ELT;

        @objid ("57b211d9-d555-413d-a62f-aac5e8f0a69a")
        public static TagType HWPLD_LIFELINE_BLOCKSCOMPUTING_TAGTYPE_ELT;

        @objid ("b88111d7-a7b0-438b-8ef1-dbb5b3a5dc5d")
        private static Stereotype MDAASSOCDEP;

        @objid ("97c4e514-8159-4b3d-8497-fa7ce8a579d7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f2a0b647-07ab-4227-8ee5-d5976cd0301f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "745a28fd-10a5-11df-81d9-0014222a9f79");
            HWPLD_LIFELINE_TECHNOLOGY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "745a28fe-10a5-11df-81d9-0014222a9f79");
            HWPLD_LIFELINE_ORGANIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "745a28ff-10a5-11df-81d9-0014222a9f79");
            HWPLD_LIFELINE_NBLUTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "745a2900-10a5-11df-81d9-0014222a9f79");
            HWPLD_LIFELINE_NDLUT_INPUTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "745a2901-10a5-11df-81d9-0014222a9f79");
            HWPLD_LIFELINE_NBFLIPFLOPS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "745a2902-10a5-11df-81d9-0014222a9f79");
            HWPLD_LIFELINE_BLOCKSRAM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "745c8b80-10a5-11df-81d9-0014222a9f79");
            HWPLD_LIFELINE_BLOCKSCOMPUTING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "745c8b81-10a5-11df-81d9-0014222a9f79");
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
