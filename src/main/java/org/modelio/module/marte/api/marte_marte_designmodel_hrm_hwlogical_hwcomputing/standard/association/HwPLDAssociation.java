/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.association;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
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
public class HwPLDAssociation extends HwComputingResourceAssociation {
    public static final String STEREOTYPE_NAME = "HwPLD_Association";

    public static final String HWPLD_ASSOCIATION_BLOCKSCOMPUTING_TAGTYPE = "HwPLD_Association_blocksComputing";

    public static final String HWPLD_ASSOCIATION_BLOCKSRAM_TAGTYPE = "HwPLD_Association_blocksRAM";

    public static final String HWPLD_ASSOCIATION_NBFLIPFLOPS_TAGTYPE = "HwPLD_Association_nbFlipFlops";

    public static final String HWPLD_ASSOCIATION_NBLUTS_TAGTYPE = "HwPLD_Association_nbLUTs";

    public static final String HWPLD_ASSOCIATION_NDLUT_INPUTS_TAGTYPE = "HwPLD_Association_ndLUT_Inputs";

    public static final String HWPLD_ASSOCIATION_ORGANIZATION_TAGTYPE = "HwPLD_Association_organization";

    public static final String HWPLD_ASSOCIATION_TECHNOLOGY_TAGTYPE = "HwPLD_Association_technology";

    /**
     * Tells whether a {@link HwPLDAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwPLD_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwPLDAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwPLD_Association >> then instantiate a {@link HwPLDAssociation} proxy.
     * 
     * @return a {@link HwPLDAssociation} proxy on the created {@link Association}.
     */
    public static HwPLDAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwPLDAssociation.STEREOTYPE_NAME);
        return HwPLDAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwPLDAssociation} proxy from a {@link Association} stereotyped << HwPLD_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwPLDAssociation} proxy or <i>null</i>.
     */
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
    public static HwPLDAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwPLDAssociation.canInstantiate(obj))
        	return new HwPLDAssociation(obj);
        else
        	throw new IllegalArgumentException("HwPLDAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwPLD_Association_blocksComputing'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwPLD_Association_blocksComputing() {
        return this.elt.getTagValues(HwPLDAssociation.MdaTypes.HWPLD_ASSOCIATION_BLOCKSCOMPUTING_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwPLD_Association_blocksRAM'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwPLD_Association_blocksRAM() {
        return this.elt.getTagValues(HwPLDAssociation.MdaTypes.HWPLD_ASSOCIATION_BLOCKSRAM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Association_nbFlipFlops'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwPLD_Association_nbFlipFlops() {
        return this.elt.getTagValue(HwPLDAssociation.MdaTypes.HWPLD_ASSOCIATION_NBFLIPFLOPS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Association_nbLUTs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwPLD_Association_nbLUTs() {
        return this.elt.getTagValue(HwPLDAssociation.MdaTypes.HWPLD_ASSOCIATION_NBLUTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Association_ndLUT_Inputs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwPLD_Association_ndLUT_Inputs() {
        return this.elt.getTagValue(HwPLDAssociation.MdaTypes.HWPLD_ASSOCIATION_NDLUT_INPUTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Association_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwPLD_Association_organization() {
        return this.elt.getTagValue(HwPLDAssociation.MdaTypes.HWPLD_ASSOCIATION_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Association_technology'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwPLD_Association_technology() {
        return this.elt.getTagValue(HwPLDAssociation.MdaTypes.HWPLD_ASSOCIATION_TECHNOLOGY_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwPLD_Association_blocksComputing'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_Association_blocksComputing(final List<String> values) {
        this.elt.putTagValues(HwPLDAssociation.MdaTypes.HWPLD_ASSOCIATION_BLOCKSCOMPUTING_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwPLD_Association_blocksRAM'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_Association_blocksRAM(final List<String> values) {
        this.elt.putTagValues(HwPLDAssociation.MdaTypes.HWPLD_ASSOCIATION_BLOCKSRAM_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwPLD_Association_nbFlipFlops'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_Association_nbFlipFlops(final String value) {
        this.elt.putTagValue(HwPLDAssociation.MdaTypes.HWPLD_ASSOCIATION_NBFLIPFLOPS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Association_nbLUTs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_Association_nbLUTs(final String value) {
        this.elt.putTagValue(HwPLDAssociation.MdaTypes.HWPLD_ASSOCIATION_NBLUTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Association_ndLUT_Inputs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_Association_ndLUT_Inputs(final String value) {
        this.elt.putTagValue(HwPLDAssociation.MdaTypes.HWPLD_ASSOCIATION_NDLUT_INPUTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Association_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_Association_organization(final String value) {
        this.elt.putTagValue(HwPLDAssociation.MdaTypes.HWPLD_ASSOCIATION_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Association_technology'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPLD_Association_technology(final String value) {
        this.elt.putTagValue(HwPLDAssociation.MdaTypes.HWPLD_ASSOCIATION_TECHNOLOGY_TAGTYPE_ELT, value);
    }

    protected HwPLDAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWPLD_ASSOCIATION_TECHNOLOGY_TAGTYPE_ELT;

        public static TagType HWPLD_ASSOCIATION_ORGANIZATION_TAGTYPE_ELT;

        public static TagType HWPLD_ASSOCIATION_NBLUTS_TAGTYPE_ELT;

        public static TagType HWPLD_ASSOCIATION_NDLUT_INPUTS_TAGTYPE_ELT;

        public static TagType HWPLD_ASSOCIATION_NBFLIPFLOPS_TAGTYPE_ELT;

        public static TagType HWPLD_ASSOCIATION_BLOCKSRAM_TAGTYPE_ELT;

        public static TagType HWPLD_ASSOCIATION_BLOCKSCOMPUTING_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
