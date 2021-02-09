/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.lifeline.HwComponentLifeLine;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << HwPowerSupply_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwPowerSupplyLifeline extends HwComponentLifeLine {
    public static final String STEREOTYPE_NAME = "HwPowerSupply_Lifeline";

    public static final String HWPOWERSUPPLY_LIFELINE_CAPACITY_TAGTYPE = "HwPowerSupply_Lifeline_capacity";

    public static final String HWPOWERSUPPLY_LIFELINE_SUPPLIEDPOWER_TAGTYPE = "HwPowerSupply_Lifeline_suppliedPower";

    /**
     * Tells whether a {@link HwPowerSupplyLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwPowerSupply_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwPowerSupplyLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwPowerSupply_Lifeline >> then instantiate a {@link HwPowerSupplyLifeline} proxy.
     * 
     * @return a {@link HwPowerSupplyLifeline} proxy on the created {@link Lifeline}.
     */
    public static HwPowerSupplyLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwPowerSupplyLifeline.STEREOTYPE_NAME);
        return HwPowerSupplyLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwPowerSupplyLifeline} proxy from a {@link Lifeline} stereotyped << HwPowerSupply_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwPowerSupplyLifeline} proxy or <i>null</i>.
     */
    public static HwPowerSupplyLifeline instantiate(final Lifeline obj) {
        return HwPowerSupplyLifeline.canInstantiate(obj) ? new HwPowerSupplyLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwPowerSupplyLifeline} proxy from a {@link Lifeline} stereotyped << HwPowerSupply_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwPowerSupplyLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwPowerSupplyLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwPowerSupplyLifeline.canInstantiate(obj))
        	return new HwPowerSupplyLifeline(obj);
        else
        	throw new IllegalArgumentException("HwPowerSupplyLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwPowerSupplyLifeline other = (HwPowerSupplyLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'HwPowerSupply_Lifeline_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwPowerSupply_Lifeline_capacity() {
        return this.elt.getTagValue(HwPowerSupplyLifeline.MdaTypes.HWPOWERSUPPLY_LIFELINE_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPowerSupply_Lifeline_suppliedPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwPowerSupply_Lifeline_suppliedPower() {
        return this.elt.getTagValue(HwPowerSupplyLifeline.MdaTypes.HWPOWERSUPPLY_LIFELINE_SUPPLIEDPOWER_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwPowerSupply_Lifeline_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPowerSupply_Lifeline_capacity(final String value) {
        this.elt.putTagValue(HwPowerSupplyLifeline.MdaTypes.HWPOWERSUPPLY_LIFELINE_CAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPowerSupply_Lifeline_suppliedPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPowerSupply_Lifeline_suppliedPower(final String value) {
        this.elt.putTagValue(HwPowerSupplyLifeline.MdaTypes.HWPOWERSUPPLY_LIFELINE_SUPPLIEDPOWER_TAGTYPE_ELT, value);
    }

    protected HwPowerSupplyLifeline(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWPOWERSUPPLY_LIFELINE_SUPPLIEDPOWER_TAGTYPE_ELT;

        public static TagType HWPOWERSUPPLY_LIFELINE_CAPACITY_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "c102c13b-10bd-11df-81d9-0014222a9f79");
            HWPOWERSUPPLY_LIFELINE_SUPPLIEDPOWER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c1052398-10bd-11df-81d9-0014222a9f79");
            HWPOWERSUPPLY_LIFELINE_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c1052397-10bd-11df-81d9-0014222a9f79");
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
