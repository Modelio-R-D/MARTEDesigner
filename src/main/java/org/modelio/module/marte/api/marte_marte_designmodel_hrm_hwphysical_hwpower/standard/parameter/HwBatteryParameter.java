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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << HwBattery_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("38bbc02c-2e2a-4b0d-90b3-b9b9c9604474")
public class HwBatteryParameter extends HwPowerSupplyParameter {
    @objid ("0be36fe9-be00-4c1c-ae66-2a470fff00b6")
    public static final String STEREOTYPE_NAME = "HwBattery_Parameter";

    @objid ("54b10c82-36ff-4f9e-8ac0-b0ed27edae1c")
    public static final String HWBATTERY_PARAMETER_CAPACITY_TAGTYPE = "HwBattery_Parameter_capacity";

    /**
     * Tells whether a {@link HwBatteryParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwBattery_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("12c66349-5efb-4844-abb4-2f889bc50c46")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBatteryParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwBattery_Parameter >> then instantiate a {@link HwBatteryParameter} proxy.
     * 
     * @return a {@link HwBatteryParameter} proxy on the created {@link Parameter}.
     */
    @objid ("0ccc1de4-9b7e-4ff4-91d7-695f1d340dd8")
    public static HwBatteryParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBatteryParameter.STEREOTYPE_NAME);
        return HwBatteryParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwBatteryParameter} proxy from a {@link Parameter} stereotyped << HwBattery_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwBatteryParameter} proxy or <i>null</i>.
     */
    @objid ("5af8a389-9304-4b36-80f2-9e91554a8ecc")
    public static HwBatteryParameter instantiate(final Parameter obj) {
        return HwBatteryParameter.canInstantiate(obj) ? new HwBatteryParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwBatteryParameter} proxy from a {@link Parameter} stereotyped << HwBattery_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwBatteryParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("fd269404-50f8-4640-a0cf-7b2612f0673d")
    public static HwBatteryParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwBatteryParameter.canInstantiate(obj))
        	return new HwBatteryParameter(obj);
        else
        	throw new IllegalArgumentException("HwBatteryParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("38d26d0d-0ee1-4fa5-b573-b331117428e3")
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
        HwBatteryParameter other = (HwBatteryParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("4eca8f8a-0041-4087-9d6d-36304239d37e")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'HwBattery_Parameter_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1936bb03-ccc8-493a-b597-4ff9f73456c2")
    public String getHwBattery_Parameter_capacity() {
        return this.elt.getTagValue(HwBatteryParameter.MdaTypes.HWBATTERY_PARAMETER_CAPACITY_TAGTYPE_ELT);
    }

    @objid ("74ca0290-d69a-42cf-94ab-9d16a844000f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwBattery_Parameter_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("31ac9de1-343e-4d49-b1cd-645a38affb1b")
    public void setHwBattery_Parameter_capacity(final String value) {
        this.elt.putTagValue(HwBatteryParameter.MdaTypes.HWBATTERY_PARAMETER_CAPACITY_TAGTYPE_ELT, value);
    }

    @objid ("25eb708f-8597-4020-bf5f-6deeb0bddf9c")
    protected HwBatteryParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("afd6d3d7-eccc-4142-8630-c95a5c914a33")
    public static final class MdaTypes {
        @objid ("ca01e74f-b200-4461-ab5e-4e77e45564fc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d6e6f135-58f5-4e5a-be93-95feb1a62aa9")
        public static TagType HWBATTERY_PARAMETER_CAPACITY_TAGTYPE_ELT;

        @objid ("b03b6998-664d-4b4b-bdbc-4284593f8602")
        private static Stereotype MDAASSOCDEP;

        @objid ("0ee6ee42-401a-4202-b94f-28076ad7f587")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("47aa7919-e00d-4dbf-9cf4-b5c2587d944d")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "563acf22-c7b2-11df-ad39-001302895b2b");
            HWBATTERY_PARAMETER_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "563d317a-c7b2-11df-ad39-001302895b2b");
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
