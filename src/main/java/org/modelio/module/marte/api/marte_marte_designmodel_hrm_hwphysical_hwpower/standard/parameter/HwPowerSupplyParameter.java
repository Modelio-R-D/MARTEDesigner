/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("d8e0e9f5-9695-43fc-b3b2-4ca783b36a33")
    public static final String STEREOTYPE_NAME = "HwPowerSupply_Parameter";

    @objid ("e76c52bc-368d-49eb-8c89-a6077cd915d4")
    public static final String HWPOWERSUPPLY_PARAMETER_CAPACITY_TAGTYPE = "HwPowerSupply_Parameter_capacity";

    @objid ("e59b18ea-4860-4a3c-817e-f9ed0ed11316")
    public static final String HWPOWERSUPPLY_PARAMETER_SUPPLIEDPOWER_TAGTYPE = "HwPowerSupply_Parameter_suppliedPower";

    /**
     * Tells whether a {@link HwPowerSupplyParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwPowerSupply_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("f1f00e64-7cca-4b27-84fa-4964007744fa")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwPowerSupplyParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwPowerSupply_Parameter >> then instantiate a {@link HwPowerSupplyParameter} proxy.
     * 
     * @return a {@link HwPowerSupplyParameter} proxy on the created {@link Parameter}.
     */
    @objid ("2c99f99e-91e3-4890-94e0-1af5bef3ecf7")
    public static HwPowerSupplyParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwPowerSupplyParameter.STEREOTYPE_NAME);
        return HwPowerSupplyParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwPowerSupplyParameter} proxy from a {@link Parameter} stereotyped << HwPowerSupply_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwPowerSupplyParameter} proxy or <i>null</i>.
     */
    @objid ("2e011e03-0ec9-43d8-9ed6-1c669f33e3dc")
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
    @objid ("c50b8f15-9549-43b5-bd22-02f04d6d7942")
    public static HwPowerSupplyParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwPowerSupplyParameter.canInstantiate(obj))
        	return new HwPowerSupplyParameter(obj);
        else
        	throw new IllegalArgumentException("HwPowerSupplyParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e214beea-79bc-4b44-97cd-42e1d3414ece")
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
    @objid ("ca39ed72-c9f8-4889-9685-8741a48a146d")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'HwPowerSupply_Parameter_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ea679c4b-ea9c-4f32-b377-d25c1c88c73c")
    public String getHwPowerSupply_Parameter_capacity() {
        return this.elt.getTagValue(HwPowerSupplyParameter.MdaTypes.HWPOWERSUPPLY_PARAMETER_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPowerSupply_Parameter_suppliedPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b0fa704b-9eb3-446f-9e15-450e8df2dd94")
    public String getHwPowerSupply_Parameter_suppliedPower() {
        return this.elt.getTagValue(HwPowerSupplyParameter.MdaTypes.HWPOWERSUPPLY_PARAMETER_SUPPLIEDPOWER_TAGTYPE_ELT);
    }

    @objid ("8cf4fe90-8e39-492a-9297-c01e603a74f8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwPowerSupply_Parameter_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3751cec5-2bf8-4348-88bc-b2f2811328b6")
    public void setHwPowerSupply_Parameter_capacity(final String value) {
        this.elt.putTagValue(HwPowerSupplyParameter.MdaTypes.HWPOWERSUPPLY_PARAMETER_CAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPowerSupply_Parameter_suppliedPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cf72cd29-dd00-4a95-8e52-01e886b66a26")
    public void setHwPowerSupply_Parameter_suppliedPower(final String value) {
        this.elt.putTagValue(HwPowerSupplyParameter.MdaTypes.HWPOWERSUPPLY_PARAMETER_SUPPLIEDPOWER_TAGTYPE_ELT, value);
    }

    @objid ("61ad13f6-3652-4c7b-a5e7-334c1eb3853e")
    protected HwPowerSupplyParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("9c408f41-ffdc-452c-a3f2-ae50c965617c")
    public static final class MdaTypes {
        @objid ("3cbd6382-be07-4091-9617-52e10c12d712")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ca59aa9e-63cd-4add-9b86-704666d1d1b4")
        public static TagType HWPOWERSUPPLY_PARAMETER_SUPPLIEDPOWER_TAGTYPE_ELT;

        @objid ("a56e9d15-5f2c-4729-a9b2-98573fc0f6d9")
        public static TagType HWPOWERSUPPLY_PARAMETER_CAPACITY_TAGTYPE_ELT;

        @objid ("bbd5c29c-a809-4e8d-b90a-5c17293f6ca1")
        private static Stereotype MDAASSOCDEP;

        @objid ("a7e33767-5521-4162-a9ff-1e061e98f28e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2f517f4d-f694-455a-93cc-fd1ee692ed3d")
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
