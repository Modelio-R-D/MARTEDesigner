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
 * Proxy class to handle a {@link Parameter} with << HwCoolingSupply_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("8afc0cb2-f5f3-4445-a3eb-21c7c3c6896d")
public class HwCoolingSupplyParameter extends HwComponentParameter {
    @objid ("a5ed9363-11d7-4c11-9697-273177897b46")
    public static final String STEREOTYPE_NAME = "HwCoolingSupply_Parameter";

    @objid ("691f5066-5a75-45f9-b208-6ef9c2be634b")
    public static final String HWCOOLINGSUPPLY_PARAMETER_COOLINGPOWER_TAGTYPE = "HwCoolingSupply_Parameter_coolingPower";

    /**
     * Tells whether a {@link HwCoolingSupplyParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwCoolingSupply_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e69a9f97-9cae-4e9c-87df-a7328c5ff10b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCoolingSupplyParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwCoolingSupply_Parameter >> then instantiate a {@link HwCoolingSupplyParameter} proxy.
     * 
     * @return a {@link HwCoolingSupplyParameter} proxy on the created {@link Parameter}.
     */
    @objid ("34941a3c-89af-4476-833f-d910f5262569")
    public static HwCoolingSupplyParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCoolingSupplyParameter.STEREOTYPE_NAME);
        return HwCoolingSupplyParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwCoolingSupplyParameter} proxy from a {@link Parameter} stereotyped << HwCoolingSupply_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwCoolingSupplyParameter} proxy or <i>null</i>.
     */
    @objid ("9b3af65e-df20-4f9b-80ef-b06e8b3f41a9")
    public static HwCoolingSupplyParameter instantiate(final Parameter obj) {
        return HwCoolingSupplyParameter.canInstantiate(obj) ? new HwCoolingSupplyParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwCoolingSupplyParameter} proxy from a {@link Parameter} stereotyped << HwCoolingSupply_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwCoolingSupplyParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("afe146e3-5274-476c-a825-c2acd0fc47ac")
    public static HwCoolingSupplyParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwCoolingSupplyParameter.canInstantiate(obj))
        	return new HwCoolingSupplyParameter(obj);
        else
        	throw new IllegalArgumentException("HwCoolingSupplyParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a4813bbb-1bb4-4634-b379-b204d394ef7f")
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
        HwCoolingSupplyParameter other = (HwCoolingSupplyParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("0bd31317-5ab7-4909-b6dd-28ba2b2d9f80")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'HwCoolingSupply_Parameter_coolingPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("30cf0182-1d4b-4629-bbaf-871ccb888300")
    public String getHwCoolingSupply_Parameter_coolingPower() {
        return this.elt.getTagValue(HwCoolingSupplyParameter.MdaTypes.HWCOOLINGSUPPLY_PARAMETER_COOLINGPOWER_TAGTYPE_ELT);
    }

    @objid ("0c24b146-3d16-4587-9beb-3faa810b0560")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwCoolingSupply_Parameter_coolingPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fcd3a791-4156-4ea0-8ec9-7750753018b1")
    public void setHwCoolingSupply_Parameter_coolingPower(final String value) {
        this.elt.putTagValue(HwCoolingSupplyParameter.MdaTypes.HWCOOLINGSUPPLY_PARAMETER_COOLINGPOWER_TAGTYPE_ELT, value);
    }

    @objid ("c3cd473b-3c32-44c8-b2bc-35b646b07db8")
    protected HwCoolingSupplyParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("60697e1a-6100-4390-acb0-f703a03b4126")
    public static final class MdaTypes {
        @objid ("d3724917-1505-4867-b08e-7681be97e4c7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("96692243-9218-4cee-b734-0d3035d41676")
        public static TagType HWCOOLINGSUPPLY_PARAMETER_COOLINGPOWER_TAGTYPE_ELT;

        @objid ("12b6ecf3-7bfa-4c70-8194-93d3be6a9baf")
        private static Stereotype MDAASSOCDEP;

        @objid ("e05c0009-ac8a-4576-aa05-c284d46ca02d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("368cbd8b-6de7-4acd-8220-095614faee01")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01973ac2-0ccf-11df-8525-001302895b2b");
            HWCOOLINGSUPPLY_PARAMETER_COOLINGPOWER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01973ac9-0ccf-11df-8525-001302895b2b");
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
