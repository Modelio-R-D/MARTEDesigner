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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.ComputingResourceParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << HwComputingResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("2b309656-c345-4cf4-b854-5b8171e2502b")
public class HwComputingResourceParameter extends ComputingResourceParameter {
    @objid ("555f8fe9-001b-4f1d-b67c-739d079084db")
    public static final String STEREOTYPE_NAME = "HwComputingResource_Parameter";

    @objid ("3729b0c5-56fa-4ae2-adce-4fe8c6dd8eed")
    public static final String HWCOMPUTINGRESOURCE_PARAMETER_DESCRIPTION_TAGTYPE = "HwComputingResource_Parameter_description";

    @objid ("4d39589c-e0ad-4b31-a6e6-bfa46ae0bef0")
    public static final String HWCOMPUTINGRESOURCE_PARAMETER_ENDPOINTS_TAGTYPE = "HwComputingResource_Parameter_endPoints";

    @objid ("68225c8c-a251-4df1-9e7b-3da5445aaa25")
    public static final String HWCOMPUTINGRESOURCE_PARAMETER_FREQUENCY_TAGTYPE = "HwComputingResource_Parameter_frequency";

    @objid ("21b0c3fa-7e8f-4094-9c84-3334b1dbf0eb")
    public static final String HWCOMPUTINGRESOURCE_PARAMETER_OP_FREQUENCIES_TAGTYPE = "HwComputingResource_Parameter_op_Frequencies";

    @objid ("4d79f6cc-e13f-49c3-bd2f-2d6bbf8f0239")
    public static final String HWCOMPUTINGRESOURCE_PARAMETER_OWNEDHW_TAGTYPE = "HwComputingResource_Parameter_ownedHW";

    @objid ("fdb09e6a-3b6f-4aa9-8850-c4d61377a210")
    public static final String HWCOMPUTINGRESOURCE_PARAMETER_P_HW_SERVICES_TAGTYPE = "HwComputingResource_Parameter_p_HW_Services";

    @objid ("01e67553-4cee-4edb-9c50-c0d47dceee8f")
    public static final String HWCOMPUTINGRESOURCE_PARAMETER_R_HW_SERVICES_TAGTYPE = "HwComputingResource_Parameter_r_HW_Services";

