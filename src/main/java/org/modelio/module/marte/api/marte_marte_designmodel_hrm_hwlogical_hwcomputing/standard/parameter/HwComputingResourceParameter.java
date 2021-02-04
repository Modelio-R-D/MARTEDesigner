/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("3ecd7e76-dc9f-40df-9791-07f1ffc9528a")
    public static final String STEREOTYPE_NAME = "HwComputingResource_Parameter";

    @objid ("cd12b095-ec78-4ff8-9763-c52c5eb19461")
    public static final String HWCOMPUTINGRESOURCE_PARAMETER_DESCRIPTION_TAGTYPE = "HwComputingResource_Parameter_description";

    @objid ("6c0aa87a-9964-41fe-9faa-b2407c2db2d9")
    public static final String HWCOMPUTINGRESOURCE_PARAMETER_ENDPOINTS_TAGTYPE = "HwComputingResource_Parameter_endPoints";

    @objid ("cb94044e-d541-4aaa-80f0-291161d17b58")
    public static final String HWCOMPUTINGRESOURCE_PARAMETER_FREQUENCY_TAGTYPE = "HwComputingResource_Parameter_frequency";

    @objid ("2bbeda2c-2793-49be-89ef-f5cde264b4d8")
    public static final String HWCOMPUTINGRESOURCE_PARAMETER_OP_FREQUENCIES_TAGTYPE = "HwComputingResource_Parameter_op_Frequencies";

    @objid ("5764ec95-be82-4cf2-9be5-b2a56ccea2b9")
    public static final String HWCOMPUTINGRESOURCE_PARAMETER_OWNEDHW_TAGTYPE = "HwComputingResource_Parameter_ownedHW";

    @objid ("58fd7452-ca5e-45bb-83b3-f054ff72bb24")
    public static final String HWCOMPUTINGRESOURCE_PARAMETER_P_HW_SERVICES_TAGTYPE = "HwComputingResource_Parameter_p_HW_Services";

    @objid ("e8c2b4fa-03c8-4102-9567-5506f8d3ac31")
    public static final String HWCOMPUTINGRESOURCE_PARAMETER_R_HW_SERVICES_TAGTYPE = "HwComputingResource_Parameter_r_HW_Services";

    /**
     * Tells whether a {@link HwComputingResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwComputingResource_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("98d01cf6-347c-4614-89ea-0983e1753f09")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwComputingResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwComputingResource_Parameter >> then instantiate a {@link HwComputingResourceParameter} proxy.
     * 
     * @return a {@link HwComputingResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("408984bf-aa29-4d19-b83a-f52c005d271c")
    public static HwComputingResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwComputingResourceParameter.STEREOTYPE_NAME);
        return HwComputingResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwComputingResourceParameter} proxy from a {@link Parameter} stereotyped << HwComputingResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwComputingResourceParameter} proxy or <i>null</i>.
     */
    @objid ("0f8097c1-de07-487f-9b96-97df890ab500")
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
    @objid ("23808b22-7404-4c84-b862-690711db7375")
    public static HwComputingResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwComputingResourceParameter.canInstantiate(obj))
        	return new HwComputingResourceParameter(obj);
        else
        	throw new IllegalArgumentException("HwComputingResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("40683992-4d48-4551-9944-0d9ae5ade919")
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
    @objid ("754508d3-c2f5-4584-8729-95275dca8891")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'HwComputingResource_Parameter_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("412daa64-eea5-4f5e-ba97-c0a4df1e02d0")
    public String getHwComputingResource_Parameter_description() {
        return this.elt.getTagValue(HwComputingResourceParameter.MdaTypes.HWCOMPUTINGRESOURCE_PARAMETER_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Parameter_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c59c4629-d581-4275-9184-cdd98e185cc6")
    public List<String> getHwComputingResource_Parameter_endPoints() {
        return this.elt.getTagValues(HwComputingResourceParameter.MdaTypes.HWCOMPUTINGRESOURCE_PARAMETER_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComputingResource_Parameter_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2875e7bd-d0d5-4c06-82da-96175a256f61")
    public String getHwComputingResource_Parameter_frequency() {
        return this.elt.getTagValue(HwComputingResourceParameter.MdaTypes.HWCOMPUTINGRESOURCE_PARAMETER_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComputingResource_Parameter_op_Frequencies'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("75501fd8-5244-47a6-9efe-803c365a495a")
    public String getHwComputingResource_Parameter_op_Frequencies() {
        return this.elt.getTagValue(HwComputingResourceParameter.MdaTypes.HWCOMPUTINGRESOURCE_PARAMETER_OP_FREQUENCIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Parameter_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5206d82a-1005-4c4c-bd81-ecdc8c8ebac4")
    public List<String> getHwComputingResource_Parameter_ownedHW() {
        return this.elt.getTagValues(HwComputingResourceParameter.MdaTypes.HWCOMPUTINGRESOURCE_PARAMETER_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Parameter_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("cf41390a-918b-4645-b1af-488826b9979c")
    public List<String> getHwComputingResource_Parameter_p_HW_Services() {
        return this.elt.getTagValues(HwComputingResourceParameter.MdaTypes.HWCOMPUTINGRESOURCE_PARAMETER_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Parameter_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b210c563-4192-4e3a-8a51-ff8b87f70d9c")
    public List<String> getHwComputingResource_Parameter_r_HW_Services() {
        return this.elt.getTagValues(HwComputingResourceParameter.MdaTypes.HWCOMPUTINGRESOURCE_PARAMETER_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("ad820d67-63a0-4989-ab44-efc4a58bd330")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwComputingResource_Parameter_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("139ba457-23e3-417c-9f1b-ca750abef5a0")
    public void setHwComputingResource_Parameter_description(final String value) {
        this.elt.putTagValue(HwComputingResourceParameter.MdaTypes.HWCOMPUTINGRESOURCE_PARAMETER_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Parameter_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("019aa413-f827-4f1d-a90b-9e8e271a31d8")
    public void setHwComputingResource_Parameter_endPoints(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceParameter.MdaTypes.HWCOMPUTINGRESOURCE_PARAMETER_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComputingResource_Parameter_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("79395b2e-5ba9-4fe6-9450-287bd9a78c28")
    public void setHwComputingResource_Parameter_frequency(final String value) {
        this.elt.putTagValue(HwComputingResourceParameter.MdaTypes.HWCOMPUTINGRESOURCE_PARAMETER_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComputingResource_Parameter_op_Frequencies'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d353b8f9-8d30-4d04-9c43-3641d086d105")
    public void setHwComputingResource_Parameter_op_Frequencies(final String value) {
        this.elt.putTagValue(HwComputingResourceParameter.MdaTypes.HWCOMPUTINGRESOURCE_PARAMETER_OP_FREQUENCIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Parameter_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("757a54f4-9a32-499a-97bb-a2782a5e45c7")
    public void setHwComputingResource_Parameter_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceParameter.MdaTypes.HWCOMPUTINGRESOURCE_PARAMETER_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Parameter_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b8d41dc1-444d-4861-91a0-6e89c4e24a2e")
    public void setHwComputingResource_Parameter_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceParameter.MdaTypes.HWCOMPUTINGRESOURCE_PARAMETER_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Parameter_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f2a74e26-3a9a-4a45-867c-bb8ba1ee461d")
    public void setHwComputingResource_Parameter_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceParameter.MdaTypes.HWCOMPUTINGRESOURCE_PARAMETER_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("6b75143c-1382-4831-9847-3ef4b8cec3cf")
    protected HwComputingResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("259cd032-5152-4c9e-96be-4446b53036d8")
    public static final class MdaTypes {
        @objid ("db128c1a-3067-4a6e-8226-c90ebcb43612")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e6bdb599-a54e-4368-a0b4-9401677a568f")
        public static TagType HWCOMPUTINGRESOURCE_PARAMETER_OP_FREQUENCIES_TAGTYPE_ELT;

        @objid ("b601a613-0a99-45f2-9a53-ad114f4be6b7")
        public static TagType HWCOMPUTINGRESOURCE_PARAMETER_DESCRIPTION_TAGTYPE_ELT;

        @objid ("a2e08582-1c3d-4294-a9ac-39f4642c42b7")
        public static TagType HWCOMPUTINGRESOURCE_PARAMETER_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("e5dae4c5-161f-4d86-9472-b869fbea1970")
        public static TagType HWCOMPUTINGRESOURCE_PARAMETER_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("87df0562-d758-4235-9da2-921b6ddfbfda")
        public static TagType HWCOMPUTINGRESOURCE_PARAMETER_OWNEDHW_TAGTYPE_ELT;

        @objid ("d8978c3d-f2d4-465e-a19e-d7ce28ced0ba")
        public static TagType HWCOMPUTINGRESOURCE_PARAMETER_FREQUENCY_TAGTYPE_ELT;

        @objid ("b0873e4d-7a9f-45d5-a462-bd2305aaddee")
        public static TagType HWCOMPUTINGRESOURCE_PARAMETER_ENDPOINTS_TAGTYPE_ELT;

        @objid ("3da6f59d-ac11-4d44-911b-8501bb6df124")
        private static Stereotype MDAASSOCDEP;

        @objid ("c1b7edc9-fb22-47de-9f79-4e59d1055398")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9a392697-5229-407a-8e76-b06d37d771b2")
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
