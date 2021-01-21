/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.parameter;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.ResourceParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << HwResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("364102ee-95e0-46ec-8924-a84c19d5d126")
public class HwResourceParameter extends ResourceParameter {
    @objid ("22efdf26-f3ad-4ad8-b6d7-12bba664302e")
    public static final String STEREOTYPE_NAME = "HwResource_Parameter";

    @objid ("6adaab0b-0c09-4671-9933-a178a1fbdb3b")
    public static final String HWRESOURCE_PARAMETER_DESCRIPTION_TAGTYPE = "HwResource_Parameter_description";

    @objid ("f98af6ac-b6bc-4293-abe2-c7f9d8335fd8")
    public static final String HWRESOURCE_PARAMETER_ENDPOINTS_TAGTYPE = "HwResource_Parameter_endPoints";

    @objid ("02b55cd8-19d6-46ba-bbb2-08da35862e41")
    public static final String HWRESOURCE_PARAMETER_FREQUENCY_TAGTYPE = "HwResource_Parameter_frequency";

    @objid ("bce0b755-6a60-448e-8030-a38f1bb67e15")
    public static final String HWRESOURCE_PARAMETER_OWNEDHW_TAGTYPE = "HwResource_Parameter_ownedHW";

    @objid ("4f23bee7-7020-45a7-a70c-3fc2e350ed86")
    public static final String HWRESOURCE_PARAMETER_P_HW_SERVICES_TAGTYPE = "HwResource_Parameter_p_HW_Services";

    @objid ("2c486462-f377-49d5-a026-9fbb703c63ee")
    public static final String HWRESOURCE_PARAMETER_R_HW_SERVICES_TAGTYPE = "HwResource_Parameter_r_HW_Services";

