/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwPLD_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d2140cef-7e83-4c93-a9fa-042356d38db2")
public class HwPLDAssociation extends HwComputingResourceAssociation {
    @objid ("a45e999b-8954-4f03-9ec5-fcd9bbe91adb")
    public static final String STEREOTYPE_NAME = "HwPLD_Association";

    @objid ("ef8d1086-0656-4120-b458-715280feb1f6")
    public static final String HWPLD_ASSOCIATION_BLOCKSCOMPUTING_TAGTYPE = "HwPLD_Association_blocksComputing";

    @objid ("a62cd28c-f791-4173-b0fb-390f038b42e3")
    public static final String HWPLD_ASSOCIATION_BLOCKSRAM_TAGTYPE = "HwPLD_Association_blocksRAM";

    @objid ("6a1475a2-c311-4476-89a2-3e2e33636b49")
    public static final String HWPLD_ASSOCIATION_NBFLIPFLOPS_TAGTYPE = "HwPLD_Association_nbFlipFlops";

    @objid ("e98e2f6d-3871-492d-ace5-0078c8f4fdd6")
    public static final String HWPLD_ASSOCIATION_NBLUTS_TAGTYPE = "HwPLD_Association_nbLUTs";

    @objid ("0f15b8af-30ec-42b8-8160-42ce41e29ed7")
    public static final String HWPLD_ASSOCIATION_NDLUT_INPUTS_TAGTYPE = "HwPLD_Association_ndLUT_Inputs";

    @objid ("e00c7ed4-07be-465f-a4d8-5868300c47a7")
    public static final String HWPLD_ASSOCIATION_ORGANIZATION_TAGTYPE = "HwPLD_Association_organization";

    @objid ("49de185f-ba33-4ca2-88f3-d123b6d1d7c3")
    public static final String HWPLD_ASSOCIATION_TECHNOLOGY_TAGTYPE = "HwPLD_Association_technology";

