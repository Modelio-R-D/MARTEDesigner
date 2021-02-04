/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.parameter;

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
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.parameter.HwComponentParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << HwPowerSupply_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("9455ae3c-322a-4aa2-87c3-c096f7917dc2")
public class HwPowerSupplyParameter extends HwComponentParameter {
    @objid ("0634531d-29cb-4977-b1ab-fd69e56f5acf")
    public static final String STEREOTYPE_NAME = "HwPowerSupply_Parameter";

    @objid ("758ffb0f-82f3-43df-8333-93fa6d699797")
    public static final String HWPOWERSUPPLY_PARAMETER_CAPACITY_TAGTYPE = "HwPowerSupply_Parameter_capacity";

    @objid ("35652246-8772-4077-a63c-388b53bb81df")
    public static final String HWPOWERSUPPLY_PARAMETER_SUPPLIEDPOWER_TAGTYPE = "HwPowerSupply_Parameter_suppliedPower";

    /**
     * Tells whether a {@link HwPowerSupplyParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwPowerSupply_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6e42fb72-7003-4a27-8904-e1dd9f123447")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwPowerSupplyParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwPowerSupply_Parameter >> then instantiate a {@link HwPowerSupplyParameter} proxy.
     * 
     * @return a {@link HwPowerSupplyParameter} proxy on the created {@link Parameter}.
     */
    @objid ("54dbf0bc-882a-4e78-aad8-1a3116749f65")
    public static HwPowerSupplyParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwPowerSupplyParameter.STEREOTYPE_NAME);
        return HwPowerSupplyParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwPowerSupplyParameter} proxy from a {@link Parameter} stereotyped << HwPowerSupply_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwPowerSupplyParameter} proxy or <i>null</i>.
     */
    @objid ("c2bd3282-4257-4904-9ddb-6f1b81b4422e")
    public static HwPowerSupplyParameter instantiate(final Parameter obj) {
        return HwPowerSupplyParameter.canInstantiate(obj) ? new HwPowerSupplyParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwPowerSupplyParameter} proxy from a {@link Parameter} stereotyped << HwPowerSupply_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwPowerSupplyParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("bd89db69-2fa3-498b-abea-6c729c04a525")
    public static HwPowerSupplyParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwPowerSupplyParameter.canInstantiate(obj))
        	return new HwPowerSupplyParameter(obj);
        else
        	throw new IllegalArgumentException("HwPowerSupplyParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("61564916-5ab1-42a4-a616-f1b82c2f7e7e")
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
        HwPowerSupplyParameter other = (HwPowerSupplyParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("70e93b82-5e60-4b60-bdc1-572f2de75201")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'HwPowerSupply_Parameter_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("034f7be1-d0b7-4c32-823f-76e180e70ce7")
    public String getHwPowerSupply_Parameter_capacity() {
        return this.elt.getTagValue(HwPowerSupplyParameter.MdaTypes.HWPOWERSUPPLY_PARAMETER_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPowerSupply_Parameter_suppliedPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8918614b-b5cb-4f03-82e6-6b97e64febea")
    public String getHwPowerSupply_Parameter_suppliedPower() {
        return this.elt.getTagValue(HwPowerSupplyParameter.MdaTypes.HWPOWERSUPPLY_PARAMETER_SUPPLIEDPOWER_TAGTYPE_ELT);
    }

    @objid ("186fa8b7-b334-46be-9574-17200f2a4a69")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwPowerSupply_Parameter_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5e9063d6-ecb4-43e2-93f7-bbb1e390a1b4")
    public void setHwPowerSupply_Parameter_capacity(final String value) {
        this.elt.putTagValue(HwPowerSupplyParameter.MdaTypes.HWPOWERSUPPLY_PARAMETER_CAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPowerSupply_Parameter_suppliedPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cd4b6bac-0992-4934-b414-0998324fb84a")
    public void setHwPowerSupply_Parameter_suppliedPower(final String value) {
        this.elt.putTagValue(HwPowerSupplyParameter.MdaTypes.HWPOWERSUPPLY_PARAMETER_SUPPLIEDPOWER_TAGTYPE_ELT, value);
    }

    @objid ("c0508391-5f57-4cfe-b101-7a2439ce3067")
    protected HwPowerSupplyParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("9c408f41-ffdc-452c-a3f2-ae50c965617c")
    public static final class MdaTypes {
        @objid ("733d5f36-3376-4d82-97d8-af5c4f018b03")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("80f8fbe5-0ed5-4a2e-8b3d-27b13539fe1a")
        public static TagType HWPOWERSUPPLY_PARAMETER_SUPPLIEDPOWER_TAGTYPE_ELT;

        @objid ("33056bbd-5047-4bc6-8f88-b0f48a50e83f")
        public static TagType HWPOWERSUPPLY_PARAMETER_CAPACITY_TAGTYPE_ELT;

        @objid ("353efd5d-e3eb-4665-b1d2-244626a42383")
        private static Stereotype MDAASSOCDEP;

        @objid ("5b0ece04-2be5-483f-9750-48a745d22681")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e3dd6bf0-57cc-4148-8e14-092b120ff3d8")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0192761e-0ccf-11df-8525-001302895b2b");
            HWPOWERSUPPLY_PARAMETER_SUPPLIEDPOWER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01927625-0ccf-11df-8525-001302895b2b");
            HWPOWERSUPPLY_PARAMETER_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0192762c-0ccf-11df-8525-001302895b2b");
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
