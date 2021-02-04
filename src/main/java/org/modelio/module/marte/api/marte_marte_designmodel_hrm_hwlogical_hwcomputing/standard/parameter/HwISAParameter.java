/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.parameter;

import java.util.ArrayList;
import java.util.Collections;
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
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.parameter.HwResourceParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << HwISA_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("5888ad76-a65b-4840-99c5-b19dcb3a0e89")
public class HwISAParameter extends HwResourceParameter {
    @objid ("126b2b49-1ed8-4e98-90a1-fda09eeed36a")
    public static final String STEREOTYPE_NAME = "HwISA_Parameter";

    @objid ("2a7fec5b-fead-459a-a54b-b301d72f1719")
    public static final String HWISA_PARAMETER_FAMILY_TAGTYPE = "HwISA_Parameter_family";

    @objid ("6591ae95-34fc-4710-a70e-e9195a058492")
    public static final String HWISA_PARAMETER_INST_WIDTH_TAGTYPE = "HwISA_Parameter_inst_Width";

    @objid ("6efc8c36-b57b-481e-8a94-a6a8f8ee952d")
    public static final String HWISA_PARAMETER_TYPE_TAGTYPE = "HwISA_Parameter_type";

    /**
     * Tells whether a {@link HwISAParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwISA_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("13d3c661-7b79-4550-b774-d89e0bef377b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwISAParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwISA_Parameter >> then instantiate a {@link HwISAParameter} proxy.
     * 
     * @return a {@link HwISAParameter} proxy on the created {@link Parameter}.
     */
    @objid ("b0e3f376-efd7-40ac-854d-da163726fb3d")
    public static HwISAParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwISAParameter.STEREOTYPE_NAME);
        return HwISAParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwISAParameter} proxy from a {@link Parameter} stereotyped << HwISA_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwISAParameter} proxy or <i>null</i>.
     */
    @objid ("3171e4d0-07fe-4df2-8e42-f5789c1688ea")
    public static HwISAParameter instantiate(final Parameter obj) {
        return HwISAParameter.canInstantiate(obj) ? new HwISAParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwISAParameter} proxy from a {@link Parameter} stereotyped << HwISA_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwISAParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("cb7463f1-5969-4122-b4ca-6382f4c6c546")
    public static HwISAParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwISAParameter.canInstantiate(obj))
        	return new HwISAParameter(obj);
        else
        	throw new IllegalArgumentException("HwISAParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7afaf929-f81f-4216-a182-cc19e7fb067f")
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
        HwISAParameter other = (HwISAParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("1d0510b0-5ea9-4771-aeab-03039664348a")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'HwISA_Parameter_family'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c0c8afdf-27eb-41d0-b799-b33edd86b9f1")
    public String getHwISA_Parameter_family() {
        return this.elt.getTagValue(HwISAParameter.MdaTypes.HWISA_PARAMETER_FAMILY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwISA_Parameter_inst_Width'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4b4949d7-78e7-47da-bc60-7446251dae98")
    public String getHwISA_Parameter_inst_Width() {
        return this.elt.getTagValue(HwISAParameter.MdaTypes.HWISA_PARAMETER_INST_WIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwISA_Parameter_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bc8682c7-d5d9-4b88-860f-81402db35c13")
    public String getHwISA_Parameter_type() {
        return this.elt.getTagValue(HwISAParameter.MdaTypes.HWISA_PARAMETER_TYPE_TAGTYPE_ELT);
    }

    @objid ("9cd5aba2-bd81-4bc4-9b3c-388b310f2607")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwISA_Parameter_family'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3e239899-f695-487e-b566-5fa43b887a0d")
    public void setHwISA_Parameter_family(final String value) {
        this.elt.putTagValue(HwISAParameter.MdaTypes.HWISA_PARAMETER_FAMILY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwISA_Parameter_inst_Width'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("21ae686d-e1ef-4862-a628-8bd52286313b")
    public void setHwISA_Parameter_inst_Width(final String value) {
        this.elt.putTagValue(HwISAParameter.MdaTypes.HWISA_PARAMETER_INST_WIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwISA_Parameter_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a0621351-32d5-468a-b70b-35b6a1afd8ea")
    public void setHwISA_Parameter_type(final String value) {
        this.elt.putTagValue(HwISAParameter.MdaTypes.HWISA_PARAMETER_TYPE_TAGTYPE_ELT, value);
    }

    @objid ("f93677ff-905c-4650-b665-db7f5288c77c")
    protected HwISAParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("072de4dc-700a-40eb-bd32-06c9c1200be4")
    public static final class MdaTypes {
        @objid ("f013dccc-22f4-4f34-9976-243d60d93c46")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4856f2e4-d0f4-46cc-8773-112ecd12abba")
        public static TagType HWISA_PARAMETER_FAMILY_TAGTYPE_ELT;

        @objid ("0ef0e13c-3eb8-493d-9128-8579fde24b39")
        public static TagType HWISA_PARAMETER_INST_WIDTH_TAGTYPE_ELT;

        @objid ("53deab54-9fd9-4098-9f4a-663d31ec973c")
        public static TagType HWISA_PARAMETER_TYPE_TAGTYPE_ELT;

        @objid ("9093ccd2-4d3b-46ec-a9fb-0b80e418acba")
        private static Stereotype MDAASSOCDEP;

        @objid ("6e8ae7f0-7e9f-4b26-b3b3-a854db6ffd88")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("811554de-4cdf-453a-81c2-cd8c94a1544b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00f77f4c-0ccf-11df-8525-001302895b2b");
            HWISA_PARAMETER_FAMILY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f77f53-0ccf-11df-8525-001302895b2b");
            HWISA_PARAMETER_INST_WIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f77f5a-0ccf-11df-8525-001302895b2b");
            HWISA_PARAMETER_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f77f61-0ccf-11df-8525-001302895b2b");
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