    /**
     * Tells whether a {@link HwResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwResource_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("df1c19ff-87d5-42bc-8aba-61c4a3662626")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwResource_Parameter >> then instantiate a {@link HwResourceParameter} proxy.
     * 
     * @return a {@link HwResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("5e33aa2f-386f-4278-ae98-461ce64eb9ba")
    public static HwResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceParameter.STEREOTYPE_NAME);
        return HwResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwResourceParameter} proxy from a {@link Parameter} stereotyped << HwResource_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwResourceParameter} proxy or <i>null</i>.
     */
    @objid ("a3a3e799-0e60-448b-9126-90c5f1c8435d")
    public static HwResourceParameter instantiate(final Parameter obj) {
        return HwResourceParameter.canInstantiate(obj) ? new HwResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwResourceParameter} proxy from a {@link Parameter} stereotyped << HwResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6f63edf4-c422-48a1-afc7-03b7c51b1c1b")
    public static HwResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwResourceParameter.canInstantiate(obj))
        	return new HwResourceParameter(obj);
        else
        	throw new IllegalArgumentException("HwResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8ceddf95-064f-43eb-8801-184ab9aaca80")
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
        HwResourceParameter other = (HwResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("d0422651-6e52-4666-a266-f61319087bcb")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'HwResource_Parameter_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c388dfb7-c3a9-410c-8363-02eee8951a4a")
    public String getHwResource_Parameter_description() {
        return this.elt.getTagValue(HwResourceParameter.MdaTypes.HWRESOURCE_PARAMETER_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Parameter_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("fdd24ece-4691-4e70-8d47-f3306e12341c")
    public List<String> getHwResource_Parameter_endPoints() {
        return this.elt.getTagValues(HwResourceParameter.MdaTypes.HWRESOURCE_PARAMETER_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwResource_Parameter_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ea2be934-82bb-49cc-ad40-448b009b5b68")
    public String getHwResource_Parameter_frequency() {
        return this.elt.getTagValue(HwResourceParameter.MdaTypes.HWRESOURCE_PARAMETER_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Parameter_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("bc812930-94e0-408a-a2b2-fedf3639288d")
    public List<String> getHwResource_Parameter_ownedHW() {
        return this.elt.getTagValues(HwResourceParameter.MdaTypes.HWRESOURCE_PARAMETER_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Parameter_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("90db3ccf-2e22-4913-98c2-b11ba6d3bb68")
    public List<String> getHwResource_Parameter_p_HW_Services() {
        return this.elt.getTagValues(HwResourceParameter.MdaTypes.HWRESOURCE_PARAMETER_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Parameter_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("801cbc0e-ce0e-4225-ab3c-29cbda648bfe")
    public List<String> getHwResource_Parameter_r_HW_Services() {
        return this.elt.getTagValues(HwResourceParameter.MdaTypes.HWRESOURCE_PARAMETER_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("d89ca2e7-fc9f-4d98-9499-aee0a9baccd0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwResource_Parameter_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("41d02617-3f14-4c2b-898e-8baf73094ec9")
    public void setHwResource_Parameter_description(final String value) {
        this.elt.putTagValue(HwResourceParameter.MdaTypes.HWRESOURCE_PARAMETER_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwResource_Parameter_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e9ad3429-a265-4962-ab1d-71e7c06513ad")
    public void setHwResource_Parameter_endPoints(final List<String> values) {
        this.elt.putTagValues(HwResourceParameter.MdaTypes.HWRESOURCE_PARAMETER_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwResource_Parameter_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fe27fd61-2d05-4f54-aaa7-4ebb58a98a59")
    public void setHwResource_Parameter_frequency(final String value) {
        this.elt.putTagValue(HwResourceParameter.MdaTypes.HWRESOURCE_PARAMETER_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwResource_Parameter_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("351e780b-e883-4b4e-b8e0-9b703e53d2bd")
    public void setHwResource_Parameter_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwResourceParameter.MdaTypes.HWRESOURCE_PARAMETER_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwResource_Parameter_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("39797b20-f669-47b6-afe9-065db0969fd1")
    public void setHwResource_Parameter_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwResourceParameter.MdaTypes.HWRESOURCE_PARAMETER_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwResource_Parameter_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e81f1a80-d542-45ba-81cf-990accccee91")
    public void setHwResource_Parameter_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwResourceParameter.MdaTypes.HWRESOURCE_PARAMETER_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("4afcd0fc-da23-4eca-bfc1-30e73bdc618f")
    protected HwResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("c41646e6-3657-4d87-93b7-f9d785be80d0")
    public static final class MdaTypes {
        @objid ("afce53bc-5fb2-4f8a-97ea-91480ec6677f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fcb9f868-030d-4852-a292-0bc3334ec428")
        public static TagType HWRESOURCE_PARAMETER_DESCRIPTION_TAGTYPE_ELT;

        @objid ("c072838e-642f-4674-997e-bdfb732ebe6f")
        public static TagType HWRESOURCE_PARAMETER_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("d8d29a1d-0afe-4d20-9173-aedbb89a3846")
        public static TagType HWRESOURCE_PARAMETER_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("52282dea-60a7-486c-a6f4-bc79bcbf8dfd")
        public static TagType HWRESOURCE_PARAMETER_OWNEDHW_TAGTYPE_ELT;

        @objid ("3fe2cfdb-f525-4233-a2c6-6290c1f47b2b")
        public static TagType HWRESOURCE_PARAMETER_FREQUENCY_TAGTYPE_ELT;

        @objid ("d6f0d938-c1f9-4cd5-bb0c-25a8d5631175")
        public static TagType HWRESOURCE_PARAMETER_ENDPOINTS_TAGTYPE_ELT;

        @objid ("e8be1e94-6969-488d-9393-62c4eb3f6e03")
        private static Stereotype MDAASSOCDEP;

        @objid ("933ab9a2-cef5-491d-9280-433cb3dd00ad")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0c34b1e9-51d6-41ae-9b67-d68459eedfe1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00d88122-0ccf-11df-8525-001302895b2b");
            HWRESOURCE_PARAMETER_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01999d14-0ccf-11df-8525-001302895b2b");
            HWRESOURCE_PARAMETER_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "019bff6a-0ccf-11df-8525-001302895b2b");
            HWRESOURCE_PARAMETER_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "019bff71-0ccf-11df-8525-001302895b2b");
            HWRESOURCE_PARAMETER_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "019bff78-0ccf-11df-8525-001302895b2b");
            HWRESOURCE_PARAMETER_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5fd32e67-1013-11df-86fe-0014222a9f79");
            HWRESOURCE_PARAMETER_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "2be6f663-1709-11df-b92a-0014222a9f79");
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