    /**
     * Tells whether a {@link HwComputingResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwComputingResource_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b415b607-ec42-4625-bdb5-cef5c78d7092")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwComputingResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwComputingResource_Parameter >> then instantiate a {@link HwComputingResourceParameter} proxy.
     * 
     * @return a {@link HwComputingResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("864d052d-7452-4710-a70c-133436c490e8")
    public static HwComputingResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwComputingResourceParameter.STEREOTYPE_NAME);
        return HwComputingResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwComputingResourceParameter} proxy from a {@link Parameter} stereotyped << HwComputingResource_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwComputingResourceParameter} proxy or <i>null</i>.
     */
    @objid ("3bb982d0-0a5c-4828-a519-0fc0d6b27b34")
    public static HwComputingResourceParameter instantiate(final Parameter obj) {
        return HwComputingResourceParameter.canInstantiate(obj) ? new HwComputingResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwComputingResourceParameter} proxy from a {@link Parameter} stereotyped << HwComputingResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwComputingResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b409acbf-facf-413e-9050-d8e543ff49ee")
    public static HwComputingResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwComputingResourceParameter.canInstantiate(obj))
        	return new HwComputingResourceParameter(obj);
        else
        	throw new IllegalArgumentException("HwComputingResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4e69e6f2-7e12-4b34-b309-583f8bd14f07")
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
        HwComputingResourceParameter other = (HwComputingResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("7998d3b2-af97-4428-b4ef-62aba6a8c2c4")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'HwComputingResource_Parameter_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7db525d6-c240-41c7-9c29-9347d7123733")
    public String getHwComputingResource_Parameter_description() {
        return this.elt.getTagValue(HwComputingResourceParameter.MdaTypes.HWCOMPUTINGRESOURCE_PARAMETER_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Parameter_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ad32e8cd-a34e-4e9e-bcfd-610ea81710d8")
    public List<String> getHwComputingResource_Parameter_endPoints() {
        return this.elt.getTagValues(HwComputingResourceParameter.MdaTypes.HWCOMPUTINGRESOURCE_PARAMETER_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComputingResource_Parameter_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5cbd6c16-4fc2-4f92-8fe5-b3d8cad44bd8")
    public String getHwComputingResource_Parameter_frequency() {
        return this.elt.getTagValue(HwComputingResourceParameter.MdaTypes.HWCOMPUTINGRESOURCE_PARAMETER_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComputingResource_Parameter_op_Frequencies'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e83674b5-3ef7-4b19-930b-33c6966b61c4")
    public String getHwComputingResource_Parameter_op_Frequencies() {
        return this.elt.getTagValue(HwComputingResourceParameter.MdaTypes.HWCOMPUTINGRESOURCE_PARAMETER_OP_FREQUENCIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Parameter_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6a4d2d21-ff04-41a3-aa89-6aea6bad6235")
    public List<String> getHwComputingResource_Parameter_ownedHW() {
        return this.elt.getTagValues(HwComputingResourceParameter.MdaTypes.HWCOMPUTINGRESOURCE_PARAMETER_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Parameter_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6d016f58-720d-4dc9-b172-790e5f4f7184")
    public List<String> getHwComputingResource_Parameter_p_HW_Services() {
        return this.elt.getTagValues(HwComputingResourceParameter.MdaTypes.HWCOMPUTINGRESOURCE_PARAMETER_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Parameter_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e1af360c-c9ff-4b29-bf93-ad71f6595dc0")
    public List<String> getHwComputingResource_Parameter_r_HW_Services() {
        return this.elt.getTagValues(HwComputingResourceParameter.MdaTypes.HWCOMPUTINGRESOURCE_PARAMETER_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("70d1e5d8-1a74-4ae7-aa46-2681ed4193ff")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwComputingResource_Parameter_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e516e6d3-a95b-4079-a473-634dfc148f99")
    public void setHwComputingResource_Parameter_description(final String value) {
        this.elt.putTagValue(HwComputingResourceParameter.MdaTypes.HWCOMPUTINGRESOURCE_PARAMETER_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Parameter_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1de14db9-48db-4eca-b1df-20957190e532")
    public void setHwComputingResource_Parameter_endPoints(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceParameter.MdaTypes.HWCOMPUTINGRESOURCE_PARAMETER_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComputingResource_Parameter_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5150aec4-c12c-4e07-9f92-350b3ce3c2f8")
    public void setHwComputingResource_Parameter_frequency(final String value) {
        this.elt.putTagValue(HwComputingResourceParameter.MdaTypes.HWCOMPUTINGRESOURCE_PARAMETER_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComputingResource_Parameter_op_Frequencies'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("969f00ca-04f3-479e-bc0f-a358e8663c32")
    public void setHwComputingResource_Parameter_op_Frequencies(final String value) {
        this.elt.putTagValue(HwComputingResourceParameter.MdaTypes.HWCOMPUTINGRESOURCE_PARAMETER_OP_FREQUENCIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Parameter_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ba14d8c4-1084-43b1-b4fb-cf6f24f57042")
    public void setHwComputingResource_Parameter_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceParameter.MdaTypes.HWCOMPUTINGRESOURCE_PARAMETER_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Parameter_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("272b6191-abbc-4e67-87d4-5b86fd72af63")
    public void setHwComputingResource_Parameter_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceParameter.MdaTypes.HWCOMPUTINGRESOURCE_PARAMETER_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Parameter_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8abaa458-cc71-4077-9f68-0d14a70de6ce")
    public void setHwComputingResource_Parameter_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceParameter.MdaTypes.HWCOMPUTINGRESOURCE_PARAMETER_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("4e622b35-81e5-4e61-bb9f-70c3417670b9")
    protected HwComputingResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("259cd032-5152-4c9e-96be-4446b53036d8")
    public static final class MdaTypes {
        @objid ("514cb339-2411-4851-a340-ee443c375b56")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6ed82e92-69c3-4eb3-84a8-010d826c0cbc")
        public static TagType HWCOMPUTINGRESOURCE_PARAMETER_OP_FREQUENCIES_TAGTYPE_ELT;

        @objid ("4e7aff9c-6e96-4bc7-bc96-3e204c3e7a5e")
        public static TagType HWCOMPUTINGRESOURCE_PARAMETER_DESCRIPTION_TAGTYPE_ELT;

        @objid ("4a20b13f-03bf-454d-be1e-49eff9df5caa")
        public static TagType HWCOMPUTINGRESOURCE_PARAMETER_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("cf01f50e-1bfd-4b02-8a85-41086ef1e1b1")
        public static TagType HWCOMPUTINGRESOURCE_PARAMETER_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("a87c1686-cea7-43e6-b51f-d1fb0b51e3ea")
        public static TagType HWCOMPUTINGRESOURCE_PARAMETER_OWNEDHW_TAGTYPE_ELT;

        @objid ("35ac001e-5d2c-446e-9498-8dc7e6e2a2b0")
        public static TagType HWCOMPUTINGRESOURCE_PARAMETER_FREQUENCY_TAGTYPE_ELT;

        @objid ("f968d561-34a1-4493-9758-457ca35c3d1f")
        public static TagType HWCOMPUTINGRESOURCE_PARAMETER_ENDPOINTS_TAGTYPE_ELT;

        @objid ("a4111590-751d-42a2-84a6-096527cde109")
        private static Stereotype MDAASSOCDEP;

        @objid ("a75ac3ad-6080-41d4-9947-35842cc4d811")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("897e5cd3-c70d-4bba-81a2-18098a76e906")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00d61ed0-0ccf-11df-8525-001302895b2b");
            HWCOMPUTINGRESOURCE_PARAMETER_OP_FREQUENCIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00e46cbc-0ccf-11df-8525-001302895b2b");
            HWCOMPUTINGRESOURCE_PARAMETER_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4d78fae7-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_PARAMETER_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4d78fae8-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_PARAMETER_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4d78fae9-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_PARAMETER_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4d78faea-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_PARAMETER_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4d78faeb-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_PARAMETER_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4d78faec-1623-11df-b9be-0014222a9f79");
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