    /**
     * Tells whether a {@link HwPLDAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwPLD_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("dfc662e5-5da4-4460-9b41-7893cdde276d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwPLDAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwPLD_Association >> then instantiate a {@link HwPLDAssociation} proxy.
     * 
     * @return a {@link HwPLDAssociation} proxy on the created {@link Association}.
     */
    @objid ("d5b26e48-d217-43b4-804e-cfee36c55250")
    public static HwPLDAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwPLDAssociation.STEREOTYPE_NAME);
        return HwPLDAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwPLDAssociation} proxy from a {@link Association} stereotyped << HwPLD_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwPLDAssociation} proxy or <i>null</i>.
     */
    @objid ("da517e49-1fd9-4400-ae54-51717ee6f3f6")
    public static HwPLDAssociation instantiate(final Association obj) {
        return HwPLDAssociation.canInstantiate(obj) ? new HwPLDAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwPLDAssociation} proxy from a {@link Association} stereotyped << HwPLD_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwPLDAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0bc65a99-aa31-4a76-817a-04099fc15151")
    public static HwPLDAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwPLDAssociation.canInstantiate(obj))
        	return new HwPLDAssociation(obj);
        else
        	throw new IllegalArgumentException("HwPLDAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d38ac6bc-985d-4b28-a88e-ef1e1990f0bc")
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
        HwPLDAssociation other = (HwPLDAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("84e08a3e-7596-4da9-9bd6-1fcafd445888")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwPLD_Association_blocksComputing'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b10a513a-67eb-42d1-aae4-f7b047b92f4c")
    public List<String> getHwPLD_Association_blocksComputing() {
        return this.elt.getTagValues(HwPLDAssociation.MdaTypes.HWPLD_ASSOCIATION_BLOCKSCOMPUTING_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwPLD_Association_blocksRAM'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("dbe663c9-3bd4-482c-86b0-b15b63e1bd21")
    public List<String> getHwPLD_Association_blocksRAM() {
        return this.elt.getTagValues(HwPLDAssociation.MdaTypes.HWPLD_ASSOCIATION_BLOCKSRAM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Association_nbFlipFlops'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4e3be729-dea8-4692-99dd-930e1601628b")
    public String getHwPLD_Association_nbFlipFlops() {
        return this.elt.getTagValue(HwPLDAssociation.MdaTypes.HWPLD_ASSOCIATION_NBFLIPFLOPS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Association_nbLUTs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("82595657-4c3a-44ad-bf3f-8bed04a92095")
    public String getHwPLD_Association_nbLUTs() {
        return this.elt.getTagValue(HwPLDAssociation.MdaTypes.HWPLD_ASSOCIATION_NBLUTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Association_ndLUT_Inputs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ba811e23-ce8b-41f0-9736-3a9d4f86a5b4")
    public String getHwPLD_Association_ndLUT_Inputs() {
        return this.elt.getTagValue(HwPLDAssociation.MdaTypes.HWPLD_ASSOCIATION_NDLUT_INPUTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Association_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0b370b75-3697-4dfc-90aa-2f17d44381c9")
    public String getHwPLD_Association_organization() {
        return this.elt.getTagValue(HwPLDAssociation.MdaTypes.HWPLD_ASSOCIATION_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Association_technology'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("79e84b02-51e5-40ea-951f-e8a2f69c7760")
    public String getHwPLD_Association_technology() {
        return this.elt.getTagValue(HwPLDAssociation.MdaTypes.HWPLD_ASSOCIATION_TECHNOLOGY_TAGTYPE_ELT);
    }

    @objid ("66e5e574-267e-448f-a718-56ce30ee36a1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwPLD_Association_blocksComputing'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0c69e39d-6e31-4b2d-834c-dbb32a5a0e26")
    public void setHwPLD_Association_blocksComputing(final List<String> values) {
        this.elt.putTagValues(HwPLDAssociation.MdaTypes.HWPLD_ASSOCIATION_BLOCKSCOMPUTING_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwPLD_Association_blocksRAM'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("05d2551a-40ac-4256-a4e9-8dfd95f97923")
    public void setHwPLD_Association_blocksRAM(final List<String> values) {
        this.elt.putTagValues(HwPLDAssociation.MdaTypes.HWPLD_ASSOCIATION_BLOCKSRAM_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwPLD_Association_nbFlipFlops'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("529f0655-3168-48a5-a7ed-b890548522db")
    public void setHwPLD_Association_nbFlipFlops(final String value) {
        this.elt.putTagValue(HwPLDAssociation.MdaTypes.HWPLD_ASSOCIATION_NBFLIPFLOPS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Association_nbLUTs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fe3f14cd-5348-414c-b127-d7426a56d244")
    public void setHwPLD_Association_nbLUTs(final String value) {
        this.elt.putTagValue(HwPLDAssociation.MdaTypes.HWPLD_ASSOCIATION_NBLUTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Association_ndLUT_Inputs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("588ed31c-b21a-4638-8dec-2a698e92ee6b")
    public void setHwPLD_Association_ndLUT_Inputs(final String value) {
        this.elt.putTagValue(HwPLDAssociation.MdaTypes.HWPLD_ASSOCIATION_NDLUT_INPUTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Association_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a0429863-c949-45a9-9ec4-105594f0bb46")
    public void setHwPLD_Association_organization(final String value) {
        this.elt.putTagValue(HwPLDAssociation.MdaTypes.HWPLD_ASSOCIATION_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Association_technology'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8b1d3f00-5bf7-439c-befb-8a6453da4d76")
    public void setHwPLD_Association_technology(final String value) {
        this.elt.putTagValue(HwPLDAssociation.MdaTypes.HWPLD_ASSOCIATION_TECHNOLOGY_TAGTYPE_ELT, value);
    }

    @objid ("a4a57bd7-95b5-4a03-8031-566fc41e6002")
    protected HwPLDAssociation(final Association elt) {
        super(elt);
    }

    @objid ("9e9b9655-5eed-4260-b3b7-9d4a39969f2b")
    public static final class MdaTypes {
        @objid ("ca3bebf1-9ea5-4c1e-95e3-1e3be6b6199a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("84b6a9bc-8567-479d-9dbf-c89ddc7c789d")
        public static TagType HWPLD_ASSOCIATION_TECHNOLOGY_TAGTYPE_ELT;

        @objid ("e816639a-71b2-4ee0-856e-6adb4330947b")
        public static TagType HWPLD_ASSOCIATION_ORGANIZATION_TAGTYPE_ELT;

        @objid ("f778f3fe-72dc-4baa-beae-38df99580907")
        public static TagType HWPLD_ASSOCIATION_NBLUTS_TAGTYPE_ELT;

        @objid ("dda90211-c93d-4d06-9762-0ec91929543e")
        public static TagType HWPLD_ASSOCIATION_NDLUT_INPUTS_TAGTYPE_ELT;

        @objid ("d82a6b21-7ac9-4494-aee2-56876b37ad50")
        public static TagType HWPLD_ASSOCIATION_NBFLIPFLOPS_TAGTYPE_ELT;

        @objid ("54d49d8f-9c4a-4508-8fe8-07ec0308723f")
        public static TagType HWPLD_ASSOCIATION_BLOCKSRAM_TAGTYPE_ELT;

        @objid ("b31b269a-5cd4-4df5-a41c-85008b154da8")
        public static TagType HWPLD_ASSOCIATION_BLOCKSCOMPUTING_TAGTYPE_ELT;

        @objid ("7976f898-e1df-4ef3-a914-213158449bef")
        private static Stereotype MDAASSOCDEP;

        @objid ("933e9b18-8a61-46d3-91d2-b17c855862a1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("23cc06ed-7f50-481f-8ee3-9aa006341aa6")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "74234f38-10a5-11df-81d9-0014222a9f79");
            HWPLD_ASSOCIATION_TECHNOLOGY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "74234f39-10a5-11df-81d9-0014222a9f79");
            HWPLD_ASSOCIATION_ORGANIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "74234f3a-10a5-11df-81d9-0014222a9f79");
            HWPLD_ASSOCIATION_NBLUTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "74234f3b-10a5-11df-81d9-0014222a9f79");
            HWPLD_ASSOCIATION_NDLUT_INPUTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "74234f3c-10a5-11df-81d9-0014222a9f79");
            HWPLD_ASSOCIATION_NBFLIPFLOPS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "74234f3d-10a5-11df-81d9-0014222a9f79");
            HWPLD_ASSOCIATION_BLOCKSRAM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "74234f3e-10a5-11df-81d9-0014222a9f79");
            HWPLD_ASSOCIATION_BLOCKSCOMPUTING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "74234f3f-10a5-11df-81d9-0014222a9f79");
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
