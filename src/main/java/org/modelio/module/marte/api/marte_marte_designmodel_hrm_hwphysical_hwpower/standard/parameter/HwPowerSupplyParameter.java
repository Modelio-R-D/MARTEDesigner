/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.parameter;

import java.util.ArrayList;
import java.util.Collections;
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
public class HwPowerSupplyParameter extends HwComponentParameter {
    public static final String STEREOTYPE_NAME = "HwPowerSupply_Parameter";

    public static final String HWPOWERSUPPLY_PARAMETER_CAPACITY_TAGTYPE = "HwPowerSupply_Parameter_capacity";

    public static final String HWPOWERSUPPLY_PARAMETER_SUPPLIEDPOWER_TAGTYPE = "HwPowerSupply_Parameter_suppliedPower";

    /**
     * Tells whether a {@link HwPowerSupplyParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwPowerSupply_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwPowerSupplyParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwPowerSupply_Parameter >> then instantiate a {@link HwPowerSupplyParameter} proxy.
     * 
     * @return a {@link HwPowerSupplyParameter} proxy on the created {@link Parameter}.
     */
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
    public static HwPowerSupplyParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwPowerSupplyParameter.canInstantiate(obj))
        	return new HwPowerSupplyParameter(obj);
        else
        	throw new IllegalArgumentException("HwPowerSupplyParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwPowerSupplyParameter other = (HwPowerSupplyParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'HwPowerSupply_Parameter_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwPowerSupply_Parameter_capacity() {
        return this.elt.getTagValue(HwPowerSupplyParameter.MdaTypes.HWPOWERSUPPLY_PARAMETER_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPowerSupply_Parameter_suppliedPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwPowerSupply_Parameter_suppliedPower() {
        return this.elt.getTagValue(HwPowerSupplyParameter.MdaTypes.HWPOWERSUPPLY_PARAMETER_SUPPLIEDPOWER_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwPowerSupply_Parameter_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPowerSupply_Parameter_capacity(final String value) {
        this.elt.putTagValue(HwPowerSupplyParameter.MdaTypes.HWPOWERSUPPLY_PARAMETER_CAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPowerSupply_Parameter_suppliedPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPowerSupply_Parameter_suppliedPower(final String value) {
        this.elt.putTagValue(HwPowerSupplyParameter.MdaTypes.HWPOWERSUPPLY_PARAMETER_SUPPLIEDPOWER_TAGTYPE_ELT, value);
    }

    protected HwPowerSupplyParameter(final Parameter elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWPOWERSUPPLY_PARAMETER_SUPPLIEDPOWER_TAGTYPE_ELT;

        public static TagType HWPOWERSUPPLY_PARAMETER_CAPACITY_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
