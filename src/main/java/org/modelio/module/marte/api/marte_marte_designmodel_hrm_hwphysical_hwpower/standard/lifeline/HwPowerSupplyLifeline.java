/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("f956385c-5259-4a69-ab59-d576961eedf8")
public class HwPowerSupplyLifeline extends HwComponentLifeLine {
    @objid ("1633bf91-c769-4e57-9062-a9f5906e4a08")
    public static final String STEREOTYPE_NAME = "HwPowerSupply_Lifeline";

    @objid ("8c6d15b3-07b6-48a4-b64d-a084f27244ac")
    public static final String HWPOWERSUPPLY_LIFELINE_CAPACITY_TAGTYPE = "HwPowerSupply_Lifeline_capacity";

    @objid ("36b32066-46ba-4197-9624-5f521cb1c95b")
    public static final String HWPOWERSUPPLY_LIFELINE_SUPPLIEDPOWER_TAGTYPE = "HwPowerSupply_Lifeline_suppliedPower";

    /**
     * Tells whether a {@link HwPowerSupplyLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwPowerSupply_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("42487ce5-7c8f-4bbf-89b6-43225024d99a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwPowerSupplyLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwPowerSupply_Lifeline >> then instantiate a {@link HwPowerSupplyLifeline} proxy.
     * 
     * @return a {@link HwPowerSupplyLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("447deff1-ac0d-4da0-b4c1-66d65e79e9a1")
    public static HwPowerSupplyLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwPowerSupplyLifeline.STEREOTYPE_NAME);
        return HwPowerSupplyLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwPowerSupplyLifeline} proxy from a {@link Lifeline} stereotyped << HwPowerSupply_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwPowerSupplyLifeline} proxy or <i>null</i>.
     */
    @objid ("1ea592b5-79e4-4446-b316-a68b894b990d")
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
    @objid ("ef76737c-a435-4df8-9de2-9b34442c969b")
    public static HwPowerSupplyLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwPowerSupplyLifeline.canInstantiate(obj))
        	return new HwPowerSupplyLifeline(obj);
        else
        	throw new IllegalArgumentException("HwPowerSupplyLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8101d13f-ae3a-49fd-b323-6d1323c4415f")
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
    @objid ("5eddabb2-760e-4d0c-bfc0-68a7d102ac82")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'HwPowerSupply_Lifeline_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c7df7cf1-4436-4086-88ce-a6c4dc3f54f1")
    public String getHwPowerSupply_Lifeline_capacity() {
        return this.elt.getTagValue(HwPowerSupplyLifeline.MdaTypes.HWPOWERSUPPLY_LIFELINE_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPowerSupply_Lifeline_suppliedPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a38d074b-23c7-4ff3-b076-52eac4a1a20b")
    public String getHwPowerSupply_Lifeline_suppliedPower() {
        return this.elt.getTagValue(HwPowerSupplyLifeline.MdaTypes.HWPOWERSUPPLY_LIFELINE_SUPPLIEDPOWER_TAGTYPE_ELT);
    }

    @objid ("580b325f-c436-461d-811b-b1f25c77fdd7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwPowerSupply_Lifeline_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9669a055-c5cc-452d-81a9-cec71b98a22d")
    public void setHwPowerSupply_Lifeline_capacity(final String value) {
        this.elt.putTagValue(HwPowerSupplyLifeline.MdaTypes.HWPOWERSUPPLY_LIFELINE_CAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPowerSupply_Lifeline_suppliedPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("43a36413-ce88-4e57-b678-e5f645e3e703")
    public void setHwPowerSupply_Lifeline_suppliedPower(final String value) {
        this.elt.putTagValue(HwPowerSupplyLifeline.MdaTypes.HWPOWERSUPPLY_LIFELINE_SUPPLIEDPOWER_TAGTYPE_ELT, value);
    }

    @objid ("cc4e0e90-0d95-454e-8b4a-6bc6c32b939c")
    protected HwPowerSupplyLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("1d5a8096-8b86-4481-886a-9747aca18a31")
    public static final class MdaTypes {
        @objid ("9bd5cc3d-cfc3-43e6-8a37-0986955b3eb6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b4042eb1-bb38-4cf2-8657-5a516adee676")
        public static TagType HWPOWERSUPPLY_LIFELINE_SUPPLIEDPOWER_TAGTYPE_ELT;

        @objid ("a08f4328-a7fd-4dbe-a519-c71de06819d4")
        public static TagType HWPOWERSUPPLY_LIFELINE_CAPACITY_TAGTYPE_ELT;

        @objid ("433ad540-9035-49ce-ba51-48d133644b44")
        private static Stereotype MDAASSOCDEP;

        @objid ("5a43b1a8-9102-48c5-a9a3-1fe86e929281")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0e3f4573-4495-4650-9884-1536f8c57c40")
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
