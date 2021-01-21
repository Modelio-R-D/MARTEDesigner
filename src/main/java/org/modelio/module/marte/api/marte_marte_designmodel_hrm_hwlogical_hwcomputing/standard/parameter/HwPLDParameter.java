/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.parameter;

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
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << HwPLD_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("47424802-055e-4d67-8538-b1c582b2fa9e")
public class HwPLDParameter extends HwComputingResourceParameter {
    @objid ("83680bdb-d209-4c41-a83d-1396347aced5")
    public static final String STEREOTYPE_NAME = "HwPLD_Parameter";

    @objid ("97981cb3-e2a2-4ef8-8b8d-4affb6bfc639")
    public static final String HWPLD_PARAMETER_BLOCKSCOMPUTING_TAGTYPE = "HwPLD_Parameter_blocksComputing";

    @objid ("1fb73c41-c0c7-4345-9f58-a4f9cf0d7a69")
    public static final String HWPLD_PARAMETER_BLOCKSRAM_TAGTYPE = "HwPLD_Parameter_blocksRAM";

    @objid ("6a7b84f4-f390-489f-b21a-2dfc33f64ead")
    public static final String HWPLD_PARAMETER_NBFLIPFLOPS_TAGTYPE = "HwPLD_Parameter_nbFlipFlops";

    @objid ("c62065a1-b459-4ac8-bee3-49f0871ef09e")
    public static final String HWPLD_PARAMETER_NBLUTS_TAGTYPE = "HwPLD_Parameter_nbLUTs";

    @objid ("92a46f13-c945-44e5-b057-837ec55a5837")
    public static final String HWPLD_PARAMETER_NDLUT_INPUTS_TAGTYPE = "HwPLD_Parameter_ndLUT_Inputs";

    @objid ("54885b9b-fc1a-4767-b89f-d5e2b4835586")
    public static final String HWPLD_PARAMETER_ORGANIZATION_TAGTYPE = "HwPLD_Parameter_organization";

    @objid ("d2ac95f3-940c-49b8-a397-e010ed3edc32")
    public static final String HWPLD_PARAMETER_TECHNOLOGY_TAGTYPE = "HwPLD_Parameter_technology";

