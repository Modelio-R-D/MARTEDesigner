/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("46f31c00-7663-4207-936e-34fde13b58c9")
    public static final String STEREOTYPE_NAME = "HwPLD_Lifeline";

    @objid ("2f66baea-9f4b-4d57-9c6c-20ee64d27679")
    public static final String HWPLD_LIFELINE_BLOCKSCOMPUTING_TAGTYPE = "HwPLD_Lifeline_blocksComputing";

    @objid ("fd01221b-96e3-4678-a156-84e4cad37bdd")
    public static final String HWPLD_LIFELINE_BLOCKSRAM_TAGTYPE = "HwPLD_Lifeline_blocksRAM";

    @objid ("98582809-a6e0-4fbd-b43e-969ac5a0e957")
    public static final String HWPLD_LIFELINE_NBFLIPFLOPS_TAGTYPE = "HwPLD_Lifeline_nbFlipFlops";

    @objid ("c02f0081-d2c2-4945-940f-e035bab52656")
    public static final String HWPLD_LIFELINE_NBLUTS_TAGTYPE = "HwPLD_Lifeline_nbLUTs";

    @objid ("7afd62d3-c979-4494-b141-6543158b8553")
    public static final String HWPLD_LIFELINE_NDLUT_INPUTS_TAGTYPE = "HwPLD_Lifeline_ndLUT_Inputs";

    @objid ("c411416e-e9dd-4831-91a8-66b73aa2ef8e")
    public static final String HWPLD_LIFELINE_ORGANIZATION_TAGTYPE = "HwPLD_Lifeline_organization";

    @objid ("c4cdeb7e-c5a1-4572-9c80-3f49f837b8fa")
    public static final String HWPLD_LIFELINE_TECHNOLOGY_TAGTYPE = "HwPLD_Lifeline_technology";

    /**
     * Tells whether a {@link HwPLDLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwPLD_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c211a1de-5e43-455d-8351-f4214f175ab6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwPLDLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwPLD_Lifeline >> then instantiate a {@link HwPLDLifeline} proxy.
     * 
     * @return a {@link HwPLDLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("55f0cf62-e294-42fa-8abd-a59cc3da7d9b")
    public static HwPLDLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwPLDLifeline.STEREOTYPE_NAME);
        return HwPLDLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwPLDLifeline} proxy from a {@link Lifeline} stereotyped << HwPLD_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwPLDLifeline} proxy or <i>null</i>.
     */
    @objid ("959499a9-302a-48ba-9519-9a220c187705")
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
    @objid ("e5d541e1-7ca6-4dfa-8298-dc8fda19de20")
    public static HwPLDLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwPLDLifeline.canInstantiate(obj))
        	return new HwPLDLifeline(obj);
        else
        	throw new IllegalArgumentException("HwPLDLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("231e7091-307d-49b0-9367-a20999c17755")
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
    @objid ("7431aa81-503b-497d-bcf3-481ac2e84b5d")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwPLD_Lifeline_blocksComputing'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d77cd31e-49fd-4e7c-a691-3d9a301eef13")
    public List<String> getHwPLD_Lifeline_blocksComputing() {
        return this.elt.getTagValues(HwPLDLifeline.MdaTypes.HWPLD_LIFELINE_BLOCKSCOMPUTING_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwPLD_Lifeline_blocksRAM'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1c618338-9c67-410e-9460-ccb879507a61")
    public List<String> getHwPLD_Lifeline_blocksRAM() {
        return this.elt.getTagValues(HwPLDLifeline.MdaTypes.HWPLD_LIFELINE_BLOCKSRAM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Lifeline_nbFlipFlops'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("13e6b9f4-f164-454c-89f6-5d4582cb4cf1")
    public String getHwPLD_Lifeline_nbFlipFlops() {
        return this.elt.getTagValue(HwPLDLifeline.MdaTypes.HWPLD_LIFELINE_NBFLIPFLOPS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Lifeline_nbLUTs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f73eb937-4eb7-4c55-9193-897a248b092e")
    public String getHwPLD_Lifeline_nbLUTs() {
        return this.elt.getTagValue(HwPLDLifeline.MdaTypes.HWPLD_LIFELINE_NBLUTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Lifeline_ndLUT_Inputs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c72f60b8-ec70-42d7-890b-39f3b7bea456")
    public String getHwPLD_Lifeline_ndLUT_Inputs() {
        return this.elt.getTagValue(HwPLDLifeline.MdaTypes.HWPLD_LIFELINE_NDLUT_INPUTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Lifeline_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("861024bc-2974-47d2-beff-8337e9fef519")
    public String getHwPLD_Lifeline_organization() {
        return this.elt.getTagValue(HwPLDLifeline.MdaTypes.HWPLD_LIFELINE_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Lifeline_technology'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("22aa0039-ebba-49ac-a9f7-0a1023c003b1")
    public String getHwPLD_Lifeline_technology() {
        return this.elt.getTagValue(HwPLDLifeline.MdaTypes.HWPLD_LIFELINE_TECHNOLOGY_TAGTYPE_ELT);
    }

    @objid ("48183698-b744-4da1-bcc3-4d4242810f79")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwPLD_Lifeline_blocksComputing'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1696be20-2e08-4770-b628-9fe20704c44c")
    public void setHwPLD_Lifeline_blocksComputing(final List<String> values) {
        this.elt.putTagValues(HwPLDLifeline.MdaTypes.HWPLD_LIFELINE_BLOCKSCOMPUTING_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwPLD_Lifeline_blocksRAM'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e504c6e9-6ef2-4036-842c-4b143112a3c7")
    public void setHwPLD_Lifeline_blocksRAM(final List<String> values) {
        this.elt.putTagValues(HwPLDLifeline.MdaTypes.HWPLD_LIFELINE_BLOCKSRAM_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwPLD_Lifeline_nbFlipFlops'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e991ae2d-d00b-4149-9a08-46a6e4719175")
    public void setHwPLD_Lifeline_nbFlipFlops(final String value) {
        this.elt.putTagValue(HwPLDLifeline.MdaTypes.HWPLD_LIFELINE_NBFLIPFLOPS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Lifeline_nbLUTs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2d36fe8e-10ca-4c40-bf6e-7281f6ed4cd7")
    public void setHwPLD_Lifeline_nbLUTs(final String value) {
        this.elt.putTagValue(HwPLDLifeline.MdaTypes.HWPLD_LIFELINE_NBLUTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Lifeline_ndLUT_Inputs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("af3a94fc-a258-44d5-959c-435c2eb08cda")
    public void setHwPLD_Lifeline_ndLUT_Inputs(final String value) {
        this.elt.putTagValue(HwPLDLifeline.MdaTypes.HWPLD_LIFELINE_NDLUT_INPUTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Lifeline_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("27fcaad4-3c02-426b-b904-c2d910902d3c")
    public void setHwPLD_Lifeline_organization(final String value) {
        this.elt.putTagValue(HwPLDLifeline.MdaTypes.HWPLD_LIFELINE_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Lifeline_technology'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("88e83b4d-72cf-4b2b-868e-8de497ca6b5d")
    public void setHwPLD_Lifeline_technology(final String value) {
        this.elt.putTagValue(HwPLDLifeline.MdaTypes.HWPLD_LIFELINE_TECHNOLOGY_TAGTYPE_ELT, value);
    }

    @objid ("e7ef6835-bad4-42de-a7d5-650af6f59420")
    protected HwPLDLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("6ff89d0a-ce08-4016-ae99-1ec316c6ebfa")
    public static final class MdaTypes {
        @objid ("e6abc6c2-73de-43f2-a733-728aadc5f65d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b9f3bbbe-1a37-4999-a61b-db6371b1a52b")
        public static TagType HWPLD_LIFELINE_TECHNOLOGY_TAGTYPE_ELT;

        @objid ("5f99d068-dd6a-43e4-a5c0-d8ceb6d3a3d3")
        public static TagType HWPLD_LIFELINE_ORGANIZATION_TAGTYPE_ELT;

        @objid ("c3da26fd-8566-4875-9bbf-d6f34c4e91c4")
        public static TagType HWPLD_LIFELINE_NBLUTS_TAGTYPE_ELT;

        @objid ("fd0ea2f7-4508-4ba6-8d51-e4f2c7e51d71")
        public static TagType HWPLD_LIFELINE_NDLUT_INPUTS_TAGTYPE_ELT;

        @objid ("fa6768c9-e64c-4cf5-9fc7-290e2dfc1d0a")
        public static TagType HWPLD_LIFELINE_NBFLIPFLOPS_TAGTYPE_ELT;

        @objid ("a06ec720-53da-41c8-b389-613ec6880b14")
        public static TagType HWPLD_LIFELINE_BLOCKSRAM_TAGTYPE_ELT;

        @objid ("3d851a5f-5627-40da-8a45-499d06ed294a")
        public static TagType HWPLD_LIFELINE_BLOCKSCOMPUTING_TAGTYPE_ELT;

        @objid ("dd05313c-2fa6-483f-a7eb-676f3b0352bc")
        private static Stereotype MDAASSOCDEP;

        @objid ("214aa41c-621a-4233-835d-f48091e375eb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1e4ebc13-8345-463f-91f3-845c06149553")
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
