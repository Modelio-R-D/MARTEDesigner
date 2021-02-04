/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
 * Proxy class to handle a {@link Lifeline} with << HwCoolingSupply_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b813b3fe-6f6e-4dc4-b967-1e61564a5f39")
public class HwCoolingSupplyLifeline extends HwComponentLifeLine {
    @objid ("c9bcb46c-5bc3-4cba-b823-b7413f061176")
    public static final String STEREOTYPE_NAME = "HwCoolingSupply_Lifeline";

    @objid ("252f2dbc-ef77-41d8-af5f-7bb84cfa3227")
    public static final String HWCOOLINGSUPPLY_LIFELINE_COOLINGPOWER_TAGTYPE = "HwCoolingSupply_Lifeline_coolingPower";

    /**
     * Tells whether a {@link HwCoolingSupplyLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwCoolingSupply_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("463818b3-1096-4558-aa28-a796bf79698b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCoolingSupplyLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwCoolingSupply_Lifeline >> then instantiate a {@link HwCoolingSupplyLifeline} proxy.
     * 
     * @return a {@link HwCoolingSupplyLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("dab50dd2-ba65-41ee-b414-ba40706e689b")
    public static HwCoolingSupplyLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCoolingSupplyLifeline.STEREOTYPE_NAME);
        return HwCoolingSupplyLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwCoolingSupplyLifeline} proxy from a {@link Lifeline} stereotyped << HwCoolingSupply_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwCoolingSupplyLifeline} proxy or <i>null</i>.
     */
    @objid ("f0da1ca2-96a7-4e2d-a3e1-28ff69cafaf6")
    public static HwCoolingSupplyLifeline instantiate(final Lifeline obj) {
        return HwCoolingSupplyLifeline.canInstantiate(obj) ? new HwCoolingSupplyLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwCoolingSupplyLifeline} proxy from a {@link Lifeline} stereotyped << HwCoolingSupply_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwCoolingSupplyLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("de31e45c-98aa-4840-b4d7-cd70b9c87bc2")
    public static HwCoolingSupplyLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwCoolingSupplyLifeline.canInstantiate(obj))
        	return new HwCoolingSupplyLifeline(obj);
        else
        	throw new IllegalArgumentException("HwCoolingSupplyLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a481eeb2-c77e-4fe8-8642-78c141120d0a")
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
        HwCoolingSupplyLifeline other = (HwCoolingSupplyLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("aff9d44a-762c-49c3-b88b-a3380d8ab6b1")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'HwCoolingSupply_Lifeline_coolingPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("645e32ad-0ceb-4217-8ce9-902324a2aa46")
    public String getHwCoolingSupply_Lifeline_coolingPower() {
        return this.elt.getTagValue(HwCoolingSupplyLifeline.MdaTypes.HWCOOLINGSUPPLY_LIFELINE_COOLINGPOWER_TAGTYPE_ELT);
    }

    @objid ("93bd8d0e-4a72-4720-9845-e4d29cb99e22")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwCoolingSupply_Lifeline_coolingPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ad42384d-bec9-4146-a9a8-00e8e584a688")
    public void setHwCoolingSupply_Lifeline_coolingPower(final String value) {
        this.elt.putTagValue(HwCoolingSupplyLifeline.MdaTypes.HWCOOLINGSUPPLY_LIFELINE_COOLINGPOWER_TAGTYPE_ELT, value);
    }

    @objid ("f1deab0d-e8e7-4ebc-b221-c7ddce81119f")
    protected HwCoolingSupplyLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("16370288-53c8-4990-b14c-1554da9b2aa2")
    public static final class MdaTypes {
        @objid ("31205556-a969-482c-847e-4e8554b58ed3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f1fcbaa5-aa2b-4918-beb4-7d1aea394cfe")
        public static TagType HWCOOLINGSUPPLY_LIFELINE_COOLINGPOWER_TAGTYPE_ELT;

        @objid ("ed0ff4e8-74cc-44ca-948a-30c335affb9d")
        private static Stereotype MDAASSOCDEP;

        @objid ("1e6c404b-3f1c-49b9-b1ec-852570516ab8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c0057242-0a53-4d60-9f50-125c21ee34d1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f30d2627-10bd-11df-81d9-0014222a9f79");
            HWCOOLINGSUPPLY_LIFELINE_COOLINGPOWER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f30d2628-10bd-11df-81d9-0014222a9f79");
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