    /**
     * Tells whether a {@link HwPLDParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwPLD_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("9a0fc8bb-4a53-446d-8e5d-bdd04a4872c2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwPLDParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwPLD_Parameter >> then instantiate a {@link HwPLDParameter} proxy.
     * 
     * @return a {@link HwPLDParameter} proxy on the created {@link Parameter}.
     */
    @objid ("682d7257-527c-4c81-bc95-dfb5dd74dd6b")
    public static HwPLDParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwPLDParameter.STEREOTYPE_NAME);
        return HwPLDParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwPLDParameter} proxy from a {@link Parameter} stereotyped << HwPLD_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwPLDParameter} proxy or <i>null</i>.
     */
    @objid ("0ee5ba91-0bf4-41b7-8a05-56059ecbe57d")
    public static HwPLDParameter instantiate(final Parameter obj) {
        return HwPLDParameter.canInstantiate(obj) ? new HwPLDParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwPLDParameter} proxy from a {@link Parameter} stereotyped << HwPLD_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwPLDParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("40bc7fb5-add7-4926-9ee7-836e8ec7182d")
    public static HwPLDParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwPLDParameter.canInstantiate(obj))
        	return new HwPLDParameter(obj);
        else
        	throw new IllegalArgumentException("HwPLDParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("99823d4c-f90a-4291-9aeb-71728a2fe9ee")
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
        HwPLDParameter other = (HwPLDParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("0191270c-858a-4acc-ad59-72379791644c")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwPLD_Parameter_blocksComputing'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4a82c01a-546c-4f0a-b997-2a480702ce7b")
    public List<String> getHwPLD_Parameter_blocksComputing() {
        return this.elt.getTagValues(HwPLDParameter.MdaTypes.HWPLD_PARAMETER_BLOCKSCOMPUTING_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwPLD_Parameter_blocksRAM'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("68bf7945-cd53-475c-9ffa-8017274af873")
    public List<String> getHwPLD_Parameter_blocksRAM() {
        return this.elt.getTagValues(HwPLDParameter.MdaTypes.HWPLD_PARAMETER_BLOCKSRAM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Parameter_nbFlipFlops'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1b84354c-8065-4e7f-925f-cd36e61f3b5c")
    public String getHwPLD_Parameter_nbFlipFlops() {
        return this.elt.getTagValue(HwPLDParameter.MdaTypes.HWPLD_PARAMETER_NBFLIPFLOPS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Parameter_nbLUTs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6d508d98-51c0-440a-8de4-2476d083ec45")
    public String getHwPLD_Parameter_nbLUTs() {
        return this.elt.getTagValue(HwPLDParameter.MdaTypes.HWPLD_PARAMETER_NBLUTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Parameter_ndLUT_Inputs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ea403a0f-5afc-48eb-9763-51cd8c4b83ee")
    public String getHwPLD_Parameter_ndLUT_Inputs() {
        return this.elt.getTagValue(HwPLDParameter.MdaTypes.HWPLD_PARAMETER_NDLUT_INPUTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Parameter_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c4f0dfa9-2945-4496-b79e-f6491bcd590a")
    public String getHwPLD_Parameter_organization() {
        return this.elt.getTagValue(HwPLDParameter.MdaTypes.HWPLD_PARAMETER_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Parameter_technology'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("abd0b59d-9210-4695-b69e-67b5c354c66a")
    public String getHwPLD_Parameter_technology() {
        return this.elt.getTagValue(HwPLDParameter.MdaTypes.HWPLD_PARAMETER_TECHNOLOGY_TAGTYPE_ELT);
    }

    @objid ("4552672d-c5ed-482c-b005-7f716313f098")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwPLD_Parameter_blocksComputing'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6cbbafe2-bd7f-483f-b5c4-2ce6bdf1f276")
    public void setHwPLD_Parameter_blocksComputing(final List<String> values) {
        this.elt.putTagValues(HwPLDParameter.MdaTypes.HWPLD_PARAMETER_BLOCKSCOMPUTING_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwPLD_Parameter_blocksRAM'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d4f0eed7-b164-44fa-9edf-78284498c104")
    public void setHwPLD_Parameter_blocksRAM(final List<String> values) {
        this.elt.putTagValues(HwPLDParameter.MdaTypes.HWPLD_PARAMETER_BLOCKSRAM_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwPLD_Parameter_nbFlipFlops'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7d8c5a7f-466e-45f8-a1e7-7b9bfeebddf3")
    public void setHwPLD_Parameter_nbFlipFlops(final String value) {
        this.elt.putTagValue(HwPLDParameter.MdaTypes.HWPLD_PARAMETER_NBFLIPFLOPS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Parameter_nbLUTs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("84f96874-0b5a-4a26-9cf5-4f9a1bb6f8a9")
    public void setHwPLD_Parameter_nbLUTs(final String value) {
        this.elt.putTagValue(HwPLDParameter.MdaTypes.HWPLD_PARAMETER_NBLUTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Parameter_ndLUT_Inputs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("70dad9f4-4649-447e-ac51-a9b35cbe784d")
    public void setHwPLD_Parameter_ndLUT_Inputs(final String value) {
        this.elt.putTagValue(HwPLDParameter.MdaTypes.HWPLD_PARAMETER_NDLUT_INPUTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Parameter_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("59d1be63-09fb-4c97-8dea-a35b58e4bcf5")
    public void setHwPLD_Parameter_organization(final String value) {
        this.elt.putTagValue(HwPLDParameter.MdaTypes.HWPLD_PARAMETER_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Parameter_technology'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b78fdd23-9276-4cf5-880c-dd3681e440fe")
    public void setHwPLD_Parameter_technology(final String value) {
        this.elt.putTagValue(HwPLDParameter.MdaTypes.HWPLD_PARAMETER_TECHNOLOGY_TAGTYPE_ELT, value);
    }

    @objid ("f0a25616-ba23-480c-acf3-b4ad0967343c")
    protected HwPLDParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("b2ba4879-653d-49fe-aec1-06125d5f2536")
    public static final class MdaTypes {
        @objid ("ad3593de-7640-45e7-ac03-0bffec4eaccf")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("96c3f345-1e65-4c5c-b843-92edc76e2eb2")
        public static TagType HWPLD_PARAMETER_TECHNOLOGY_TAGTYPE_ELT;

        @objid ("5056b731-0d79-4ce6-8307-5fa72c297995")
        public static TagType HWPLD_PARAMETER_ORGANIZATION_TAGTYPE_ELT;

        @objid ("3e353a36-3066-4e77-a0c0-e1662ac6554e")
        public static TagType HWPLD_PARAMETER_NBLUTS_TAGTYPE_ELT;

        @objid ("ba1f46ad-02e7-4884-8df6-c1ef8345e7eb")
        public static TagType HWPLD_PARAMETER_NDLUT_INPUTS_TAGTYPE_ELT;

        @objid ("8938b30f-f967-434e-b048-3c54b439a496")
        public static TagType HWPLD_PARAMETER_NBFLIPFLOPS_TAGTYPE_ELT;

        @objid ("be30b414-653d-48f9-9b6e-11ffde2a7d06")
        public static TagType HWPLD_PARAMETER_BLOCKSRAM_TAGTYPE_ELT;

        @objid ("541259b8-3e8d-4765-83a2-63ffc1d0faae")
        public static TagType HWPLD_PARAMETER_BLOCKSCOMPUTING_TAGTYPE_ELT;

        @objid ("f62d7e45-f516-43e4-8942-967968b7552b")
        private static Stereotype MDAASSOCDEP;

        @objid ("7a52af17-fbdc-416c-9653-ab858956fc9d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d1a1500b-58c6-47a8-9973-6eb8d2bf7934")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00eb93b2-0ccf-11df-8525-001302895b2b");
            HWPLD_PARAMETER_TECHNOLOGY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2baae-0ccf-11df-8525-001302895b2b");
            HWPLD_PARAMETER_ORGANIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2bab5-0ccf-11df-8525-001302895b2b");
            HWPLD_PARAMETER_NBLUTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2babc-0ccf-11df-8525-001302895b2b");
            HWPLD_PARAMETER_NDLUT_INPUTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2bac3-0ccf-11df-8525-001302895b2b");
            HWPLD_PARAMETER_NBFLIPFLOPS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2baca-0ccf-11df-8525-001302895b2b");
            HWPLD_PARAMETER_BLOCKSRAM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2bad1-0ccf-11df-8525-001302895b2b");
            HWPLD_PARAMETER_BLOCKSCOMPUTING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f2bad8-0ccf-11df-8525-001302895b2b");
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
